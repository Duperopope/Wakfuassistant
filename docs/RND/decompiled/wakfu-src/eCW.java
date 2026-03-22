/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eCW
extends eak_0 {
    private static final ArrayList<amz_1[]> pzE = new ArrayList();

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzE;
    }

    public eCW(ArrayList<amx_1> arrayList) {
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(ehl_0.pFq, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        if (!(exP2 instanceof ezi_0)) {
            return -1L;
        }
        ezk_0 ezk_02 = (ezk_0)exP2.dob();
        if (ezk_02 == null) {
            return -1L;
        }
        long l = ezk_02.fmV();
        return this.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFF;
    }

    static {
        pzE.add(eAC.pwq);
    }
}

