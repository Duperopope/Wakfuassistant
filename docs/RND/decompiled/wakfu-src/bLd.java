/*
 * Decompiled with CFR 0.152.
 */
public class bLd
implements aeh_2 {
    public static final String krB = "name";
    public static final String krC = "iconUrl";
    public static final String krD = "extendedMinTemperature";
    public static final String krE = "extendedMaxTemperature";
    public static final String krF = "idealMinTemperature";
    public static final String krG = "idealMaxTemperature";
    public static final String krH = "idealRainIconUrl";
    private final bKT krI;
    private final int krJ;

    public bLd(bKT bKT2, int n) {
        this.krI = bKT2;
        this.krJ = n;
    }

    public bKT ecu() {
        return this.krI;
    }

    public int tL() {
        return this.krJ;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(krB)) {
            return this.krI.ebZ();
        }
        if (string.equals(krC)) {
            return auc_0.cVq().zz(this.krI.cuG());
        }
        if (string.equals(krD)) {
            return this.krI.ghC() + "\u00b0";
        }
        if (string.equals(krE)) {
            return this.krI.ghD() + "\u00b0";
        }
        if (string.equals(krF)) {
            return this.krI.cux() + "\u00b0";
        }
        if (string.equals(krG)) {
            return this.krI.cuy() + "\u00b0";
        }
        if (string.equals(krH)) {
            fsa fsa2 = fsa.a(this.krI.ghB());
            return bog_1.a(fsa2);
        }
        return null;
    }
}

