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
    var id: String,

    /**
     *
     */
    var i18nKey: I18nKey,

    /**
     *
     */
    var accessType: AccessType
) {
    ModbusFirmwareVersion(
        id = "dd40e1c7-b10d-405f-8f12-970b9d53227a",
        i18nKey = I18nKey.CommandModbusFirmwareVersion,
        accessType = AccessType.Read
    ),

    NumberOfRegisters(
        id = "dc2fa557-c373-44ff-93c7-a88f22d733c3",
        i18nKey = I18nKey.CommandNumberOfRegisters,
        accessType = AccessType.Read
    ),

    Manufacturer(
        id = "70057dec-4435-4b53-9c25-d28e6a5cf688",
        i18nKey = I18nKey.CommandManufacturer,
        accessType = AccessType.Read
    ),

    HardwareModel(
        id = "1ac41926-7780-4a27-aff1-284325d163b6",
        i18nKey = I18nKey.CommandHardwareModel,
        accessType = AccessType.Read
    ),

    SerialNumber(
        id = "74133a83-a994-4048-9c8f-a86c37125221",
        i18nKey = I18nKey.CommandSerialNumber,
        accessType = AccessType.Read
    ),

    HardwareFirmwareVersion(
        id = "0a97e033-6046-4d8c-a724-d8db596a13cc",
        i18nKey = I18nKey.CommandHardwareFirmwareVersion,
        accessType = AccessType.Read
    )
}
