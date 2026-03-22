/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSH
 */
public class ash_0
extends aRY {
    public static final byte eOV = 0;
    public static final byte eOW = 1;
    public static final byte eOX = 2;
    public static final byte eOY = 3;
    private final byte eOZ;
    private final String[] ePa;

    public ash_0() {
        this(0, new String[0]);
    }

    public ash_0(byte by, String ... stringArray) {
        this.eOZ = by;
        this.ePa = stringArray;
    }

    @Override
    public boolean isValid() {
        switch (this.eOZ) {
            case 0: {
                return this.ePa.length == 0;
            }
            case 1: 
            case 2: {
                return this.ePa.length == 2 || this.ePa.length == 3 || this.ePa.length == 4;
            }
            case 3: {
                return this.ePa.length <= 1;
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
        ns_02.C((byte)3);
        switch (this.eOZ) {
            case 0: {
                ash_0.cBS();
                break;
            }
            case 1: {
                ns_02.Q((short)480);
                short s = Short.parseShort(this.ePa[0]);
                if (s <= 0 || s > ax_0.values().length - 1) {
                    aqh_0.cBI().jI("Bad type id. Use \"reward help\" to check which type can be used ! ");
                    return;
                }
                ns_02.R((short)(s + 1));
                ns_02.nX(Integer.parseInt(this.ePa[1]));
                if (this.ePa.length >= 3) {
                    ns_02.cX(Long.parseLong(this.ePa[2]));
                }
                if (this.ePa.length >= 4) {
                    ns_02.cX(Long.parseLong(this.ePa[3]));
                }
                ayf_22.d(ns_02);
                break;
            }
            case 2: {
                ns_02.Q((short)200);
                ns_02.nX(Integer.parseInt(this.ePa[0]));
                ns_02.nX(Integer.parseInt(this.ePa[1]));
                if (this.ePa.length >= 3) {
                    ns_02.cX(Long.parseLong(this.ePa[2]));
                }
                if (this.ePa.length >= 4) {
                    ns_02.cX(Long.parseLong(this.ePa[3]));
                }
                ayf_22.d(ns_02);
                break;
            }
            case 3: {
                long l = bbs_2.xl();
                try {
                    if (this.ePa.length > 0 && this.ePa[0] != null) {
                        l = Long.parseLong(this.ePa[0]);
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                ns_02.Q((short)407);
                ns_02.cX(l);
                fiq_2.gCw().d(fik_2.a(string -> ayf_22.d(ns_02)).vE("Do you really want to clear the rewards of account " + l + " ?").vG(ccp_2.mRE.byf()).abQ(1));
            }
        }
    }

    private static void cBS() {
        aqh_0.cBI().jF("reward :");
        aqh_0.cBI().jF("reward help | h : show this documentation");
        aqh_0.cBI().jF("reward add | a <type> <quantity> : add reward to local player");
        aqh_0.cBI().jF("reward add | a <type> <quantity> <accountId> : add reward to account - can be consume by any character");
        aqh_0.cBI().jF("reward add | a <type> <quantity> <accountId> <characterId> : add reward to character - /!\\ Be careful to use the right account id, or the reward will be lost in the interstellar vacuum");
        aqh_0.cBI().jF("reward addItem | ai <refId> <quantity> : add item to local player");
        aqh_0.cBI().jF("reward addItem | ai <refId> <quantity> <accountId> : add item to account - can be consume by any character");
        aqh_0.cBI().jF("reward addItem | ai <refId> <quantity> <accountId> <characterId> : add item to character - /!\\ Be careful to use the right account id, or the reward will be lost in the interstellar vacuum");
        aqh_0.cBI().jF("reward clear : delete all the rewards of the local account /!\\ Be careful when using this /!\\");
        aqh_0.cBI().jF("reward clear <accountId> : delete all the rewards of the account /!\\ Be careful when using this /!\\");
        aqh_0.cBI().jF("type :\n   1 = xp\n   2 = merit (pvp score)\n   3 = glory orb (pvp money)\n   4 = kama");
    }
}

