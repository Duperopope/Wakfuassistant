/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class FightReportDebugDialogCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (aue_0.cVJ().c(cux_2.eSa())) {
            aue_0.cVJ().b(cux_2.eSa());
        } else {
            cux_2.eSa().eSc();
            aue_0.cVJ().a(cux_2.eSa());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

