/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cVi
 */
class cvi_1
implements Comparator<bvj> {
    cvi_1(cvg_2 cvg_22) {
    }

    public int a(bvj bvj2, bvj bvj3) {
        return bvj2.getName().compareTo(bvj3.getName());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvj)object, (bvj)object2);
    }
}

