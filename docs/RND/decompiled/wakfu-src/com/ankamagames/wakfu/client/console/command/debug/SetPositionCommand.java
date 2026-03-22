/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public final class SetPositionCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() != 5) {
            return;
        }
        aue_0.cVJ().cVK().a(Integer.parseInt(arrayList.get(2)), Integer.parseInt(arrayList.get(3)), Short.parseShort(arrayList.get(4)));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

