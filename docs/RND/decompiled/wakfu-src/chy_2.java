/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cHY
 */
class chy_2
extends fss_2<Object> {
    private fcv_1 ncb;
    private int ncc;
    private int ncd;
    private int nce;
    private int ncf;
    private int ncg;
    private int nch;
    private int nci;
    private int ncj;
    private int brs;
    private int brt;
    private fcv_1 nck;
    private int ncl;
    private int ncm;
    private int ncn;
    private int nco;
    private int ncp;
    private int ncq;
    private int ncr;
    private int ncs;
    private int nct;
    private int ncu;
    private int ncv;
    private boolean ncw = true;
    final /* synthetic */ chv_2 ncx;

    chy_2(chv_2 chv_22, abn abn2) {
        this.ncx = chv_22;
        this.sO(0);
        this.setDuration(250);
        this.acd(1);
        this.setEasing(abn2);
    }

    public void a(fcv_1 fcv_13, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.ncb = fcv_13;
        this.ncc = n2;
        this.nce = n4;
        this.ncg = n6;
        this.nci = n8;
        this.ncd = n3;
        this.ncf = n5;
        this.nch = n7;
        this.ncj = n9;
        this.brs = n10;
        this.brt = n11;
        this.ncx.nbO.compute(this.ncb, (fcv_12, n) -> n + 1);
    }

    public void b(fcv_1 fcv_13, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.nck = fcv_13;
        this.ncl = n2;
        this.ncn = n4;
        this.ncp = n6;
        this.ncr = n8;
        this.ncm = n3;
        this.nco = n5;
        this.ncq = n7;
        this.ncs = n9;
        this.nct = n10;
        this.ncu = n11;
        this.ncx.nbO.compute(this.nck, (fcv_12, n) -> n + 1);
    }

    public boolean blc() {
        return this.ncb != null;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            int n2;
            int n3 = this.ncx.getAppearance().getContentWidth();
            if (this.ncw) {
                this.ncv = this.ncx.nbP.getX() - n3;
                this.ncw = false;
            }
            if (this.bUi < this.bMn / 2) {
                n2 = (int)this.tXJ.h(this.ncc, this.nce, this.bUi, this.bMn / 2);
                int n4 = (int)this.tXJ.h(this.ncd, this.ncf, this.bUi, this.bMn / 2);
                this.ncb.setPosition(n2 + n3, n4);
                if (this.nck != null) {
                    int n5 = (int)this.tXJ.h(this.ncl, this.ncn, this.bUi, this.bMn / 2);
                    int n6 = (int)this.tXJ.h(this.ncm, this.nco, this.bUi, this.bMn / 2);
                    this.nck.setPosition(n5 + n3, n6);
                }
            } else {
                n2 = (int)this.tXJ.h(this.ncg, this.nci, this.bUi - this.bMn / 2, this.bMn / 2);
                int n7 = (int)this.tXJ.h(this.nch, this.ncj, this.bUi - this.bMn / 2, this.bMn / 2);
                this.ncb.setPosition(n2 + n3, n7);
                if (this.nck != null) {
                    int n8 = (int)this.tXJ.h(this.ncp, this.ncr, this.bUi - this.bMn / 2, this.bMn / 2);
                    int n9 = (int)this.tXJ.h(this.ncq, this.ncs, this.bUi - this.bMn / 2, this.bMn / 2);
                    this.nck.setPosition(n8 + n3, n9);
                }
            }
            n2 = (int)this.tXJ.h(this.ncv, this.ncv + 72, this.bUi, this.bMn);
            this.ncx.nbP.setX(n2 + n3);
        }
        return true;
    }

    @Override
    public void cbz() {
        int n = this.ncx.getAppearance().getContentWidth();
        if (this.ncb.getPosition() != null) {
            this.ncb.setPosition(this.nci + n, this.ncj);
        }
        if (this.ncb.getSize() != null) {
            this.ncb.setSize(this.brs, this.brt);
        }
        this.ncx.nbP.setX(this.ncv + n);
        int n2 = Optional.ofNullable(this.ncx.nbO.get(this.ncb)).orElse(0);
        if (n2 <= 1) {
            this.ncx.nbO.remove(this.ncb);
            this.ncb.gAD();
        } else {
            this.ncx.nbO.put(this.ncb, n2 - 1);
        }
        if (this.nck != null) {
            this.nck.setPosition(this.ncr + n, this.ncs);
            this.nck.setSize(this.nct, this.ncu);
            n2 = this.ncx.nbO.get(this.nck);
            if (n2 == 1) {
                this.ncx.nbO.remove(this.nck);
                this.nck.gAD();
            } else {
                this.ncx.nbO.put(this.nck, n2 - 1);
            }
        }
        super.cbz();
    }
}

