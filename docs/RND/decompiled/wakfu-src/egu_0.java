/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eGu
 */
public class egu_0
extends eAH {
    private byte aZm;
    private boolean pvJ = false;
    private static final ArrayList<amz_1[]> pEp = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pEp;
    }

    public boolean fnF() {
        return this.pvJ;
    }

    public egu_0(ArrayList<amx_1> arrayList) {
        String string;
        byte by = this.r(arrayList);
        if (by == 1 && (string = ((anh_2)arrayList.get(1)).getValue()).equalsIgnoreCase("target")) {
            this.pvJ = true;
        }
        this.aZm = (string = ((anh_2)arrayList.get(0)).getValue()).equalsIgnoreCase("Male") ? (byte)0 : 1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        if (exP2.aWO() == this.aZm) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGm;
    }

    public byte aWO() {
        return this.aZm;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pEp.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJx};
        pEp.add(amz_1Array);
    }
}

