/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XK
 */
public class xk_0
implements xm_0 {
    @Override
    public void a(XI xI, int n) {
        int n2 = xI.bnA();
        int n3 = xI.getDuration();
        xI.setYOffset((int)XG.c(0.0f, 50.0f, n2, n3));
        xI.setXOffset(-8);
        xI.bnK();
        float f2 = (float)n3 * 0.65f;
        float f3 = GC.b(XG.d(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
        xI.bH(f3);
        xI.bI(f3);
    }
}

