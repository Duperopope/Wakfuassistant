/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class TradeMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exx, arrayList.get(2));
        if (bvz_0.dLm()) {
            aPd.e("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        chW chW2 = new chW();
        chW2.op(string);
        aue_0.cVJ().etu().d(chW2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

