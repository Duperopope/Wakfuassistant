/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.nation;

import java.util.ArrayList;

public final class ShowCitizenScores
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fjn_0 fjn_02 = bgt_02.ffF();
        int[] nArray = fjt.syH.gbS();
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            int n2 = fjn_02.WA(n);
            aqh_0.cBI().jF(n + " score : " + n2);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

