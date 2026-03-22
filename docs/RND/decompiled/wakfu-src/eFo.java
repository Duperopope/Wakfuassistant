/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eFo
extends eAH {
    private static final ArrayList<amz_1[]> pDa = new ArrayList();
    private boolean pya;
    private long pzK;

    public eFo(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        this.pzK = ((amu_1)arrayList.get(1)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pDa;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        if (eyo_02 instanceof exP && !this.aj((exP)eyo_02)) {
            return -1;
        }
        int n = eyo_02.dh(this.pzK);
        if (n < 0) {
            return -1;
        }
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        Collection collection = etu_02.fKc();
        for (exP exP2 : collection) {
            if (!this.aj(exP2) || exP2.dh(this.pzK) <= n) continue;
            return -1;
        }
        return 0;
    }

    private boolean aj(exP exP2) {
        return !exP2.a(exe_1.rDQ) && !exP2.a(exe_1.rDv) && !exP2.buW();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLE;
    }

    static {
        pDa.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
    }
}

