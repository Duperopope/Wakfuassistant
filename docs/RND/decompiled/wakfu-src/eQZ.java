/*
 * Decompiled with CFR 0.152.
 */
public class eQZ
extends ero_0 {
    private static final aox_1 rgS = new enz_0(new eny_0("Renvoi de sort (complet)", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rgS;
    }

    public eQZ fFZ() {
        eQZ eQZ2 = new eQZ();
        return eQZ2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (qD != null && bl) {
            if (qD.bbc() != null && !qD.bbc().a(ezj_0.psW)) {
                qu_0 qu_02 = qD.bbc();
                qD.c(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
            } else {
                this.mk(true);
            }
        } else if (this.bbt()) {
            this.mk(true);
        }
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
        return this.fFZ();
    }
}

