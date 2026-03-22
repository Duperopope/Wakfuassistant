/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from biH
 */
public abstract class bih_0
implements pu_0,
aeh_2 {
    private static final Logger ilI = Logger.getLogger(bih_0.class);
    public static final String ilJ = "name";
    public static final String ilK = "shortName";
    public static final String ilL = "description";
    public static final String ilM = "shortDescription";
    public static final String ilN = "iconStyle";
    public static final String ilO = "iconPath";
    public static final String ilP = "value";
    public static final String ilQ = "max";
    public static final String ilR = "minMax";
    public static final String ilS = "percent";
    public static final String ilT = "valueDescription";
    public static final String ilU = "formattedValueDescription";
    public static final String ilV = "formattedValueDescriptionNewGreen";
    public static final String ilW = "percentDescription";
    public static final String ilX = "formattedWithoutColor";
    public static final String ilY = "isMaxed";
    public static final String ilZ = "formattedValue";
    public static final String ima = "formattedPercentDescription";
    public static final String imb = "percentDescriptionWithoutBaseValue";
    public static final String imc = "colorFloat";
    public static final String imd = "highlighted";
    public static final String ime = "modulationColor";
    public static final String[] imf = new String[]{"max", "minMax", "percent", "percentDescription", "value", "valueDescription", "formattedValueDescription", "formattedPercentDescription", "formattedWithoutColor", "percentDescriptionWithoutBaseValue", "modulationColor", "isMaxed", "formattedValue", "formattedValueDescriptionNewGreen"};
    protected final exf_2 img;
    protected final byte imh;
    protected final bim_0 imi;
    private boolean imj;

    protected bih_0(exf_2 exf_22, byte by, bim_0 bim_02) {
        this.img = exf_22;
        this.imh = by;
        this.imi = bim_02;
    }

    @Override
    public String[] bxk() {
        return imf;
    }

    void gl(boolean bl) {
        this.imj = bl;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.dqD();
            }
            case "shortName": {
                return this.dqE();
            }
            case "description": {
                return this.dbU();
            }
            case "shortDescription": {
                return this.dqC();
            }
            case "iconStyle": {
                return this.dqA();
            }
            case "iconPath": {
                return this.dqB();
            }
            case "value": {
                return this.dqv();
            }
            case "max": {
                return this.dqw();
            }
            case "minMax": {
                return this.dqK();
            }
            case "formattedValueDescription": {
                return this.a(ett_1.opC);
            }
            case "formattedValueDescriptionNewGreen": {
                return this.a(ett_1.opB);
            }
            case "valueDescription": {
                return this.dqx();
            }
            case "percent": {
                return this.dqF();
            }
            case "percentDescriptionWithoutBaseValue": {
                return this.dqG();
            }
            case "formattedPercentDescription": {
                return this.dqH();
            }
            case "formattedWithoutColor": {
                return this.dqI();
            }
            case "percentDescription": {
                return this.dqJ();
            }
            case "colorFloat": {
                return this.dqz();
            }
            case "highlighted": {
                return this.imj;
            }
            case "modulationColor": {
                return this.getModulationColor();
            }
            case "isMaxed": {
                return this.dqv() >= this.dqw();
            }
            case "formattedValue": {
                return "(" + aum_0.cWf().cQ(this.dqv()) + ")";
            }
        }
        return null;
    }

    protected axb_2 getModulationColor() {
        return awx_2.dnF;
    }

    protected abstract int dqv();

    protected abstract int dqw();

    public exx_2 dqy() {
        return this.img.dqy();
    }

    protected axb_2 getColor() {
        return bih_0.d(this.img.dqy());
    }

    public static axb_2 d(@NotNull exx_2 exx_22) {
        return switch (exx_22) {
            case exx_2.rGi -> fhm_2.uwB.a(ett_1.olg);
            case exx_2.rGj -> fhm_2.uwB.a(ett_1.olh);
            case exx_2.rGk -> fhm_2.uwB.a(ett_1.oli);
            case exx_2.rGl -> fhm_2.uwB.a(ett_1.olj);
            case exx_2.rHH -> fhm_2.uwB.a(ett_1.oll);
            case exx_2.rHT -> fhm_2.uwB.a(ett_1.olk);
            case exx_2.rGy, exx_2.rGD -> fhm_2.uwB.a(ett_1.opy);
            case exx_2.rGz, exx_2.rGE -> fhm_2.uwB.a(ett_1.opA);
            case exx_2.rGA, exx_2.rGF -> fhm_2.uwB.a(ett_1.opz);
            case exx_2.rGx, exx_2.rGC -> fhm_2.uwB.a(ett_1.opx);
            default -> awx_2.dnF;
        };
    }

    protected String dqz() {
        axb_2 axb_22 = this.getColor();
        return String.valueOf(axb_22.aIU()) + "," + axb_22.aIV() + "," + axb_22.aIW() + "," + axb_22.aIX();
    }

    protected Object dqA() {
        return "icon" + this.img.dqy().name();
    }

    protected String dqB() {
        try {
            return String.format(auc_0.cVq().bS("characteristicsIconsPath"), this.img.dqy().name());
        }
        catch (fu_0 fu_02) {
            ilI.warn((Object)("Missing characteristic icon " + this.img.dqy().name()), (Throwable)fu_02);
            return null;
        }
    }

    protected Object dqC() {
        String string = this.img.dqy().name() + "ShortDesc";
        return aum_0.cWf().c(string, new Object[0]);
    }

    protected String a(ett_1 ett_12) {
        return biO.a(this.dqv(), ett_12);
    }

    protected Object dbU() {
        String string = this.img.dqy().name() + "Description";
        return aum_0.cWf().c(string, new Object[0]);
    }

    protected Object dqD() {
        return aum_0.cWf().c(this.img.dqy().name(), new Object[0]);
    }

    protected Object dqE() {
        return bih_0.e(this.img.dqy());
    }

    public static String e(exx_2 exx_22) {
        String string = exx_22.name() + "Short";
        return aum_0.cWf().c(string, new Object[0]);
    }

    protected Object dqF() {
        float f2 = this.dqw();
        if (f2 == 0.0f) {
            return 0;
        }
        return Float.valueOf((float)this.dqv() / f2);
    }

    protected Object dqG() {
        return biO.a(this.dqv(), true, ett_1.opB);
    }

    protected Object dqH() {
        return biO.y(this.dqv(), true);
    }

    protected Object dqI() {
        return biO.y(this.dqv(), true);
    }

    protected Object dqJ() {
        return biO.y(this.dqv(), false);
    }

    public String dqx() {
        if (this.imh != -1) {
            ahv_2 ahv_22 = new ahv_2();
            try {
                ahv_22.a(auk_0.zU(this.imh), 16, 16, null).c(" ");
            }
            catch (fu_0 fu_02) {
                ilI.warn((Object)fu_02.getMessage());
                ahv_22.af(this.dqE()).c(" : ");
            }
            ahv_22.c(this.dqK());
            return ahv_22.ceL();
        }
        return this.dqK();
    }

    protected String dqK() {
        return String.valueOf(this.dqv()) + "/" + this.dqw();
    }

    public void dqL() {
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    @Override
    public void a(pr_0 pr_02) {
        this.dqL();
        this.imi.a(pr_02);
    }
}

