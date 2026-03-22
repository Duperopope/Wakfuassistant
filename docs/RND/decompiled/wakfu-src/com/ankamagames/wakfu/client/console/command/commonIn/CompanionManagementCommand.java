/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CompanionManagementCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (aue_0.cVJ().c(ctu_2.nJd)) {
            aue_0.cVJ().b(ctu_2.nJd);
        } else if (fcI.fSM() || fcI.fSN()) {
            aue_0.cVJ().a(ctu_2.nJd);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

