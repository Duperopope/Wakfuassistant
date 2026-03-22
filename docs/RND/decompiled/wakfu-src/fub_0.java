/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from fub
 */
public final class fub_0
extends Enum<fub_0> {
    public static final /* enum */ fub_0 thi = new fub_0(0);
    public static final /* enum */ fub_0 thj = new fub_0(1);
    public static final /* enum */ fub_0 thk = new fub_0(2);
    private final byte thl;
    private static final /* synthetic */ fub_0[] thm;

    public static fub_0[] values() {
        return (fub_0[])thm.clone();
    }

    public static fub_0 valueOf(String string) {
        return Enum.valueOf(fub_0.class, string);
    }

    public static fub_0 hK(byte by) {
        for (fub_0 fub_02 : fub_0.values()) {
            if (fub_02.thl != by) continue;
            return fub_02;
        }
        return thi;
    }

    @Generated
    private fub_0(byte by) {
        this.thl = by;
    }

    @Generated
    public byte aJr() {
        return this.thl;
    }

    private static /* synthetic */ fub_0[] gnc() {
        return new fub_0[]{thi, thj, thk};
    }

    static {
        thm = fub_0.gnc();
    }
}

