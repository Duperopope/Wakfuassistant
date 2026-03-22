/*
 * Decompiled with CFR 0.152.
 */
public final class bgi
extends Enum<bgi>
implements aoq_1 {
    public static final /* enum */ bgi hZB = new bgi(0, 0, 0, "Choisissez un type de challenge !", false);
    public static final /* enum */ bgi hZC = new bgi(1, 800336, 800337, "Solo", false);
    public static final /* enum */ bgi hZD = new bgi(2, 800599, 800600, "Course", false);
    public static final /* enum */ bgi hZE = new bgi(3, 800334, 800335, "Comp\u00e9titif", true);
    public static final /* enum */ bgi hZF = new bgi(4, 800163, 800164, "Collaboratif", false);
    private final byte hZG;
    private final String hZH;
    private final int hZI;
    private final int hZJ;
    private final boolean hZK;
    private static final /* synthetic */ bgi[] hZL;

    public static bgi[] values() {
        return (bgi[])hZL.clone();
    }

    public static bgi valueOf(String string) {
        return Enum.valueOf(bgi.class, string);
    }

    private bgi(byte by, int n2, int n3, String string2, boolean bl) {
        this.hZG = by;
        this.hZH = string2;
        this.hZI = n2;
        this.hZJ = n3;
        this.hZK = bl;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.hZG);
    }

    @Override
    public String aXB() {
        return this.hZH;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static bgi bk(byte by) {
        for (bgi bgi2 : bgi.values()) {
            if (bgi2.hZG != by) continue;
            return bgi2;
        }
        return null;
    }

    public String diY() {
        return aum_0.cWf().c("challenge.userType." + this.ordinal(), new Object[0]);
    }

    public byte aJr() {
        return this.hZG;
    }

    public int diZ() {
        return this.hZI;
    }

    public int dja() {
        return this.hZJ;
    }

    public boolean djb() {
        return this.hZK;
    }

    private static /* synthetic */ bgi[] djc() {
        return new bgi[]{hZB, hZC, hZD, hZE, hZF};
    }

    static {
        hZL = bgi.djc();
    }
}

