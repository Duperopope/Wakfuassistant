/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import lombok.Generated;

public class CinematicsSelectorCommand
implements aQm {
    protected static cbg_1 gvi;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        CinematicsSelectorCommand.cTS();
    }

    public static void cTS() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 == null || evm_2.c(aUQ2.cWq(), evm_2.osZ)) {
            return;
        }
        if (fyw_0.gqw().to("cinematicsSelectorDialog")) {
            fyw_0.gqw().tl("cinematicsSelectorDialog");
            fyw_0.gqw().tc("wakfu.cinematicsSelector");
            fse_1.gFu().vX("cinematicsInfo");
        } else {
            if (gvi == null) {
                gvi = new cbg_1();
            }
            fse_1.gFu().f("cinematicsInfo", gvi);
            ccj_2.g("cinematicsSelectorDialog", 32768L);
            fyw_0.gqw().d("wakfu.cinematicsSelector", cds_1.class);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }

    @Generated
    public static cbg_1 cTT() {
        return gvi;
    }
}

