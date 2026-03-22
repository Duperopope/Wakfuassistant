/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XL
 */
public class xl_0
implements xm_0 {
    @Override
    public void a(XI xI, int n) {
        int n2 = xI.bnA();
        int n3 = xI.getDuration();
        int n4 = xI.bnQ();
        xI.setXOffset(-n4 / 2);
        xI.bnK();
        float f2 = 1.0f;
        if (n2 < n3 / 4) {
            f2 = XG.d(n2, -0.5f, 1.6f, n3 / 4);
        } else if (n2 > n3 * 3 / 4) {
            f2 = XG.d(n2 - n3 * 3 / 4, 1.5f, -1.6f, n3 / 4);
        }
        xI.bH(f2);
        xI.bI(f2);
    }
}

