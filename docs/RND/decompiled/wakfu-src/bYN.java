/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;

public class bYN
implements VQ {
    @Override
    public void a(VV vV) {
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap2 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap3 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap4 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap5 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap6 = new TShortObjectHashMap();
        TIntObjectHashMap<VT> tIntObjectHashMap = vV.blb();
        ArrayList<VS> arrayList = vV.bla();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            VT vT = (VT)tIntObjectIterator.value();
            for (VS vS : arrayList) {
                if (!vT.a(vS)) continue;
                bYN.a(vS, vT, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap2, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap3, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap4, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap6, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap5);
            }
        }
        vV.d((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap6);
        vV.e((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap5);
        vV.h((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap2);
        vV.i((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap);
        vV.f((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap3);
        vV.g((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap4);
    }

    private static void a(VS vS, VT vT, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap2, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap3, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap4, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap5, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap6) {
        short s = vS.aIi();
        switch (vT.bkW()) {
            case bKv: {
                if (vT.bkX()) {
                    if (!tShortObjectHashMap6.containsKey(s)) {
                        tShortObjectHashMap6.put(s, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap6.get(s);
                    arrayList.add(vT.getText());
                    break;
                }
                if (!tShortObjectHashMap5.containsKey(s)) {
                    tShortObjectHashMap5.put(s, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap5.get(s);
                arrayList.add(vT.getText());
                break;
            }
            case bKw: {
                if (vT.bkX()) {
                    if (!tShortObjectHashMap4.containsKey(s)) {
                        tShortObjectHashMap4.put(s, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap4.get(s);
                    arrayList.add(vT.getText());
                    break;
                }
                if (!tShortObjectHashMap3.containsKey(s)) {
                    tShortObjectHashMap3.put(s, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap3.get(s);
                arrayList.add(vT.getText());
                break;
            }
            case bKu: {
                if (vT.bkX()) {
                    if (!tShortObjectHashMap2.containsKey(s)) {
                        tShortObjectHashMap2.put(s, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap2.get(s);
                    arrayList.add(vT.getText());
                    break;
                }
                if (!tShortObjectHashMap.containsKey(s)) {
                    tShortObjectHashMap.put(s, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap.get(s);
                arrayList.add(vT.getText());
            }
        }
    }
}

