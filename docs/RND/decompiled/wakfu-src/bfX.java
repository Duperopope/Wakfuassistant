/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fyf_0
public class bfX {
    public static final String PACKAGE = "wakfu.challenge";
    private static final Logger hYP = Logger.getLogger(bfX.class);

    public static void parseInput(flp_2 flp_22, fdu_1 fdu_12, bgp bgp2) {
        bfX.a(fdu_12.getText(), bgp2);
    }

    public static void parseInput(fli_2 fli_22, fdu_1 fdu_12, bgp bgp2) {
        if (fli_22.bCC() != 10) {
            return;
        }
        bfX.a(fdu_12.getText(), bgp2);
    }

    private static void a(String string, bgp bgp2) {
        long l;
        if (BH.aU(string)) {
            return;
        }
        try {
            l = Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            hYP.error((Object)("Non numerical answer " + string), (Throwable)numberFormatException);
            return;
        }
        cns_0 cns_02 = new cns_0();
        cns_02.nG(l);
        cns_02.lW(bgp2.d());
        cns_02.dJ(bgp2.djg());
        cns_02.ju(bgp2.cak());
        aue_0.cVJ().etu().d(cns_02);
        fyw_0.gqw().tc(PACKAGE);
        fyw_0.gqw().tl("challengeInputDialog");
    }
}

