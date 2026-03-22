/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZh
 */
public class bzh_1 {
    final int lCk = 2048;
    final float lCl = 64.0f;
    final float lCm = 100.0f;
    final float lCn = 2000.0f;
    float lCo = 40.0f;
    float lCp = 18.0f;
    final float lCq = 1.5f;
    float lCr = 0.1f;
    final float lCs = -1.5707964f;
    float lCt = 0.07853982f;

    protected bzh_1() {
    }

    protected final void a(abq_0 abq_02) {
        abq_02.rw(2048);
        abq_02.c(1.0f, 1.0f, 1.0f, this.lCr, 0.1f);
        abq_02.aJ(-1.5707964f, this.lCt);
        abq_02.a(64.0f, 100.0f, 2000.0f, this.lCo, this.lCp, 1.5f);
    }

    protected final void a(abn_0 abn_02) {
        abn_02.rw(2048);
        abn_02.aI(64.0f, 100.0f);
    }
}

