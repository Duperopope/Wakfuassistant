/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBl
 */
class fbl_1
extends frs_1 {
    final /* synthetic */ fbg_2 tRY;

    fbl_1(fbg_2 fbg_22) {
        this.tRY = fbg_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.tRY.getContentPrefSize();
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return this.tRY.tRQ != null ? this.tRY.tRQ.getPrefSize() : new fsm_1();
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.tRY.tRQ != null && this.tRY.tRQ.isVisibleForLayout()) {
            this.tRY.tRQ.setPosition(0, 0);
            this.tRY.tRQ.setSize(new fsm_1(this.tRY.uki.getContentWidth(), this.tRY.uki.getContentHeight()));
        }
    }
}

