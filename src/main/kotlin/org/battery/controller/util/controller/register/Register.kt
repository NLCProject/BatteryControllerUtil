package org.battery.controller.util.controller.register

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.DataType
import org.battery.controller.util.controller.enums.I18nKey
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.descriptors.Descriptor

/**
 * Modbus Register.
 */
@Serializable
class Register(

    /**
     * Register index.
     */
    var index: Int,

    /**
     * I18n key.
     */
    var i18nKey: I18nKey,

    /**
     * Register data type.
     */
    var dataType: DataType,

    /**
     * Register access type.
     */
    var accessType: AccessType,

    /**
     * Value descriptor.
     */
    var descriptor: Descriptor,

    /**
     * Appropriate Modbus command to access this register.
     */
    var command: ModbusCommand
)
