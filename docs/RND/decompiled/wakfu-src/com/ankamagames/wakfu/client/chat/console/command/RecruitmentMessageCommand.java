/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RecruitmentMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (bvz_0.dLm()) {
            aPd.e("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        Mv mv = aPd.a(aPa.evL, arrayList.get(0).trim().split(" ")[0].toLowerCase());
        String string = aPd.d(mv, arrayList.get(2));
        if (string == null) {
            return;
        }
        chV chV2 = new chV();
        chV2.op(string);
        chV2.dd(mv.aJr());
        aue_0.cVJ().etu().d(chV2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

