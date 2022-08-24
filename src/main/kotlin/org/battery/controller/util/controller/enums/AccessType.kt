package org.battery.controller.util.controller.enums

/**
 *
 */
enum class AccessType {
    Read,
    Write,
    ReadAndWrite;

    /**
     *
     */
    fun isRead(): Boolean = this == Read

    /**
     *
     */
    fun isWrite(): Boolean = this == Write

    /**
     *
     */
    fun isReadAndWrite(): Boolean = this == ReadAndWrite
}
