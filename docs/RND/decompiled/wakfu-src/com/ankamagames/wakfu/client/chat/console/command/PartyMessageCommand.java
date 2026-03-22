/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PartyMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exv, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null && bgt_02.dnQ().dfG()) {
            chS chS2 = new chS();
            chS2.op(string);
            chS2.mU(bgt_02.dnQ().dnR());
            aue_0.cVJ().etu().d(chS2);
        } else {
            aPd.e("group.error.not_in_group", new Object[0]);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

