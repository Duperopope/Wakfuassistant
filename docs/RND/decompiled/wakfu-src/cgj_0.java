/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgJ
 */
public final class cgj_0 {
    private static final Logger lTO = Logger.getLogger(cgj_0.class);

    public static <M extends aam_2, Fi extends bsS> void a(int n, ceF<Fi> ceF2) {
        ceJ<crr, bsj_0> ceJ2 = switch (n) {
            case 12383 -> new cgk_0();
            case 12275 -> new cgg_0();
            case 12120 -> new cgh_0();
            case 12514 -> new cfS();
            case 13859 -> new cfu();
            case 12433 -> new cfs_0();
            case 13251 -> new cfw_0();
            case 12866 -> new cgi_0();
            case 13236 -> new cga_0();
            default -> {
                lTO.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                yield ceL.euK();
            }
        };
        ceJ2.KP(n);
        ceF2.a(ceJ2);
    }
}

