/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class ListIgnoresCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aPw aPw2 = apd_0.cAO().cAR();
        if (aPw2 != null) {
            StringBuilder stringBuilder = new StringBuilder(aum_0.cWf().c("chat.ignoreList", new Object[0]));
            stringBuilder.append(" :\n");
            for (apc_0 apc_02 : aPw2) {
                stringBuilder.append(" +").append(apc_02.getName()).append(" (");
                stringBuilder.append(")\n");
            }
            aPh.czg().iZ(stringBuilder.toString());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

