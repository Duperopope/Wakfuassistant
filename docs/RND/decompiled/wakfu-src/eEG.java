/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEG
extends eAH {
    private static final ArrayList<amz_1[]> pCk = new ArrayList();
    private amu_1 pCl;
    private amu_1 pCm;
    private boolean pvJ;

    public eEG(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pCl = (amu_1)arrayList.get(0);
        if (by == 1) {
            this.pCm = (amu_1)arrayList.get(1);
        }
        if (by == 2) {
            this.pvJ = ((anh_2)arrayList.get(1)).getValue().equalsIgnoreCase("target");
        }
    }

    public long fnW() {
        return this.pCm.bDp() && this.pCm.bDo() ? this.pCm.d(null, null, null, null) : -1L;
    }

    public int fnX() {
        if (this.pCl.bDp() && this.pCl.bDo()) {
            return (int)this.pCl.d(null, null, null, null);
        }
        return -1;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pCk;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        long l;
        long l2;
        boolean bl;
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        byte by = (byte)this.fnX();
        ezj_0 ezj_02 = ezj_0.Pl(by);
        if (ezj_02 == null) {
            return -1;
        }
        exe_1 exe_12 = ezj_02.fmM();
        boolean bl2 = eyo_02.i(ezj_02);
        boolean bl3 = bl = exe_12 != null && eyo_02.i(exe_12);
        if (!bl2 && !bl) {
            return -1;
        }
        if (this.pCm == null) {
            return 0;
        }
        long l3 = System.currentTimeMillis();
        if (l3 - (l2 = ezv.b(eyo_02.Sn(), ezj_02)) < (l = this.fnW() * 1000L)) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGL;
    }

    static {
        pCk.add(eAC.pwt);
        pCk.add(new amz_1[]{amz_1.cJy, amz_1.cJy});
        pCk.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

