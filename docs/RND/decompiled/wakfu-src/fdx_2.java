/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDx
 */
class fdx_2
extends frs_1 {
    final /* synthetic */ fdv_1 ugE;

    fdx_2(fdv_1 fdv_12) {
        this.ugE = fdv_12;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.ugE.ufu.getMinSize();
        return new fsm_1(fsm_12.width + this.ugE.ufu.getAppearance().getInsetWidth() + this.ugE.getClearButtonFullWidth() + this.ugE.getSearchButtonFullWidth(), Math.max(fsm_12.height + this.ugE.ufu.getAppearance().getInsetHeight(), Math.max(this.ugE.getClearButtonHeight(), this.ugE.getSearchButtonHeight())));
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.ugE.ufu.getPrefSize();
        return new fsm_1(fsm_12.width + this.ugE.ufu.getAppearance().getInsetWidth() + this.ugE.getClearButtonFullWidth() + this.ugE.getSearchButtonFullWidth(), Math.max(fsm_12.height + this.ugE.ufu.getAppearance().getInsetHeight(), Math.max(this.ugE.getClearButtonHeight(), this.ugE.getSearchButtonHeight())));
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = faw_22.getAppearance().getContentWidth();
        int n2 = faw_22.getAppearance().getContentHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        if (!this.ugE.tQi) {
            return;
        }
        int n3 = this.ugE.getSearchButtonFullWidth();
        boolean bl = this.ugE.ufD;
        int n4 = bl ? this.ugE.getClearButtonFullWidth() : 0;
        boolean bl2 = false;
        boolean bl3 = false;
        this.ugE.ufu.setPosition(0 + n3, 0);
        this.ugE.ufu.setSize(n - (n3 + n4), n2);
        boolean bl4 = this.ugE.ufq && bl;
        this.ugE.ufw.setVisible(bl4);
        if (bl4) {
            this.ugE.ufw.setPosition(n - this.ugE.ufw.getWidth(), n2 / 2 - this.ugE.ufw.getHeight() / 2);
        }
        if (this.ugE.ufp) {
            this.ugE.ufv.setPosition(0, n2 / 2 - this.ugE.ufv.getHeight() / 2);
        }
        this.ugE.tQi = false;
    }
}

