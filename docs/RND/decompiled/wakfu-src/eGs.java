/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eGs
extends eAH {
    private final ub_0 pEm;
    private static final ArrayList<amz_1[]> pEn = new ArrayList();

    public eGs(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        String string = ((anh_2)arrayList.get(0)).getValue();
        this.pEm = ub_0.valueOf(string);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEn;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (ue_0.bjV().bjo() && ue_0.bjV().bjn() == this.pEm) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFR;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pEn.add(amz_1Array);
    }
}

