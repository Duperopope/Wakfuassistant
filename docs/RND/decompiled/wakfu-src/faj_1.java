/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Point;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAj
 */
public abstract class faj_1
extends fdz_1
implements fgr_2 {
    private static final int tNB = 50;
    protected fis_1 mTP;
    private fis_1 tNC;
    private fis_1 tND;
    private fis_1 tNE;
    private fis_1 tNF;
    private fis_1 tNG;
    private fis_1 tNH;
    private fis_1 tNI;
    private fis_1 tNJ;
    private fis_1 tNK;
    private fis_1 tNL;
    private long tNM = 0L;
    protected boolean tNN = false;
    private boolean tNO = false;
    fgb_2 tNP = null;
    @NotNull
    private fzo_0 tNQ = fzo_0.tHP;
    @NotNull
    private fzo_0 tNR = fzo_0.tHq;
    @NotNull
    private fzo_0 tNS = fzo_0.tHz;
    @NotNull
    private fav_1 tNT = fav_1.tOo;
    private boolean tNU = false;
    public static final int tNV = -1655575466;
    public static final int tNW = -625591907;
    public static final int tNX = -470861862;
    public static final int tNY = 1102663846;
    public static final int tNZ = 400298193;
    public static final int tOa = 816974470;

    @Override
    public boolean isSelectable() {
        return this.getTextBuilder().isSelectable();
    }

    @Override
    public void setSelectable(boolean bl) {
        this.getTextBuilder().setSelectable(bl);
        this.setFocusable(bl);
        if (bl) {
            this.setCurrentCursorType(this.getSelectableCursorType(), fav_1.tOn);
        } else {
            this.setCurrentCursorType(this.getDefaultCursorType(), fav_1.tOo);
        }
    }

    @Override
    public boolean isSelectOnFocus() {
        return this.tNU;
    }

    @Override
    public void setSelectOnFocus(boolean bl) {
        this.tNU = bl;
    }

    @Override
    public boolean isEnableOnlySelectablePartInteraction() {
        return this.tNO;
    }

    @Override
    public void setEnableOnlySelectablePartInteraction(boolean bl) {
        this.tNO = bl;
    }

    @NotNull
    public fzo_0 getSelectableCursorType() {
        return this.tNQ;
    }

    public void setSelectableCursorType(@NotNull fzo_0 fzo_02) {
        if (fzo_02 == this.tNQ) {
            return;
        }
        this.tNQ = fzo_02;
        if (this.tNT == fav_1.tOn) {
            this.setCurrentCursorType(this.tNQ, fav_1.tOn);
        }
    }

    @NotNull
    public fzo_0 getDefaultCursorType() {
        return this.tNR;
    }

    public void setDefaultCursorType(@NotNull fzo_0 fzo_02) {
        if (fzo_02 == this.tNR) {
            return;
        }
        this.tNR = fzo_02;
        if (this.tNT == fav_1.tOo) {
            this.setCurrentCursorType(this.tNR, fav_1.tOo);
        }
    }

    @Override
    public void setCursorType(fzo_0 fzo_02) {
        this.setDefaultCursorType(fzo_02);
    }

    @Override
    public void setCurrentCursorType(fzo_0 fzo_02) {
        this.setCurrentCursorType(fzo_02, fav_1.tOq);
    }

    public void setCurrentCursorType(fzo_0 fzo_02, @NotNull fav_1 fav_12) {
        this.tNT = fav_12;
        super.setCurrentCursorType(fzo_02);
    }

    @NotNull
    public fav_1 getCurrentCursorSource() {
        return this.tNT;
    }

    @NotNull
    public fzo_0 getActionCursorType() {
        return this.tNS;
    }

    public void setActionCursorType(@NotNull fzo_0 fzo_02) {
        if (fzo_02 == this.tNS) {
            return;
        }
        this.tNS = fzo_02;
        if (this.tNT == fav_1.tOp) {
            this.setCurrentCursorType(this.tNS, fav_1.tOp);
        }
    }

    @Override
    @Nullable
    public fes_2 getWidget(int n, int n2) {
        this.tNP = null;
        if (this.uwb) {
            return null;
        }
        if (!this.bmg || this.ukD || !this.getAppearance().gE(n, n2) || fbj_1.getInstance().isMovePointMode()) {
            return null;
        }
        this.tNP = this.getContentBlockUnderMouse(n, n2);
        if (this.tNO && (this.tNP == null || this.tNP.gyV() != fgc_2.uuh || ((fgf_2)this.tNP).gzb() == null || ((fgf_2)this.tNP).gzb().getId() == null)) {
            return null;
        }
        return this;
    }

    public fgb_2 getBlockUnderMouse() {
        return this.tNP;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tNP = null;
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.tNC = null;
        this.tND = null;
        this.mTP = null;
        this.tNE = null;
        this.tNF = null;
        this.tNG = null;
        this.tNH = null;
        this.tNI = null;
        this.tNJ = null;
        this.tNK = null;
        this.tNL = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tNO = false;
        this.tNQ = fzo_0.tHP;
        this.tNR = fzo_0.tHq;
        this.tNS = fzo_0.tHz;
        this.tNT = fav_1.tOo;
        this.dKc();
    }

    public void dUA() {
        if (this.gxz()) {
            fgj_2 fgj_22 = this.getTextBuilder().gyh();
            if (fgj_22.aJG()) {
                this.getTextBuilder().gyk();
            }
            this.getTextBuilder().a(fgj_22.gzl(), 0);
            fgk_2 fgk_22 = fgj_22.gzm();
            this.getTextBuilder().b(fgk_22, fgk_22.aPs());
        }
    }

    Point getOrientedMouseCoodinates(flp_2 flp_22) {
        int n = 0;
        int n2 = 0;
        switch (this.getTextBuilder().getOrientation()) {
            case tKC: {
                n = flp_22.y(this) - this.uki.getBottomInset();
                n2 = this.ukt.width - flp_22.x(this) - this.uki.getLeftInset() - this.uki.getRightInset();
                break;
            }
            case tKE: {
                n = flp_22.x(this) - this.uki.getLeftInset();
                n2 = flp_22.y(this) - this.uki.getBottomInset();
                break;
            }
            case tKD: {
                n = this.ukt.height - flp_22.y(this) - this.uki.getBottomInset() - this.uki.getTopInset();
                n2 = flp_22.x(this) - this.uki.getLeftInset();
                break;
            }
            case tKF: {
                n = this.ukt.width - flp_22.x(this) - this.uki.getLeftInset() - this.uki.getRightInset();
                n2 = this.ukt.height - flp_22.y(this) - this.uki.getBottomInset() - this.uki.getTopInset();
            }
        }
        return new Point(n, n2);
    }

    protected void dKc() {
        this.tNC = new fak_1(this);
        this.a(fzq_0.tJA, this.tNC, false);
        this.mTP = new fan_1(this);
        fbj_1.getInstance().a(fzq_0.tJT, this.mTP, false);
        this.tNE = fiq_12 -> {
            this.dUA();
            return false;
        };
        this.a(fzq_0.tJV, this.tNE, false);
        this.tND = new fao_2(this);
        this.a(fzq_0.tJS, this.tND, false);
        this.tNF = new fap_1(this);
        this.a(fzq_0.tJO, this.tNF, false);
        this.tNG = new faq_1(this);
        this.a(fzq_0.tJQ, this.tNG, false);
        this.tNH = new far_2(this);
        this.a(fzq_0.tJM, this.tNH, false);
        this.tNI = new fas_2(this);
        this.a(fzq_0.tJR, this.tNI, false);
        this.tNJ = new fat_2(this);
        this.a(fzq_0.tJG, this.tNJ, true);
        this.tNK = new fau_1(this);
        this.a(fzq_0.tJF, this.tNK, true);
        this.tNL = new fal_2(this);
        this.a(fzq_0.tJH, this.tNL, true);
    }

    public fgb_2 getContentBlockUnderMouse(flp_2 flp_22) {
        if (flp_22.gBE() != this) {
            return null;
        }
        Point point = this.getOrientedMouseCoodinates(flp_22);
        return this.getContentBlockUnderMouse(point.x, point.y);
    }

    private fgb_2 getContentBlockUnderMouse(int n, int n2) {
        int n3 = n - this.getLeftMargin();
        int n4 = -(n2 - this.getBottomMargin());
        azx_1<fgb_2, fgz_1> azx_12 = this.getTextBuilder().gY(n3, n4);
        return azx_12 == null ? null : azx_12.getFirst();
    }

    protected void a(fle_2 fle_22) {
        long l = this.tNM = fle_22.gDO() ? System.currentTimeMillis() : 0L;
        if (!fle_22.gDO()) {
            this.getTextBuilder().gyF();
        }
    }

    protected void a(fgb_2 fgb_22, int n) {
        if (this.tNN) {
            this.dUA();
            this.tNM = 0L;
            this.tNN = false;
        }
    }

    protected void b(fgb_2 fgb_22, int n) {
        boolean bl = this.tNN = this.tNU && System.currentTimeMillis() - this.tNM < 50L;
        if (!this.tNN && this.gxz()) {
            this.getTextBuilder().a(fgb_22.gyW(), fgb_22.In() + n);
            this.getTextBuilder().b(fgb_22.gyW(), fgb_22.In() + n);
        }
    }

    protected void c(fgb_2 fgb_22, int n) {
        this.tNM = 0L;
        this.tNN = false;
        if (this.gxz()) {
            this.getTextBuilder().b(fgb_22.gyW(), fgb_22.In() + n);
        }
    }

    protected boolean a(fli_2 fli_22) {
        return false;
    }

    protected boolean b(fli_2 fli_22) {
        switch (fli_22.bCC()) {
            case 37: {
                if (fli_22.gDR() || fli_22.gDS() || fli_22.gDU()) {
                    return true;
                }
                if (fli_22.gDQ()) {
                    this.y(true, fli_22.gDT());
                    return false;
                }
                this.getTextBuilder().gyJ();
                if (!fli_22.gDT()) {
                    this.getTextBuilder().gyl();
                }
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 39: {
                if (fli_22.gDR() || fli_22.gDS() || fli_22.gDU()) {
                    return true;
                }
                if (fli_22.gDQ()) {
                    this.y(false, fli_22.gDT());
                    return false;
                }
                this.getTextBuilder().gyI();
                if (!fli_22.gDT()) {
                    this.getTextBuilder().gyl();
                }
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 38: 
            case 40: {
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 36: {
                this.getTextBuilder().gyK();
                if (!fli_22.gDT()) {
                    this.getTextBuilder().gyl();
                }
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 35: {
                this.getTextBuilder().gyL();
                if (!fli_22.gDT()) {
                    this.getTextBuilder().gyl();
                }
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
            case 67: {
                if (!fli_22.gDQ()) break;
                if (!this.getTextBuilder().gyh().isPassword()) {
                    this.gsp();
                }
                fbj_1.getInstance().setKeyEventConsumed(true);
                return false;
            }
        }
        return true;
    }

    private void y(boolean bl, boolean bl2) {
        fgj_2 fgj_22 = this.getTextBuilder().gyh();
        int n = bl ? fgj_22.gzp() : fgj_22.gzt();
        int n2 = fgj_22.gzs();
        int n3 = n;
        int n4 = n2;
        while (bl ? n4 >= 0 : n4 < fgj_22.gzD()) {
            fgk_2 fgk_22 = fgj_22.abt(n2);
            if (fgk_22.gzE() == ahr_2.dSD) {
                fgj_22.c(fgk_22, 0);
                fgj_22.d(fgk_22, 0);
            } else if (fgk_22.gzE() == ahr_2.dSC) {
                int n5;
                String string = ((fgm_1)fgk_22).getText();
                boolean bl3 = false;
                boolean bl4 = true;
                int n6 = n5 = n3 >= string.length() ? 32 : (int)string.charAt(n3);
                while (!bl3 && (n3 += bl ? -1 : 1) >= 0 && n3 <= string.length() - 1) {
                    char c2 = string.charAt(n3);
                    bl3 = bl ? n5 != 32 && c2 == ' ' && !bl4 : n5 == 32 && c2 != ' ';
                    bl4 = false;
                    n5 = c2;
                }
                n3 = n3 < 0 ? (bl ? 0 : string.length()) : (n3 > string.length() ? string.length() : (n3 += bl ? 1 : 0));
                if (!bl2) {
                    this.getTextBuilder().a(fgk_22, n3);
                }
                this.getTextBuilder().b(fgk_22, n3);
                break;
            }
            n4 += bl ? -1 : 1;
        }
    }

    protected boolean c(fli_2 fli_22) {
        if (fli_22.gDQ()) {
            fbj_1.getInstance().setKeyEventConsumed(true);
            fbj_1.getInstance().setMovePointMode(false);
            return false;
        }
        return true;
    }

    protected void gsp() {
        String string = this.getTextBuilder().gyh().gzw();
        if (string != null && string.length() != 0) {
            bh_0.aI(string);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        faj_1 faj_12 = (faj_1)fhi_22;
        super.a(faj_12);
        faj_12.tNU = this.tNU;
        faj_12.setSelectable(this.getTextBuilder().isSelectable());
        faj_12.b(fzq_0.tJA, this.tNC, false);
        faj_12.b(fzq_0.tJS, this.tND, false);
        faj_12.b(fzq_0.tJV, this.tNE, false);
        faj_12.b(fzq_0.tJO, this.tNF, false);
        faj_12.b(fzq_0.tJQ, this.tNG, false);
        faj_12.b(fzq_0.tJM, this.tNH, false);
        faj_12.b(fzq_0.tJR, this.tNI, false);
        faj_12.b(fzq_0.tJG, this.tNJ, true);
        faj_12.b(fzq_0.tJF, this.tNK, true);
        faj_12.b(fzq_0.tJH, this.tNL, true);
        faj_12.tNT = this.tNT;
        faj_12.setSelectableCursorType(this.tNQ);
        faj_12.setDefaultCursorType(this.tNR);
        faj_12.setActionCursorType(this.tNS);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1655575466) {
            this.setSelectable(Bw.aK(string));
        } else if (n == -625591907) {
            this.setSelectOnFocus(Bw.aK(string));
        } else if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Bw.aK(string));
        } else if (n == 1102663846) {
            this.setSelectableCursorType(fzo_0.tx(string));
        } else if (n == 400298193) {
            this.setDefaultCursorType(fzo_0.tx(string));
        } else if (n == 816974470) {
            this.setActionCursorType(fzo_0.tx(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1655575466) {
            this.setSelectable(Bw.l(object));
        } else if (n == -625591907) {
            this.setSelectOnFocus(Bw.l(object));
        } else if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Bw.l(object));
        } else if (n == 1102663846) {
            this.setSelectableCursorType((fzo_0)((Object)object));
        } else if (n == 400298193) {
            this.setDefaultCursorType((fzo_0)((Object)object));
        } else if (n == 816974470) {
            this.setActionCursorType((fzo_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

