/*
 * Decompiled with CFR 0.152.
 */
public final class eOE
extends ero_0 {
    private static final aox_1 rbR = new enz_0(new aow_1[0]);

    @Override
    public aox_1 bEt() {
        return rbR;
    }

    public eOE() {
        this.bby();
    }

    public eOE fCQ() {
        return new eOE();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        int n;
        if (!(this.bgJ instanceof ent_0)) {
            return;
        }
        rh_0 rh_02 = this.bgJ.bag();
        if (rh_02 == null) {
            return;
        }
        int n2 = this.bgG.getX();
        if (!rh_02.T(n2, n = this.bgG.getY())) {
            return;
        }
        ((ent_0)this.bgJ).fBq().au(this.bgG);
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return false;
    }

    @Override
    public boolean bbC() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCQ();
    }
}

