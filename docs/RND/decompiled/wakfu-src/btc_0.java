/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btc
 */
public final class btc_0
extends euo_0 {
    private final Collection<bgy> jkE = new HashSet<bgy>();

    @Override
    @Nullable
    public rj_0 X(int n, int n2) {
        byte by = this.V(n, n2);
        if (by < 0) {
            return null;
        }
        rj_0 rj_02 = this.P(by);
        if (this.jkE.contains(rj_02)) {
            return null;
        }
        return rj_02;
    }

    public void bt(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        this.jkE.add(bgy2);
    }

    public void bu(bgy bgy2) {
        if (bgy2 == null) {
            return;
        }
        this.jkE.remove(bgy2);
    }
}

