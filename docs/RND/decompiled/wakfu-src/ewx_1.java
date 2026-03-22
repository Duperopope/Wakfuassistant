/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWX
 */
public final class ewx_1
extends Enum<ewx_1> {
    public static final /* enum */ ewx_1 rCS = new ewx_1(0);
    public static final /* enum */ ewx_1 rCT = new ewx_1(1);
    public static final /* enum */ ewx_1 rCU = new ewx_1(2);
    private final byte rCV;
    private static final /* synthetic */ ewx_1[] rCW;

    public static ewx_1[] values() {
        return (ewx_1[])rCW.clone();
    }

    public static ewx_1 valueOf(String string) {
        return Enum.valueOf(ewx_1.class, string);
    }

    private ewx_1(int n2) {
        this.rCV = GC.ct(n2);
    }

    public byte aJr() {
        return this.rCV;
    }

    @Nullable
    public static ewx_1 fN(byte by) {
        for (ewx_1 ewx_12 : ewx_1.values()) {
            if (ewx_12.rCV != by) continue;
            return ewx_12;
        }
        return null;
    }

    private static /* synthetic */ ewx_1[] fOt() {
        return new ewx_1[]{rCS, rCT, rCU};
    }

    static {
        rCW = ewx_1.fOt();
    }
}

