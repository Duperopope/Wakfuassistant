/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eAL
extends eak_0 {
    private static final ArrayList<amz_1[]> pwy = new ArrayList();
    private final int pwz;

    public eAL(ArrayList<amx_1> arrayList) {
        this.pwz = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwy;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public int fnz() {
        return this.pwz;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        PN pN = null;
        if (object4 instanceof PN) {
            pN = (PN)object4;
        } else if (object instanceof PO) {
            pN = ((PO)object).aYx();
        }
        if (pN == null) {
            throw new amf_2("Usage of criterion GetAchievementCategoryActiveCount out of an AchievementContext");
        }
        int n = 0;
        for (PJ pJ : pN.on(this.pwz)) {
            if (!pN.od(pJ.d())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNG;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pwy.add(amz_1Array);
    }
}

