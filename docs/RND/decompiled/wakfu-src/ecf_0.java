/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eCF
 */
public class ecf_0
extends eak_0 {
    private final String pzo;
    private static final ArrayList<amz_1[]> pzp = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pzp;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ecf_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pzo = ((anh_2)arrayList.get(0)).getValue();
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pzo, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        return eyo_02.bcO();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMO;
    }

    static {
        pzp.add(eAC.pwr);
    }
}

