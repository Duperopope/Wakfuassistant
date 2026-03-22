/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class HelpCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = " >" + aum_0.cWf().c("chat.help", new Object[0]) + "\n";
        aPh.czg().iZ(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

