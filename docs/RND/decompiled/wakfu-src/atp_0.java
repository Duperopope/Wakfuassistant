/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  org.apache.log4j.Logger
 */
import com.google.common.primitives.Ints;
import org.apache.log4j.Logger;

/*
 * Renamed from aTp
 */
public final class atp_0
extends aRY {
    private static final Logger eRk = Logger.getLogger(atp_0.class);
    public static final int eRl = 0;
    public static final int eRm = 1;
    public static final int eRn = 2;
    public static final int eRo = 5;
    public static final int eRp = 6;
    public static final int eRq = 7;
    public static final int eRr = 8;
    public static final int eRs = 9;
    public static final int eRt = 10;
    public static final int eRu = 11;
    public static final int eRv = 12;
    public static final int eRw = 13;
    public static final int eRx = 14;
    private final int eRy;
    private final String[] eRz;
    private String ePk;
    private String ePl;

    public atp_0(int n, String ... stringArray) {
        this.eRy = n;
        this.eRz = (String[])stringArray.clone();
    }

    private static void cBS() {
        atp_0.jF("(systemConfiguration | sysConf) (help | h) : show full documentation");
        atp_0.jF("(systemConfiguration | sysConf) (playerLevelCap) \"value\" : set level cap to specified value");
        atp_0.jF("(systemConfiguration | sysConf) (clientPathScheduling' | cps) \"true|false\" : enable/disable path request optimisation");
        atp_0.jF("(systemConfiguration | sysConf) (show) \"target\" \"confKey\" : show confKey state in target server (target = world, game, connection or global)");
        atp_0.jF("(systemConfiguration | sysConf) (havenWorldLimit' | hwl) \"limit\" : set limit for simultaneous opened haven worlds");
        atp_0.jF("(systemConfiguration | sysConf) (havenWorldTtl' | hwttl) \"limit\" : set ttl for haven worlds");
        atp_0.jF("(systemConfiguration | sysConf) (havenWorldGameServer' | hwgs) \"gameId\" : set game server for haven worlds");
        atp_0.jF("(systemConfiguration | sysConf) (globalChat) \"true|false\" : set global chat enabled/disabled");
        atp_0.jF("(systemConfiguration | sysConf) (globalChatTradeDelay | gctd) \"valueInMs\" : set global chat delay for trade");
        atp_0.jF("(systemConfiguration | sysConf) (globalChatCommunityDelay | gccd) \"valueInMs\" : set global chat delay for trade");
        atp_0.jF("(systemConfiguration | sysConf) (globalChatRecruitmentDelay | gcrd) \"valueInMs\" : set global chat delay for trade");
        atp_0.jF("(systemConfiguration | sysConf) (modifyConf) \"propertyKey\" \"propertyValue\" : set system property by name. This command should only be used by a developer or with the approval of one.");
        atp_0.jF("(systemConfiguration | sysConf) (singleAccount | sa) \"true|false\" : set/unset the server as single account and single character");
        atp_0.jF("");
        atp_0.jF("Date syntax : dd/mm/yyyy hh:mm. Date can be added at the end of the command to time it later (or for a duration)");
    }

    @Override
    public boolean isValid() {
        switch (this.eRy) {
            case 0: {
                return this.eRz.length == 0;
            }
            case 1: {
                return this.eRz.length == 2;
            }
            case 5: 
            case 10: 
            case 11: 
            case 12: {
                return this.eRz.length >= 1 && Ints.tryParse((String)this.eRz[0]) != null;
            }
            case 2: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 14: {
                return this.eRz.length >= 1;
            }
            case 13: {
                return this.eRz.length >= 2;
            }
        }
        return false;
    }

    private void cDQ() {
        switch (this.eRy) {
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: {
                if (this.eRz.length >= 3) {
                    this.ePk = this.eRz[1];
                    this.ePl = this.eRz[2];
                }
                return;
            }
            case 13: {
                if (this.eRz.length >= 4) {
                    this.ePk = this.eRz[2];
                    this.ePl = this.eRz[3];
                }
                return;
            }
        }
    }

    private void aY(short s) {
        this.cDQ();
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q(s);
        ns_02.cT(this.eRz[0]);
        if (s == 496) {
            ns_02.cT(this.eRz[1]);
        }
        if (this.ePk != null && this.ePl != null) {
            uw_0 uw_02 = arz_0.jT(this.ePk);
            uw_0 uw_03 = arz_0.jT(this.ePl);
            if (uw_02 == null || uw_03 == null) {
                aqh_0.cBI().jI("Syntax error in dates - try 'setBonusFactor help' and review your syntax");
                return;
            }
            ns_02.cX(uw_02.bjB());
            ns_02.cX(uw_03.bjB());
        }
        ayf_22.d(ns_02);
    }

    private void cDD() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        String string = this.eRz[0];
        if (string.equals("world")) {
            ns_02.C((byte)2);
        } else if (string.equals("global")) {
            ns_02.C((byte)6);
        } else if (string.equals("game")) {
            ns_02.C((byte)3);
        } else if (string.equals("connection")) {
            ns_02.C((byte)1);
        } else {
            atp_0.jF("Cible inconnue : (target = world, game, connection ou global)");
            return;
        }
        ns_02.Q((short)65);
        ns_02.cT(this.eRz[1]);
        ayf_22.d(ns_02);
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.eRy) {
                case 0: {
                    atp_0.cBS();
                    return;
                }
                case 1: {
                    this.cDD();
                    return;
                }
                case 5: {
                    this.aY((short)450);
                    return;
                }
                case 2: {
                    this.aY((short)253);
                    return;
                }
                case 6: {
                    this.aY((short)246);
                    return;
                }
                case 7: {
                    this.aY((short)190);
                    return;
                }
                case 8: {
                    this.aY((short)369);
                    return;
                }
                case 9: {
                    this.aY((short)159);
                    return;
                }
                case 10: {
                    this.aY((short)233);
                    return;
                }
                case 11: {
                    this.aY((short)390);
                    return;
                }
                case 12: {
                    this.aY((short)415);
                    return;
                }
                case 13: {
                    this.aY((short)496);
                    return;
                }
                case 14: {
                    this.aY((short)327);
                    return;
                }
            }
        }
        catch (Exception exception) {
            eRk.error((Object)"Exception levee", (Throwable)exception);
        }
    }
}

