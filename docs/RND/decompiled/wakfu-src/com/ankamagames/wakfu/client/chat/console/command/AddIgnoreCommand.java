/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AddIgnoreCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (aPd.czc()) {
            return;
        }
        String string = arrayList.get(2).replaceAll("\"", "");
        apa_0.jn(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

