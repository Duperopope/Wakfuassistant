/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 */
import com.google.common.primitives.Longs;
import java.util.Comparator;

/*
 * Renamed from evr
 */
class evr_2
implements Comparator<evk_2> {
    evr_2() {
    }

    public int a(evk_2 evk_22, evk_2 evk_23) {
        return Longs.compare((long)evk_22.xl(), (long)evk_23.xl());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((evk_2)object, (evk_2)object2);
    }
}

