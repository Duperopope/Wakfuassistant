/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XC
 */
public class xc_0
implements xf_0 {
    private final int bSr;

    public xc_0(int n) {
        this.bSr = n;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        int n2 = xv_0.c(xv_02);
        int n3 = xv_02.getDuration();
        int n4 = 0;
        int n5 = (int)XG.d(Math.max(0, n2 - this.bSr), 80.0f, 100.0f, n3);
        if (n2 < this.bSr) {
            float f2 = 1.0f - (float)n2 / (float)this.bSr;
            n4 += (int)GC.b(-5.0f * f2, 5.0f * f2);
        }
        xv_02.setYOffset(n5);
        xv_02.setXOffset(n4);
        awx_2 awx_22 = xv_02.bny().bOg();
        awx_22.setAlpha(XG.d(n2, 1.5f, -1.6f, n3));
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
    }
}

