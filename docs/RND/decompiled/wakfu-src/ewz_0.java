/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ewz
 */
public final class ewz_0
extends Enum<ewz_0>
implements aoq_1 {
    public static final /* enum */ ewz_0 oHC = new ewz_0(-1, "", "pas de tag");
    public static final /* enum */ ewz_0 oHD = new ewz_0(1, "Pluie", "effet utilis\u00e9 pour la pluie");
    public static final /* enum */ ewz_0 oHE = new ewz_0(2, "Neige", "effet utilis\u00e9 pour la neige");
    public static final /* enum */ ewz_0 oHF = new ewz_0(3, "Brouillard", "effet utilis\u00e9 pour le brouillard");
    public static final /* enum */ ewz_0 oHG = new ewz_0(14, "Transition entr\u00e9e", "effet utilis\u00e9 pour l'entr\u00e9e dans l'instance");
    public static final /* enum */ ewz_0 oHH = new ewz_0(15, "Transition sortie", "effet utilis\u00e9 pour la sortie de l'instance");
    public static final /* enum */ ewz_0 oHI = new ewz_0(16, "T\u00e9l\u00e9port", "effet utilis\u00e9 pour les t\u00e9l\u00e9portations dans l'instance");
    private final int oHJ;
    private final String oHK;
    private final String oHL;
    private static final /* synthetic */ ewz_0[] oHM;

    public static ewz_0[] values() {
        return (ewz_0[])oHM.clone();
    }

    public static ewz_0 valueOf(String string) {
        return Enum.valueOf(ewz_0.class, string);
    }

    private ewz_0(int n2, String string2, String string3) {
        this.oHJ = n2;
        this.oHK = string2;
        this.oHL = string3;
    }

    public int d() {
        return this.oHJ;
    }

    public static ewz_0 Ov(int n) {
        for (ewz_0 ewz_02 : ewz_0.values()) {
            if (ewz_02.oHJ != n) continue;
            return ewz_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.oHJ);
    }

    @Override
    public String aXB() {
        return this.oHK;
    }

    @Override
    public String aXC() {
        return this.oHL;
    }

    private static /* synthetic */ ewz_0[] feY() {
        return new ewz_0[]{oHC, oHD, oHE, oHF, oHG, oHH, oHI};
    }

    static {
        oHM = ewz_0.feY();
    }
}

