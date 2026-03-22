/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import java.util.List;

@Criterion(description="Return true if the triggering effect is an INDIRECT effect", signatures={@Signature})
public class eGF
extends eAH {
    private static final ArrayList<amz_1[]> pEI = new ArrayList();

    public eGF(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEI;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null) {
            return -1;
        }
        if (ero_02.a(eNi.qWV)) {
            return -1;
        }
        eNl eNl2 = (eNl)ero_02.bbf();
        if (eNl2 == null) {
            return -1;
        }
        int n = eNl2.bab();
        boolean bl = n == 12 || n == 11;
        return bl ? -1 : 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pOb;
    }

    static {
        pEI.add(eAC.pwq);
    }
}

