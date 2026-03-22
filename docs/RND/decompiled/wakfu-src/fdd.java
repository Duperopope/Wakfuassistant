/*
 * Decompiled with CFR 0.152.
 */
public class fdd {
    private final int rVc;
    private final int rVd;
    private final String rVe;
    private final String[] rVf;
    private final boolean rVg;

    public fdd(int n, int n2, String string, String[] stringArray, boolean bl) {
        this.rVc = n;
        this.rVd = n2;
        this.rVe = string;
        this.rVf = stringArray;
        this.rVg = bl;
    }

    public int avZ() {
        return this.rVc;
    }

    public int cnI() {
        return this.rVd;
    }

    public String clB() {
        return this.rVe;
    }

    public String[] cnJ() {
        return this.rVf;
    }

    public boolean fTc() {
        return this.rVg;
    }

    public fdS fTd() {
        return fdS.Ux(this.cnI());
    }
}

