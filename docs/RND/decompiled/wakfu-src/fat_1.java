/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAT
 */
class fat_1
extends frs_1 {
    final /* synthetic */ fas_1 tQR;

    fat_1(fas_1 fas_12) {
        this.tQR = fas_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.tQR.getContentPrefSize();
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.tQR.nca != null ? this.tQR.nca.getPrefSize() : new fsm_1();
        fsm_1 fsm_13 = this.tQR.tQx != null ? this.tQR.tQx.getPrefSize() : new fsm_1();
        fsm_12.height = Math.max(fsm_12.height, fsm_13.height);
        fsm_12.width += fsm_13.width;
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = 0;
        if (this.tQR.tQx != null && this.tQR.tQx.isVisibleForLayout()) {
            this.tQR.tQx.setSizeToPrefSize();
            n = this.tQR.tQx.getSize().width;
            this.tQR.tQx.setPosition(this.tQR.uki.getContentWidth() - n, (this.tQR.uki.getContentHeight() - this.tQR.tQx.getHeight()) / 2);
        }
        if (this.tQR.nca != null && this.tQR.nca.isVisibleForLayout()) {
            this.tQR.nca.setPosition(0, 0);
            this.tQR.nca.setSize(new fsm_1(this.tQR.uki.getContentWidth() - n, this.tQR.uki.getContentHeight()));
        }
    }
}

