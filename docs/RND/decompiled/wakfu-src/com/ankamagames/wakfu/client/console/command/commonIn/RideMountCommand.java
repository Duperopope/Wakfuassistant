/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class RideMountCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        RideMountCommand.e(bgt_02);
    }

    public static void e(bgt_0 bgt_02) {
        cdO cdO2 = cdO.eug();
        if (!cdO2.au(bgt_02)) {
            return;
        }
        if (bgt_02.bwb()) {
            cml_0 cml_02 = new cml_0();
            aue_0.cVJ().etu().d(cml_02);
        } else if (cdO2.au(bgt_02)) {
            cmk_0 cmk_02 = new cmk_0();
            aue_0.cVJ().etu().d(cmk_02);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

