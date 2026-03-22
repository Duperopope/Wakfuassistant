/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

public class cBk {
    private static final TIntHashSet mwW = new TIntHashSet();
    private static final TObjectProcedure<bxk_0> mwX = new cBl();

    public static void bGy() {
        int n;
        if (!bzj_2.eqi().blc()) {
            return;
        }
        aae_1 aae_12 = cBk.eIf();
        TIntIterator tIntIterator = mwW.iterator();
        while (tIntIterator.hasNext()) {
            n = tIntIterator.next();
            if (!aae_12.vZ(n)) {
                cAY.eHc().a(new ccd_0(null, cBj.LA(n), 0));
            }
            tIntIterator.remove();
        }
        int n2 = aae_12.bTR();
        for (n = 0; n < n2; ++n) {
            mwW.add(aae_12.wa(n));
            cAY.eHc().a(new ccd_0(null, cBj.LA(aae_12.wa(n)), (short)aae_12.wl(n)));
        }
    }

    private static aae_1 eIf() {
        aae_1 aae_12 = new aae_1();
        cBk.A(new cBm(aae_12));
        return aae_12;
    }

    public static void eIg() {
        if (!bzj_2.eqi().blc()) {
            return;
        }
        cBk.A(mwX);
    }

    private static void A(TObjectProcedure<bxk_0> tObjectProcedure) {
        ArrayList<ni_1> arrayList = bzj_2.eqi().eqk();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bxk_0 bxk_02;
            ni_1 ni_12 = arrayList.get(i);
            if (!(ni_12 instanceof bxk_0) || !(bxk_02 = (bxk_0)ni_12).isVisible()) continue;
            tObjectProcedure.execute((Object)bxk_02);
        }
    }
}

