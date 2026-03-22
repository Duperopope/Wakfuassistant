/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cAS
implements ahr_0,
cBg {
    private final TLongObjectHashMap<cAT> mpK = new TLongObjectHashMap();
    private String mpL = null;

    @Nullable
    private aix_2 b(@NotNull agn_1 agn_12, int n, int n2) {
        if (!(agn_12 instanceof bdj_2)) {
            return null;
        }
        bdj_2 bdj_22 = (bdj_2)agn_12;
        eyp eyp2 = bdj_22.dcP().doV();
        long l = 910L;
        if (eyp2 instanceof eym) {
            l = l * 10000L + (long)(n != -1 ? n : (int)eyp2.aWP());
            l = l * 10L + (long)bdj_22.dcP().aWO();
        } else {
            l = l * 100000L + (long)(n != -1 ? n : (int)eyp2.aWP());
        }
        l = l * 100L + (long)n2;
        cAT cAT2 = (cAT)this.mpK.get(l);
        if (cAT2 == null) {
            return null;
        }
        return cAT2.eHa();
    }

    @Override
    @Nullable
    public aix_2 a(@NotNull agn_1 agn_12, int n) {
        return this.b(agn_12, -1, n);
    }

    @Override
    @Nullable
    public aix_2 a(@NotNull agn_1 agn_12, int n, int n2) {
        return this.b(agn_12, n2, n);
    }

    public void aUI() {
        this.oR(this.mpL);
    }

    public void oR(String string) {
        this.mpL = string;
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        this.mpK.clear();
        aqt_2 aqt_22 = aqs_22.bGT();
        long l = 0L;
        apd_1 apd_12 = aqt_22.fq("prefix");
        if (apd_12 != null) {
            l = apd_12.bCp();
        }
        for (apd_1 apd_13 : aqt_22.fp("bark")) {
            int n = 0;
            apd_1 apd_14 = apd_13.fq("type");
            if (apd_14 != null) {
                n = apd_14.bCo();
            }
            for (apd_1 apd_15 : apd_13.fp("skin")) {
                Object object;
                TIntArrayList tIntArrayList = new TIntArrayList();
                apd_1 apd_16 = apd_15.fq("value");
                if (apd_16 != null) {
                    object = apd_16.bCt();
                    String[] stringArray = ((String)object).split(",");
                    for (String string2 : stringArray) {
                        int n2 = Bw.b((Object)string2.trim(), -1);
                        if (n2 == -1) continue;
                        tIntArrayList.add(n2);
                    }
                }
                object = new cAT();
                for (apd_1 apd_17 : apd_15.fp("sound")) {
                    aix_2 aix_22 = this.n(apd_17);
                    if (aix_22 == null) continue;
                    ((cAT)object).b(aix_22);
                }
                int n3 = tIntArrayList.size();
                for (int i = 0; i < n3; ++i) {
                    long l2 = l;
                    l2 = l2 * 100000L + (long)tIntArrayList.get(i);
                    l2 = l2 * 100L + (long)n;
                    this.mpK.put(l2, object);
                }
            }
        }
        this.mpK.compact();
    }
}

