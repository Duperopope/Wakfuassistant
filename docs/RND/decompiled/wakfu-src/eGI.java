/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGI
extends eAH {
    private static final ArrayList<amz_1[]> pEK = new ArrayList();

    public eGI(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pEK;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1;
        }
        return ero_02.cXt() == 7 ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMj;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pEK.add(eAC.pwq);
    }
}

