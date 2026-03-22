/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGJ
extends eAH {
    private static final ArrayList<amz_1[]> pEL = new ArrayList();

    public eGJ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pEL;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (enk_02 == null) {
            return -1;
        }
        return enk_02.df(1L) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMi;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pEL.add(eAC.pwq);
    }
}

