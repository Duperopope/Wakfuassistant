/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PoliticMessageCommand
implements aQm {
    private static final String eAg = "#";

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPa.evx, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        if (bgt_02.ffF().ems() == fjo_0.sys) {
            aPd.e("error.chat.noNation", new Object[0]);
            return;
        }
        if (bgt_02.ffF().emF() == null) {
            aPd.e("error.chat.noNationRank", new Object[0]);
            return;
        }
        boolean bl = false;
        if (string.startsWith(eAg)) {
            bl = true;
            string = string.replaceFirst(eAg, "");
            aPd.a(aPa.evy, string);
            if (string.isEmpty()) {
                return;
            }
        }
        chT chT2 = new chT();
        chT2.op(string);
        chT2.jg(bl);
        aue_0.cVJ().etu().d(chT2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

