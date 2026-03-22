/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fpp
 */
public final class fpp_0
extends Enum<fpp_0>
implements ti_0 {
    public static final /* enum */ fpp_0 sNV = new fpp_0(0, 0, -1);
    public static final /* enum */ fpp_0 sNW = new fpp_0(1, 2000, -1);
    public static final /* enum */ fpp_0 sNX = new fpp_0(2, 4000, -1);
    public static final /* enum */ fpp_0 sNY = new fpp_0(3, 6000, -1);
    public static final /* enum */ fpp_0 sNZ = new fpp_0(4, 8000, -1);
    public static final /* enum */ fpp_0 sOa = new fpp_0(5, 10000, -1);
    public static final /* enum */ fpp_0 sOb = new fpp_0(6, 12000, -1);
    public static final /* enum */ fpp_0 sOc = new fpp_0(7, 14000, 42);
    public static final /* enum */ fpp_0 sOd = new fpp_0(8, 16000, 7);
    public static final /* enum */ fpp_0 sOe = new fpp_0(9, 18000, 1);
    private final byte sOf;
    private final int sOg;
    private final int sOh;
    private int sOi;
    private static final fpp_0[] sOj;
    private static final /* synthetic */ fpp_0[] sOk;

    public static fpp_0[] values() {
        return (fpp_0[])sOk.clone();
    }

    public static fpp_0 valueOf(String string) {
        return Enum.valueOf(fpp_0.class, string);
    }

    private fpp_0(int n2, int n3, int n4) {
        this.sOf = GC.ct(n2);
        this.sOg = n3;
        this.sOh = n4;
    }

    public byte aJr() {
        return this.sOf;
    }

    @NotNull
    public static fpp_0 gk(int n, int n2) {
        fpp_0 fpp_02;
        if (fpp_02.sOh <= 0) {
            return fpp_02;
        }
        for (fpp_02 = fpp_0.Yp(n); fpp_02 != null && fpp_02.sOi > 0 && fpp_02.sOi < n2 + 1; fpp_02 = fpp_02.ggm()) {
        }
        return fpp_02 != null ? fpp_02 : sNV;
    }

    @NotNull
    private static fpp_0 Yp(int n) {
        int n2 = 0;
        int n3 = sOj.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            fpp_0 fpp_02 = fpp_0.Yq(n4);
            fpp_0 fpp_03 = fpp_0.Yq(n4 + 1);
            if (fpp_03 != null && fpp_03.sOg <= n) {
                n2 = n4 + 1;
                continue;
            }
            if (fpp_02 != null && fpp_02.sOg > n) {
                n3 = n4 - 1;
                continue;
            }
            return fpp_02 != null ? fpp_02 : sNV;
        }
        return sNV;
    }

    @Nullable
    private static fpp_0 Yq(int n) {
        if (n < 0 || n >= sOj.length) {
            return null;
        }
        return sOj[n];
    }

    @Nullable
    public static fpp_0 hk(byte by) {
        for (fpp_0 fpp_02 : fpp_0.values()) {
            if (by != fpp_02.sOf) continue;
            return fpp_02;
        }
        return null;
    }

    @Override
    public int auH() {
        return this.sOg;
    }

    @Override
    public int bgJ() {
        return this.sOh;
    }

    @Nullable
    private fpp_0 ggm() {
        return fpp_0.Yq(this.ordinal() - 1);
    }

    public boolean c(fpp_0 fpp_02) {
        return this.sOg < fpp_02.sOg;
    }

    public boolean d(fpp_0 fpp_02) {
        return this.sOg > fpp_02.sOg;
    }

    public static void main(String ... stringArray) {
        fpp_0.gl(-1, -1);
        fpp_0.gl(-1, 15);
        fpp_0.gl(15, -1);
        fpp_0.gl(5999, 454);
        fpp_0.gl(6000, 54542);
        fpp_0.gl(6001, 54543);
        fpp_0.gl(15500, 43);
        fpp_0.gl(1550, 43);
        fpp_0.gl(15500, 1);
        fpp_0.gl(22554, 48);
    }

    private static void gl(int n, int n2) {
        System.out.println("Score:" + n + ", Ranking:" + n2 + " => " + String.valueOf(fpp_0.gk(n, n2)));
    }

    private static /* synthetic */ fpp_0[] ggn() {
        return new fpp_0[]{sNV, sNW, sNX, sNY, sNZ, sOa, sOb, sOc, sOd, sOe};
    }

    static {
        sOk = fpp_0.ggn();
        sOj = fpp_0.values();
        int n = 0;
        for (int i = sOj.length - 1; i >= 0; --i) {
            fpp_0 fpp_02 = sOj[i];
            if (fpp_02.sOh < 0) continue;
            fpp_02.sOi = fpp_02.sOh + n;
            n += fpp_02.sOh;
        }
    }
}

