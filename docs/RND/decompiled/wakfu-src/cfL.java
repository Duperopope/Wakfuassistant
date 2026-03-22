/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cfL {
    private static final Logger lTe = Logger.getLogger(cfL.class);

    public static <M extends aam_2, Fi extends bsS> void a(int n, ceF<Fi> ceF2) {
        ceJ<coe, bsj_0> ceJ2 = switch (n) {
            case 12461 -> new cfo();
            case 12876 -> new cfp();
            case 13916 -> new cfr_0();
            case 12022 -> new cfF();
            case 13192 -> new cfE();
            case 13251 -> new cfw_0();
            case 12683 -> new cfy_0();
            case 12275 -> new cfA();
            case 13124 -> new cfB();
            case 13083 -> new cfD();
            case 13141 -> new cfH();
            case 12930 -> new cfI();
            case 13203 -> new cfJ();
            case 12866 -> new cfG();
            case 13842 -> new cfN();
            case 12913 -> new cfp_0();
            case 13015 -> new cfq_0();
            case 13079 -> new cfR();
            case 12264 -> new cfW();
            case 13323 -> new cfY();
            case 13503 -> new cgb_0();
            case 12383 -> new cfz_0();
            case 12120 -> new cfK();
            case 12514 -> new cfS();
            case 13305 -> new cfz();
            case 12381 -> new cfq();
            case 13976 -> new cft_0();
            case 13859 -> new cfu();
            case 12433 -> new cfs_0();
            case 12209 -> new cfx();
            case 13475 -> new cfx_0();
            case 12703 -> new cfo_0();
            case 13512 -> new cAh();
            default -> {
                lTe.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                yield ceL.euK();
            }
        };
        ceJ2.KP(n);
        ceF2.a(ceJ2);
    }
}

