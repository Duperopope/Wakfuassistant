/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aeq
 */
public abstract class aeq_0 {
    protected static final float cnb = 1.0f;
    protected static Logger oO = Logger.getLogger(aeq_0.class);
    final float[] cnc;

    public aeq_0(float f2, float f3, float f4, float f5) {
        this.cnc = new float[]{f2, f3, f4, f5};
    }

    public aev_0 cr(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        if (f2 < this.cnc[0]) {
            return aev_0.cni;
        }
        if (f2 < this.cnc[1]) {
            return aev_0.cnj;
        }
        if (f2 < this.cnc[2]) {
            return aev_0.cnk;
        }
        if (f2 < this.cnc[3]) {
            return aev_0.cnl;
        }
        return aev_0.cnm;
    }

    public float a(int n, int n2, float f2, aev_0 aev_02) {
        assert (this.cr(f2) == aev_02);
        assert (aev_02 != aev_0.cni && aev_02 != aev_0.cnm);
        float f3 = this.a(n, n2, aev_02);
        float f4 = this.b(n, n2, aev_02);
        int n3 = aev_02.ordinal();
        float f5 = (f2 - this.cnc[n3 - 1]) / (this.cnc[n3] - this.cnc[n3 - 1]);
        return GC.a(f3, f4, f5);
    }

    protected abstract float a(int var1, int var2, aev_0 var3);

    protected abstract float b(int var1, int var2, aev_0 var3);
}

