/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SystemMessageCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = null;
        int n = Integer.MAX_VALUE;
        if (arrayList.size() >= 4) {
            string = arrayList.get(3).trim();
        }
        if (arrayList.size() >= 3) {
            try {
                n = Integer.parseInt(arrayList.get(2));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        dgw.fcT().a(new dgo(dgx.okM, "Message", 500, 2500, "AnimChallenge1"));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

