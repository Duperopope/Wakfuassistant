/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRd
 */
public class ard_0
extends aRY {
    private final int eIG;
    private final int eIH;
    private final short eII;
    private final fhc_0 eIJ;

    public ard_0(int n, int n2, short s) {
        this.eIG = n;
        this.eIH = n2;
        this.eII = s;
        this.eIJ = fgD.fXh().Vd(this.eIH);
    }

    @Override
    public boolean isValid() {
        return this.eIG >= 0 && this.eIH > 0 && this.eII >= 1;
    }

    @Override
    public void bGy() {
        int n = (2 * this.eIG + 1) * (2 * this.eIG + 1);
        String string2 = this.eIJ != null ? this.eIJ.getName() : "!Item Not Found!";
        String string3 = "<b>Attention !\n\nVous \u00eates sur le point de distribuer un objet \u00e0 tous des joueurs se trouvant sur un total d'environ " + n + " partitions, \u00eates vous s\u00fbr ?\n\nObjet distribu\u00e9 :</b>\n" + this.eII + "x " + string2 + " [id:" + this.eIH + "]";
        fiq_2.gCw().d(fik_2.a(string -> this.cCw()).vE(string3).abQ(1).vG(ccp_2.mRE.byf()));
    }

    void cCw() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)353);
        ns_02.nX(this.eIG);
        ns_02.nX(this.eIH);
        ns_02.R(this.eII);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

