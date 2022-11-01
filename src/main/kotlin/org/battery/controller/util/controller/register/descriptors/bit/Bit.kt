package org.battery.controller.util.controller.register.descriptors.bit

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.I18nKey

/**
 * Bit descriptor.
 */
@Serializable
class Bit(

    /**
     * Bit register index.
     */
    var index: Int,

    /**
     * I18n key.
     */
    var i18nKey: I18nKey,

    /**
     * Bit register access type
     */
    var accessType: AccessType,

    /**
     * Bit value.
     */
    var value: String
)
