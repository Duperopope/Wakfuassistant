/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public final class ePI
extends ePJ {
    private static final aox_1 ren = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return ren;
    }

    public ePI() {
        this.bby();
    }

    public ePI fEK() {
        return new ePI();
    }

    @Override
    protected int I(QD qD) {
        if (this.bgE == null || !(this.bgE instanceof ant_1)) {
            return 0;
        }
        qm_0 qm_02 = this.bbh();
        if (qm_02 == null || !(qm_02 instanceof ent_0)) {
            return 0;
        }
        ent_0 ent_02 = (ent_0)qm_02;
        etu_0 etu_02 = ent_02.fBq();
        if (etu_02 == null) {
            return 0;
        }
        Collection collection = etu_02.bL(((ant_1)((Object)this.bgE)).bcP());
        return Math.max(0, collection.size() - 1);
    }

    @Override
    protected boolean J(QD qD) {
        return false;
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
        return this.fEK();
    }
}

