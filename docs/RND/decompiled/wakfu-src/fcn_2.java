/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCn
 */
class fcn_2
extends frs_1 {
    final /* synthetic */ fce_2 tYj;

    fcn_2(fce_2 fce_22) {
        this.tYj = fce_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return new fsm_1(0, 0);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return new fsm_1(0, 0);
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.tYj.tXH) {
            if (this.tYj.tXF != null) {
                while (this.tYj.tXF.length < this.tYj.tXG.size()) {
                    this.tYj.tXG.remove(this.tYj.tXF.length).gAD();
                }
                if (this.tYj.tXF.length > this.tYj.tXG.size()) {
                    fbt_1 fbt_12;
                    if (this.tYj.tXG.size() == 0) {
                        fbt_12 = new fbt_1();
                        fbt_12.aVI();
                        fbt_12.setNonBlocking(true);
                        fbt_12.setModulationColor(this.tYj.getModulationColor());
                        fbt_12.d(this.tYj.tEl.gAK());
                        this.d(fbt_12);
                        this.tYj.tXG.add(fbt_12);
                    }
                    while (this.tYj.tXF.length > this.tYj.tXG.size()) {
                        fbt_12 = (fbt_1)this.tYj.tXG.get(0).gAK();
                        this.d(fbt_12);
                        this.tYj.tXG.add(fbt_12);
                    }
                }
            }
            this.gtI();
            this.tYj.tXH = false;
        }
    }

    private void gtI() {
        if (this.tYj.tXF == null || this.tYj.tXF.length == 0 || this.tYj.tXG == null || this.tYj.tXG.size() != this.tYj.tXF.length) {
            return;
        }
        if (this.tYj.tMi) {
            for (int i = 0; i < this.tYj.tXG.size(); ++i) {
                fbt_1 fbt_12 = this.tYj.tXG.get(i);
                float f2 = this.tYj.tXF[i];
                fbt_12.setPosition(Math.round((float)this.tYj.getAppearance().getContentWidth() * f2), this.tYj.getAppearance().getContentHeight() / 2 - fbt_12.getHeight() / 2);
            }
        } else {
            for (int i = 0; i < this.tYj.tXG.size(); ++i) {
                fbt_1 fbt_13 = this.tYj.tXG.get(i);
                float f3 = this.tYj.tXF[i];
                fbt_13.setPosition(this.tYj.getAppearance().getContentWidth() / 2 - fbt_13.getWidth() / 2, Math.round((float)this.tYj.getAppearance().getContentHeight() * f3));
            }
        }
        this.tYj.tXH = false;
        this.setNeedsToMiddleProcess();
    }
}

