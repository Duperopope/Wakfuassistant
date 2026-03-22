/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eEN
extends eAH {
    private int Nf;
    private static final ArrayList<amz_1[]> pCt = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pCt;
    }

    @Deprecated
    public eEN() {
    }

    public eEN(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.Nf = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
        }
    }

    public int apw() {
        return this.Nf;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        PN pN = null;
        if (object4 instanceof PN) {
            pN = (PN)object4;
        } else if (object instanceof PO) {
            pN = ((PO)object).aYx();
        }
        if (pN == null) {
            return -1;
        }
        if (pN.iV(this.Nf)) {
            return pN.og(this.Nf) ? 0 : -1;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLy;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pCt.add(amz_1Array);
    }
}

