/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eGl
extends eAH {
    private static final ArrayList<amz_1[]> pEc = new ArrayList();
    private final long pEd;
    private boolean pvJ = true;

    @Override
    protected List<amz_1[]> bDC() {
        return pEc;
    }

    public eGl(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pEd = ((amu_1)arrayList.get(0)).d(null, null, null, null);
        if (arrayList.size() == 2) {
            String string = ((anh_2)arrayList.get(1)).getValue();
            if (string.equalsIgnoreCase("caster")) {
                this.pvJ = false;
            }
        } else {
            this.pvJ = true;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        qu_0 qu_02 = eAs.aP(object);
        qu_0 qu_03 = eAs.aP(object2);
        if (object == null) {
            return -1;
        }
        Object object5 = this.pvJ ? object2 : object;
        if (object5 instanceof QY) {
            QQ qQ = ((QY)object5).bdd();
            if (qQ == null) {
                return -1;
            }
            if (qQ.bcw() == this.pEd && qu_03 == qu_02) {
                return 0;
            }
            return -1;
        }
        if (object5 == null) {
            for (QQ qQ : ((etu_0)object4).bai().bdh()) {
                if (qQ.bcw() != this.pEd || eAs.aP(qQ) != qu_02) continue;
                return 0;
            }
            return -1;
        }
        etu_0 etu_02 = eAs.aO(object4);
        if (object2 instanceof acd_1 && etu_02 != null) {
            for (QQ qQ : etu_02.bai().bdh()) {
                acd_1 acd_12 = (acd_1)object2;
                if (qQ.bcw() != this.pEd || !qQ.d(acd_12.getX(), acd_12.getY(), acd_12.bdi()) || eAs.aP(qQ) != qu_02) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJt;
    }

    static {
        pEc.add(new amz_1[]{amz_1.cJy});
        pEc.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

