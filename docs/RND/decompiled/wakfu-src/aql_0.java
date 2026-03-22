/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from aQL
 */
public final class aql_0
extends aRY {
    public static final int eGT = 0;
    public static final int eGU = 1;
    public static final int eGV = 2;
    public static final int eGW = 3;
    public static final int eGX = 4;
    public static final int eGY = 5;
    public static final int eGZ = 6;
    private final int eHa;
    private final String[] eHb;

    public aql_0(int n, String ... stringArray) {
        this.eHa = n;
        this.eHb = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eHa) {
            case 0: 
            case 4: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: {
                return this.eHb.length == 1;
            }
            case 6: {
                return this.eHb.length == 2;
            }
        }
        return false;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.eHa) {
                case 0: {
                    this.cBS();
                    break;
                }
                case 1: {
                    this.t(ayf_22);
                    break;
                }
                case 2: {
                    this.s(ayf_22);
                    break;
                }
                case 3: {
                    this.r(ayf_22);
                    break;
                }
                case 4: {
                    this.q(ayf_22);
                    break;
                }
                case 5: {
                    this.u(ayf_22);
                    break;
                }
                case 6: {
                    this.v(ayf_22);
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me d'une commande" + String.valueOf(exception));
        }
    }

    private void q(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)39);
        ayf_22.d(ns_02);
    }

    private void r(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)316);
        ns_02.D(Byte.parseByte(this.eHb[0]));
        ayf_22.d(ns_02);
    }

    private void s(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)492);
        ns_02.D(Byte.parseByte(this.eHb[0]));
        ayf_22.d(ns_02);
    }

    private void t(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)488);
        ns_02.D(Byte.parseByte(this.eHb[0]));
        ayf_22.d(ns_02);
    }

    private void u(ayf_2 ayf_22) {
        long l = this.eHb[0] == null ? bbs_2.xl() : Long.parseLong(this.eHb[0]);
        aql_0.jF("\n===== Characters of account " + l + " =====");
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)27);
        ns_02.cX(l);
        ayf_22.d(ns_02);
    }

    private void v(ayf_2 ayf_22) {
        long l = Long.parseLong(this.eHb[0]);
        String string = this.eHb[1].replaceAll("\"", "");
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)354);
        ns_02.cX(l);
        ns_02.cT(string);
        ayf_22.d(ns_02);
    }

    private void cBS() {
        aql_0.jF("'character'|'ch' 'help'|'h': Affiche l'aide de la commande");
        aql_0.jF("'character'|'ch' 'info': Affiche les infos concernant le personnage");
        aql_0.jF("'character'|'ch' 'setSex' sexId : permet de changer le sexe de son personnage");
        aql_0.jF("'character'|'ch' 'setVisibility' '0'|'1' : permet de rendre son personnage visible ou invisible");
        aql_0.jF("'character'|'ch' 'doNotDisturb'|'dnd' '0'|'1' : permet de passer en mode do not disturb afin de ne plus recevoir de demande d'echange, de combat... Cette modif est valable entre chaque d\u00e9co/reco et n'est annul\u00e9e que par un red\u00e9marrage serveur ou un ch dnd 0");
        aql_0.jF("'character'|'ch' 'list' [account id] : list the online characters of the given account (defaults to current account)");
    }

    public String toString() {
        return "CharacterCommand{m_commandId=" + this.eHa + ", m_args=" + Arrays.toString(this.eHb) + "}";
    }
}

