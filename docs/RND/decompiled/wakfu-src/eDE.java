/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eDE
extends eak_0 {
    private static final ArrayList<amz_1[]> pAy = new ArrayList();
    private boolean pya;

    public eDE(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        if (by == 1) {
            this.pya = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<amz_1[]> fnC() {
        return pAy;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.pya && object2 instanceof acd_1) {
            return ((acd_1)object2).getY();
        }
        eyo_0 eyo_02 = eAs.b(this.pya, object, object2, object4, object3);
        if (eyo_02 == null) {
            return Long.MIN_VALUE;
        }
        return eyo_02.bcD();
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLf;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pAy.add(eAC.pwq);
        pAy.add(eAC.pwr);
    }
}

