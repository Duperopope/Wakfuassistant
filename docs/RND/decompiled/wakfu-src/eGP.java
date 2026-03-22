/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGP
extends eGO {
    private static final ArrayList<amz_1[]> pES = new ArrayList();
    private long mfF;

    @Override
    protected List<amz_1[]> bDC() {
        return pES;
    }

    public eGP(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        this.pER = true;
        this.pvH = "caster";
        if (s == 0) {
            this.mfF = ((amu_1)arrayList.get(0)).d(null, null, null, null);
        } else if (s == 1) {
            this.pER = false;
            this.mfF = ((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pvH = ((anh_2)arrayList.get(1)).getValue();
        }
    }

    @Override
    protected int foe() {
        return -1;
    }

    @Override
    protected boolean x(QQ qQ) {
        return qQ.bcw() == this.mfF;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLh;
    }

    static {
        pES.add(eAC.pwt);
        pES.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

