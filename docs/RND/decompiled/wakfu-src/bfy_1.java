/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFY
 */
final class bfy_1
extends bfc_1 {
    bfy_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqw()) {
            aPd.e("action.error.notInBattleground", new Object[0]);
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    protected boolean dTk() {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skH;
    }
}

