/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PositionCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        acd_1 acd_12 = bgt_02.aZw();
        long l = bgt_02.aqZ();
        aPd.f("command.worldPosition", acd_12.getX(), acd_12.getY(), acd_12.bdi(), l);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

