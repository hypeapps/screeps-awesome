package myscreepsfamily.task

import myscreepsfamily.Role
import myscreepsfamily.common.orNullIf
import myscreepsfamily.memory.role
import screeps.api.BuildableStructureConstant
import screeps.api.Creep
import screeps.api.FIND_STRUCTURES
import screeps.api.structures.Structure

fun Creep.findStructures(vararg findConstant: BuildableStructureConstant): List<Structure> = room.find<Structure>(FIND_STRUCTURES)
        .filter { findConstant.contains(it.unsafeCast<BuildableStructureConstant>()) }

fun Creep.findStructure(findConstant: BuildableStructureConstant): Structure? = findStructures(findConstant)
        .firstOrNull()

fun Creep.findStructure(findConstant: BuildableStructureConstant, condition: () -> Boolean): Structure? = findStructure(findConstant)
        ?.orNullIf { condition() }

fun Creep.role(): Role = this.memory.role

fun Creep.canCarryMoreEnergy() = (carry.energy < carryCapacity)