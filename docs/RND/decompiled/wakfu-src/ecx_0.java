/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCx
 */
public class ecx_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pzg = new ArrayList();
    private boolean pvJ;

    @Override
    protected List<amz_1[]> bDC() {
        return pzg;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecx_0(ArrayList<amx_1> arrayList) {
        this.pvJ = this.r(arrayList) == 0 && ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        Object object6 = object5 = this.pvJ ? object2 : object;
        if (object5 != null) {
            int n = 0;
            if (object5 instanceof exP) {
                n = ((exP)object5).ffF().Xt();
            }
            return super.fny() * (long)n;
        }
        throw new amf_2("On essaie de r\u00e9cup\u00e9rer l'id de nation d'une cible invalide");
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHr;
    }

    static {
        pzg.add(new amz_1[]{amz_1.cJx});
        pzg.add(amz_1.cJI);
    }
}

