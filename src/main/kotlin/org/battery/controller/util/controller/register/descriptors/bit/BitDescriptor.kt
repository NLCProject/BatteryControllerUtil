package org.battery.controller.util.controller.register.descriptors.bit

import org.battery.controller.util.controller.register.descriptors.Descriptor
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 *
 */
class BitDescriptor(

    /**
     *
     */
    var bits: List<Bit>
) : Descriptor(type = DescriptorType.Bits)
