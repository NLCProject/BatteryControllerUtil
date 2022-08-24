package org.battery.controller.util.controller.modbusSimulator

import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.I18nKey

/**
 *
 */
enum class ModbusCommand(

    /**
     *
     */
    var i18nKey: I18nKey,

    /**
     *
     */
    var accessType: AccessType
) {
    ModbusFirmwareVersion(i18nKey = I18nKey.CommandModbusFirmwareVersion, accessType = AccessType.Read),
    NumberOfRegisters(i18nKey = I18nKey.CommandNumberOfRegisters, accessType = AccessType.Read),
    Manufacturer(i18nKey = I18nKey.CommandManufacturer, accessType = AccessType.Read),
    HardwareModel(i18nKey = I18nKey.CommandHardwareModel, accessType = AccessType.Read),
    SerialNumber(i18nKey = I18nKey.CommandSerialNumber, accessType = AccessType.Read),
    HardwareFirmwareVersion(i18nKey = I18nKey.CommandHardwareFirmwareVersion, accessType = AccessType.Read)
}
