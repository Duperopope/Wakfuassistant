/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PartyInvitationCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        bgt_02.dnQ().mz(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

