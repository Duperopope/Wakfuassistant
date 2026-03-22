/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEa
 */
public class eea_0
extends eAH {
    private static final ArrayList<amz_1[]> pBl = new ArrayList();
    private amu_1 pBm;

    @Deprecated
    public eea_0() {
    }

    public eea_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pBm = (amu_1)arrayList.get(0);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBl;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (eyo_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (!(eyo_02 instanceof fad)) {
            throw new amf_2("Mauvais utilisateur du crit\u00e8re");
        }
        fad fad2 = (fad)((Object)eyo_02);
        eya_2 eya_22 = fad2.dpZ();
        int n = (int)this.pBm.d(object, object2, object3, object4);
        return eya_22.Ya() > 0L && eya_22.drk().contains(n) ? 0 : -1;
    }

    public int tJ() {
        if (this.pBm.bDo()) {
            return (int)this.pBm.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGM;
    }

    public String toString() {
        return "HasGuildBonus{m_bonusId=" + String.valueOf(this.pBm) + "}";
    }

    static {
        pBl.add(new amz_1[]{amz_1.cJy});
    }
}

