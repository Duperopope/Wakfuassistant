/*
 * Decompiled with CFR 0.152.
 */
public class bsO
extends ags_0
implements acv_0 {
    public static final float jjg = 1.5f;
    private static final float[] jjh = new float[]{0.5f, 0.5f, 0.5f};
    private static final axb_2 jji = new awx_2(1.0f, 1.0f, 1.0f);
    private static final axb_2 jjj = new fhl_2(ett_1.oof);
    private static final long jjk = 500L;
    private static final float jjl = 1.4f;
    private final rh_0 jjm;
    private float jjn = 1.0f;
    private final boolean jjo;
    private boolean jjp;

    public bsO(rh_0 rh_02) {
        super(jji, jjj, 500L);
        this.jjm = rh_02;
        bzq_2 bzq_22 = bzp_2.eqt().mA(rh_02.bdL());
        this.jjo = bzq_22 != null && !bzq_22.lEJ;
    }

    public void ez(float f2) {
        this.jjn = 0.5f * f2 + 0.5f;
    }

    @Override
    public int bpb() {
        return 700;
    }

    @Override
    public boolean bpa() {
        return this.jjo;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        boolean bl = this.jjm.R(n, n2);
        if (bl) {
            fArray[0] = jjh[0];
            fArray[1] = jjh[1];
            fArray[2] = jjh[2];
            float f2 = !this.jjp ? 0.9f : 0.5f;
            this.a(fArray, f2, jjh);
            return;
        }
        if (this.jjm.U(n, n2)) {
            if (this.jjn != 1.0f && this.jjm.ab(n, n2)) {
                this.f(fArray, this.jjn);
            }
            return;
        }
        this.f(fArray, jjj.aIX());
    }

    private void f(float[] fArray, float f2) {
        this.a(fArray, f2, this.cuY);
    }

    private void a(float[] fArray, float f2, float[] fArray2) {
        fArray[0] = fArray[0] * (f2 * fArray2[0]);
        fArray[1] = fArray[1] * (f2 * fArray2[1]);
        fArray[2] = fArray[2] * (f2 * fArray2[2]);
    }

    public void gU(boolean bl) {
        this.jjp = bl;
    }
}

