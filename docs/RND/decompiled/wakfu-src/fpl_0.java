/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fpL
 */
public final class fpl_0
extends Enum<fpl_0> {
    public static final /* enum */ fpl_0 sQF = new fpl_0(0);
    public static final /* enum */ fpl_0 sQG = new fpl_0(1);
    public static final /* enum */ fpl_0 sQH = new fpl_0(2);
    private final byte sQI;
    private static final /* synthetic */ fpl_0[] sQJ;

    public static fpl_0[] values() {
        return (fpl_0[])sQJ.clone();
    }

    public static fpl_0 valueOf(String string) {
        return Enum.valueOf(fpl_0.class, string);
    }

    private fpl_0(byte by) {
        this.sQI = by;
    }

    public byte aJr() {
        return this.sQI;
    }

    @Nullable
    public static fpl_0 hl(byte by) {
        for (fpl_0 fpl_02 : fpl_0.values()) {
            if (fpl_02.sQI != by) continue;
            return fpl_02;
        }
        return null;
    }

    private static /* synthetic */ fpl_0[] ghn() {
        return new fpl_0[]{sQF, sQG, sQH};
    }

    static {
        sQJ = fpl_0.ghn();
    }
}

