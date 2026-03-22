/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eNn
 */
class enn_0
implements eNl {
    private final long qXy;
    private final enk_0 qXz;
    private final int qXA;
    short ejt = 0;
    short qXt = 0;
    short qXu = 0;
    short qXv = 0;

    enn_0(long l, int n, enk_0 enk_02) {
        this.qXy = l;
        this.qXA = n;
        this.qXz = enk_02;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public short fvT() {
        return this.qXt;
    }

    @Override
    public short fvU() {
        return this.qXu;
    }

    @Override
    public short fvV() {
        return this.qXv;
    }

    @Override
    public int bab() {
        return this.qXA;
    }

    @Override
    public long QF() {
        return this.qXy;
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return Collections.singleton(this.qXz).iterator();
    }
}

