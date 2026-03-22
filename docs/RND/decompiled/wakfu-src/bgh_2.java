/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGH
 */
public class bgh_2
extends bga_2 {
    @NotNull
    private final bfd_1 jWm;
    @NotNull
    private final ffV jWn;

    public bgh_2(@NotNull bfd_1 bfd_12, @NotNull ffV ffV2) {
        this.jWm = bfd_12;
        this.jWn = ffV2;
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
        if (ffV2.fWi().fZn().aIi() != 109) {
            return false;
        }
        if (!ekj_0.cc(ffV2)) {
            return false;
        }
        return !this.jWm.a(bgt_02, bgh_2.aZ(ffV2));
    }

    private static fhc_0 aZ(ffV ffV2) {
        if (ffV2.fUX() == 0) {
            return ffV2.dOg();
        }
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(ffV2.fUX());
        if (bgv_22 == null) {
            return ffV2.dOg();
        }
        return bgv_22;
    }

    @Override
    protected void a(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        String string = this.jWm.a(bgt_02, bgh_2.aZ(ffV2)) ? aum_0.cWf().c("account.mimiSymbic.error.known", aPe.yU(ffV2.avr())) : aum_0.cWf().c("account.mimiSymbic.error.uneligible", new Object[0]);
        byj_1.epo().a(byc_1.c(byh_1.lAA, string));
    }

    @Override
    protected void b(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        fcv_1 fcv_12 = fbj_1.getInstance().getMouseOver().getParentOfType(fcv_1.class);
        fiq_2.gCw().d(fik_2.a(string -> {
            this.jWm.y(this.jWn.LV(), ffV2.LV());
            cfe_1.addRollElementsParticleToContainer(fcv_12);
            this.dTY();
        }).l("account.mimiSymbic.confirmation", ffV2.getName()).abQ(1).vG(ccp_2.mRE.byf()));
    }

    @Override
    public bgf_2 dUf() {
        return bgf_2.jWh;
    }
}

