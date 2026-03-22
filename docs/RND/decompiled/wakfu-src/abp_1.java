/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBP
 */
class abp_1
implements Comparator<abq_1> {
    abp_1() {
    }

    public int a(abq_1 abq_12, abq_1 abq_13) {
        return Double.compare(abq_13.dAa, abq_12.dAa);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abq_1)object, (abq_1)object2);
    }
}

