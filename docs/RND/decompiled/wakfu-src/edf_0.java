/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * Renamed from eDF
 */
public final class edf_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAz = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pAz;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public edf_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNc;
    }

    static {
        pAz.add(eAC.pwq);
    }
}

