/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQD
 */
public class eqd_0
extends ero_0 {
    private static final aox_1 rgk = new enz_0(new eny_0("Param standard", new enx_0[0]));
    private static final boolean rgl = false;

    @Override
    public aox_1 bEt() {
        return rgk;
    }

    public eqd_0 fFG() {
        eqd_0 eqd_02 = new eqd_0();
        return eqd_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.cXt() != 14) {
            return;
        }
        if (!(this.bgE instanceof exP) || !(this.bgF instanceof exP)) {
            bgA.error((Object)"La cible ou le caster n'est pas du bon type");
            this.mk(true);
            return;
        }
        exP exP2 = (exP)this.bgE;
        ezn_0 ezn_02 = exP2.dob();
        if (ezn_02 == null) {
            bgA.error((Object)"On n'a pas de symbiote");
            this.mk(true);
            return;
        }
        exP exP3 = (exP)this.bgF;
        if (exP3.aFW() != 1 || exP3.dOp()) {
            bgA.error((Object)"La cible que l'on tente de seduire n'est pas seductible");
            this.mk(true);
            return;
        }
        ezw ezw2 = ezn_02.ds(exP3.aWP());
        if (ezw2 == null) {
            return;
        }
        bgA.info((Object)("S\u00e9duction d'une cr\u00e9ature avec " + ezw2.fmi() + " PV"));
        if (this.bbt()) {
            this.aQL = ezn_02.d(ezw2);
        } else {
            ezn_02.a(ezw2, (byte)this.aQL);
        }
        if (this.aQL == -1) {
            bgA.info((Object)"Erreur lors de l'ajout de la creature au symbiot, annulation de la seduction");
            this.mk(true);
            return;
        }
        this.bgF.f(exe_1.rDt);
        this.bgF.f(exe_1.rDn);
        this.bgF.f(ezj_0.psI);
        this.bgF.f(exe_1.rEn);
        this.bgF.f(exe_1.rEm);
        this.d(qD, bl);
    }

    @Override
    public void E(QD qD) {
        if (!(this.bgF instanceof exP) || this.bgF.a(exe_1.rDC) || !this.bgF.a(exe_1.rDO)) {
            this.fh((byte)13);
            return;
        }
        this.fh((byte)14);
    }

    @Override
    public void bbS() {
        super.bbS();
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
        return this.fFG();
    }
}

