/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePx
 */
public final class epx_0
extends ero_0 {
    private static final aox_1 rdD = new enz_0(new eny_0("Se lie avec la cible", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rdD;
    }

    public epx_0() {
        this.bby();
    }

    public epx_0 fEd() {
        epx_0 epx_02 = new epx_0();
        return epx_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(2123);
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        boolean bl2;
        boolean bl3 = true;
        boolean bl4 = bl2 = ((eyo_0)((Object)this.bgF)).bcP() == ((eyo_0)((Object)this.bgE)).bcP();
        if (this.bgF == null || this.bgE == null) {
            this.mk(true);
            return;
        }
        if (!this.a(eNi.qWX)) {
            if (this.bgF.a(exe_1.rDm) || this.bgE.a(exe_1.rDm)) {
                bl3 = false;
            } else if (!bl2 && (this.bgF.a(exe_1.rFe) || this.bgE.a(exe_1.rFe))) {
                bl3 = false;
            } else if (bl2 && (this.bgF.a(exe_1.rFf) || this.bgE.a(exe_1.rFf))) {
                bl3 = false;
            } else if (!(this.bgF instanceof exP) || !(this.bgE instanceof exP)) {
                bl3 = false;
            }
            if (!bl3) {
                this.mk(true);
                return;
            }
        }
        exP exP2 = (exP)this.bgE;
        exP exP3 = (exP)this.bgF;
        exP2.fgW();
        exP3.fgW();
        exP2.ad(exP3);
        exP3.ad(exP2);
    }

    @Override
    public void bbS() {
        if (this.bgF == null || this.bgE == null) {
            return;
        }
        if (!(this.bgF instanceof exP) || !(this.bgE instanceof exP)) {
            return;
        }
        ((exP)this.bgE).fgW();
        ((exP)this.bgF).fgW();
        if (this.bbt()) {
            if (this.bbq() == this.bgE.baz()) {
                this.bgF.baz().a((Qk)this.bbf(), true);
            } else {
                this.bgE.baz().a((Qk)this.bbf(), true);
            }
        }
        super.bbS();
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
        return this.fEd();
    }
}

