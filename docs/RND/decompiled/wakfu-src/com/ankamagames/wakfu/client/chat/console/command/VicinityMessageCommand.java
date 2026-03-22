/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class VicinityMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exq, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        chX chX2 = new chX();
        chX2.op(string);
        aue_0.cVJ().etu().d(chX2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

