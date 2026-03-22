/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;

/*
 * Renamed from azG
 */
final class azg_2<T>
extends azf_2<T> {
    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    azg_2(azz_1 azz_12, Comparator comparator) {
        super(comparator);
    }

    @Override
    public int a(azz_1<T> azz_12, T t) {
        return Collections.binarySearch(azz_12, t, this.dvP);
    }
}

