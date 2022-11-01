package org.battery.controller.util.controller.enums

/**
 * I18n translation keys.
 */
enum class I18nKey(

    /**
     * Key title.
     */
    var title: String,

    /**
     * Additional description. Empty if not required.
     */
    var description: String = String()
) {
    CommandModbusFirmwareVersion(title = "Modbus Firmware Version"),
    RegisterModbusFirmwareVersion(title = "Modbus Firmware Version"),
    CommandNumberOfRegisters(title = "Number of Registers"),
    RegisterNumberOfRegisters(title = "Number of Registers"),
    CommandManufacturer(title = "Manufacturer"),
    RegisterManufacturer(title = "Manufacturer"),
    CommandHardwareModel(title = "Hardware Model"),
    RegisterHardwareModel(title = "Hardware Model"),
    CommandSerialNumber(title = "Serial Number"),
    RegisterSerialNumber(title = "Serial Number"),
    CommandHardwareFirmwareVersion(title = "Hardware Firmware Version"),
    RegisterHardwareFirmwareVersion(title = "Hardware Firmware Version"),
}
