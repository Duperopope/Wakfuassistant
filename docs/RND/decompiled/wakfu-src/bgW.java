/*
 * Decompiled with CFR 0.152.
 */
final class bgW
extends eyj_0 {
    private final oy_1 ifz;
    final /* synthetic */ bgt_0 ifA;

    bgW(bgt_0 bgt_02, oy_1 oy_12) {
        this.ifA = bgt_02;
        this.ifz = oy_12;
        this.ifz.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dot().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        evd_2 evd_22 = this.ifA.dpL();
        eut_1.osb.a(bgt_0.r(this.ifA), evd_22);
        evd_22.b(this.ifz);
        fse_1.gFu().f("subscribedAccount", evg_1.osP.a(new eve_2[]{this.ifA}));
        fse_1.gFu().f("subscribedZoneAccount", evg_1.osQ.a(new eve_2[]{this.ifA}));
        fse_1.gFu().f("politicInteractionRight", this.ifA.a(evv_1.oxk));
        fse_1.gFu().a((aef_2)this.ifA, "isInSubscriberZone");
        evt_1 evt_12 = evd_22.fdL();
        evt_1 evt_13 = evt_1.Oq(evt_12.fez());
        fse_1.gFu().f("freeSubscriptionLevel", evt_13 == evt_12);
        this.ifA.dpL().et(this.ifz.Re);
    }
}

