/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBd
 */
public class ebd_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwZ = new ArrayList();
    private ang_2 bfe;

    public ebd_0(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 0) {
            this.bfe = (ang_2)arrayList.get(0);
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwZ;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.bfe != null) {
            return this.bfe.a(object, object2, object3, object4) == 0 ? 1L : 0L;
        }
        return 0L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pId;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJz};
        pwZ.add(amz_1Array);
    }
}

