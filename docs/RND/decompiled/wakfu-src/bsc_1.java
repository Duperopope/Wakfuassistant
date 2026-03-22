/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSC
 */
public final class bsc_1
extends Enum<bsc_1>
implements aeh_2 {
    public static final /* enum */ bsc_1 lhu = new bsc_1(0, "options.desc.relic.aura.all");
    public static final /* enum */ bsc_1 lhv = new bsc_1(1, "options.desc.relic.aura.mine");
    public static final /* enum */ bsc_1 lhw = new bsc_1(2, "options.desc.relic.aura.none");
    public static final String lhx = "id";
    public static final String lhy = "description";
    private final int lhz;
    private final String lhA;
    private static final /* synthetic */ bsc_1[] lhB;

    public static bsc_1[] values() {
        return (bsc_1[])lhB.clone();
    }

    public static bsc_1 valueOf(String string) {
        return Enum.valueOf(bsc_1.class, string);
    }

    private bsc_1(int n2, String string2) {
        this.lhz = n2;
        this.lhA = string2;
    }

    public int d() {
        return this.lhz;
    }

    public String clY() {
        return this.lhA;
    }

    @Override
    public String[] bxk() {
        return new String[]{lhx, lhy};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lhy.equals(string)) {
            return aum_0.cWf().c(this.lhA, new Object[0]);
        }
        if (lhx.equals(string)) {
            return this.lhz;
        }
        return null;
    }

    public static Optional<bsc_1> Jv(int n) {
        for (bsc_1 bsc_12 : bsc_1.values()) {
            if (n != bsc_12.lhz) continue;
            return Optional.of(bsc_12);
        }
        return Optional.empty();
    }

    private static /* synthetic */ bsc_1[] emV() {
        return new bsc_1[]{lhu, lhv, lhw};
    }

    static {
        lhB = bsc_1.emV();
    }
}

