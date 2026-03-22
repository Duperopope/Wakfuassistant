/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGE
extends eAH {
    private static final ArrayList<amz_1[]> pEG = new ArrayList();
    private amu_1 pEH;

    public eGE(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pEH = (amu_1)arrayList.get(0);
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pEG;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1;
        }
        eNi eNi2 = eNi.RQ((int)this.pEH.d(object, object2, object3, object4));
        return ero_02.a(eNi2) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMj;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pEG.add(amz_1Array);
    }
}

