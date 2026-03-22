/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Rc
 */
public final class rc_0
extends Enum<rc_0> {
    public static final /* enum */ rc_0 bjv = new rc_0();
    public static final /* enum */ rc_0 bjw = new rc_0();
    public static final /* enum */ rc_0 bjx = new rc_0();
    private static final rc_0[] bjy;
    private static final /* synthetic */ rc_0[] bjz;

    public static rc_0[] values() {
        return (rc_0[])bjz.clone();
    }

    public static rc_0 valueOf(String string) {
        return Enum.valueOf(rc_0.class, string);
    }

    @NotNull
    public static Optional<rc_0> mL(int n) {
        if (0 <= n && n < bjy.length) {
            return Optional.of(bjy[n]);
        }
        return Optional.empty();
    }

    public static Optional<rc_0> dh(String string) {
        for (rc_0 rc_02 : bjy) {
            if (!rc_02.name().equalsIgnoreCase(string)) continue;
            return Optional.of(rc_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ rc_0[] bdq() {
        return new rc_0[]{bjv, bjw, bjx};
    }

    static {
        bjz = rc_0.bdq();
        bjy = rc_0.values();
    }
}

