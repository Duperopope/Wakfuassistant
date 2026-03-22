/*
 * Decompiled with CFR 0.152.
 */
public class fdf {
    private final int rVm;
    private final int rVn;
    private final int rVo;
    private final int rVp;
    private final boolean rVq;
    private final int rVr;
    final fde_0[] rVs;
    private final int rVt;
    static final /* synthetic */ boolean rVu;

    public fdf(int n, int n2, int n3, int n4, boolean bl, int n5, fde_0[] fde_0Array, int n6) {
        this.rVm = n;
        this.rVn = n2;
        this.rVo = n3;
        this.rVp = n4;
        this.rVq = bl;
        this.rVr = n5;
        this.rVs = fde_0Array;
        this.rVt = n6;
    }

    public int d() {
        return this.rVm;
    }

    public int cnM() {
        return this.rVo;
    }

    public int oP() {
        return this.rVp;
    }

    public boolean cmN() {
        return this.rVq;
    }

    public int cmP() {
        return this.rVr;
    }

    public int clf() {
        return this.rVn;
    }

    public fde_0[] fTg() {
        return this.rVs;
    }

    public fde_0 fTh() {
        if (!rVu && this.rVs.length <= 0) {
            throw new AssertionError();
        }
        float f2 = 0.0f;
        float f3 = GC.b(0.0f, this.fTj());
        int n = this.rVs.length;
        for (int i = 0; i < n; ++i) {
            if (!(f3 <= (f2 += this.rVs[i].cnK()))) continue;
            return this.rVs[i];
        }
        return this.rVs[this.rVs.length - 1];
    }

    public short fTi() {
        return (short)this.fTh().fTe();
    }

    private float fTj() {
        float f2 = 0.0f;
        for (fde_0 fde_02 : this.rVs) {
            f2 += fde_02.cnK();
        }
        return f2;
    }

    public int cnP() {
        return this.rVt;
    }

    public int fTk() {
        return this.rVs.length;
    }

    public boolean fTl() {
        return this.rVn == 0;
    }

    static {
        rVu = !fdc_0.class.desiredAssertionStatus();
    }
}

