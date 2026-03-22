/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQM
 */
public final class aqm_0
extends aRY {
    public static final int eHc = 0;
    public static final int eHd = 1;
    public static final int eHe = 2;
    private final int eHf;
    private final String[] eHg;

    public aqm_0(int n, String ... stringArray) {
        this.eHg = stringArray;
        this.eHf = n;
    }

    @Override
    public boolean isValid() {
        switch (this.eHf) {
            case 1: {
                return this.eHg.length == 1;
            }
            case 0: 
            case 2: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.eHf) {
                case 1: {
                    this.w(ayf_22);
                    break;
                }
                case 2: {
                    this.x(ayf_22);
                    break;
                }
                case 0: {
                    this.cBS();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de check " + String.valueOf(exception));
        }
    }

    private void cBS() {
        aqm_0.jF("(--userGroup | -u) Donne des informations sur les UserGroup de la partition courante.\r\n");
    }

    private void w(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)115);
        ns_02.nX(Integer.parseInt(this.eHg[0]));
        ayf_22.d(ns_02);
    }

    private void x(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)460);
        ayf_22.d(ns_02);
    }
}

