/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Renamed from eSA
 */
public class esa_0
extends esx_0 {
    public static final esx_0 rkS = new esa_0();

    @Override
    public fqP<fqE> a(exP exP2, esy_0 esy_02, short s) {
        fqP<? extends fqE> fqP2 = exP2.fhk();
        LinkedList<fqE> linkedList = new LinkedList<fqE>();
        for (fqE gq_022 : fqP2) {
            byte by;
            eNd eNd2;
            fqE i;
            fqE fqE2 = i = esy_02.fIt() ? (fqE)gq_022.bff() : gq_022;
            if (esy_02.fIt()) {
                i.di(aym_2.bSE());
            }
            Object sa_02 = i.giP();
            Iterator<enk_0> iterator = ((fqD)sa_02).fA(s);
            boolean bl = false;
            while (iterator.hasNext() && !bl) {
                enk_0 by2 = iterator.next();
                if (by2.avZ() != enf_0.qUj.d() && by2.avZ() != enf_0.qUp.d()) continue;
                bl = true;
            }
            if (bl || (eNd2 = eNd.ff(by = ((fqD)sa_02).giG())) == null || !eNd2.fAX()) continue;
            linkedList.add(i);
        }
        int n = esy_02.fIn();
        fqP<fqE> fqP3 = new fqP<fqE>((short)n, fqP2.beS(), fqP2.beR(), false, false, false);
        for (int i = 0; i < n && i < linkedList.size(); ++i) {
            try {
                ((Sg)fqP3).b((fqE)linkedList.get(i));
                continue;
            }
            catch (sa_0 sz) {
                rkD.error((Object)"InventoryCapacityReachedException during getSpells", (Throwable)sz);
                continue;
            }
            catch (Sz sz) {
                rkD.error((Object)"ContentAlreadyPresentException during getSpells", (Throwable)sz);
            }
        }
        return fqP3;
    }
}

