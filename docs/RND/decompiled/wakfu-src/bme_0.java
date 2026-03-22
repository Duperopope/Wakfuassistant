/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

/*
 * Renamed from bMe
 */
public class bme_0
implements Predicate<bmt_0> {
    private bgy kvR;

    public bme_0(bgy bgy2) {
        this.kvR = bgy2;
    }

    public boolean f(bmt_0 bmt_02) {
        if (bmt_02 == null) {
            return true;
        }
        ang_2 ang_22 = bmt_02.giI();
        if (ang_22 == null) {
            return true;
        }
        bgy bgy2 = this.kvR;
        if (bgy2 == null) {
            bgy2 = aue_0.cVJ().cVK();
        }
        return ang_22.b(bgy2, bgy2, this, bgy2.dkZ());
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.f((bmt_0)object);
    }
}

