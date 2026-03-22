/*
 * Decompiled with CFR 0.152.
 */
import java.text.DateFormat;
import java.util.Locale;

/*
 * Renamed from bOG
 */
public class bog_1
implements aeh_2 {
    public static final String kMO = "iconUrl";
    public static final String kMP = "dayDescription";
    public static final String kMQ = "actualMinTemperature";
    public static final String kMR = "actualMaxTemperature";
    public static final String kMS = "minTemperature";
    public static final String kMT = "maxTemperature";
    public static final String kMU = "minTemperatureWithMods";
    public static final String kMV = "maxTemperatureWithMods";
    public static final String kMW = "currentTemperature";
    public static final String kMX = "seasonDescription";
    public static final String kMY = "windForceIconUrl";
    public static final String kMZ = "windStrength";
    public static final String kNa = "windStrengthDescription";
    private ub_0 bwV = ub_0.bwc;
    private bof_1 kNb = new bof_1();
    private int kNc;

    public bof_1 ehG() {
        return this.kNb;
    }

    public void e(ub_0 ub_02) {
        this.bwV = ub_02;
    }

    public ub_0 bjn() {
        return this.bwV;
    }

    public void IN(int n) {
        this.kNc = n;
    }

    public void a(bof_1 bof_12) {
        this.kNb = bof_12;
        fse_1.gFu().a((aef_2)this, kMW, kMQ, kMR, kMS, kMT, kMU, kMV, kMO, kMP, kMZ, kNa, kMY, kMX);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    public static String a(fsa fsa2) {
        return auc_0.cVq().a("weatherIconsPath", "defaultIconPath", fsa2.name().toLowerCase());
    }

    @Override
    public Object eu(String string) {
        if (this.kNb == null) {
            return null;
        }
        if (string.equals(kMO)) {
            return bog_1.a(this.kNb.ehE());
        }
        if (string.equals(kMP)) {
            long l = ue_0.bjV().bjc().bjB();
            long l2 = ud_0.bwp.bjB();
            long l3 = l / l2;
            uw_0 uw_02 = uw_0.fn(l3 * l2);
            uw_02.a(uz_0.fp((long)this.kNc * l2));
            Locale locale = aum_0.cWf().aUXX().aUJ();
            DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
            dateFormat.setTimeZone(uw_0.bvG);
            return dateFormat.format(uw_02.bjC());
        }
        if (string.equals(kMQ)) {
            String string2 = String.format("%.0f", Float.valueOf(this.kNb.ehA()));
            return aum_0.cWf().c("weather.info.minTemperature", string2);
        }
        if (string.equals(kMR)) {
            String string3 = String.format("%.0f", Float.valueOf(this.kNb.ehB()));
            return aum_0.cWf().c("weather.info.maxTemperature", string3);
        }
        if (string.equals(kMS)) {
            String string4 = String.format("%.0f", Float.valueOf(this.kNb.ehy()));
            return aum_0.cWf().c("weather.info.minTemperature", string4);
        }
        if (string.equals(kMT)) {
            String string5 = String.format("%.0f", Float.valueOf(this.kNb.ehz()));
            return aum_0.cWf().c("weather.info.maxTemperature", string5);
        }
        if (string.equals(kMU)) {
            String string6 = String.format("%.0f", Float.valueOf(Math.min(this.kNb.ehB(), Math.max(this.kNb.ehy() + this.kNb.ehC(), this.kNb.ehA()))));
            return string6 + "\u00b0";
        }
        if (string.equals(kMV)) {
            String string7 = String.format("%.0f", Float.valueOf(Math.max(this.kNb.ehA(), Math.min(this.kNb.ehz() + this.kNb.ehC(), this.kNb.ehB()))));
            return string7 + "\u00b0";
        }
        if (string.equals(kMW)) {
            String string8 = String.format("%.0f", Float.valueOf(this.kNb.blu()));
            return string8 + "\u00b0";
        }
        if (string.equals(kMZ)) {
            return Float.valueOf(this.kNb.blD());
        }
        if (string.equals(kNa)) {
            int n = (int)(this.kNb.blD() * 100.0f);
            return aum_0.cWf().c("weather.info.windForceValue", n);
        }
        if (string.equals(kMX)) {
            ub_0 ub_02 = ub_0.n(ue_0.bjV().bjc());
            return aum_0.cWf().c("season." + ub_02.name().toLowerCase(), new Object[0]);
        }
        if (string.equals(kMY)) {
            return this.kNb.ehF().byf();
        }
        return null;
    }
}

