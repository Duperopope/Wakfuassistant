/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aet
 */
public class aet_0
extends aeq_0 {
    public aet_0(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
        assert (this.a(-1, 1, aev_0.cnk) == this.b(-1, 1, aev_0.cnj));
        assert (this.a(-1, 1, aev_0.cnl) == this.b(-1, 1, aev_0.cnk));
    }

    @Override
    public float a(int n, int n2, float f2, aev_0 aev_02) {
        int n3 = n2 - n;
        return (float)n + (float)n3 * f2;
    }

    @Override
    protected float b(int n, int n2, aev_0 aev_02) {
        assert (aev_02 != aev_0.cni && aev_02 != aev_0.cnm);
        switch (aev_02) {
            case cnj: {
                return (float)n2 + 1.0f;
            }
            case cnk: {
                return (float)n2 + 1.0f;
            }
            case cnl: {
                return n2;
            }
        }
        throw new IllegalArgumentException("phase de suat incorrect " + String.valueOf((Object)aev_02));
    }

    @Override
    protected float a(int n, int n2, aev_0 aev_02) {
        assert (aev_02 != aev_0.cni && aev_02 != aev_0.cnm);
        switch (aev_02) {
            case cnj: {
                return n;
            }
            case cnk: {
                return (float)n2 + 1.0f;
            }
            case cnl: {
                return (float)n2 + 1.0f;
            }
        }
        throw new IllegalArgumentException("phase de suat incorrect " + String.valueOf((Object)aev_02));
    }
}

