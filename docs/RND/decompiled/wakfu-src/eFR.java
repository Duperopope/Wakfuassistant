/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eFR
extends eAH {
    private int euz;
    private boolean pDB;
    private static final ArrayList<amz_1[]> pDC = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDC;
    }

    public eFR() {
    }

    public eFR(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.euz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pDB = false;
        } else if (s == 1) {
            this.euz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pDB = ((ang_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        if (this.pDB) {
            bl = fig_0.ssF.Qh(this.euz);
        } else {
            if (!(object instanceof fic_0)) {
                return -1;
            }
            fic_0 fic_02 = (fic_0)object;
            fia_0 fia_02 = fic_02.dmD();
            bl = fia_02.Qh(this.euz);
        }
        return bl ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLB;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pDC.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJy, amz_1.cJz};
        pDC.add(amz_1Array);
    }
}

