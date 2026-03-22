/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from eEK
 */
public class eek_0
extends eAH {
    private int kAJ;
    private static final List<amz_1[]> pCq = new ArrayList<amz_1[]>();

    @Override
    protected List<amz_1[]> bDC() {
        return pCq;
    }

    public eek_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.kAJ = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)object;
        if (exP2.a(eyp_0.pmQ)) {
            return -1;
        }
        Optional optional = evx_2.feo().b(exP2.aZj(), eva_1.owF);
        if (optional.isEmpty()) {
            return -1;
        }
        return ((eAa)optional.get()).Pp(this.kAJ) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pOi;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCq.add(amz_1Array);
    }
}

