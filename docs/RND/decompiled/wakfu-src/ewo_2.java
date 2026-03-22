/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eWO
 */
class ewo_2
implements Comparator<enk_0> {
    ewo_2(ewn_2 ewn_22) {
    }

    public int a(enk_0 enk_02, enk_0 enk_03) {
        if (enk_02 == enk_03) {
            return 0;
        }
        return enk_02.aZH() - enk_03.aZH();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((enk_0)object, (enk_0)object2);
    }
}

