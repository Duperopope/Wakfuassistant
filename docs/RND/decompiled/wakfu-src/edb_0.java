/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eDB
 */
public class edb_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pAv = new ArrayList();
    private amu_1 pxE;

    @Override
    protected List<amz_1[]> bDC() {
        return pAv;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public edb_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pxE = (amu_1)arrayList.get(0);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        if (object4 instanceof etu_0) {
            if (!(object instanceof euc_1)) {
                throw new amf_2("On essaie de compter les walls \u00e0 port\u00e9e d'autre chose qu'un BasicFighter");
            }
            etu_0 etu_02 = (etu_0)object4;
            euc_1 euc_12 = (euc_1)object;
            for (QQ qQ : etu_02.bai().bdh()) {
                int n;
                if (qQ == null || qQ.aeV() != etm_0.rnx.aHp() || (long)(n = amf_1.c((amg_1)qQ, euc_12)) > this.pxE.d(object, object2, object3, object4)) continue;
                ++l;
            }
        }
        return super.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJz;
    }

    static {
        amz_1[] amz_1Array = new amz_1[]{};
        pAv.add(amz_1Array);
        amz_1Array = new amz_1[]{amz_1.cJy};
        pAv.add(amz_1Array);
    }
}

