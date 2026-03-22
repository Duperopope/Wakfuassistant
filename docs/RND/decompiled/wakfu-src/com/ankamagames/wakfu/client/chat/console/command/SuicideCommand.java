/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public final class SuicideCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null || bgt_02.djT()) {
            return;
        }
        if (bgt_02.doP()) {
            return;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqw()) {
            aPd.e("action.error.notInBattleground", new Object[0]);
            return;
        }
        if (bzq_22 != null && exc.oTP.contains(bzq_22.lEo)) {
            aPd.e("error.tutorial.suicide.forbidden", new Object[0]);
            return;
        }
        if (bgt_02.ddI().bvF() != null) {
            bgt_02.ddI().bvA();
        }
        ciQ ciQ2 = new ciQ();
        aue_0.cVJ().etu().d(ciQ2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

