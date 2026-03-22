/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command;

import java.util.ArrayList;
import java.util.Iterator;

public class HelpCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<Object> arrayList3 = new ArrayList<Object>();
        ArrayList<aUf> arrayList4 = aqg_0.cBA().cBG().getChildren();
        for (aUf object2 : arrayList4) {
            if (object2.cUo() > aqg_0.cBA().cBD()) continue;
            if (object2 instanceof aUd) {
                arrayList2.add(object2);
                continue;
            }
            arrayList3.add(object2);
        }
        ArrayList<aUf> arrayList5 = aqg_0.cBA().cBE().getChildren();
        Iterator iterator = arrayList5.iterator();
        while (iterator.hasNext()) {
            aUf aUf3 = (aUf)iterator.next();
            if (aUf3.cUo() > aqg_0.cBA().cBD()) continue;
            if (aUf3 instanceof aUd) {
                arrayList2.add(aUf3);
                continue;
            }
            arrayList3.add(aUf3);
        }
        StringBuilder stringBuilder = new StringBuilder("# Liste des commandes #\n");
        for (aUf aUf4 : arrayList2) {
            stringBuilder.append("[").append(aUf4.getName()).append("] ");
        }
        for (aUf aUf5 : arrayList3) {
            stringBuilder.append(aUf5.getName()).append(" ");
        }
        aqh_0.cBI().jG(stringBuilder.toString());
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

