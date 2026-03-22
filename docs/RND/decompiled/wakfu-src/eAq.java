/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

abstract class eAq
extends eAH {
    protected static final ArrayList<amz_1[]> pvX = new ArrayList();
    protected boolean pvJ = false;

    eAq() {
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvX;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        Object object5 = this.pvJ ? object : object2;
        if (object5 != null && object5 instanceof qu_0) {
            so_0 so_02;
            qu_0 qu_02 = (qu_0)object5;
            if (exP2.baD() != null && this.a(so_02 = exP2.baD().o(qu_02.bcC(), qu_02.bcD(), qu_02.bcE()))) {
                return 0;
            }
        }
        return -1;
    }

    protected abstract boolean a(so_0 var1);

    static {
        pvX.add(amz_1.cJI);
        pvX.add(new amz_1[]{amz_1.cJx});
    }
}

