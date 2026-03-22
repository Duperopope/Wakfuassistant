/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from eKm
 */
public final class ekm_0 {
    private static ekm_0 qBB = new ekm_0();
    private final Map<Long, GE> qBC = new HashMap<Long, GE>();

    public static ekm_0 fxR() {
        return qBB;
    }

    private ekm_0() {
    }

    public boolean S(long l2, long l3) {
        GE gE = this.qBC.computeIfAbsent(l2, l -> new GE(1, TimeUnit.SECONDS));
        return gE.cA(l3) > 5;
    }
}

