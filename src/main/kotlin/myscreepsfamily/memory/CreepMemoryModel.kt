package myscreepsfamily.old

import myscreepsfamily.Role
import types.base.global.CreepMemory
import types.base.prototypes.ConstructionSite

var CreepMemory.role: Role
    get() {
        val roleString: String? = this.asDynamic().role
        return if (roleString != null) Role.valueOf(roleString) else Role.UNASSIGNED
    }
    set(value) {
        this.asDynamic().role = value.name
    }
