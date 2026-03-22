/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cEb
 */
@fyf_0
public class ceb_2 {
    public static final String PACKAGE = "wakfu.controlCenterFight";
    private static final Logger mUr = Logger.getLogger(ceb_2.class);

    public static void openCloseStateBar(fiq_1 fiq_12) {
        cea_2.openCloseStateBar(fiq_12);
    }

    public static void dropCommand(fiq_1 fiq_12, String string) {
        cea_2.dropCommand(fiq_12, string);
    }

    public static void fightSetDirection(bsj_0 bsj_02, abi_1 abi_12) {
        short s;
        switch (abi_12) {
            case dzq: {
                s = 19132;
                break;
            }
            case dzo: {
                s = 18540;
                break;
            }
            case dzm: {
                s = 16274;
                break;
            }
            case dzk: {
                s = 18450;
                break;
            }
            default: {
                return;
            }
        }
        ceb_2.a(bsj_02, s);
    }

    private static void a(bsj_0 bsj_02, short s) {
        bgy bgy2;
        if (!(fse_1.gFu().dp("isInFightPlacement") || (bgy2 = bsj_02.dGQ().dIA()).dkQ() && !bgy2.djA())) {
            return;
        }
        dae_0.cV(s);
    }

    private static void S(short s, short s2) {
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dkZ();
        if (bsj_02 != null) {
            ceb_2.a(bsj_02, s2);
        } else {
            dae_0.cV(s);
        }
    }

    public static void hoverButton(fiq_1 fiq_12, fad_1 fad_12) {
        if (fad_12.isEnabledFull()) {
            fad_12.getAppearance().gqR();
        }
    }

    public static void exitButton(fiq_1 fiq_12, fad_1 fad_12) {
        if (fad_12.isEnabledFull()) {
            fad_12.getAppearance().gqS();
        }
    }

    public static void pressButton(fiq_1 fiq_12, fad_1 fad_12) {
        if (fad_12.isEnabledFull()) {
            fad_12.getAppearance().gqT();
        }
    }

    public static void releaseButton(fiq_1 fiq_12, fad_1 fad_12) {
        if (fad_12.isEnabledFull()) {
            fad_12.getAppearance().gqU();
        }
    }

    public static void setSouthEastDirection(fiq_1 fiq_12) {
        ceb_2.S((short)18112, (short)18450);
    }

    public static void setSouthWestDirection(fiq_1 fiq_12) {
        ceb_2.S((short)19740, (short)16274);
    }

    public static void setNorthWestDirection(fiq_1 fiq_12) {
        ceb_2.S((short)19284, (short)18540);
    }

    public static void setNorthEastDirection(fiq_1 fiq_12) {
        ceb_2.S((short)17640, (short)19132);
    }

    public static void onHoverBreedSpecificCharacteristic(fiq_1 fiq_12, bhJ bhJ2, frx_1 frx_12, frx_1 frx_13) {
        bfk_2.h(bhJ2).ifPresentOrElse(bMn2 -> cgn_1.showPopup(fiq_12, bMn2, frx_13, (fes_2)fiq_12.gBD()), () -> fyd_0.popup(fiq_12, frx_12));
    }
}

