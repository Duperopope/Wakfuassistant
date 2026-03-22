/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class eDb
extends ebx_0 {
    private static final ArrayList<amz_1[]> pzJ = new ArrayList();
    private final long pzK;
    private final long pzL;
    private final boolean pzM;
    private final String pzN;
    protected boolean pzO;
    private eyo_0 pvG;

    public eDb(List<amx_1> list) {
        byte by = this.r(list);
        this.pxE = (amu_1)list.get(0);
        this.pxi = ((anh_2)list.get(1)).getValue();
        this.pzK = ((amu_1)list.get(2)).d(null, null, null, null);
        this.pzO = false;
        this.pzL = by == 1 || by == 4 ? ((amu_1)list.get(3)).d(null, null, null, null) : -1L;
        this.pzM = by != 2 && by != 5 || ((amz_2)list.get(3)).b(null, null, null, null);
        String string = by == 3 ? ((anh_2)list.get(3)).getValue() : "";
        this.pzN = by == 4 || by == 5 ? ((anh_2)list.get(4)).getValue() : string;
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pzJ;
    }

    @Override
    protected Collection<? extends qu_0> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        Object object2;
        if (etu_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = this.pzM ? etu_02.fKc() : etu_02.fKr();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object2 : collection) {
            if (!this.a(eyo_02, ((exP)object2).doc())) continue;
            arrayList.add(object2);
        }
        Collection<QQ> collection2 = etu_02.bai().bdh();
        object2 = collection2.iterator();
        while (object2.hasNext()) {
            QQ qQ = (QQ)object2.next();
            ers_0 ers_02 = (ers_0)qQ.baz();
            if (ers_02 == null || !this.a(eyo_02, ers_02)) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    private boolean a(eyo_0 eyo_02, ers_0 ers_02) {
        boolean bl = false;
        for (QD qD : ers_02) {
            qu_0 qu_02;
            if (qD.d() != enf_0.qPC.d()) continue;
            fqU fqU2 = ((erh_0)qD).fGk();
            short s = fqU2.gjy();
            if (this.pzO && (!((qu_02 = qD.bbc()) instanceof ant_1) || eyo_02 == null || ((ant_1)((Object)qu_02)).bcP() != eyo_02.bcP()) || !this.pzN.isEmpty() && this.pvG != null && (!((qu_02 = qD.bbc()) instanceof ant_1) || eyo_02 == null || qu_02.Sn() != this.pvG.Sn()) || (long)s != this.pzK || this.pzL >= 0L && (long)fqU2.cmL() != this.pzL) continue;
            bl = true;
            break;
        }
        return bl;
    }

    @Override
    protected void j(Object object, Object object2, Object object3, Object object4) {
        this.pvG = eAs.a(this.pzN, object, object2, object3, object4);
    }

    public long fnK() {
        return this.pzK;
    }

    public long fnL() {
        return this.pzL;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJO;
    }

    static {
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy});
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJy});
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJz});
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJx});
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJy, amz_1.cJx});
        pzJ.add(new amz_1[]{amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJz, amz_1.cJx});
    }
}

