/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from eSB
 */
public class esb_0
extends esx_0 {
    public static final esx_0 rkT = new esb_0();

    @Override
    public fqP<fqE> a(exP exP2, esy_0 esy_02, short s) {
        fqP<? extends fqE> fqP2 = exP2.fhk();
        LinkedList<fqE> linkedList = new LinkedList<fqE>();
        LinkedList<fqE> linkedList2 = new LinkedList<fqE>();
        for (fqE iterable2 : fqP2) {
            Object Spell;
            byte by;
            eNd eNd2;
            fqE fqE2;
            fqE fqE3 = fqE2 = esy_02.fIt() ? (fqE)iterable2.bff() : iterable2;
            if (esy_02.fIt()) {
                fqE2.di(aym_2.bSE());
            }
            if ((eNd2 = eNd.ff(by = ((fqD)(Spell = fqE2.giP())).giG())) == null) continue;
            if (eNd2.fAX()) {
                linkedList.add(fqE2);
                continue;
            }
            if (eNd2 != eNd.qPf || ((fqD)Spell).eeY() && !esy_02.fIu()) continue;
            ((AbstractList)linkedList2).add(fqE2);
        }
        fqP fqP3 = new fqP(esy_02.fIn(), fqP2.beS(), fqP2.beR(), false, false, false);
        List<fqE> list = linkedList2.subList(0, Math.min(((AbstractCollection)linkedList2).size(), esy_02.fIm()));
        esb_0.a(list, fqP3, esy_02.fIn());
        esb_0.a(linkedList, fqP3, esy_02.fIn());
        return fqP3;
    }

    private static void a(List<fqE> list, Sg sg, short s) {
        int n = list.size();
        for (int i = 0; i < n && sg.aVo() < s; ++i) {
            fqE fqE2 = list.get(i);
            try {
                sg.b(fqE2);
                continue;
            }
            catch (sa_0 sa_02) {
                rkD.error((Object)"InventoryCapacityReachedException during addToInventory", (Throwable)sa_02);
                continue;
            }
            catch (Sz sz) {
                rkD.error((Object)"ContentAlreadyPresentException during addToInventory", (Throwable)sz);
            }
        }
    }
}

