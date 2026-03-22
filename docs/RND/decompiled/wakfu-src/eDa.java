/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDa
extends eak_0 {
    private boolean pvJ = false;
    private static final ArrayList<amz_1[]> pzI = new ArrayList();

    public eDa(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pvJ = false;
        }
        if (s == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzI;
    }

    public boolean fnF() {
        return this.pvJ;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHu;
    }

    @Override
    public boolean bDo() {
        return false;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        long l = (long)(exP2.dmm() * 100.0f);
        return super.fny() * l * -1L;
    }

    static {
        pzI.add(amz_1.cJI);
        pzI.add(new amz_1[]{amz_1.cJx});
    }
}

