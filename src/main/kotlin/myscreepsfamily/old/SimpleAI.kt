package myscreepsfamily.old

import myscreepsfamily.Role
import myscreepsfamily.memory.role
import screeps.api.*
import screeps.api.structures.SpawnOptions
import screeps.api.structures.StructureSpawn
import screeps.utils.toMap
import screeps.utils.unsafe.delete

private val minPopulations = arrayOf(Role.HARVESTER to 2, Role.UPGRADER to 1, Role.BUILDER to 2)

fun gameLoop() {
    val mainSpawn: StructureSpawn = Game.spawns["Spawn1"]!!
    val creeps = Game.creeps.toMap()

    //delete memories of creeps that have passed away
    houseKeeping(creeps)

    //make sure we have at least some creeps
    spawnCreeps(minPopulations, creeps, mainSpawn)

    //spawn a big creep if we have plenty of energy
    for ((_, room) in Game.rooms) {
        if (room.energyAvailable > 549) {
//            mainSpawn.spawnCreep(
//                    arrayOf(
//                            WORK,
//                            WORK,
//                            WORK,
//                            WORK,
//                            CARRY,
//                            MOVE,
//                            MOVE
//                    ),
//                    "HarvesterBig_${Game.time}",
//                    CreepSpawnOptions(Role.HARVESTER)
//            )
        }
    }

//    for ((_, creep) in creeps) {
//        when (creep.memory.role) {
//            Role.HARVESTER -> creep.harvest()
//            Role.BUILDER -> creep.build()
//            Role.UPGRADER -> creep.upgrade(mainSpawn.room.controller!!)
//            else -> creep.pause()
//        }
//    }

}

private fun spawnCreeps(
        minPopulations: Array<Pair<Role, Int>>,
        creeps: Map<String, Creep>,
        spawn: StructureSpawn
) {
    for ((role, min) in minPopulations) {
        val current = creeps.filter { (_, creep) -> creep.memory.role == role }
        if (current.size < min) {
            val newName = "${role.name}_${Game.time}"
            val body = arrayOf<BodyPartConstant>(WORK, CARRY, MOVE)
//            val code = spawn.spawnCreep(body, newName, CreepSpawnOptions(role))

//            when (code) {
//                OK -> console.log("spawning $newName with body $body")
//                ERR_BUSY, ERR_NOT_ENOUGH_ENERGY -> run { } // do nothing
//                else -> console.log("unhandled error code $code")
//            }

        }
    }
}

private fun houseKeeping(creeps: Map<String, Creep>) {
    for ((creepName, _) in Memory.creeps) {
        if (creeps[creepName] == null) {
            console.log("deleting obselete memory entry for creep $creepName")
            delete(Memory.asDynamic().creeps[creepName])
        }
    }
}
