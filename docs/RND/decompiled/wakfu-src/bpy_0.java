/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpy
 */
public class bpy_0
extends bpx_0 {
    public static final String iWh = "rarities";
    public static final String iWi = "acquisitions";
    public static final String iWj = "equipmentPositions";
    public static final String iWk = "characteristicsGroups";
    public static final String[] iWl = (String[])ArrayUtils.addAll((Object[])bpx_0.iWa, (Object[])new String[]{"rarities", "acquisitions", "equipmentPositions", "characteristicsGroups"});
    public static final List<ffS> iWm = List.of(ffS.sgB, ffS.sgO, ffS.sgF, ffS.sgE, ffS.sgG, ffS.sgL, ffS.sgI, ffS.sgN, ffS.sgR, ffS.sgQ, ffS.sgS, ffS.sgZ, ffS.sgX);
    private final List<bil_1> iWn = bil_1.a(new fgj[0]);
    private final List<bqj_1> iWo;
    private final List<ben_0> iWp = ben_0.V(iWm);
    private final List<bhe_1> iWq = bhe_1.dWP();

    public bpy_0() {
        super(bpr_1.iVm);
        this.iWo = bqj_1.a(bpy_0.dDe());
    }

    private static bpr_0[] dDe() {
        if (bjt_0.eaK().eaL()) {
            return new bpr_0[]{bpr_0.iYk};
        }
        return new bpr_0[]{bpr_0.iYg, bpr_0.iYk};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iWh -> this.iWn;
            case iWi -> this.iWo;
            case iWj -> this.iWp;
            case iWk -> this.iWq;
            default -> super.eu(string);
        };
    }

    @Override
    public void gO(boolean bl) {
        this.iWn.forEach(bil_12 -> bil_12.gQ(false));
        this.iWp.forEach(ben_02 -> ben_02.gQ(false));
        this.iWq.forEach(bhe_12 -> bhe_12.dWR().forEach(bhc_1::reset));
        this.iWo.forEach(bqj_12 -> bqj_12.gQ(false));
        super.gO(bl);
    }

    @Override
    protected void dCX() {
        EnumSet enumSet = this.b(buh_0.jov).map(bpV::dDQ).orElseGet(() -> EnumSet.noneOf(fgj.class));
        for (bil_1 object22 : this.iWn) {
            object22.gQ(enumSet.contains(object22.dxF()));
        }
        EnumSet enumSet2 = this.b(buh_0.jow).map(bpq_0::dDI).orElseGet(() -> EnumSet.noneOf(ffS.class));
        for (ben_0 ben_02 : this.iWp) {
            ben_02.gQ(enumSet2.contains(ben_02.dSL()));
        }
        EnumMap enumMap = this.b(buh_0.joH).map(bpl_0::dDE).orElseGet(() -> new EnumMap(fja.class));
        for (bhe_1 bhe_12 : this.iWq) {
            bhe_12.dWR().forEach(bhc_12 -> {
                Integer n;
                Integer n2;
                bpm_0 bpm_02 = (bpm_0)enumMap.get((Object)bhc_12.dWK());
                if (bpm_02 == null) {
                    n2 = null;
                    n = null;
                } else {
                    n2 = bpm_02.aVh() == Long.MIN_VALUE ? null : Integer.valueOf((int)bpm_02.aVh());
                    n = bpm_02.aVg() == Long.MAX_VALUE ? null : Integer.valueOf((int)bpm_02.aVg());
                }
                bhc_12.c(n2, n);
            });
        }
        EnumSet enumSet3 = this.b(buh_0.joI).map(bps_1::dDM).orElseGet(() -> EnumSet.noneOf(bpr_0.class));
        for (bqj_1 bqj_12 : this.iWo) {
            bqj_12.gQ(enumSet3.contains((Object)bqj_12.dDr()));
        }
    }

    @Override
    public String[] bxk() {
        return iWl;
    }
}

