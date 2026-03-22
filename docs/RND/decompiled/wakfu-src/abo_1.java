/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBO
 */
class abo_1
implements Comparator<abq_1> {
    abo_1() {
    }

    public int a(abq_1 abq_12, abq_1 abq_13) {
        return Double.compare(abq_12.bWl(), abq_13.bWl());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abq_1)object, (abq_1)object2);
    }
}

