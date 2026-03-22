/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aIz {
    private static final Logger dYx = Logger.getLogger(aIz.class);
    private static final int dYy = 50000;
    private static final int dYz = 6000;
    private static final int dYA = 70000;
    private static final int dYB = 15000;
    private static final int dYC = 141000;
    private static final int dYD = 50000;
    private static final int dYE = 6000;
    private static final int dYF = 70000;
    private static final int dYG = 15000;
    private static final int dYH = 141000;

    public static String cgO() {
        try {
            return auc_0.cVq().bS("shadersPath");
        }
        catch (fu_0 fu_02) {
            dYx.error((Object)"", (Throwable)fu_02);
            return "";
        }
    }

    public static int h(aca aca2) {
        abW abW2 = new abW(aIz.cgO() + "death.cgfx", "death0");
        abW2.bY(true);
        aIz.a(abW2, aca2);
        return abW2.d();
    }

    public static int cgP() {
        abW abW2 = new abW(aIz.cgO() + "death.cgfx", "death0");
        aIz.a(abW2, new abX(3000));
        return abW2.d();
    }

    public static int cgQ() {
        abW abW2 = new abW(aIz.cgO() + "incarnam.cgfx", "incarnam");
        aIz.a(abW2, new aca(1.0f));
        return abW2.d();
    }

    public static int cgR() {
        abW abW2 = new abW(aIz.cgO() + "bag.cgfx", "bag");
        aIz.a(abW2, new aca(1.0f));
        return abW2.d();
    }

    public static int cgS() {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("radius", asf_1.cZr));
        aIA aIA2 = new aIA(aIz.cgO() + "ogrest.cgfx", "ogrest", asl_12);
        aIz.a(aIA2, new aca(1.0f));
        return aIA2.d();
    }

    public static int cgT() {
        abW abW2 = new abW(aIz.cgO() + "zinit.cgfx", "zinit");
        aIz.a(abW2, new aca(1.0f));
        return abW2.d();
    }

    public static int cgU() {
        abW abW2 = new abW(aIz.cgO() + "mine.cgfx", "mine");
        aIz.a(abW2, new aca(1.0f));
        return abW2.d();
    }

    public static int cgV() {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("position", asf_1.cZs));
        aIC aIC2 = new aIC(aIz.cgO() + "moon_light.cgfx", "moon_light", asl_12, asl_12);
        aIz.a(aIC2, new aca(1.0f));
        return aIC2.d();
    }

    public static int cgW() {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs));
        asl_12.c("gStrength", 1.0f);
        aID aID2 = new aID(aIz.cgO() + "postprocess.cgfx", "shukrute1", asl_12, asl_12);
        aIz.a(aID2, new aca(1.0f));
        return aID2.d();
    }

    public static void a(abW abW2, aca aca2) {
        abW2.b(aie_0.cfn().bmC().bqL());
        abW2.a(aca2);
        ast_1.bJG().a(abW2);
    }

    public static void yD(int n) {
        ass_1 ass_12 = ast_1.bJG().uo(n);
        if (ass_12 != null) {
            ass_12.rz(500);
        }
    }

    public static int cgX() {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        asl_12.c("gStrength", 1.0f);
        aIE aIE2 = new aIE(aIz.cgO() + "brume.cgfx", "brume", asl_12, asl_12);
        aIz.a(aIE2, new aca(1.0f));
        return aIE2.d();
    }

    public static int cgY() {
        asl_1 asl_12 = new asl_1(new ase_1("screen_size", asf_1.cZs), new ase_1("pixel_size", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        asl_12.a("pixel_size", 10.0f, 10.0f);
        aIF aIF2 = new aIF(aIz.cgO() + "pixelate.cgfx", "pixelate", asl_12, asl_12);
        aIz.a(aIF2, new aca(1.0f));
        return aIF2.d();
    }

    public static int i(aca aca2) {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("caniculeToSirroco", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("gHeatDistordLow", asf_1.cZs), new ase_1("gHeatDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        aIG aIG2 = new aIG(aIz.cgO() + "Sirocco.cgfx", "sirocco", asl_12, aca2, asl_12);
        aIz.a(aIG2, aca2);
        return aIG2.d();
    }

    public static int j(aca aca2) {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("caniculeToTemporal", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("gHeatDistordLow", asf_1.cZs), new ase_1("gHeatDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        aIH aIH2 = new aIH(aIz.cgO() + "temporal.cgfx", "temporal", asl_12, aca2, asl_12);
        aIz.a(aIH2, aca2);
        return aIH2.d();
    }

    public static int k(aca aca2) {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        aII aII2 = new aII(aIz.cgO() + "blizzard.cgfx", "blizzard", asl_12, aca2, asl_12);
        aIz.a(aII2, aca2);
        return aII2.d();
    }

    public static int l(aca aca2) {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("gColorVariation", asf_1.cZt), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("gHeatDistordLow", asf_1.cZs), new ase_1("gHeatDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        aIJ aIJ2 = new aIJ(aIz.cgO() + "hallucination.cgfx", "hallucination", asl_12, aca2, asl_12);
        aIz.a(aIJ2, aca2);
        return aIJ2.d();
    }

    public static int m(aca aca2) {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("gDistordLow", asf_1.cZs), new ase_1("gDistordHigh", asf_1.cZs), new ase_1("camera", asf_1.cZt));
        aIB aIB2 = new aIB(aIz.cgO() + "Gloomy.cgfx", "Gloomy", asl_12, aca2, asl_12);
        aIz.a(aIB2, aca2);
        return aIB2.d();
    }
}

