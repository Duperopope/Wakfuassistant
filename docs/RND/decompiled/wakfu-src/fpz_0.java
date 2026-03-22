/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpz
 */
public final class fpz_0
extends Enum<fpz_0>
implements aoq_1 {
    public static final /* enum */ fpz_0 sPn = new fpz_0(50);
    public static final /* enum */ fpz_0 sPo = new fpz_0(80);
    public static final /* enum */ fpz_0 sPp = new fpz_0(110);
    public static final /* enum */ fpz_0 sPq = new fpz_0(140);
    public static final /* enum */ fpz_0 sPr = new fpz_0(170);
    public static final /* enum */ fpz_0 sPs = new fpz_0(200);
    public static final /* enum */ fpz_0 sPt = new fpz_0(230);
    public static final /* enum */ fpz_0 sPu = new fpz_0(245);
    private final int sPv;
    private static final /* synthetic */ fpz_0[] sPw;

    public static fpz_0[] values() {
        return (fpz_0[])sPw.clone();
    }

    public static fpz_0 valueOf(String string) {
        return Enum.valueOf(fpz_0.class, string);
    }

    private fpz_0(int n2) {
        this.sPv = n2;
    }

    public static fpz_0 YB(int n) {
        fpz_0[] fpz_0Array;
        for (fpz_0 fpz_02 : fpz_0Array = fpz_0.values()) {
            if (fpz_02.sPv != n) continue;
            return fpz_02;
        }
        return null;
    }

    public int d() {
        return this.sPv;
    }

    public int ggS() {
        int n = this.ordinal();
        if (n <= 0) {
            return 0;
        }
        return fpz_0.values()[n - 1].sPv + 1;
    }

    public int ggT() {
        return this.sPv;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sPv);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fpz_0[] ggU() {
        return new fpz_0[]{sPn, sPo, sPp, sPq, sPr, sPs, sPt, sPu};
    }

    static {
        sPw = fpz_0.ggU();
    }
}

