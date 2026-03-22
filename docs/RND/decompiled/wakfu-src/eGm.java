/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGm
extends eAH {
    private static final ArrayList<amz_1[]> pEe = new ArrayList();
    private static final int pEf = 0;
    private short aZk;
    private String pvH = "target";

    public eGm(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.aZk = 0;
        if (by == 1) {
            this.aZk = (short)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
        if (by == 2) {
            this.aZk = (short)((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pvH = ((anh_2)arrayList.get(1)).getValue();
        }
        if (by == 3) {
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEe;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        if (!(object instanceof eyo_0)) {
            throw new amf_2("on essaie de savoir si la cible est une invoc d'un user invalide " + String.valueOf(object));
        }
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null && object3 instanceof ehe_0) {
            eyo_02 = ((ehe_0)object3).fog();
        }
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        if (this.aZk != 0) {
            object5 = eyo_02.doV();
            if (object5 == null) {
                return -1;
            }
            if (object5.aWP() != this.aZk) {
                return -1;
            }
        }
        object5 = (exP)eyo_02;
        exP exP2 = (exP)object;
        if (((exP)object5).fgj() == exP2.fgj() && ((exP)object5).dOp()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFP;
    }

    static {
        pEe.add(eAC.pwq);
        pEe.add(eAC.pwt);
        pEe.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
        pEe.add(eAC.pwr);
    }
}

