/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cZq
 */
class czq_2
implements fis_1 {
    final /* synthetic */ apr_0 oaT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    czq_2(czp_2 czp_22, apr_0 apr_02) {
        this.oaT = apr_02;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap();
        if (fhs_22 != null && fhs_22.getId() != null && fhs_22.getId().equals(cza_2.NL(this.oaT.czm()))) {
            this.oaT.czW().czK();
            this.oaT.l((TObjectProcedure<? super apn_0>)((TObjectProcedure)apn_02 -> {
                fse_1.gFu().a((aef_2)apn_02, "allFiltersList");
                return true;
            }));
            return false;
        }
        return true;
    }
}

