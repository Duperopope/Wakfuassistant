/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Rb
 */
public final class rb_0
extends Enum<rb_0> {
    public static final /* enum */ rb_0 bjq = new rb_0();
    public static final /* enum */ rb_0 bjr = new rb_0();
    public static final /* enum */ rb_0 bjs = new rb_0();
    private static final rb_0[] bjt;
    private static final /* synthetic */ rb_0[] bju;

    public static rb_0[] values() {
        return (rb_0[])bju.clone();
    }

    public static rb_0 valueOf(String string) {
        return Enum.valueOf(rb_0.class, string);
    }

    @NotNull
    public static Optional<rb_0> mL(int n) {
        if (0 <= n && n < bjt.length) {
            return Optional.of(bjt[n]);
        }
        return Optional.empty();
    }

    public static Optional<rb_0> dh(String string) {
        for (rb_0 rb_02 : bjt) {
            if (!rb_02.name().equalsIgnoreCase(string)) continue;
            return Optional.of(rb_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ rb_0[] bdp() {
        return new rb_0[]{bjq, bjr, bjs};
    }

    static {
        bju = rb_0.bdp();
        bjt = rb_0.values();
    }
}

