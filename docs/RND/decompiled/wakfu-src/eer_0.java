/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEr
 */
public final class eer_0
extends eAH {
    private static final ArrayList<amz_1[]> pBF = new ArrayList();
    private final boolean pBG;
    private final TIntHashSet pBH = new TIntHashSet();

    public eer_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBG = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        int n = arrayList.size();
        for (int i = 1; i < n; ++i) {
            this.pBH.add((int)((amu_1)arrayList.get(i)).d(null, null, null, null));
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pBF;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pBG, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof eus_1)) {
            return -1;
        }
        eus_1 eus_12 = (eus_1)((Object)eyo_02);
        evd_2 evd_22 = (evd_2)eus_12.dpY();
        evt_1 evt_12 = evd_22.fdL();
        if (evt_12 == null) {
            return -1;
        }
        return this.pBH.contains(evt_12.owO) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMd;
    }

    public TIntHashSet fnT() {
        return this.pBH;
    }

    public String toString() {
        return "HasSubscriptionLevel{m_useTarget=" + this.pBG + ", m_subscriptionLevels=" + String.valueOf(this.pBH) + "}";
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pBF.add(new amz_1[]{amz_1.cJx, amz_1.cJA});
    }
}

