/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bEr
extends ffb_0<bgv_2, bEq> {
    static final Logger jOm = Logger.getLogger(bEr.class);
    private static final bEr jOn = new bEr();
    private aqd_1<aMZ> hzD = new aqe_1<aMZ>(new aMZ());

    public static bEr dSi() {
        return jOn;
    }

    private bEr() {
    }

    public void a(@NotNull aqd_1<aMZ> aqd_12) {
        this.hzD = aqd_12;
    }

    @Nullable
    public bEq bW(short s) {
        if (s <= 0) {
            return null;
        }
        bEq bEq2 = (bEq)this.sfM.get(s);
        if (bEq2 == null && !this.sfM.contains(s)) {
            aMZ aMZ2 = this.hzD.tE(s);
            if (aMZ2 == null) {
                return null;
            }
            bEq2 = bEr.a(aMZ2);
            this.c(bEq2);
        }
        return bEq2;
    }

    static bEq a(aMZ aMZ2) {
        ArrayList<bgv_2> arrayList = new ArrayList<bgv_2>();
        int[] nArray = aMZ2.cpV();
        int n = nArray == null ? 0 : nArray.length;
        for (int i = 0; i < n; ++i) {
            int n2 = nArray[i];
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n2);
            if (bgv_22 == null) {
                jOm.warn((Object)("item inconnu itemId=" + n2 + " pour la panop " + aMZ2.aIi()));
                continue;
            }
            arrayList.add(bgv_22);
        }
        bEq bEq2 = new bEq(aMZ2.aIi(), aMZ2.cpU(), (List<bgv_2>)arrayList);
        bEr.a(aMZ2, bEq2);
        bEq2.dSd();
        return bEq2;
    }

    public static void a(aMZ aMZ2, ffa_0 ffa_02) {
        HashMap<Integer, int[]> hashMap = aMZ2.cpW();
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry<Integer, int[]> entry : hashMap.entrySet()) {
                for (int n : entry.getValue()) {
                    enk_0 enk_02 = bat_2.cZD().Ay(n);
                    if (enk_02 != null) {
                        Integer n2 = entry.getKey();
                        ffa_02.a(n2, enk_02);
                        continue;
                    }
                    jOm.error((Object)("Probl\u00e8me lors de chargemetn de itemSEt " + ffa_02.aIi()));
                }
            }
        }
    }

    public TIntObjectHashMap<bEq> cZg() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        try {
            aqb_1.bGD().a(new aMZ(), new bes_0(this, tIntObjectHashMap));
        }
        catch (Exception exception) {
            jOm.error((Object)"", (Throwable)exception);
        }
        return tIntObjectHashMap;
    }

    @Override
    @Nullable
    public /* synthetic */ ffa_0 bX(short s) {
        return this.bW(s);
    }
}

