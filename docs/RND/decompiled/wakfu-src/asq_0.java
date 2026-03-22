/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSq
 */
public final class asq_0
extends aRY {
    public static final int eOa = 1;
    public static final int eOb = 2;
    public static final int eOc = 3;
    public static final int eOd = 4;
    public static final int eOe = 5;
    private final int eOf;
    private final String[] eOg;

    public asq_0(int n, String ... stringArray) {
        this.eOg = stringArray;
        this.eOf = n;
    }

    @Override
    public boolean isValid() {
        switch (this.eOf) {
            case 2: 
            case 3: {
                return this.eOg.length == 2;
            }
            case 4: 
            case 5: {
                return this.eOg.length == 1;
            }
            case 1: {
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
            switch (this.eOf) {
                case 2: {
                    this.aH(ayf_22);
                    break;
                }
                case 3: {
                    this.aI(ayf_22);
                    break;
                }
                case 4: {
                    this.aG(ayf_22);
                    break;
                }
                case 5: {
                    this.aF(ayf_22);
                    break;
                }
                case 1: {
                    asq_0.cBS();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de calendrier " + String.valueOf(exception));
        }
    }

    private void aF(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)346);
        ns_02.nX(Integer.parseInt(this.eOg[0]));
        ayf_22.d(ns_02);
    }

    private void aG(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)264);
        ns_02.nX(Integer.parseInt(this.eOg[0]));
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        asq_0.jF("(-changeNation | -cn) protectorId newNationId : change nation of protector\r\n(-addMoney | -am) protectorId amount : give money to protector\r\n");
    }

    private void aH(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)86);
        ns_02.nX(Integer.parseInt(this.eOg[0]));
        ns_02.nX(Integer.parseInt(this.eOg[1]));
        ayf_22.d(ns_02);
    }

    private void aI(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)10);
        ns_02.nX(Integer.parseInt(this.eOg[0]));
        ns_02.nX(Integer.parseInt(this.eOg[1]));
        ayf_22.d(ns_02);
    }
}

