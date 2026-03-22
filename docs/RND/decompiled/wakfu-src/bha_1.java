/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHA
 */
public final class bha_1 {
    private bha_1() {
    }

    @Nullable
    public static String b(fja fja2) {
        Object object;
        switch (fja2) {
            case svm: {
                object = "HPShort";
                break;
            }
            case svn: {
                object = "APShort";
                break;
            }
            case svo: {
                object = "MPShort";
                break;
            }
            case svp: {
                object = "WPShort";
                break;
            }
            case svq: 
            case svr: 
            case svt: 
            case svv: 
            case svx: 
            case svE: 
            case svF: 
            case svH: 
            case svJ: 
            case svL: {
                object = "market.characteristics." + fja2.name();
                break;
            }
            case svz: 
            case svA: 
            case svB: 
            case svC: 
            case svD: 
            case svN: 
            case svO: 
            case svP: 
            case svQ: 
            case svR: 
            case svS: 
            case svT: 
            case svU: 
            case svV: 
            case svW: 
            case svX: 
            case svY: {
                object = fja2.gaB().name();
                break;
            }
            default: {
                return null;
            }
        }
        return aum_0.cWf().c((String)object, new Object[0]);
    }

    @Nullable
    public static String c(fja fja2) {
        switch (fja2) {
            case svq: {
                return "iconSword";
            }
            case svr: {
                return "smallFireElement";
            }
            case svt: {
                return "smallEarthElement";
            }
            case svv: {
                return "smallWaterElement";
            }
            case svx: {
                return "smallAirElement";
            }
            case svE: {
                return "iconShield";
            }
            case svF: {
                return "smallFireResistance";
            }
            case svH: {
                return "smallEarthResistance";
            }
            case svJ: {
                return "smallWaterResistance";
            }
            case svL: {
                return "smallAirResistance";
            }
            case svm: 
            case svn: 
            case svo: 
            case svp: 
            case svz: 
            case svA: 
            case svB: 
            case svC: 
            case svD: 
            case svN: 
            case svO: 
            case svP: 
            case svQ: 
            case svR: 
            case svS: 
            case svT: 
            case svU: 
            case svV: 
            case svW: 
            case svX: 
            case svY: {
                return "icon" + fja2.gaB().name();
            }
        }
        return null;
    }
}

