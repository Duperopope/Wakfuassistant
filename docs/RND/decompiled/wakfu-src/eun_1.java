/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUN
 */
public final class eun_1
extends Enum<eun_1> {
    public static final /* enum */ eun_1 ryb = new eun_1(false);
    public static final /* enum */ eun_1 ryc = new eun_1(true);
    public static final /* enum */ eun_1 ryd = new eun_1(true);
    public static final /* enum */ eun_1 rye = new eun_1(true);
    private final boolean ryf;
    private static final /* synthetic */ eun_1[] ryg;

    public static eun_1[] values() {
        return (eun_1[])ryg.clone();
    }

    public static eun_1 valueOf(String string) {
        return Enum.valueOf(eun_1.class, string);
    }

    private eun_1(boolean bl) {
        this.ryf = bl;
    }

    public boolean fMC() {
        return this.ryf;
    }

    private static /* synthetic */ eun_1[] fMD() {
        return new eun_1[]{ryb, ryc, ryd, rye};
    }

    static {
        ryg = eun_1.fMD();
    }
}

