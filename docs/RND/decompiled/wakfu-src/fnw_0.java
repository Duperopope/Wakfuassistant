/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fnW
 */
public final class fnw_0
extends Enum<fnw_0> {
    public static final /* enum */ fnw_0 sKM = new fnw_0(new foc_0());
    public static final /* enum */ fnw_0 sKN = new fnw_0(new fnz_0());
    public static final /* enum */ fnw_0 sKO = new fnw_0(new fof());
    public static final /* enum */ fnw_0 sKP = new fnw_0(new foa_0());
    public static final /* enum */ fnw_0 sKQ = new fnw_0(new fob_0());
    public static final /* enum */ fnw_0 sKR = new fnw_0(new fnx_0());
    public static final /* enum */ fnw_0 sKS = new fnw_0(new fny_0());
    public static final /* enum */ fnw_0 sKT = new fnw_0(new fod_0());
    public static final /* enum */ fnw_0 sKU = new fnw_0(new foe_0());
    public final byte sKV = (byte)this.ordinal();
    private final aza_2<? extends fnt_0> sKW;
    private static final /* synthetic */ fnw_0[] sKX;

    public static fnw_0[] values() {
        return (fnw_0[])sKX.clone();
    }

    public static fnw_0 valueOf(String string) {
        return Enum.valueOf(fnw_0.class, string);
    }

    private fnw_0(aza_2<? extends fnt_0> aza_22) {
        this.sKW = aza_22;
    }

    public fnt_0 gfi() {
        return this.sKW.createNew();
    }

    @Nullable
    public static fnw_0 he(byte by) {
        for (fnw_0 fnw_02 : fnw_0.values()) {
            if (fnw_02.sKV != by) continue;
            return fnw_02;
        }
        return null;
    }

    public String toString() {
        return "PetChangeType{idx=" + this.sKV + ", factory=" + String.valueOf(this.sKW) + "}";
    }

    private static /* synthetic */ fnw_0[] gfj() {
        return new fnw_0[]{sKM, sKN, sKO, sKP, sKQ, sKR, sKS, sKT, sKU};
    }

    static {
        sKX = fnw_0.gfj();
    }
}

