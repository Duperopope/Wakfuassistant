/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.BitSet;
import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eRh
 */
public class erh_0
extends ero_0 {
    private static final aox_1 rhe = new enz_0(new eny_0("param\u00e8tre d'etat", new enx_0("id", eNA.qYB), new enx_0("level", eNA.qYD)));
    private static final Set<Short> rhf = Collections.unmodifiableSet(Sets.union((Set)Sets.newHashSet((Object[])new Short[]{(short)7034, (short)2812}), exs_0.oYk));
    private long rhg;
    private long dQk;
    private boolean rhh = false;
    private long rhi;
    private boolean rhj;
    private boolean rhk;
    private boolean rhl;
    private final BitSet rhm = new BitSet();
    private fqU rhn;
    private boolean rho;

    @Override
    public aox_1 bEt() {
        return rhe;
    }

    @Nullable
    public static erh_0 a(qm_0<enk_0> qm_02, qu_0 qu_02, eNl eNl2, int n) {
        erh_0 erh_02 = new erh_0();
        erh_02.rhn = null;
        erh_02.o = enf_0.qPC.d();
        erh_02.bgM = ((ero_0)enf_0.qPC.bkx()).baZ();
        erh_02.bby();
        erh_02.bgE = qu_02;
        erh_02.rhi = qu_02 != null ? qu_02.Sn() : 0L;
        erh_02.bgJ = qm_02;
        erh_02.rhm.clear();
        erh_02.aQL = n;
        erh_02.rhh = true;
        boolean bl = erh_02.fGp();
        if (!bl) {
            bgA.error((Object)String.format("Unable to checkout a state with id %s : unknown base state id (%s)", n, fqU.Zl(n)));
            return null;
        }
        erh_02.riI = erh_02.rhn.gjx();
        erh_02.bgO = -1;
        erh_02.rho = false;
        erh_02.rhg = -1L;
        erh_02.dQk = 0L;
        erh_02.rhk = false;
        erh_02.rhl = false;
        return erh_02;
    }

    public void fGi() {
        this.fGp();
        if (this.rhn != null) {
            this.rhn.oj(true);
        }
    }

    public erh_0 fGj() {
        erh_0 erh_02 = new erh_0();
        erh_02.rhm.clear();
        erh_02.rhm.or(this.rhm);
        erh_02.rhn = this.rhn;
        erh_02.rhh = true;
        erh_02.riI = this.riI;
        erh_02.rhi = this.rhi;
        erh_02.rho = this.rho;
        if (this.rho) {
            erh_02.bgK = this.bgK;
        }
        erh_02.rhj = this.rhj;
        erh_02.rhg = this.rhg;
        erh_02.dQk = this.dQk;
        erh_02.rhk = this.rhk;
        erh_02.rhl = this.rhl;
        return erh_02;
    }

    @Override
    protected void h(QD<enk_0, eNl> qD) {
        super.h(qD);
        if (this.rho) {
            this.bgK = qD.LV();
        }
        this.dQk = ((erh_0)qD).dQk;
    }

    public erh_0 h(qm_0<enk_0> qm_02) {
        this.me(true);
        erh_0 erh_02 = (erh_0)this.bbn();
        erh_02.bgK = this.bgK;
        erh_02.bgJ = qm_02;
        erh_02.fGp();
        if (this.dQk > 0L) {
            return erh_02;
        }
        QE qE = this.bbq();
        if (qE instanceof ers_0) {
            long l = ((ers_0)qE).M(this);
            erh_02.riI = (int)Math.max(1L, l);
        } else {
            erh_02.riI = this.riI;
        }
        return erh_02;
    }

    public fqU fGk() {
        return this.rhn;
    }

    public boolean fGl() {
        return this.rho;
    }

    public void me(boolean bl) {
        this.rho = bl;
    }

    public void c(BitSet bitSet) {
        if (bitSet != null) {
            this.rhm.or(bitSet);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.aQL > 0 && this.rhh) {
            if (this.bgF != null && this.bgF.baz() != null) {
                this.fGp();
                if (this.rhn != null) {
                    if (this.bbt()) {
                        if (this.fGl()) {
                            this.mk(true);
                        }
                        if (!this.fCB()) {
                            this.d(qD, bl);
                        }
                        if (this.rhn.cwx() && this.dQk <= 0L) {
                            this.dQk = ue_0.bjV().bjm().bjB();
                        }
                        for (enk_0 enk_02 : this.rhn) {
                            if (this.rhn.gjL() && enk_02.df(1L) != this.rhl) continue;
                            ero_0 ero_02 = (ero_0)((ero_0)enf_0.fBb().pU(enk_02.avZ())).bbn();
                            if (this.bgF == null) {
                                bgA.warn((Object)("Impossible d'executer l'effet " + enk_02.aZH() + " on a plus de cible"));
                                return;
                            }
                            ero_02.a(enk_02, this.rhn, this.bgJ, this.bgE, null, this.bgF.bcC(), this.bgF.bcD(), this.bgF.bcE(), this.bbg());
                            if (this.fHi()) {
                                ero_02.mh(true);
                            }
                            if (this.bgJ.baj() == 1 && this.bbX()) {
                                ero_02.bbT();
                                break;
                            }
                            if (this.bbB()) {
                                ero_02.riH = this.riH;
                                ero_02.g(this.bgF);
                            }
                            ero_02.aZp();
                        }
                    }
                    if (this.bgF != null && this.bgF instanceof euc_1) {
                        ((euc_1)this.bgF).a(new exe_2(this));
                    }
                } else {
                    bgA.error((Object)"State inconnu pour le client, mais vraisemblablement pas pour le serveur");
                }
            }
            this.rhh = false;
        } else {
            this.mk(true);
        }
        this.rho = false;
    }

    @Override
    public boolean aZQ() {
        return false;
    }

    @Override
    public boolean Ty() {
        this.fGp();
        return this.bbY() || this.rhn != null && (this.rhn.giB() > 0 || this.rhn.gjx() > 0);
    }

    @Override
    public boolean bbY() {
        this.fGp();
        if (this.rhn != null) {
            if (this.rhn.cwt()) {
                return this.rhn.gjx() < 0;
            }
            return this.rhn.giB() < 0 || this.rhn.gjx() < 0;
        }
        return false;
    }

    @Override
    public long fGm() {
        if (this.rhn != null && this.rhn.cwx()) {
            return this.fGn();
        }
        if (this.riI < 0L) {
            this.fGp();
            if (this.rhn != null) {
                return this.rhn.gjx();
            }
            return 0L;
        }
        return this.riI;
    }

    private long fGn() {
        if (this.dQk > 0L) {
            int n = this.rhn.gjx();
            uw_0 uw_02 = ue_0.bjV().bjm();
            long l = uw_02.bjB() - this.dQk;
            return Math.max(0L, (long)n - l);
        }
        return this.rhn.gjx();
    }

    @Override
    public boolean fGo() {
        return this.riI > 0L;
    }

    private boolean fGp() {
        if (this.rhn != null) {
            return true;
        }
        fqU fqU2 = fqX.gjM().Zt(this.aQL);
        if (fqU2 == null) {
            return false;
        }
        this.rhn = fqU2.cm(fqU.YZ(this.aQL));
        this.rhn.ol(this.rhj);
        this.rhn.gjz().forEach(this.rhm::set);
        return true;
    }

    @Override
    protected Long fGq() {
        if (this.rhn != null) {
            if (this.rhn.gjF() && this.bgE != null) {
                return this.bgE.Sn();
            }
            if (!this.rhn.gjF() && this.bgF != null) {
                return this.bgF.Sn();
            }
        }
        return super.fGq();
    }

    @Override
    public void bbU() {
        this.fGp();
        if (this.rhn == null) {
            return;
        }
        if (this.bgJ == null || this.bgJ.baf() == null) {
            return;
        }
        Ua ua = this.rhn.gjw();
        if (!this.rhn.cwt()) {
            this.a(ua);
        }
    }

    @Override
    public void bbS() {
        super.bbS();
    }

    public void fGr() {
        qm_0 qm_02 = this.bbh();
        if (!(qm_02 instanceof ent_0)) {
            return;
        }
        etu_0 etu_02 = ((ent_0)qm_02).fBq();
        if (etu_02 == null) {
            return;
        }
        etu_02.a(1046, this.bgE, this.bgF, this.bgG, this.rhn);
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public BitSet aZL() {
        return this.rhm;
    }

    @Override
    public boolean fCn() {
        return super.fCn();
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    public boolean fGs() {
        this.fGp();
        return this.rhn.cwt();
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().ah(this.dQk).af(this.rhg).ag(this.riI).ae(this.LV()).ek(this.aQL).r(this.rhj).s(this.rhk).ep(this.rhl ? 1 : 0));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.dQk = ii_12.MJ();
            this.rhg = ii_12.Mk();
            this.riI = ii_12.Mm();
            this.di(ii_12.LV());
            this.aQL = ii_12.getValue();
            this.rhj = ii_12.Mc();
            this.rhk = ii_12.Me();
            this.rhl = ii_12.Mg() == 1;
            this.fGp();
        }
    }

    @Override
    protected boolean bce() {
        if (this.rhn != null && rhf.contains(this.rhn.gjy())) {
            return true;
        }
        return super.bce();
    }

    public long fGt() {
        return this.rhi;
    }

    public boolean cwt() {
        if (this.rhn == null) {
            return false;
        }
        return this.rhn.cwt();
    }

    public boolean fCz() {
        return this.rhk;
    }

    public void lZ(boolean bl) {
        this.rhk = bl;
    }

    public void mf(boolean bl) {
        this.rhj = bl;
    }

    public long MJ() {
        return this.dQk;
    }

    public void qw(long l) {
        this.dQk = l;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rhj = false;
        this.rhg = -1L;
        this.dQk = 0L;
        this.rhk = false;
        this.rhl = false;
    }

    public void mg(boolean bl) {
        this.rhl = bl;
    }

    public boolean fGu() {
        return this.rhl;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGj();
    }
}

