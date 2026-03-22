/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMa
 */
public abstract sealed class ema_0
extends Enum<ema_0>
permits emb_0, emc_0, emd_0 {
    public static final /* enum */ ema_0 qMj = new emb_0(true, eLN.qJo);
    public static final /* enum */ ema_0 qMk = new emc_0(false, eLN.qJo);
    public static final /* enum */ ema_0 qMl = new emd_0(false, eLN.qJp);
    private final boolean qMm;
    private final eLN qMn;
    private static final /* synthetic */ ema_0[] qMo;

    public static ema_0[] values() {
        return (ema_0[])qMo.clone();
    }

    public static ema_0 valueOf(String string) {
        return Enum.valueOf(ema_0.class, string);
    }

    ema_0(boolean bl, eLN eLN2) {
        this.qMm = bl;
        this.qMn = eLN2;
    }

    public abstract Qk<enk_0> c(fhc_0 var1, ffV var2);

    public boolean fAd() {
        return this.qMm;
    }

    public eLN fAe() {
        return this.qMn;
    }

    private static /* synthetic */ ema_0[] fAf() {
        return new ema_0[]{qMj, qMk, qMl};
    }

    static {
        qMo = ema_0.fAf();
    }
}

