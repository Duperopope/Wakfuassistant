/*
 * Decompiled with CFR 0.152.
 */
public class acf
extends ast_2 {
    private static final ack_0 cfJ = new acg_0();
    private static final ack_0 cfK = new ach();
    private static final ack_0 cfL = new aci();
    private static final ack_0 cfM = new acj();
    protected float[] cfN;
    protected int cfO;
    protected afW cfP;

    protected acf() {
        this.ci(this.aQK);
    }

    protected acf(acp_1 acp_12) {
        super(acp_12);
        this.ci(this.aQK);
    }

    protected acf(acp_1 acp_12, float f2) {
        super(acp_12, f2);
        this.ci(this.aQK);
    }

    protected acf(afW afW2, float f2) {
        this.cfP = afW2;
        this.aQK = f2;
        this.ci(this.aQK);
    }

    protected acf(afW afW2) {
        this(afW2, 3.0f);
        this.cHn = true;
        this.ci(this.aQK);
    }

    public afW btr() {
        return this.cfP;
    }

    public void a(afW afW2) {
        if (this.cfP instanceof act_0) {
            ((act_0)((Object)this.cfP)).b(this);
        }
        this.cfP = afW2;
        if (this.cfP instanceof act_0) {
            ((act_0)((Object)this.cfP)).a(this);
        }
    }

    private void ci(float f2) {
        int n = GC.B(f2 + 1.0f);
        if (n == this.cfO) {
            return;
        }
        this.cfO = n;
        this.cfN = new float[this.cfO * this.cfO * 4];
        float f3 = 1.0f / (this.dar[0] + this.dar[1] * this.aQK + this.dar[2] * this.aQK * this.aQK);
        aco_1 aco_12 = new aco_1(0.0f, 0.0f);
        for (int i = 0; i < this.cfO * 2; ++i) {
            for (int j = 0; j < this.cfO * 2; ++j) {
                int n2 = j - this.cfO;
                int n3 = i - this.cfO;
                aco_12.aS(n2, n3);
                float f4 = aco_12.bWV();
                this.cfN[j + i * this.cfO * 2] = f4 == 0.0f ? 1.0f : (f4 > this.aQK ? 0.0f : Math.max(0.0f, 1.0f - f4 * f3));
            }
        }
    }

    @Override
    public final boolean isEnabled() {
        if (this.cfP != null && !this.cfP.isVisible()) {
            return false;
        }
        return super.isEnabled();
    }

    @Override
    public void aT(float f2) {
        if (f2 == this.aQK) {
            return;
        }
        super.aT(f2);
        this.ci(this.aQK);
    }

    private static ack_0 bm(int n, int n2) {
        if (n == 0) {
            if (n2 == 0) {
                return cfJ;
            }
            return cfL;
        }
        if (n2 == 0) {
            return cfK;
        }
        return cfM;
    }

    public void a(acc_0 acc_02, float f2) {
        aci_1 aci_12 = acc_02.bty();
        acp_1 acp_12 = this.bts();
        float f3 = acp_12.aSc();
        float f4 = acp_12.aSd();
        float f5 = acp_12.aSe();
        int n = GC.B(f3);
        int n2 = GC.B(f4);
        int n3 = GC.B(f5);
        int n4 = (int)Math.ceil(this.aQK);
        if (!aci_12.z(n - n4, n + n4, n2 - n4, n2 + n4)) {
            return;
        }
        float f6 = (float)n - f3;
        float f7 = (float)n2 - f4;
        int n5 = (int)Math.signum(f6);
        int n6 = (int)Math.signum(f7);
        ack_0 ack_02 = acf.bm(n5, n6);
        ack_02.d(f6, f7, n5, n6);
        f2 *= this.aPt;
        int n7 = this.cfO * 2;
        for (int i = 0; i < n7; ++i) {
            int n8 = n2 + i - this.cfO;
            for (int j = 0; j < n7; ++j) {
                int n9 = n + j - this.cfO;
                float f8 = this.cfN[j + i * n7];
                float f9 = ack_02.a(j, i, f8, this.cfN, n7);
                if ((f9 *= f2) < 0.004f) continue;
                for (int i2 = 0; i2 < n7; i2 += n7) {
                    int n10 = n3 + i2 - this.cfO;
                    acc_02.a(n9, n8, n10, f9 * this.dap.aIU(), f9 * this.dap.aIV(), f9 * this.dap.aIW(), f9 * this.daq.aIU(), f9 * this.daq.aIV(), f9 * this.daq.aIW());
                }
            }
        }
    }

    @Override
    public acp_1 bts() {
        if (this.cfP != null) {
            return new acp_1(this.cfP.getWorldX(), this.cfP.getWorldY(), this.cfP.getAltitude());
        }
        return super.bts();
    }

    @Override
    public void a(acp_1 acp_12) {
        if (this.cfP != null) {
            throw new RuntimeException("La source est attach\u00e9e \u00e0 une cible, on ne changera pas la position de la cible \u00e0 travers la source.");
        }
        super.a(acp_12);
    }
}

