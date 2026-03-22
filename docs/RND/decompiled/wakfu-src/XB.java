/*
 * Decompiled with CFR 0.152.
 */
public class XB
implements xf_0 {
    private final int bSp;
    private final int bSq;

    public XB(int n, int n2) {
        this.bSp = n;
        this.bSq = n2;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        float f2;
        float f3;
        int n2 = xv_0.d(xv_02);
        int n3 = xv_02.getDuration();
        awx_2 awx_22 = xv_02.bny().bOg();
        awx_22.setAlpha(XG.d(n2, 1.5f, -1.6f, n3));
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        float f4 = 100.0f;
        if ((float)n2 < 100.0f) {
            f3 = 0.75f;
        } else {
            f2 = GC.b(((float)n2 - 100.0f) / ((float)n3 - 100.0f) * 4.0f, 0.0f, 1.0f);
            f3 = Math.max(0.0f, 0.75f - f2);
        }
        f2 = Math.min(1.0f, (float)n2 / (float)n3 * 4.0f);
        xv_02.setXOffset((int)((float)this.bSp * f2));
        double d2 = Math.PI * (double)f2;
        xv_02.setYOffset((int)((double)this.bSq * Math.abs(Math.sin(d2))) + 60);
        xv_02.bny().setZoom(f3);
    }
}

