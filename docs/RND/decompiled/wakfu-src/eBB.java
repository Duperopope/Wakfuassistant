/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eBB
extends eak_0 {
    private static final ArrayList<amz_1[]> pxG = new ArrayList();

    @Override
    protected List<amz_1[]> bDC() {
        return pxG;
    }

    public eBB(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (!(object3 instanceof ero_0)) {
            return -1L;
        }
        QE qE = ((ero_0)object3).bbq();
        if (qE == null) {
            pwx.error((Object)"On ne peut pas calculer la distance a partir du porteur d'un effet, l'effet n'est pas stock\u00e9 dans un manager ");
            return -1L;
        }
        qu_0 qu_02 = qE.bci();
        if (qu_02 == null) {
            return -1L;
        }
        if (object2 instanceof amg_1) {
            amg_1 amg_12 = (amg_1)object2;
            return amf_1.c((amg_1)qu_02, amg_12);
        }
        if (object2 instanceof acd_1) {
            acd_1 acd_12 = (acd_1)object2;
            return amf_1.c((amg_1)qu_02, acd_12);
        }
        return -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pKL;
    }

    static {
        pxG.add(amz_1.cJI);
    }
}

