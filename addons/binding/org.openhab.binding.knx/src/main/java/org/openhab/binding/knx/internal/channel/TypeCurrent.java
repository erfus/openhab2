/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.knx.internal.channel;

import static org.openhab.binding.knx.KNXBindingConstants.*;

import org.eclipse.smarthome.config.core.Configuration;

import com.google.common.collect.Sets;

class TypeCurrent extends KNXChannelType {

    TypeCurrent() {
        super(CHANNEL_CURRENT, Sets.newHashSet(CURRENT_GA));
    }

    @Override
    public String getDPT(Configuration configuration, String addressKey) {
        return (getAddressKeys().contains(addressKey) && super.getDPT(configuration, addressKey) == null) ? "7.012"
                : super.getDPT(configuration, addressKey);
    }
}
