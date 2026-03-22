/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRy
 */
public abstract class ery_0
extends ero_0 {
    private static final aox_1 rig = new enz_0(new aow_1[0]);
    protected boolean rih = true;
    protected boolean rii = false;
    protected boolean rij = true;
    private acd_1 rdH;

    @Override
    public aox_1 bEt() {
        return rig;
    }

    protected ery_0() {
        this.bby();
    }

    public abstract ery_0 fGM();

    @Override
    protected void c(QD qD, boolean bl) {
        qu_0 qu_02 = this.fGN();
        if (!this.rih) {
            if (qu_02 != null) {
                this.bgG.C(qu_02.aZw());
            }
            return;
        }
        if (qu_02 != null && qu_02.baM() && !this.bce()) {
            this.fHg();
            return;
        }
        this.a(qD, bl, qu_02);
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(189);
    }

    protected abstract qu_0 fGN();

    public acd_1 fEv() {
        return this.rdH;
    }

    private void a(QD qD, boolean bl, qu_0 qu_02) {
        rh_0 rh_02;
        boolean bl2 = true;
        if (qu_02 == null) {
            bgA.error((Object)"caster null sur un running effect teleport");
            bl2 = false;
        }
        if ((rh_02 = this.bgJ.bag()) == null) {
            bgA.warn((Object)("No fightmap for context " + String.valueOf(this.bgJ)));
            bl2 = false;
        }
        acd_1 acd_12 = this.g(rh_02);
        if (!bl2 || acd_12 == null) {
            return;
        }
        int n = qu_02.bcC();
        int n2 = qu_02.bcD();
        short s = qu_02.bcE();
        this.rdH = new acd_1(n, n2, s);
        etx_0 etx_02 = null;
        if (this.bbt() && this.bgJ instanceof ent_0) {
            etx_02 = new etx_0(((ent_0)this.bgJ).fBq(), qu_02, acd_12);
            etx_02.aw(qu_02.aZw());
        }
        qu_02.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        this.d(qD, bl);
        if (this.bgJ.bai() != null && this.bbt() && etx_02 != null) {
            abi_1 abi_12 = new acq_1(n, n2, s, qu_02.bcC(), qu_02.bcD(), qu_02.bcE()).bXb();
            qu_02.b(abi_12);
            etx_02.av(qu_02.aZw());
            etx_02.fJM();
            if (etx_02.fJN()) {
                etx_02.fJS();
            }
            qu_02.b((abi_1)null);
        }
    }

    protected acd_1 g(rh_0 rh_02) {
        return this.bgG;
    }

    @Override
    public void E(QD qD) {
        qu_0 qu_02 = this.fGN();
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            bgA.warn((Object)("No fightmap for context " + String.valueOf(this.bgJ)));
            this.rih = false;
            return;
        }
        acd_1 acd_12 = this.g(rh_02);
        if (!(qu_02 instanceof exP) || acd_12 == null) {
            this.rih = false;
            return;
        }
        wt_0 wt_02 = rh_02.i(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        if (wt_02 == null) {
            this.rih = false;
            return;
        }
        if (!this.rii && qu_02.a(exe_1.rEe)) {
            this.rih = false;
            return;
        }
        if (!this.a(eNi.qWX)) {
            boolean bl;
            if (!this.rii && qu_02.a(exe_1.rDm)) {
                this.rih = false;
                return;
            }
            boolean bl2 = bl = this.bgE != null && ((eyo_0)((Object)qu_02)).bcP() == ((eyo_0)((Object)this.bgE)).bcP();
            if (!this.rii && qu_02.a(exe_1.rFe) && !bl) {
                this.rih = false;
                return;
            }
            if (!this.rii && qu_02.a(exe_1.rFf) && bl && ((eza_0)((Object)qu_02)).buW() && !this.fGO()) {
                this.rih = false;
            }
        }
        if (this.rij && !rh_02.a(qu_02, acd_12)) {
            bgA.error((Object)("Try to teleport on invalid cell. Position : " + String.valueOf(acd_12) + " for instance " + rh_02.bdL() + ", character=" + String.valueOf(qu_02)), new Throwable());
            this.rih = false;
        }
    }

    protected boolean fGO() {
        return false;
    }

    @Override
    public abstract boolean bbA();

    @Override
    public abstract boolean bbB();

    @Override
    public abstract boolean bbC();

    @Override
    public void aVH() {
        this.rdH = null;
        this.rii = false;
        this.rij = true;
        super.aVH();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().a(ii_2.Qc().eH(this.bgG.getX()).eI(this.bgG.getY()).eJ(this.bgG.bdi())).w(this.rih));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rih = ii_12.MB();
            ii_2 ii_22 = ii_12.LX();
            this.bgG.Q(ii_22.getX(), ii_22.getY(), GC.cu(ii_22.NN()));
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGM();
    }
}

