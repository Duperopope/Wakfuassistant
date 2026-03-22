/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/*
 * Renamed from bfq
 */
public class bfq_2 {
    private static final bfq_2 hTc = new bfq_2();
    private final aah_1<bfo_2> hTd = new aah_1();
    private bfo_2[] hTe;

    public static bfq_2 dge() {
        return hTc;
    }

    private static Set<eym> dgf() {
        return eyn.fhY();
    }

    private static Set<eym> dgg() {
        return eyn.fhZ();
    }

    public final void dgh() {
        bfo_2 bfo_22;
        this.hTe = null;
        this.hTd.clear();
        for (eym eym2 : bfq_2.dgf()) {
            bfo_22 = new bfo_2(eym2);
            this.hTd.b(eym2.aWP(), bfo_22);
        }
        for (eym eym2 : bfq_2.dgg()) {
            bfo_22 = new bfo_2(eym2);
            this.hTd.b(eym2.aWP(), bfo_22);
        }
    }

    public final void dgi() {
        this.hTe = null;
        ImmutableSet immutableSet = ImmutableSet.builder().addAll(bfq_2.dgf()).addAll(bfq_2.dgg()).build();
        for (int n : this.hTd.bTS()) {
            bfo_2 bfo_22 = this.hTd.vK(n);
            if (bfo_22 == null || immutableSet.contains(bfo_22.dfW())) continue;
            this.hTd.wp(n);
        }
    }

    public final bfo_2 BO(int n) {
        return this.hTd.vK(n);
    }

    public final bfo_2[] dgj() {
        if (this.hTe == null) {
            ArrayList<bfo_2> arrayList = new ArrayList<bfo_2>(this.hTd.bTR());
            int n = this.hTd.bTR();
            for (int i = 0; i < n; ++i) {
                bfo_2 bfo_22 = this.hTd.vU(i);
                if (bfo_22.dfW() == eym.phU || bfo_22.dfW() == eym.phV) continue;
                arrayList.add(bfo_22);
            }
            Collections.sort(arrayList);
            this.hTe = arrayList.toArray(new bfo_2[arrayList.size()]);
        }
        return this.hTe;
    }
}

