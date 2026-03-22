/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fHD
 */
class fhd_2
implements Comparator<fcv_1> {
    static final fhd_2 uyI = new fhd_2();

    private fhd_2() {
    }

    public int a(fcv_1 fcv_12, fcv_1 fcv_13) {
        return fcv_12.getTreeDepth() - fcv_13.getTreeDepth();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fcv_1)object, (fcv_1)object2);
    }
}

