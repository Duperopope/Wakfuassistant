/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.Comparator;

/*
 * Renamed from fHK
 */
class fhk_2
implements Comparator<fhi_2> {
    public static final Comparator<fhi_2> uzg = new fhk_2();

    private fhk_2() {
    }

    public int c(fhi_2 fhi_22, fhi_2 fhi_23) {
        if (fhi_22 == null) {
            return -1;
        }
        if (fhi_23 == null) {
            return 1;
        }
        return Ints.compare((int)fhi_22.getTreeDepth(), (int)fhi_23.getTreeDepth());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((fhi_2)object, (fhi_2)object2);
    }
}

