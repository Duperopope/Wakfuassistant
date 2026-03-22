/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xz
 */
public class xz_0
implements xf_0 {
    private final int bSg;
    private final int bSh;
    private final int bSi;
    private final int bSj;
    private final float bSk;
    private final int bSl;

    public xz_0(int n, int n2, int n3, int n4, float f2, int n5) {
        this.bSg = n;
        this.bSh = n2;
        this.bSi = n3;
        this.bSj = n4;
        this.bSk = f2;
        this.bSl = n5;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        xv_02.bny().a(awv_1.dlO);
        int n2 = xv_0.g(xv_02);
        int n3 = xv_02.getDuration();
        awx_2 awx_22 = xv_02.bny().bOg();
        if (n2 > n3 - 500) {
            awx_22.setAlpha(XG.d(n2 - n3 + 500, 1.5f, -1.6f, 500.0f));
        }
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        float f2 = n2 < this.bSl ? XG.a(this.bSk * 2.0f, this.bSk, n2, this.bSl) : this.bSk;
        float f3 = XG.b(0.0f, 1.0f, n2, n3);
        int n4 = (int)((float)this.bSg * f3) + this.bSi;
        int n5 = (int)((float)this.bSh * f3) + this.bSj;
        xv_02.setXOffset(n4);
        xv_02.setYOffset(n5);
        xv_02.bny().setZoom(f2);
    }
}

