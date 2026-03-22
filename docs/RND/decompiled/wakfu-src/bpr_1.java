/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bpr
 */
public final class bpr_1
extends Enum<bpr_1> {
    public static final /* enum */ bpr_1 iVl = new bpr_1(0, false);
    public static final /* enum */ bpr_1 iVm = new bpr_1(1, true);
    public static final /* enum */ bpr_1 iVn = new bpr_1(2, true);
    private static final bpr_1[] iVo;
    private final int iVp;
    private final boolean iVq;
    private static final /* synthetic */ bpr_1[] iVr;

    public static bpr_1[] values() {
        return (bpr_1[])iVr.clone();
    }

    public static bpr_1 valueOf(String string) {
        return Enum.valueOf(bpr_1.class, string);
    }

    private bpr_1(int n2, boolean bl) {
        this.iVp = n2;
        this.iVq = bl;
    }

    public int d() {
        return this.iVp;
    }

    public boolean dCO() {
        return this.iVq;
    }

    public static Optional<bpr_1> dh(String string) {
        for (bpr_1 bpr_12 : iVo) {
            if (!bpr_12.name().equalsIgnoreCase(string)) continue;
            return Optional.of(bpr_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bpr_1[] dCP() {
        return new bpr_1[]{iVl, iVm, iVn};
    }

    static {
        iVr = bpr_1.dCP();
        iVo = bpr_1.values();
    }
}

