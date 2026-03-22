/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class DialogInfosCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            fes_2 fes_22 = (fes_2)fyw_0.gqw().th(arrayList.get(2));
            if (fes_22 != null) {
                aqh_0.cBI().jG(fes_22.toString());
            } else {
                aqh_0.cBI().jI("La dialog " + arrayList.get(2) + " n'existe pas.");
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

