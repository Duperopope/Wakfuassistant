/*
 * Decompiled with CFR 0.152.
 */
final class bha
extends eyj_0 {
    private final os_2 ifH;
    final /* synthetic */ bgt_0 ifI;

    bha(bgt_0 bgt_02, os_2 os_22) {
        this.ifI = bgt_02;
        this.ifH = os_22;
        this.ifH.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.doi().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        if (this.ifH.RS == null) {
            return;
        }
        blx_1 blx_12 = new blx_1(bgt_0.n(this.ifI));
        this.ifI.a(blx_12);
        if (!ezq_0.b(blx_12, this.ifH.RS.RW)) {
            bgt_0.doj().error((Object)"Error when unserializing symbiot part");
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null || bgt_02.Sn() == bgt_0.o(this.ifI)) {
            bmc_1.eeg().eea();
            bmc_1.eeg().eeb();
        }
        for (byte by = 0; by < blx_12.fmQ(); by = (byte)(by + 1)) {
            Object object = this.ifI.ieP.dmN().Pm(by);
            if (object == null || ((ezw)object).getName() != null && !((ezw)object).getName().isEmpty()) continue;
            String string = aum_0.cWf().a(7, (long)((ezw)object).doG(), new Object[0]);
            ((ezw)object).setName(string);
            ciU ciU2 = new ciU();
            ciU2.db(bgt_0.p(this.ifI));
            ciU2.dg(by);
            ciU2.ou(string);
            ciU2.jh(false);
            aue_0.cVJ().etu().d(ciU2);
        }
        fse_1.gFu().a((aef_2)bmc_1.eeg(), bmc_1.kvL);
        cxo_2.eWM().eWN();
        for (Object object : bgt_0.q(this.ifI)) {
            object.n(this.ifI);
        }
    }
}

