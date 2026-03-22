/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eFV
extends eAH
implements ehm_0 {
    private static final ArrayList<amz_1[]> pDG = new ArrayList();
    protected String pvH;

    @Override
    protected List<amz_1[]> bDC() {
        return pDG;
    }

    public eFV(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null && object3 instanceof ehe_0) {
            eyo_02 = ((ehe_0)object3).fog();
        }
        if (eyo_02 == null) {
            return -1;
        }
        if (!eyo_02.djT()) {
            return -1;
        }
        etu_0<?> etu_02 = eAs.m(eyo_02, object4);
        if (etu_02 == null) {
            return -1;
        }
        rh_0 rh_02 = etu_02.bag();
        if (rh_02 == null) {
            return -1;
        }
        rj_0 rj_02 = rh_02.X(eyo_02.bcC(), eyo_02.bcD());
        byte by = eyo_02.bcO();
        if (by <= 0) {
            return rj_02 != null && (rj_02.bcS() || rj_02.bcT()) ? 0 : -1;
        }
        for (int i = eyo_02.bcC() - by; i < eyo_02.bcC() + by; ++i) {
            for (int j = eyo_02.bcD() - by; j < eyo_02.bcD() + by; ++j) {
                rj_0 rj_03 = rh_02.X(i, j);
                if (rj_03 == null || !rj_03.bcS() && !rj_03.bcT()) continue;
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMG;
    }

    @Override
    public boolean fnF() {
        if (this.pvH == null) {
            return false;
        }
        return this.pvH.equalsIgnoreCase("target");
    }

    static {
        pDG.add(eAC.pwq);
        pDG.add(eAC.pwr);
    }
}

