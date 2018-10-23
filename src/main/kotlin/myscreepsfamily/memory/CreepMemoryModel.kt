package myscreepsfamily.memory

import myscreepsfamily.Role
import screeps.api.CreepMemory

var CreepMemory.role: Role
    get() {
        val roleString: String? = this.asDynamic().role
        return if (roleString != null) Role.valueOf(roleString) else Role.UNASSIGNED
    }
    set(value) {
        this.asDynamic().role = value.name
    }
