/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinCommand
implements aQm {
    private static final Logger gwy = Logger.getLogger(SetSkinCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            aqh_0.cBI().jI("pas de localPlayer");
            return;
        }
        if (arrayList.size() != 3) {
            return;
        }
        bgt_02.ddI().lf(arrayList.get(2));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

