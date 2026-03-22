/*
 * Decompiled with CFR 0.152.
 */
public class cBs
implements Uu {
    public static final cBs mxw = new cBs();
    private int mxx = -1;

    public void eIm() {
        this.mxx = -1;
    }

    @Override
    public void onCalendarEvent(Uv uv, ut_0 ut_02) {
        int n;
        if (uv == Uv.bvz && ut_02.bjo() && (n = ut_02.bjc().bjE()) != this.mxx) {
            if (this.mxx != -1) {
                cAY.eHc().a(new cCu(n));
            }
            this.mxx = n;
        }
    }
}

