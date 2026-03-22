/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class ListResourceInfoCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aqh_0.cBI().jG("Liste des ressources enregistr\u00e9s : ");
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        acd_1 acd_12 = aue_0.cVJ().cVK().eap();
        int n = acd_12.getX();
        int n2 = acd_12.getY();
        bLe.ecw().u(new aTV(this, n, n2, tShortObjectHashMap));
        ArrayList arrayList2 = new ArrayList();
        tShortObjectHashMap.forEachValue((TObjectProcedure)new aTW(this, arrayList2));
        int n3 = arrayList2.size();
        for (int i = 0; i < n3; ++i) {
            aTX aTX2 = (aTX)arrayList2.get(i);
            aqh_0.cBI().jG(" Liste pour le type " + aTX2.cUa() + " (pos : x=" + aTX2.getX() + ", y=" + aTX2.getY() + ")");
            int n4 = 0;
            int n5 = aTX2.cUb().size();
            for (int j = 0; j < n5; ++j) {
                bKV bKV2 = aTX2.cUb().get(j);
                aqh_0.cBI().jG("    " + ++n4 + "- " + bKV2.eco().ebZ());
            }
        }
    }

    public ArrayList<aTX> y(ArrayList<bKV> arrayList) {
        ArrayList<aTX> arrayList2 = new ArrayList<aTX>();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            bKV bKV2 = arrayList.get(i);
            aTX aTX2 = null;
            for (int j = arrayList2.size() - 1; j >= 0; --j) {
                aTX aTX3 = arrayList2.get(j);
                if (!aTX3.f(bKV2)) continue;
                aTX2 = aTX3;
                break;
            }
            if (aTX2 == null) {
                aTX2 = new aTX();
                arrayList2.add(aTX2);
            }
            aTX2.g(bKV2);
        }
        return arrayList2;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

