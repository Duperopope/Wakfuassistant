/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class ClearChatCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        apr_0 apr_02 = aPt.cAg().cAl();
        if (apr_02 == null) {
            return;
        }
        apn_0 apn_02 = apr_02.czW();
        if (apn_02 == null) {
            return;
        }
        apn_02.clear();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

