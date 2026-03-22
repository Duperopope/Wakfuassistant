/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eCI
extends eak_0 {
    private static final List<amz_1[]> pzq = new ArrayList<amz_1[]>();

    @Override
    protected List<amz_1[]> bDC() {
        return Collections.unmodifiableList(pzq);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCI(List<amx_1> list) {
        this.r(list);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof foO) {
            fgj_0 fgj_02 = ((foO)object).gfP();
            return fgj_02.exS();
        }
        return -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLp;
    }

    static {
        pzq.add(amz_1.cJI);
    }
}

