package org.battery.controller.util.controller.register.descriptors.value

import org.battery.controller.util.controller.register.descriptors.Descriptor
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 *
 */
class ValueDescriptor(

    /**
     *
     */
    var value: String
) : Descriptor(type = DescriptorType.Value)
