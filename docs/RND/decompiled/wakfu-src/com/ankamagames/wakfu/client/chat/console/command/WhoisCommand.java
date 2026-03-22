/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public final class WhoisCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        cyo_0 cyo_02 = new cyo_0();
        cyo_02.dm(string);
        aue_0.cVJ().etu().d(cyo_02);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

