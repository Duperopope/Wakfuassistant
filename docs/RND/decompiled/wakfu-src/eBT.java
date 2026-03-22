/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eBT
extends eak_0 {
    private static final List<amz_1[]> pyg = new ArrayList<amz_1[]>();

    public eBT(ArrayList<amx_1> arrayList) {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return Collections.unmodifiableList(pyg);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        ety_0 ety_02 = eAs.aO(object4);
        if (ety_02 == null && object3 != null && object3 instanceof ehe_0) {
            ety_02 = ((ehe_0)object3).fog().dlK();
        }
        if (ety_02 == null && object != null && object instanceof exP) {
            ety_02 = ((exP)object).dlK();
        }
        if (ety_02 == null) {
            return 0L;
        }
        return ety_02.dGo().aZv();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJR;
    }

    static {
        pyg.add(amz_1.cJI);
    }
}

