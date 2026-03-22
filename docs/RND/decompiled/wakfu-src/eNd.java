/*
 * Decompiled with CFR 0.152.
 */
public final class eNd
extends Enum<eNd>
implements aoq_1 {
    public static final /* enum */ eNd qOY = new eNd(0, null, null, null, 17, false);
    public static final /* enum */ eNd qOZ = new eNd(1, exx_2.rGN, exx_2.rGx, exx_2.rGC, 14, true);
    public static final /* enum */ eNd qPa = new eNd(2, exx_2.rGK, exx_2.rGy, exx_2.rGD, 13, true);
    public static final /* enum */ eNd qPb = new eNd(3, exx_2.rGM, exx_2.rGz, exx_2.rGE, 15, true);
    public static final /* enum */ eNd qPc = new eNd(4, exx_2.rGL, exx_2.rGA, exx_2.rGF, 16, true);
    public static final /* enum */ eNd qPd = new eNd(5, exx_2.rHv, exx_2.rHn, exx_2.rHo, 19, true);
    public static final /* enum */ eNd qPe = new eNd(6, exx_2.rHE, exx_2.rHF, exx_2.rHG, 30, true);
    public static final /* enum */ eNd qPf = new eNd(9, null, null, null, 18, false);
    public static final byte qPg = 0;
    public static final byte qPh = 1;
    public static final byte qPi = 2;
    public static final byte qPj = 3;
    public static final byte qPk = 4;
    public static final byte qPl = 5;
    public static final byte qPm = 9;
    private final byte qPn;
    private final exx_2 qPo;
    private final exx_2 qPp;
    private final exx_2 qPq;
    private final boolean qPr;
    private final int qPs;
    private static final /* synthetic */ eNd[] qPt;

    public static eNd[] values() {
        return (eNd[])qPt.clone();
    }

    public static eNd valueOf(String string) {
        return Enum.valueOf(eNd.class, string);
    }

    public static eNd ff(byte by) {
        for (eNd eNd2 : eNd.values()) {
            if (eNd2.aJr() != by) continue;
            return eNd2;
        }
        return null;
    }

    private eNd(byte by, exx_2 exx_22, exx_2 exx_23, exx_2 exx_24, int n2, boolean bl) {
        this.qPn = by;
        this.qPo = exx_22;
        this.qPp = exx_23;
        if (this.qPp != null) {
            this.qPp.o(this);
        }
        this.qPq = exx_24;
        if (this.qPq != null) {
            this.qPq.o(this);
        }
        this.qPs = n2;
        this.qPr = bl;
    }

    @Override
    public String aXA() {
        return Byte.toString(this.aJr());
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    public byte aJr() {
        return this.qPn;
    }

    public exx_2 fAT() {
        return this.qPo;
    }

    public exx_2 fAU() {
        return this.qPp;
    }

    public exx_2 fAV() {
        return this.qPq;
    }

    public boolean fAW() {
        return this.qPo != null;
    }

    public boolean fAX() {
        return this.qPr;
    }

    public int fAY() {
        return this.qPs;
    }

    private static /* synthetic */ eNd[] fAZ() {
        return new eNd[]{qOY, qOZ, qPa, qPb, qPc, qPd, qPe, qPf};
    }

    static {
        qPt = eNd.fAZ();
    }
}

