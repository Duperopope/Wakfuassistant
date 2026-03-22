/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class LoadScriptCommand
implements aQm {
    private static afx_1 gvV = null;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 4) {
            return;
        }
        int n = Integer.parseInt(arrayList.get(2));
        String string = arrayList.get(3);
        if (gvV != null) {
            gvV.cat();
        }
        aqh_0.cBI().jG("Loading script " + n + "...");
        gvV = afs_1.can().a(n, (afr_1[])null, false);
        gvV.hZ(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

