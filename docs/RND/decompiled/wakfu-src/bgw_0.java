/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from bgw
 */
public class bgw_0
implements WT,
aao_2 {
    private static final int iaC = 3000;
    private final bgy iaD;
    private FreeParticleSystem iaE;
    private final TIntArrayList iaF = new TIntArrayList();
    private int cxt;

    bgw_0(bgy bgy2) {
        this.iaD = bgy2;
        abb_2.bUA().a(this, 3000L, -1);
    }

    void cbS() {
        abb_2.bUA().b(this);
        abb_2.bUA().a(this, 3000L, -1);
        this.djo();
    }

    void a(bgw_0 bgw_02) {
        this.djp();
        if (bgw_02.iaE != null) {
            this.dm(bgw_02.iaE.dcy, bgw_02.iaD.bqo());
        }
    }

    void djo() {
        this.djr();
    }

    void djp() {
        if (this.iaE == null) {
            return;
        }
        if (this.iaD.dkO()) {
            this.iaD.ddI().b(this);
        }
        agZ.bzy().so(this.iaE.bLJ());
        this.iaE = null;
    }

    private void CF(int n) {
        int n2 = this.iaD.bqo();
        this.dm(n, n2);
    }

    private void dm(int n, int n2) {
        if (this.iaE != null) {
            throw new UnsupportedOperationException("Tentative d'ajout de particule d'apparence sans avoir d\u00e9s-appliqu\u00e9 l'ancienne");
        }
        bdj_2 bdj_22 = this.iaD.ddI();
        this.iaE = agY.bzw().bF(n, 0);
        this.iaE.a(bdj_22, 1.0f, 2);
        this.iaE.pu(n2);
        this.iaE.setVisible(bdj_22.isVisible());
        agZ.bzy().b(this.iaE);
        bdj_22.a(this);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        this.djs();
        this.djq();
        return false;
    }

    private void djq() {
        int n = this.djt();
        if (this.iaE != null && this.iaE.bLK() != n) {
            this.djp();
        }
        if (n == -1) {
            return;
        }
        if (this.iaE == null) {
            this.CF(n);
        }
    }

    private void djr() {
        this.iaF.clear();
        if (fcK.rUe.as(this.iaD.Xi(), this.iaD.Sn())) {
            return;
        }
        int n = this.djt();
        if (this.iaD.dkZ() == null && !this.iaD.dmc()) {
            int n2;
            fkL fkL2;
            int n3;
            Object object;
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null && ((bvi_0)(object = bgt_02.dnQ())).dfG() && ((bvi_0)object).dKL().fa(this.iaD.Sn())) {
                this.iaF.add(800255);
            }
            if ((n3 = bda_1.a(fkL2 = (object = this.iaD.ffF()).emF())) != -1) {
                this.iaF.add(n3);
            }
            if ((n2 = bdz_2.aa(this.iaD)) != -1) {
                this.iaF.add(n2);
            }
        }
        this.cxt = this.iaF.indexOf(n);
    }

    private void djs() {
        if (this.iaF.isEmpty()) {
            this.cxt = -1;
            return;
        }
        this.cxt = (this.cxt + 1) % this.iaF.size();
    }

    private int djt() {
        if (this.cxt >= 0 && this.cxt < this.iaF.size()) {
            return this.iaF.get(this.cxt);
        }
        return -1;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void b(boolean bl, WU wU) {
        if (this.iaE == null) {
            this.djq();
            if (this.iaE == null) {
                return;
            }
        }
        this.iaE.setVisible(bl);
    }

    public void clean() {
        this.djp();
        abb_2.bUA().b(this);
    }
}

