/*
 * Decompiled with CFR 0.152.
 */
public class aSh
extends aRY {
    private int epQ;
    private final byte eNl;
    private long eNm;

    public aSh(byte by) {
        this.eNl = by;
    }

    public aSh(int n, byte by) {
        this.epQ = n;
        this.eNl = by;
    }

    public aSh(int n, byte by, long l) {
        this.epQ = n;
        this.eNl = by;
        this.eNm = l;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        int n;
        azd_2 azd_22;
        ns_0 ns_02 = new ns_0();
        switch (this.eNl) {
            case 1: 
            case 2: 
            case 9: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 16: {
                ns_02.C((byte)3);
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 10: {
                ns_02.C((byte)6);
                break;
            }
            case 15: {
                aSh.cBS();
                return;
            }
            case 17: {
                aSh.cDn();
                return;
            }
        }
        if (this.epQ < 0) {
            azd_22 = aue_0.cVJ().cVK();
            if (azd_22 == null) {
                return;
            }
            n = ((exP)azd_22).ffF().Xt();
        } else {
            n = this.epQ;
        }
        ns_02.Q((short)491);
        ns_02.nX(n);
        ns_02.D(this.eNl);
        ns_02.cX(this.eNm);
        azd_22 = aue_0.cVJ().etu();
        if (azd_22 != null) {
            ((ayf_2)azd_22).d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void cDn() {
        fkL[] fkLArray = fkL.values();
        for (int i = 0; i < fkLArray.length; ++i) {
            fkL fkL2 = fkLArray[i];
            aSh.jF(fkL2.toString());
        }
    }

    private static void cBS() {
        aSh.jF("\"\" : show info about nation");
        aSh.jF("set nationId : set nation of current character");
        aSh.jF("vote info : show info about current vote");
        aSh.jF("vote info nationId : same with another nation");
        aSh.jF("vote start : launch vote");
        aSh.jF("vote start nationId : same with another nation");
        aSh.jF("vote end : finish vote");
        aSh.jF("vote end nationId : same with another nation");
        aSh.jF("cp amount : give amount of citizenship for main's nation");
        aSh.jF("cp nationId amount : give amount of citizenship for specified nation");
        aSh.jF("al nationId alignementId : change nation alignment");
        aSh.jF("(goInPrison | gp) nationId : launch prison feature for nationId");
        aSh.jF("(offenseRem | or) nationId : remove outlaw in nationId");
        aSh.jF("(offenseAdd | oa) nationId : set outlaw in nationId");
        aSh.jF("switchPasseport | sp : Enable or disable passport");
        aSh.jF("setRank rankId : Change character rank");
        aSh.jF("showRanks : show ranks");
    }
}

