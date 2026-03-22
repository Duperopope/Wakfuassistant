/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from feP
 */
public final class fep_0
extends Enum<fep_0> {
    public static final /* enum */ fep_0 seQ = new fep_0(new feq_0());
    public static final /* enum */ fep_0 seR = new fep_0(new fes_0());
    public static final /* enum */ fep_0 seS = new fep_0(new fer_0());
    public final byte seT = (byte)this.ordinal();
    private final aza_2<? extends fen_0> seU;
    private static final /* synthetic */ fep_0[] seV;

    public static fep_0[] values() {
        return (fep_0[])seV.clone();
    }

    public static fep_0 valueOf(String string) {
        return Enum.valueOf(fep_0.class, string);
    }

    private fep_0(aza_2<? extends fen_0> aza_22) {
        this.seU = aza_22;
    }

    public fen_0 fUK() {
        return this.seU.createNew();
    }

    @Nullable
    public static fep_0 ge(byte by) {
        for (fep_0 fep_02 : fep_0.values()) {
            if (fep_02.seT != by) continue;
            return fep_02;
        }
        return null;
    }

    public String toString() {
        return "PetChangeType{idx=" + this.seT + ", factory=" + String.valueOf(this.seU) + "}";
    }

    private static /* synthetic */ fep_0[] fUL() {
        return new fep_0[]{seQ, seR, seS};
    }

    static {
        seV = fep_0.fUL();
    }
}

