/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PrivateMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPd.a(aPl.exr, arrayList.get(2));
        if (arrayList.get(2) == null) {
            return;
        }
        String string = arrayList.get(2).replaceAll("\"", "");
        if (string.contains("<")) {
            aPd.e("error.chat.privateFieldEmpty", new Object[0]);
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null) {
            aPd.Q(arrayList.get(3).trim(), string);
            if (bgt_02.dnF()) {
                aPd.f("info.chat.doNotDisturbActive", new Object[0]);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

