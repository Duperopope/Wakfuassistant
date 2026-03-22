/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eOr
 */
public class eor_0
extends epe_0 {
    private static final aox_1 rbc = new enz_0(new eny_0("apply avec gestion des resistances/boosts", new enx_0("stateId", eNA.qYB), new enx_0("level", eNA.qYD), new enx_0("pourcentage d'application (-1 = application forc\u00e9e)", eNA.qYD)), new eny_0("Level en fonction d'un autre sort", new enx_0("stateId", eNA.qYB), new enx_0("level (Inutile)", eNA.qYD), new enx_0("pourcentage d'application (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("id du sort", eNA.qYD)), new eny_0("Level en fonction d'un autre sort", new enx_0("stateId", eNA.qYB), new enx_0("level (Inutile)", eNA.qYD), new enx_0("pourcentage d'application (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("id du sort", eNA.qYD), new enx_0("Multiplicateur", eNA.qYD)), new eny_0("Proba en fonction du level d'un autre \u00e9tat", new enx_0("stateId", eNA.qYB), new enx_0("level", eNA.qYD), new enx_0("pourcentage d'application (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("id de l'\u00e9tat qui va modifier la proba", eNA.qYD), new enx_0("appliquer si \u00e9tat pas pr\u00e9sent (0=non, 1=oui)", eNA.qYD), new enx_0("modification du % par niveau de l'\u00e9tat", eNA.qYD)), new eny_0("Verifier l'etat modificateur sur la cible", new enx_0("stateId", eNA.qYB), new enx_0("level", eNA.qYD), new enx_0("pourcentage d'application (-1 = application forc\u00e9e)", eNA.qYD), new enx_0("id de l'\u00e9tat qui va modifier la proba", eNA.qYD), new enx_0("appliquer si \u00e9tat pas pr\u00e9sent (0=non, 1=oui)", eNA.qYD), new enx_0("modification du % par niveau de l'\u00e9tat", eNA.qYD), new enx_0("etat modificateur sur la cible (0=non (defaut), 1=oui)", eNA.qYD)));
    public static final TIntArrayList rbd = new TIntArrayList();
    protected int rbe;
    protected short ksh;
    protected short rbf = (short)-1;
    protected short rbg;
    private boolean rbh;
    private boolean rbi;
    private boolean rbj;
    private boolean rbk;

    public eor_0() {
        this.bby();
    }

    @Override
    public aox_1 bEt() {
        return rbc;
    }

    public eor_0 fCo() {
        eor_0 eor_02 = new eor_0();
        this.a(eor_02);
        return eor_02;
    }

    @Override
    protected void a(eor_0 eor_02) {
        eor_02.ksh = this.ksh;
        eor_02.rbe = this.rbe;
        eor_02.rbf = this.rbf;
        eor_02.rbg = this.rbg;
    }

    @Override
    public void aVH() {
        this.rbh = false;
        this.rbe = 0;
        this.rbj = false;
        this.rbi = false;
        this.rbk = false;
        this.rbg = 0;
        super.aVH();
    }

    public static eor_0 a(qm_0<enk_0> qm_02, qu_0 qu_02, short s, short s2, boolean bl) {
        eor_0 eor_02 = new eor_0();
        eor_02.o = enf_0.qUR.d();
        eor_02.bgM = ((ero_0)enf_0.qUR.bkx()).baZ();
        eor_02.bby();
        eor_02.bgF = qu_02;
        eor_02.bhb = true;
        eor_02.ksh = s;
        eor_02.rbf = s2;
        eor_02.rbg = s2;
        eor_02.rbe = fqU.ag(eor_02.ksh, eor_02.rbf);
        eor_02.rbh = bl;
        eor_02.bgO = -1;
        eor_02.bgJ = qm_02;
        return eor_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2226);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || this.bgF.baz() == null) {
            this.mk(true);
            return;
        }
        if (this.bgE == null) {
            this.mk(true);
            return;
        }
        this.fh((byte)5);
        List<erh_0> list = this.fCq();
        if (this.rbj) {
            return;
        }
        this.aM(list);
        if (this.bbt()) {
            this.d(qD, bl);
            try {
                this.F(qD);
            }
            catch (Exception exception) {
                bgA.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 4: {
                this.rbf = bl ? (short)f2 : (short)((float)this.rbf + f2);
                this.rbe = fqU.ag(this.ksh, this.rbf);
                this.rbg = this.rbf;
                break;
            }
            case 7: {
                this.rbf = bl ? (short)VJ.bt((float)this.rbf * f2 / 100.0f) : (short)(this.rbf + VJ.bt((float)this.rbf * f2 / 100.0f));
                this.rbe = fqU.ag(this.ksh, this.rbf);
                this.rbg = this.rbf;
            }
        }
    }

    private boolean fCp() {
        if (this.bgF == null) {
            return true;
        }
        if (!this.bgF.baA()) {
            return false;
        }
        QE qE = this.bgF.baz();
        if (qE == null) {
            bgA.warn((Object)("Try to apply state on target without " + String.valueOf(QE.class) + " (But target declare have it) (Target: " + String.valueOf(this.bgF) + " , effect related: " + this.aZH() + ")"));
            return false;
        }
        for (QD qD : qE) {
            if (qD.d() != enf_0.qPC.d() || !((erh_0)qD).fGk().gjD().contains((int)this.ksh)) continue;
            this.fh((byte)2);
            return true;
        }
        return false;
    }

    private List<erh_0> fCq() {
        this.ksh = fqU.Zl(this.rbe);
        this.rbf = fqU.YZ(this.rbe);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        for (QD qD : this.bgF.baz()) {
            if (qD == null || qD.d() != enf_0.qPC.d() || ((erh_0)qD).fGk().gjy() != this.ksh) continue;
            fqU fqU2 = ((erh_0)qD).fGk();
            if (fqU2.gjC() && !fqU2.cww()) {
                this.mk(true);
                this.rbj = true;
                return Collections.emptyList();
            }
            if (fqU2.cww() && (fqU2.cmL() < fqU2.gjG() || fqU2.gjK())) {
                this.rbf = (short)(this.rbf + fqU2.cmL());
                this.rbe = fqU.ag(this.ksh, this.rbf);
                arrayList.add((erh_0)qD);
                continue;
            }
            if (fqU2.cws() && this.rbf >= fqU2.cmL()) {
                arrayList.add((erh_0)qD);
                continue;
            }
            this.mk(true);
            this.rbj = true;
            return Collections.emptyList();
        }
        return arrayList;
    }

    private void aM(List<erh_0> list) {
        if (list != null) {
            for (erh_0 erh_02 : list) {
                erh_02.mi(true);
                this.bgF.baz().q(erh_02);
            }
        }
    }

    private enk_0 fCr() {
        if (this.bba() == null) {
            return eng_0.fBz();
        }
        if (((enk_0)this.bba()).fAu()) {
            if (((enk_0)this.bba()).beB()) {
                return enr_0.fBK();
            }
            return ens_0.fBL();
        }
        if (((enk_0)this.bba()).beB()) {
            return eNQ.fBJ();
        }
        return eng_0.fBz();
    }

    private void F(QD qD) {
        enk_0 enk_02;
        this.rbe = fqU.ag(this.ksh, this.rbf);
        erh_0 erh_02 = erh_0.a(this.bgJ, this.bgE, (eNl)this.bgD, this.rbe);
        if (erh_02 == null) {
            return;
        }
        if (this.rbh) {
            erh_02.fGi();
        }
        if (rbd.contains((int)this.ksh)) {
            erh_02.fGi();
        }
        this.b(erh_02);
        enq_0 enq_02 = enq_0.a(true, false, null);
        if (this.rbk) {
            enq_02.lS(true);
        }
        erh_02.a(enq_02);
        erh_02.a((eNl)this.bgD);
        erh_02.lZ(this.rbk);
        erh_02.b(this.fCr());
        erh_02.c(this.aZL());
        erh_02.g(qD);
        erh_02.bbD();
        if (this.fHi()) {
            erh_02.mh(true);
        }
        erh_02.mg((enk_02 = (enk_0)this.bba()) != null && enk_02.df(1L));
        erh_02.g(this.bgF);
        erh_02.aZp();
    }

    @Override
    protected void b(erh_0 erh_02) {
    }

    protected int fCs() {
        if (this.bgC == null) {
            return 100;
        }
        int n = this.fCt();
        if (n == -1) {
            return 100;
        }
        if (n == -2) {
            return 0;
        }
        short s = (short)((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        fqU fqU2 = fqX.gjM().Zr(s);
        if (fqU2 == null) {
            bgA.error((Object)("UNable to check application probability for state " + s + " : this state is unknown"));
            return 0;
        }
        fqY fqY2 = fqU2.eet();
        if (fqY2 == fqY.sXg) {
            return GC.a(n, 0, 100);
        }
        float f2 = 0.0f;
        if (this.bgF != null && this.bgF.a(exx_2.rHk)) {
            f2 -= (float)this.bgF.c(exx_2.rHk);
        }
        if (this.bgE != null && this.bgE.a(exx_2.rHj)) {
            f2 += (float)this.bgE.c(exx_2.rHj);
        }
        n += (int)((float)n * f2 / 100.0f);
        return GC.a(n, 0, 100);
    }

    protected int fCt() {
        int n = ((enk_0)this.bgC).a(2, this.fHf(), ene_0.qPu);
        if (((enk_0)this.bgC).fAn() < 6) {
            return n;
        }
        QE qE = this.fCu();
        if (!(qE instanceof ers_0)) {
            return n;
        }
        ers_0 ers_02 = (ers_0)qE;
        int n2 = ((enk_0)this.bgC).a(3, this.fHf(), ene_0.qPu);
        boolean bl = ((enk_0)this.bgC).a(4, this.fHf(), ene_0.qPu) == 1;
        float f2 = ((enk_0)this.bgC).x(5, this.fHf());
        erh_0 erh_02 = ers_02.Sg(n2);
        if (erh_02 != null) {
            if (n != -1) {
                int n3 = Math.round(f2 * (float)erh_02.fGk().cmL());
                n += n3;
            }
        } else if (!bl) {
            return -2;
        }
        return n;
    }

    protected QE fCu() {
        boolean bl;
        if (((enk_0)this.bgC).fAn() <= 6) {
            return this.bgE.baz();
        }
        boolean bl2 = bl = ((enk_0)this.bgC).a(6, this.fHf(), ene_0.qPu) == 1;
        if (bl) {
            return this.bgF.baz();
        }
        return this.bgE.baz();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        this.ksh = (short)((enk_0)this.bgC).a(0, s, ene_0.qPu);
        this.el(s);
        this.rbg = this.rbf;
        this.rbe = fqU.ag(this.ksh, this.rbf);
    }

    protected void el(short s) {
        this.rbf = (short)((enk_0)this.bgC).a(1, s, ene_0.qPu);
        int n = ((enk_0)this.bgC).fAn();
        if (n != 4 && n != 5) {
            return;
        }
        if (this.bgE == null || !(this.bgE instanceof exP)) {
            bgA.error((Object)"Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, le caster n'est pas valide");
            return;
        }
        int n2 = ((enk_0)this.bgC).a(3, s, ene_0.qPu);
        fqP<? extends fqE> fqP2 = ((exP)this.bgE).dkB();
        if (fqP2 == null) {
            bgA.error((Object)"Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, le caster n'a pas d'inventaire de sort");
            return;
        }
        fqE fqE2 = (fqE)fqP2.pc(n2);
        if (fqE2 == null) {
            bgA.error((Object)("Impossible d'appliquer l'etat au niveau param\u00e9tr\u00e9, l'inventaire de sort ne contient pas le sort " + n2 + ", breed caster : " + ((exP)this.bgE).aWP() + " effect id = " + this.aZH()));
            return;
        }
        this.rbf = fqE2.cmL();
        if (n < 5) {
            return;
        }
        float f2 = ((enk_0)this.bgC).x(4, s);
        this.rbf = (short)((float)this.rbf * f2);
    }

    @Override
    protected boolean fCv() {
        fqU fqU2 = fqX.gjM().Zr(this.ksh);
        if (fqU2 != null && fqU2.gjJ() == exe_0.pcX) {
            return false;
        }
        return this.bgF != null && this.bgF.a(exe_1.rEw);
    }

    @Override
    public boolean bbI() {
        if (this.bbt()) {
            fqU fqU2 = fqX.gjM().Zt(this.rbe);
            if (fqU2 != null && fqU2.gjv() != null && !fqU2.gjv().b(this.bgE, this.bgF, this.bbf(), this.bbh())) {
                return false;
            }
            if (this.bgF != null && this.bgF.a(exe_1.rEt) && fqU2 != null && fqU2.gjJ() != exe_0.pcX) {
                return false;
            }
            if (this.bgF != null && this.bgF.baz() == null) {
                return false;
            }
            if (this.ksh > 0) {
                int n;
                int n2;
                if (this.fCp()) {
                    return false;
                }
                if (!this.rbi && (n2 = this.fCs()) < 100 && n2 < (n = ve_0.pV(100))) {
                    this.aQL = 0;
                    return false;
                }
            }
        }
        return super.bbI();
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    public short ecx() {
        return this.ksh;
    }

    public short fCw() {
        return this.rbf;
    }

    public short fCx() {
        return this.rbg;
    }

    public void fCy() {
        this.rbi = true;
    }

    public void lZ(boolean bl) {
        this.rbk = bl;
    }

    public boolean fCz() {
        return this.rbk;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().el(this.ksh).en(this.rbf));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.ksh = GC.cu(ii_12.LR());
            this.rbf = GC.cu(ii_12.tL());
            this.rbe = fqU.ag(this.ksh, this.rbf);
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCo();
    }

    static {
        rbd.add(Bv.auu);
    }
}

