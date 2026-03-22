/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eBf
 */
public final class ebf_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pxb = new ArrayList();
    private boolean pvJ = false;

    @Override
    protected List<amz_1[]> bDC() {
        return pxb;
    }

    public ebf_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        switch (by) {
            case 0: {
                this.pvJ = false;
                break;
            }
            case 1: {
                String string = ((anh_2)arrayList.get(0)).getValue();
                if (!string.equalsIgnoreCase("target")) break;
                this.pvJ = true;
            }
        }
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJa;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        abi_1 abi_12 = exP2.bcB();
        if (abi_12 == null) {
            return -1L;
        }
        return abi_12.dzy;
    }

    static {
        pxb.add(amz_1.cJI);
        pxb.add(new amz_1[]{amz_1.cJx});
    }
}

