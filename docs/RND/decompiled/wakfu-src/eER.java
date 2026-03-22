/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eER
extends eAH {
    private int iXY;
    private static final ArrayList<amz_1[]> pCx = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCx;
    }

    @Deprecated
    public eER() {
    }

    public eER(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.iXY = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        etu_0 etu_02 = eAs.aO(object4);
        if (etu_02 == null) {
            return -1;
        }
        if (etu_02.bak() == null) {
            return -1;
        }
        boolean bl2 = ((eUP)etu_02.bak()).e(fqS.sWr);
        if (bl2) {
            boolean bl3;
            boolean bl4 = bl3 = this.iXY == eNd.qPe.aJr();
            if (bl3) {
                return 0;
            }
            return -1;
        }
        boolean bl5 = bl = etu_02.bak().baQ() == this.iXY;
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJF;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCx.add(amz_1Array);
    }
}

