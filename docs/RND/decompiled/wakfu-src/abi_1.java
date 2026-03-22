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
 * Renamed from aBI
 */
public final class abi_1
extends Enum<abi_1>
implements aoq_1 {
    public static final /* enum */ abi_1 dzj = new abi_1(0, 1, -1);
    public static final /* enum */ abi_1 dzk = new abi_1(1, 1, 0);
    public static final /* enum */ abi_1 dzl = new abi_1(2, 1, 1);
    public static final /* enum */ abi_1 dzm = new abi_1(3, 0, 1);
    public static final /* enum */ abi_1 dzn = new abi_1(4, -1, 1);
    public static final /* enum */ abi_1 dzo = new abi_1(5, -1, 0);
    public static final /* enum */ abi_1 dzp = new abi_1(6, -1, -1);
    public static final /* enum */ abi_1 dzq = new abi_1(7, 0, -1);
    public static final /* enum */ abi_1 dzr = new abi_1(8, 0, 0);
    public static final /* enum */ abi_1 dzs = new abi_1(9, 0, 0);
    public static final /* enum */ abi_1 dzt = new abi_1(-1, 0, 0);
    private static final abi_1[] dzu;
    private static final abi_1[] dzv;
    private static final abi_1[] dzw;
    public static final abi_1[] dzx;
    public final int dzy;
    public final int dzz;
    public final int dzA;
    private static final /* synthetic */ abi_1[] dzB;

    public static abi_1[] values() {
        return (abi_1[])dzB.clone();
    }

    public static abi_1 valueOf(String string) {
        return Enum.valueOf(abi_1.class, string);
    }

    private abi_1(int n2, int n3, int n4) {
        this.dzy = n2;
        this.dzz = n3;
        this.dzA = n4;
    }

    public int wp() {
        return this.dzy;
    }

    public abi_1 bVN() {
        switch (this.ordinal()) {
            case 0: {
                return dzn;
            }
            case 7: {
                return dzm;
            }
            case 6: {
                return dzl;
            }
            case 5: {
                return dzk;
            }
            case 4: {
                return dzj;
            }
            case 3: {
                return dzq;
            }
            case 2: {
                return dzp;
            }
            case 1: {
                return dzo;
            }
        }
        return dzt;
    }

    public static abi_1 wG(int n) {
        for (int i = 0; i < dzx.length; ++i) {
            abi_1 abi_12 = dzx[i];
            if (abi_12.dzy != n) continue;
            return abi_12;
        }
        return dzt;
    }

    @Nullable
    public static abi_1 cB(int n, int n2) {
        assert (-1 <= n && n <= 1);
        assert (-1 <= n2 && n2 <= 1);
        if (n == 0 && n2 == 0) {
            return null;
        }
        for (int i = 0; i < dzu.length; ++i) {
            abi_1 abi_12 = dzu[i];
            if (abi_12.dzz != n || abi_12.dzA != n2) continue;
            return abi_12;
        }
        return null;
    }

    @NotNull
    public static abi_1 d(acd_1 acd_12, acd_1 acd_13) {
        int n = acd_13.getX() - acd_12.getX();
        int n2 = acd_13.getY() - acd_12.getY();
        if (n > 0 && n >= Math.abs(n2) && n != -n2) {
            return dzk;
        }
        if (n < 0 && -n >= Math.abs(n2) && n != -n2) {
            return dzo;
        }
        if (n2 > 0) {
            return dzm;
        }
        if (n2 < 0) {
            return dzq;
        }
        return dzt;
    }

    public boolean bVO() {
        return this.dzz == 0 || this.dzA == 0;
    }

    public static abi_1[] bVP() {
        return dzu;
    }

    public static abi_1[] bVQ() {
        return dzv;
    }

    public static abi_1[] bVR() {
        return dzw;
    }

    public abi_1 bVS() {
        switch (this.ordinal()) {
            case 0: {
                return dzn;
            }
            case 1: {
                return dzo;
            }
            case 2: {
                return dzp;
            }
            case 3: {
                return dzq;
            }
            case 4: {
                return dzj;
            }
            case 5: {
                return dzk;
            }
            case 6: {
                return dzl;
            }
            case 7: {
                return dzm;
            }
            case 8: {
                return dzs;
            }
            case 9: {
                return dzr;
            }
        }
        return dzt;
    }

    public abi_1 wH(int n) {
        int n2 = this.dzy;
        n2 += n;
        if ((n2 %= dzu.length) < 0) {
            n2 += dzu.length;
        }
        return abi_1.wG(n2);
    }

    public static abi_1 bVT() {
        abi_1[] abi_1Array = dzx;
        return abi_1Array[GC.mR(abi_1Array.length)];
    }

    public static abi_1 bVU() {
        return dzv[GC.mR(dzv.length)];
    }

    public abi_1 wI(int n) {
        int n2 = this.dzy;
        if (n2 % 2 == 0) {
            --n2;
        }
        n2 += 2 * n;
        if ((n2 %= dzu.length) < 0) {
            n2 += dzu.length;
        }
        return abi_1.wG(n2);
    }

    public String toString() {
        return this.name();
    }

    @Override
    @NotNull
    public String aXA() {
        return String.valueOf(this.wp());
    }

    @Override
    @NotNull
    public String aXB() {
        return this.name();
    }

    @Override
    @Nullable
    public String aXC() {
        return null;
    }

    private static /* synthetic */ abi_1[] bVV() {
        return new abi_1[]{dzj, dzk, dzl, dzm, dzn, dzo, dzp, dzq, dzr, dzs, dzt};
    }

    static {
        dzB = abi_1.bVV();
        dzu = new abi_1[]{dzk, dzm, dzo, dzq, dzj, dzn, dzp, dzl};
        dzv = new abi_1[]{dzk, dzm, dzo, dzq};
        dzw = new abi_1[]{dzj, dzn, dzp, dzl};
        dzx = abi_1.values();
    }
}

