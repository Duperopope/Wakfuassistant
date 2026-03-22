/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xw
 */
public class xw_0
implements xf_0 {
    public static final float bRW = 0.5f;
    private int bRf;
    private int bRg;
    private float azQ;

    public xw_0() {
    }

    public xw_0(int n, int n2) {
        this(n, n2, 0.5f);
    }

    public xw_0(int n, int n2, float f2) {
        this.bRf = n;
        this.bRg = n2;
        this.azQ = f2;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        int n2 = xv_0.a(xv_02);
        int n3 = xv_02.getDuration();
        xv_02.setXOffset(this.bRf);
        xv_02.setYOffset((int)XG.d(n2, 60.0f, 50.0f, n3) + this.bRg);
        awx_2 awx_22 = xv_02.bny().bOg();
        awx_22.setAlpha(XG.d(n2, 1.5f, -1.6f, n3));
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        xv_02.bny().setZoom(this.azQ);
    }
}

