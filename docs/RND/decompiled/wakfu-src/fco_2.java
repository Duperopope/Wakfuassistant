/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCO
 */
class fco_2
extends frs_1 {
    final /* synthetic */ fcj_2 uat;

    fco_2(fcj_2 fcj_22) {
        this.uat = fcj_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = this.uat.uah.getMinSize();
        fsm_1 fsm_14 = this.uat.uai.getMinSize();
        fsm_1 fsm_15 = this.uat.uak != null ? ((fsm_12 = this.uat.uaj.getMinSize()) != null ? new fsm_1(Math.max(fsm_12.width, this.uat.uak.width), Math.max(fsm_12.height, this.uat.uak.height)) : this.uat.uak) : this.uat.uaj.getMinSize();
        if (this.uat.tMi) {
            return new fsm_1(fsm_13.width + fsm_14.width + fsm_15.width, Math.max(fsm_13.height, Math.max(fsm_14.height, fsm_15.height)));
        }
        return new fsm_1(Math.max(fsm_13.width, Math.max(fsm_14.width, fsm_15.width)), fsm_13.height + fsm_14.height + fsm_15.height);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        fsm_1 fsm_13 = this.uat.uah.getPrefSize();
        fsm_1 fsm_14 = this.uat.uai.getPrefSize();
        fsm_1 fsm_15 = this.uat.uak != null ? ((fsm_12 = this.uat.uaj.getPrefSize()) != null ? new fsm_1(Math.max(fsm_12.width, this.uat.uak.width), Math.max(fsm_12.height, this.uat.uak.height)) : this.uat.uak) : this.uat.uaj.getPrefSize();
        if (this.uat.tMi) {
            return new fsm_1(fsm_13.width + fsm_14.width + fsm_15.width, Math.max(fsm_13.height, Math.max(fsm_14.height, fsm_15.height)));
        }
        return new fsm_1(Math.max(fsm_13.width, Math.max(fsm_14.width, fsm_15.width)), fsm_13.height + fsm_14.height + fsm_15.height);
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.uat.tMi) {
            int n = this.uat.getAppearance().getContentHeight();
            this.uat.uah.setSize((int)this.uat.uah.getPrefSize().getWidth(), n);
            this.uat.uai.setSize((int)this.uat.uai.getPrefSize().getWidth(), n);
            this.uat.uaj.setSize(this.uat.getAppearance().getContentWidth() - this.uat.uah.getWidth() - this.uat.uai.getWidth(), n);
        } else {
            int n = this.uat.getAppearance().getContentWidth();
            this.uat.uah.setSize(n, (int)this.uat.uah.getPrefSize().getHeight());
            this.uat.uai.setSize(n, (int)this.uat.uai.getPrefSize().getHeight());
            this.uat.uaj.setSize(n, this.uat.getAppearance().getContentHeight() - this.uat.uah.getHeight() - this.uat.uai.getHeight());
        }
        this.uat.gui();
    }
}

