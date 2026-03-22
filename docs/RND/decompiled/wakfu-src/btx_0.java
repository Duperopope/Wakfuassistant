/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btX
 */
public final class btx_0 {
    private boolean jnX;

    public void dIx() {
        if (this.jnX) {
            return;
        }
        fiq_2.gCw().d(fik_2.gCa().l("spectator.mode.movement", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1).a((n, string) -> {
            if (n == 300) {
                bsj_0 bsj_02 = aue_0.cVJ().cVK().dnB();
                aVi.cWF().a(bsj_02, (aft_2)new bty_0(this, agb_1.cbm(), eui_1.rtp.aJr(), 0));
                aVi.cWF().m(bsj_02);
            }
            this.jnX = false;
        }));
        this.jnX = true;
    }
}

