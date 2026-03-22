/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fAS
 */
public class fas_1
extends fay_1<Object>
implements fiz_1 {
    public static final String TAG = "ComboBoxPlus";
    public static final String tQr = "ComboBox";
    public static final String tQs = "renderable";
    public static final String tQt = "list";
    public static final String tQu = "button";
    private boolean tQv = false;
    private boolean tQw = true;
    private fbz_2 nGl = null;
    fcv_1 nca = null;
    fad_1 tQx = null;
    private int tQy = -1;
    private fza_0 tQz = fza_0.tGr;
    private final fis_1 tQA = fiq_12 -> {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (this.tQv) {
            if (this.uki == null) {
                return true;
            }
            if (this.uki.gE(flp_22.x(this), flp_22.y(this))) {
                return true;
            }
            fza fza2 = this.nGl.getAppearance();
            if (fza2 == null) {
                return true;
            }
            if (!fza2.gE(flp_22.x(this.nGl), flp_22.y(this.nGl))) {
                this.gsH();
                return true;
            }
        }
        return false;
    };
    private final fis_1 tQB = fiq_12 -> {
        flp_2 flp_22 = (flp_2)fiq_12;
        if (!this.tQw && this.tQv) {
            fcj_2 fcj_22 = this.nGl.getScrollBar();
            if (fcj_22 == null) {
                return true;
            }
            fcz_2 fcz_22 = fcj_22.getSlider();
            if (fcz_22 == null) {
                return true;
            }
            fiq_1 fiq_13 = flp_22.gBG();
            if (fiq_13 == null) {
                return true;
            }
            if (fcz_22.getButton() != fiq_13.gBE()) {
                if (this.tQz.grC()) {
                    this.gsH();
                }
                return true;
            }
        }
        if (this.tQw) {
            this.tQw = false;
        }
        return false;
    };
    private final fis_1 tQC = fiq_12 -> {
        if (this.tQz.grB() && this.isEnabledFull()) {
            this.gsG();
        }
        return false;
    };
    private final fis_1 tQD = fiq_12 -> {
        flk_2 flk_22 = (flk_2)fiq_12;
        if (this.tQz.grC() && flk_22.bqr()) {
            this.setSelectedValue(flk_22.getValue());
            this.gsH();
        }
        flk_2 flk_23 = new flk_2(this, flk_22.gDZ(), flk_22.getValue(), flk_22.wp(), flk_22.bqr());
        this.h(flk_23);
        return false;
    };
    private final fis_1 tQE = fiq_12 -> {
        if (this.isEnabledFull() && this.tQz.grB()) {
            this.b(fzy_0.tGe);
        }
        return false;
    };
    private final fis_1 tQF = fiq_12 -> {
        if (this.isEnabledFull() && this.tQz.grB()) {
            this.b(fzy_0.tGe);
        }
        return false;
    };
    private final fis_1 tQG = fiq_12 -> {
        if (this.isEnabledFull() && this.tQz.grB()) {
            this.b(fzy_0.tGg);
        }
        return false;
    };
    private final fis_1 tQH = fiq_12 -> {
        if (this.isEnabledFull() && this.tQz.grB()) {
            this.b(fzy_0.tGg);
        }
        return false;
    };
    private final fis_1 tQI = fiq_12 -> {
        if (this.isEnabledFull() && this.tQz.grB()) {
            this.b(fzy_0.tGa);
        }
        return false;
    };
    private String tMB = null;
    private fhs_2 tMC = null;
    private faa_2 tCX = faa_2.tLR;
    private faa_2 tQJ = faa_2.tLL;
    private boolean tQK = true;
    public static final int tQL = 844056925;
    public static final int tQM = "selectedValue".hashCode();
    public static final int tQN = 92903173;
    public static final int tQO = 1905963320;
    public static final int tQP = -406349635;
    public static final int tQQ = 907928063;

    @Override
    public void d(fhv_1 fhv_12) {
        boolean bl = true;
        if (fhv_12 instanceof fbz_2) {
            if (this.nGl != null) {
                this.nGl.aZp();
            }
            bl = false;
            this.nGl = (fbz_2)fhv_12;
            this.nGl.setModalLevel((short)30000);
            this.ar(this.nGl);
        } else if (fhv_12 instanceof fcv_1) {
            if (this.nca != null) {
                this.nca.aZp();
            }
            this.nca = (fcv_1)fhv_12;
        } else if (fhv_12 instanceof fad_1) {
            if (this.tQx != null) {
                this.tQx.gAD();
            }
            this.tQx = (fad_1)fhv_12;
        }
        if (bl) {
            super.d(fhv_12);
        }
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (tQs.equalsIgnoreCase(string)) {
            if (this.nca != null) {
                return this.nca;
            }
        } else if (tQt.equalsIgnoreCase(string)) {
            if (this.nGl != null) {
                return this.nGl;
            }
        } else if (tQu.equalsIgnoreCase(string)) {
            return this.tQx;
        }
        return null;
    }

    @Override
    public fyr_0 getAppearance() {
        return (fyr_0)this.uki;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fad_1 getButton() {
        return this.tQx;
    }

    public fbz_2 getList() {
        return this.nGl;
    }

    public int getMaxRows() {
        return this.tQy;
    }

    public void setMaxRows(int n) {
        this.tQy = n;
    }

    @Override
    public @Unmodifiable @NotNull List<fhv_1> getIndirectChildren() {
        ArrayList<fhv_1> arrayList = new ArrayList<fhv_1>(super.getIndirectChildren());
        if (this.nGl != null) {
            arrayList.add(this.nGl);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Object getSelectedValue() {
        if (this.nGl != null) {
            return this.nGl.getSelectedValue();
        }
        return null;
    }

    public void setSelectedValue(Object object) {
        if (object == null) {
            return;
        }
        if (this.nGl != null) {
            this.nGl.setSelectedValue(object);
            Object object2 = this.nGl.getSelectedValue();
            if (object != object2 && !object.equals(object2) && object2 != null) {
                uxJ.warn((Object)("Impossible de retrouver la valeur s\u00e9lectionn\u00e9e dans la liste - il faut appliquer l'attribut content AVANT selectedValue - " + String.valueOf(object) + " - " + String.valueOf(object2)));
            }
            this.setRenderableContent(object2, -1);
        }
    }

    public fcv_1 getRenderable() {
        return this.nca;
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    private void setRenderableContent(Object object, int n) {
        if (this.nca != null) {
            Object object2;
            int n2 = 0;
            if (this.nGl != null) {
                object2 = this.nGl.getSelectedValue();
                n2 = this.nGl.getSelectedOffset();
            } else {
                object2 = object;
                if (n != -1) {
                    n2 = n;
                }
            }
            if (object2 != null) {
                this.nca.setContentProperty(this.tMB + "#" + n2, this.tMC);
            }
            this.nca.setContent(object2);
        }
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        boolean bl2 = true;
        Object object = null;
        if (this.nGl != null) {
            this.nGl.setContentProperty(this.tMB, this.tMC);
            this.nGl.setContent(iterable);
            if (!this.nGl.aJG() && this.nGl.getSelectedValue() == null) {
                bl2 = false;
                object = this.nGl.getItems().get(0);
                this.nGl.setSelectedOffset(0);
            }
        }
        Object object2 = null;
        int n = -1;
        if (!bl2) {
            object2 = object;
            n = 0;
        }
        this.setRenderableContent(object2, n);
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        if (this.nGl != null) {
            return this.nGl.getUnfilteredContent();
        }
        return Collections.emptyList();
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tQJ = faa_22;
        }
    }

    public void setAlign(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tCX = faa_22;
        }
    }

    public void setKeepPreviousStateOnMissingState(boolean bl) {
        this.tQK = bl;
    }

    public boolean isKeepPreviousStateOnMissingState() {
        return this.tQK;
    }

    @Override
    public void eKI() {
        super.eKI();
        this.setFocusable(true);
    }

    public void setBehaviour(fza_0 fza_02) {
        this.tQz = fza_02;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        if (this.tQx != null) {
            this.tQx.setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        if (this.tQx != null) {
            this.tQx.setNetEnabled(bl);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        if (this.tQx != null) {
            this.tQx.setVisible(this.tQz.grD());
        }
    }

    private void gsD() {
        this.a(fzq_0.tJU, this.tQC, false);
    }

    private void c(fbj_1 fbj_12) {
        fbj_12.a(fzq_0.tJS, this.tQA, false);
        fbj_12.a(fzq_0.tJT, this.tQB, false);
    }

    private void ar(fbz_2 fbz_22) {
        fbz_22.a(fzq_0.tJI, this.tQD, false);
    }

    private void gsE() {
        this.a(fzq_0.tJS, this.tQE, false);
        this.a(fzq_0.tJU, this.tQF, false);
        this.a(fzq_0.tJT, this.tQG, false);
        this.a(fzq_0.tJQ, this.tQH, false);
        this.a(fzq_0.tJR, this.tQI, false);
    }

    private void gsF() {
        this.b(fzq_0.tJS, this.tQE, false);
        this.b(fzq_0.tJU, this.tQF, false);
        this.b(fzq_0.tJT, this.tQG, false);
        this.b(fzq_0.tJQ, this.tQH, false);
        this.b(fzq_0.tJR, this.tQI, false);
    }

    public void gsG() {
        if (this.tQv) {
            this.gsH();
        } else {
            this.gsI();
        }
    }

    private void gsH() {
        if (this.tQv) {
            this.nGl.gAC();
            this.tQv = false;
            fhy_2.gBq().eHS();
        }
    }

    private void gsI() {
        if (!this.tQv) {
            fsm_1 fsm_12 = this.nGl.getIdealSize(this.tQy, -1);
            int n = fsm_12.height;
            int n2 = this.getDisplayY();
            fbj_1 fbj_12 = fbj_1.getInstance();
            faa_2 faa_22 = this.tCX;
            faa_2 faa_23 = this.tQJ;
            int n3 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n);
            if (n3 < 0 || n3 > fbj_12.getAppearance().getContentHeight() - n) {
                faa_22 = faa_22.gse();
                faa_23 = faa_23.gse();
            }
            n3 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n);
            n3 = Math.max(0, Math.min(n3, fbj_12.getAppearance().getContentHeight() - n));
            if (n2 - n < 0 && n2 + this.getHeight() + n > fbj_12.getHeight()) {
                n = n2;
                n3 = 0;
            }
            this.nGl.setSizeToPrefSize();
            int n4 = Math.max(this.nGl.getWidth(), this.getWidth());
            this.nGl.setSize(n4, n);
            this.nGl.setPosition(this.getDisplayX(), n3);
            this.nGl.setNonBlocking(false);
            fbj_12.getLayeredContainer().d(this.nGl, 29500);
            this.tQv = true;
            this.tQw = true;
            fhy_2.gBq().eHR();
        }
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fyr_0;
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJS, this.tQA, false);
        fbj_1.getInstance().b(fzq_0.tJT, this.tQB, false);
        this.gsF();
        this.tCX = null;
        this.tQJ = null;
        this.nGl.gAD();
        this.tQx = null;
        this.nGl = null;
        this.nca = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fat_1 fat_12 = new fat_1(this);
        fat_12.aVI();
        this.a(fat_12);
        fyr_0 fyr_02 = new fyr_0();
        fyr_02.aVI();
        fyr_02.setWidget(this);
        this.d(fyr_02);
        this.tQz = fza_0.tGr;
        this.tQK = true;
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        this.d(fad_12);
        this.nGl = new fbz_2();
        this.nGl.aVI();
        this.nca = new fcv_1();
        this.nca.aVI();
        this.ukD = false;
        this.gsD();
        this.gsE();
        this.c(fbj_1.getInstance());
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fas_1 fas_12 = (fas_1)fhi_22;
        super.a(fas_12);
        fas_12.tQz = this.tQz;
        fas_12.tQy = this.tQy;
        fas_12.tQK = this.tQK;
        fes_2 fes_22 = (fes_2)this.nGl.gAK();
        fes_22.ukM = false;
        fes_22.gAF();
        fas_12.d(fes_22);
        fas_12.b(fzq_0.tJS, this.tQA, false);
        fas_12.b(fzq_0.tJT, this.tQB, false);
        fas_12.b(fzq_0.tJU, this.tQC, false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 844056925) {
            this.setMaxRows(Bw.m(string));
        } else if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == -406349635) {
            this.setBehaviour(fic_12.b(fza_0.class, string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(faa_2.tI(string));
        } else if (n == 907928063) {
            this.setKeepPreviousStateOnMissingState(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 844056925) {
            this.setMaxRows(Bw.m(object));
        } else if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((faa_2)((Object)object));
        } else if (n == tQM) {
            this.setSelectedValue(object);
        } else if (n == 907928063) {
            this.setKeepPreviousStateOnMissingState(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

