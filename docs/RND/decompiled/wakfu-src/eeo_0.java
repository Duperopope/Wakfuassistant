/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eEo
 */
public class eeo_0
extends eAH
implements ehm_0 {
    private static final ArrayList<amz_1[]> pBC = new ArrayList();
    protected amu_1 pBD;
    protected amu_1 pBE;
    protected String pvH;

    @Override
    protected List<amz_1[]> bDC() {
        return pBC;
    }

    public eeo_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pBD = (amu_1)arrayList.get(0);
        if (by == 1 || by == 3) {
            this.pBE = (amu_1)arrayList.get(1);
        }
        if (by == 2) {
            this.pvH = ((anh_2)arrayList.get(1)).getValue();
        }
        if (by == 3) {
            this.pvH = ((anh_2)arrayList.get(2)).getValue();
        }
    }

    public int LR() {
        return this.pBD.bDp() && this.pBD.bDo() ? (int)this.pBD.d(null, null, null, null) : -1;
    }

    public int fnS() {
        return this.pBE != null && this.pBE.bDp() && this.pBE.bDo() ? (int)this.pBE.d(null, null, null, null) : -1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null && object3 instanceof ehe_0) {
            eyo_02 = ((ehe_0)object3).fog();
        }
        if (eyo_02 == null) {
            return -1;
        }
        long l = this.pBD.d(object, object2, object3, object4);
        if (this.pBE == null) {
            bl = eyo_02.kW(l);
        } else {
            long l2 = this.pBE.d(object, object2, object3, object4);
            bl = eyo_02.v(l, l2);
        }
        return bl ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFL;
    }

    @Override
    public boolean fnF() {
        return "target".equalsIgnoreCase(this.pvH);
    }

    static {
        pBC.add(new amz_1[]{amz_1.cJy});
        pBC.add(new amz_1[]{amz_1.cJy, amz_1.cJy});
        pBC.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
        pBC.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx});
    }
}

