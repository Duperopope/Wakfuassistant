/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eDO
extends eAH {
    private static final ArrayList<amz_1[]> pAK = new ArrayList();
    private String pvH;

    public eDO(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pvH = ((anh_2)arrayList.get(0)).getValue();
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAK;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a("caster", object, object2, object4, object3);
        eyo_0 eyo_03 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_03 instanceof exP)) {
            return -1;
        }
        ers_0 ers_02 = ((exP)eyo_03).doc();
        for (QD qD : ers_02) {
            fqU fqU2;
            if (!(qD instanceof erh_0) || qD.bbc() == null || qD.bbc().Sn() != eyo_02.Sn() || (fqU2 = ((erh_0)qD).fGk()) == null || !fqU2.gjH()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKu;
    }

    static {
        pAK.add(new amz_1[]{amz_1.cJx});
    }
}

