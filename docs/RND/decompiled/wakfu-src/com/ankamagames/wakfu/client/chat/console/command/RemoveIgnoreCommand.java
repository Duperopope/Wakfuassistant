/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RemoveIgnoreCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        Long l = Long.parseLong("-1");
        if (apd_0.cAO().cAR().jj(string) != null) {
            l = apd_0.cAO().cAR().jj(string).Sn();
        } else if (apd_0.cAO().cAR().jk(string) != null) {
            l = apd_0.cAO().cAR().jk(string).Sn();
        }
        NJ nJ = new NJ();
        nJ.v(l);
        aue_0.cVJ().etu().d(nJ);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

