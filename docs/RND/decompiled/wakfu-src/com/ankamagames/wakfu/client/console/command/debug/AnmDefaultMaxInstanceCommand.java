/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class AnmDefaultMaxInstanceCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        alb_2 alb_22 = alb_2.bBL();
        aqh_0.cBI().jG("Current defaultMaxInstance: " + alb_22.bBM());
        String string = arrayList.get(2);
        if (string != null) {
            alb_22.sK(Integer.parseInt(string));
            aqh_0.cBI().jG("New defaultMaxInstance: " + alb_22.bBM());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

