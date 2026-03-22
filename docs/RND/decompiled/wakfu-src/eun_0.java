/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUn
 */
public final class eun_0
extends Enum<eun_0> {
    public static final /* enum */ eun_0 ruj = new eun_0(0);
    public static final /* enum */ eun_0 ruk = new eun_0(1);
    public static final /* enum */ eun_0 rul = new eun_0(2);
    public static final /* enum */ eun_0 rum = new eun_0(3);
    private final byte run;
    private static final /* synthetic */ eun_0[] ruo;

    public static eun_0[] values() {
        return (eun_0[])ruo.clone();
    }

    public static eun_0 valueOf(String string) {
        return Enum.valueOf(eun_0.class, string);
    }

    private eun_0(int n2) {
        this.run = (byte)n2;
    }

    public static eun_0 fD(byte by) {
        for (eun_0 eun_02 : eun_0.values()) {
            if (eun_02.run != by) continue;
            return eun_02;
        }
        return ruj;
    }

    public byte aJr() {
        return this.run;
    }

    private static /* synthetic */ eun_0[] fKL() {
        return new eun_0[]{ruj, ruk, rul, rum};
    }

    static {
        ruo = eun_0.fKL();
    }
}

