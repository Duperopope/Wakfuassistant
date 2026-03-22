/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class RunScriptCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            return;
        }
        int n = Integer.parseInt(arrayList.get(2));
        afs_1.can().xF(n);
        aqh_0.cBI().jG("Script " + n);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

