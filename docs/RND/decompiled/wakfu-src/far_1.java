/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAR
 */
class far_1
extends frs_1 {
    final /* synthetic */ faq_2 tQq;

    far_1(faq_2 faq_22) {
        this.tQq = faq_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.tQq.getPrefSize();
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return new fsm_1(70, 50);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = faw_22.getAppearance().getContentWidth();
        int n2 = faw_22.getAppearance().getContentHeight();
        if (n <= 0 || n2 <= 0) {
            return;
        }
        if (!this.tQq.tQi) {
            return;
        }
        awk_1 awk_12 = this.tQq.tQe.b(this.tQq.getColorTextureWidth(), this.tQq.getColorTextureHeight(), "colorPickerTexture" + n + n2);
        this.tQq.setPixmap(new awg_1(awk_12));
        this.tQq.gJ(this.tQq.getSliderTextureWidth(), this.tQq.getSliderTextureHeight());
        int n3 = Math.round(this.tQq.aPY * (float)this.tQq.getColorTextureWidth() / 360.0f);
        int n4 = Math.round(this.tQq.aPZ * (float)this.tQq.getColorTextureHeight() / 100.0f);
        this.tQq.setCursorPosition(n3, n4);
        int n5 = Math.round(this.tQq.aQa * (float)this.tQq.getSliderTextureHeight() / 100.0f);
        this.tQq.setSliderPosition(n5);
        this.tQq.tQi = false;
    }
}

