/*
 * Decompiled with CFR 0.152.
 */
public final class bQV
extends Enum<bQV> {
    public static final /* enum */ bQV kXL = new bQV("patchCatalog", -1, fsc_0.tdV);
    public static final /* enum */ bQV kXM = new bQV("buildingCatalog", -2, fsc_0.tdW);
    public static final /* enum */ bQV kXN = new bQV("HavenWorldBuildingDeco", -3, fsc_0.tdW);
    public static final /* enum */ bQV kXO = new bQV("HavenWorldDungeon", 18, fsc_0.tdW);
    public static final /* enum */ bQV kXP = new bQV("partitionCatalog", -1, fsc_0.tdX);
    private final String kXQ;
    private final String kXR;
    private final int kXS;
    private final fsc_0 kXT;
    private static final /* synthetic */ bQV[] kXU;

    public static bQV[] values() {
        return (bQV[])kXU.clone();
    }

    public static bQV valueOf(String string) {
        return Enum.valueOf(bQV.class, string);
    }

    private bQV(String string2, int n2, fsc_0 fsc_02) {
        this(string2, n2, string2, fsc_02);
    }

    private bQV(String string2, int n2, String string3, fsc_0 fsc_02) {
        this.kXQ = string2;
        this.kXR = string3;
        this.kXS = n2;
        this.kXT = fsc_02;
    }

    public String getTag() {
        return this.kXQ;
    }

    public String getStyle() {
        return this.kXR;
    }

    public int d() {
        return this.kXS;
    }

    public fsc_0 ekj() {
        return this.kXT;
    }

    private static /* synthetic */ bQV[] ekk() {
        return new bQV[]{kXL, kXM, kXN, kXO, kXP};
    }

    static {
        kXU = bQV.ekk();
    }
}

