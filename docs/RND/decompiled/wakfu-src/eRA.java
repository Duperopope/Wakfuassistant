/*
 * Decompiled with CFR 0.152.
 */
public class eRA
extends ery_0 {
    private static final aox_1 ril = new enz_0(new eny_0("Pas de param, on tp uniquement la target", new enx_0[0]), new eny_0("On peut tp le propri\u00e9taire de la zone", new enx_0("Tp owner : 0 = non (defaut), 1 = oui", eNA.qYD)), new eny_0("Autorise de tp un perso port\u00e9", new enx_0("Tp owner : 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Tp carried : 0 = non (defaut), 1 = ou", eNA.qYD)), new eny_0("Permet de tp un perso stabilis\u00e9", new enx_0("Tp owner : 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Tp carried : 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Tp Forc\u00e9e (by pass stabilis\u00e9 et autres propri\u00e9t\u00e9) 0 = non (defaut), 1 = oui", eNA.qYD)), new eny_0("Permet de tp sur une cellule bloquante", new enx_0("Tp owner : 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Tp carried : 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Tp Forc\u00e9e (by pass stabilis\u00e9 et autres propri\u00e9t\u00e9) 0 = non (defaut), 1 = oui", eNA.qYD), new enx_0("Verifie les cellules bloquantes 0 = non, 1 = oui (defaut)", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return ril;
    }

    public eRA fGQ() {
        return eRA.a(null, null, null, null);
    }

    public static eRA a(qm_0<enk_0> qm_02, enk_0 enk_02, eNl eNl2, acd_1 acd_12) {
        eRA eRA2 = new eRA();
        eRA2.rih = true;
        eRA2.bgJ = qm_02;
        eRA2.bgC = enk_02;
        eRA2.bgD = eNl2;
        if (acd_12 != null) {
            eRA2.c(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
        return eRA2;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(198);
    }

    @Override
    protected qu_0 fGN() {
        boolean bl;
        if (this.bgC == null || ((enk_0)this.bgC).fAn() == 0) {
            return this.bgF;
        }
        boolean bl2 = bl = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        if (bl && this.bgF instanceof QQ) {
            QQ qQ = (QQ)this.bgF;
            qu_0 qu_02 = qQ.bci();
            if (qu_02 != null) {
                return qu_02;
            }
            bgA.error((Object)("On cherche a t\u00e9l\u00e9porter le propri\u00e9taire d'une zone d'effet mais celui-ci est inconnu " + qQ.bcw()));
        }
        return this.bgF;
    }

    @Override
    public void E(QD qD) {
        if (((enk_0)this.bgC).fAn() >= 3) {
            boolean bl = this.rii = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu) == 1;
        }
        if (((enk_0)this.bgC).fAn() >= 4) {
            this.rij = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu) == 1;
        }
        super.E(qD);
    }

    @Override
    protected boolean fGO() {
        if (this.bgC == null) {
            return false;
        }
        if (((enk_0)this.bgC).fAn() < 2) {
            return false;
        }
        return ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu) == 1;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public /* synthetic */ ery_0 fGM() {
        return this.fGQ();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGQ();
    }
}

