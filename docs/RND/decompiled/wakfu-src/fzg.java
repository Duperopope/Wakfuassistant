/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

public class fzg
extends fys_0 {
    public static final String tER = "progressBar";
    public static final String tES = "progressBarBorder";
    public static final String TAG = "progressBarAppearance";
    private fyp_0 tET = null;
    private fyp_0 tEU = null;
    private Insets tEV = null;
    private faa_2 tEW = faa_2.tLO;
    private final fze[] tEX = new fze[9];
    public static final int tEY = -1072556510;
    public static final int tEZ = 0x2C929929;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            fze fze2 = (fze)fhv_12;
            switch (fze2.getPosition()) {
                case tKY: {
                    this.tEX[0] = fze2;
                    break;
                }
                case tLa: {
                    this.tEX[1] = fze2;
                    break;
                }
                case tLc: {
                    this.tEX[2] = fze2;
                    break;
                }
                case tLf: {
                    this.tEX[3] = fze2;
                    break;
                }
                case tLg: {
                    this.tEX[4] = fze2;
                    break;
                }
                case tLh: {
                    this.tEX[5] = fze2;
                    break;
                }
                case tLk: {
                    this.tEX[6] = fze2;
                    break;
                }
                case tLm: {
                    this.tEX[7] = fze2;
                    break;
                }
                case tLo: {
                    this.tEX[8] = fze2;
                }
            }
            this.grl();
        } else if (fhv_12 instanceof fyp_0) {
            fyp_0 fyp_02 = (fyp_0)fhv_12;
            if (fyp_02.getName() == null || fyp_02.getName().equalsIgnoreCase(tER)) {
                fyp_02.a(fzq_0.tJt, new fzh(this), false);
                this.tET = (fyp_0)fhv_12;
                this.gro();
            } else if (fyp_02.getName().equals(tES)) {
                fyp_02.a(fzq_0.tJt, new fzi(this), false);
                this.tEU = (fyp_0)fhv_12;
                this.gro();
            }
        } else if (fhv_12 instanceof fka_1) {
            fka_1 fka_12 = (fka_1)fhv_12;
            fka_12.setPositionSupplier(((fce_2)this.tCV).getProgressBarMesh());
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        if (this.tET != null) {
            this.gro();
        } else {
            this.grl();
        }
        this.grm();
        this.grn();
    }

    public void setPosition(faa_2 faa_22) {
        this.tEW = faa_22;
        this.grn();
    }

    public void setInnerBorder(Insets insets) {
        this.tEV = insets == null ? null : new Insets(insets.top, insets.left, insets.bottom, insets.right);
        this.grm();
    }

    public Insets getInnerBorder() {
        return this.tEV;
    }

    @Override
    public void grd() {
        super.grd();
        this.grp();
        this.grq();
    }

    public void grl() {
        if (this.tCV == null || !(this.tCV instanceof fce_2)) {
            return;
        }
        if (this.tEX[4] == null) {
            return;
        }
        if (this.tEX[0] != null && this.tEX[8] != null) {
            ((fce_2)this.tCV).setPixmaps(this.tEX[0], this.tEX[1], this.tEX[2], this.tEX[3], this.tEX[4], this.tEX[5], this.tEX[6], this.tEX[7], this.tEX[8]);
        } else if (this.tEX[0] == null && this.tEX[8] == null) {
            ((fce_2)this.tCV).setPixmaps(this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4], this.tEX[4]);
        }
    }

    private void grm() {
        if (this.tEV == null || this.tCV == null || !(this.tCV instanceof fce_2)) {
            return;
        }
        fce_2 fce_22 = (fce_2)this.tCV;
        fce_22.setInnerBorder(this.tEV);
    }

    private void grn() {
        if (!(this.tCV instanceof fce_2)) {
            return;
        }
        fce_2 fce_22 = (fce_2)this.tCV;
        fce_22.setInnerPosition(this.tEW);
    }

    void gro() {
        if (this.tCV == null || !(this.tCV instanceof fce_2)) {
            return;
        }
        fce_2 fce_22 = (fce_2)this.tCV;
        if (this.tET != null) {
            fce_22.setColor(this.tET.getColor(), tER);
        }
        if (this.tEU != null) {
            fce_22.setColor(this.tEU.getColor(), tES);
        }
    }

    private void grp() {
        if (this.tET != null) {
            this.m(this.tET);
            this.tET = null;
        }
        if (this.tEU != null) {
            this.m(this.tEU);
            this.tEU = null;
        }
    }

    private void grq() {
        for (int i = 0; i < this.tEX.length; ++i) {
            if (this.tEX[i] == null) continue;
            this.m(this.tEX[i]);
            this.tEX[i] = null;
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzg fzg2 = (fzg)fhi_22;
        if (this.tEV != null) {
            fzg2.setInnerBorder(this.tEV);
        }
        fzg2.setPosition(this.tEW);
        super.a(fhi_22);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tEW = faa_2.tLO;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tET = null;
        this.tEU = null;
        for (int i = 0; i < this.tEX.length; ++i) {
            this.tEX[i] = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1072556510) {
            this.setInnerBorder(fic_12.vo(string));
        } else if (n == 0x2C929929) {
            this.setPosition(faa_2.tI(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }
}

