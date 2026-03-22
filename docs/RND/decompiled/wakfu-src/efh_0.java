/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eFh
 */
public final class efh_0
extends eAH {
    private boolean pvJ;
    private static final ArrayList<amz_1[]> pCS = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCS;
    }

    public efh_0(ArrayList<amx_1> arrayList) {
        String string;
        byte by = this.r(arrayList);
        if (by == 0) {
            this.pvJ = false;
        } else if (by == 1 && (string = ((anh_2)arrayList.get(0)).getValue()).equalsIgnoreCase("target")) {
            this.pvJ = true;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.a(this.pvJ, object, object2, object4, object3);
        if (exP2 == null) {
            return -1;
        }
        eza_0 eza_02 = exP2.fgY();
        if (!(eza_02 instanceof eSL)) {
            return -1;
        }
        if (((QP)((Object)eza_02)).bci() == exP2) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIV;
    }

    static {
        pCS.add(eAC.pwq);
        pCS.add(eAC.pwr);
    }
}

