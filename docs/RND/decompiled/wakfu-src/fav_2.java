/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAV
 */
class fav_2
extends frs_1 {
    final /* synthetic */ fau_2 tRb;

    fav_2(fau_2 fau_22) {
        this.tRb = fau_22;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.tRb.tQW.getPrefSize();
        return new fsm_1(fsm_12.width * 3, fsm_12.height * 3);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = faw_22.getAppearance().getContentWidth();
        int n2 = faw_22.getAppearance().getContentHeight();
        this.tRb.kqa.setPosition(0, 0);
        this.tRb.kqa.setSize(n, n2);
        this.tRb.tQW.setSizeToPrefSize();
        this.tRb.tQV.setSizeToPrefSize();
        int n3 = n / 2 - this.tRb.tQW.getWidth() / 2;
        int n4 = n / 2 + (int)((float)n3 * GC.H(this.tRb.aQj));
        int n5 = n2 / 2 + (int)((float)n3 * GC.G(this.tRb.aQj));
        this.tRb.tQW.setPosition(n4 - this.tRb.tQW.getWidth() / 2, n5 - this.tRb.tQW.getHeight() / 2);
        this.tRb.tQV.setPosition(n4 - this.tRb.tQV.getWidth() / 2, n5 - this.tRb.tQV.getHeight() / 2);
    }
}

