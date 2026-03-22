/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class NinePatchCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        NinePatchCommand.cUw();
    }

    public static void cUw() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 != null && evm_2.c(aUQ2.cWq(), evm_2.osZ)) {
            return;
        }
        if (fyw_0.gqw().to("ninePatchDialog")) {
            fyw_0.gqw().tl("ninePatchDialog");
            fyw_0.gqw().tc("wakfu.ninePatch");
            fse_1.gFu().vX("ninePatch");
        } else {
            ccj_2.g("ninePatchDialog", 32768L);
            fyw_0.gqw().d("wakfu.ninePatch", cff_2.class);
            fse_1.gFu().f("ninePatch", new cbh_2());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

