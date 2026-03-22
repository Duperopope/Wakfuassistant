/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEL
 */
abstract class fel_2
implements fej_1 {
    private fhs_2 nQt;
    static final /* synthetic */ boolean unD;

    fel_2() {
    }

    @Override
    public void b(fem_1 fem_12) {
        this.nQt = fyw_0.gqw().gqC().uR(fem_12.getElementMap().getId());
        if (!unD && this.nQt == null) {
            throw new AssertionError((Object)"Impossible de charger une bulle");
        }
    }

    protected void tT(String string) {
        if (this.nQt == null) {
            return;
        }
        fdz_1 fdz_12 = (fdz_1)this.nQt.uH("text");
        if (fdz_12 == null) {
            return;
        }
        fdz_12.setStyle(string);
    }

    protected void a(String string, fsm_1 fsm_12) {
        if (this.nQt == null) {
            return;
        }
        faw_2 faw_22 = (faw_2)this.nQt.uH("container");
        if (faw_22 == null) {
            return;
        }
        faw_22.setStyle(string);
        faw_22.setPrefSize(fsm_12);
        faw_22.getAppearance().setModulationColor(null);
        faw_2 faw_23 = (faw_2)this.nQt.uH("coloredContainer");
        if (faw_23 == null) {
            return;
        }
        faw_23.setPrefSize(new fsm_1(fsm_12.getSize().width, fsm_12.getSize().height + 20));
    }

    protected void h(String string, int n, int n2) {
        if (this.nQt == null) {
            return;
        }
        fbt_1 fbt_12 = (fbt_1)this.nQt.uH("image");
        if (fbt_12 == null) {
            return;
        }
        fbt_12.setStyle(string);
        fbt_12.getAppearance().setModulationColor(null);
        frp_1 frp_12 = (frp_1)fbt_12.getLayoutData();
        frp_12.setXOffset(n);
        frp_12.setYOffset(n2);
    }

    @Override
    public void c(fem_1 fem_12) {
        this.nQt = fyw_0.gqw().gqC().uR(fem_12.getElementMap().getId());
        fbt_1 fbt_12 = (fbt_1)this.nQt.uH("image");
        boolean bl = fem_12.isToRight();
        fbt_12.setStyle(bl ? "BubbleArrowLeft" : "BubbleArrowRight");
        frp_1 frp_12 = (frp_1)fbt_12.getLayoutData();
        frp_12.setAlign(bl ? fzw_0.tLk : fzw_0.tLo);
        this.b(fem_12);
    }

    static {
        unD = !fek_1.class.desiredAssertionStatus();
    }
}

