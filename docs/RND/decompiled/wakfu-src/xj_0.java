/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XJ
 */
public class xj_0
implements xm_0 {
    @Override
    public void a(XI xI, int n) {
        int n2 = xI.bnA();
        int n3 = xI.getDuration();
        int n4 = xI.bnQ();
        xI.setYOffset((int)XG.d(n2, 60.0f, 60.0f, n3));
        xI.setXOffset(-n4 / 2);
        xI.bnK();
        float f2 = (float)n3 * 0.8f;
        float f3 = GC.b(XG.d(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
        xI.bH(f3);
        xI.bI(f3);
    }
}

