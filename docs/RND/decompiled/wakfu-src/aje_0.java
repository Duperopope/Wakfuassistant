/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJe
 */
abstract class aje_0
implements aed_0 {
    private static final aeq_0 dZQ = new aer_0(0.0f, 0.5f, 0.5f, 1.0f);
    private static final aeq_0 dZR = new aet_0(0.0f, 0.5f, 0.5f, 1.0f);
    protected final ajf_0 dZS;

    aje_0(ajf_0 ajf_02) {
        this.dZS = ajf_02;
    }

    @Override
    public aeq_0 bwh() {
        return dZQ;
    }

    @Override
    public aeq_0 bwi() {
        return dZR;
    }

    @Override
    public int a(adx_0 adx_02) {
        return this.dZS.chr().bfX();
    }

    @Override
    public void a(adx_0 adx_02, abi_1 abi_12) {
    }

    @Override
    public int bwj() {
        return 0;
    }

    @Override
    public void a(adx_0 adx_02, int n, aev_0 aev_02, boolean bl, boolean bl2) {
    }

    @Override
    public void b(adx_0 adx_02, abi_1 abi_12) {
        adx_02.a(abi_12);
    }

    @Override
    public boolean g(adx_0 adx_02) {
        return false;
    }

    @Override
    public boolean b(adx_0 adx_02, int n) {
        return false;
    }

    @Override
    public boolean bwk() {
        return true;
    }
}

