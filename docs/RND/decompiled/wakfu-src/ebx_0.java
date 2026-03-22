/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eBX
 */
abstract class ebx_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pyn = new ArrayList();
    amu_1 pxE;
    amu_1 pxK;
    String pxi;
    amz_2 pyo;
    amz_2 pyp;

    @Override
    protected List<amz_1[]> bDC() {
        return pyn;
    }

    ebx_0() {
    }

    ebx_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pxE = (amu_1)arrayList.get(0);
        } else if (arrayList.size() == 2) {
            this.pxE = (amu_1)arrayList.get(0);
            this.pxi = ((anh_2)arrayList.get(1)).getValue();
        } else if (arrayList.size() == 3) {
            this.pxK = (amu_1)arrayList.get(0);
            this.pxE = (amu_1)arrayList.get(1);
            this.pxi = ((anh_2)arrayList.get(2)).getValue();
        } else if (arrayList.size() == 4) {
            this.pxK = (amu_1)arrayList.get(0);
            this.pxE = (amu_1)arrayList.get(1);
            this.pxi = ((anh_2)arrayList.get(2)).getValue();
            this.pyo = (amz_2)arrayList.get(3);
        } else if (arrayList.size() == 5) {
            this.pxK = (amu_1)arrayList.get(0);
            this.pxE = (amu_1)arrayList.get(1);
            this.pxi = ((anh_2)arrayList.get(2)).getValue();
            this.pyo = (amz_2)arrayList.get(3);
            this.pyp = (amz_2)arrayList.get(4);
        }
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
        if (l <= 0L) {
            return this.fny() * (long)collection.size();
        }
        long l2 = this.pxK == null ? 0L : this.pxK.d(object, object2, object3, object4);
        boolean bl = this.pyo != null && this.pyo.b(object, object2, object3, object4);
        boolean bl2 = this.pyp != null && this.pyp.b(object, object2, object3, object4);
        long l3 = 0L;
        for (qu_0 qu_03 : collection) {
            int n = amf_1.c((amg_1)qu_03, acd_12);
            if ((long)n > l || (long)n < l2) continue;
            acd_1 acd_14 = qu_03.aZw();
            if (bl && acd_12.getX() != acd_14.getX() && acd_12.getY() != acd_14.getY()) continue;
            if (bl2) {
                rh_0 rh_02 = etu_02.bag();
                sj_0 sj_02 = sj_0.bfS();
                sj_02.a(rh_02);
                sj_02.k(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                sj_02.l(acd_14.getX(), acd_14.getY(), acd_14.bdi());
                if (!sj_02.bfV()) continue;
            }
            ++l3;
        }
        return this.fny() * l3;
    }

    protected void j(Object object, Object object2, Object object3, Object object4) {
    }

    protected abstract Collection<? extends qu_0> a(etu_0<?> var1, eyo_0 var2);

    @Override
    public boolean bDo() {
        return true;
    }

    public long fnB() {
        return this.pxE == null ? -1L : this.pxE.d(null, null, null, null);
    }

    public long fnA() {
        return this.pxK == null ? -1L : this.pxK.d(null, null, null, null);
    }

    static {
        pyn.add(amz_1.cJI);
        pyn.add(new amz_1[]{amz_1.cJy});
        pyn.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
        pyn.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx});
        pyn.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJz});
        pyn.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJz, amz_1.cJz});
    }
}

