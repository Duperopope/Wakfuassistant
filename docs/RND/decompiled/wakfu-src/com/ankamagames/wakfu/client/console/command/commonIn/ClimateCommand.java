/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ClimateCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bzq_2 bzq_22 = bzp_2.eqt().mA(aue_0.cVJ().cVK().aqZ());
        if (aue_0.cVJ().c(cyn_1.eYy())) {
            aue_0.cVJ().b(cyn_1.eYy());
        } else if (bTj.eno().doD() != null && bzq_22.lEx) {
            aue_0.cVJ().a(cyn_1.eYy());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

