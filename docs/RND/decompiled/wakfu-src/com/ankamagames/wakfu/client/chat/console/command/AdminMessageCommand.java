/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AdminMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        boolean bl;
        bgt_0 bgt_02 = bvz_0.dLl();
        boolean bl2 = bl = bgt_02 != null && evm_2.b(bgt_02.dpL().cWq(), evn_2.ovg);
        if (!bl) {
            return;
        }
        aPd.a(aPl.exz, arrayList.get(2));
        String string = aPd.iI(arrayList.get(2));
        if (string == null) {
            return;
        }
        chM chM2 = new chM();
        chM2.op(string);
        aue_0.cVJ().etu().d(chM2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

