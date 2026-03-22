/*
 * Decompiled with CFR 0.152.
 */
public class bKO
extends bKK {
    private static final short kqL = 500;
    private long kqM;
    private boolean jtc;
    private final float kqN;
    private final float kqO;

    public bKO(boolean bl, long l, double d2) {
        super(bl, l, d2, false);
        this.kqN = this.kqi ? 1.0f - (float)this.kqk : (float)this.kqk;
        this.kqO = GC.b(this.kqi ? this.kqN * 0.9f : this.kqN * 1.1f, 0.0f, 1.0f);
    }

    @Override
    public void a(fce_2 ... fce_2Array) {
        for (fce_2 fce_22 : fce_2Array) {
            fce_22.setTweenDuration(0L);
            fce_22.setEasing(abn.cdr);
            fce_22.setInitialValue(this.kqN);
        }
        this.kqM = this.kqj - 500L;
        this.jtc = true;
    }

    @Override
    public void a(long l, fce_2 ... fce_2Array) {
        if (this.kqM + 500L <= l) {
            this.kqM += 500L;
            for (fce_2 fce_22 : fce_2Array) {
                fce_22.setTweenDuration(Math.max(0L, this.kqM - l + 500L));
                fce_22.setValue(this.jtc ? this.kqO : this.kqN);
            }
            this.jtc = !this.jtc;
        }
    }

    @Override
    public double lH(long l) {
        return this.kqk;
    }
}

