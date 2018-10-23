package myscreepsfamily.extensions

import screeps.api.Game
import screeps.utils.toMap

fun Game.creepSize() = this.creeps.toMap().size