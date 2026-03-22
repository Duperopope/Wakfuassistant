/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsp
 */
public final class fsp_0
extends Enum<fsp_0> {
    public static final /* enum */ fsp_0 tcR = new fsp_0(0, 50.0);
    public static final /* enum */ fsp_0 tcS = new fsp_0(1, 100.0);
    public static final /* enum */ fsp_0 tcT = new fsp_0(2, 150.0);
    public static final /* enum */ fsp_0 tcU = new fsp_0(3, 200.0);
    public static final /* enum */ fsp_0 tcV = new fsp_0(4, 250.0);
    public static final int tcW = 5;
    private final int tcX;
    private final double tcY;
    private static final /* synthetic */ fsp_0[] tcZ;

    public static fsp_0[] values() {
        return (fsp_0[])tcZ.clone();
    }

    public static fsp_0 valueOf(String string) {
        return Enum.valueOf(fsp_0.class, string);
    }

    private fsp_0(int n2, double d2) {
        this.tcX = n2;
        this.tcY = d2;
    }

    public int wp() {
        return this.tcX;
    }

    public double glb() {
        return this.tcY;
    }

    public static fsp_0 ZN(int n) {
        switch (n) {
            case 0: {
                return tcR;
            }
            case 1: {
                return tcS;
            }
            case 2: {
                return tcT;
            }
            case 3: {
                return tcU;
            }
            case 4: {
                return tcV;
            }
        }
        return tcR;
    }

    private static /* synthetic */ fsp_0[] glc() {
        return new fsp_0[]{tcR, tcS, tcT, tcU, tcV};
    }

    static {
        tcZ = fsp_0.glc();
    }
}

