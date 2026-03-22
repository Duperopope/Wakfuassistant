/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eAZ
 */
public final class eaz_0
extends ebx_0 {
    private static final ArrayList<amz_1[]> pwW = new ArrayList();
    private boolean pwX = true;

    public eaz_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
        if (arrayList.size() == 6) {
            this.pxK = (amu_1)arrayList.get(0);
            this.pxE = (amu_1)arrayList.get(1);
            this.pxi = ((anh_2)arrayList.get(2)).getValue();
            this.pyo = (amz_2)arrayList.get(3);
            this.pyp = (amz_2)arrayList.get(4);
            this.pwX = ((amz_2)arrayList.get(5)).b(null, null, null, null);
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pwW;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHn;
    }

    protected Collection<? extends exP> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        if (etu_02 == null || eyo_02 == null) {
            return Collections.emptyList();
        }
        if (this.pwX) {
            return etu_02.a(evb_0.fNn(), evb_0.fK(eyo_02.bcP()), evb_0.a(evb_0.l(exe_1.rFi)), evb_0.a(evb_0.fNs()));
        }
        return etu_02.a(evb_0.fK(eyo_02.bcP()), evb_0.a(evb_0.l(exe_1.rFi)), evb_0.a(evb_0.fNs()));
    }

    static {
        pwW.add(amz_1.cJI);
        pwW.add(new amz_1[]{amz_1.cJy});
        pwW.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
        pwW.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx});
        pwW.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJz});
        pwW.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJz, amz_1.cJz});
        pwW.add(new amz_1[]{amz_1.cJy, amz_1.cJy, amz_1.cJx, amz_1.cJz, amz_1.cJz, amz_1.cJz});
    }
}

