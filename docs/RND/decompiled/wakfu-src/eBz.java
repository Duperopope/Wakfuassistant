/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class eBz
extends eak_0 {
    private static final ArrayList<amz_1[]> pxD = new ArrayList();
    private amu_1 pxE;

    @Override
    protected List<amz_1[]> bDC() {
        return pxD;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public eBz(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pxE = (amu_1)arrayList.get(0);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        if (object4 != null && object4 instanceof etu_0) {
            if (!(object instanceof euc_1)) {
                throw new amf_2("On essaie de compter les \u00e9l\u00e9ments interactifs \u00e0 port\u00e9e d'autre chose qu'un BasicFighter");
            }
            etu_0 etu_02 = (etu_0)object4;
            euc_1 euc_12 = (euc_1)object;
            Iterator<qu_0> iterator = etu_02.fJz();
            while (iterator.hasNext()) {
                int n;
                qu_0 qu_02 = iterator.next();
                if (qu_02 == euc_12 || qu_02 == null || qu_02.bax() != 10 || (long)(n = amf_1.c((amg_1)qu_02, euc_12)) > this.pxE.d(object, object2, object3, object4)) continue;
                ++l;
            }
        }
        return super.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHp;
    }

    static {
        pxD.add(amz_1.cJI);
        pxD.add(new amz_1[]{amz_1.cJy});
    }
}

