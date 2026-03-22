/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class BattlegroundMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exB, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null && ((fsf)fsf.gkM()).mC(bgt_02.aqZ()).eqw()) {
            chO chO2 = new chO();
            chO2.op(string);
            aue_0.cVJ().etu().d(chO2);
        } else {
            aPd.e("error.chat.playerNotInBattleground", new Object[0]);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

