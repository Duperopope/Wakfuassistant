/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from VG
 */
public final class vg_0
extends Enum<vg_0> {
    public static final /* enum */ vg_0 bJu = new vg_0(0, "low");
    public static final /* enum */ vg_0 bJv = new vg_0(1, "low");
    public static final /* enum */ vg_0 bJw = new vg_0(2, "medium");
    public static final /* enum */ vg_0 bJx = new vg_0(3, "high");
    private final int bJy;
    private final String bJz;
    private static final /* synthetic */ vg_0[] bJA;

    public static vg_0[] values() {
        return (vg_0[])bJA.clone();
    }

    public static vg_0 valueOf(String string) {
        return Enum.valueOf(vg_0.class, string);
    }

    private vg_0(int n2, String string2) {
        this.bJy = n2;
        this.bJz = string2;
    }

    public static vg_0 pW(int n) {
        for (vg_0 vg_02 : vg_0.values()) {
            if (vg_02.bJy != n) continue;
            return vg_02;
        }
        return bJu;
    }

    public int d() {
        return this.bJy;
    }

    @NotNull
    public String bkC() {
        return this.bJz;
    }

    private static /* synthetic */ vg_0[] bkD() {
        return new vg_0[]{bJu, bJv, bJw, bJx};
    }

    static {
        bJA = vg_0.bkD();
    }
}

