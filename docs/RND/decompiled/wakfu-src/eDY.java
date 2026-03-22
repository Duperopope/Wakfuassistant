/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDY
extends eAH {
    private static final ArrayList<amz_1[]> pBg = new ArrayList();
    private amu_1 pBh;
    private boolean pvJ = false;

    public eDY(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 2) {
            amx_1 amx_12 = arrayList.remove(0);
            String string = ((anh_2)amx_12).getValue();
            if (string.equalsIgnoreCase("target")) {
                this.pvJ = true;
            } else if (string.equalsIgnoreCase("caster")) {
                this.pvJ = false;
            }
        }
        this.pBh = (amu_1)arrayList.get(0);
    }

    public int fnQ() {
        if (this.pBh.bDp() && this.pBh.bDo()) {
            return (int)this.pBh.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBg;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof qu_0)) {
            return -1;
        }
        qu_0 qu_02 = (qu_0)((Object)eyo_02);
        byte by = (byte)this.fnQ();
        exe_1 exe_12 = exe_1.Te(by);
        if (exe_12 == null) {
            cKa.warn((Object)("unable to find property " + by));
            return -1;
        }
        return qu_02.a(exe_12) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJN;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pBg.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJx, amz_1.cJy};
        pBg.add(amz_1Array);
    }
}

