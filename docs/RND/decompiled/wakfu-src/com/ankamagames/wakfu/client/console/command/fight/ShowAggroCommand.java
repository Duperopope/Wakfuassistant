/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;

public class ShowAggroCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Aggro List \n");
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && bgt_02.dkZ() != null) {
            for (bgy bgy2 : bgt_02.dkZ().dGs()) {
                stringBuilder.append(bgy2.fhu());
            }
        } else {
            stringBuilder.append("pas de combat en cours \n");
        }
        aqh_0.cBI().jG(stringBuilder.toString());
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

