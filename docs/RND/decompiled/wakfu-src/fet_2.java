/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fET
 */
class fet_2
extends frs_1 {
    final /* synthetic */ fer_2 uoa;

    fet_2(fer_2 fer_22) {
        this.uoa = fer_22;
    }

    private int getFirstConstraint() {
        if (this.uoa.unV <= 0) {
            return (int)Math.round(Math.sqrt(this.uoa.kwE.size()));
        }
        return this.uoa.unV;
    }

    private int getSecondConstraint(int n) {
        return (int)Math.ceil((double)this.uoa.kwE.size() / (double)n);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n;
        int n2;
        if (this.uoa.kwE.size() == 0) {
            return new fsm_1(0, 0);
        }
        if (this.uoa.tMi) {
            n2 = this.getFirstConstraint();
            n = this.getSecondConstraint(n2);
        } else {
            n = this.getFirstConstraint();
            n2 = this.getSecondConstraint(n);
        }
        fsm_1 fsm_12 = this.uoa.kwE.get(0).getMinSize();
        fsm_12.setWidth(fsm_12.width * n2);
        fsm_12.setHeight(fsm_12.height * n);
        return fsm_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n;
        int n2;
        if (this.uoa.kwE.size() == 0) {
            return new fsm_1(0, 0);
        }
        if (this.uoa.tMi) {
            n2 = this.getFirstConstraint();
            n = this.getSecondConstraint(n2);
        } else {
            n = this.getFirstConstraint();
            n2 = this.getSecondConstraint(n);
        }
        fsm_1 fsm_12 = this.uoa.kwE.get(0).getPrefSize();
        fsm_12.setWidth(fsm_12.width * n2);
        fsm_12.setHeight(fsm_12.height * n);
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        block12: {
            int n;
            int n2;
            int n3;
            if (this.uoa.kwE.size() == 0) {
                return;
            }
            if (this.uoa.tMi) {
                n3 = this.getFirstConstraint();
                n2 = this.getSecondConstraint(n3);
            } else {
                n2 = this.getFirstConstraint();
                n3 = this.getSecondConstraint(n2);
            }
            int n4 = this.uoa.kwE.size();
            for (n = 0; n < n4; ++n) {
                this.uoa.kwE.get(n).setSizeToPrefSize();
            }
            n = this.uoa.kwE.size();
            n4 = this.uoa.kwE.get(0).getWidth();
            int n5 = this.uoa.kwE.get(0).getHeight();
            int n6 = 0;
            int n7 = faw_22.getAppearance().getContentHeight() - n5;
            if (this.uoa.tMi) {
                for (int i = 0; i < n2; ++i) {
                    for (int j = 0; j < n3; ++j) {
                        int n8 = j + i * n3;
                        if (n8 < n) {
                            faw_2 faw_23 = this.uoa.kwE.get(n8);
                            faw_23.setPosition(n6, n7);
                            n6 += n4;
                            continue;
                        }
                        break block12;
                    }
                    n6 = 0;
                    n7 -= n5;
                }
            } else {
                for (int i = 0; i < n3; ++i) {
                    for (int j = 0; j < n2; ++j) {
                        int n9 = i + j * n3;
                        if (n9 < n) {
                            faw_2 faw_24 = this.uoa.kwE.get(j + i * n2);
                            faw_24.setPosition(n6, n7);
                            n7 -= n5;
                            continue;
                        }
                        break block12;
                    }
                    n7 = faw_22.getAppearance().getContentHeight() - n5;
                    n6 += n4;
                }
            }
        }
    }
}

