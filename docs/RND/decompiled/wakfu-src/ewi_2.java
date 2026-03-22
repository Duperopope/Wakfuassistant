/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eWi
 */
public final class ewi_2 {
    private final ewd_2 rBd = new ewd_2();

    public ewh_2 a(exP exP2, Collection<? extends exP> collection, acd_1 acd_12) {
        if (exP2 == null) {
            return ewh_2.rAZ;
        }
        if (exP2.buW() || exP2.baI() || exP2.baM() || exP2.a(exe_1.rEq)) {
            return ewh_2.rAZ;
        }
        if (collection.isEmpty()) {
            return ewh_2.rAZ;
        }
        this.rBd.a(exP2);
        return this.rBd.a(collection, acd_12);
    }
}

