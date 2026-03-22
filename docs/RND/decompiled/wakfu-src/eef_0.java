/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from eEF
 */
public class eef_0
extends eAH {
    private static final ArrayList<amz_1[]> pCi = new ArrayList();
    private List<amu_1> pCj;

    @Override
    protected List<amz_1[]> bDC() {
        return pCi;
    }

    public eef_0(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 0) {
            this.pCj = new ArrayList<amu_1>();
            for (amx_1 amx_12 : arrayList) {
                amu_1 amu_12 = (amu_1)amx_12;
                this.pCj.add(amu_12);
            }
        }
    }

    public eef_0() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return -1;
        }
        if (!(object instanceof exP)) {
            return -1;
        }
        exP exP2 = (exP)object;
        fgd_0 fgd_02 = exP2.doC();
        if (fgd_02 == null) {
            fhk fhk2 = exP2.dmL();
            fhe fhe2 = exP2.dnP();
            if (fhk2 != null && fhe2 != null) {
                if (this.a(object, object2, object3, object4, fhk2, fhe2, ffS.sgQ.aJr())) {
                    return 0;
                }
                if (this.a(object, object2, object3, object4, fhk2, fhe2, ffS.sgR.aJr())) {
                    return 0;
                }
            }
            return -1;
        }
        try {
            if (this.a(object, object2, object3, object4, fgd_02, ffS.sgQ.aJr())) {
                return 0;
            }
            if (this.a(object, object2, object3, object4, fgd_02, ffS.sgR.aJr())) {
                return 0;
            }
        }
        catch (Exception exception) {
            return -1;
        }
        return -1;
    }

    private boolean a(Object object, Object object2, Object object3, Object object4, fgd_0 fgd_02, byte by) {
        ffV ffV2 = (ffV)fgd_02.ai(by);
        if (ffV2 == null) {
            return false;
        }
        if (ffV2.dOg() == null) {
            return false;
        }
        return this.b(ffV2.dOg().dGh(), object, object2, object3, object4);
    }

    private boolean a(Object object, Object object2, Object object3, Object object4, fhk fhk2, fhe fhe2, byte by) {
        Long l = fhk2.t(ffS.gj(by));
        Optional<ffV> optional = fhe2.B(l);
        if (optional.isEmpty()) {
            return false;
        }
        ffV ffV2 = optional.get();
        if (ffV2.dOg() == null) {
            return false;
        }
        return this.b(ffV2.dOg().dGh(), object, object2, object3, object4);
    }

    private boolean b(fhy_0 fhy_02, Object object, Object object2, Object object3, Object object4) {
        for (fhy_0 fhy_03 = fhy_02; fhy_03 != null; fhy_03 = fhy_03.fZm()) {
            for (int n = 0; n < this.pCj.size(); n = (int)((byte)(n + 1))) {
                if ((short)this.pCj.get(n).d(object, object2, object3, object4) != fhy_03.aIi()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFM;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJA};
        pCi.add(amz_1Array);
    }
}

