/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinPartCommand
implements aQm {
    private static final Logger gwz = Logger.getLogger(SetSkinPartCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            aqh_0.cBI().jI("pas de localPlayer");
            return;
        }
        if (arrayList.size() != 4) {
            return;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        String string = arrayList.get(3);
        try {
            int n = Integer.parseInt(arrayList.get(2));
            try {
                String[] stringArray = ary_2.fT(arrayList.get(3));
                bdj_22.b(bdf_1.By(n), stringArray);
            }
            catch (Exception exception) {
                gwz.error((Object)"", (Throwable)exception);
            }
        }
        catch (NumberFormatException numberFormatException) {
            bdj_22.b(arrayList.get(2), string);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

