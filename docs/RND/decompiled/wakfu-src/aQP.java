/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public final class aQP
extends aRY {
    private static final Logger eHn = Logger.getLogger(aQP.class);
    public static final int eHo = 0;
    public static final int eHp = 1;
    public static final int eHq = 2;
    public static final int eHr = 3;
    public static final int eHs = 4;
    public static final int eHt = 5;
    public static final int eHu = 6;
    public static final int eHv = 7;
    public static final int eHw = 8;
    public static final int eHx = 9;
    public static final int eHy = 12;
    public static final int eHz = 13;
    public static final int eHA = 14;
    public static final int eHB = 15;
    public static final int eHC = 16;
    public static final int eHD = 17;
    public static final int eHE = 18;
    private final int eHF;
    private final String[] eHG;

    public aQP(int n, String ... stringArray) {
        this.eHF = n;
        this.eHG = (String[])stringArray.clone();
    }

    @Override
    public boolean isValid() {
        switch (this.eHF) {
            case 0: 
            case 3: 
            case 4: 
            case 6: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                return this.eHG.length == 0;
            }
            case 1: 
            case 2: 
            case 7: 
            case 9: 
            case 12: {
                return this.eHG.length == 1;
            }
            case 5: 
            case 8: 
            case 18: {
                return this.eHG.length == 2;
            }
            case 17: {
                return this.eHG.length == 4;
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
            switch (this.eHF) {
                case 0: {
                    aQP.cBS();
                    return;
                }
                case 1: {
                    this.cCp();
                    return;
                }
                case 3: {
                    aQP.cCo();
                    return;
                }
                case 4: {
                    this.clear();
                    return;
                }
                case 5: {
                    this.cCn();
                    return;
                }
                case 6: {
                    this.cCm();
                    return;
                }
                case 7: {
                    this.cCl();
                    return;
                }
                case 8: {
                    this.cCk();
                    return;
                }
                case 9: {
                    this.cCj();
                    return;
                }
                case 12: {
                    this.cCh();
                    return;
                }
                case 18: {
                    this.cCi();
                    return;
                }
                case 13: {
                    aQP.cCf();
                    return;
                }
                case 14: {
                    aQP.cCg();
                    return;
                }
                case 15: {
                    aQP.cCe();
                    return;
                }
                case 16: {
                    aQP.cCd();
                    return;
                }
                case 17: {
                    this.cCc();
                    return;
                }
            }
        }
        catch (Exception exception) {
            eHn.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void cCc() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)328);
        ns_02.nX(Integer.parseInt(this.eHG[0]));
        ns_02.nX(Integer.parseInt(this.eHG[1]));
        ns_02.nX(Integer.parseInt(this.eHG[2]));
        ns_02.nX(Integer.parseInt(this.eHG[3]));
        ayf_22.d(ns_02);
    }

    private static void cCd() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eJX.qAX.pW(bgt_02.aZj());
        cts_1.ePE();
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)6);
        ns_02.Q((short)476);
        ayf_22.d(ns_02);
    }

    private static void cCe() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)380);
        ayf_22.d(ns_02);
    }

    private static void cCf() {
        aQP.jG("[CLIENT] Free companion: " + eKb.qBe.eFY());
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.Q((short)108);
        ns_02.C((byte)2);
        ayf_22.d(ns_02);
        ns_02.C((byte)3);
        ayf_22.d(ns_02);
    }

    private static void cCg() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)14);
        ayf_22.d(ns_02);
    }

    private void cCh() {
        short s = Short.parseShort(this.eHG[0]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.R(s);
        ns_02.C((byte)2);
        ns_02.Q((short)182);
        ayf_22.d(ns_02);
    }

    private void cCi() {
        int n = Integer.parseInt(this.eHG[0]);
        boolean bl = Boolean.parseBoolean(this.eHG[1]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.nX(n);
        ns_02.aN(bl);
        ns_02.C((byte)6);
        ns_02.Q((short)433);
        ayf_22.d(ns_02);
    }

    private void cCj() {
        long l = Long.parseLong(this.eHG[0]);
        cjw cjw2 = new cjw(l);
        aue_0.cVJ().etu().d(cjw2);
    }

    private void cCk() {
        long l = Long.parseLong(this.eHG[0]);
        long l2 = Long.parseLong(this.eHG[1]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)283);
        ns_02.cX(l);
        ns_02.cX(l2);
        ayf_22.d(ns_02);
    }

    private void cCl() {
        long l = Long.parseLong(this.eHG[0]);
        cjz cjz2 = new cjz(l);
        aue_0.cVJ().etu().d(cjz2);
    }

    private void cCm() {
        aQP.aV((short)183);
    }

    private void cCn() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)45);
        long l = Long.parseLong(this.eHG[0]);
        ns_02.cX(l);
        ns_02.cT(this.eHG[1]);
        ayf_22.d(ns_02);
    }

    private void clear() {
        aQP.aV((short)449);
    }

    private static void aV(short s) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q(s);
        ayf_22.d(ns_02);
    }

    private static void cCo() {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        List<eJS> list = eJN.qAF.pP(aUQ2.xl());
        if (list == null || list.isEmpty()) {
            aQP.jF("Aucun compagnon");
            return;
        }
        for (eJS eJS2 : list) {
            aQP.jF(eJS2.toString() + "\n");
        }
    }

    private void cCp() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)13);
        int n = Integer.parseInt(this.eHG[0]);
        ns_02.nX(n);
        ayf_22.d(ns_02);
    }

    private static void cBS() {
        aQP.jF("(companion | comp) (help | h) : show help");
        aQP.jF("(companion | comp) (list | l) : show available companions");
        aQP.jF("(companion | comp) (clear | c) : clear companions list");
        aQP.jF("(companion | comp) (add | a) breedId : add companion of given id");
        aQP.jF("(companion | comp) (rename | re) id \"nom\" : rename companion of given id ");
        aQP.jF("(companion | comp) (update | u) : update companion list");
        aQP.jF("(companion | comp) (toItem | ti) id : untie companion of given id");
        aQP.jF("(companion | comp) (addXp | xp) id xpToAdd : add xp to companion of given id");
        aQP.jF("(companion | comp) (addToGroup | atg) id : add companion to group");
        aQP.jF("(companion | comp) (addEquipment | equip) id pos itemUid: add item on companion inventory at specified position");
        aQP.jF("(companion | comp) (removeEquipment | rvequip) id itemUid bagId pos : unequip item of companion and put it on bag position given");
        aQP.jF("(companion | comp) (setFreeCompanion | free) breedId : change default free companion, update free companion cycle reference date");
        aQP.jF("(companion | comp) (setFreeCompanionCycle | sfcc) second minute hour day : change free companion cycle duration");
        aQP.jF("(companion | comp) (showFree | sfree) : show current free companion id");
        aQP.jF("(companion | comp) (nextFree) : finish free companion current time and launch next, update free companion cycle reference date");
        aQP.jF("(companion | comp) (setCompanionToMaxXp | maxxp) : enable or disable companion max xp");
        aQP.jF("(companion | comp) (changeUnlockGroupLimit | groupLimit | gl) : enable or disable max companion number in a group.");
        aQP.jF("(companion | comp) (changeAvailableStatus | cas) breedId <available>: enable or disable this companion for all players (true = available)");
    }
}

