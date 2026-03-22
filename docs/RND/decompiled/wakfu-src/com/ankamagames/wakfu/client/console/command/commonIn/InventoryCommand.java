/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class InventoryCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (aue_0.cVJ().c(cvo_2.eUK())) {
            aue_0.cVJ().b(cvo_2.eUK());
        } else {
            cvo_2.eUK().eUN();
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

