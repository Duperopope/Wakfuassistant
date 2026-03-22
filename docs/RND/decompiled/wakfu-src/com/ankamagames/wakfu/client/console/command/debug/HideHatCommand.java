/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class HideHatCommand
implements aQm {
    private static final String[] gvI = new String[]{"CheveuxHaut", "CheveuxBas", "CheveuxArriere", "CheuveuxNatteHaute", "CheveuxNatteBasse", "Oreille", "EliatropeCoiffeBas", "EliatropeCoiffeHaut"};
    private static final String[] gvJ = new String[]{"Chapeau", "Chapeau02"};

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            return;
        }
        boolean bl = Bw.r(arrayList.get(2)) == 1;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bl) {
            for (String string : gvJ) {
                bdj_22.l(string, false);
            }
            for (String string : gvI) {
                bdj_22.bqd().tK(string.hashCode());
            }
        } else {
            for (String string : gvJ) {
                bdj_22.l(string, true);
            }
            for (String string : gvI) {
                bdj_22.bqd().tL(string.hashCode());
            }
        }
        bdj_22.bqd().bHh();
        bdj_22.bpy();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

