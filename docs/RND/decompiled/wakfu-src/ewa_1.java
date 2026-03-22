/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Iterator;

/*
 * Renamed from eWA
 */
final class ewa_1
implements eNl {
    final enk_0 rBL;
    final long rBM;

    ewa_1(long l, enk_0 enk_02) {
        this.rBL = enk_02;
        this.rBM = l;
    }

    @Override
    public short cmL() {
        return 0;
    }

    @Override
    public short fvT() {
        return 0;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 0;
    }

    @Override
    public int bab() {
        return 21;
    }

    @Override
    public long QF() {
        return this.rBM;
    }

    @Override
    public Iterator<enk_0> iterator() {
        return Collections.singleton(this.rBL).iterator();
    }

    public enk_0 dIy() {
        return this.rBL;
    }
}

