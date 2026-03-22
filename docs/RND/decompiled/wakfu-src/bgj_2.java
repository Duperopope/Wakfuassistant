/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGJ
 */
public class bgj_2
extends bga_2 {
    @NotNull
    private final bfi_1 jWo;
    @NotNull
    private final ffV jWp;

    public bgj_2(@NotNull bfi_1 bfi_12, @NotNull ffV ffV2) {
        this.jWo = bfi_12;
        this.jWp = ffV2;
    }

    @Override
    protected boolean G(@NotNull bgt_0 bgt_02) {
        return true;
    }

    @Override
    protected void cby() {
    }

    @Override
    protected void dTZ() {
    }

    @Override
    protected fzo_0 dUa() {
        return fzo_0.tHt;
    }

    @Override
    protected fzo_0 dUb() {
        return fzo_0.tHu;
    }

    @Override
    protected fzo_0 dUc() {
        return fzo_0.tHv;
    }

    @Override
    protected boolean dUd() {
        return true;
    }

    @Override
    protected boolean dUe() {
        return false;
    }

    @Override
    protected boolean d(@NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        fhq_0 fhq_02 = fhk_0.c(ffV2, this.jWp);
        return fhq_02 == fhq_0.sqk || fhq_02 == fhq_0.sqt;
    }

    @Override
    protected void a(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        String string = aum_0.cWf().c(bfi_1.a(fhk_0.c(ffV2, this.jWp)), new Object[0]);
        byj_1.epo().a(byc_1.c(byh_1.lAA, string));
    }

    @Override
    protected void b(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        if (this.jWp.bfd() == 1 && this.jWo.fXq()) {
            this.dTY();
        }
        fcv_1 fcv_12 = fbj_1.getInstance().getMouseOver().getParentOfType(fcv_1.class);
        fiq_2.gCw().d(fik_2.a(string -> {
            this.jWo.z(this.jWp.LV(), ffV2.LV());
            cfe_1.addRollElementsParticleToContainer(fcv_12);
        }).l(bfi_1.a(fhk_0.c(ffV2, this.jWp)), new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
    }

    @Override
    public bgf_2 dUf() {
        return bgf_2.jWg;
    }
}

