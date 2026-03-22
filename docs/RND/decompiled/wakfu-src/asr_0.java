/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSr
 */
public class asr_0
extends aRY {
    private final int eOh;
    private final String eOi;

    public asr_0(int n, String string) {
        this.eOh = n;
        this.eOi = string;
    }

    @Override
    public boolean isValid() {
        return this.eOi != null && this.eOh >= 0;
    }

    @Override
    public void bGy() {
        int n = (2 * this.eOh + 1) * (2 * this.eOh + 1);
        String string2 = "<b>Attention !\n\nVous \u00eates sur le point d'envoyer un message \u00e0 tous des joueurs se trouvant sur un total d'environ " + n + " partitions, \u00eates vous s\u00fbr ?\n\nMessage :</b>\n" + this.eOi;
        fiq_2.gCw().d(fik_2.a(string -> this.cCw()).vE(string2).vG(ccp_2.mRE.byf()).abQ(1));
    }

    void cCw() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)57);
        ns_02.nX(this.eOh);
        ns_02.cT(this.eOi);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

