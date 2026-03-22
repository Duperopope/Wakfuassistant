/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCV
 */
class fcv_2
extends frs_1 {
    final /* synthetic */ fcq_2 ubm;

    fcv_2(fcq_2 fcq_22) {
        this.ubm = fcq_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        if (!this.ubm.uaE) {
            return new fsm_1(0, 0);
        }
        int n = 0;
        int n2 = 0;
        fsm_1 fsm_12 = this.ubm.uax.getMinSize();
        fsm_1 fsm_13 = this.ubm.uay.getMinSize();
        fsm_1 fsm_14 = this.ubm.uaP.getMinSize();
        if (this.ubm.uaA != fzi_0.tHc) {
            n += fsm_13.height;
            n2 += fsm_13.width;
        } else {
            n2 += fsm_14.width;
        }
        if (this.ubm.uaz != fzi_0.tHc) {
            n2 += fsm_12.width;
            n += fsm_12.height;
        } else {
            n += fsm_14.height;
        }
        return new fsm_1(n2, n);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        if (!this.ubm.uaE) {
            return new fsm_1(0, 0);
        }
        int n = 0;
        int n2 = 0;
        fsm_1 fsm_12 = this.ubm.uax.getPrefSize();
        fsm_1 fsm_13 = this.ubm.uay.getPrefSize();
        fsm_1 fsm_14 = this.ubm.uaP.getPrefSize();
        if (this.ubm.uaA != fzi_0.tHc) {
            if (this.ubm.uky != null) {
                if (fsm_14.width <= this.ubm.uky.width) {
                    n2 += fsm_14.width;
                    if (this.ubm.uaA == fzi_0.tHb) {
                        n += fsm_13.height;
                    }
                } else {
                    n2 += Math.max(this.ubm.uky.width, fsm_13.width);
                    n += fsm_13.height;
                }
            } else {
                n += fsm_13.height;
                n2 += fsm_13.width;
            }
        } else {
            n2 += fsm_14.width;
        }
        if (this.ubm.uaz != fzi_0.tHc) {
            if (this.ubm.uky != null) {
                if (fsm_14.height <= this.ubm.uky.height) {
                    n += fsm_14.height;
                    if (this.ubm.uaz == fzi_0.tHb) {
                        n2 += fsm_12.width;
                    }
                } else {
                    n += Math.max(this.ubm.uky.height, fsm_12.height);
                    n2 += fsm_12.width;
                }
            } else {
                n2 += fsm_12.width;
                n += fsm_12.height;
            }
        } else {
            n += fsm_14.height;
        }
        return new fsm_1(n2, n);
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.ubm.uaP != null) {
            float f2;
            int n;
            int n2;
            fys_0 fys_02 = this.ubm.getAppearance();
            int n3 = fys_02.getContentHeight();
            int n4 = fys_02.getContentWidth();
            if (!this.ubm.uaE || (double)n4 >= this.ubm.uaP.getPrefSize().getWidth() && this.ubm.uaA != fzi_0.tHb || this.ubm.uaA == fzi_0.tHc) {
                this.ubm.uaC = false;
            } else {
                this.ubm.uaC = true;
                n3 = (int)((double)n3 - this.ubm.uay.getPrefSize().getHeight());
            }
            if (!this.ubm.uaE || (double)n3 >= this.ubm.uaP.getPrefSize().getHeight() && this.ubm.uaz != fzi_0.tHb || this.ubm.uaz == fzi_0.tHc) {
                this.ubm.uaB = false;
            } else {
                this.ubm.uaB = true;
                n4 = (int)((double)n4 - this.ubm.uax.getPrefSize().getWidth());
            }
            if (this.ubm.uaB && !this.ubm.uaC) {
                if ((double)n4 >= this.ubm.uaP.getPrefSize().getWidth() && this.ubm.uaA != fzi_0.tHb || this.ubm.uaA == fzi_0.tHc) {
                    this.ubm.uaC = false;
                } else {
                    this.ubm.uaC = true;
                    n3 = (int)((double)n3 - this.ubm.uay.getPrefSize().getHeight());
                }
            }
            int n5 = this.ubm.uaD != null && this.ubm.uaA != fzi_0.tHc ? this.ubm.uaP.getPrefSize().width : (int)Math.max((double)n4, this.ubm.uaP.getPrefSize().getWidth());
            int n6 = this.ubm.uaD != null && this.ubm.uaz != fzi_0.tHc ? this.ubm.uaP.getPrefSize().height : (int)Math.max((double)n3, this.ubm.uaP.getPrefSize().getHeight());
            this.ubm.uaP.setSize(n5, n6);
            this.ubm.gun();
            if (this.ubm.uaC) {
                this.ubm.uay.setSize(n4, (int)this.ubm.uay.getPrefSize().getHeight());
            }
            if (this.ubm.uaB) {
                this.ubm.uax.setSize((int)this.ubm.uax.getPrefSize().getWidth(), n3);
            }
            if (this.ubm.uaC) {
                n2 = 0;
                n = 0;
                if (this.ubm.uaB && this.ubm.uaM == fzx_0.tLt) {
                    n2 += this.ubm.uax.getWidth();
                }
                if (this.ubm.uaN == fzx_0.tLq) {
                    n += n3;
                }
                this.ubm.uay.setPosition(n2, n);
                this.ubm.uay.setSliderSize((float)n4 / (float)n5);
                f2 = ((float)n5 / (float)n4 - 1.0f) * this.ubm.uaQ;
                this.ubm.uay.setButtonJump(1.0f / Math.max(1.0f, f2));
            }
            if (this.ubm.uaB) {
                n2 = 0;
                n = 0;
                if (this.ubm.uaC && this.ubm.uaN == fzx_0.tLr) {
                    n += this.ubm.uay.getHeight();
                }
                if (this.ubm.uaM == fzx_0.tLs) {
                    n2 += n4;
                }
                this.ubm.uax.setPosition(n2, n);
                this.ubm.uax.setSliderSize((float)n3 / (float)n6);
                f2 = 1.0f / Math.max(1.0f, (float)n6 / (float)n3 - 1.0f) * this.ubm.uaQ;
                this.ubm.uax.setButtonJump(f2);
            }
            this.ubm.uay.setVisible(this.ubm.uaC);
            this.ubm.uax.setVisible(this.ubm.uaB);
        }
    }

    @Override
    public fsm_1 getIncompressibleBounds(faw_2 faw_22) {
        boolean bl;
        if (this.ubm.uaP == null) {
            return new fsm_1(0, 0);
        }
        if (!this.ubm.uaE) {
            return new fsm_1(0, 0);
        }
        fys_0 fys_02 = this.ubm.getAppearance();
        int n = fys_02.getContentHeight();
        int n2 = fys_02.getContentWidth();
        boolean bl2 = !((double)n2 >= this.ubm.uaP.getPrefSize().getWidth() && this.ubm.uaA != fzi_0.tHb || this.ubm.uaA == fzi_0.tHc);
        if ((double)n >= this.ubm.uaP.getPrefSize().getHeight() && this.ubm.uaz != fzi_0.tHb || this.ubm.uaz == fzi_0.tHc) {
            bl = false;
        } else {
            bl = true;
            bl2 = !((double)n2 - this.ubm.uax.getPrefSize().getWidth() >= this.ubm.uaP.getPrefSize().getWidth() && this.ubm.uaA != fzi_0.tHb || this.ubm.uaA == fzi_0.tHc);
        }
        return new fsm_1(bl ? (int)this.ubm.uax.getPrefSize().getWidth() : 0, bl2 ? (int)this.ubm.uay.getPrefSize().getHeight() : 0);
    }
}

