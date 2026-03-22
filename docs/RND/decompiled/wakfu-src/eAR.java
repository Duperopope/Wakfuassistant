/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eAR
extends eak_0 {
    private String pwK;
    private static final ArrayList<amz_1[]> pwL = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pwL;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Deprecated
    public eAR() {
    }

    public eAR(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pwK = ((anh_2)arrayList.get(0)).getValue();
        }
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
            throw new amf_2("Utilisation du crit\u00e8re GetAchievementVariable hors d'un contexte d'achievement, variableName = " + this.pwK);
        }
        PM pM = pN.de(this.pwK);
        if (pM == null) {
            throw new amf_2("R\u00e9cup\u00e9ration d'une variable d'achievement de nom inconnu name=" + this.pwK);
        }
        return super.fny() * pN.ok(pM.d());
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHV;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{amz_1.cJx};
        pwL.add(amz_1Array);
    }
}

