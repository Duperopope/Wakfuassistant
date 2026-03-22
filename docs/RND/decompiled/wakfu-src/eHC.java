/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

public final class eHC
extends Enum<eHC> {
    public static final /* enum */ eHC qsn = new eHC(1, 0, 1.0f, new int[0]);
    public static final /* enum */ eHC qso = new eHC(2, 3600, 1.0f, 97862);
    public static final /* enum */ eHC qsp = new eHC(3, 7200, 1.0f, 119163);
    public static final /* enum */ eHC qsq = new eHC(4, 10800, 0.5f, 119172);
    public static final /* enum */ eHC qsr = new eHC(5, 12600, 0.5f, 119173);
    public static final /* enum */ eHC qss = new eHC(6, 14400, 0.5f, 119174);
    public static final /* enum */ eHC qst = new eHC(7, 16200, 0.5f, 119175);
    public static final /* enum */ eHC qsu = new eHC(8, 18000, 0.0f, 119176);
    public static final /* enum */ eHC qsv = new eHC(9, 30000000, 0.0f, new int[0]);
    public static final ua_0 qsw;
    private static final eHC[] qsx;
    private final byte qsy;
    private final ua_0 qsz;
    private float qsA;
    private final int[] qsB;
    private static final uz_0 qsC;
    private static final /* synthetic */ eHC[] qsD;

    public static eHC[] values() {
        return (eHC[])qsD.clone();
    }

    public static eHC valueOf(String string) {
        return Enum.valueOf(eHC.class, string);
    }

    private eHC(int n2, int n3, float f2, int ... nArray) {
        this.qsy = GC.ct(n2);
        this.qsz = uz_0.fo(n3);
        this.qsA = f2;
        this.qsB = (int[])nArray.clone();
    }

    @Nullable
    public static eHC eM(byte by) {
        for (eHC eHC2 : eHC.values()) {
            if (eHC2.qsy != by) continue;
            return eHC2;
        }
        return null;
    }

    public ua_0 fvN() {
        return this.qsz;
    }

    public byte aJr() {
        return this.qsy;
    }

    public int[] cjX() {
        return (int[])this.qsB.clone();
    }

    public static eHC Pw(int n) {
        qsC.f(n, 0, 0, 0);
        for (int i = qsx.length - 1; i >= 0; --i) {
            eHC eHC2 = qsx[i];
            if (!eHC2.qsz.e(qsC)) continue;
            return eHC2;
        }
        return qsn;
    }

    @Nullable
    public static eHC Px(int n) {
        if (n <= 0) {
            return null;
        }
        for (eHC eHC2 : qsx) {
            if (!ArrayUtils.contains((int[])eHC2.qsB, (int)n)) continue;
            return eHC2;
        }
        return null;
    }

    public float fvO() {
        return this.qsA;
    }

    private static /* synthetic */ eHC[] fvP() {
        return new eHC[]{qsn, qso, qsp, qsq, qsr, qss, qst, qsu, qsv};
    }

    static {
        qsD = eHC.fvP();
        qsw = new uz_0(0, 0, 5, 0);
        qsx = eHC.values();
        qsC = new uz_0(0L);
    }
}

