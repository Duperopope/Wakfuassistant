/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.iterator.TShortFloatIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortFloatHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.iterator.TShortFloatIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortFloatHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class ftW {
    private static final Logger tgV = Logger.getLogger(ftW.class);
    public static final ftW tgW = new ftW();
    private final TLongObjectHashMap<TShortFloatHashMap> tgX = new TLongObjectHashMap();
    private final HashSet<Integer> tgY = new HashSet();

    public boolean a(short s, float f2, uw_0 uw_02, uw_0 uw_03) {
        return this.a(-1L, s, f2, uw_02, uw_03);
    }

    public boolean a(long l, short s, float f2, uw_0 uw_02, uw_0 uw_03) {
        ftV ftV2 = new ftV(uw_02, f2, s, l);
        ftU ftU2 = new ftU(uw_03, s, l);
        return this.a(l, s, uw_02, uw_03, ftV2, ftU2);
    }

    public boolean a(long l, short s, uw_0 uw_02, uw_0 uw_03, ug_0 ug_02, ug_0 ug_03) {
        if (uw_02 == null || uw_03 == null || ue_0.bjV().d(uw_03) || uw_02.j(uw_03)) {
            return false;
        }
        ArrayList arrayList = (ArrayList)this.aas(s).get(l);
        if (arrayList != null) {
            for (ftT ftT2 : arrayList) {
                if (!ftT2.bjc().j(uw_02) || !ftT2.bjc().h(uw_03)) continue;
                ue_0.bjV().b(ftT2);
            }
        }
        ue_0.bjV().a(ug_02);
        ue_0.bjV().a(ug_03);
        return true;
    }

    void a(long l, short s, float f2) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.tgX.get(l);
        if (tShortFloatHashMap == null) {
            tShortFloatHashMap = new TShortFloatHashMap();
        }
        tShortFloatHashMap.put(s, f2);
        this.tgX.put(l, (Object)tShortFloatHashMap);
    }

    void w(long l, short s) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.tgX.get(l);
        if (tShortFloatHashMap == null) {
            tgV.warn((Object)("Aucune commande de bonus enregistr\u00e9e pour l'instance d'id=" + l));
            return;
        }
        tShortFloatHashMap.remove(s);
        if (tShortFloatHashMap.isEmpty()) {
            this.tgX.remove(l);
        }
    }

    void aap(int n) {
        this.tgY.add(n);
    }

    void aaq(int n) {
        this.tgY.remove(n);
    }

    public boolean a(int n, uw_0 uw_02, uw_0 uw_03, ug_0 ug_02, ug_0 ug_03) {
        if (uw_02 == null || uw_03 == null || ue_0.bjV().d(uw_03) || uw_02.j(uw_03)) {
            return false;
        }
        ArrayList<ftS> arrayList = this.aat(n);
        if (arrayList != null) {
            for (ftS ftS2 : arrayList) {
                if (!ftS2.bjc().j(uw_02) || !ftS2.bjc().h(uw_03)) continue;
                ue_0.bjV().b(ftS2);
            }
        }
        ue_0.bjV().a(ug_02);
        ue_0.bjV().a(ug_03);
        return true;
    }

    public float uS(long l) {
        float f2 = this.x(l, (short)469);
        if (f2 == 1.0f) {
            return this.gmP();
        }
        return f2;
    }

    public float uT(long l) {
        float f2 = this.x(l, (short)119);
        if (f2 == 1.0f) {
            return this.gmQ();
        }
        return f2;
    }

    public float uU(long l) {
        float f2 = this.x(l, (short)320);
        if (f2 == 1.0f) {
            return this.gmR();
        }
        return f2;
    }

    public float uV(long l) {
        float f2 = this.x(l, (short)172);
        if (f2 == 1.0f) {
            return this.gmS();
        }
        return f2;
    }

    public float uW(long l) {
        float f2 = this.x(l, (short)193);
        if (f2 == 1.0f) {
            return this.gmT();
        }
        return f2;
    }

    public float gmP() {
        return this.fM((short)469);
    }

    public float gmQ() {
        return this.fM((short)119);
    }

    public float gmR() {
        return this.fM((short)320);
    }

    public float gmS() {
        return this.fM((short)172);
    }

    public float gmT() {
        return this.fM((short)193);
    }

    public float gmU() {
        return this.fM((short)217);
    }

    public float gmV() {
        return this.fM((short)48);
    }

    public boolean aar(int n) {
        return this.tgY.contains(n);
    }

    public HashSet<Integer> gmW() {
        return this.tgY;
    }

    public float fM(short s) {
        return this.x(-1L, s);
    }

    public float x(long l, short s) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.tgX.get(l);
        if (tShortFloatHashMap == null) {
            return 1.0f;
        }
        float f2 = tShortFloatHashMap.get(s);
        return f2 == 0.0f ? 1.0f : f2;
    }

    public boolean fN(short s) {
        for (long l : this.tgX.keys()) {
            this.w(l, s);
        }
        TLongObjectIterator tLongObjectIterator = this.aas(s).iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (ftT ftT2 : (ArrayList)tLongObjectIterator.value()) {
                ue_0.bjV().b(ftT2);
            }
        }
        return true;
    }

    public boolean y(long l, short s) {
        this.w(l, s);
        ArrayList arrayList = (ArrayList)this.aas(s).get(l);
        if (arrayList != null) {
            for (ftT ftT2 : arrayList) {
                ue_0.bjV().b(ftT2);
            }
        }
        return true;
    }

    public Map<Long, Float> gmX() {
        HashMap<Long, Float> hashMap = new HashMap<Long, Float>();
        this.tgX.forEachEntry((l, tShortFloatHashMap) -> {
            float f2 = tShortFloatHashMap.get((short)320);
            if (f2 != 0.0f && f2 != 1.0f) {
                hashMap.put(l, Float.valueOf(f2));
            }
            return true;
        });
        return hashMap;
    }

    public String gmY() {
        ArrayList<azx_1<Long, Float>> arrayList = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList2 = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList3 = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList4 = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList5 = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList6 = new ArrayList<azx_1<Long, Float>>();
        ArrayList<azx_1<Long, Float>> arrayList7 = new ArrayList<azx_1<Long, Float>>();
        Object object = this.tgX.iterator();
        while (object.hasNext()) {
            object.advance();
            if (object.key() == -1L) continue;
            TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)object.value();
            TShortFloatIterator tShortFloatIterator = tShortFloatHashMap.iterator();
            while (tShortFloatIterator.hasNext()) {
                tShortFloatIterator.advance();
                if (tShortFloatIterator.key() == 469) {
                    arrayList.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 119) {
                    arrayList2.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 320) {
                    arrayList3.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 172) {
                    arrayList4.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 193) {
                    arrayList5.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 217) {
                    arrayList6.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() != 48) continue;
                arrayList7.add(new azx_1<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
            }
        }
        object = new ahv_2();
        this.a(arrayList, (ahv_2)object, "===Bonus factor fight===", this.gmP(), (short)469);
        this.a(arrayList2, (ahv_2)object, "===Bonus factor craft===", this.gmQ(), (short)119);
        this.a(arrayList3, (ahv_2)object, "===Bonus factor prospection===", this.gmR(), (short)320);
        this.a(arrayList4, (ahv_2)object, "===Bonus factor kamas===", this.gmS(), (short)172);
        this.a(arrayList5, (ahv_2)object, "===Bonus loot tries===", this.gmT(), (short)193);
        this.a(arrayList6, (ahv_2)object, "===Bonus guild bonus learning factor===", this.gmU(), (short)217);
        this.a(arrayList7, (ahv_2)object, "===Bonus pvp factor===", this.gmV(), (short)48);
        this.a(Collections.emptyList(), (ahv_2)object, "===Free Heroes===", 0.0f, (short)285);
        return ((ahv_2)object).toString();
    }

    private void a(List<azx_1<Long, Float>> list, ahv_2 ahv_22, String string, float f2, short s) {
        ahv_22.ceC().ih("FFFFFF").ceu().c(string).cev().ceD().c("\n");
        ahv_22.c("G\u00e9n\u00e9ral=").ih("00FF00").ei(f2).ceD().c("\n");
        for (azx_1<Long, Float> tLongObjectIterator2 : list) {
            Long l = tLongObjectIterator2.getFirst();
            ahv_22.c("Instance ").af(l).c("=").ih("00FF00").af(tLongObjectIterator2.aHI()).ceD().c("\n");
        }
        Iterator<azx_1<Long, Float>> iterator = this.aas(s);
        if (!iterator.isEmpty()) {
            ahv_22.ceC().ih("FFFFFF").c("Events pr\u00e9vus :").ceD().c("\n");
        }
        TLongObjectIterator tLongObjectIterator = iterator.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            if (l == -1L) {
                ahv_22.c("G\u00e9n\u00e9ral");
            } else {
                ahv_22.c("Instance ").hY(l);
            }
            ahv_22.c(" :\n");
            ArrayList arrayList = (ArrayList)tLongObjectIterator.value();
            for (ftT ftT2 : arrayList) {
                ahv_22.c(ftT2.toString()).c("\n");
            }
        }
        ahv_22.c("\n");
    }

    public TLongObjectHashMap<ArrayList<ftT>> aas(int n) {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        for (ug_0 ug_02 : ue_0.bjV().bje()) {
            ftT ftT2;
            if (!(ug_02 instanceof ftT) || (ftT2 = (ftT)ug_02).gmO() != n) continue;
            long l = ftT2.aqZ();
            ArrayList<ftT> arrayList = (ArrayList<ftT>)tLongObjectHashMap.get(l);
            if (arrayList == null) {
                arrayList = new ArrayList<ftT>();
                tLongObjectHashMap.put(l, arrayList);
            }
            arrayList.add(ftT2);
        }
        return tLongObjectHashMap;
    }

    public ArrayList<ftS> aat(int n) {
        ArrayList<ftS> arrayList = new ArrayList<ftS>();
        for (ug_0 ug_02 : ue_0.bjV().bje()) {
            ftS ftS2;
            if (!(ug_02 instanceof ftS) || (ftS2 = (ftS)ug_02).gmN() != n) continue;
            arrayList.add(ftS2);
        }
        return arrayList;
    }
}

