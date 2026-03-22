/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOG
 */
public final class eog_0
extends ero_0 {
    private static final aox_1 rbT = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rbT;
    }

    public eog_0() {
        this.bby();
    }

    public eog_0 fCS() {
        eog_0 eog_02 = new eog_0();
        return eog_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgF == null || this.bgE == null) {
            return;
        }
        if (this.bgF instanceof exP) {
            this.aQL = ((exP)this.bgF).cmL();
        } else if (this.bgF instanceof eSS) {
            this.aQL = ((eSS)this.bgF).cmL();
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null || !(this.bgE instanceof exP) || ((exP)this.bgE).aWP() != 1620 || this.aQL == 0) {
            this.fHg();
            return;
        }
        exP exP2 = (exP)this.bgE;
        eyi eyi2 = (eyi)exP2.doV();
        short s = eyi2.cqA();
        short s2 = exP2.cmL();
        if (s2 == s) {
            this.fHg();
            return;
        }
        short s3 = ((exP)this.bgE).dlI().cmL();
        if (s2 >= s3) {
            this.fHg();
            return;
        }
        int n = exP2.d(exx_2.rGi);
        int n2 = exP2.c(exx_2.rGi);
        short s4 = (short)Math.min(Math.min(s2 + this.aQL, s), s3);
        exP2.bw(s4);
        exP2.doB();
        int n3 = exP2.d(exx_2.rGi);
        int n4 = n3 - n;
        int n5 = n2 + n4;
        exP2.e(exx_2.rGi).op(n5);
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
        return this.fCS();
    }
}

