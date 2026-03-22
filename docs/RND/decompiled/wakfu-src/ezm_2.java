/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eZm
 */
public abstract sealed class ezm_2
extends Enum<ezm_2>
implements aza_2<ezk_1>
permits ezn_1, ezv_2, ezw_2, ezx_2, ezy_2, ezz_2, eza_2, ezb_2, ezc_2, ezo_2, ezp_2, ezq_2, ezr_2, ezs_2, ezt_2, ezu_2 {
    public static final /* enum */ ezm_2 rMd = new ezn_1();
    public static final /* enum */ ezm_2 rMe = new ezv_2();
    public static final /* enum */ ezm_2 rMf = new ezw_2();
    public static final /* enum */ ezm_2 rMg = new ezx_2();
    public static final /* enum */ ezm_2 rMh = new ezy_2();
    public static final /* enum */ ezm_2 rMi = new ezz_2();
    public static final /* enum */ ezm_2 rMj = new eza_2();
    public static final /* enum */ ezm_2 rMk = new ezb_2();
    public static final /* enum */ ezm_2 rMl = new ezc_2();
    public static final /* enum */ ezm_2 rMm = new ezo_2();
    public static final /* enum */ ezm_2 rMn = new ezp_2();
    public static final /* enum */ ezm_2 rMo = new ezq_2();
    public static final /* enum */ ezm_2 rMp = new ezr_2();
    public static final /* enum */ ezm_2 rMq = new ezs_2();
    public static final /* enum */ ezm_2 rMr = new ezt_2();
    public static final /* enum */ ezm_2 rMs = new ezu_2();
    public final byte rMt = (byte)this.ordinal();
    private static final /* synthetic */ ezm_2[] rMu;

    public static ezm_2[] values() {
        return (ezm_2[])rMu.clone();
    }

    public static ezm_2 valueOf(String string) {
        return Enum.valueOf(ezm_2.class, string);
    }

    @Nullable
    public static ezm_2 fV(byte by) {
        for (ezm_2 ezm_22 : ezm_2.values()) {
            if (ezm_22.rMt != by) continue;
            return ezm_22;
        }
        return null;
    }

    public String toString() {
        return "GuildChangeType{idx=" + this.rMt + "}";
    }

    private static /* synthetic */ ezm_2[] fQB() {
        return new ezm_2[]{rMd, rMe, rMf, rMg, rMh, rMi, rMj, rMk, rMl, rMm, rMn, rMo, rMp, rMq, rMr, rMs};
    }

    static {
        rMu = ezm_2.fQB();
    }
}

