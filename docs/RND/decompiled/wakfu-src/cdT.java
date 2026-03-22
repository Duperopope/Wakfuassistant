/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class cdT
implements adi_1 {
    protected static final Logger lRl = Logger.getLogger(cdT.class);
    private static final cdT lRm = new cdT();
    private static final int lRn = 1000000;
    private final Map<Byte, Long> lRo = new HashMap<Byte, Long>();
    private final Map<Byte, Double> lRp = new HashMap<Byte, Double>();
    private final Map<Byte, Double> lRq = new HashMap<Byte, Double>();
    private final Map<Byte, Integer> lRr = new HashMap<Byte, Integer>();

    public static cdT eui() {
        return lRm;
    }

    private cdT() {
    }

    public long cY(byte by) {
        return this.lRo.containsKey(by) ? this.lRo.get(by) : 0L;
    }

    public int cZ(byte by) {
        return this.lRr.containsKey(by) ? this.lRr.get(by) : 0;
    }

    public double da(byte by) {
        return this.lRp.containsKey(by) ? this.lRp.get(by) : 0.0;
    }

    public double db(byte by) {
        return this.lRq.containsKey(by) ? this.lRq.get(by) : 0.0;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 353: {
                nb_1 nb_12 = (nb_1)aam_22;
                switch (nb_12.aWr()) {
                    case 1: {
                        int n = nb_12.aWc();
                        int n2 = n / 60;
                        int n3 = n % 60;
                        String string = aum_0.cWf().c("systemNotification.shutdown.time", n2, n3);
                        aPh.czg().iY(string);
                        dgw.fcT().a(new dgv(dgx.okG, string, 5000));
                        break;
                    }
                    case 2: {
                        String string = aum_0.cWf().c("systemNotification.shutdown.canceled", new Object[0]);
                        aPh.czg().iY(string);
                        dgw.fcT().a(new dgv(dgx.okG, string, 5000));
                        break;
                    }
                    case 3: {
                        String string = nb_12.aWb();
                        aPh.czg().a(string, aPl.exA);
                        dgw.fcT().a(new dgv(dgx.okH, string, this.om(string)));
                        break;
                    }
                    case 9: {
                        Object object;
                        HashMap<Byte, String> hashMap = new HashMap<Byte, String>();
                        for (int i = 0; i < Mv.aVA.size(); ++i) {
                            object = nb_12.aWe();
                            String string = nb_12.aWb();
                            hashMap.put((Byte)object, string);
                        }
                        Mv mv = aum_0.cWf().aUXX();
                        object = (String)hashMap.get(mv.aJr());
                        if (object == null || ((String)object).isEmpty() || ((String)object).isBlank()) {
                            object = (String)hashMap.get(Mv.aVl.aJr());
                        }
                        if (object == null) {
                            lRl.error((Object)"Received a localized system message, but there is no translation available");
                            break;
                        }
                        aPh.czg().a((String)object, aPl.exA);
                        dgw.fcT().a(new dgv(dgx.okH, (String)object, this.om((String)object)));
                        break;
                    }
                    case 11: {
                        String string = nb_12.aWb();
                        String string2 = nb_12.aWb();
                        api_0 api_02 = new api_0(string, string2);
                        api_02.m(aPl.exq);
                        aPh.czg().d(api_02);
                        break;
                    }
                    case 4: {
                        String string = nb_12.aWb();
                        aPh.czg().iZ(string);
                        break;
                    }
                    case 5: {
                        String string = aum_0.cWf().c("systemNotification.moderatedZone.start", new Object[0]);
                        aPh.czg().iZ(string);
                        break;
                    }
                    case 6: {
                        String string = aum_0.cWf().c("systemNotification.moderatedZone.stop", new Object[0]);
                        aPh.czg().iZ(string);
                        break;
                    }
                    case 7: {
                        String string = aum_0.cWf().c("systemNotification.moderatedZone.enter", new Object[0]);
                        aPh.czg().iZ(string);
                        break;
                    }
                    case 8: {
                        String string = aum_0.cWf().c("systemNotification.moderatedZone.leave", new Object[0]);
                        aPh.czg().iZ(string);
                        break;
                    }
                    case 100: {
                        String string = aum_0.cWf().c("error.chat.channelNotFound", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 101: {
                        String string = nb_12.aWb();
                        String string3 = aum_0.cWf().c("error.chat.userNotFound", string);
                        aPh.czg().iY(string3);
                        break;
                    }
                    case 102: {
                        String string = nb_12.aWb();
                        String string4 = aum_0.cWf().c("error.chat.userDoNotDisturb", string);
                        aPh.czg().iY(string4);
                        break;
                    }
                    case 103: {
                        String string = nb_12.aWb();
                        String string5 = aum_0.cWf().c("error.chat.userIgnoreYou", string);
                        aPh.czg().iY(string5);
                        break;
                    }
                    case 104: {
                        String string = aum_0.cWf().c("error.chat.targetIsYourself", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 105: {
                        String string = aum_0.cWf().c("systemNotification.cannotChatWhenMuted", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 106: {
                        String string = aum_0.cWf().c("systemNotification.cannotChatOnGlobalChannels", ejk_0.fxf());
                        aPh.czg().iY(string);
                        break;
                    }
                    case 107: {
                        long l = nb_12.aWf();
                        String string = aum_0.cWf().c("error.chat.channelDelayError", l / 1000L);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 108: {
                        String string = aum_0.cWf().c("error.chat.whileJoiningChannel", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 109: {
                        String string = aum_0.cWf().c("error.chat.whileLeavingChannel", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 140: {
                        aPd.e("error.chat.generalError", new Object[0]);
                        break;
                    }
                    case 141: {
                        aPd.e("error.chat.regularItemNotFound", new Object[0]);
                        break;
                    }
                    case 142: {
                        aPd.e("error.chat.bagNotFound", new Object[0]);
                        break;
                    }
                    case 143: {
                        aPd.e("error.chat.questItemNotFound", new Object[0]);
                        break;
                    }
                    case 144: {
                        aPd.e("error.chat.cosmeticItemNotFound", new Object[0]);
                        break;
                    }
                    case 112: {
                        String string = aum_0.cWf().c("error.chat.restrictedChannel", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 200: {
                        String string = aum_0.cWf().c("error.chat.maxFriendCountReached", 100);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 201: {
                        String string = aum_0.cWf().c("error.chat.maxIgnoredCountReached", 100);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 113: {
                        Mv mv = Mv.y(nb_12.aWe());
                        cdT.v(mv);
                        break;
                    }
                    case 111: {
                        Mv mv = Mv.y(nb_12.aWe());
                        cdT.w(mv);
                        break;
                    }
                    case 115: {
                        aPd.e("error.chat.playerNotInBattleground", new Object[0]);
                        break;
                    }
                    case 199: {
                        String string = aum_0.cWf().c("error.chat.operationNotPermited", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 114: {
                        String string = aum_0.cWf().c("systemNotification.moderatedZone.cannotChat", new Object[0]);
                        aPh.czg().iY(string);
                        break;
                    }
                    case 116: {
                        aPd.e("error.chat.moderatorMessageRemoved", new Object[0]);
                        break;
                    }
                    case 117: {
                        aPd.e("error.chat.pmBetweenTwoAfkPlayers", new Object[0]);
                        break;
                    }
                    case 300: {
                        aPd.e(aua_0.gLO, new Object[0]);
                        break;
                    }
                    case 301: {
                        aPd.e(aua_0.gLP, new Object[0]);
                        break;
                    }
                    case 500: {
                        aPd.f("notification.guild.invitationRefused", nb_12.aWb());
                        break;
                    }
                    default: {
                        lRl.error((Object)("Notification syst\u00e8me inconnue : type=" + nb_12.aWr()));
                    }
                }
                return false;
            }
            case 367: {
                nx_1 nx_12 = (nx_1)aam_22;
                double d2 = (double)(nx_12.aWo() - nx_12.aWl()) / 1000000.0;
                double d3 = (double)(nx_12.aWn() - nx_12.aWm()) / 1000000.0;
                if (nx_12.aWk() == 0 && nx_12.aWj() == 3) {
                    aPd.f("chat.ping", Math.round(d2));
                } else if (nx_12.aWk() > 0) {
                    aqh_0.cBI().jG("Server " + vh_0.ai(nx_12.aWj()) + ": RTT = " + Math.round(d2) + " ms ; PT = " + Math.round(d3) + " ms");
                }
                lRl.info((Object)("Pong! serverGroup=" + nx_12.aWj() + " rtt=" + d2 + " processing=" + d3 + " key=" + nx_12.aWk()));
                this.lRo.put(nx_12.aWj(), System.currentTimeMillis());
                this.lRr.put(nx_12.aWj(), nx_12.aWk());
                this.lRp.put(nx_12.aWj(), d2);
                this.lRq.put(nx_12.aWj(), d3);
                return false;
            }
        }
        return true;
    }

    public static void v(Mv mv) {
        String string = aum_0.cWf().c("error.chat.languageNotActivatedByServer", new Object[0]) + " " + aum_0.cWf().o(mv);
        aPh.czg().iY(string);
    }

    public static void w(Mv mv) {
        String string = aum_0.cWf().c("error.chat.languageNotActivatedByPlayer", new Object[0]) + " " + aum_0.cWf().o(mv);
        aPh.czg().iY(string);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private int om(String string) {
        return 500 + string.length() * 100;
    }
}

