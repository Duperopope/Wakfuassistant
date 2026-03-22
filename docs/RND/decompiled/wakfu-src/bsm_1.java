/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSM
 */
public final class bsm_1
extends Enum<bsm_1>
implements aeh_2 {
    public static final /* enum */ bsm_1 lim = new bsm_1(0);
    public static final /* enum */ bsm_1 lin = new bsm_1(1);
    public static final /* enum */ bsm_1 lio = new bsm_1(2);
    public static final /* enum */ bsm_1 lip = new bsm_1(3);
    private static final String liq = "name";
    private final byte lir;
    private static final /* synthetic */ bsm_1[] lis;

    public static bsm_1[] values() {
        return (bsm_1[])lis.clone();
    }

    public static bsm_1 valueOf(String string) {
        return Enum.valueOf(bsm_1.class, string);
    }

    private bsm_1(byte by) {
        this.lir = by;
    }

    public byte aJr() {
        return this.lir;
    }

    public static bsm_1 cS(byte by) {
        for (bsm_1 bsm_12 : bsm_1.values()) {
            if (bsm_12.lir != by) continue;
            return bsm_12;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(liq)) {
            return aum_0.cWf().c("options.graphicalPresetsLevel." + this.lir, new Object[0]);
        }
        return null;
    }

    private static /* synthetic */ bsm_1[] enf() {
        return new bsm_1[]{lim, lin, lio, lip};
    }

    static {
        lis = bsm_1.enf();
    }
}

