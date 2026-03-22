/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class eCv
extends eak_0 {
    private static final ArrayList<amz_1[]> pzb = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pzb;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eCv(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Calendar calendar = Calendar.getInstance();
        return (long)calendar.get(2) + 1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGN;
    }

    static {
        pzb.add(eAC.pwq);
    }
}

