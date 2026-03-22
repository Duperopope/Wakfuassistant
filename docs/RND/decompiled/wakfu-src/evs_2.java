/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.Comparator;

/*
 * Renamed from evs
 */
class evs_2
implements Comparator<evt_2> {
    evs_2() {
    }

    public int a(evt_2 evt_22, evt_2 evt_23) {
        return Ints.compare((int)evt_22.vY(), (int)evt_23.vY());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((evt_2)object, (evt_2)object2);
    }
}

