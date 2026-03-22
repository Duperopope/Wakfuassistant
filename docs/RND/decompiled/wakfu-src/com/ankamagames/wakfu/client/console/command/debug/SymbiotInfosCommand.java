/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SymbiotInfosCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        blx_1 blx_12 = bgt_02.dmN();
        if (blx_12 != null) {
            for (byte by = 0; by < blx_12.fmQ(); by = (byte)(by + 1)) {
                ezw ezw2 = blx_12.Pm(by);
                aqh_0.cBI().n(ezw2.toString() + "\n", 0xAA00FF);
            }
        } else {
            aqh_0.cBI().jF("pas de symbiote");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

