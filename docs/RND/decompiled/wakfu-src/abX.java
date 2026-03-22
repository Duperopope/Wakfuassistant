/*
 * Decompiled with CFR 0.152.
 */
public class abX
extends aca {
    private final int cft;
    private int bUi;

    public abX(int n) {
        super(1.0f);
        this.cft = n;
    }

    public abX(int n, float f2) {
        this(n);
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.bUi = (int)GC.a(0.0f, (float)n, f2);
    }

    @Override
    public boolean rl(int n) {
        this.bUi += n;
        return super.rl(n);
    }

    @Override
    public float bnY() {
        float f2 = GC.b((float)this.bUi / (float)this.cft, 0.0f, 1.0f);
        return super.bnY() * f2;
    }
}

