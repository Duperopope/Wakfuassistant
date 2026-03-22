/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eGy
extends eAH {
    private static final ArrayList<amz_1[]> pEx = new ArrayList();
    protected int eGx;
    protected String pvH = "caster";

    public eGy(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 0) {
            this.eGx = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
        if (by == 1) {
            this.eGx = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pvH = ((anh_2)arrayList.get(1)).getValue();
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pEx;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)eyo_02;
        byte by = exP2.aFW();
        if (by != 0) {
            return -1;
        }
        frf frf2 = exP2.dnJ();
        if (frf2 == null) {
            return -1;
        }
        eIm eIm2 = exP2.dnK();
        frd frd2 = frf2.Zx(eIm2.fwt().wp());
        if (frd2 == null) {
            return -1;
        }
        return frd2.tX(this.eGx) && !ewo_0.oBF.o(ewr_0.oDD).contains(this.eGx) ? 0 : -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMH;
    }

    static {
        pEx.add(eAC.pwt);
        pEx.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

