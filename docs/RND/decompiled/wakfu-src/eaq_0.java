/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eAQ
 */
public class eaq_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwI = new ArrayList();
    private final int pwJ;

    public eaq_0(ArrayList<amx_1> arrayList) {
        this.pwJ = (int)((amu_1)arrayList.get(0)).d(null, null, null, null);
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwI;
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
            throw new amf_2("Usage of criterion GetAchievementLastCompleteDate out of an AchievementContext");
        }
        if (pN.iV(this.pwJ)) {
            return pN.oi(this.pwJ);
        }
        throw new amf_2("Usage of criterion GetAchievementLastCompleteDate with an unknown achievement, id : " + this.pwJ);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHy;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJy};
        pwI.add(amz_1Array);
    }
}

