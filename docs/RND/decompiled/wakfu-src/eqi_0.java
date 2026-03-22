/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQI
 */
public final class eqi_0
extends eQN {
    @Override
    public eQN fFK() {
        return new eqi_0();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        super.c(qD, bl);
        this.fFL();
    }

    private void fFL() {
        if (this.bgE == null) {
            return;
        }
        if (this.odg == null) {
            return;
        }
        if (this.bgE.a(exx_2.rHi)) {
            pr_0 pr_02 = this.odg.b(exx_2.rHi);
            pr_02.or(this.bgE.c(exx_2.rHi));
            pr_02.aYO();
            ((eSP)this.odg).fIF();
        }
    }
}

