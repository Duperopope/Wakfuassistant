/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqv
 */
class bqv_1
extends bqu_1
implements bek_0 {
    @NotNull
    private final bgv_2 jab;
    private final int jac;

    bqv_1(int n, int n2) {
        this.jab = Objects.requireNonNull((bgv_2)bEm.dSb().Vd(n));
        this.jac = n2;
    }

    @Override
    protected int dEj() {
        return this.jab.aVt();
    }

    @Override
    protected String dEk() {
        return this.jab.getName();
    }

    @Override
    protected long aBF() {
        return this.jac;
    }

    @Override
    protected boolean dEl() {
        return bpm_1.dCG().i(this.jab);
    }

    @Override
    protected OptionalInt dEm() {
        return OptionalInt.of(this.jab.d());
    }

    @Override
    public bgv_2 duo() {
        return this.jab;
    }
}

