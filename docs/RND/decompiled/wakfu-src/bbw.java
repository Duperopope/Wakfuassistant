/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  gnu.trove.set.hash.TLongHashSet
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.set.hash.TIntHashSet;
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

public final class bbw
implements eUT {
    private final int hAm;
    private final TIntHashSet hAn = new TIntHashSet();
    private final TLongHashSet hAo = new TLongHashSet();

    public bbw(int n) {
        this.hAm = n;
    }

    @Override
    public void a(eur_0 eur_02) {
        this.cZM();
        List<List<eSP>> list = eur_02.fMK();
        for (List<eSP> list2 : list) {
            if (list2.size() < 3) continue;
            this.E(list2);
        }
    }

    private void E(List<eSP> list) {
        for (eSP eSP2 : list) {
            int n = eSP2.bcC();
            int n2 = eSP2.bcD();
            this.df(n, n2);
        }
    }

    private void df(int n, int n2) {
        this.dg(n, n2);
        this.dg(n + 1, n2);
        this.dg(n, n2 + 1);
        this.dg(n + 1, n2 + 1);
        this.dg(n - 1, n2);
        this.dg(n, n2 - 1);
        this.dg(n - 1, n2 - 1);
        this.dg(n - 1, n2 + 1);
        this.dg(n + 1, n2 - 1);
    }

    private void dg(int n, int n2) {
        long l = GC.s(n, n2);
        if (this.hAo.contains(l)) {
            return;
        }
        bsS bsS2 = bsU.dHk().Ft(this.hAm);
        if (bsS2 == null) {
            return;
        }
        short s = bsS2.bag().Z(n, n2);
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(1013002);
        freeParticleSystem.e(n, n2, s);
        freeParticleSystem.pu(this.hAm);
        this.hAn.add(freeParticleSystem.bLJ());
        this.hAo.add(l);
        agZ.bzy().b(freeParticleSystem);
    }

    public void cZM() {
        for (int n : this.hAn) {
            agZ.bzy().d(n, true);
        }
        this.hAn.clear();
        this.hAo.clear();
    }
}

