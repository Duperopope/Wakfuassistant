/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collection;

/*
 * Renamed from bwO
 */
public class bwo_0
extends sr_0 {
    private float jAa = 0.0f;
    private float jAb = 0.0f;
    private bsj_0 edi;
    private rh_0 cts;
    private byte jAc = (byte)-1;
    private final TLongHashSet jAd = new TLongHashSet();
    private int jAe = 0;

    @Override
    public void aVH() {
        super.aVH();
        this.jAa = 0.0f;
        this.jAb = 0.0f;
        this.edi = null;
        this.cts = null;
        this.jAc = (byte)-1;
        this.jAd.clear();
        this.jAe = 0;
    }

    public void reset() {
        this.edi = null;
        this.cts = null;
        this.jAc = (byte)-1;
        this.jAe = 0;
    }

    public void a(bsj_0 bsj_02, byte by) {
        this.edi = bsj_02;
        this.cts = this.edi.bag();
        this.jAc = by;
    }

    @Override
    protected float a(ss_0 ss_02, wt_0 wt_02, ss_0 ss_03, wt_0 wt_03, byte by) {
        float f2 = super.a(ss_02, wt_02, ss_03, wt_03, by);
        int n = wt_02.bap - this.bpR - 1;
        int n2 = wt_02.bap + this.bpR + 1;
        int n3 = wt_02.baq - this.bpR - 1;
        int n4 = wt_02.baq + this.bpR + 1;
        this.jAd.clear();
        this.jAe = 0;
        this.dE(wt_02.bap, wt_02.baq);
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                this.dD(i, j);
            }
        }
        this.jAd.clear();
        this.jAe = 0;
        return f2 += (float)this.jAd.size() * this.jAa + (float)this.jAe * this.jAb;
    }

    private void dD(int n, int n2) {
        if (!this.cts.aK(n, n2)) {
            return;
        }
        exP exP2 = this.edi.dy(n, n2);
        if (exP2 == null) {
            return;
        }
        if (exP2.bax() != 20) {
            return;
        }
        bgy bgy2 = (bgy)exP2;
        if (bgy2.bcP() == this.jAc) {
            return;
        }
        if (bgy2.dlw()) {
            return;
        }
        this.jAd.add(exP2.Sn());
    }

    private void dE(int n, int n2) {
        if (!this.cts.aK(n, n2)) {
            return;
        }
        Collection<QQ> collection = this.edi.bdh();
        if (collection.isEmpty()) {
            return;
        }
        for (QQ qQ : collection) {
            etm_0 etm_02 = etm_0.Sr(qQ.aeV());
            if (!(switch (etm_02) {
                case etm_0.rnq, etm_0.rnu, etm_0.rnv -> true;
                default -> false;
            }) || !qQ.d(n, n2, (short)0) || !this.v(qQ)) continue;
            ++this.jAe;
        }
    }

    private boolean v(QQ qQ) {
        azl_2 azl_22 = qQ.bcx();
        int n = azl_22.aVo();
        for (int i = 0; i < n; ++i) {
            Qj qj = (Qj)azl_22.vK(i);
            ero_0 ero_02 = (ero_0)enf_0.fBb().pU(qj.avZ());
            if (ero_02 == null || ero_02.baZ() != QF.bhC) continue;
            return true;
        }
        return false;
    }

    public void eA(float f2) {
        this.jAa = f2;
    }

    public void eB(float f2) {
        this.jAb = f2;
    }
}

