/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xy
 */
public class xy_0
implements xf_0 {
    private final int bSe;
    private final int bSf;

    public xy_0(int n, int n2) {
        this.bSe = n;
        this.bSf = n2;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        int n2 = xv_0.b(xv_02);
        int n3 = xv_02.getDuration();
        xv_02.setYOffset((int)XG.d(n2, 60.0f, 60.0f, n3) + this.bSf);
        xv_02.setXOffset(this.bSe);
        awx_2 awx_22 = xv_02.bny().bOg();
        float f2 = (float)n3 * 0.8f;
        awx_22.setAlpha(GC.b(XG.d(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f));
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
    }

    private float a(float f2, float f3, int n) {
        boolean bl;
        float f4 = f2 * (float)n / f3;
        int n2 = (int)Math.floor(f4);
        float f5 = f4 - (float)n2;
        boolean bl2 = bl = n2 % 2 == 0;
        if (bl) {
            return f5;
        }
        return 1.0f - f5;
    }
}

