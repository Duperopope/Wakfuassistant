/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class UnloadCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String string = arrayList.get(2);
        if (string.equals("all")) {
            fyw_0.gqw().gqP();
            return;
        }
        if (fyw_0.gqw().to(string)) {
            fyw_0.gqw().tl(arrayList.get(2));
        } else {
            aqh_0.cBI().jI(string + " n'est pas charg\u00e9 !");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

