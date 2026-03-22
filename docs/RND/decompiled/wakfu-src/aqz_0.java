/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQZ
 */
public class aqz_0
extends aRY {
    private final int eIA;
    private final short eIB;

    public aqz_0(int n, short s) {
        this.eIA = n;
        this.eIB = s;
    }

    @Override
    public boolean isValid() {
        return this.eIB > 0;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            Object r = fgD.fXh().Vd(this.eIA);
            if (r != null) {
                ns_0 ns_02 = new ns_0();
                ns_02.C((byte)3);
                ns_02.Q((short)44);
                ns_02.nX(this.eIA);
                ns_02.R(this.eIB);
                ayf_22.d(ns_02);
            } else {
                aqh_0.cBI().jI("ReferenceItem d'Id " + this.eIA + " non trouv\u00e9e. Peut-\u00eatre un probl\u00e8me d'export ?");
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me pour la suppression d'un item : " + String.valueOf(exception));
        }
    }
}

