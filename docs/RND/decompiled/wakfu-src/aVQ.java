/*
 * Decompiled with CFR 0.152.
 */
public class aVQ
extends aUS {
    private final long htE;

    public aVQ(int n, int n2, int n3, int n4, long l) {
        super(n, n2, n3, n4);
        this.htE = l;
    }

    @Override
    protected void cWv() {
        bsS bsS2 = this.cja();
        if (!(bsS2 instanceof bsj_0)) {
            return;
        }
        bsj_0 bsj_02 = (bsj_0)bsS2;
        bgy bgy2 = (bgy)bsj_02.qJ(this.htE);
        bgy2.lp(true);
        bsj_02.qI(this.htE);
        bsj_02.bd(bgy2);
        if (bgy2 instanceof bhJ) {
            bgy2.dkS();
        }
    }

    @Override
    protected void caV() {
    }
}

