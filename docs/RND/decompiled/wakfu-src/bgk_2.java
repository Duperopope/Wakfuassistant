/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGK
 */
public class bgk_2
extends bga_2 {
    private final long jWq;

    public bgk_2(long l) {
        this.jWq = l;
    }

    @Override
    protected boolean G(@NotNull bgt_0 bgt_02) {
        return !fug_0.fP(bgt_02.fhv()) && fcL.rUh.sv(this.jWq);
    }

    @Override
    protected void cby() {
    }

    @Override
    protected void dTZ() {
    }

    @Override
    protected fzo_0 dUa() {
        return fzo_0.tHI;
    }

    @Override
    protected fzo_0 dUb() {
        return fzo_0.tHJ;
    }

    @Override
    protected fzo_0 dUc() {
        return fzo_0.tHK;
    }

    @Override
    protected boolean dUd() {
        return false;
    }

    @Override
    protected boolean dUe() {
        return false;
    }

    @Override
    protected boolean d(@NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        if (this.jWq == bgt_02.Sn()) {
            return false;
        }
        return cvu_1.b(bgt_02, ffV2) && this.ba(ffV2) && !bdq_0.dRC().ab(ffV2);
    }

    @Override
    protected void a(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        String string = this.jWq == bgt_02.Sn() ? "item.already.in.bags" : (!cvu_1.b(bgt_02, ffV2) ? "item.error.badBind" : (bdq_0.dRC().ab(ffV2) ? "inventory.transfer.locked.item" : "inventory.transfer.desination.full.short"));
        String string2 = aum_0.cWf().c(string, new Object[0]);
        byj_1.epo().a(byc_1.c(byh_1.lAA, string2));
    }

    private boolean ba(@NotNull ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.jWq);
        if (bgt_02 == null) {
            return false;
        }
        return bgt_02.dno().ba(ffV2);
    }

    @Override
    protected void b(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        fyd_0.closePopup(null);
        cls_0 cls_02 = new cls_0(bgt_02.Sn(), this.jWq, ffV2.LV());
        aue_0.cVJ().etu().d(cls_02);
    }

    @Override
    public bgf_2 dUf() {
        return bgf_2.jWi;
    }
}

