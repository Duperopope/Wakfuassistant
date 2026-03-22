/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bzj
 */
public class bzj_0
extends bcs_0 {
    private final TIntHashSet jDD = new TIntHashSet();

    @Override
    public void aPc() {
        super.aPc();
        if (this.crg == null) {
            return;
        }
        byv_0 byv_02 = (byv_0)this.crg;
        bnv_2 bnv_22 = byv_02.dOx();
        if (bnv_22 == null) {
            return;
        }
        bnn_1 bnn_12 = bnv_22.dyV();
        if (bnn_12 == null) {
            return;
        }
        int n = bnn_12.gex();
        if (this.jDD.contains(n)) {
            n = 408;
        }
        if (this.aVB() == n) {
            return;
        }
        byv_02.d(this);
        afh_0.bxU().b(this);
        ng_1 ng_12 = bcw_0.dQn().nQ(n);
        if (!(ng_12 instanceof bzj_0)) {
            bWl.error((Object)("la vue " + n + " n'est pas du type DimensionalBagView"));
            ng_12 = bcw_0.dQn().nQ(408);
            if (ng_12 == null) {
                bWl.error((Object)"aucun effort: la vue 408 n'est pas du type DimensionalBagView");
            }
            this.jDD.add(n);
        }
        bzj_0 bzj_02 = (bzj_0)ng_12;
        byv_02.a(bzj_02);
        afh_0.bxU().a(bzj_02);
        bzj_02.bpH();
        agX.c(bzj_02);
    }

    @Override
    public void aVH() {
        super.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bC(this.bsr());
        aUQ aUQ2 = aue_0.cVJ().cVO();
        this.bA(aUQ2 != null && evm_2.b(aUQ2.cWq(), evn_2.ovj));
    }

    public boolean dOw() {
        byv_0 byv_02 = (byv_0)this.crg;
        return byv_02.dOw();
    }

    @Override
    public boolean bsr() {
        return false;
    }

    static /* synthetic */ void a(bzj_0 bzj_02, ayv_2 ayv_22) {
        bzj_02.a(ayv_22);
    }

    static /* synthetic */ Logger aGi() {
        return bWl;
    }
}

