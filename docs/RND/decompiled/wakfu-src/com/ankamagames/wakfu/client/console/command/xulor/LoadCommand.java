/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class LoadCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            aqh_0.cBI().jI("Missing arguments. Expected command format is 'load' [dialogId]");
            return;
        }
        String string = ccj_2.pe(arrayList.get(2));
        if (string == null) {
            aqh_0.cBI().jI("Dialog path not found for " + arrayList.get(2));
            return;
        }
        fyw_0.gqw().a(arrayList.get(2), string, 16L);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

