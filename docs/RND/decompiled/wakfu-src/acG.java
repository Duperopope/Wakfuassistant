/*
 * Decompiled with CFR 0.152.
 */
public class acG {
    private static final float cgV = 2.0f;
    public static final int cgW = awx_2.dnQ.aTn();
    private final float cgX;
    private final float cgY;
    private final float cgZ;
    private final float cha;
    private final float chb;
    private final float chc;
    private final float chd;
    private final float che;
    private final float chf;
    public final boolean chg;
    public final boolean chh;
    private final float[] chi = new float[]{0.0f, 0.0f, 0.0f};
    private final float[] chj;

    public acG(int n, int n2, int n3, boolean bl) {
        float[] fArray;
        this.cgX = axb_2.vc(n) * 2.0f;
        this.cgY = axb_2.vb(n) * 2.0f;
        this.cgZ = axb_2.va(n) * 2.0f;
        this.chh = n2 != cgW;
        this.cha = axb_2.vc(n2);
        this.chb = axb_2.vb(n2);
        this.chc = axb_2.va(n2);
        if (n3 == cgW) {
            fArray = null;
        } else {
            float[] fArray2 = new float[3];
            fArray2[0] = 0.0f;
            fArray2[1] = 0.0f;
            fArray = fArray2;
            fArray2[2] = 0.0f;
        }
        this.chj = fArray;
        this.chd = axb_2.vc(n3) - 0.5f;
        this.che = axb_2.vb(n3) - 0.5f;
        this.chf = axb_2.va(n3) - 0.5f;
        this.chg = bl;
    }

    public acG(acG acG2) {
        float[] fArray;
        this.cgX = acG2.cgX;
        this.cgY = acG2.cgY;
        this.cgZ = acG2.cgZ;
        this.cha = acG2.cha;
        this.chb = acG2.chb;
        this.chc = acG2.chc;
        this.chd = acG2.chd;
        this.che = acG2.che;
        this.chf = acG2.chf;
        this.chg = acG2.chg;
        this.chh = acG2.chh;
        if (acG2.chj == null) {
            fArray = null;
        } else {
            float[] fArray2 = new float[3];
            fArray2[0] = 0.0f;
            fArray2[1] = 0.0f;
            fArray = fArray2;
            fArray2[2] = 0.0f;
        }
        this.chj = fArray;
        System.arraycopy(acG2.chi, 0, this.chi, 0, this.chi.length);
    }

    final void btL() {
        this.chi[0] = this.cgX;
        this.chi[1] = this.cgY;
        this.chi[2] = this.cgZ;
        if (this.chj != null) {
            this.chj[2] = 0.0f;
            this.chj[1] = 0.0f;
            this.chj[0] = 0.0f;
        }
    }

    final void ck(float f2) {
        if (f2 <= 0.0f || !this.chh) {
            this.chi[0] = this.cgX;
            this.chi[1] = this.cgY;
            this.chi[2] = this.cgZ;
            return;
        }
        float f3 = this.cgX;
        float f4 = this.cgY;
        float f5 = this.cgZ;
        float f6 = f2 * 2.0f;
        float f7 = -f2 + 1.0f;
        f3 *= this.cha * f6 + f7;
        f4 *= this.chb * f6 + f7;
        f5 *= this.chc * f6 + f7;
        f3 = GC.b(f3, 0.0f, 2.0f);
        f4 = GC.b(f4, 0.0f, 2.0f);
        f5 = GC.b(f5, 0.0f, 2.0f);
        this.chi[0] = f3;
        this.chi[1] = f4;
        this.chi[2] = f5;
    }

    final void cl(float f2) {
        if (this.chj == null) {
            return;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 2.0f;
            this.chj[0] = this.chd * f3;
            this.chj[1] = this.che * f3;
            this.chj[2] = this.chf * f3;
        } else {
            this.chj[2] = 0.0f;
            this.chj[1] = 0.0f;
            this.chj[0] = 0.0f;
        }
    }

    public final float[] btM() {
        return this.chi;
    }

    public final float[] btN() {
        return this.chj;
    }

    public final boolean btO() {
        return this.chj != null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        acG acG2 = (acG)object;
        if (this.chg != acG2.chg) {
            return false;
        }
        if (!GC.e(acG2.cgZ, this.cgZ)) {
            return false;
        }
        if (!GC.e(acG2.cgY, this.cgY)) {
            return false;
        }
        if (!GC.e(acG2.cgX, this.cgX)) {
            return false;
        }
        if (this.chh != acG2.chh) {
            return false;
        }
        if (!GC.e(acG2.chf, this.chf)) {
            return false;
        }
        if (!GC.e(acG2.che, this.che)) {
            return false;
        }
        if (!GC.e(acG2.chd, this.chd)) {
            return false;
        }
        if (!GC.e(acG2.chc, this.chc)) {
            return false;
        }
        if (!GC.e(acG2.chb, this.chb)) {
            return false;
        }
        return GC.e(acG2.cha, this.cha);
    }
}

