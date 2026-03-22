/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDZ
extends eAH {
    private static final ArrayList<amz_1[]> pBi = new ArrayList();
    private final boolean pBj;
    private final boolean pBk;

    @Override
    protected List<amz_1[]> bDC() {
        return pBi;
    }

    public eDZ(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.isEmpty()) {
            this.pBj = false;
            this.pBk = true;
        } else if (arrayList.size() == 1) {
            this.pBj = ((amz_2)arrayList.get(0)).b(null, null, null, null);
            this.pBk = true;
        } else {
            this.pBj = ((amz_2)arrayList.get(0)).b(null, null, null, null);
            this.pBk = ((amz_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pBk, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(object instanceof exP)) {
            return -1;
        }
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (etu_02 == null) {
            return -1;
        }
        acd_1 acd_12 = null;
        if (eyo_02 instanceof exP) {
            acd_12 = ((exP)eyo_02).eap();
        } else if (eyo_02 instanceof acd_1) {
            acd_12 = (acd_1)((Object)eyo_02);
        }
        if (acd_12 != null) {
            rh_0 rh_02 = etu_02.bag();
            if (this.a(rh_02, acd_12.getX() + 1, acd_12.getY(), this.pBj)) {
                return 0;
            }
            if (this.a(rh_02, acd_12.getX() - 1, acd_12.getY(), this.pBj)) {
                return 0;
            }
            if (this.a(rh_02, acd_12.getX(), acd_12.getY() + 1, this.pBj)) {
                return 0;
            }
            if (this.a(rh_02, acd_12.getX(), acd_12.getY() - 1, this.pBj)) {
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean a(rh_0 rh_02, int n, int n2, boolean bl) {
        if (rh_02.X(n, n2) != null) {
            return false;
        }
        if (bl) {
            return rh_02.T(n, n2);
        }
        return rh_02.S(n, n2);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIN;
    }

    static {
        pBi.add(eAC.pwq);
        pBi.add(eAC.pws);
        pBi.add(new amz_1[]{amz_1.cJz, amz_1.cJz});
    }
}

