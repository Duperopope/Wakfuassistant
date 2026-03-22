/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fHy
 */
class fhy_1
implements Comparator<fhv_1> {
    fhy_1() {
    }

    public int c(fhv_1 fhv_12, fhv_1 fhv_13) {
        return fhv_13.getModalLevel() - fhv_12.getModalLevel();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((fhv_1)object, (fhv_1)object2);
    }
}

