/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDN
 */
public class fdn_1
extends frs_1 {
    final /* synthetic */ fdk_2 uii;

    public fdn_1(fdk_2 fdk_22) {
        this.uii = fdk_22;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        int n3 = this.uii.gva();
        int n4 = 1;
        if (this.uii.tQy >= 0 || this.uii.ueg >= 0) {
            n4 = Math.min(Math.max(this.uii.tQy, this.uii.ueg), n3);
        }
        if (n4 < n3) {
            fsm_1 fsm_12 = this.uii.tLZ.getPrefSize();
            n2 += fsm_12.width;
        }
        return new fsm_1(n2, n += this.uii.uef * n4);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        Object object;
        int n;
        int n2;
        this.uii.tMh = true;
        int n3 = faw_22.getAppearance().getContentHeight();
        int n4 = faw_22.getAppearance().getContentWidth();
        int n5 = Math.min(this.uii.uhM.size(), n3 / this.uii.uef);
        if (n5 > (n2 = this.uii.ncz.size())) {
            this.uii.ncz.ensureCapacity(n5);
            this.uii.ued.ensureCapacity(n5);
            for (n = n2; n < n5; ++n) {
                fle_1 fle_12 = new fle_1();
                fle_12.aVI();
                this.uii.ued.add(fle_12);
                fcv_1 fcv_12 = new fcv_1();
                fcv_12.aVI();
                fcv_12.setNonBlocking(this.uii.ukD);
                fcv_12.setRendererManager(this.uii.tMx);
                fcv_12.setEnableDND(this.uii.tMe);
                fcv_12.setEnabled(this.uii.cHn);
                fcv_12.setNetEnabled(this.uii.ivk);
                fcv_12.a(fzq_0.tJU, new fdo_2(this, fcv_12), false);
                this.uii.ncz.add(fcv_12);
                this.d(fcv_12);
                fcv_12.setChildrenAdded(true);
                var9_14 = this.uii.getStyle();
                object = new StringBuilder("tree");
                if (var9_14 != null) {
                    ((StringBuilder)object).append((String)var9_14);
                }
                ((StringBuilder)object).append("$").append("cell");
                fcv_12.setStyle(((StringBuilder)object).toString(), true);
            }
        } else if (n5 < n2) {
            n = n2 - n5;
            for (int i = n - 1; i >= 0; --i) {
                int n6 = this.uii.ncz.size() - 1;
                var9_14 = this.uii.ncz.remove(n6);
                this.uii.m((fhv_1)var9_14);
                object = this.uii.ued.remove(n6);
                ((flk_1)object).aVH();
            }
        }
        boolean bl = this.uii.tMl = (n = this.uii.gva()) > this.uii.ncz.size();
        if (this.uii.tMl) {
            this.uii.tLZ.setVisible(true);
            int n7 = this.uii.tLZ.getPrefSize().width;
            this.uii.tLZ.setSize(n7, n3);
            this.uii.tLZ.setPosition(n4 -= n7, 0);
        } else {
            this.uii.tLZ.setVisible(false);
        }
        boolean bl2 = false;
        int n8 = n3 - this.uii.uef;
        for (int i = 0; i < n5; ++i) {
            object = this.uii.ncz.get(i);
            if (object == null) {
                fdk_2.aGh().warn((Object)("Impossible de trouver un renderableContainer \u00e0 la ligne " + i));
                continue;
            }
            ((fes_2)object).setSize(n4, this.uii.uef);
            ((fes_2)object).setPosition(0, n8);
            this.uii.ued.get(i).f(0, n8, 0, this.uii.uef, 0, 0, 0, 0);
            n8 -= this.uii.uef;
        }
        this.gsi();
        this.uii.tMh = false;
    }

    private void gsi() {
        if (this.uii.tMl) {
            int n = this.uii.gva();
            int n2 = n - this.uii.ncz.size();
            if (n2 > 0) {
                this.uii.tLZ.setEnabled(true);
                this.uii.tLZ.setButtonJump(1.0f / (float)n2);
                this.uii.tLZ.setSliderSize((float)this.uii.ncz.size() / (float)n);
            } else {
                this.uii.tLZ.setButtonJump(0.0f);
                this.uii.tLZ.setEnabled(false);
            }
        }
    }
}

