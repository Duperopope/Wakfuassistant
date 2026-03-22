/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class CommandWhereIAm
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        aqh_0.cBI().jG(bgt_02.aZk() + "[" + Integer.toString(bdj_22.bcC()) + "," + Integer.toString(bdj_22.bcD()) + "," + Double.toString(bdj_22.getAltitude()) + "] @" + Long.toString(bgt_02.aqZ()));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

