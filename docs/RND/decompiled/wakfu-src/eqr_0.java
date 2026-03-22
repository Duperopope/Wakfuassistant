/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQR
 */
public final class eqr_0
extends eQN {
    @Override
    public eQN fFK() {
        return new eqr_0();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        super.c(qD, bl);
        this.fFS();
    }

    @Override
    public void E(QD qD) {
        super.E(qD);
        this.rgD = true;
    }

    private void fFS() {
        int n = this.bgG.getX() - this.bgE.bcC();
        int n2 = this.bgG.getY() - this.bgE.bcD();
        abi_1 abi_12 = n > 1 || n < -1 || n2 > 1 || n2 < -1 ? abi_1.dzq : abi_1.cB(n, n2);
        this.odg.a(abi_12);
    }
}

