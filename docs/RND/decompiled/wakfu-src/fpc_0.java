/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from fpC
 */
public final class fpc_0
extends Enum<fpc_0> {
    public static final /* enum */ fpc_0 sQd = new fpc_0(50L, "D");
    public static final /* enum */ fpc_0 sQe = new fpc_0(300L, "D");
    public static final /* enum */ fpc_0 sQf = new fpc_0(700L, "C");
    public static final /* enum */ fpc_0 sQg = new fpc_0(1300L, "B");
    public static final /* enum */ fpc_0 sQh = new fpc_0(Long.MAX_VALUE, "A");
    private final long sQi;
    private final String sQj;
    private static final /* synthetic */ fpc_0[] sQk;

    public static fpc_0[] values() {
        return (fpc_0[])sQk.clone();
    }

    public static fpc_0 valueOf(String string) {
        return Enum.valueOf(fpc_0.class, string);
    }

    private fpc_0(long l, String string2) {
        this.sQi = l;
        this.sQj = string2;
    }

    public String ggX() {
        return this.sQj;
    }

    public static fpc_0 uw(long l) {
        fpc_0[] fpc_0Array;
        for (fpc_0 fpc_02 : fpc_0Array = fpc_0.values()) {
            if (l >= fpc_02.sQi) continue;
            return fpc_02;
        }
        return sQh;
    }

    public long ggY() {
        fpc_0[] fpc_0Array = fpc_0.values();
        int n = Arrays.binarySearch((Object[])fpc_0Array, (Object)this);
        if (n <= 0) {
            return 0L;
        }
        return fpc_0Array[n - 1].sQi;
    }

    public long ggZ() {
        return this.sQi;
    }

    private static /* synthetic */ fpc_0[] gha() {
        return new fpc_0[]{sQd, sQe, sQf, sQg, sQh};
    }

    static {
        sQk = fpc_0.gha();
    }
}

