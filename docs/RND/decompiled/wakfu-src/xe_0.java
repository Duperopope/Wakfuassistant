/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XE
 */
public class xe_0
implements xf_0 {
    private final int bSA;
    private final int bSB;
    private final float bSC;

    public xe_0(int n, int n2, float f2) {
        this.bSA = n;
        this.bSB = n2;
        this.bSC = f2;
    }

    public xe_0(int n, int n2) {
        this(n, n2, 1.0f);
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        xv_02.setXOffset(this.bSA);
        xv_02.setYOffset(this.bSB);
        awx_2 awx_22 = xv_02.bny().bOg();
        xv_02.bny().c(awx_22.aIU(), awx_22.aIV(), awx_22.aIW(), awx_22.aIX());
        xv_02.bny().setZoom(this.bSC);
    }
}

