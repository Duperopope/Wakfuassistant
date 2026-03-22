/*
 * Decompiled with CFR 0.152.
 */
public final class eOi
extends ero_0 {
    private static final aox_1 raH = new enz_0(new eny_0("Rajoute un tour de jeu au combattant cibl\u00e9 pour le tour en cours (la position doit IMP\u00c9RATIVEMENT \u00eatre apr\u00e8s le joueur courant)", new enx_0("Spawn timeline relatif \u00e0 : 0 = currentFighter, 1 = d\u00e9but de la timeline, 2 = caster de l'effet", eNA.qYD), new enx_0("Offset timeline (Peut \u00eatre n\u00e9gatif pour partir de la fin)", eNA.qYD)));
    private final tw_0 raI = new tw_0();

    @Override
    public aox_1 bEt() {
        return raH;
    }

    public eOi() {
        this.bby();
    }

    public eOi fCe() {
        return new eOi();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (!(this.bgF instanceof euc_1) || !((euc_1)this.bgF).djT()) {
            return;
        }
        ety_0 ety_02 = ((euc_1)this.bgF).dlK();
        if (ety_02 == null || ety_02.dGp() == etw_0.rqW) {
            return;
        }
        this.raI.el(this.bgE == null ? 0L : this.bgE.Sn());
        int n = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.raI.a(Tx.px(n));
        int n2 = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        this.raI.pv(n2);
        int n3 = this.raI.bho() + this.a(this.raI, ety_02);
        if (n3 <= ety_02.baf().bhG()) {
            bgA.error((Object)("Cannot run an " + this.getClass().getSimpleName() + " as position " + n3 + " is before current position " + ety_02.baf().bhG() + ", linked RE is " + (qD == null ? "null" : qD.toString())));
            return;
        }
        ety_02.baf().a(this.bgF.Sn(), this.raI);
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

    private int a(tw_0 tw_02, ety_0<?> ety_02) {
        return switch (tw_02.bhn()) {
            default -> throw new MatchException(null, null);
            case Tx.bsM -> {
                if (ety_02.baf().bhE()) {
                    yield ety_02.baf().bhG();
                }
                yield 0;
            }
            case Tx.bsN -> 0;
            case Tx.bsO -> ety_02.baf().eB(tw_02.bhp());
        };
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCe();
    }
}

