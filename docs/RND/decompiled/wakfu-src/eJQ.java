/*
 * Decompiled with CFR 0.152.
 */
public class eJQ {
    protected final long qAM;

    public eJQ(long l) {
        this.qAM = l;
    }

    public eJS u(eJS eJS2) {
        short s = eJS2.aWP();
        if (eJN.qAF.U(this.qAM, s)) {
            throw new eJM("Le joueur poss\u00e8de d\u00e9j\u00e0 un compagnon de ce type " + s);
        }
        Object b2 = eyu.fif().bD(s);
        if (b2 == null) {
            throw new eJM("On ne peut pas ajouter de compagnon de breed inconnue " + s);
        }
        eJN.qAF.a(this.qAM, eJS2);
        return eJS2;
    }

    public boolean pU(long l) {
        return eJN.qAF.P(this.qAM, l);
    }

    public void fxs() {
        eJN.qAF.pS(this.qAM);
    }

    public String toString() {
        return "CompanionManagerController{m_clientId=" + this.qAM + "}";
    }
}

