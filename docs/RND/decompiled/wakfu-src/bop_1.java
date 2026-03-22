/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from boP
 */
public class bop_1
implements aeh_2 {
    public static final String iSZ = "items";
    public static final String iTa = "itemsTotalCount";
    public static final String iTb = "rarities";
    public static final String iTc = "hasFilterOtherThanName";
    public static final String iTd = "nameFilter";
    public static final String iTe = "equippedFilter";
    public static final String iTf = "identificationFilter";
    public static final String iTg = "shardsFilter";
    public static final String iTh = "sublimationsFilter";
    public static final String[] iTi = new String[]{"items", "itemsTotalCount", "rarities", "hasFilterOtherThanName", "nameFilter", "equippedFilter", "identificationFilter", "shardsFilter", "sublimationsFilter"};
    public static final String[] iTj = new String[]{"nameFilter", "equippedFilter", "identificationFilter", "shardsFilter", "sublimationsFilter"};
    private final @Unmodifiable List<bil_1> iTk = bil_1.a(new fgj[0]);
    @Nullable
    private final Runnable iTl;
    private final List<ffV> iTm = new ArrayList<ffV>();
    protected final List<ffV> iTn = new ArrayList<ffV>();
    @NotNull
    protected fhw_0 iTo;
    private final Map<buh_0, bug_0<ffV>> iTp = new EnumMap<buh_0, bug_0<ffV>>(buh_0.class);

    public bop_1(@Nullable Runnable runnable) {
        this(fhw_0.sqP, runnable);
    }

    bop_1(@NotNull fhw_0 fhw_02, @Nullable Runnable runnable) {
        this.iTo = fhw_02;
        this.iTl = runnable;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iSZ -> this.iTn;
            case iTa -> "(" + this.iTn.stream().mapToInt(ffV::bfd).sum() + ")";
            case iTb -> this.iTk;
            case iTc -> {
                for (buh_0 var5_5 : this.iTp.keySet()) {
                    if (var5_5 == buh_0.jot) continue;
                    yield true;
                }
                yield false;
            }
            case iTd -> this.b(buh_0.jot).map(bum_0::dCm).orElse(null);
            case iTe -> this.b(buh_0.joL).map(bos_1::dCi).map(Enum::ordinal).orElse(0);
            case iTf -> this.e(buh_0.joK);
            case iTg -> this.e(buh_0.joM);
            case iTh -> this.e(buh_0.joN);
            default -> null;
        };
    }

    public void a(@NotNull bop_1 bop_12) {
        this.iTp.clear();
        this.iTp.putAll(bop_12.iTp);
        for (int i = 0; i < this.iTk.size(); ++i) {
            this.iTk.get(i).setSelected(bop_12.iTk.get(i).bqr());
        }
    }

    public void dCb() {
        this.iTm.clear();
        fcI.a(bbs_2.xl(), (exP2, ffV2, bl) -> {
            if (!this.a(ffV2, bl)) {
                return true;
            }
            this.iTm.add(ffV2);
            return true;
        });
        if (this.dCc()) {
            blq_1.q((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                if (!this.a((ffV)ffV2, true)) {
                    return true;
                }
                this.iTm.add((ffV)ffV2);
                return true;
            }));
        }
        this.dCd();
    }

    protected boolean dCc() {
        return true;
    }

    protected boolean a(ffV ffV2, boolean bl) {
        return bop_1.E(ffV2);
    }

    public static boolean E(ffV ffV2) {
        if (!ffV2.dOg().fbT()) {
            return false;
        }
        fgj fgj2 = ffV2.dwg();
        boolean bl = fgj2 == fgj.siF || fgj2 == fgj.siH;
        return ffV2.dOg().cpA() > 0 || bl;
    }

    public boolean F(ffV ffV2) {
        for (ffV ffV3 : this.iTm) {
            if (ffV3.LV() != ffV2.LV()) continue;
            return true;
        }
        return false;
    }

    public boolean G(ffV ffV2) {
        for (ffV ffV3 : this.iTn) {
            if (ffV3.LV() != ffV2.LV()) continue;
            return true;
        }
        return false;
    }

    public void H(@NotNull ffV ffV2) {
        int n = this.iTm.size();
        for (int i = 0; i < n; ++i) {
            ffV ffV3 = this.iTm.get(i);
            if (ffV3.LV() != ffV2.LV() || ffV3 == ffV2) continue;
            this.iTm.set(i, ffV2);
            this.dCd();
            break;
        }
    }

    public void cUQ() {
        this.iTp.clear();
        this.iTk.forEach(bil_12 -> bil_12.gQ(false));
        this.dCd();
        fse_1.gFu().a((aef_2)this, iTj);
    }

    public void a(@NotNull bug_0<ffV> bug_02) {
        this.iTp.remove((Object)bug_02.dcz());
        if (bug_02.isValid()) {
            this.iTp.put(bug_02.dcz(), bug_02);
        }
        this.dCd();
    }

    public void a(@NotNull fhw_0 fhw_02) {
        this.iTo = fhw_02;
        this.dCd();
    }

    public void dCd() {
        this.iTn.clear();
        if (this.iTp.isEmpty()) {
            this.iTn.addAll(this.iTm);
        } else {
            this.iTn.addAll(this.iTm.stream().filter(this::I).toList());
        }
        this.iTn.sort(this.iTo.dcC());
        fse_1.gFu().a((aef_2)this, iSZ, iTa, iTc);
        if (this.iTl != null) {
            this.iTl.run();
        }
    }

    private boolean I(ffV ffV2) {
        for (bug_0<ffV> bug_02 : this.iTp.values()) {
            if (bug_02.ah(ffV2)) continue;
            return false;
        }
        return true;
    }

    public <T extends bug_0<ffV>> Optional<T> b(buh_0 buh_02) {
        return Optional.ofNullable(this.iTp.get((Object)buh_02));
    }

    private int e(buh_0 buh_02) {
        return this.b(buh_02).map(bun_0::dIS).map(bl -> bl != false ? 1 : 2).orElse(0);
    }

    @Override
    public String[] bxk() {
        return iTi;
    }
}

