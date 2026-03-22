/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class bPk
extends Enum<bPk> {
    public static final /* enum */ bPk kOw = new bPk("");
    public static final /* enum */ bPk kOx = new bPk("PARTNER_MISSING");
    public static final /* enum */ bPk kOy = new bPk("PARTNER_NOORDER");
    public static final /* enum */ bPk kOz = new bPk("PARTNER_ERROR");
    public static final /* enum */ bPk kOA = new bPk("QUICKBUY_PAIDFAILED");
    public static final /* enum */ bPk kOB = new bPk("QUICKBUY_CANCELFAILED");
    private final String kOC;
    private static final /* synthetic */ bPk[] kOD;

    public static bPk[] values() {
        return (bPk[])kOD.clone();
    }

    public static bPk valueOf(String string) {
        return Enum.valueOf(bPk.class, string);
    }

    private bPk(String string2) {
        this.kOC = string2;
    }

    @Nullable
    public static bPk nf(String string) {
        for (bPk bPk2 : bPk.values()) {
            if (!bPk2.kOC.equals(string)) continue;
            return bPk2;
        }
        return null;
    }

    private static /* synthetic */ bPk[] ehW() {
        return new bPk[]{kOw, kOx, kOy, kOz, kOA, kOB};
    }

    static {
        kOD = bPk.ehW();
    }
}

