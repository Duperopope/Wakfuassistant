/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from ePz
 */
public abstract class epz_0
extends ero_0 {
    private acd_1 rdG;
    private acd_1 rdH;
    protected int cmT = 0;
    protected boolean rdI = true;
    private int rdJ;
    private boolean rdK;
    private int rdL;
    private rj_0 rdM;
    private List<acd_1> rdN;

    @Override
    public void bby() {
        super.bby();
        this.oC(185);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        acd_1 acd_12;
        esu_0 esu_02 = this.fDJ();
        if (esu_02 == null) {
            this.mk(true);
            return;
        }
        if (esu_02.baM() && !this.bce()) {
            this.fHg();
            return;
        }
        if (this.bbt()) {
            this.fEo();
        }
        if (this.rdG == null) {
            if (this.bbt()) {
                this.fEw();
            }
            this.mk(true);
            return;
        }
        if (this.bgJ instanceof ent_0 && this.bbt()) {
            this.fEg();
        }
        if (!(acd_12 = new acd_1(esu_02.bcC(), esu_02.bcD(), esu_02.bcE())).equals(this.rdG)) {
            this.fEf();
            this.fEn();
        }
        this.aQL = this.rdN.size();
        this.d(qD, bl);
        if (!this.bbt()) {
            return;
        }
        this.fEw();
        this.ar(acd_12);
        if (esu_02 instanceof eSP && this.bbt()) {
            this.a((eSP)esu_02);
        }
    }

    protected void fEf() {
        esu_0 esu_02 = this.fDJ();
        if (!(esu_02 instanceof ezz)) {
            return;
        }
        ezz ezz2 = (ezz)((Object)esu_02);
        if (!ezz2.fha()) {
            return;
        }
        int n = eoy_0.rbv.get(esu_02.Sn());
        fqB fqB2 = fqC.giD().Za(n);
        if (fqB2 == null || fqB2.eey() == 0) {
            return;
        }
        enk_0 enk_02 = fqB2.Pv(0);
        enq_0 enq_02 = enq_0.a(true, false, null);
        try {
            enk_02.a((Qk)this.bbf(), esu_02, this.bbh(), enf_0.fBb(), esu_02.bcC(), esu_02.bcD(), esu_02.bcE(), null, enq_02, false);
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception levee", (Throwable)exception);
        }
        enq_02.aZp();
    }

    @Override
    private void a(eSP eSP2) {
        qm_0 qm_02 = eSP2.bbh();
        if (qm_02 == null) {
            return;
        }
        QR qR = qm_02.bai();
        if (qR == null) {
            return;
        }
        acd_1 acd_12 = eSP2.aZw();
        Collection<QQ> collection = qR.bdh();
        ArrayList<QQ> arrayList = new ArrayList<QQ>(collection);
        for (QQ qQ : arrayList) {
            if (!qQ.aZw().equals(acd_12) || qQ == eSP2 || qQ.aeV() != etm_0.rnz.aHp()) continue;
            qQ.a(this, null);
        }
    }

    private void fEg() {
        etu_0 etu_02 = ((ent_0)this.bgJ).fBq();
        if (this.rdN.isEmpty()) {
            return;
        }
        if (!(this.fDJ() instanceof exP)) {
            return;
        }
        etx_0 etx_02 = new etx_0(etu_02, this.fDJ(), this.rdN.get(0));
        etx_02.fJK();
        int n = this.rdN.size();
        for (int i = 0; i < n; ++i) {
            acd_1 acd_12 = this.rdN.get(i);
            etx_02.av(acd_12);
            etx_02.fJM();
            if (etx_02.fJN() && etx_02.fJO()) {
                this.rdN = this.rdN.subList(0, i + 1);
                this.rdG = this.rdN.get(this.rdN.size() - 1);
                break;
            }
            etx_02.aw(acd_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ar(acd_1 acd_12) {
        if (this.rdN == null) {
            return;
        }
        etu_0 etu_02 = ((ent_0)this.bgJ).fBq();
        etx_0 etx_02 = new etx_0(etu_02, this.fDJ(), this.rdN.get(0));
        etx_02.aw(acd_12);
        abi_1 abi_12 = new acq_1(acd_12.getX(), acd_12.getY(), acd_12.bdi(), this.fDJ().bcC(), this.fDJ().bcD(), this.fDJ().bcE()).bXb();
        int n = this.rdN.size();
        for (int i = 0; i < n; ++i) {
            acd_1 acd_13 = this.rdN.get(i);
            etx_02.av(acd_13);
            etx_02.fJM();
            if (etx_02.fJN()) {
                this.fDJ().b(abi_12);
                try {
                    etx_02.fJS();
                }
                catch (Exception exception) {
                    bgA.error((Object)"Exception levee", (Throwable)exception);
                }
                finally {
                    this.fDJ().b((abi_1)null);
                }
            }
            etx_02.aw(acd_13);
        }
    }

    boolean fEh() {
        return this.fDJ().buW();
    }

    boolean fEi() {
        return this.fDJ().a(exe_1.rDe);
    }

    boolean fEj() {
        if (this.a(eNi.qWX)) {
            return false;
        }
        esu_0 esu_02 = this.fDJ();
        boolean bl = (long)((eyo_0)((Object)this.bgE)).bcP() == esu_02.Sn();
        boolean bl2 = bl && esu_02.a(exe_1.rFf);
        boolean bl3 = !bl && esu_02.a(exe_1.rFe);
        return esu_02.a(exe_1.rDm) || bl3 || bl2;
    }

    boolean fEk() {
        return this.fDJ().a(exe_1.rEd);
    }

    boolean fEl() {
        return this.fDJ().a(exe_1.rEE);
    }

    boolean fEm() {
        return this.fDJ().a(exe_1.rEs);
    }

    private void fEn() {
        this.fDJ().b(this.rdG.getX(), this.rdG.getY(), this.rdG.bdi());
    }

    @Override
    public void E(QD qD) {
        if (this.fDJ() == null) {
            return;
        }
        if (!this.fDH()) {
            this.rdG = null;
            return;
        }
        short s = this.fHf();
        if (this.bgC != null) {
            this.cmT = ((enk_0)this.bgC).fAn() >= 1 ? ((enk_0)this.bgC).a(0, s, ene_0.qPu) : this.bgG.cH(this.fDJ().bcC(), this.fDJ().bcD());
            if (((enk_0)this.bgC).fAn() >= 2) {
                this.rdI = ((enk_0)this.bgC).a(1, s, ene_0.qPu) > 0;
            }
        } else {
            this.cmT = this.bgG.cH(this.fDJ().bcC(), this.fDJ().bcD());
        }
    }

    private void fEo() {
        this.fEs();
        this.fEr();
        this.fEp();
        this.aQL = this.rdJ;
    }

    private void fEp() {
        if (!this.fDI()) {
            return;
        }
        if (this.fEq()) {
            return;
        }
        int n = this.cmT - this.rdJ;
        if (n > 0) {
            this.rdL = 1;
            this.rdK = true;
        }
    }

    private boolean fEq() {
        if (this.rdG == null) {
            return false;
        }
        acd_1 acd_12 = this.fDK();
        return acd_12.getX() == this.rdG.getX() && acd_12.getY() == this.rdG.getY() && acd_12.bdi() == this.rdG.bdi();
    }

    public void fEr() {
        esv_0 esv_02;
        if (this.bgJ == null || this.bgJ.bag() == null) {
            bgA.error((Object)("Pas de fightMap pour le context " + String.valueOf(this.bgJ)));
            return;
        }
        esw_0 esw_02 = new esw_0(this.fDJ(), this.fDK(), this.cmT, this.bgJ);
        if (!this.fDL()) {
            esw_02.mr(true);
        }
        if ((esv_02 = esw_02.fIi()) == null) {
            return;
        }
        this.rdM = esv_02.fIb();
        if (esv_02.fEt() == null) {
            return;
        }
        this.rdN = esv_02.fId();
        this.rdJ = esv_02.fEu();
        this.rdH = new acd_1(this.fDJ().bcC(), this.fDJ().bcD(), this.fDJ().bcE());
        this.rdG = new acd_1(esv_02.fEt());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.fEs();
        this.cmT = 0;
        this.rdG = null;
        this.rdI = true;
        this.rdK = false;
    }

    private void fEs() {
        this.rdG = null;
        this.rdH = null;
        this.rdM = null;
        this.rdJ = 0;
        this.rdL = 0;
    }

    @Override
    protected boolean fCv() {
        return this.fHp();
    }

    @Override
    protected void b(io_1 io_12) {
        ik_1 ik_12 = ii_1.MR();
        ig_2 ig_22 = ie_2.PM();
        if (this.rdN != null && !this.rdN.isEmpty()) {
            for (acd_1 acd_12 : this.rdN) {
                ig_22.c(ii_2.Qc().eH(acd_12.getX()).eI(acd_12.getY()).eJ(acd_12.bdi()));
            }
            ik_12.a(ig_22);
        }
        io_12.a(ik_12);
    }

    @Override
    protected void f(im_1 im_12) {
        ii_1 ii_12;
        if (im_12.Qz() && (ii_12 = im_12.QA()).MK() && ii_12.ML().PK() > 0) {
            List<ii_2> list = ii_12.ML().PI();
            this.rdN = new ArrayList<acd_1>();
            for (ii_2 ii_22 : list) {
                this.rdN.add(new acd_1(ii_22.getX(), ii_22.getY(), GC.cu(ii_22.NN())));
            }
            this.rdG = this.rdN.get(this.rdN.size() - 1);
        }
    }

    public acd_1 fEt() {
        return this.rdG;
    }

    public int fEu() {
        return this.rdJ;
    }

    public acd_1 fEv() {
        return this.rdH;
    }

    private void fEw() {
        Optional<qu_0> optional;
        boolean bl = this.rdM != null && this.rdM instanceof qu_0;
        Optional<qu_0> optional2 = optional = bl ? Optional.of((qu_0)((Object)this.rdM)) : Optional.empty();
        if (this.rdI && this.rdL > 0) {
            this.q(this.bgF);
            optional.ifPresent(this::q);
        }
        if (this.rdK) {
            BitSet bitSet = new BitSet();
            bitSet.set(204);
            this.bgE.a(bitSet, this, (byte)30);
            this.bgF.a(bitSet, this, (byte)3);
            optional.ifPresent(qu_02 -> {
                QD qD = this.bbn();
                qD.f((qu_0)qu_02);
                this.bgE.a(bitSet, qD, (byte)30);
                qu_02.a(bitSet, this, (byte)3);
            });
        }
    }

    private void q(qu_0 qu_02) {
        if (!qu_02.a(exx_2.rGj)) {
            return;
        }
        eNW eNW2 = eNW.a(this.bgJ, exx_2.rGj, this.bgE, qu_02);
        eNF eNF2 = eNF.fBy();
        eNW2.b(eNF2);
        eNW2.oC(2254);
        eNW2.g(qu_02);
        eNW2.aZp();
    }

    abstract boolean fDL();

    public abstract boolean fDH();

    abstract boolean fDI();

    public abstract esu_0 fDJ();

    abstract acd_1 fDK();

    boolean fEx() {
        return this.bgF.bcC() == this.bgE.bcC() && this.bgF.bcD() == this.bgE.bcD();
    }

    protected boolean fEy() {
        return this.a(eNi.qWA);
    }
}

