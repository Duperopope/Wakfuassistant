/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class DisplayStatesCommand
implements aQm {
    private static boolean gvn = false;

    public static boolean cTU() {
        return gvn;
    }

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        gvn = !gvn;
        aqh_0.cBI().jG(gvn ? "Affichage forc\u00e9 des \u00e9tats : ON" : "Affichage forc\u00e9 des \u00e9tats : OFF");
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

