/*
 * Decompiled with CFR 0.152.
 */
public class bKP
extends bKK {
    private final double kqP;

    public bKP(boolean bl, long l, double d2, double d3) {
        this(bl, l, d2, d3, false);
    }

    public bKP(boolean bl, long l, double d2, double d3, boolean bl2) {
        super(bl, l, d2, bl2);
        this.kqP = d3;
    }

    @Override
    public double lH(long l) {
        return this.kqk + (double)(l - this.kqj) * this.kqP;
    }

    @Override
    public void a(long l, fce_2 ... fce_2Array) {
    }

    @Override
    public void a(fce_2 ... fce_2Array) {
        long l = (long)((1.0 - this.kqk) / this.kqP);
        for (fce_2 fce_22 : fce_2Array) {
            fce_22.setInitialValue(this.kqi ? 1.0f - (float)this.kqk : (float)this.kqk);
            fce_22.setTweenDuration(l);
            fce_22.setValue(this.kqi ? 0.0f : 1.0f);
        }
    }
}

