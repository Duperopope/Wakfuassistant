/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKl
 */
public final class fkl_2
extends Enum<fkl_2> {
    public static final /* enum */ fkl_2 uFQ = new fkl_2(false, false);
    public static final /* enum */ fkl_2 uFR = new fkl_2(false, true);
    public static final /* enum */ fkl_2 uFS = new fkl_2(true, true);
    public static final /* enum */ fkl_2 uFT = new fkl_2(true, true);
    public static final /* enum */ fkl_2 uFU = new fkl_2(false, true);
    public static final /* enum */ fkl_2 uFV = new fkl_2(true, true);
    public static final /* enum */ fkl_2 uFW = new fkl_2(true, true);
    public static final /* enum */ fkl_2 uFX = new fkl_2(true, false);
    public static final /* enum */ fkl_2 uFY = new fkl_2(true, false);
    private final boolean uFZ;
    private final boolean uGa;
    private static final /* synthetic */ fkl_2[] uGb;

    public static fkl_2[] values() {
        return (fkl_2[])uGb.clone();
    }

    public static fkl_2 valueOf(String string) {
        return Enum.valueOf(fkl_2.class, string);
    }

    private fkl_2(boolean bl, boolean bl2) {
        this.uFZ = bl;
        this.uGa = bl2;
    }

    public boolean isHorizontal() {
        return this.uFZ;
    }

    public boolean isVertical() {
        return this.uGa;
    }

    private static fkl_2 b(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl) {
            if (bl3) {
                return uFS;
            }
            if (bl4) {
                return uFT;
            }
            return uFR;
        }
        if (bl2) {
            if (bl3) {
                return uFV;
            }
            if (bl4) {
                return uFW;
            }
            return uFU;
        }
        if (bl3) {
            return uFX;
        }
        if (bl4) {
            return uFY;
        }
        return uFQ;
    }

    public static fkl_2 a(int n, int n2, int n3, int n4, faw_2 faw_22) {
        return fkl_2.b(fkl_2.as(0, 0, n2), fkl_2.at(faw_22.getHeight(), n2, n4), fkl_2.av(faw_22.getWidth(), n, n3), fkl_2.au(0, 0, n));
    }

    public static fkl_2 a(int n, int n2, fey_2 fey_22, faw_2 faw_22) {
        return fkl_2.b(fkl_2.as(0, 0, n2), fkl_2.at(faw_22.getHeight(), n2, fey_22.getHeight()), fkl_2.av(faw_22.getWidth(), n, fey_22.getWidth()), fkl_2.au(0, 0, n));
    }

    public static fkl_2 a(int n, int n2, fey_2 fey_22, fey_2 fey_23) {
        return fkl_2.e(n, n2, fey_22.getWidth(), fey_22.getHeight(), fey_23.getX(), fey_23.getY(), fey_23.getWidth(), fey_23.getHeight());
    }

    public static fkl_2 e(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return fkl_2.b(fkl_2.as(n6, n8, n2) && fkl_2.S(n, n3, n5, n7), fkl_2.at(n6, n2, n4) && fkl_2.S(n, n3, n5, n7), fkl_2.av(n5, n, n3) && fkl_2.T(n2, n4, n6, n8), fkl_2.au(n5, n7, n) && fkl_2.T(n2, n4, n6, n8));
    }

    public int a(int n, fey_2 fey_22) {
        switch (this.ordinal()) {
            case 3: 
            case 6: 
            case 8: {
                return 0;
            }
            case 2: 
            case 5: 
            case 7: {
                return fey_22.getContainer().getWidth() - fey_22.getWidth();
            }
        }
        return n;
    }

    public int b(int n, fey_2 fey_22) {
        switch (this.ordinal()) {
            case 1: 
            case 2: 
            case 3: {
                return 0;
            }
            case 4: 
            case 5: 
            case 6: {
                return fey_22.getContainer().getHeight() - fey_22.getHeight();
            }
        }
        return n;
    }

    public int a(int n, fey_2 fey_22, fey_2 fey_23) {
        switch (this.ordinal()) {
            case 2: 
            case 5: 
            case 7: {
                return fey_22.getX() - fey_23.getWidth();
            }
            case 3: 
            case 6: 
            case 8: {
                return fey_22.getX() + fey_22.getWidth();
            }
        }
        return n;
    }

    public int b(int n, fey_2 fey_22, fey_2 fey_23) {
        switch (this.ordinal()) {
            case 4: 
            case 5: 
            case 6: {
                return fey_22.getY() - fey_23.getHeight();
            }
            case 1: 
            case 2: 
            case 3: {
                return fey_22.getY() + fey_22.getHeight();
            }
        }
        return n;
    }

    private static boolean as(int n, int n2, int n3) {
        return Math.abs(n + n2 - n3) < 20;
    }

    private static boolean at(int n, int n2, int n3) {
        return Math.abs(n2 + n3 - n) < 20;
    }

    private static boolean au(int n, int n2, int n3) {
        return Math.abs(n + n2 - n3) < 20;
    }

    private static boolean av(int n, int n2, int n3) {
        return Math.abs(n2 + n3 - n) < 20;
    }

    private static boolean S(int n, int n2, int n3, int n4) {
        return n <= n3 && n + n2 > n3 || n3 <= n && n3 + n4 > n;
    }

    private static boolean T(int n, int n2, int n3, int n4) {
        return n <= n3 && n + n2 > n3 || n3 <= n && n3 + n4 > n;
    }

    private static /* synthetic */ fkl_2[] gCZ() {
        return new fkl_2[]{uFQ, uFR, uFS, uFT, uFU, uFV, uFW, uFX, uFY};
    }

    static {
        uGb = fkl_2.gCZ();
    }
}

