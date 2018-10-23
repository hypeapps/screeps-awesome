package myscreepsfamily.extensions

import types.base.global.Game
import types.base.toMap

fun Game.creepSize() = this.creeps.toMap().size