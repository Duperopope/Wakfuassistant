/*
 * Decompiled with CFR 0.152.
 */
public class XD
implements xf_0 {
    private final int bSs;
    private final int bSt;
    private final int bSu;
    private final int bSv;
    private final float bSw;
    private final int bSx;
    private final int bSy;
    public static final int bSz = 100;

    public XD(int n, int n2, int n3, int n4, float f2, int n5) {
        this.bSs = n;
        this.bSt = n2;
        this.bSu = n3;
        this.bSv = n4;
        this.bSw = f2;
        this.bSx = n5;
        this.bSy = 0;
    }

    public XD(int n, int n2, int n3, int n4, float f2, int n5, int n6) {
        this.bSs = n;
        this.bSt = n2;
        this.bSu = n3;
        this.bSv = n4;
        this.bSw = f2;
        this.bSx = n5;
        this.bSy = n6;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        int n2 = xv_0.h(xv_02);
        int n3 = xv_02.getDuration();
        awx_2 awx_22 = xv_02.bny().bOg();
        if (n2 > n3 - 500) {
            awx_22.setAlpha(XG.d(n2 - n3 + 500, 1.5f, -1.6f, 500.0f));
        }
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        float f2 = n2 < this.bSx ? (float)n2 / (float)this.bSx : 1.0f;
        int n4 = (int)((float)this.bSs * f2) + this.bSu;
        int n5 = (int)((float)this.bSt * f2) + this.bSv;
        if (n2 < this.bSy) {
            float f3 = 1.0f - (float)n2 / (float)this.bSy;
            n4 += (int)GC.b(-10.0f * f3, 10.0f * f3);
            n5 += (int)GC.b(-10.0f * f3, 10.0f * f3);
        }
        xv_02.setXOffset(n4);
        xv_02.setYOffset(n5);
        xv_02.bny().setZoom(this.bSw * f2);
    }
}

