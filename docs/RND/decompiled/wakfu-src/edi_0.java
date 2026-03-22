/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDi
 */
public final class edi_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAb = new ArrayList();
    private boolean pxm;

    public edi_0(ArrayList<amx_1> arrayList) {
        this.pxm = this.r(arrayList) == 0 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pAb;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pxm, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        return super.fny() * (long)exP2.dlp();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIe;
    }

    static {
        pAb.add(new amz_1[]{amz_1.cJx});
        pAb.add(amz_1.cJI);
    }
}

