/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOp
 */
public final class eop_0
extends ero_0 {
    private static final aox_1 raY = new enz_0(new eny_0("D\u00e9faut", new enx_0("Id de la propri\u00e9t\u00e9", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return raY;
    }

    public eop_0() {
        this.bby();
    }

    @Override
    public QD<enk_0, eNl> bbo() {
        eop_0 eop_02 = new eop_0();
        eop_02.aQL = this.aQL;
        return eop_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        if (!(this.bgF instanceof QQ)) {
            bgA.error((Object)("Can not ApplyEffectAreaProperty " + this.aQL + " on something else than BasicEffectArea (target=" + String.valueOf(this.bgF) + " ; caster=" + String.valueOf(this.bgE) + ")"));
            this.mk(true);
            return;
        }
        etl_0 etl_02 = etl_0.Sq(this.aQL);
        if (etl_02 == null) {
            this.mk(true);
            return;
        }
        this.bgF.f(etl_02);
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
    public void E(QD qD) {
        this.aQL = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
    }

    @Override
    public void bbS() {
        if (this.bgF == null) {
            return;
        }
        etl_0 etl_02 = etl_0.Sq(this.aQL);
        if (etl_02 == null) {
            return;
        }
        this.bgF.h(etl_02);
    }
}

