/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from cgM
 */
class cgm_0
implements aaq_2<cya> {
    cgm_0() {
    }

    @Override
    public boolean a(cya cya2) {
        ArrayList arrayList = new ArrayList();
        fcL.rUh.b(aue_0.cVJ().cVK().aZj(), bgt_02 -> {
            bjo_1 bjo_12 = (bjo_1)bgt_02.dpI();
            ezu_1 ezu_12 = bjo_12.drl();
            if (ezu_12 == null || ezu_12.Sn() != cya2.Ya()) {
                return true;
            }
            arrayList.add(ezu_12);
            return true;
        });
        if (arrayList.isEmpty()) {
            return false;
        }
        for (ezu_1 ezu_12 : arrayList) {
            buU buU2 = new buU(ezu_12);
            Iterator<ezk_1> iterator = cya2.eAy();
            while (iterator.hasNext()) {
                iterator.next().a(buU2);
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 15974;
    }
}

