/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBt
 */
public class fbt_1
extends fes_2
implements awh_1,
fzd {
    public static final String TAG = "Image";
    private static final double tSH = 0.001;
    protected ffq_1 tSa;
    protected boolean tEj = false;
    protected boolean tSI = false;
    protected boolean tSJ = false;
    protected boolean tQh = true;
    protected boolean tSK = false;
    protected fzw_0 ogW = fzw_0.tLg;
    protected fsm_1 tOY;
    private boolean tSL;
    public static final int tSM = 92903173;
    public static final int tSN = -928111907;
    public static final int tSO = 1603825663;
    public static final int tSP = 1714306019;
    public static final int tSQ = -1344730584;
    public static final int tSR = 1582813654;
    public static final int tSS = -954021426;
    public static final int tST = -1156593849;
    public static final int tSU = 2002164315;
    public static final int tSV = "pixmap".hashCode();
    public static final int tSW = -908189606;
    public static final int tSX = -903579675;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        if (this.bVe != null && this.tSa.getEntity() != null) {
            this.bVe.g(this.tSa.getEntity());
        }
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        if (this.tSa != null) {
            this.tSa.setVisible(bl);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fyY getAppearance() {
        return (fyY)this.uki;
    }

    public awg_1 getPixmap() {
        return this.tSa != null ? this.tSa.getPixmap() : null;
    }

    public void setPixmap(awg_1 awg_12) {
        if (this.tSa != null) {
            awg_1 awg_13 = this.tSa.getPixmap();
            if (awg_13 != null) {
                awg_13.b(this);
            }
            this.tSa.setPixmap(awg_12);
            awg_12.a(this);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFadeOnPixmapLoaded() {
        return this.tSL;
    }

    public void setFadeOnPixmapLoaded(boolean bl) {
        if (this.tSL == bl) {
            return;
        }
        this.tSL = bl;
        this.tSK = bl;
        if (this.tSL && this.tSa != null) {
            this.tSa.setModulationColor(new awx_2(awx_2.dnC));
        }
        this.setNeedsToPreProcess();
    }

    private void gtb() {
        if (this.tSa == null) {
            return;
        }
        if (!this.tSL) {
            return;
        }
        if (!this.tSK) {
            return;
        }
        awg_1 awg_12 = this.tSa.getPixmap();
        if (awg_12 == null) {
            return;
        }
        if (awg_12.bHg() == null) {
            return;
        }
        if (!awg_12.bHg().bPe()) {
            return;
        }
        this.x(fsa_2.class);
        this.a(new fsa_2(awx_2.dnC, awx_2.dnF, this, 0, 250, 1, false, abn.cdr));
        this.tSK = false;
    }

    @Override
    public void setPixmap(fze fze2) {
        if (this.tSa != null) {
            awg_1 awg_12 = this.tSa.getPixmap();
            if (awg_12 != null) {
                awg_12.b(this);
            }
            if ((awg_12 = fze2.getPixmap()) != null) {
                awg_12.a(this);
            }
            this.tSa.setPixmap(fze2.getPixmap());
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getScaled() {
        return this.tEj;
    }

    public void setScaled(boolean bl) {
        if (this.tEj != bl) {
            this.tEj = bl;
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setDisplayShape(fzz_0 fzz_02) {
        if (this.tSa != null) {
            this.tSa.setShape(fzz_02);
        }
    }

    public fzz_0 getDisplayShape() {
        return this.tSa != null ? this.tSa.getShape() : null;
    }

    public boolean getKeepAspectRatio() {
        return this.tSI;
    }

    public void setKeepAspectRatio(boolean bl) {
        if (this.tSI != bl) {
            this.tSI = bl;
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public fzw_0 getAlign() {
        return this.ogW;
    }

    public void setAlign(fzw_0 fzw_02) {
        if (fzw_02 != this.ogW) {
            this.ogW = fzw_02;
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setDisplaySize(fsm_1 fsm_12) {
        this.tOY = fsm_12;
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    public fsm_1 getDisplaySize() {
        return this.tOY;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tSa != null) {
            this.tSa.setModulationColor(axb_22);
        }
    }

    @Override
    public axb_2 getModulationColor() {
        return this.tSa != null ? this.tSa.getModulationColor() : null;
    }

    public void setFlipHorizontaly(boolean bl) {
        if (this.tSa != null) {
            this.tSa.setFlipHorizontaly(bl);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFlipHorizontaly() {
        return this.tSa != null && this.tSa.bOU();
    }

    public void setFlipVerticaly(boolean bl) {
        if (this.tSa != null) {
            this.tSa.setFlipVerticaly(bl);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public boolean getFlipVerticaly() {
        return this.tSa != null && this.tSa.bOV();
    }

    public ffq_1 getImageMesh() {
        return this.tSa;
    }

    public String getShader() {
        return this.tSa.getShader();
    }

    public void setShader(String string) {
        this.tSa.setShader(string);
    }

    public boolean isFitHeightMode() {
        return this.tSJ;
    }

    public void setFitHeightMode(boolean bl) {
        if (this.tSJ == bl) {
            return;
        }
        this.tSJ = bl;
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fyY;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ogW = null;
        this.tOY = null;
        this.tSI = false;
        this.tEj = false;
        this.tSJ = false;
        if (this.tSa != null) {
            awg_1 awg_12 = this.tSa.getPixmap();
            if (awg_12 != null) {
                awg_12.b(this);
            }
            this.tSa.aVH();
            this.tSa = null;
        }
    }

    @Override
    public void aVI() {
        this.ogW = fzw_0.tLg;
        super.aVI();
        this.tSa = new ffq_1();
        this.tSa.aVI();
        fyY fyY2 = fyY.checkOut();
        fyY2.setWidget(this);
        this.d(fyY2);
        this.tSL = false;
    }

    @Override
    public void grg() {
        if (this.tSa != null) {
            this.gsQ();
            this.tSa.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
        }
        super.grg();
    }

    private void gsQ() {
        if (this.tSa == null) {
            return;
        }
        awg_1 awg_12 = this.tSa.getPixmap();
        if (awg_12 == null) {
            return;
        }
        if (this.tOY != null) {
            this.a(awg_12, this.uki.getContentWidth(), this.uki.getContentHeight());
            return;
        }
        if (this.tEj) {
            this.b(awg_12, this.uki.getContentWidth(), this.uki.getContentHeight());
            return;
        }
        if (this.tSJ) {
            this.c(awg_12, this.uki.getContentWidth(), this.uki.getContentHeight());
            return;
        }
        this.setMeshBoundsFromComponent(awg_12.getWidth(), awg_12.getHeight(), this.uki.getContentWidth(), this.uki.getContentHeight());
    }

    private void a(awg_1 awg_12, int n, int n2) {
        if (this.tSI) {
            acc_1 acc_12 = this.d(awg_12, this.tOY.width, this.tOY.height);
            this.setMeshBoundsFromComponent(acc_12.bWx(), acc_12.bWy(), n, n2);
            return;
        }
        this.setMeshBoundsFromComponent(this.tOY.width, this.tOY.height, n, n2);
    }

    private void b(awg_1 awg_12, int n, int n2) {
        if (this.tSI) {
            acc_1 acc_12 = this.d(awg_12, n, n2);
            this.setMeshBoundsFromComponent(acc_12.bWx(), acc_12.bWy(), n, n2);
            return;
        }
        this.setMeshBounds(0, 0, n, n2);
    }

    private void c(awg_1 awg_12, int n, int n2) {
        float f2;
        float f3;
        acc_1 acc_12 = n == 0 || awg_12.getWidth() == 0 || n2 == 0 || awg_12.getHeight() == 0 || awg_12.getHeight() == -1 ? new acc_1(n, n2) : (GC.e(f3 = (float)awg_12.getWidth() / (float)awg_12.getHeight(), f2 = (float)n / (float)n2) ? new acc_1(n, n2) : new acc_1((int)((float)n2 * f3), n2));
        this.setMeshBoundsFromComponent(acc_12.bWx(), acc_12.bWy(), n, n2);
    }

    private acc_1 d(awg_1 awg_12, int n, int n2) {
        float f2;
        if (n == 0 || awg_12.getWidth() == 0 || n2 == 0 || awg_12.getHeight() == 0) {
            return new acc_1(n, n2);
        }
        float f3 = (float)awg_12.getWidth() / (float)awg_12.getHeight();
        if (GC.e(f3, f2 = (float)n / (float)n2)) {
            return new acc_1(n, n2);
        }
        if (f3 > f2) {
            return new acc_1(n, (int)((float)n / f3));
        }
        return new acc_1((int)((float)n2 * f3), n2);
    }

    private void setMeshBoundsFromComponent(int n, int n2, int n3, int n4) {
        int n5 = this.ogW.cf(n, n3);
        int n6 = this.ogW.cg(n2, n4);
        this.setMeshBounds(n5, n6, n, n2);
    }

    private void setMeshBounds(int n, int n2, int n3, int n4) {
        this.tSa.setX(n);
        this.tSa.setY(n2);
        this.tSa.setWidth(n3);
        this.tSa.setHeight(n4);
    }

    public boolean gsR() {
        boolean bl = false;
        if (this.tSa == null) {
            return false;
        }
        if (this.tSa.getPixmap() != null) {
            int n;
            int n2;
            if (this.tOY != null) {
                n2 = this.tOY.width;
                n = this.tOY.height;
            } else if (this.ukC) {
                n2 = 0;
                n = 0;
            } else {
                n2 = this.tSa.getPixmap().getWidth();
                n = this.tSa.getPixmap().getHeight();
            }
            if (this.uku == null || n2 != this.uku.width || n != this.uku.height) {
                this.setMinSize(new fsm_1(n2, n));
                bl = true;
            }
        } else if (this.uku == null || this.uku.width != 0 || this.uku.height != 0) {
            this.setMinSize(new fsm_1(0, 0));
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tSa != null && (this.tQh || this.tSa.getPixmap() != null && this.tSa.getPixmap().bOX())) {
            boolean bl2 = this.gsR();
            this.gsQ();
            try {
                if (this.uki != null) {
                    this.tSa.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
                }
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("imageMesh = " + String.valueOf(this.tSa) + ", appearance = " + String.valueOf(this.uki)), (Throwable)nullPointerException);
            }
            if (bl2 && this.uko != null) {
                this.uko.gsm();
            }
            this.tQh = false;
        }
        if (this.tSK) {
            this.gtb();
            bl |= this.tSK;
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fbt_1 fbt_12 = (fbt_1)fhi_22;
        super.a(fhi_22);
        fbt_12.setAlign(this.ogW);
        fbt_12.setDisplaySize(this.tOY != null ? (fsm_1)this.tOY.clone() : null);
        fbt_12.setKeepAspectRatio(this.tSI);
        fbt_12.setScaled(this.tEj);
        fbt_12.setFitHeightMode(this.tSJ);
        fbt_12.setModulationColor(this.getModulationColor());
        fbt_12.setFlipHorizontaly(this.getFlipHorizontaly());
        fbt_12.setFlipVerticaly(this.getFlipVerticaly());
        fbt_12.setDisplayShape(this.getDisplayShape());
        fbt_12.setFadeOnPixmapLoaded(this.tSL);
    }

    @Override
    public void a(awg_1 awg_12) {
        this.tQh = true;
        if (this.tSa != null && this.tSL) {
            this.tSa.setModulationColor(new awx_2(awx_2.dnC));
            this.tSK = true;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(fzw_0.tE(string));
        } else if (n == 1603825663) {
            this.setDisplayShape(fzz_0.tu(string));
        } else if (n == -928111907) {
            this.setFadeOnPixmapLoaded(Bw.aK(string));
        } else if (n == 1714306019) {
            this.setDisplaySize(fic_12.vn(string));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Bw.aK(string));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Bw.aK(string));
        } else if (n == -954021426) {
            this.setKeepAspectRatio(Bw.aK(string));
        } else if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == -908189606) {
            this.setScaled(Bw.aK(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else if (n == 2002164315) {
            this.setFitHeightMode(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((fzw_0)((Object)object));
        } else if (n == 1603825663) {
            this.setDisplayShape((fzz_0)((Object)object));
        } else if (n == 1714306019) {
            this.setDisplaySize((fsm_1)object);
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Bw.l(object));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Bw.l(object));
        } else if (n == -954021426) {
            this.setKeepAspectRatio(Bw.l(object));
        } else if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == tSV) {
            this.setPixmap((awg_1)object);
        } else if (n == -908189606) {
            this.setScaled(Bw.l(object));
        } else if (n == 2002164315) {
            this.setFitHeightMode(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

