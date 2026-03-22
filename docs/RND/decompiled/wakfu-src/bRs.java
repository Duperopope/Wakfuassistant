/*
 * Decompiled with CFR 0.152.
 */
public final class bRs
extends Enum<bRs>
implements aoq_1 {
    public static final /* enum */ bRs lap = new bRs(0, "Statiques");
    public static final /* enum */ bRs laq = new bRs(1, "Elements Interactifs");
    public static final /* enum */ bRs lar = new bRs(2, "Dungeons");
    public static final /* enum */ bRs las = new bRs(3, "Protecteurs");
    private final byte lat;
    private final String lau;
    private static final /* synthetic */ bRs[] lav;

    public static bRs[] values() {
        return (bRs[])lav.clone();
    }

    public static bRs valueOf(String string) {
        return Enum.valueOf(bRs.class, string);
    }

    private bRs(byte by, String string2) {
        this.lat = by;
        this.lau = string2;
    }

    public static bRs cN(byte by) {
        for (bRs bRs2 : bRs.values()) {
            if (bRs2.lat != by) continue;
            return bRs2;
        }
        return null;
    }

    public byte aJr() {
        return this.lat;
    }

    public String getName() {
        return this.lau;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.lat);
    }

    @Override
    public String aXB() {
        return this.lau;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bRs[] ekQ() {
        return new bRs[]{lap, laq, lar, las};
    }

    static {
        lav = bRs.ekQ();
    }
}

