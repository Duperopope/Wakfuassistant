/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.ArrayList;

public class fzm
extends fha_2 {
    protected Insets tFe;
    protected Insets tFf;
    protected Insets tFg;
    protected fzz_0 tFh;
    protected fsm_1 tFi = null;
    protected boolean dGB = false;
    protected boolean tFj = false;
    protected fes_2 tCV;
    protected boolean tFk = false;
    protected boolean tFl = false;
    protected boolean tFm = true;
    public static final int tFn = -1081309778;
    public static final int tFo = -1383304148;
    public static final int tFp = -806339567;
    public static final int tFq = 109399969;
    public static final int tFr = 1232803018;
    public static final int tFs = -1555226005;
    public static final int tFt = 2006481300;

    public fzm() {
    }

    public fzm(fes_2 fes_22) {
        this.tCV = fes_22;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fzu) {
            fhv_12.a(fzq_0.tKb, new fzn(this), false);
            this.setSpacing((fzu)fhv_12);
        }
        super.d(fhv_12);
    }

    public void setSpacing(fzu fzu2) {
        if (fzu2 instanceof fzv) {
            this.setMargin(fzu2.getInsets());
        } else if (fzu2 instanceof fzx) {
            this.setPadding(fzu2.getInsets());
        } else if (fzu2 instanceof fzt) {
            this.setBorder(fzu2.getInsets());
        }
    }

    public Insets getBorder() {
        return this.tFf;
    }

    public void setBorder(Insets insets) {
        this.tFf.bottom = insets.bottom;
        this.tFf.top = insets.top;
        this.tFf.left = insets.left;
        this.tFf.right = insets.right;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public Insets getMargin() {
        return this.tFe;
    }

    public void setMargin(Insets insets) {
        this.tFe.bottom = insets.bottom;
        this.tFe.top = insets.top;
        this.tFe.left = insets.left;
        this.tFe.right = insets.right;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public Insets getPadding() {
        return this.tFg;
    }

    public void setPadding(Insets insets) {
        this.tFg.bottom = insets.bottom;
        this.tFg.top = insets.top;
        this.tFg.left = insets.left;
        this.tFg.right = insets.right;
        this.dGB = true;
        this.setNeedsToPreProcess();
    }

    public fes_2 getWidget() {
        return this.tCV;
    }

    public void setWidget(fes_2 fes_22) {
        this.tCV = fes_22;
        this.tFj = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
        this.dGB = true;
    }

    public void setShape(fzz_0 fzz_02) {
        this.tFh = fzz_02;
    }

    public fzz_0 getShape() {
        return this.tFh;
    }

    public void setInvalidateOnChange(boolean bl) {
        this.tFk = bl;
    }

    public void setInvalidateSizeOnChange(boolean bl) {
        this.tFl = bl;
    }

    public void setPostProcessOfChildrenOnChange(boolean bl) {
        this.tFm = bl;
    }

    public Insets getTotalInsets() {
        return new Insets(this.tFg.top + this.tFf.top + this.tFe.top, this.tFg.left + this.tFf.left + this.tFe.left, this.tFg.bottom + this.tFf.bottom + this.tFe.bottom, this.tFg.right + this.tFf.right + this.tFe.right);
    }

    public int getTopInset() {
        return this.tFg.top + this.tFf.top + this.tFe.top;
    }

    public int getBottomInset() {
        return this.tFg.bottom + this.tFf.bottom + this.tFe.bottom;
    }

    public int getLeftInset() {
        return this.tFg.left + this.tFf.left + this.tFe.left;
    }

    public int getRightInset() {
        return this.tFg.right + this.tFf.right + this.tFe.right;
    }

    public int getInsetWidth() {
        return this.getRightInset() + this.getLeftInset();
    }

    public int getInsetHeight() {
        return this.getTopInset() + this.getBottomInset();
    }

    private void grt() {
        this.tFi = new fsm_1(this.tCV.ukt.width - this.tFe.left - this.tFe.right - this.tFg.left - this.tFg.right - this.tFf.left - this.tFf.right, this.tCV.ukt.height - this.tFe.top - this.tFe.bottom - this.tFg.top - this.tFg.bottom - this.tFf.top - this.tFf.bottom);
    }

    public fsm_1 getContentSize() {
        if (this.tFi == null) {
            this.grt();
        }
        return this.tFi;
    }

    public int getContentWidth() {
        if (this.tFi == null) {
            this.grt();
        }
        return this.tFi.width;
    }

    public int getContentHeight() {
        if (this.tFi == null) {
            this.grt();
        }
        return this.tFi.height;
    }

    @Override
    public void bFM() {
        super.bFM();
        this.tFi = null;
    }

    public boolean gE(int n, int n2) {
        return this.tFh.I(n - this.tFe.left, n2 - this.tFe.bottom, this.tCV.ukt.width - this.tFe.left - this.tFe.right, this.tCV.ukt.height - this.tFe.bottom - this.tFe.top);
    }

    public int getOnScreenX(int n, int n2) {
        return this.tFh.J(n, n2, this.tCV.ukt.width - this.tFe.left - this.tFe.right, this.tCV.ukt.height - this.tFe.bottom - this.tFe.top);
    }

    public int getOnScreenY(int n, int n2) {
        return this.tFh.K(n, n2, this.tCV.ukt.width - this.tFe.left - this.tFe.right, this.tCV.ukt.height - this.tFe.bottom - this.tFe.top);
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.dGB) {
            this.dGB = false;
            this.bFM();
            if (this.tCV != null) {
                if (this.tFk) {
                    this.tCV.bFM();
                }
                if (this.tCV instanceof faw_2) {
                    faw_2 faw_22 = (faw_2)this.tCV;
                    if (this.tFl) {
                        faw_22.gsm();
                    }
                    if (this.tFm) {
                        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
                        for (int i = arrayList.size() - 1; i >= 0; --i) {
                            arrayList.get(i).setNeedsToPostProcess();
                        }
                    }
                }
            }
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        this.tFj = false;
        return super.LY(n);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tFe = null;
        this.tFf = null;
        this.tFg = null;
        this.tFh = null;
        this.tCV = null;
        this.tFi = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tFe = new Insets(0, 0, 0, 0);
        this.tFf = new Insets(0, 0, 0, 0);
        this.tFg = new Insets(0, 0, 0, 0);
        this.tFh = fzz_0.tGn;
        this.dGB = false;
        this.tFj = false;
        this.tFk = false;
        this.tFl = false;
        this.tFm = true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzm fzm2 = (fzm)fhi_22;
        super.a(fhi_22);
        fzm2.setShape(this.tFh);
        fzm2.setInvalidateOnChange(this.tFk);
        fzm2.setInvalidateSizeOnChange(this.tFl);
        fzm2.setPostProcessOfChildrenOnChange(this.tFm);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 109399969: {
                this.setShape(fzz_0.tu(string));
                return true;
            }
            case -1383304148: {
                this.setBorder(fic_12.vo(string));
                return true;
            }
            case -1081309778: {
                this.setMargin(fic_12.vo(string));
                return true;
            }
            case -806339567: {
                this.setPadding(fic_12.vo(string));
                return true;
            }
            case 1232803018: {
                this.setInvalidateOnChange(Bw.aK(string));
                return true;
            }
            case -1555226005: {
                this.setInvalidateSizeOnChange(Bw.aK(string));
                return true;
            }
            case 2006481300: {
                this.setPostProcessOfChildrenOnChange(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 109399969: {
                this.setShape((fzz_0)((Object)object));
                return true;
            }
            case -1383304148: {
                this.setBorder((Insets)object);
                return true;
            }
            case -1081309778: {
                this.setMargin((Insets)object);
                return true;
            }
            case -806339567: {
                this.setPadding((Insets)object);
                return true;
            }
            case 1232803018: {
                this.setInvalidateOnChange(Bw.l(object));
                return true;
            }
            case -1555226005: {
                this.setInvalidateSizeOnChange(Bw.l(object));
                return true;
            }
            case 2006481300: {
                this.setPostProcessOfChildrenOnChange(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

