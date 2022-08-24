package org.battery.controller.util.controller.register.descriptors

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 *
 */
@Serializable
abstract class Descriptor(var type: DescriptorType)
