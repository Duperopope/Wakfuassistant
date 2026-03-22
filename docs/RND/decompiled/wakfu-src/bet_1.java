/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/*
 * Renamed from bEt
 */
public class bet_1
implements bug_0<ffV> {
    private final Set<Integer> jOp;

    public bet_1(Set<Integer> set) {
        this.jOp = Collections.unmodifiableSet(set);
    }

    public Set<Integer> dSj() {
        return this.jOp;
    }

    public boolean L(ffV ffV2) {
        return bet_1.aN(ffV2).map(this.jOp::contains).orElse(false);
    }

    private static Optional<Integer> aN(ffV ffV2) {
        if (ffV2.fWs() || ffV2.fWt()) {
            return Optional.of(0);
        }
        if (!ffV2.dOg().fYy()) {
            return Optional.empty();
        }
        return Optional.of(ffV2.fVX());
    }

    @Override
    public boolean isValid() {
        return !this.jOp.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joF;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

