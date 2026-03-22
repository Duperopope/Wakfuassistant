/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpw
 */
public class bpw_0
implements aeh_2 {
    public static final String iVM = "currentPanel";
    public static final String iVN = "content";
    public static final String iVO = "displayLootCriteria";
    public static final String iVP = "displayTranslations";
    public static final String[] iVQ = new String[]{"currentPanel", "content", "displayLootCriteria", "displayTranslations"};
    @NotNull
    private bpr_1 iVR = bpr_1.iVm;
    private final Map<bpr_1, bpx_0> iVS = new EnumMap<bpr_1, bpx_0>(bpr_1.class);

    public void bkZ() {
        this.iVS.put(bpr_1.iVl, new bpz_0());
        this.iVS.put(bpr_1.iVm, new bpy_0());
        this.iVS.put(bpr_1.iVn, new bpa_1());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iVM -> this.iVR.d();
            case iVN -> this.iVS.get((Object)this.iVR);
            case iVO -> ewo_0.oBF.k(ewr_0.oGm);
            case iVP -> Mv.aVA.stream().filter(mv -> mv != aum_0.cWf().aUXX()).anyMatch(ewo_0::z);
            default -> null;
        };
    }

    public void b(@NotNull bpr_1 bpr_12) {
        if (this.iVR == bpr_12) {
            return;
        }
        this.iVR = bpr_12;
        this.u(iVM, iVN);
    }

    public bpx_0 dCV() {
        return this.iVS.get((Object)this.iVR);
    }

    public bqp_1 dCW() {
        bqp_1 bqp_12 = new bqp_1();
        bqp_12.b(this.iVR);
        this.iVS.forEach((bpr_12, bpx_02) -> bqp_12.a((bpr_1)((Object)bpr_12), bpx_02.dDd()));
        bqp_12.a((bpg_1)fse_1.gFu().vY("encyclopediaOpenMonster"));
        return bqp_12;
    }

    public void a(@NotNull bqp_1 bqp_12) {
        this.iVR = bqp_12.dEh();
        this.iVS.forEach((bpr_12, bpx_02) -> bpx_02.a(bqp_12.d((bpr_1)((Object)bpr_12))));
        this.u(iVM, iVN);
        fse_1.gFu().f("encyclopediaOpenMonster", bqp_12.dEi());
    }

    @Override
    public String[] bxk() {
        return iVQ;
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }
}

