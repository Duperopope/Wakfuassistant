/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFX
 */
public class bfx_0
extends bfc_1 {
    public bfx_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dno().tb(ffV2.LV()) == null) {
            return false;
        }
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
        return fgM.skr;
    }
}

