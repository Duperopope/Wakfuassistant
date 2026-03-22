/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePc
 */
public final class epc_0
extends ero_0 {
    private static final aox_1 rcF = new enz_0(new eny_0("D\u00e9sactive les trigger de tour (start & end)", new enx_0[0]), new eny_0("D\u00e9sactive des triggers de tour sp\u00e9cifiques", new enx_0("Both (0) ; start_turn (1) ; end_turn (2)", eNA.qYC)));
    public static final byte rcG = 1;
    public static final byte rcH = 2;
    private boolean rcI = true;
    private boolean rcJ = true;

    @Override
    public aox_1 bEt() {
        return rcF;
    }

    public epc_0() {
        this.bby();
    }

    public epc_0 fDr() {
        return new epc_0();
    }

    @Override
    public void E(QD qD) {
        if (!(this.bgF instanceof exP) || !((exP)this.bgF).djT()) {
            return;
        }
        if (((enk_0)this.bgC).fAn() == 1) {
            int n = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
            if (n == 1) {
                this.rcJ = false;
            } else if (n == 2) {
                this.rcI = false;
            }
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(this.bgF instanceof exP) || !((exP)this.bgF).djT()) {
            return;
        }
        if (this.rcI) {
            ((exP)this.bgF).fhm().set(1);
        }
        if (this.rcJ) {
            ((exP)this.bgF).fhm().set(2);
        }
    }

    @Override
    public void bbS() {
        if (this.rcI) {
            ((exP)this.bgF).fhm().clear(1);
        }
        if (this.rcJ) {
            ((exP)this.bgF).fhm().clear(2);
        }
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().r(this.rcI).s(this.rcJ));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rcI = ii_12.Mc();
            this.rcJ = ii_12.Me();
        }
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
    public /* synthetic */ QD bbo() {
        return this.fDr();
    }
}

