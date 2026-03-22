/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCr
 */
class fcr_2
extends frs_1 {
    final /* synthetic */ fcp_2 tYD;

    fcr_2(fcp_2 fcp_22) {
        this.tYD = fcp_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        if (this.tYD.tMi) {
            fsm_1 fsm_12;
            if (this.tYD.tPW != null) {
                fsm_12 = this.tYD.tPW.getMinSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
            if (this.tYD.tYo != null) {
                fsm_12 = this.tYD.tYo.getMinSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
            if (this.tYD.tYp != null) {
                fsm_12 = this.tYD.tYp.getMinSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
        } else {
            fsm_1 fsm_13;
            if (this.tYD.tPW != null) {
                fsm_13 = this.tYD.tPW.getMinSize();
                n2 = Math.max(n2, fsm_13.width);
                n += fsm_13.height;
            }
            if (this.tYD.tYp != null) {
                fsm_13 = this.tYD.tYp.getMinSize();
                n2 = Math.max(n2, fsm_13.width);
                n += fsm_13.height;
            }
        }
        return new fsm_1(n2, n);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        if (this.tYD.tMi) {
            fsm_1 fsm_12;
            if (this.tYD.tPW != null) {
                fsm_12 = this.tYD.tPW.getPrefSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
            if (this.tYD.tYo != null) {
                fsm_12 = this.tYD.tYo.getPrefSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
            if (this.tYD.tYp != null) {
                fsm_12 = this.tYD.tYp.getPrefSize();
                n = Math.max(n, fsm_12.height);
                n2 += fsm_12.width;
            }
        } else {
            fsm_1 fsm_13;
            if (this.tYD.tPW != null) {
                fsm_13 = this.tYD.tPW.getPrefSize();
                n2 = Math.max(n2, fsm_13.width);
                n += fsm_13.height;
            }
            if (this.tYD.tYp != null) {
                fsm_13 = this.tYD.tYp.getPrefSize();
                n2 = Math.max(n2, fsm_13.width);
                n += fsm_13.height;
            }
        }
        return new fsm_1(n2, n);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = faw_22.getAppearance().getContentHeight();
        int n2 = faw_22.getAppearance().getContentWidth();
        if (this.tYD.tMi) {
            int n3;
            fsm_1 fsm_12;
            int n4 = 0;
            if (this.tYD.tPW != null) {
                n4 += this.tYD.tPW.getPrefSize().width;
            }
            if (this.tYD.tYo != null) {
                n4 += this.tYD.tYo.getPrefSize().width;
            }
            if (this.tYD.tYp != null) {
                n4 += this.tYD.tYp.getPrefSize().width;
            }
            int n5 = faa_2.tLO.cf(n4, n2);
            if (this.tYD.tPW != null) {
                fsm_12 = this.tYD.tPW.getPrefSize();
                n3 = faa_2.tLO.cg(fsm_12.height, n);
                this.tYD.tPW.setPosition(n5, n3);
                this.tYD.tPW.setSizeToPrefSize();
                n5 += fsm_12.width;
            }
            if (this.tYD.tYo != null) {
                fsm_12 = this.tYD.tYo.getPrefSize();
                n3 = faa_2.tLO.cg(fsm_12.height, n);
                this.tYD.tYo.setPosition(n5, n3);
                this.tYD.tYo.setSizeToPrefSize();
                n5 += fsm_12.width;
            }
            if (this.tYD.tYp != null) {
                fsm_12 = this.tYD.tYp.getPrefSize();
                n3 = faa_2.tLO.cg(fsm_12.height, n);
                this.tYD.tYp.setPosition(n5, n3);
                this.tYD.tYp.setSizeToPrefSize();
            }
        } else {
            int n6;
            fsm_1 fsm_13;
            int n7 = 0;
            if (this.tYD.tPW != null) {
                n7 += this.tYD.tPW.getPrefSize().height;
            }
            if (this.tYD.tYp != null) {
                n7 += this.tYD.tYp.getPrefSize().height;
            }
            int n8 = faa_2.tLO.cg(n7, n);
            if (this.tYD.tYp != null) {
                fsm_13 = this.tYD.tYp.getPrefSize();
                n6 = faa_2.tLO.cf(fsm_13.width, n2);
                this.tYD.tYp.setPosition(n6, n8);
                this.tYD.tYp.setSizeToPrefSize();
                n8 += fsm_13.height;
            }
            if (this.tYD.tPW != null) {
                fsm_13 = this.tYD.tPW.getPrefSize();
                n6 = faa_2.tLO.cf(fsm_13.width, n2);
                this.tYD.tPW.setPosition(n6, n8);
                this.tYD.tPW.setSizeToPrefSize();
            }
            if (this.tYD.tYo != null) {
                fsm_13 = this.tYD.tYo.getPrefSize();
                n6 = faa_2.tLO.cf(fsm_13.width, n2);
                this.tYD.tYo.setPosition(n6, this.tYD.tPW.getY() - 2);
                this.tYD.tYo.setSizeToPrefSize();
            }
        }
    }
}

