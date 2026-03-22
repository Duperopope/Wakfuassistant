/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetAnimCommand
implements aQm {
    private static final Logger gwv = Logger.getLogger(SetAnimCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null) {
                bgt_02.ddI().dT(arrayList.get(2));
            } else {
                aqh_0.cBI().jI("pas de localPlayer");
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

