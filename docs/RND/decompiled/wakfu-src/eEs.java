/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eEs
extends eAH {
    private amu_1 pAJ;
    private static final ArrayList<amz_1[]> pBI = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pBI;
    }

    public eEs(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAJ = (amu_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            throw new amf_2("Le user d'un crit\u00e8re IsMonsterBreed doit \u00eatre un player.");
        }
        exP exP2 = (exP)object;
        ety_0 ety_02 = exP2.dlK();
        if (ety_02 == null) {
            return -1;
        }
        Collection collection = ety_02.fKc();
        for (exP exP3 : collection) {
            if (exP3 == exP2 || exP3.dlL() != exP2 || (long)exP3.aWP() != this.pAJ.d(object, object2, object3, object4)) continue;
            return 0;
        }
        return -1;
    }

    public short aWP() {
        if (this.pAJ.bDp() && this.pAJ.bDo()) {
            return (short)this.pAJ.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJw;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pBI.add(amz_1Array);
    }
}

