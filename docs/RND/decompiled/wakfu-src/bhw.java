/*
 * Decompiled with CFR 0.152.
 */
final class bhw
implements ezi_0<blx_1> {
    private final bgt_0 igA;
    private blx_1 igB;

    bhw(bgt_0 bgt_02) {
        this.igA = bgt_02;
    }

    public blx_1 dmN() {
        return this.igB;
    }

    private void doz() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null && bgt_02.Sn() != this.igA.Sn()) {
            return;
        }
        bmc_1.eeg().a(this.igA.dmN());
        fse_1.gFu().f("osamodasSymbiot", bmc_1.eeg());
        fse_1.gFu().aT("osamodasSymbiot", "capturedCreatures");
        if (aue_0.cVJ().c(cxo_2.eWM())) {
            cxo_2.eWM().doz();
        }
    }

    @Override
    public void a(blx_1 blx_12) {
        this.igB = blx_12;
        this.doz();
    }

    @Override
    public void bm(byte by) {
        ezw ezw2 = this.igB.Pm(by);
        if (ezw2.getName() == null || ezw2.getName().isEmpty()) {
            String string = aum_0.cWf().a(7, (long)ezw2.doG(), new Object[0]);
            ezw2.setName(string);
            ciU ciU2 = new ciU();
            ciU2.db(this.igA.Sn());
            ciU2.dg(by);
            ciU2.ou(string);
            ciU2.jh(false);
            aue_0.cVJ().etu().d(ciU2);
        }
        fse_1.gFu().a((aef_2)bmc_1.eeg(), bmc_1.kvL);
    }

    @Override
    public void bn(byte by) {
        ciT ciT2 = new ciT();
        ciT2.df(by);
        ciT2.db(this.igA.Sn());
        aue_0.cVJ().etu().d(ciT2);
        fse_1.gFu().a((aef_2)bmc_1.eeg(), bmc_1.kvL);
    }

    @Override
    public void dmO() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null && bgt_02.Sn() != this.igA.Sn()) {
            return;
        }
        bmc_1.eeg().a(this.igB);
        fse_1.gFu().f("osamodasSymbiot", bmc_1.eeg());
    }

    @Override
    public /* synthetic */ ezn_0 dob() {
        return this.dmN();
    }
}

