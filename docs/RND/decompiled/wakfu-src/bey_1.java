/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEy
 */
public final class bey_1
extends Enum<bey_1>
implements aoq_1 {
    public static final /* enum */ bey_1 jOD = new bey_1(0, "Utilisation sur le lanceur uniquement");
    public static final /* enum */ bey_1 jOE = new bey_1(1, "Utilisable sur une cellule du monde (port\u00e9e infinie)");
    public static final /* enum */ bey_1 jOF = new bey_1(2, "Utilisable sur une cellule du monde (avec port\u00e9e min max)");
    public final byte jOG;
    private final String jOH;
    private static final /* synthetic */ bey_1[] jOI;

    public static bey_1[] values() {
        return (bey_1[])jOI.clone();
    }

    public static bey_1 valueOf(String string) {
        return Enum.valueOf(bey_1.class, string);
    }

    private bey_1(byte by, String string2) {
        this.jOG = by;
        this.jOH = string2;
    }

    @Override
    public String aXA() {
        return Integer.toString(this.jOG);
    }

    @Override
    public String aXB() {
        return this.jOH;
    }

    @Override
    public String aXC() {
        return this.jOH;
    }

    public static bey_1 bU(byte by) {
        for (bey_1 bey_12 : bey_1.values()) {
            if (bey_12.jOG != by) continue;
            return bey_12;
        }
        return null;
    }

    private static /* synthetic */ bey_1[] dSn() {
        return new bey_1[]{jOD, jOE, jOF};
    }

    static {
        jOI = bey_1.dSn();
    }
}

