/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAP
 */
public class eap_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwG = new ArrayList();
    private final int pwH;

    public eap_0(ArrayList<amx_1> arrayList) {
        this.pwH = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwG;
    }

    @Override
    public boolean bDo() {
        return true;
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
            throw new amf_2("Usage of criterion GetAchievementCategoryRunningCount out of an AchievementContext");
        }
        int n = 0;
        for (PJ pJ : pN.on(this.pwH)) {
            if (!pN.oh(pJ.d())) continue;
            ++n;
        }
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNE;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pwG.add(amz_1Array);
    }
}

