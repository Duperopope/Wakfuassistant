/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ajI
 */
class aji_2
implements ZJ {
    final /* synthetic */ ZC cBw;
    final /* synthetic */ afx_1 cBx;
    final /* synthetic */ int cBy;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aji_2(ajh_2 ajh_22, ZC zC, afx_1 afx_12, int n) {
        this.cBw = zC;
        this.cBx = afx_12;
        this.cBy = n;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.cBw.b(this);
        this.cBx.xK(this.cBy);
    }
}

