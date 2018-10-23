package myscreepsfamily

import myscreepsfamily.task.Harvester

interface CreepFactory {

    companion object {
        fun createFromRole(role: Role){
            when(role) {
//                Role.HARVESTER -> Harvester()
            }
        }
    }
}