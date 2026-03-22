/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fCJ
 */
public class fcj_2
extends faw_2 {
    private static Logger oO = Logger.getLogger(fcj_2.class);
    public static final String TAG = "ScrollBar";
    public static final String tZS = "horizontalSlider";
    public static final String tZT = "verticalSlider";
    public static final String tZU = "horizontalIncreaseButton";
    public static final String tZV = "verticalIncreaseButton";
    public static final String tZW = "horizontalDecreaseButton";
    public static final String tZX = "verticalDecreaseButton";
    private static final int tZY = 0;
    private static final int tZZ = 1;
    private static final int uaa = 2;
    int uab;
    private fis_1 uac;
    private fis_1 nay;
    private fis_1 uad;
    private fis_1 uae;
    final fcp_1 uaf = new fcp_1(this);
    boolean tMi;
    float uag = 0.05f;
    fad_1 uah;
    fad_1 uai;
    fcz_2 uaj;
    @Nullable
    fsm_1 uak = null;
    public static final int ual = 1387629604;
    public static final int uam = 358262400;
    public static final int uan = 111972721;
    public static final int uao = -695376203;

    @Override
    public String getTag() {
        return TAG;
    }

    public float getValue() {
        return this.uaj.getValue();
    }

    public void setValue(float f2) {
        this.uaj.setValue(f2);
    }

    public float getButtonJump() {
        return this.uag;
    }

    public void setButtonJump(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.uag = f2;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
        this.uaj.setHorizontal(bl);
    }

    public fcz_2 getSlider() {
        return this.uaj;
    }

    public void setSlider(fcz_2 fcz_22) {
        this.uaj = fcz_22;
    }

    public void setSliderSize(float f2) {
        this.uaj.setSliderSize(f2);
        boolean bl = f2 != 1.0f;
        this.uaj.getButton().setVisible(bl);
        this.uah.setEnabled(bl);
        this.uai.setEnabled(bl);
    }

    public fad_1 getDecreaseButton() {
        return this.uai;
    }

    public void setDecreaseButton(fad_1 fad_12) {
        this.uai = fad_12;
    }

    public void setIncreaseButton(fad_1 fad_12) {
        this.uah = fad_12;
    }

    public fad_1 getIncreaseButton() {
        return this.uah;
    }

    public void setSliderMinDimension(@Nullable fsm_1 fsm_12) {
        if (this.uak == fsm_12) {
            return;
        }
        this.uak = fsm_12;
        this.gsm();
    }

    @Nullable
    public fsm_1 getSliderMinDimension() {
        return this.uak;
    }

    public float getSliderMinSize() {
        return this.uaj.getSliderMinSize();
    }

    public void setSliderMinSize(float f2) {
        this.uaj.setSliderMinSize(f2);
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (this.tMi || bl) {
            if (tZS.equalsIgnoreCase(string)) {
                return this.uaj;
            }
            if (tZW.equalsIgnoreCase(string)) {
                return this.uai;
            }
            if (tZU.equalsIgnoreCase(string)) {
                return this.uah;
            }
        }
        if (!this.tMi || bl) {
            if (tZT.equalsIgnoreCase(string)) {
                return this.uaj;
            }
            if (tZX.equalsIgnoreCase(string)) {
                return this.uai;
            }
            if (tZV.equalsIgnoreCase(string)) {
                return this.uah;
            }
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.uah.setEnabled(bl);
        this.uai.setEnabled(bl);
        this.uaj.setEnabled(bl);
        this.uaj.setVisible(this.uaj.isEnabledFull());
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.uah.setNetEnabled(bl);
        this.uai.setNetEnabled(bl);
        this.uaj.setNetEnabled(bl);
        this.uaj.setVisible(this.isEnabledFull());
    }

    public void gui() {
        int n = 0;
        int n2 = 0;
        if (this.tMi) {
            this.uai.setPosition(n, n2);
            this.uaj.setPosition(n + this.uai.getWidth(), n2);
            n = this.getAppearance().getContentWidth() - this.uai.getWidth();
            this.uah.setPosition(n, n2);
        } else {
            n2 = this.getAppearance().getContentHeight() - this.uah.getHeight();
            this.uah.setPosition(n, n2);
            n2 = 0;
            this.uai.setPosition(n, n2);
            this.uaj.setPosition(n, n2 + this.uai.getHeight());
        }
    }

    void guj() {
        if (this.uab != 0) {
            abb_2.bUA().b(this.uaf);
            abb_2.bUA().a(this.uaf, 150L, this.uab, 1L);
        }
    }

    public void guk() {
        this.uac = new fck_2(this);
        this.nay = new fcl_1(this);
        this.uad = new fcm_1(this);
        this.uae = new fcn_1(this);
        fbj_1.getInstance().a(fzq_0.tJT, this.uac, false);
        this.a(fzq_0.tJU, this.nay, false);
        this.uah.a(fzq_0.tJR, this.uac, false);
        this.uah.a(fzq_0.tJS, this.uad, false);
        this.uah.a(fzq_0.tJQ, this.uad, false);
        this.uai.a(fzq_0.tJR, this.uac, false);
        this.uai.a(fzq_0.tJS, this.uae, false);
        this.uai.a(fzq_0.tJQ, this.uae, false);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uah = null;
        this.uai = null;
        this.uaj = null;
        fbj_1.getInstance().b(fzq_0.tJT, this.uac, false);
    }

    @Override
    public void aVI() {
        super.aVI();
        fco_2 fco_22 = new fco_2(this);
        fco_22.aVI();
        this.a(fco_22);
        this.uah = new fad_1();
        this.uah.aVI();
        this.uah.setCanBeCloned(false);
        this.uah.setClickSoundId(fhy_2.gBq().eHY());
        this.uai = new fad_1();
        this.uai.aVI();
        this.uai.setCanBeCloned(false);
        this.uai.setClickSoundId(fhy_2.gBq().eHX());
        this.uaj = new fcz_2();
        this.uaj.aVI();
        this.uaj.setCanBeCloned(false);
        this.ukD = false;
        this.uak = null;
        this.d(this.uai);
        this.d(this.uah);
        this.d(this.uaj);
        this.guk();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcj_2 fcj_22 = (fcj_2)fhi_22;
        super.a(fcj_22);
        fcj_22.tMi = this.tMi;
        fcj_22.uag = this.uag;
        fcj_22.setSliderMinDimension(this.getSliderMinDimension());
        fcj_22.b(fzq_0.tJU, this.nay, false);
        fcj_22.getIncreaseButton().b(fzq_0.tJQ, this.uad, false);
        fcj_22.getIncreaseButton().b(fzq_0.tJS, this.uad, false);
        fcj_22.getIncreaseButton().b(fzq_0.tJR, this.uac, false);
        fcj_22.getDecreaseButton().b(fzq_0.tJQ, this.uae, false);
        fcj_22.getDecreaseButton().b(fzq_0.tJS, this.uae, false);
        fcj_22.getDecreaseButton().b(fzq_0.tJR, this.uac, false);
        fcj_22.ukM = true;
        fcj_22.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return switch (n) {
            case 1387629604 -> {
                this.setHorizontal(Bw.aK(string));
                yield true;
            }
            case 358262400 -> {
                this.setButtonJump(Bw.o(string));
                yield true;
            }
            case 111972721 -> {
                this.setValue(Bw.o(string));
                yield true;
            }
            case -695376203 -> {
                this.setSliderMinDimension(fic_12.vn(string));
                yield true;
            }
            default -> super.setXMLAttribute(n, string, fic_12);
        };
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return switch (n) {
            case 1387629604 -> {
                this.setHorizontal(Bw.l(object));
                yield true;
            }
            case 358262400 -> {
                this.setButtonJump(Bw.o(object));
                yield true;
            }
            case 111972721 -> {
                this.setValue(Bw.o(object));
                yield true;
            }
            case -695376203 -> {
                this.setSliderMinDimension((fsm_1)object);
                yield true;
            }
            default -> super.setPropertyAttribute(n, object);
        };
    }
}

