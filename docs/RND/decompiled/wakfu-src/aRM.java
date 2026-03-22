/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.List;

public final class aRM
extends aRY {
    public static final int eLN = 0;
    public static final int eLO = 1;
    public static final int eLP = 3;
    public static final int eLQ = 4;
    public static final int eLR = 5;
    public static final int eLS = 6;
    public static final int eLT = 7;
    public static final int eLU = 8;
    public static final int eLV = 9;
    public static final int eLW = 10;
    private static final short[] eLX = new short[0];
    private final int eLY;
    private final List<Integer> eLZ;
    private final String[] eMa;

    public aRM(int n) {
        this.eLY = n;
        this.eLZ = null;
        this.eMa = null;
    }

    public aRM(int n, String ... stringArray) {
        this.eLY = n;
        this.eMa = stringArray;
        this.eLZ = null;
    }

    public aRM(int n, List<Integer> list) {
        this.eLY = n;
        this.eLZ = list;
        this.eMa = null;
    }

    public aRM(int n, List<Integer> list, String ... stringArray) {
        this.eLY = n;
        this.eLZ = list;
        this.eMa = stringArray;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Requires to be connected!");
            return;
        }
        try {
            switch (this.eLY) {
                case 0: {
                    aRM.cBS();
                    break;
                }
                case 1: {
                    this.reset();
                    break;
                }
                case 3: {
                    this.cDj();
                    break;
                }
                case 4: {
                    aRM.cDi();
                    break;
                }
                case 5: {
                    this.cDh();
                    break;
                }
                case 6: {
                    this.cDg();
                    break;
                }
                case 7: {
                    this.cDf();
                    break;
                }
                case 8: {
                    this.cDe();
                    break;
                }
                case 9: {
                    this.cDd();
                    break;
                }
                case 10: {
                    this.cDc();
                }
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Command error " + String.valueOf(exception));
        }
    }

    private void cDc() {
        int n;
        int n2 = this.eMa != null && this.eMa.length >= 1 && this.eMa[0] != null ? Integer.parseInt(this.eMa[0]) : 0;
        int n3 = n = this.eMa != null && this.eMa.length >= 2 && this.eMa[1] != null ? Integer.parseInt(this.eMa[1]) : 2340;
        if (bEm.dSb().Vd(n) == null) {
            aRM.jI("Unknown item " + n);
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)350);
        ns_02.cX(aqw_0.cCv());
        ns_02.nX(n2);
        ns_02.nX(n);
        aue_0.cVJ().etu().d(ns_02);
    }

    private void cDd() {
        String string = this.eMa[0];
        aRM.jG("===== Results for searching \"" + string + "\"");
        LU lU = new LU();
        boolean bl2 = fcI.a(bbs_2.xl(), (exP2, ffV2, bl) -> {
            if (String.valueOf(ffV2.LV()).contains(string)) {
                aRM.jG(String.format("%s (UID %s) :", ffV2.getName(), aum_0.cWf().cQ(ffV2.LV())));
                aRM.jG(" - \"" + ffV2.fWz() + "\" ");
                lU.aTo();
            }
            return lU.aTn() < 10;
        });
        if (!bl2) {
            aRM.jG("More than 10 matching items found.");
        } else if (lU.aTn() == 0) {
            aRM.jG("No matching items found.");
        }
    }

    private void cDe() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            aqh_0.cBI().jI("No local player !");
            return;
        }
        fb_2 fb_22 = ekj_0.b(bgt_02.aZj(), bgt_02.Sn(), fm_1.pw);
        if (fb_22.AK() != 0) {
            aRM.jF("Equipped costume : " + String.valueOf(fb_22));
        } else {
            aRM.jF("No equipped costume");
        }
    }

    private void cDf() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Requires to be connected!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)210);
        ns_02.nX(7);
        if (this.eMa != null && this.eMa.length >= 1) {
            String string2 = this.eMa[0];
            if (string2 == null) {
                aRM.jI("Error while parsing command to remove cosmetic");
                return;
            }
            ns_02.nX(Integer.parseInt(string2));
            ayf_22.d(ns_02);
        } else {
            fiq_2.gCw().d(fik_2.a(string -> ayf_22.d(ns_02)).vE("You are about to delete ALL the cosmetics of this account. Do you really wish to proceed ?"));
        }
    }

    private void cDg() {
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        fcL.rUh.b(bgt_03.Xi(), bgt_02 -> {
            this.a((bgt_0)bgt_02);
            return true;
        });
    }

    private void a(bgt_0 bgt_02) {
        aRM.jF(bgt_02.getName() + ", id = " + bgt_02.Sn());
        bdl_0 bdl_02 = bgt_02.dno();
        TLongObjectIterator<ffs_0> tLongObjectIterator = bdl_02.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            aRM.jF("Pos : " + ffs_02.eDo() + ", uid : " + ffs_02.Lx());
        }
    }

    private void cDh() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Requires to be connected!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)210);
        ns_02.nX(5);
        ns_02.nX(Integer.parseInt(this.eMa[0]));
        ns_02.nX(Integer.parseInt(this.eMa[1]));
        ayf_22.d(ns_02);
    }

    private static void cDi() {
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        fcL.rUh.b(bgt_03.Xi(), bgt_02 -> {
            aRM.b(bgt_02);
            return true;
        });
    }

    private static void b(bgt_0 bgt_02) {
        aRM.jF(bgt_02.getName() + "'s inventory");
        bdl_0 bdl_02 = bgt_02.dno();
        TLongObjectIterator<ffs_0> tLongObjectIterator = bdl_02.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
            aRM.jF(ffs_02.toString());
            for (ffV ffV2 : ffs_02) {
                aRM.jF(" \t" + String.valueOf(ffV2));
            }
        }
    }

    private void cDj() {
        if (this.eMa == null || this.eMa[0] == null) {
            aRM.zn(3);
        } else {
            long l = Long.parseLong(this.eMa[0]);
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)210);
            ns_02.nX(3);
            ns_02.cX(l);
            aRM.b(ns_02);
        }
    }

    private void reset() {
        if (this.eMa == null || this.eMa[0] == null) {
            aRM.zn(1);
        } else {
            long l = Long.parseLong(this.eMa[0]);
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)210);
            ns_02.nX(1);
            ns_02.cX(l);
            aRM.b(ns_02);
        }
    }

    private static void cBS() {
        aRM.jF("(help | h) : show full documentation");
        aRM.jF("(empty | e) : delete full inventory (except quest inventory)");
        aRM.jF("(empty | e) characterId : delete full inventory (except quest inventory) of an hero");
        aRM.jF("(shuffle | s) : Shuffle items");
        aRM.jF("(shuffle | s) characterId : Shuffle items of an hero");
        aRM.jF("(describe | desc) : show text of inventory");
        aRM.jF("(showBagsUid | sbu) : show text of bags uid");
        aRM.jF("(removeRefItem | rri) refId qty : destroy qty of specified item. qty < 0 to destroy all");
        aRM.jF("(removeCosmetic | rc) refID : Remove known cosmetic from id or emote/title based on scroll id");
        aRM.jF("(removeCosmetics) : Remove all known cosmetics");
        aRM.jF("(checkCostume) : Display costume info if one is equiped on current character");
        aRM.jF("(get) &lt;item uid&gt; : get the item data of items whose UID contains the specified one");
        aRM.jF("(fill) &lt;freeSpaces=0&gt; &lt;refId=2340&gt; : fill every slots of the inventory except the specified amount with the specified item");
    }

    private static void zn(int n) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)210);
        ns_02.nX(n);
        aRM.b(ns_02);
    }

    private static void b(ns_0 ns_02) {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ayf_22.d(ns_02);
    }
}

