/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgC
 */
public final class cgc_0 {
    private static final Logger lTM = Logger.getLogger(cgc_0.class);

    public static <M extends aam_2, Fi extends bsS> void a(int n, ceF<Fi> ceF2) {
        ceJ<cud_0, bsi_0> ceJ2 = switch (n) {
            case 12264 -> new cgd_0();
            case 12621 -> new cge();
            case 12876 -> new cgf();
            case 12750 -> new cgg();
            case 13842 -> new cgB();
            case 13305 -> new cgh();
            case 12275 -> new cgi();
            case 12670 -> new cgk();
            case 13083 -> new cgn();
            case 12389 -> new cgm();
            case 12900 -> new cgv();
            case 13004 -> new cgw();
            case 13203 -> new cgx();
            case 13070 -> new cgy();
            case 13693 -> new cgo();
            case 13628 -> new cgp();
            case 13169 -> new cgq();
            case 13419 -> new cgr();
            case 13127 -> new cgs();
            case 12866 -> new cgu();
            case 13811 -> new cgA();
            case 12846 -> new cge_0();
            case 12330 -> new cgl();
            case 12091 -> new cgz();
            case 12383 -> new cgf_0();
            default -> {
                lTM.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                yield ceL.euK();
            }
        };
        ceJ2.KP(n);
        ceF2.a(ceJ2);
    }
}

