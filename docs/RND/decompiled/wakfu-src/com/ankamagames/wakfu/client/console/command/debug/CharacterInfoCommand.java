/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class CharacterInfoCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        for (exx_2 exx_22 : exx_2.values()) {
            exf_2 exf_22 = bgt_02.e(exx_22);
            int n = bgt_02.c(exx_22);
            aqh_0.cBI().n(exx_22.name() + " \t" + n + "/" + exf_22.aYD(), 0xAA00FF);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

