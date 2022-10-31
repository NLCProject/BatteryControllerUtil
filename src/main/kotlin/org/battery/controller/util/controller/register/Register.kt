package org.battery.controller.util.controller.register

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.DataType
import org.battery.controller.util.controller.enums.I18nKey
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.descriptors.Descriptor

/**
 *
 */
@Serializable
class Register(

    /**
     *
     */
    var index: Int,

    /**
     *
     */
    var i18nKey: I18nKey,

    /**
     *
     */
    var dataType: DataType,

    /**
     *
     */
    var accessType: AccessType,

    /**
     *
     */
    var descriptor: Descriptor,

    /**
     *
     */
    var command: ModbusCommand
)
