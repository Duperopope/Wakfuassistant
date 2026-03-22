/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFS
 */
public class efs_0
extends eAH {
    private amu_1 pAJ;
    private static final ArrayList<amz_1[]> pDD = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pDD;
    }

    public efs_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pAJ = (amu_1)arrayList.get(0);
    }

    public int xT() {
        if (this.pAJ.bDp() && this.pAJ.bDo()) {
            return (int)this.pAJ.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            throw new amf_2("Le user d'un crit\u00e8re IsMonsterBreed doit \u00eatre un player.");
        }
        exP exP2 = (exP)object;
        eyp eyp2 = exP2.doV();
        int n = this.xT();
        if (n == eyp2.aWP()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGx;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pDD.add(amz_1Array);
    }
}

