/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CloseAllWindowsCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        boolean bl;
        boolean bl2 = bl = !fbj_1.getInstance().isVisible();
        if (bl || fhx_2.gAQ().aJG()) {
            fbj_1.getInstance().setVisible(bl);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

