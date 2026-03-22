/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

public class ListCharacterInfoCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aqh_0.cBI().jG("Liste des personnages enregistr\u00e9s : ");
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        bgg_0.dlO().a(new aTT(this, tIntObjectHashMap));
        ArrayList<aTU> arrayList2 = new ArrayList<aTU>();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList3 = (ArrayList)tIntObjectIterator.value();
            arrayList2.addAll(this.x(arrayList3));
        }
        int n = aue_0.cVJ().cVK().eap().getX();
        int n2 = aue_0.cVJ().cVK().eap().getY();
        int n3 = arrayList2.size();
        for (int i = 0; i < n3; ++i) {
            aTU aTU2 = (aTU)arrayList2.get(i);
            int n4 = (int)aco_1.bn(aTU2.getX() - n, aTU2.getY() - n2);
            if (n4 > 200) continue;
            aqh_0.cBI().jG(" Liste pour la famille " + aTU2.cqy() + " (pos : x=" + aTU2.getX() + ", y=" + aTU2.getY() + ")");
            int n5 = 0;
            int n6 = aTU2.cTZ().size();
            for (int j = 0; j < n6; ++j) {
                bgy bgy2 = aTU2.cTZ().get(j);
                aqh_0.cBI().jG("    " + ++n5 + "- " + bgy2.getName());
            }
        }
    }

    private ArrayList<aTU> x(ArrayList<bgy> arrayList) {
        ArrayList<aTU> arrayList2 = new ArrayList<aTU>();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            bgy bgy2 = arrayList.get(i);
            aTU aTU2 = null;
            for (int j = arrayList2.size() - 1; j >= 0; --j) {
                aTU aTU3 = arrayList2.get(j);
                if (!aTU3.o(bgy2)) continue;
                aTU2 = aTU3;
                break;
            }
            if (aTU2 == null) {
                aTU2 = new aTU();
                arrayList2.add(aTU2);
            }
            aTU2.p(bgy2);
        }
        return arrayList2;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

