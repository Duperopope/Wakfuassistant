/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ShortcutBarCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19433);
        dae_02.ay(Byte.parseByte(arrayList.get(2)));
        aaw_1.bUq().h(dae_02);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

