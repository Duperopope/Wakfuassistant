/*
 * Decompiled with CFR 0.152.
 */
public class abY
extends aca {
    private final int cfv;
    private int bUi;

    public abY(int n) {
        super(1.0f);
        this.cfv = n;
    }

    public abY(int n, float f2) {
        this(n);
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.bUi = (int)GC.a((float)this.cfv, 0.0f, f2);
    }

    @Override
    public boolean rl(int n) {
        this.bUi += n;
        if (this.bUi > this.cfv) {
            return false;
        }
        return super.rl(n);
    }

    @Override
    public float bnY() {
        float f2 = GC.b((float)(this.cfv - this.bUi) / (float)this.cfv, 0.0f, 1.0f);
        return super.bnY() * f2;
    }
}

