/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eFg
extends eAH {
    private boolean pvJ = false;
    private static final ArrayList<amz_1[]> pCR = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCR;
    }

    public eFg(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                this.pvJ = false;
                break;
            }
            case 1: {
                String string = ((anh_2)arrayList.get(0)).getValue();
                if (!string.equalsIgnoreCase("target")) break;
                this.pvJ = true;
            }
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        if (exP2.fha()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIU;
    }

    static {
        pCR.add(amz_1.cJI);
        pCR.add(new amz_1[]{amz_1.cJx});
    }
}

