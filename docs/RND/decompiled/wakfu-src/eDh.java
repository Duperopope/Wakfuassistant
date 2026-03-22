/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eDh
extends eak_0 {
    private static final ArrayList<amz_1[]> pAa = new ArrayList();
    private String pvH;

    @Override
    protected List<amz_1[]> bDC() {
        return pAa;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eDh(ArrayList<amx_1> arrayList) {
        if (this.r(arrayList) == 1) {
            this.pvH = ((anh_2)arrayList.get(0)).getValue();
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pvH, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        return this.fny() * (long)eyo_02.bcP();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pFH;
    }

    static {
        pAa.add(eAC.pwq);
        pAa.add(eAC.pwr);
    }
}

