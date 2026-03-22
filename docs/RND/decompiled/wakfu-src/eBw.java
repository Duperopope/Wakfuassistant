/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class eBw
extends eak_0 {
    private static final ArrayList<amz_1[]> pxA = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pxA;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eBw(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(5);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNa;
    }

    static {
        pxA.add(eAC.pwq);
    }
}

