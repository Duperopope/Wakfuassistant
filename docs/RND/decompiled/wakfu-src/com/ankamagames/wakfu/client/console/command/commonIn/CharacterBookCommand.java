/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CharacterBookCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        csx_1 csx_12 = csx_1.ePi();
        if (!aue_0.cVJ().c(csx_12)) {
            aue_0.cVJ().a(csx_12);
        } else {
            aue_0.cVJ().b(csx_12);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

