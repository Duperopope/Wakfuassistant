/*
 * Decompiled with CFR 0.152.
 */
public class eNW
extends eOO {
    private static final aox_1 rab = new enz_0(new eny_0("Modif de Charac", new enx_0("valeur (-1 pour valeur de l'effet declencheur)", eNA.qYC)));
    private static final short rac = 5227;

    public eNW() {
    }

    public eNW(pt_0 pt_02) {
        super(pt_02);
    }

    public eNW fBP() {
        eNW eNW2 = new eNW();
        eNW2.rcf = this.rcf;
        return eNW2;
    }

    public static eNW a(qm_0<enk_0> qm_02, pt_0 pt_02, qu_0 qu_02, qu_0 qu_03) {
        eNW eNW2 = new eNW(pt_02);
        eNW2.b(qm_02, pt_02, qu_02, qu_03);
        return eNW2;
    }

    private void b(qm_0<enk_0> qm_02, pt_0 pt_02, qu_0 qu_02, qu_0 qu_03) {
        if (pt_02 == exx_2.rGj) {
            this.o = enf_0.qQQ.d();
            this.bgM = ((ero_0)enf_0.qQQ.bkx()).baZ();
        } else if (pt_02 == exx_2.rGk) {
            this.o = enf_0.qQS.d();
            this.bgM = ((ero_0)enf_0.qQS.bkx()).baZ();
        } else {
            throw new UnsupportedOperationException("We can't checkout an effect of this type for something else than AP/MP loss");
        }
        this.bby();
        this.bgE = qu_02;
        this.bgF = qu_03;
        this.bgO = -1;
        this.bgJ = qm_02;
        this.rcf = pt_02;
    }

    @Override
    boolean fBQ() {
        if (super.fBQ()) {
            return true;
        }
        return this.rcf == exx_2.rGk && this.fCZ().a(exe_1.rDf);
    }

    @Override
    public void E(QD qD) {
        if (this.bgF == null) {
            this.aQL = 0;
            bgA.error((Object)("Can't apply effect " + this.d() + ", target is null (parent container id : " + ((eNl)this.bbf()).QF() + ")"));
            return;
        }
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        int n = this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        if (this.aQL == -1) {
            ero_0 ero_02 = (ero_0)qD;
            if (ero_02 == null) {
                ero_02 = ((enq_0)this.bbg()).fBh();
            }
            if (ero_02 == null) {
                bgA.error((Object)"On ne peut pas copier la valeur de l'effet declencheur, celui-ci est inconnu");
                this.aQL = 0;
                return;
            }
            if (ero_02 instanceof eoc_0) {
                eoc_0 eoc_02 = (eoc_0)ero_02;
                byte by = this.rcf.aJr();
                if (by == exx_2.rGj.aJr()) {
                    this.aQL = eoc_02.fBZ();
                } else if (by == exx_2.rGk.aJr()) {
                    this.aQL = eoc_02.fBY();
                } else if (by == exx_2.rGl.aJr()) {
                    this.aQL = eoc_02.fBX();
                }
            } else {
                this.aQL = ero_02.getValue();
            }
        }
        int n2 = 0;
        int n3 = 0;
        if (this.bgF != this.bgE && !this.a(eNi.qWR)) {
            n2 = this.bgF.a(exx_2.rHl) ? this.bgF.c(exx_2.rHl) : 0;
            n3 = this.bgE.a(exx_2.rHl) ? this.bgE.c(exx_2.rHl) : 0;
        }
        float f2 = (float)this.aQL * 0.5f * (1.0f + (float)n3 / 100.0f - (float)n2 / 100.0f);
        this.aQL = VJ.bt(f2);
        if (this.aQL < 0) {
            this.aQL = 0;
        }
        if (n != this.aQL) {
            if (this.rcf.aJr() == exx_2.rGj.aJr()) {
                this.oC(58);
            } else if (this.rcf.aJr() == exx_2.rGk.aJr()) {
                this.oC(75);
            }
        }
        this.aQL = GC.a(this.aQL, 0, n);
        if (this.aQL == 0) {
            this.fh((byte)3);
        }
    }

    @Override
    void d(pr_0 pr_02) {
        super.d(pr_02);
        if (this.aQL > 0) {
            if (!this.bbt()) {
                return;
            }
            if (!this.a(eNi.qWG)) {
                int n;
                eor_0 eor_02 = eor_0.a(this.bbh(), this.bbd(), (short)5227, (short)0, false);
                eor_02.f(this.bbd());
                eor_02.g(this);
                eor_02.e(this.bbd());
                float[] fArray = new float[]{5227.0f, 0.0f, this.aQL * 10, 0.0f, 100.0f, 0.0f};
                fqU fqU2 = fqX.gjM().Zr(5227);
                if (fqU2 != null) {
                    n = fqU2.gjG();
                } else {
                    bgA.error((Object)"Unable to find state 5227");
                    n = 245;
                }
                eno_0 eno_02 = eno_0.j(fArray, n);
                eor_02.b(eno_02);
                eor_02.a(this.bbh());
                eor_02.fCy();
                eor_02.g(this.bbd());
                eor_02.aZp();
            }
        } else {
            exx_2 exx_22 = (exx_2)this.rcf;
            if (exx_22.fOK()) {
                this.oD(exx_22.fOG());
            }
        }
    }

    @Override
    protected boolean fBR() {
        if (this.bgF == null) {
            return true;
        }
        if (!this.bgF.a(this.rcf)) {
            return true;
        }
        return this.bgF.b(this.rcf).aYB() == ((exf_2)this.bgF.b(this.rcf)).aYX();
    }

    @Override
    public aox_1 bEt() {
        return rab;
    }

    @Override
    public /* synthetic */ eOO fBS() {
        return this.fBP();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fBP();
    }
}

