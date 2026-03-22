/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDt
 */
public class fdt_2
extends frs_1 {
    final /* synthetic */ fdq_1 ueJ;

    public fdt_2(fdq_1 fdq_12) {
        this.ueJ = fdq_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        int n = 0;
        int n2 = 0;
        int n3 = this.ueJ.jLZ == null ? 0 : this.ueJ.jLZ.size();
        int n4 = 1;
        if (this.ueJ.tQy >= 0 || this.ueJ.ueg >= 0) {
            n4 = GC.a(n3, this.ueJ.ueg, this.ueJ.tQy);
        }
        for (int i = this.ueJ.udY.size() - 1; i >= 0; --i) {
            n2 += this.ueJ.udY.get(i).getCellWidth();
            fad_1 fad_12 = this.ueJ.nam.get(i);
            if (fad_12 != null) {
                n = Math.max(n, fad_12.getPrefSize().height);
                continue;
            }
            fdq_1.aGh().warn((Object)"Un bouton de colonne n'a pas \u00e9t\u00e9 initialis\u00e9 correctement");
        }
        fsm_1 fsm_12 = this.ueJ.tLZ.getPrefSize();
        switch (this.ueJ.tMu) {
            case tHc: {
                break;
            }
            case tHb: {
                n2 += fsm_12.width;
                break;
            }
            case tHa: {
                if (n4 >= n3) break;
                n2 += fsm_12.width;
            }
        }
        return new fsm_1(n2, n += this.ueJ.uef * n4);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n;
        int n2;
        int n3;
        int n4;
        fgm_2 fgm_22;
        int n5;
        this.ueJ.tMh = true;
        int n6 = faw_22.getAppearance().getContentHeight();
        int n7 = this.ueJ.udY.size();
        if (n7 == 0) {
            return;
        }
        int n8 = n6 / this.ueJ.uef;
        int n9 = this.ueJ.ncz.size() / n7;
        if (n8 > n9) {
            this.ueJ.ncz.ensureCapacity(n7 * n8);
            this.ueJ.ued.ensureCapacity(n8);
            for (n5 = n9; n5 < n8; ++n5) {
                fle_1 fle_12 = new fle_1();
                fle_12.aVI();
                this.ueJ.ued.add(fle_12);
                for (int i = 0; i < n7; ++i) {
                    fgm_22 = this.ueJ.udY.get(i);
                    fcv_1 fcv_12 = this.ueJ.gsk();
                    fcv_12.setRendererManager(fgm_22.getRendererManager());
                    this.ueJ.r(fcv_12);
                }
            }
        } else if (n8 < n9) {
            Object object;
            int n10;
            n5 = n7 * (n9 - n8);
            for (n10 = n5 - 1; n10 >= 0; --n10) {
                object = this.ueJ.ncz.remove(this.ueJ.ncz.size() - 1);
                if (object == this.ueJ.tMw) {
                    this.ueJ.tMw = null;
                }
                this.ueJ.m((fhv_1)object);
            }
            for (n10 = n9 - n8 - 1; n10 >= 0; --n10) {
                object = this.ueJ.ued.remove(this.ueJ.ued.size() - 1);
                ((flk_1)object).aVH();
            }
        }
        n5 = 0;
        for (n4 = this.ueJ.udY.size() - 1; n4 >= 0; --n4) {
            fad_1 fad_12 = this.ueJ.nam.get(n4);
            if (fad_12 != null) {
                n5 = Math.max(n5, fad_12.getPrefSize().height);
                continue;
            }
            fdq_1.aGi().warn((Object)"Un bouton de colonne n'a pas \u00e9t\u00e9 initialis\u00e9 correctement");
        }
        n4 = 0;
        for (n3 = 0; n3 < n7; ++n3) {
            fgm_22 = this.ueJ.udY.get(n3);
            int n11 = fgm_22.getCellWidth();
            int n12 = n6 - n5;
            fad_1 fad_13 = this.ueJ.nam.get(n3);
            fad_13.setSize(n11, n5);
            fad_13.setPosition(n4, n12);
            n12 -= this.ueJ.uef;
            for (int i = 0; i < n8; ++i) {
                fcv_1 fcv_13 = this.ueJ.getRenderableByPosition(i, n3);
                if (fcv_13 == null) {
                    fdq_1.aGj().warn((Object)("Impossible de trouver un renderableContainer \u00e0 la ligne " + i + " et \u00e0 la colonne " + n3));
                    continue;
                }
                fcv_13.setSize(n11, this.ueJ.uef);
                fcv_13.setPosition(n4, n12);
                n12 -= this.ueJ.uef;
            }
            n4 += n11;
        }
        n3 = n6 - n5 - this.ueJ.uef;
        for (n2 = 0; n2 < n8; ++n2) {
            this.ueJ.ued.get(n2).f(0, n3, n4, this.ueJ.uef, 0, 0, 0, 0);
            n3 -= this.ueJ.uef;
        }
        switch (this.ueJ.tMu) {
            case tHc: {
                this.ueJ.tMl = false;
                break;
            }
            case tHb: {
                this.ueJ.tMl = true;
                break;
            }
            case tHa: {
                boolean bl = this.ueJ.tMl = this.ueJ.jLZ.size() > this.ueJ.ncz.size() / this.ueJ.udY.size();
            }
        }
        if (this.ueJ.tMl) {
            this.ueJ.tLZ.setVisible(true);
            n2 = this.ueJ.tLZ.getPrefSize().width;
            this.ueJ.tLZ.setSize(n2, n6);
            this.ueJ.tLZ.setPosition(n4, 0);
        } else {
            this.ueJ.tLZ.setVisible(false);
        }
        this.gsi();
        n2 = this.ueJ.jLZ.size() - n8;
        int n13 = n = n2 < 0 ? 0 : GC.a(this.ueJ.crT, 0, n2);
        if (n != this.ueJ.crT) {
            this.ueJ.setOffset(n);
        }
        if (n8 != n9) {
            this.ueJ.setValuesDirty();
        }
        this.ueJ.tMh = false;
    }

    private void gsi() {
        if (this.ueJ.tMl) {
            int n = this.ueJ.jLZ.size() - this.ueJ.ncz.size() / this.ueJ.udY.size();
            if (n > 0) {
                this.ueJ.tLZ.setEnabled(true);
                this.ueJ.tLZ.setButtonJump(1.0f / (float)n);
                this.ueJ.tLZ.setSliderSize((float)(this.ueJ.ncz.size() / this.ueJ.udY.size()) / (float)this.ueJ.jLZ.size());
            } else {
                this.ueJ.tLZ.setButtonJump(0.0f);
                this.ueJ.tLZ.setEnabled(false);
            }
        }
    }
}

