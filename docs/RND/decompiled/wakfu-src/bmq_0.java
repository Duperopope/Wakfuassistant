/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.log4j.Logger;

/*
 * Renamed from bMQ
 */
public class bmq_0
extends fqU
implements aeh_2,
bmg_0 {
    private static final Logger kzt = Logger.getLogger(bmq_0.class);
    boolean esf;
    boolean esZ;
    String bds;
    short atb;
    private static final int kzu = 225;
    private static final int kzv = 0;
    private static final int kzw = 24;
    private static final int kzx = 26;
    private static final int kzy = 282;
    private static final int kzz = 309;
    private static final String kzA = "fontDefault14";
    public static final String kzB = "showInTimeline";
    public static final String kzC = "name";
    public static final String kzD = "nameAndLevel";
    public static final String kzE = "tableTurnDuration";
    public static final String kzF = "duration";
    public static final String kzG = "iconUrl";
    public static final String kzH = "description";
    public static final String kzI = "effectDescription";
    public static final String kzJ = "nonCriticalEffectDescription";
    public static final String kzK = "criticalEffectDescription";
    public static final String kzL = "criticalEffectDescriptionSize";
    public static final String kzM = "isCumulable";
    public static final String kzN = "level";
    public static final String kzO = "levelValue";
    public static final String kzP = "maxLevelValue";
    public static final String kzQ = "nameWithFormat";
    public static final String[] kzR = new String[]{"name", "nameAndLevel", "tableTurnDuration", "duration", "iconUrl", "showInTimeline", "description", "effectDescription", "nonCriticalEffectDescription", "criticalEffectDescription", "criticalEffectDescriptionSize", "isCumulable", "level", "nameWithFormat", "levelValue", "maxLevelValue"};

    public bmq_0 cl(short s) {
        bmq_0 bmq_02 = new bmq_0();
        this.a(s, bmq_02);
        return bmq_02;
    }

    @Override
    public void cg(short s) {
        this.ejt = (short)Math.min(s, this.eel());
        fse_1.gFu().a((aef_2)this, kzR);
    }

    protected void a(short s, bmq_0 bmq_02) {
        super.a(s, bmq_02);
        bmq_02.bds = this.bds;
        bmq_02.esf = this.esf;
        bmq_02.esZ = this.esZ;
        bmq_02.atb = this.atb;
        if (this.sWU != null && !this.sWU.isEmpty()) {
            bmq_02.sWU = new ArrayList(this.sWU);
        }
    }

    public String efb() {
        return new ahv_2().ceC().ih(new fhl_2(switch (fqY.hz(this.esV)) {
            case fqY.sXe -> ett_1.opD;
            case fqY.sXg -> ett_1.opC;
            default -> ett_1.omg;
        }).bQk()).c(this.getName()).ceD().ceL();
    }

    @Override
    public Object eu(String string) {
        if (string.equalsIgnoreCase(kzC)) {
            return this.Dm(14);
        }
        if (string.equalsIgnoreCase(kzQ)) {
            return this.efb();
        }
        if (string.equalsIgnoreCase(kzD)) {
            return this.efc();
        }
        if (string.equalsIgnoreCase(kzF)) {
            return this.giB();
        }
        if (string.equalsIgnoreCase(kzE)) {
            return this.giB();
        }
        if (string.equalsIgnoreCase(kzG)) {
            return this.byf();
        }
        if (string.equalsIgnoreCase(kzB)) {
            return this.eeE();
        }
        if (string.equals(kzH)) {
            return this.getDescription();
        }
        if (string.equals(kzI)) {
            return this.b(eLN.qJn);
        }
        if (string.equals(kzJ)) {
            return this.b(eLN.qJo);
        }
        if (string.equals(kzK)) {
            return this.b(eLN.qJp);
        }
        if (string.equals(kzL)) {
            List<String> list = this.b(eLN.qJp);
            int n = 0;
            if (list != null) {
                awx_1 awx_12 = fyw_0.gqw().gqB().uG(kzA);
                for (String string2 : list) {
                    fgh_2 fgh_22 = new fgh_2();
                    fgh_22.tZ(string2);
                    int n2 = 0;
                    for (fgk_2 fgk_22 : fgh_22) {
                        switch (fgk_22.gzE()) {
                            case dSC: {
                                fgm_1 fgm_12 = (fgm_1)fgk_22;
                                n2 += awx_12.gj(fgm_12.getText());
                                break;
                            }
                            case dSD: {
                                fgl_2 fgl_22 = (fgl_2)fgk_22;
                                n2 += fgl_22.getWidth();
                            }
                        }
                    }
                    n += n2 / 282 + 1;
                }
            }
            int n3 = 26 + n * 24;
            n3 = GC.a(n3, 0, 225);
            return new fsm_1(309, n3);
        }
        if (string.equals(kzM)) {
            return this.cww();
        }
        if (string.equals(kzN)) {
            return aum_0.cWf().c("levelShort.custom", this.cmL());
        }
        if (string.equals(kzO)) {
            return this.ejt;
        }
        if (string.equals(kzP)) {
            return this.eel();
        }
        return null;
    }

    @Override
    public short eel() {
        if (this.sWH <= 0) {
            return 245;
        }
        return this.sWH;
    }

    public String getDescription() {
        if (!aum_0.cWf().e(9, this.gjy())) {
            return "";
        }
        return aum_0.cWf().a(9, (long)this.gjy(), new Object[0]);
    }

    private String efc() {
        String string = this.Dm(14);
        short s = this.cmL();
        if (s == 1) {
            return string;
        }
        return string + " (" + aum_0.cWf().c("levelShort.custom", s) + ")";
    }

    @Override
    public String[] bxk() {
        return kzR;
    }

    @Override
    public String getName() {
        return this.Dm(-1);
    }

    public String Dm(int n) {
        String string = aum_0.cWf().a(8, (long)this.gjy(), new Object[0]);
        string = aum_0.p(string, n);
        return string;
    }

    public String efd() {
        return aum_0.cWf().a(8, (long)this.gjy(), new Object[0]);
    }

    public String byf() {
        try {
            return String.format(auc_0.cVq().bS("statesIconsPath"), this.bds);
        }
        catch (fu_0 fu_02) {
            kzt.error((Object)("PropertyException pendant l'acc\u00e8s \u00e0 l'url de l'icone de l'\u00e9tat " + this.gjy()));
            return null;
        }
    }

    @Nullable
    public List<String> b(eLN eLN2) {
        ArrayList<String> arrayList = eLL.a(new eMk(this, eLN2));
        if (arrayList == null) {
            return null;
        }
        arrayList.removeIf(string -> string == null || string.isEmpty());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public boolean eeE() {
        return this.esf;
    }

    public boolean cwF() {
        return this.esZ;
    }

    public short aHb() {
        return this.atb;
    }

    @Override
    public short eem() {
        return this.gjy();
    }

    @Override
    public /* synthetic */ fqU cm(short s) {
        return this.cl(s);
    }
}

