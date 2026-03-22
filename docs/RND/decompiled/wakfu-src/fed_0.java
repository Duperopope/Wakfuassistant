/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from feD
 */
public class fed_0 {
    private final fec_0 sew;

    public fed_0(fec_0 fec_02) {
        this.sew = fec_02;
    }

    protected fec_0 fUD() {
        return this.sew;
    }

    public final short G(int n, short s) {
        if (s <= 0) {
            throw new ffq("Impossible d'ajouter une quantit\u00e9 n\u00e9gative " + s + " \u00e0 l'item " + n);
        }
        if (this.sew.UB(n) == null) {
            return this.J(n, s);
        }
        return this.K(n, s);
    }

    public final boolean H(int n, short s) {
        if (s >= 0) {
            throw new ffq("Impossible de soustraire une quantit\u00e9 positive " + s + " \u00e0 l'item " + n);
        }
        ffm ffm2 = this.sew.UB(n);
        if (ffm2 == null) {
            return false;
        }
        if (ffm2.bfd() + s > 0) {
            this.K(n, s);
        } else {
            this.UC(n);
        }
        return true;
    }

    public final short I(int n, short s) {
        if (s >= 0) {
            throw new ffq("Impossible de soustraire une quantit\u00e9 positive " + s + " \u00e0 l'item " + n);
        }
        ffm ffm2 = this.sew.UB(n);
        if (ffm2 == null) {
            return 0;
        }
        if (ffm2.bfd() + s > 0) {
            return this.K(n, s);
        }
        return this.UC(n);
    }

    public final short J(int n, short s) {
        ffm ffm2 = this.sew.UB(n);
        if (ffm2 != null) {
            throw new ffq("Un item " + String.valueOf(ffm2) + " est d\u00e9j\u00e0 pr\u00e9sent dans l'inventaire");
        }
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            throw new ffq("Impossible de trouver le refItem " + n);
        }
        if (s <= 0) {
            throw new ffq("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s);
        }
        feg_0 feg_02 = new feg_0((ffj)r);
        feg_02.ak(GC.b(s, ((fhc_0)r).bfe()));
        this.sew.c(feg_02);
        if (feg_02.bfe() < s) {
            return feg_02.bfe();
        }
        return s;
    }

    public final void g(ffm ffm2) {
        if (!(ffm2 instanceof feg_0)) {
            throw new ffq("Impossible d'ajouter un item de type " + ffm2.getClass().getSimpleName());
        }
        if (this.sew.UB(ffm2.acs()) != null) {
            throw new ffq("Un item " + String.valueOf(ffm2) + " est d\u00e9j\u00e0 pr\u00e9sent dans l'inventaire");
        }
        this.sew.c(ffm2);
    }

    public final short UC(int n) {
        ffm ffm2 = this.sew.UB(n);
        if (ffm2 == null) {
            throw new ffq("L'item " + n + " n'existe pas dans l'inventaire");
        }
        this.sew.d(ffm2);
        return ffm2.bfd();
    }

    public final short K(int n, short s) {
        if (s == 0) {
            throw new ffq("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s);
        }
        feg_0 feg_02 = (feg_0)this.sew.UB(n);
        if (feg_02 == null) {
            throw new ffq("Impossible de trouver l'item " + n);
        }
        short s2 = feg_02.bfd();
        int n2 = s2 + s;
        if (n2 <= 0) {
            throw new ffq("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " \u00e0 une quantit\u00e9 de " + n2);
        }
        feg_02.ak(GC.b(GC.cu(n2), feg_02.bfe()));
        if (feg_02.bfe() < n2) {
            return GC.cu(feg_02.bfe() - s2);
        }
        return s;
    }

    public final void L(int n, short s) {
        feg_0 feg_02 = (feg_0)this.sew.UB(n);
        if (feg_02 == null) {
            throw new ffq("Impossible de trouver l'item " + n);
        }
        if (s <= 0) {
            throw new ffq("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s);
        }
        feg_02.ak(GC.b(s, feg_02.bfe()));
    }

    public String toString() {
        return "QuestInventoryController{m_inventory=" + String.valueOf(this.sew) + "}";
    }
}

