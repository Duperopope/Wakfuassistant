/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDt
extends eak_0 {
    private static final ArrayList<amz_1[]> pAm = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAm;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        ero_0 ero_02 = eAs.aQ(object3);
        if (ero_02 == null || ero_02.bbf() == null) {
            return 0L;
        }
        return ((eNl)ero_02.bbf()).bab();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNr;
    }

    static {
        pAm.add(eAC.pwq);
    }
}

