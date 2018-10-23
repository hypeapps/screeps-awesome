package myscreepsfamily.roles

import myscreepsfamily.patterns.Command
import types.base.global.STRUCTURE_CONTAINER
import types.base.prototypes.Creep
import types.base.prototypes.structures.Structure

open class Harvester(private val creep: Creep): Command {

    override fun execute() = with(creep) {

    }

}

fun Creep.harvest(string: String) {

}