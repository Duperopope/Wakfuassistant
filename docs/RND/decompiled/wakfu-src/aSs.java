/*
 * Decompiled with CFR 0.152.
 */
public class aSs
extends aRY {
    public static final byte eOj = 0;
    public static final byte eOk = 1;
    public static final byte eOl = 2;
    public static final byte eOm = 3;
    public static final byte eOn = 4;
    public static final byte eOo = 5;
    public static final byte eOp = 6;
    private final byte eOq;
    private final String[] eOr;

    public aSs() {
        this(0, new String[0]);
    }

    public aSs(byte by, String ... stringArray) {
        this.eOq = by;
        this.eOr = stringArray;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        switch (this.eOq) {
            case 0: {
                aSs.cBS();
                break;
            }
            case 2: {
                this.cDr();
                break;
            }
            case 3: {
                this.cDs();
                break;
            }
            case 1: {
                this.cDt();
                break;
            }
            case 4: {
                aSs.cDu();
                break;
            }
            case 5: {
                aSs.cDv();
                break;
            }
            case 6: {
                this.cDq();
            }
        }
    }

    private static void cBS() {
        aqh_0.cBI().jF("pvp :");
        aqh_0.cBI().jF("pvp help | h : show this documentation");
        aqh_0.cBI().jF("pvp set <amount> : set player's PvP points");
        aqh_0.cBI().jF("pvp add <amount> : add amount to player's PvP points");
        aqh_0.cBI().jF("pvp state <type> : change pvp state (0 : disabled, 1 : prudent, 2 : opportunistic");
        aqh_0.cBI().jF("pvp recomputepoints | rp : start the weekly points calc /!\\ ranks are recomputed WITH the weekly loss of points");
        aqh_0.cBI().jF("pvp rr : reset the regression score of all the players");
        aqh_0.cBI().jF("pvp addMoney | am : add PvP money");
    }

    private void cDq() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)28);
        ns_02.nX(Bw.m(this.eOr[0]));
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void cDr() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)391);
        ns_02.nX(Bw.m(this.eOr[0]));
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void cDs() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)154);
        ns_02.nX(Bw.m(this.eOr[0]));
        aue_0.cVJ().etu().d(ns_02);
    }

    private void cDt() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)463);
        ns_02.nX(Bw.m(this.eOr[0]));
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void cDu() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)479);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void cDv() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)486);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

