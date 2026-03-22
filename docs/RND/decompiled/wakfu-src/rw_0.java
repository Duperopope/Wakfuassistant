/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Rw
 */
public final class rw_0
extends Enum<rw_0>
implements aoq_1 {
    public static final /* enum */ rw_0 bkJ = new rw_0(0);
    public static final /* enum */ rw_0 bkK = new rw_0(1);
    public static final /* enum */ rw_0 bkL = new rw_0(2);
    public static final /* enum */ rw_0 bkM = new rw_0(3);
    public static final /* enum */ rw_0 bkN = new rw_0(4);
    public static final /* enum */ rw_0 bkO = new rw_0(5);
    public static final /* enum */ rw_0 bkP = new rw_0(6);
    public static final /* enum */ rw_0 bkQ = new rw_0(7);
    public static final /* enum */ rw_0 bkR = new rw_0(8);
    public static final /* enum */ rw_0 bkS = new rw_0(9);
    public static final /* enum */ rw_0 bkT = new rw_0(10);
    public static final /* enum */ rw_0 bkU = new rw_0(11);
    public static final /* enum */ rw_0 bkV = new rw_0(12);
    public static final /* enum */ rw_0 bkW = new rw_0(13);
    public static final /* enum */ rw_0 bkX = new rw_0(14);
    public static final /* enum */ rw_0 bkY = new rw_0(15);
    public static final /* enum */ rw_0 bkZ = new rw_0(16);
    public static final /* enum */ rw_0 bla = new rw_0(17);
    public static final /* enum */ rw_0 blb = new rw_0(18);
    public static final /* enum */ rw_0 blc = new rw_0(19);
    public static final /* enum */ rw_0 bld = new rw_0(20);
    public static final /* enum */ rw_0 ble = new rw_0(21);
    public static final /* enum */ rw_0 blf = new rw_0(22);
    public static final /* enum */ rw_0 blg = new rw_0(23);
    public static final /* enum */ rw_0 blh = new rw_0(24);
    public static final /* enum */ rw_0 bli = new rw_0(25);
    public static final /* enum */ rw_0 blj = new rw_0(26);
    public static final /* enum */ rw_0 blk = new rw_0(27);
    public static final /* enum */ rw_0 bll = new rw_0(28);
    public static final /* enum */ rw_0 blm = new rw_0(29);
    public static final /* enum */ rw_0 bln = new rw_0(30);
    public static final /* enum */ rw_0 blo = new rw_0(31);
    public static final /* enum */ rw_0 blp = new rw_0(32);
    public static final /* enum */ rw_0 blq = new rw_0(33);
    public static final /* enum */ rw_0 blr = new rw_0(34);
    public static final /* enum */ rw_0 bls = new rw_0(35);
    public static final /* enum */ rw_0 blt = new rw_0(36);
    public static final /* enum */ rw_0 blu = new rw_0(37);
    public static final /* enum */ rw_0 blv = new rw_0(38);
    private final short blw;
    public static final rw_0[] blx;
    public static final rw_0[] bly;
    private static final /* synthetic */ rw_0[] blz;

    public static rw_0[] values() {
        return (rw_0[])blz.clone();
    }

    public static rw_0 valueOf(String string) {
        return Enum.valueOf(rw_0.class, string);
    }

    private rw_0(int n2) {
        this.blw = GC.cu(n2);
    }

    public static rw_0 Y(short s) {
        for (rw_0 rw_02 : rw_0.values()) {
            if (rw_02.blw != s) continue;
            return rw_02;
        }
        return null;
    }

    public short bdX() {
        return this.blw;
    }

    @Override
    public String aXC() {
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.blw);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    private static /* synthetic */ rw_0[] bdY() {
        return new rw_0[]{bkJ, bkK, bkL, bkM, bkN, bkO, bkP, bkQ, bkR, bkS, bkT, bkU, bkV, bkW, bkX, bkY, bkZ, bla, blb, blc, bld, ble, blf, blg, blh, bli, blj, blk, bll, blm, bln, blo, blp, blq, blr, bls, blt, blu, blv};
    }

    static {
        blz = rw_0.bdY();
        blx = new rw_0[]{bkJ, blo, blp, blq, blr, bls, blt, blu};
        bly = new rw_0[0];
    }
}

