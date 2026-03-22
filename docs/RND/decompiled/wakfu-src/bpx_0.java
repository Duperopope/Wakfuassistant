/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpx
 */
public abstract class bpx_0
implements aeh_2 {
    public static final String iVT = "pagination";
    public static final String iVU = "results";
    public static final String iVV = "sorts";
    public static final String iVW = "FilterCollapsed";
    public static final String iVX = "nameFilter";
    public static final String iVY = "minLevelFilter";
    public static final String iVZ = "maxLevelFilter";
    public static final String[] iWa = new String[]{"pagination", "results", "sorts", "nameFilter", "minLevelFilter", "maxLevelFilter"};
    @NotNull
    private final bpr_1 iWb;
    @NotNull
    private final bpp_1 iWc;
    @NotNull
    private bps_0 iVH;
    @NotNull
    private final List<bpt_0> iWd;
    private final Map<buh_0, Boolean> iWe = new EnumMap<buh_0, Boolean>(buh_0.class);
    private final Map<buh_0, bug_0<bpb_1>> iWf = new EnumMap<buh_0, bug_0<bpb_1>>(buh_0.class);
    @NotNull
    private List<bpb_1> iWg;

    protected bpx_0(@NotNull bpr_1 bpr_12) {
        this.iWb = bpr_12;
        this.iWc = new bpp_1(this.dDc());
        this.iVH = bps_0.iVz;
        this.iWg = Collections.emptyList();
        this.iWd = bpx_0.c(bpr_12);
        this.dDa();
    }

    protected abstract void dCX();

    @NotNull
    private static List<bpt_0> c(@NotNull bpr_1 bpr_12) {
        ArrayList<bpt_0> arrayList = new ArrayList<bpt_0>(bps_0.iVy.length);
        for (bps_0 bps_02 : bps_0.iVy) {
            if (!bps_02.a(bpr_12)) continue;
            bpt_0 bpt_02 = new bpt_0(bps_02);
            bpt_02.a(bps_0.iVz);
            arrayList.add(bpt_02);
        }
        return arrayList;
    }

    @NotNull
    public bpr_1 dCY() {
        return this.iWb;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        Object object;
        String string2 = string;
        Objects.requireNonNull(string2);
        String string3 = string2;
        int n = 0;
        block9: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iVT, iVU, iVV, String.class, iVX, iVY, iVZ}, (Object)string3, n)) {
                case 0: {
                    object = this.iWc;
                    break block9;
                }
                case 1: {
                    object = this.iWc.L(this.iWg);
                    break block9;
                }
                case 2: {
                    object = this.iWd;
                    break block9;
                }
                case 3: {
                    String string4 = string3;
                    if (!string.endsWith(iVW)) {
                        n = 4;
                        continue block9;
                    }
                    String string5 = string.substring(0, string.length() - iVW.length());
                    buh_0 buh_02 = buh_0.valueOf(string5.toUpperCase());
                    object = this.iWe.getOrDefault((Object)buh_02, false);
                    break block9;
                }
                case 4: {
                    object = this.b(buh_0.jot).map(bqg_0::dDG).orElse(null);
                    break block9;
                }
                case 5: {
                    object = this.b(buh_0.jou).map(bui_0::dIO).orElse(null);
                    break block9;
                }
                case 6: {
                    object = this.b(buh_0.jou).map(bui_0::dIP).orElse(null);
                    break block9;
                }
                default: {
                    object = null;
                    break block9;
                }
            }
            break;
        }
        return object;
    }

    public void a(bpq_1 bpq_12) {
        this.iWc.a(bpq_12);
        fse_1.gFu().a((aef_2)this, iVU);
    }

    public void f(buh_0 buh_02) {
        this.iWe.put(buh_02, this.iWe.getOrDefault((Object)buh_02, false) == false);
        fse_1.gFu().a((aef_2)this, String.valueOf((Object)buh_02) + iVW);
    }

    public void b(@NotNull bps_0 bps_02) {
        if (this.iVH == bps_02) {
            return;
        }
        this.iVH = bps_02;
        this.dCZ();
        this.dDa();
        fse_1.gFu().a((aef_2)this, iVU);
    }

    private void dCZ() {
        this.iWd.forEach(bpt_02 -> bpt_02.a(this.iVH));
    }

    public void a(@NotNull bug_0<bpb_1> bug_02) {
        boolean bl;
        bug_0<bpb_1> bug_03 = this.iWf.remove((Object)bug_02.dcz());
        if (bug_02.isValid()) {
            this.iWf.put(bug_02.dcz(), bug_02);
        }
        boolean bl2 = bug_03 == null ? bug_02.isValid() : (bl = !bug_02.equals(bug_03));
        if (bl) {
            this.dDa();
            fse_1.gFu().a((aef_2)this, iVU);
        }
    }

    public void gO(boolean bl) {
        this.iWf.clear();
        if (bl) {
            this.dDa();
        }
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public void c(bug_0<bpb_1> bug_02) {
        this.gO(false);
        this.a(bug_02);
    }

    private void dDa() {
        this.cUR();
        this.dDb();
    }

    private void cUR() {
        Collection<? extends bpb_1> collection = bpm_1.dCG().a(this.iWb, this.iVH);
        if (this.iWf.isEmpty()) {
            this.iWg = new ArrayList<bpb_1>(collection);
        } else {
            this.iWg = new ArrayList<bpb_1>(collection.size());
            for (bpb_1 bpb_12 : collection) {
                if (!this.a(bpb_12)) continue;
                this.iWg.add(bpb_12);
            }
        }
    }

    private void dDb() {
        this.iWc.Fb(this.iWg.size());
    }

    private boolean a(@NotNull bpb_1 bpb_12) {
        for (bug_0<bpb_1> bug_02 : this.iWf.values()) {
            if (bug_02.ah(bpb_12)) continue;
            return false;
        }
        return true;
    }

    public <T extends bug_0<bpb_1>> Optional<T> b(buh_0 buh_02) {
        return Optional.ofNullable(this.iWf.get((Object)buh_02));
    }

    private int dDc() {
        return 9;
    }

    public bqo_1 dDd() {
        bqo_1 bqo_12 = new bqo_1();
        bqo_12.BH(this.iWc.dfz());
        bqo_12.b(this.iVH);
        bqo_12.v(this.iWf);
        return bqo_12;
    }

    public void a(@NotNull bqo_1 bqo_12) {
        this.iVH = bqo_12.dCS();
        this.dCZ();
        this.iWf.clear();
        this.iWf.putAll(bqo_12.dEg());
        this.cUR();
        this.iWc.Fc(this.iWg.size());
        this.iWc.BH(bqo_12.dfz());
        this.dCX();
        fse_1.gFu().a((aef_2)this, this.bxk());
    }
}

