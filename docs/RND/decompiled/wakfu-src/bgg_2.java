/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGG
 */
public class bgg_2
extends bga_2 {
    @Override
    protected boolean G(@NotNull bgt_0 bgt_02) {
        return !bgt_02.djT();
    }

    @Override
    protected void cby() {
    }

    @Override
    protected void dTZ() {
    }

    @Override
    protected fzo_0 dUa() {
        return fzo_0.tHF;
    }

    @Override
    protected fzo_0 dUb() {
        return fzo_0.tHG;
    }

    @Override
    protected fzo_0 dUc() {
        return fzo_0.tHH;
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
        return true;
    }

    @Override
    protected void a(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
    }

    @Override
    protected void b(@NotNull flp_2 flp_22, @NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        bgt_02.dno().te(ffV2.LV()).ifPresent(ffs_02 -> bgg_2.e(bgt_02, ffV2));
    }

    public static void e(@NotNull bgt_0 bgt_02, @NotNull ffV ffV2) {
        boolean bl = bdq_0.dRC().ab(ffV2);
        boolean bl2 = !bl;
        bdq_0.dRC().b(ffV2.LV(), bl2);
        clq_0 clq_02 = new clq_0(bgt_02.Sn(), bl2);
        clq_02.no(ffV2.LV());
        aue_0.cVJ().etu().d(clq_02);
        fse_1.gFu().a((aef_2)ffV2, "isLocked");
    }

    @Override
    public bgf_2 dUf() {
        return bgf_2.jWj;
    }
}

