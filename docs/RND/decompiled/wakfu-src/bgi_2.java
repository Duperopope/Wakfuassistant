/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGI
 */
public class bgi_2
extends bga_2 {
    @Override
    protected boolean G(@NotNull bgt_0 bgt_02) {
        return !bgt_02.djT() && !fug_0.fQ(bgt_02.fhv());
    }

    @Override
    protected void cby() {
        cvo_2.eUK().j("recycleInventory", true);
        fse_1.gFu().b("recycleInventory", true, "temporaryTransferInventoryDialog");
    }

    @Override
    protected void dTZ() {
        cvo_2.eUK().j("recycleInventory", false);
        fse_1.gFu().b("recycleInventory", (Object)null, "temporaryTransferInventoryDialog");
    }

    @Override
    protected fzo_0 dUa() {
        return fzo_0.tHw;
    }

    @Override
    protected fzo_0 dUb() {
        return fzo_0.tHx;
    }

    @Override
    protected fzo_0 dUc() {
        return fzo_0.tHy;
    }

    @Override
    protected boolean dUd() {
        return false;
    }

    @Override
    protected boolean dUe() {
        return true;
    }

    @Override
    protected boolean d(@NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        return fhB.f(ffV2, bgt_02) == fhA.soV && !bdq_0.dRC().ab(ffV2);
    }

    @Override
    protected void a(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        if (bdq_0.dRC().ab(ffV2)) {
            String string = aum_0.cWf().c("inventory.recycle.locked.item", new Object[0]);
            byj_1.epo().a(byc_1.c(byh_1.lAA, string));
        }
    }

    @Override
    protected void b(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        fyd_0.closePopup(null);
        if (!flp_22.gDT() && bdr_0.ae(ffV2)) {
            bdr_0.a(bdr_0.b(bgt_02, List.of(ffV2)), () -> bgi_2.f(bgt_02, ffV2));
        } else {
            bgi_2.f(bgt_02, ffV2);
        }
    }

    private static void f(@NotNull bgt_0 bgt_02, ffV ffV2) {
        if (ffV2.adO()) {
            cxx_1.eXf().bS(ffV2);
        }
        if (((feh_0)bgt_02.a(fez_0.seq)).bt(ffV2)) {
            csu csu2 = new csu(bgt_02.Sn(), ffV2.LV());
            aue_0.cVJ().etu().d(csu2);
        } else {
            ciY ciY2 = new ciY(ffV2.LV());
            aue_0.cVJ().etu().d(ciY2);
        }
        cvo_2.eUK().j("itemDetail", null);
        fse_1.gFu().b("pet", null, (Object)"inventoryDialog");
        fse_1.gFu().b("itemDetail", (Object)null, "temporaryTransferInventoryDialog");
    }

    @Override
    public bgf_2 dUf() {
        return bgf_2.jWf;
    }
}

