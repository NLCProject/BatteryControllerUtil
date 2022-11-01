package org.battery.controller.util.controller.enums

/**
 * Register access type.
 */
enum class AccessType {
    Read,
    Write,
    ReadAndWrite;

    /**
     * Register can be read.
     *
     * @return Register can be read.
     */
    fun isRead(): Boolean = this == Read

    /**
     * Register can be written.
     *
     * @return Register can be written.
     */
    fun isWrite(): Boolean = this == Write

    /**
     * Register can be written and read.
     *
     * @return Register can be written and read.
     */
    fun isReadAndWrite(): Boolean = this == ReadAndWrite
}
