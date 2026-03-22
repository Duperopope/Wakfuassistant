/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class buK {
    private static final Logger jqF = Logger.getLogger(buK.class);
    private static final buK jqG = new buK();
    private static final int jqH = 45;
    private static final int jqI = 376;
    public static final int jqJ = 46;
    public static final int jqK = 377;
    private static final String jqL = "generatedGuildEmblem-%d-%d";
    private static final axa_2 jqM = new axa_2(true);

    private buK() {
    }

    public static buK dJw() {
        return jqG;
    }

    private String FA(int n) {
        n = GC.a(n, 0, 45);
        try {
            return String.format(auc_0.cVq().bS("guildBlazonBackgroundPartPath"), n);
        }
        catch (fu_0 fu_02) {
            jqF.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 guildBlazonBackgroundPartPath");
            return null;
        }
    }

    private String FB(int n) {
        n = GC.a(n, 0, 376);
        try {
            return String.format(auc_0.cVq().bS("guildBlazonForegroundPartPath"), n);
        }
        catch (fu_0 fu_02) {
            jqF.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 guildBlazonForegroundPartPath");
            return null;
        }
    }

    public awk_1 a(buJ buJ2) {
        long l = buJ2.dJu();
        awk_1 awk_12 = awm_1.bPn().gB(l);
        if (awk_12 != null) {
            return awk_12;
        }
        String[] stringArray = new String[]{this.FA(buJ2.dJp()), this.FB(buJ2.dJq())};
        axc_2 axc_22 = new axc_2();
        axc_22.p(stringArray);
        jqM.d(buJ2.dJs().bQf(), buJ2.dJs().bQg(), buJ2.dJs().bQh(), buJ2.dJs().bQe());
        axc_22.a(0, jqM);
        jqM.d(buJ2.dJr().bQf(), buJ2.dJr().bQg(), buJ2.dJr().bQh(), buJ2.dJr().bQe());
        axc_22.a(1, jqM);
        axc_22.bQw();
        awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), l, axc_22, true);
        axc_22.bsI();
        return awk_12;
    }

    public awk_1 b(int n, axb_2 axb_22) {
        String string = String.format(jqL, n, axb_22.aTn());
        int n2 = string.hashCode();
        awk_1 awk_12 = awm_1.bPn().gB(n2);
        if (awk_12 != null) {
            return awk_12;
        }
        String[] stringArray = new String[]{this.FB(n)};
        axc_2 axc_22 = new axc_2();
        axc_22.p(stringArray);
        jqM.d(axb_22.bQf(), axb_22.bQg(), axb_22.bQh(), axb_22.bQe());
        axc_22.a(0, jqM);
        axc_22.bQw();
        awk_12 = awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)n2, axc_22, true);
        axc_22.bsI();
        return awk_12;
    }

    public buJ dJx() {
        int n = GC.q(0, 46);
        int n2 = GC.q(0, 377);
        int n3 = buH.dJn().bQN();
        axb_2 axb_22 = buH.dJn().Fz(GC.mR(n3));
        axb_2 axb_23 = buH.dJn().Fz(GC.mR(n3));
        return new buJ((short)n, (short)n2, axb_22, axb_23);
    }

    public void b(buJ buJ2) {
        short s = buJ2.dJp();
        s = (short)((s + 1) % 46);
        buJ2.bM(s);
    }

    public void c(buJ buJ2) {
        short s = buJ2.dJp();
        s = (short)((46 + s - 1) % 46);
        buJ2.bM(s);
    }

    public void d(buJ buJ2) {
        short s = buJ2.dJq();
        s = (short)((s + 1) % 377);
        buJ2.bN(s);
    }

    public void e(buJ buJ2) {
        short s = buJ2.dJq();
        s = (short)((377 + s - 1) % 377);
        buJ2.bN(s);
    }
}

