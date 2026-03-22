/*
 * Decompiled with CFR 0.152.
 */
public class aQr
extends aRY {
    private final byte eCA;
    private final int eCB;
    private final int eCC;
    private final int eCD;
    private final int eCE;
    private final int eCF;
    private final int eCG;
    private final int eCH;

    public aQr(byte by, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.eCA = by;
        this.eCB = n;
        this.eCC = n2;
        this.eCD = n3;
        this.eCE = n4;
        this.eCF = n5;
        this.eCG = n6;
        this.eCH = n7;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)40);
        ns_02.C((byte)3);
        ns_02.D(this.eCA);
        uw_0 uw_02 = new uw_0(this.eCC, this.eCD, this.eCE, this.eCF, this.eCG, this.eCH);
        switch (this.eCA) {
            case 6: {
                ns_02.nX(this.eCB);
                ns_02.cX(uw_02.bjB());
                break;
            }
            default: {
                throw new UnsupportedOperationException("La commande " + this.eCA + " n'est pas support\u00e9e");
            }
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

