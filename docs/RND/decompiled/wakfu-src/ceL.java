/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class ceL {
    private static final Logger lSC = Logger.getLogger(ceL.class);
    private static final ceJ lSD = new cfh_0();

    public static <M extends aam_2, Fi extends bsS> ceJ<M, Fi> euK() {
        return lSD;
    }

    public static <M extends aam_2, Fi extends bsS> void a(int n, ceF<Fi> ceF2) {
        ceJ<cqS, bsj_0> ceJ2 = switch (n) {
            case 12597 -> new ceM();
            case 13432 -> new ceN();
            case 13556 -> new ceP();
            case 13438 -> new ceU();
            case 12625 -> new ceV();
            case 12900 -> new ceW();
            case 13004 -> new ceX();
            case 12310 -> new ceY();
            case 12543 -> new cfb_0();
            case 13328 -> new cfc_0();
            case 12160 -> new cfd_0();
            case 13917 -> new cfe_0();
            case 13419 -> new ceQ();
            case 13127 -> new ceR();
            case 12010 -> new ceT();
            case 13461 -> new ceS();
            case 13811 -> new cff_0();
            case 13923 -> new cfg_0();
            case 13970 -> new cfi_0();
            case 12138 -> new cfj_0();
            case 12107 -> new cfk_0();
            case 12846 -> new cfl_0();
            case 12096 -> new cfm_0();
            case 12522 -> new cfn_0();
            case 12162 -> new ceO();
            case 13674 -> new cfM();
            case 13124 -> new cfB();
            case 13323 -> new cfY();
            default -> {
                lSC.warn((Object)("ATTENTION : l'id de message pass\u00e9 en parametre n'est pas g\u00e9r\u00e9 par la factory : " + n));
                yield lSD;
            }
        };
        ceJ2.KP(n);
        ceF2.a(ceJ2);
    }
}

