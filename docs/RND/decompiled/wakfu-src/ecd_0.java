/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eCd
 */
public final class ecd_0
extends ebx_0 {
    private static final ArrayList<amz_1[]> pyA = new ArrayList();
    private amu_1 pyB;
    private long pyC;

    @Override
    protected List<amz_1[]> bDC() {
        return pyA;
    }

    public ecd_0(ArrayList<amx_1> arrayList) {
        this.pxE = (amu_1)arrayList.get(0);
        this.pxi = ((anh_2)arrayList.get(1)).getValue();
        this.pyB = (amu_1)arrayList.get(2);
    }

    protected Collection<? extends exP> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        if (etu_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = etu_02.fKc();
        ArrayList<exP> arrayList = new ArrayList<exP>();
        for (exP exP2 : collection) {
            if ((long)exP2.aWP() != this.pyC) continue;
            arrayList.add(exP2);
        }
        return arrayList;
    }

    @Override
    protected void j(Object object, Object object2, Object object3, Object object4) {
        this.pyC = this.pyB.d(object, object2, object4, object3);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJT;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy};
        pyA.add(amz_1Array);
    }
}

