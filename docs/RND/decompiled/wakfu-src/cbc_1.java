/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbc
 */
public final class cbc_1
extends Enum<cbc_1> {
    public static final /* enum */ cbc_1 lIv = new cbc_1(0, cCq.mzE);
    public static final /* enum */ cbc_1 lIw = new cbc_1(1, cCq.mzF);
    public static final /* enum */ cbc_1 lIx = new cbc_1(2, cCq.mzG);
    public static final /* enum */ cbc_1 lIy = new cbc_1(3, cCq.mzH);
    private final byte lIz;
    private agn_1 lIA;
    private final cCq lIB;
    private static final /* synthetic */ cbc_1[] lIC;

    public static cbc_1[] values() {
        return (cbc_1[])lIC.clone();
    }

    public static cbc_1 valueOf(String string) {
        return Enum.valueOf(cbc_1.class, string);
    }

    private cbc_1(byte by, cCq cCq2) {
        this.lIz = by;
        this.lIB = cCq2;
    }

    public byte aJr() {
        return this.lIz;
    }

    public agn_1 erT() {
        if (this.lIA == null) {
            this.lIA = new cbb_1(this);
        }
        return this.lIA;
    }

    public cCq erU() {
        return this.lIB;
    }

    private static /* synthetic */ cbc_1[] erV() {
        return new cbc_1[]{lIv, lIw, lIx, lIy};
    }

    static {
        lIC = cbc_1.erV();
    }
}

