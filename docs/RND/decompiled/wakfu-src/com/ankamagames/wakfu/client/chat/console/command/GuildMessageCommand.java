/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class GuildMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exw, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null && bgt_02.dpO()) {
            chR chR2 = new chR();
            chR2.op(string);
            chR2.jQ(bgt_02.Ya());
            aue_0.cVJ().etu().d(chR2);
        } else {
            aPd.e("group.error.not_in_guild", new Object[0]);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

