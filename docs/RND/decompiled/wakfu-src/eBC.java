/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class eBC
extends eak_0 {
    private static final List<amz_1[]> pxH = Collections.singletonList(amz_1.cJI);

    @Override
    protected List<amz_1[]> bDC() {
        return pxH;
    }

    public eBC(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12;
        Object object5;
        if (object == null || !(object instanceof eyo_0)) {
            return -1L;
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            throw new amf_2("On essaie de compter r\u00e9cup\u00e9rer la distance avec une balise en dehors d'un combat...");
        }
        etu_0 etu_02 = bl ? (etu_0)object4 : ((ent_0)object4).fBq();
        eyo_0 eyo_02 = (eyo_0)object;
        byte by = eyo_02.bcP();
        if (object2 instanceof amg_1) {
            object5 = (amg_1)object2;
            acd_12 = new acd_1(object5.bcC(), object5.bcD(), object5.bcE());
        } else if (object2 instanceof acd_1) {
            acd_12 = (acd_1)object2;
        } else {
            return -1L;
        }
        object5 = etu_02.bdh();
        int n = Short.MAX_VALUE;
        Iterator iterator = object5.iterator();
        while (iterator.hasNext()) {
            int n2;
            QQ qQ = (QQ)iterator.next();
            if (qQ.aeV() != etm_0.rns.aHp() || qQ.bcP() != by || (n2 = amf_1.c((amg_1)qQ, acd_12)) >= n) continue;
            n = n2;
        }
        return n;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pGA;
    }
}

