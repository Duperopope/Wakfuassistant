/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBM
 */
public final class ebm_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxY = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pxY;
    }

    public ebm_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (object3 == null) {
            return 0L;
        }
        if (!(object3 instanceof QD)) {
            throw new amf_2("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        qu_0 qu_02 = ((QD)object3).bbd();
        if (qu_02 == null || !(qu_02 instanceof eyo_0)) {
            return 0L;
        }
        return ((eyo_0)((Object)qu_02)).dOo();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKy;
    }

    static {
        pxY.add(amz_1.cJI);
    }
}

