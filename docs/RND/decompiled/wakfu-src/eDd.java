/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class eDd
extends eak_0 {
    private static ArrayList<amz_1[]> pvy = new ArrayList();
    private amu_1 pxE;
    private amu_1 pxK;
    private final long pzR;
    private final String pzS;
    private eyo_0 pvG;
    private String pxi;

    public eDd(List<amx_1> list) {
        byte by = this.r(list);
        this.pxK = (amu_1)list.get(0);
        this.pxE = (amu_1)list.get(1);
        this.pxi = ((anh_2)list.get(2)).getValue();
        this.pzR = ((amu_1)list.get(3)).d(null, null, null, null);
        this.pzS = by >= 2 ? ((anh_2)list.get(4)).getValue() : "";
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvy;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12;
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        this.j(object, object2, object4, object3);
        eyo_0 eyo_02 = eAs.a(this.pxi, object, object2, object4, object3);
        acd_1 acd_13 = "target".equals(this.pxi) && object2 instanceof acd_1 ? (acd_1)object2 : (acd_12 = eyo_02 != null ? eyo_02.aZw() : null);
        if (acd_12 == null) {
            return 0L;
        }
        eyo_0 eyo_03 = eAs.b(false, object, object2, object4, object3);
        Collection<? extends qu_0> collection = this.a(etu_02, eyo_03);
        Iterator<? extends qu_0> iterator = collection.iterator();
        while (iterator.hasNext()) {
            qu_0 qu_02 = iterator.next();
            if (!qu_02.a(exe_1.rDQ)) continue;
            iterator.remove();
        }
        long l = this.pxE.d(object, object2, object3, object4);
        long l2 = this.pxK.d(object, object2, object3, object4);
        long l3 = -1L;
        for (qu_0 qu_03 : collection) {
            int n = amf_1.c((amg_1)qu_03, acd_12);
            int n2 = qu_03.dh(this.pzR);
            if (l >= 0L && ((long)n > l || (long)n < l2) || (long)n2 <= l3) continue;
            l3 = n2;
        }
        return this.fny() * l3;
    }

    protected Collection<? extends qu_0> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        Object object2;
        if (etu_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = etu_02.fKc();
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
            if (!this.pzS.isEmpty() && this.pvG != null && (!((qu_02 = qD.bbc()) instanceof ant_1) || eyo_02 == null || qu_02.Sn() != this.pvG.Sn()) || (long)s != this.pzR) continue;
            bl = true;
            break;
        }
        return bl;
    }

    private void j(Object object, Object object2, Object object3, Object object4) {
        this.pvG = eAs.a(this.pzS, object, object2, object3, object4);
    }

    public long fnK() {
        return this.pzR;
    }

    public long fnB() {
        return this.pxE == null ? -1L : this.pxE.d(null, null, null, null);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNL;
    }

    static {
        pvy.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJy});
        pvy.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJy, amz_1.cJx});
    }
}

