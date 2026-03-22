/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RemoveFriendCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        Long l = Long.parseLong("-1");
        if (apd_0.cAO().cAQ().jj(string) != null) {
            l = apd_0.cAO().cAQ().jj(string).Sn();
        } else if (apd_0.cAO().cAQ().jk(string) != null) {
            l = apd_0.cAO().cAQ().jk(string).Sn();
        }
        ni_0 ni_02 = new ni_0();
        ni_02.u(l);
        aue_0.cVJ().etu().d(ni_02);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

