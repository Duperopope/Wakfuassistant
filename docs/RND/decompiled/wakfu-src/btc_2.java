/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTC
 */
public class btc_2 {
    private static final btc_2 lqb = new btc_2();
    @Nullable
    private ezs_0 lqc;

    public static btc_2 eoi() {
        return lqb;
    }

    private btc_2() {
    }

    public void a(@Nullable ezs_0 ezs_02) {
        this.lqc = ezs_02;
    }

    public Optional<Short> JC(int n) {
        return Optional.ofNullable(this.lqc).map(ezs_02 -> ezs_02.fnf().get(n));
    }

    public boolean eoj() {
        if (this.lqc == null) {
            return false;
        }
        for (short s : this.lqc.fnf().values()) {
            if (s <= 0) continue;
            return true;
        }
        return false;
    }
}

