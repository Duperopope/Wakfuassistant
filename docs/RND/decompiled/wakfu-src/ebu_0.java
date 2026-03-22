/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBu
 */
public final class ebu_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxy = new ArrayList();
    private boolean pxm;

    public ebu_0(ArrayList<amx_1> arrayList) {
        this.pxm = this.r(arrayList) == 0 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pxy;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pxm, object, object2, object4, object3);
        if (exP2 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        return super.fny() * (long)exP2.dlo();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHG;
    }

    static {
        pxy.add(new amz_1[]{amz_1.cJx});
        pxy.add(amz_1.cJI);
    }
}

