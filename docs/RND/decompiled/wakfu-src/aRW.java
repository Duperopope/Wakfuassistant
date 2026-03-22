/*
 * Decompiled with CFR 0.152.
 */
public class aRW
extends aRY {
    public static final int eMy = 0;
    public static final int eMz = 1;
    public static final int eMA = 2;
    public static final int eMB = 3;
    public static final int eMC = 4;
    public static final int eMD = 5;
    public static final int eME = 6;
    public static final int eMF = 7;
    public static final int eMG = 8;
    public static final int eMH = 9;
    public static final int eMI = 10;
    public static final int eMJ = 11;
    public static final int eMK = 12;
    public static final int eML = 13;
    private final int eMM;
    private final Object[] eMN;

    public aRW(int n, Object ... objectArray) {
        this.eMM = n;
        this.eMN = objectArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eMM) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 9: 
            case 10: 
            case 12: 
            case 13: {
                return true;
            }
            case 4: {
                return this.eMN.length >= 1 && (Integer)this.eMN[0] > 0;
            }
            case 5: {
                if (this.eMN.length < 4) {
                    return false;
                }
                if ((Integer)this.eMN[0] <= 0) {
                    return false;
                }
                if ((Integer)this.eMN[1] < 0 || (Integer)this.eMN[1] > 4) {
                    return false;
                }
                if ((Long)this.eMN[2] < 0L) {
                    return false;
                }
                return (Integer)this.eMN[3] >= -1;
            }
            case 6: {
                return this.eMN.length >= 2 && (Integer)this.eMN[0] > 0 && (Integer)this.eMN[1] >= -1;
            }
            case 7: 
            case 8: {
                return this.eMN.length >= 1 && (Long)this.eMN[0] > 0L;
            }
            case 11: {
                return this.eMN.length >= 1;
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
        ns_0 ns_02 = new ns_0();
        switch (this.eMM) {
            case 0: {
                aRW.cBS();
                break;
            }
            case 1: {
                ns_02.C((byte)3);
                ns_02.Q((short)304);
                ayf_22.d(ns_02);
                break;
            }
            case 2: {
                ns_02.C((byte)6);
                ns_02.Q((short)213);
                ns_02.aN(false);
                ayf_22.d(ns_02);
                break;
            }
            case 3: {
                ns_02.C((byte)6);
                ns_02.Q((short)213);
                ns_02.aN(true);
                ayf_22.d(ns_02);
                break;
            }
            case 4: {
                ns_02.C((byte)6);
                ns_02.Q((short)188);
                ns_02.nX((Integer)this.eMN[0]);
                ayf_22.d(ns_02);
                break;
            }
            case 5: {
                ns_02.C((byte)6);
                ns_02.Q((short)218);
                ns_02.nX((Integer)this.eMN[0]);
                ns_02.nX((Integer)this.eMN[1]);
                ns_02.cX((Long)this.eMN[2]);
                ns_02.nX((Integer)this.eMN[3]);
                ayf_22.d(ns_02);
                break;
            }
            case 6: {
                ns_02.C((byte)6);
                ns_02.Q((short)111);
                ns_02.nX((Integer)this.eMN[0]);
                ns_02.nX((Integer)this.eMN[1]);
                ayf_22.d(ns_02);
                break;
            }
            case 7: {
                ns_02.C((byte)6);
                ns_02.Q((short)157);
                ns_02.cX((Long)this.eMN[0]);
                ayf_22.d(ns_02);
                break;
            }
            case 8: {
                ns_02.C((byte)6);
                ns_02.Q((short)234);
                ns_02.cX((Long)this.eMN[0]);
                ayf_22.d(ns_02);
                break;
            }
            case 9: {
                ns_02.C((byte)3);
                ns_02.Q((short)77);
                ayf_22.d(ns_02);
                break;
            }
            case 10: {
                ns_02.C((byte)6);
                ns_02.Q((short)395);
                ayf_22.d(ns_02);
                break;
            }
            case 11: {
                ns_02.C((byte)6);
                ns_02.Q((short)428);
                ns_02.aN((Boolean)this.eMN[0]);
                ayf_22.d(ns_02);
                break;
            }
            case 12: {
                ns_02.C((byte)6);
                ns_02.Q((short)464);
                ayf_22.d(ns_02);
                break;
            }
            case 13: {
                ns_02.C((byte)6);
                ns_02.Q((short)429);
                fiq_2.gCw().d(fik_2.a(string -> ayf_22.d(ns_02)).vE("Are you sure you want to run this command ?"));
            }
        }
    }

    private static void cBS() {
        aRW.jF("=== General");
        aRW.jF("market help : show help");
        aRW.jF("market ping : display the most recent ping values");
        aRW.jF("market maintenance : indicates whether the market server is in maintenance mode");
        aRW.jF("market maintenance &lt;true|false&gt; : activate/deactivate the market server maintenance mode");
        aRW.jF("market mon : returns information about the market server");
        aRW.jF("=== Prices");
        aRW.jF("market (prices refresh | pref) : resend the cached prices to the moderator");
        aRW.jF("market (prices reload | prel) : reload the prices from the market server, cache them, and sends them to the moderator");
        aRW.jF("market (prices get | pg) &lt;item id&gt; : display all the prices of the item");
        aRW.jF("market (prices set | ps) &lt;item id&gt; &lt;slot count&gt; &lt;price&gt; : set the price of the item with the slot count (a reload is necessary afterwards to update the prices)");
        aRW.jF("market (prices set | ps) &lt;item id&gt; &lt;slot count&gt; &lt;price&gt; &lt;sold count&gt; : set the price of the item with the slot count and the sold count (a reload is necessary afterwards to update the prices)");
        aRW.jF("market (prices delete | pd) &lt;item id&gt; : delete all prices of the item (a reload is necessary afterwards to update the prices)");
        aRW.jF("market (prices delete | pd) &lt;item id&gt; &lt;slot count&gt; : delete the price of the item with the slot count (a reload is necessary afterwards to update the prices)");
        aRW.jF("=== Blacklist");
        aRW.jF("market (blacklist | bl) : display the accounts currently in the market blacklist");
        aRW.jF("market (blacklist add | bla) &lt;acc id&gt; : add an account to the market blacklist");
        aRW.jF("market (blacklist remove | blr) &lt;acc id&gt; : remove an account from the market blacklist");
    }
}

