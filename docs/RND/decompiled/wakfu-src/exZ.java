/*
 * Decompiled with CFR 0.152.
 */
final class exZ
extends eyj_0 {
    private final rt_2 pgW;
    final /* synthetic */ exP pgX;

    exZ(exP exP2, rt_2 rt_22) {
        this.pgX = exP2;
        this.pgW = rt_22;
        this.pgW.DM().a(this);
    }

    @Override
    public void zl() {
        acd_1 acd_12 = this.pgX.aZw();
        this.pgW.WO = acd_12.getX();
        this.pgW.WP = acd_12.getY();
        this.pgW.WQ = acd_12.bdi();
        this.pgW.WR = (byte)this.pgX.bcB().dzy;
        this.pgW.UB = this.pgX.aqZ();
        acd_1 acd_13 = this.pgX.fgP();
        if (acd_13 == null) {
            return;
        }
        this.pgW.WS = new rw_2();
        this.pgW.WS.WO = acd_13.getX();
        this.pgW.WS.WP = acd_13.getY();
        this.pgW.WS.WQ = acd_13.bdi();
        this.pgW.WS.UB = this.pgX.fgQ();
    }

    @Override
    public void zm() {
        this.pgX.a(this.pgW.WO, this.pgW.WP, this.pgW.WQ);
        this.pgX.a(abi_1.wG(this.pgW.WR));
        this.pgX.fK(this.pgW.UB);
        if (this.pgW.WS != null) {
            this.pgX.ao(new acd_1(this.pgW.WS.WO, this.pgW.WS.WP, this.pgW.WS.WQ));
            this.pgX.ph(this.pgW.WS.UB);
        }
        for (eyk_0 eyk_02 : this.pgX.pga) {
            eyk_02.p(this.pgX);
            eyk_02.q(this.pgX);
        }
    }
}

