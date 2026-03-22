/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYF
 */
class ayf_0
implements aqg_1<aMd> {
    final /* synthetic */ bmi_0 hxO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ayf_0(aYE aYE2, bmi_0 bmi_02) {
        this.hxO = bmi_02;
    }

    public void a(aMd aMd2) {
        bmh_1 bmh_12 = new bmh_1(aMd2.d());
        for (int n : aMd2.cjX()) {
            enk_0 enk_02 = bat_2.cZD().Ay(n);
            if (enk_02 != null) {
                bmh_12.v(enk_02);
                continue;
            }
            aYE.hxM.error((Object)("Probl\u00e8me de chargmeent de effectGruop " + aMd2.d()));
        }
        this.hxO.a(bmh_12);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aMd)aqz_22);
    }
}

