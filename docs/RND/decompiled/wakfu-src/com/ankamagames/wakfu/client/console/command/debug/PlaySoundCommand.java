/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class PlaySoundCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() != 3) {
            return;
        }
        int n = Bw.m(arrayList.get(2));
        cAY.eHc().a(n, 0.4f, 100, 1500, 3300);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

