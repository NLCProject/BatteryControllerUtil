package org.battery.controller.util.manufacturers.e3dc

import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.DataType
import org.battery.controller.util.controller.enums.I18nKey
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.DescriptorBuilder
import org.battery.controller.util.controller.register.Register
import org.battery.controller.util.manufacturers.interfaces.IManufacturerDefinition
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 * E3DC manufacturer definition
 */
object E3DCDefinition : IManufacturerDefinition {

    override var manufacturer = Manufacturer.E3DC

    override var registers = listOf(
        Register(
            index = 40002,
            i18nKey = I18nKey.RegisterModbusFirmwareVersion,
            dataType = DataType.UInt8Doubled,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "1.0"),
            command = ModbusCommand.ModbusFirmwareVersion
        ),

        Register(
            index = 40003,
            i18nKey = I18nKey.RegisterNumberOfRegisters,
            dataType = DataType.Uint16,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "6"),
            command = ModbusCommand.NumberOfRegisters
        ),

        Register(
            index = 40004,
            i18nKey = I18nKey.RegisterManufacturer,
            dataType = DataType.String,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "E3DC"),
            command = ModbusCommand.Manufacturer
        ),

        Register(
            index = 40020,
            i18nKey = I18nKey.RegisterHardwareModel,
            dataType = DataType.String,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "S10 E AIO"),
            command = ModbusCommand.HardwareModel
        ),

        Register(
            index = 40036,
            i18nKey = I18nKey.RegisterSerialNumber,
            dataType = DataType.String,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "S10-12345678912"),
            command = ModbusCommand.SerialNumber
        ),

        Register(
            index = 40052,
            i18nKey = I18nKey.RegisterHardwareFirmwareVersion,
            dataType = DataType.String,
            accessType = AccessType.Read,
            descriptor = DescriptorBuilder.buildValue(value = "2.0"),
            command = ModbusCommand.HardwareFirmwareVersion
        )
    )
}
