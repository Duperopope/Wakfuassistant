/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Collection;
import java.util.HashSet;

final class cgy
extends ceK<cqf_0, bsS> {
    cgy() {
    }

    public boolean a(cqf_0 cqf_02) {
        int n = cqf_02.bha();
        long[] lArray = cqf_02.eyM().keys();
        HashSet<bgy> hashSet = new HashSet<bgy>();
        for (int i = 0; i < lArray.length; ++i) {
            long l = lArray[i];
            bgy bgy2 = bgg_0.dlO().ju(l);
            if (bgy2 == null || bgy2.djT()) continue;
            hashSet.add(bgy2);
        }
        this.a(n, hashSet);
        this.a(cqf_02, n);
        aVi.cWF().zW(n);
        return false;
    }

    private void a(cqf_0 cqf_02, int n) {
        TLongObjectHashMap<acd_1> tLongObjectHashMap = cqf_02.eyM();
        avz_0 avz_02 = new avz_0(agb_1.cbm(), eui_1.rsy.aJr(), 0, tLongObjectHashMap);
        aVi.cWF().a(n, (aft_2)avz_02);
        avz_02.fa(cqf_02.eyL());
        bsW.jjJ.b(tLongObjectHashMap);
    }

    private void a(int n, Collection<bgy> collection) {
        if (!collection.isEmpty()) {
            aVL aVL2 = aVL.a(agb_1.cbm(), (int)eui_1.rsK.aJr(), 0, collection);
            aVi.cWF().a(n, (aft_2)aVL2);
        }
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqf_0)aam_22);
    }
}

