/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aoi
 */
public abstract sealed class aoi_1
extends Enum<aoi_1>
implements aoq_1,
aoy_1
permits aoj_1, aoq_2, aor_2, aos_2, aot_2, aou_2, aov_2, aow_2, aox_2, aok_1, aol_1, aom_2, aon_2, aoo_1, aop_2 {
    public static final /* enum */ aoi_1 cLh = new aoj_1(1, aoi_2.cMF, 1);
    public static final /* enum */ aoi_1 cLi = new aoq_2(2, aoz_2.cLW, 8);
    public static final /* enum */ aoi_1 cLj = new aor_2(3, aob_1.cMg, 4);
    public static final /* enum */ aoi_1 cLk = new aos_2(4, aon_1.cNb, 2);
    public static final /* enum */ aoi_1 cLl = new aot_2(5, aom_1.cMW, 7);
    public static final /* enum */ aoi_1 cLm = new aou_2(6, aol_2.cMT, 5);
    public static final /* enum */ aoi_1 cLn = new aov_2(7, aok_2.cMQ, 6);
    public static final /* enum */ aoi_1 cLo = new aow_2(8, aoj_2.cMJ, 3);
    public static final /* enum */ aoi_1 cLp = new aox_2(9, aoo_2.cNe, 2);
    public static final /* enum */ aoi_1 cLq = new aok_1(10, aoe_2.cMu, 5);
    public static final /* enum */ aoi_1 cLr = new aol_1(11, aoc_1.cMn, 4);
    public static final /* enum */ aoi_1 cLs = new aom_2(12, aod_1.cMs, 4);
    public static final /* enum */ aoi_1 cLt = new aon_2(13, aoa_2.cLY, 4);
    public static final /* enum */ aoi_1 cLu = new aoo_1(14, aoh_2.cMA, 4);
    public static final /* enum */ aoi_1 cLv = new aop_2((short)Short.MAX_VALUE, aof_1.cMy, 0);
    private final short cLw;
    private final aox_1 cLx;
    private final short cLy;
    private static final /* synthetic */ aoi_1[] cLz;

    public static aoi_1[] values() {
        return (aoi_1[])cLz.clone();
    }

    public static aoi_1 valueOf(String string) {
        return Enum.valueOf(aoi_1.class, string);
    }

    aoi_1(short s, aox_1 aox_12, short s2) {
        this.cLw = s;
        this.cLx = aox_12;
        this.cLy = s2;
    }

    public short bEr() {
        return this.cLw;
    }

    abstract aoh_1 bEs();

    public aoh_1 a(int[] nArray, short s) {
        aoh_1 aoh_12 = this.bEs();
        aoh_12.p(nArray);
        aoh_12.aA(s);
        return aoh_12;
    }

    public static aoh_1 a(int n, int[] nArray, short s) {
        for (aoi_1 aoi_12 : aoi_1.values()) {
            if (aoi_12.cLw != n) continue;
            return aoi_12.a(nArray, s);
        }
        return null;
    }

    public static aoh_1 m(ArrayList<aoh_1> arrayList) {
        aoh_1 aoh_12 = null;
        for (aoh_1 aoh_13 : arrayList) {
            if (aoh_12 == null) {
                aoh_12 = aoh_13;
                continue;
            }
            if (aoh_12.bEl().cLy >= aoh_13.bEl().cLy) continue;
            aoh_12 = aoh_13;
        }
        return aoh_12;
    }

    @Override
    public String aXA() {
        return Short.valueOf(this.cLw).toString();
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public aox_1 bEt() {
        return this.cLx;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ aoi_1[] bEu() {
        return new aoi_1[]{cLh, cLi, cLj, cLk, cLl, cLm, cLn, cLo, cLp, cLq, cLr, cLs, cLt, cLu, cLv};
    }

    static {
        cLz = aoi_1.bEu();
    }
}

