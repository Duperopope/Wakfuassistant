/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQo
 */
public final class eqo_0
extends eQi {
    public eqo_0() {
        this.bby();
    }

    public eqo_0 fFx() {
        return new eqo_0();
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        int n;
        enq_0 enq_02 = super.d(ero_02, bl);
        qu_0 qu_02 = this.rfm ? this.bgE : this.bgF;
        if (qu_02 == null) {
            return enq_02;
        }
        pr_0 pr_02 = qu_02.b(exx_2.rGi);
        pr_0 pr_03 = qu_02.b(exx_2.rHp);
        int n2 = 0;
        int n3 = 0;
        if (pr_02 != null) {
            n2 = pr_02.aYD();
            n3 = pr_02.aYB();
        }
        if (pr_03 != null) {
            n2 += pr_03.aYD();
            n3 += pr_03.aYB();
        }
        int n4 = pr_02 != null || pr_03 != null ? (this.rfz == 1 ? n2 : (this.rfz == 2 ? n3 * 100 / n2 : (this.rfz == 3 ? (n2 - n3) * 100 / n2 : (this.rfz == 4 ? n2 - n3 : n3)))) : 0;
        if (this.rfx) {
            n = this.rfy == 0 ? n4 : (int)Math.floor((float)n4 / (float)this.rfy);
        } else {
            switch (this.rfA) {
                case qPx: {
                    n = (int)Math.ceil(this.rfn + this.rfo * (float)n4);
                    break;
                }
                case qPw: {
                    n = (int)Math.floor(this.rfn + this.rfo * (float)n4);
                    break;
                }
                default: {
                    n = Math.round(this.rfn + this.rfo * (float)n4);
                }
            }
        }
        enq_02.RT(n);
        return enq_02;
    }

    @Override
    public /* synthetic */ eQi fFs() {
        return this.fFx();
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFx();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFx();
    }
}

