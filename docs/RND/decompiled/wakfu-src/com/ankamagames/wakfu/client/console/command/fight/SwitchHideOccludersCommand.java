/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SwitchHideOccludersCommand
implements aQm {
    protected static final Logger gxF = Logger.getLogger(SwitchHideOccludersCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        cef_1.hideOccluders(null);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

