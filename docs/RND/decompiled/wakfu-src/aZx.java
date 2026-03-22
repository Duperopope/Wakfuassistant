/*
 * Decompiled with CFR 0.152.
 */
class aZx
implements aqg_1<aMU> {
    final /* synthetic */ bgo_1 hyo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aZx(aZu aZu2, bgo_1 bgo_12) {
        this.hyo = bgo_12;
    }

    public void a(aMU aMU2) {
        Object object;
        if (aMU2.d() == 0) {
            return;
        }
        if (aMU2.cpF() != null) {
            object = bej_0.h(aMU2);
            fhh_0.spN.a(aMU2.d(), (fhg_0)object);
        }
        if (aMU2.cpG() != null && (object = bej_0.i(aMU2)) != null) {
            bev_0.dSZ().a(aMU2.d(), (fhp_0)object);
        }
        if (aMU2.cpH() != null && aMU2.cpH().length > 0) {
            bEm.dSb().Gr(aMU2.d());
        }
        bEm.dSb().p(this.hyo.e(aMU2));
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aMU)aqz_22);
    }
}

