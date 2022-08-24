package org.battery.controller.util.controller.register.descriptors.bit

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.enums.AccessType
import org.battery.controller.util.controller.enums.I18nKey

/**
 *
 */
@Serializable
class Bit(

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
    var accessType: AccessType,

    /**
     *
     */
    var value: String
)
