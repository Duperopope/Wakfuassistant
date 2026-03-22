/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from faB
 */
public class fab_0 {
    private final fah_0 rPJ;

    public fab_0(faz_0 faz_02) {
        this.rPJ = (fah_0)faz_02;
    }

    public faz_0 eAj() {
        return this.rPJ;
    }

    public final void b(faa_0 faa_02) {
        if (this.rPJ.eqJ() != null) {
            throw new fcc_0(fbn.rQB, "Le Havre-monde a d\u00e9j\u00e0 une guilde");
        }
        this.rPJ.a(faa_02);
    }

    public final void c(faa_0 faa_02) {
        this.rPJ.a(faa_02);
    }

    protected final fas_0 a(far_0 far_02, long l) {
        fbk_0 fbk_02 = far_02.erN();
        fav_0 fav_02 = new fav_0(fbk_02, far_02.ZC(), far_02.azv(), l, far_02.fRc(), far_02.fRd());
        this.d(fav_02);
        return fav_02;
    }

    public final void d(fas_0 fas_02) {
        if (fas_02.erN() == null) {
            throw new fcc_0(fbn.rQI, "Aucune d\u00e9finition pour le b\u00e2timent");
        }
        if (this.rPJ.oM(fas_02.Lx()) != null) {
            throw new fcc_0(fbn.rQQ, "Le b\u00e2timent existe d\u00e9j\u00e0");
        }
        this.rPJ.d(fas_02);
    }

    public final void rQ(long l) {
        fas_0 fas_02 = this.rPJ.oM(l);
        if (fas_02 == null) {
            throw new fcc_0(fbn.rQO, "Le b\u00e2timent n'existe pas");
        }
        if (fas_02.fRj()) {
            throw new fcc_0(fbn.rQY, "Il existe encore des \u00e9l\u00e9ments li\u00e9s \u00e0 ce b\u00e2timent");
        }
        this.rPJ.rQ(l);
    }

    protected final void c(long l, long l2, long l3) {
        fav_0 fav_02 = (fav_0)this.rPJ.oM(l);
        if (fav_02 == null) {
            throw new fcc_0(fbn.rQO, "Le b\u00e2timent n'existe pas " + l);
        }
        if (fav_02.rP(l2) != null) {
            throw new fcc_0(fbn.rQX, "L'\u00e9l\u00e9ment existe d\u00e9j\u00e0");
        }
        fav_02.a(new fau_0(l2, l3));
    }

    protected void a(far_0 far_02, fae_0 fae_02) {
        fbk_0 fbk_02 = far_02.erN();
        long l = far_02.ZC();
        short s = far_02.fRc();
        short s2 = far_02.fRd();
        fbk_02.z(new fac_0(this, s, s2, l, fae_02));
    }

    protected final void rR(long l) {
        fcl_0 fcl_02 = new fcl_0(l);
        this.rPJ.O(fcl_02);
        long l2 = fcl_02.ZC();
        fav_0 fav_02 = (fav_0)this.rPJ.oM(l2);
        if (fav_02 == null) {
            throw new fcc_0(fbn.rQO, "Le b\u00e2timent n'existe pas");
        }
        if (fav_02.rP(l) == null) {
            throw new fcc_0(fbn.rQW, "L'\u00e9l\u00e9ment n'existe pas");
        }
        fav_02.fQ(l);
    }

    protected final void ae(long l, int n) {
        fav_0 fav_02 = (fav_0)this.rPJ.oM(l);
        if (fav_02 == null) {
            throw new fcc_0(fbn.rQO, "Le b\u00e2timent n'existe pas");
        }
        fbk_0 fbk_02 = fav_02.erN();
        if (n != 0 && !fbk_02.Kq(n)) {
            throw new fcc_0(fbn.rQT, "Impossible d'\u00e9quipper l'item " + n);
        }
        fav_02.TM(n);
    }

    public final fao_0 Z(short s, short s2) {
        faq_0 faq_02 = new faq_0(s, s2);
        this.b(faq_02);
        return faq_02;
    }

    protected final fao_0 b(short s, short s2, short s3, short s4, short s5, short s6) {
        faq_0 faq_02 = new faq_0(s, s2, s3, s4, s5, s6);
        this.b(faq_02);
        return faq_02;
    }

    protected final void b(fao_0 fao_02) {
        if (this.rPJ.Y(fao_02.bsM(), fao_02.bsN()) != null) {
            throw new fcc_0(fbn.rRe, "La partition existe d\u00e9j\u00e0");
        }
        this.rPJ.b(fao_02);
    }

    public final void c(short s, short s2, short s3, short s4, short s5, short s6) {
        faq_0 faq_02 = (faq_0)this.rPJ.Y(s, s2);
        if (faq_02 == null) {
            throw new fcc_0(fbn.rRd, "La partition n'existe pas");
        }
        boolean bl = faq_02.c(s3, s4, s5, s6);
        if (bl) {
            this.rPJ.e(faq_02);
        }
    }

    public final void TP(int n) {
        if (n < 0) {
            throw new fcc_0(fbn.rRh, "Impossible de rajouter une quantit\u00e9 de resources n\u00e9gative");
        }
        fah_0 fah_02 = (fah_0)this.eAj();
        fah_02.eqJ().TO(Math.min(50000000, GC.cw(fah_02.eAn() + n)));
    }

    protected final void TQ(int n) {
        if (n < 0) {
            throw new fcc_0(fbn.rRh, "Impossible de supprimer une quantit\u00e9 de resources n\u00e9gative");
        }
        fah_0 fah_02 = (fah_0)this.eAj();
        if (fah_02.eAn() - n < 0) {
            throw new fcc_0(fbn.rRh, "Impossible de descendre en dessous de 0 ressources");
        }
        fah_02.eqJ().TO(GC.cx(fah_02.eAn() - n));
    }

    public final void TR(int n) {
        if (n < 0) {
            throw new fcc_0(fbn.rRh, "Impossible de d\u00e9finir une quantit\u00e9 de resources n\u00e9gative");
        }
        fah_0 fah_02 = (fah_0)this.eAj();
        fah_02.eqJ().TO(n);
    }

    public fav_0 rS(long l) {
        return (fav_0)this.rPJ.oM(l);
    }

    protected long Ya() {
        return this.rPJ.Ya();
    }

    public String toString() {
        return "HavenWorldController{m_world=" + String.valueOf(this.rPJ) + "}";
    }
}

