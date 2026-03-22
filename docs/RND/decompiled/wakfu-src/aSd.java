/*
 * Decompiled with CFR 0.152.
 */
public class aSd
extends aRY {
    private final String eMY;
    private static final int eMZ = 255;

    public aSd(String string) {
        this.eMY = string;
    }

    @Override
    public boolean isValid() {
        return this.eMY != null && !this.eMY.isEmpty();
    }

    @Override
    public void bGy() {
        int n = BH.aP(this.eMY).length;
        if (n > 255) {
            aqh_0.cBI().jI("Message exceeds the size limit : 255 characters, special character counts for 2 characters");
            return;
        }
        String string2 = "<b>Attention !\n\nVous \u00eates sur le point d'envoyer un message \u00e0 l'ensemble des joueurs connect\u00e9s, \u00eates vous s\u00fbr ?\n\nMessage :</b>\n" + this.eMY;
        fiq_2.gCw().d(fik_2.a(string -> this.cCw()).vE(string2).vG(ccp_2.mRE.byf()).abQ(1));
    }

    void cCw() {
        chN chN2 = new chN();
        chN2.op(this.eMY);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("You need to be connected to use this command.");
            return;
        }
        ayf_22.d(chN2);
    }
}

