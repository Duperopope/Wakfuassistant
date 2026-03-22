/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xx
 */
public class xx_0
implements xf_0 {
    private final int bRX;
    private final int bRY;
    private final int bRZ;
    private final int bSa;
    private final float bSb;
    private final int bSc;
    public static final int bSd = 100;

    public xx_0(int n, int n2, int n3, int n4, float f2, int n5) {
        this.bRX = n;
        this.bRY = n2;
        this.bRZ = n3;
        this.bSa = n4;
        this.bSb = f2;
        this.bSc = n5;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        float f2;
        xv_02.bny().a(awv_1.dlO);
        int n2 = xv_0.f(xv_02);
        int n3 = xv_02.getDuration();
        awx_2 awx_22 = xv_02.bny().bOg();
        if (n2 > n3 - 500) {
            awx_22.setAlpha(XG.d(n2 - n3 + 500, 1.5f, -1.6f, 500.0f));
        }
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        int n4 = this.bRZ;
        int n5 = this.bSa;
        if (n2 < this.bSc) {
            f2 = XG.a(this.bSb * 3.0f, this.bSb, n2, this.bSc);
        } else if (n2 > this.bSc + 350) {
            f2 = this.bSb;
            int n6 = n3 - this.bSc - 350;
            int n7 = n2 - this.bSc - 350;
            float f3 = XG.a(0.0f, 1.0f, n7, n6);
            n4 += (int)((float)this.bRX * f3);
            n5 += (int)((float)this.bRY * f3);
        } else {
            f2 = this.bSb;
        }
        xv_02.setXOffset(n4);
        xv_02.setYOffset(n5);
        xv_02.bny().setZoom(f2);
    }
}

