/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFQ
extends eAH {
    private static final List<amz_1[]> pDy = new ArrayList<amz_1[]>();
    private final int pDz;
    private final int pDA;

    @Override
    protected List<amz_1[]> bDC() {
        return pDy;
    }

    public eFQ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pDz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        this.pDA = (int)((amu_1)arrayList.get(1)).d(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eki_0 eki_02 = eAs.n(object, object2, object3, object4);
        return eki_02.fv(this.pDz, this.pDA) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMC;
    }

    public String toString() {
        return "IsKnownRecipe{m_craftId=" + this.pDz + ", m_recipeId=" + this.pDA + "}";
    }

    static {
        pDy.add(new amz_1[]{amz_1.cJy, amz_1.cJy});
    }
}

