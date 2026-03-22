/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePL
 */
public class epl_0
extends ero_0 {
    private static final aox_1 rex = new enz_0(new eny_0("Min, Max", new enx_0("Min", eNA.qYC), new enx_0("Max", eNA.qYC)));
    private eNd jSQ;

    @Override
    public aox_1 bEt() {
        return rex;
    }

    private epl_0() {
    }

    public epl_0(eNd eNd2) {
        this.jSQ = eNd2;
    }

    public epl_0 fEP() {
        epl_0 epl_02 = new epl_0();
        epl_02.jSQ = this.jSQ;
        return epl_02;
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        epq_0 epq_02 = epq_0.a(this.bgJ, this.jSQ, eso_0.rjE, this.aQL, this.bgF);
        int n = enf_0.qSJ.d();
        switch (this.jSQ) {
            case qPc: {
                n = enf_0.qSN.d();
                break;
            }
            case qPb: {
                n = enf_0.qSL.d();
                break;
            }
            case qOZ: {
                n = enf_0.qSK.d();
                break;
            }
            case qPa: {
                n = enf_0.qSM.d();
            }
        }
        epq_02.lK(n);
        epq_02.a((eNl)this.bgD);
        epq_02.b((enk_0)this.bgC);
        epq_02.c(this.bgG.getX(), this.bgG.getY(), this.bgG.bdi());
        epq_02.f(this.bgF);
        epq_02.e(this.bgE);
        epq_02.M((byte)1);
        epq_02.fDS();
        epq_02.bbM();
        epq_02.bbK();
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
        int n = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        int n2 = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        if (this.bgE.a(exe_1.rFa)) {
            this.aQL = n;
            return;
        }
        if (this.bgE.a(exe_1.rFb)) {
            this.aQL = n2;
            return;
        }
        this.aQL = GC.q(n, n2);
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

    @Override
    protected boolean bce() {
        return true;
    }

    @Override
    public eNd dTh() {
        return this.jSQ;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEP();
    }
}

