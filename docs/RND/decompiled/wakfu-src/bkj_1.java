/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkj
 */
class bkj_1
implements ZJ {
    final /* synthetic */ bki_1 iqv;

    bkj_1(bki_1 bki_12) {
        this.iqv = bki_12;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.iqv.iqu.b(this);
        ZM.bqw().d(this.iqv.iqu);
        this.iqv.iqu = null;
    }
}

