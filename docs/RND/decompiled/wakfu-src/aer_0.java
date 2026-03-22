/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aer
 */
public class aer_0
extends aeq_0 {
    public aer_0(float f2, float f3, float f4, float f5) {
        super(f2, f3, f4, f5);
        assert (this.a(-1, 1, aev_0.cnk) == this.b(-1, 1, aev_0.cnj));
        assert (this.a(-1, 1, aev_0.cnl) == this.b(-1, 1, aev_0.cnk));
    }

    @Override
    public float a(int n, int n2, float f2, aev_0 aev_02) {
        int n3 = n - n2;
        return (float)n - (float)n3 * f2;
    }

    @Override
    protected float b(int n, int n2, aev_0 aev_02) {
        assert (aev_02 != aev_0.cni && aev_02 != aev_0.cnm);
        switch (aev_02) {
            case cnj: {
                return (float)n + 0.4f;
            }
            case cnk: {
                return (float)n + 0.4f;
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
                return (float)n + 0.4f;
            }
            case cnl: {
                return (float)n + 0.4f;
            }
        }
        throw new IllegalArgumentException("phase de suat incorrect " + String.valueOf((Object)aev_02));
    }
}

