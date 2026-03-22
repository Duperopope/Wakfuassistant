/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSO
 */
class cso_1
implements fjb_1 {
    final /* synthetic */ bgr_0 nGN;
    final /* synthetic */ fdf_1 nGO;
    final /* synthetic */ csm_1 nGP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cso_1(csm_1 csm_12, bgr_0 bgr_02, fdf_1 fdf_12) {
        this.nGP = csm_12;
        this.nGN = bgr_02;
        this.nGO = fdf_12;
    }

    @Override
    public void eOq() {
        int n;
        bgy bgy2;
        aef_2 aef_22;
        if (!this.nGP.nGH) {
            return;
        }
        if (this.nGP.eOx() && this.nGN.dmr() > 0 && (aef_22 = (bhJ)this.nGN.dmt()) != null) {
            this.nGP.ay((bhJ)aef_22);
            return;
        }
        aef_22 = bib_0.ilf;
        if (this.nGN.dmq() == null && (bgy2 = csm_1.eOy().orElse(this.nGN.dmt())) != null) {
            csm_1.bX(bgy2);
            int n2 = ((bib_0)aef_22).aI(bgy2);
            this.nGN.aB(bgy2);
            this.nGO.setSelectedValue(((bib_0)aef_22).Db(n2));
        }
        if ((n = ((bib_0)aef_22).aI(this.nGN.dmq())) != -1) {
            this.nGO.b(this);
        }
    }
}

