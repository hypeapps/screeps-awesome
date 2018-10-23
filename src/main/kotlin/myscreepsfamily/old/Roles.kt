package myscreepsfamily

import myscreepsfamily.old.role
import types.base.global.ERR_NOT_IN_RANGE
import types.base.global.RESOURCE_ENERGY
import types.base.global.STRUCTURE_EXTENSION
import types.base.global.STRUCTURE_SPAWN
import types.base.prototypes.*
import types.base.prototypes.structures.StructureController
import types.base.prototypes.structures.StructureSpawn

enum class Role {
    UNASSIGNED,
    HARVESTER,
    BUILDER,
    UPGRADER
}

//fun Creep.upgrade(controller: StructureController) {
//    if (carry.energy == 0) {
//        val sources = room.findEnergy()
//        if (harvest(sources[0]) == ERR_NOT_IN_RANGE) {
//            moveTo(sources[0].pos)
//        }
//    } else {
//        if (upgradeController(controller) == ERR_NOT_IN_RANGE) {
//            moveTo(controller.pos)
//        }
//    }
//}

//fun Creep.pause() {
//    if (memory.pause < 10) {
//        //blink slowly
//        if (memory.pause % 3 != 0) say("\uD83D\uDEAC")
//        memory.pause++
//    } else {
//        memory.pause = 0
//        memory.role = Role.HARVESTER
//    }
//}
//
//fun Creep.build(assignedRoom: Room = this.room) {
//    if (memory.building && carry.energy == 0) {
//        memory.building = false
//        say("🔄 harvest")
//    }
//    if (!memory.building && carry.energy == carryCapacity) {
//        memory.building = true
//        say("🚧 build")
//    }
//
//    if (memory.building) {
//        val targets = assignedRoom.findConstructionSites()
//        if (targets.isNotEmpty()) {
//            if (build(targets[0]) == ERR_NOT_IN_RANGE) {
//                moveTo(targets[0].pos)
//            }
//        }
//    } else {
//        val sources = room.findEnergy()
//        if (harvest(sources[0]) == ERR_NOT_IN_RANGE) {
//            moveTo(sources[0].pos)
//        }
//    }
//}
//
//fun Creep.harvest(fromRoom: Room = this.room, toRoom: Room = this.room) {
//    if (carry.energy < carryCapacity) {
//        val sources = fromRoom.findEnergy()
//        if (harvest(sources[0]) == ERR_NOT_IN_RANGE) {
//            moveTo(sources[0].pos)
//        }
//    } else {
//        val targets = toRoom.findStructures()
//                .filter { (it.structureType == STRUCTURE_EXTENSION || it.structureType == STRUCTURE_SPAWN) }
//                .map { (it as StructureSpawn) }
//                .filter { it.energy < it.energyCapacity }
//
//        if (targets.isNotEmpty()) {
//            if (transfer(targets[0], RESOURCE_ENERGY) == ERR_NOT_IN_RANGE) {
//                moveTo(targets[0].pos)
//            }
//        }
//    }
//}