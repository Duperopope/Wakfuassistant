/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AutoJoinCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean bl = "on".equals(arrayList.get(2));
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljY, bl);
        aPd.f("chat.autojoin.info", bl ? "on" : "off");
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

