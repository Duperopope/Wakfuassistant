/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fsh
 */
public final class fsh_0
extends Enum<fsh_0> {
    public static final /* enum */ fsh_0 tbQ = new fsh_0(0);
    public static final /* enum */ fsh_0 tbR = new fsh_0(1);
    private final byte tbS;
    private static final /* synthetic */ fsh_0[] tbT;

    public static fsh_0[] values() {
        return (fsh_0[])tbT.clone();
    }

    public static fsh_0 valueOf(String string) {
        return Enum.valueOf(fsh_0.class, string);
    }

    private fsh_0(byte by) {
        this.tbS = by;
    }

    public byte aJr() {
        return this.tbS;
    }

    @Nullable
    public static fsh_0 hG(byte by) {
        for (fsh_0 fsh_02 : fsh_0.values()) {
            if (fsh_02.tbS != by) continue;
            return fsh_02;
        }
        return null;
    }

    private static /* synthetic */ fsh_0[] gkO() {
        return new fsh_0[]{tbQ, tbR};
    }

    static {
        tbT = fsh_0.gkO();
    }
}

