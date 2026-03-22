/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
import com.google.common.base.Predicate;
import javax.annotation.Nullable;

/*
 * Renamed from bMu
 */
class bmu_0
implements Predicate<bmt_0> {
    final /* synthetic */ eNd kxm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bmu_0(eNd eNd2) {
        this.kxm = eNd2;
    }

    public boolean g(@Nullable bmt_0 bmt_02) {
        return bmt_02 != null && bmt_02.giG() == this.kxm.aJr();
    }

    public /* synthetic */ boolean apply(@Nullable Object object) {
        return this.g((bmt_0)object);
    }
}

