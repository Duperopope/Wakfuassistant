/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCI
 */
public class fci_1
extends frs_1 {
    final /* synthetic */ fch_1 tZR;

    public fci_1(fch_1 fch_12) {
        this.tZR = fch_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return new fsm_1(this.tZR.uki.getContentWidth(), this.tZR.uki.getContentHeight());
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return new fsm_1(this.tZR.uki.getContentWidth(), this.tZR.uki.getContentHeight());
    }

    @Override
    public void a(faw_2 faw_22) {
        this.tZR.tZP.setSize(this.tZR.getAppearance().getContentWidth(), this.tZR.getAppearance().getContentHeight());
        this.tZR.tZP.setPosition(0, 0);
        this.tZR.tSq.setSize(this.tZR.getAppearance().getContentWidth(), this.tZR.getAppearance().getContentHeight());
        this.tZR.tSq.setPosition(0, 0);
    }
}

