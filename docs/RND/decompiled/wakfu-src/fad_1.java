/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAD
 */
public class fad_1
extends faw_2
implements fyi_0,
fyo_0,
fyv_0,
fzd {
    public static final String TAG = "Button";
    protected fbt_1 mZy;
    protected fdz_1 tOU;
    protected faa_2 tCX;
    protected fzx_0 tOV;
    protected fzu_0 tOW;
    protected awx_1 cVs;
    protected boolean dGB = true;
    protected fis_1 tOX;
    protected fis_1 mTP;
    protected fis_1 tND;
    protected int tDu = -1;
    protected fsm_1 tOY;
    protected axb_2 ncL;
    public static final int tOZ = 3556653;
    public static final int tPa = 92903173;
    public static final int tPb = 3148879;
    public static final int tPc = -1156593849;
    public static final int tPd = 728975971;
    public static final int tPe = -1417816805;
    public static final int tPf = -549216856;
    public static final int tPg = -1466575902;
    public static final int tPh = 1714306019;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        } else if (fhv_12 instanceof fdz_1) {
            this.setLabel((fdz_1)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof fbt_1) {
            if (this.mZy != null && this.mZy != fhv_12) {
                this.mZy.gAD();
            }
            this.mZy = (fbt_1)fhv_12;
            if (this.tOY != null) {
                this.mZy.setId("buttonImage");
                this.mZy.setDisplaySize(this.tOY);
            }
        }
        super.e(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fzx_0 getPixmapAlign() {
        return this.tOV;
    }

    public void setPixmapAlign(fzx_0 fzx_02) {
        this.tOV = fzx_02;
        this.gsm();
    }

    public fsm_1 getDisplaySize() {
        return this.tOY;
    }

    public void setDisplaySize(fsm_1 fsm_12) {
        this.tOY = fsm_12;
        if (this.mZy != null) {
            this.mZy.setDisplaySize(this.tOY);
        }
    }

    public fzu_0 getTextOrientation() {
        return this.tOW;
    }

    public void setTextOrientation(fzu_0 fzu_02) {
        this.tOW = fzu_02;
        if (this.tOU != null) {
            this.tOU.setOrientation(fzu_02);
        }
    }

    @Override
    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public void setLabel(fdz_1 fdz_12) {
        if (fdz_12 != this.tOU && this.tOU != null) {
            this.tOU.gAD();
            this.tOU = fdz_12;
        } else if (this.tOU == null) {
            this.tOU = fdz_12;
        }
        if (this.tOU != null) {
            this.tOU.setOrientation(this.tOW);
            this.tOU.setColor(this.getAppearance().getTextColor(), null);
            this.tOU.setFont(this.getAppearance().getFont());
            faa_2 faa_22 = this.getDefaultLabelAlignment();
            if (faa_22 != null) {
                this.tOU.setAlign(faa_22);
            }
        }
    }

    @Nullable
    protected faa_2 getDefaultLabelAlignment() {
        return faa_2.tLO;
    }

    public void setText(String string) {
        if (string == null || string.isEmpty()) {
            if (this.tOU != null) {
                this.m((fhv_1)this.tOU);
                this.tOU = null;
            }
            return;
        }
        if (this.tOU == null) {
            this.tOU = new fbv_2();
            this.tOU.aVI();
            this.d(this.tOU);
        }
        this.tOU.setText(string);
    }

    public String getText() {
        if (this.tOU != null) {
            return this.tOU.getText();
        }
        return "";
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.gsv();
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.gsv();
    }

    private void gsv() {
        if (this.isEnabledFull()) {
            this.getAppearance().gqW();
        } else {
            this.getAppearance().gqV();
        }
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb) {
            return null;
        }
        if (this.bmg && !this.ukD && this.getAppearance().gE(n, n2) && !fbj_1.getInstance().isMovePointMode()) {
            return this;
        }
        return null;
    }

    @Override
    public fym_0 getAppearance() {
        return (fym_0)this.uki;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fym_0;
    }

    public void setTexture(awk_1 awk_12) {
        fze fze2 = null;
        if (awk_12 != null) {
            fze2 = fze.checkOut();
            fze2.setTexture(awk_12);
        }
        this.setPixmap(fze2);
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.mZy != null) {
            this.mZy.setModulationColor(axb_22);
        } else {
            this.ncL = axb_22;
        }
    }

    @Override
    public axb_2 getModulationColor() {
        if (this.mZy != null) {
            return this.mZy.getModulationColor();
        }
        return this.ncL;
    }

    @Override
    public void setPixmap(fze fze2) {
        if (fze2 != null) {
            if (this.mZy == null) {
                this.mZy = new fbt_1();
                this.mZy.aVI();
                if (this.tOY != null) {
                    this.mZy.setDisplaySize(this.tOY);
                }
                this.d(this.mZy);
            }
            this.mZy.setPixmap(fze2);
            if (this.ncL != null) {
                this.mZy.setModulationColor(this.ncL);
                this.ncL = null;
            }
        } else if (this.mZy != null) {
            this.mZy.gAD();
            this.mZy = null;
        }
    }

    @Override
    public void setFocusable(boolean bl) {
        super.setFocusable(bl);
        if (this.ukJ && this.tOX == null) {
            this.tOX = new fae_2(this);
            this.a(fzq_0.tJF, this.tOX, false);
        } else if (!this.ukJ && this.tOX != null) {
            this.b(fzq_0.tJF, this.tOX, false);
            this.tOX = null;
        }
    }

    @Override
    public void setFont(awx_1 awx_12) {
        if (this.tOU != null) {
            this.tOU.setFont(awx_12);
        }
        this.cVs = awx_12;
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (this.tOU != null && (string == null || string.equalsIgnoreCase("text"))) {
            this.tOU.setColor(axb_22, null);
        }
    }

    public void setClickSoundId(int n) {
        this.tDu = n;
    }

    public int getClickSoundId() {
        return this.tDu;
    }

    @Override
    protected void b(fiq_1 fiq_12, boolean bl) {
        if (!fiq_12.gBF()) {
            block0 : switch (fiq_12.gBy()) {
                case tJU: 
                case tJV: 
                case tJB: 
                case tJC: {
                    fiq_12.oZ(true);
                    switch (this.tDu) {
                        case -1: {
                            fhy_2.gBq().eHP();
                            break block0;
                        }
                        case -2: {
                            fhy_2.gBq().eHQ();
                            break block0;
                        }
                        case -3: {
                            break block0;
                        }
                    }
                    fhy_2.gBq().nW(this.tDu);
                    break;
                }
                case tJQ: {
                    fhy_2.gBq().eHV();
                    fiq_12.oZ(true);
                }
            }
        }
    }

    public void gsw() {
        this.ar(1, 1, 0);
    }

    public void ar(int n, int n2, int n3) {
        this.getAppearance().gqT();
        abb_2.bUA().a(new fai_2(this, n, n2, n3, this.getScreenX() + this.ukt.width / 2, this.getScreenY() + this.ukt.height / 2), 200L, 0, 1L);
    }

    @Override
    public void eKI() {
        super.eKI();
    }

    @Override
    public boolean h(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJQ) {
            this.getAppearance().gqR();
        } else if (fiq_12.gBy() == fzq_0.tJR) {
            this.getAppearance().gqS();
        }
        return super.h(fiq_12);
    }

    public void gsx() {
        this.mTP = new faf_2(this);
        fbj_1.getInstance().a(fzq_0.tJT, this.mTP, false);
        this.tND = new fag_1(this);
        this.a(fzq_0.tJS, this.tND, false);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.mZy = null;
        this.tOU = null;
        this.tOY = null;
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.tND = null;
        this.mTP = null;
        this.tOX = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fym_0 fym_02 = fym_0.checkOut();
        fym_02.setWidget(this);
        this.d(fym_02);
        faj_2 faj_22 = new faj_2(this);
        faj_22.aVI();
        this.a(faj_22);
        this.ukD = false;
        this.tCX = faa_2.tLO;
        this.tOV = fzx_0.tLt;
        this.tOW = fzu_0.tKE;
        this.tDu = -1;
        this.setCursorType(fzo_0.tHr);
        this.gsx();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.dGB) {
            this.bFM();
            this.dGB = false;
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fad_1 fad_12 = (fad_1)fhi_22;
        super.a(fad_12);
        fad_12.tCX = this.tCX;
        fad_12.tOV = this.tOV;
        fad_12.tOW = this.tOW;
        fad_12.tDu = this.tDu;
        fad_12.setDisplaySize(this.tOY != null ? (fsm_1)this.tOY.clone() : null);
        fad_12.b(fzq_0.tJS, this.tND, false);
        if (this.tOX != null) {
            fad_12.b(fzq_0.tJF, this.tOX, false);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3556653) {
            this.setText(fic_12.a(string, this.nQt));
        } else if (n == 92903173) {
            this.setAlign(fic_12.b(faa_2.class, string));
        } else if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == 3148879) {
            this.setFont(fic_12.vq(string));
        } else if (n == 728975971) {
            this.setTextOrientation(fic_12.b(fzu_0.class, string));
        } else if (n == -1417816805) {
            this.setTexture(fic_12.vp(string));
        } else if (n == -549216856) {
            this.setPixmapAlign(fic_12.b(fzx_0.class, string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Bw.m(string));
        } else if (n == 1714306019) {
            this.setDisplaySize(fic_12.vn(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            if (object == null) {
                this.setText(null);
            } else {
                this.setText(String.valueOf(object));
            }
        } else if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == 3148879) {
            this.setFont((awx_1)object);
        } else if (n == 728975971) {
            this.setTextOrientation((fzu_0)((Object)object));
        } else if (n == -1417816805) {
            this.setTexture((awk_1)object);
        } else if (n == -549216856) {
            this.setPixmapAlign((fzx_0)((Object)object));
        } else if (n == 1714306019) {
            this.setDisplaySize((fsm_1)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

