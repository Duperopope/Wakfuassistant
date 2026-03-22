/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aRm
 */
public final class arm_0
extends aRY {
    public static final int eJq = 0;
    public static final int eJr = 1;
    public static final int eJs = 2;
    public static final int eJt = 3;
    public static final int eJu = 4;
    public static final int eJv = 5;
    public static final int eJw = 7;
    public static final int eJx = 8;
    public static final int eJy = 9;
    public static final int eJz = 10;
    public static final int eJA = 11;
    private final int eJB;
    private final String[] eJC;

    public arm_0(int n, String ... stringArray) {
        this.eJC = (String[])stringArray.clone();
        this.eJB = n;
    }

    @Override
    public boolean isValid() {
        switch (this.eJB) {
            case 0: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 7: 
            case 9: 
            case 11: {
                return this.eJC.length == 0;
            }
            case 1: 
            case 8: 
            case 10: {
                return this.eJC.length == 1;
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
            switch (this.eJB) {
                case 0: {
                    arm_0.cCE();
                    break;
                }
                case 1: {
                    this.cCD();
                    break;
                }
                case 2: {
                    arm_0.cBS();
                    break;
                }
                case 3: {
                    arm_0.cCC();
                    break;
                }
                case 4: {
                    arm_0.cCF();
                    break;
                }
                case 5: {
                    arm_0.cCG();
                    break;
                }
                case 7: {
                    this.cCH();
                    break;
                }
                case 8: {
                    this.cCB();
                    break;
                }
                case 9: {
                    this.cCA();
                    break;
                }
                case 10: {
                    this.cCz();
                    break;
                }
                case 11: {
                    arm_0.cCI();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution d'une commande de fight (client) " + String.valueOf(exception));
        }
    }

    private static void cBS() {
        arm_0.jF("fight ('-showBonusPointSelectbable' | '-sbps') : show available timeline bonuses");
        arm_0.jF("fight ('-selectBonus' | '-sb') : request to server to select a bonus");
        arm_0.jF("fight -win : win the fight by victory of your character");
        arm_0.jF("fight -flee : flee of fights, other stay in");
        arm_0.jF("fight -ca idDonjon : launch specified arcade fight");
        arm_0.jF("fight -cb : launch Boufbawl fight");
        arm_0.jF("fight ('-createCollectFight' | '-ccf') : launch capt'chat fight");
        arm_0.jF("fight ('-collectFightRandomValue' | '-cfrv') value : change 'normal' percent chance to proc capt'chat fight");
        arm_0.jF("fight ('-setReconnectionTurnTimeout' | '-srtt') value : Change le nombre de tour limite pour se reconnecter en combat");
    }

    private void cCz() {
        int n = Integer.parseInt(this.eJC[0]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)381);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private void cCA() {
        arm_0.aX((short)267);
    }

    private void cCB() {
        int n = Integer.parseInt(this.eJC[0]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)155);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private static void cCC() {
        arm_0.aX((short)396);
    }

    private void cCD() {
        int n = Integer.parseInt(this.eJC[0]);
        ckH ckH2 = new ckH();
        ckH2.KX(n);
        aue_0.cVJ().etu().d(ckH2);
    }

    private static void cCE() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            arm_0.jF("Pas de combat, pas de bonus");
        } else {
            List<enk_0> list = bsj_02.dGQ().eLo().Z(bgt_02.Sn(), bsj_02.aT(bgt_02));
            for (enk_0 enk_02 : list) {
                String string = aum_0.cWf().a(30, (long)enk_02.aZH(), new Object[0]);
                arm_0.jF("Id : " + enk_02.aZH() + " : " + string);
            }
        }
    }

    private static void cCF() {
        arm_0.aX((short)301);
    }

    private static void cCG() {
        arm_0.aX((short)214);
    }

    private void cCH() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)308);
        ayf_22.d(ns_02);
    }

    private static void aX(short s) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q(s);
        ayf_22.d(ns_02);
    }

    private static void cCI() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            arm_0.jI("No player connected.");
        } else if (bgt_02.dkZ() != null) {
            arm_0.jG("Current fight ID: " + bgt_02.dkZ().d());
        } else if (bgt_02.dnB() != null) {
            arm_0.jG("Current spectated fight ID: " + bgt_02.dnB().d());
        } else {
            arm_0.jG("Not in a fight.");
        }
    }
}

