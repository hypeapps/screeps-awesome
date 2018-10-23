package myscreepsfamily.task

import myscreepsfamily.patterns.Command
import types.base.get
import types.base.global.ERR_NOT_IN_RANGE
import types.base.global.Game
import types.base.global.RESOURCE_ENERGY
import types.base.prototypes.Creep

open class Harvester(private val creep: Creep): Command {

    override fun execute() = with(creep) {
        if (this.canCarryMoreEnergy()) {

        } else if (Game.spawns.get("MainSpawner")!!.energy < Game.spawns.get("MainSpawner")!!.energyCapacity) {
            if(creep.transfer(Game.spawns.get("MainSpawner")!!, RESOURCE_ENERGY) == ERR_NOT_IN_RANGE){
//                creep.moveTo(Game.spawns.get("MainSpawner")!!)
            }
        }
    }

}

fun Creep.harvest(string: String) {

}