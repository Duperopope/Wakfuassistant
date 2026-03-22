/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.common;

import java.util.ArrayList;

public class CycleWindowCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = ccg_2.eJI().gBu();
        if (string == null) {
            return;
        }
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (fhv_12 instanceof fey_2) {
            ((fey_2)fhv_12).gvm();
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

