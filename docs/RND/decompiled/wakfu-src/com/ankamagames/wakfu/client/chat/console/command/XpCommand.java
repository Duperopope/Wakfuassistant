/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class XpCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (bgt_02.dnG() == ewo_0.oBF.i(ewr_0.oCk)) {
            aPh.czg().iZ("100%");
            return;
        }
        mj_1 mj_12 = bgt_02.dnH();
        long l = bgt_02.dlF();
        long l2 = mj_12.cT(l);
        long l3 = mj_12.nG(bgt_02.dnG() + 1) - l + l2;
        int n = Math.round((float)l2 / (float)l3 * 100.0f);
        aPh.czg().iZ(n + "%");
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

