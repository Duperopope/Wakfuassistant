/*
 * Decompiled with CFR 0.152.
 */
public class eQa
extends ero_0 {
    private static final aox_1 reQ = new enz_0(new eny_0("Pas de params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return reQ;
    }

    public eQa fFc() {
        eQa eQa2 = new eQa();
        return eQa2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE != null && this.bgE instanceof exP && this.bgF != null && this.bgF instanceof exP) {
            exP exP2 = (exP)this.bgE;
            exP exP3 = (exP)this.bgF;
            if (exP3.a(exe_1.rDg) && exP2.dlK() != null) {
                ((etu_0)exP2.dlK()).x(exP3);
            }
        }
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
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

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFc();
    }
}

