/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from blN
 */
public class bln_0
implements aeh_2,
bem_0 {
    private static final String iwl = "collapsedView.cosmetic.%s";
    public static final String iwm = "categoryName";
    public static final String iwn = "categoryIcon";
    public static final String iwo = "categorySize";
    public static final String iwp = "isTitleCategory";
    public static final String iwq = "cosmetics";
    public static final String iwr = "collapsed";
    public static final String iws = "isSearching";
    public static final String[] iwt = new String[]{"categoryName", "categoryIcon", "categorySize", "isTitleCategory", "cosmetics", "collapsed", "isSearching"};
    private final fm_1 iwu;
    private final List<blP> iwv = new ArrayList<blP>();
    private final Map<Integer, blP> iww = new HashMap<Integer, blP>();
    private final Map<Integer, blP> iwx = new HashMap<Integer, blP>();
    private blP iwy;
    private List<blP> iwz;
    @Nullable
    private String hVA;
    @NotNull
    private blQ iwA = blQ.iwP;
    private final Map<Integer, Integer> iwB = new HashMap<Integer, Integer>();
    private final Map<Integer, String> iwC = new HashMap<Integer, String>();
    private boolean hFE;

    bln_0(fm_1 fm_12) {
        this.iwu = fm_12;
        this.dSJ().ifPresent(bl -> {
            this.hFE = bl;
        });
        this.hVA = null;
        this.dub();
    }

    public final void dub() {
        this.iwv.clear();
        this.iwv.addAll(this.I(bjf_1.b(this.iwu)));
        this.iww.clear();
        this.iwC.clear();
        int n = this.iwv.size();
        for (int i = 0; i < n; ++i) {
            blP blP2 = this.iwv.get(i);
            this.iww.put(blP2.dut(), blP2);
            blP2.dur().ifPresent(string -> this.iwC.put(blP2.dut(), (String)string));
        }
        this.duc();
        this.dud();
        this.dui();
    }

    public void H(List<Integer> list) {
        List<? extends blP> list2 = this.I(list);
        this.iwv.addAll(list2);
        for (blP blP2 : list2) {
            this.iww.put(blP2.dut(), blP2);
            blP2.dur().ifPresent(string -> this.iwC.put(blP2.dut(), (String)string));
        }
        this.duc();
        this.dud();
        this.dui();
    }

    @NotNull
    private List<? extends blP> I(List<Integer> list) {
        List<blP> list2 = this.iwu != fm_1.pA ? list.stream().map(n -> new blP(this.iwu, (int)n)).filter(blP2 -> blP2.duo() != null).toList() : list.stream().map(n -> new bmj(n.shortValue())).filter(bmj::dvJ).toList();
        return list2;
    }

    private void duc() {
        this.iwB.clear();
        List<Integer> list = bjf_1.b(this.iwu);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            this.iwB.put(list.get(i), n - i);
        }
    }

    private void dud() {
        for (int n : bjf_1.d(this.iwu)) {
            blP blP2 = this.iww.get(n);
            if (blP2 == null) continue;
            blP2.gw(true);
        }
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "categoryName": {
                return bjf_1.g(this.iwu);
            }
            case "categoryIcon": {
                return bjf_1.e(this.iwu);
            }
            case "categorySize": {
                return this.iwz.size();
            }
            case "isTitleCategory": {
                return this.iwu == fm_1.pA;
            }
            case "cosmetics": {
                return this.iwz;
            }
            case "collapsed": {
                return this.hFE;
            }
            case "isSearching": {
                return this.hVA != null;
            }
        }
        return null;
    }

    public @Unmodifiable List<blP> due() {
        return Collections.unmodifiableList(this.iwv);
    }

    public Optional<blP> DH(int n) {
        return Optional.ofNullable(this.iww.get(n));
    }

    public fm_1 duf() {
        return this.iwu;
    }

    public void DI(int n) {
        if (this.iwx.containsKey(n)) {
            return;
        }
        if (!ekj_0.z(this.iwu)) {
            this.dug();
        }
        blP blP2 = this.iww.get(n);
        blP2.T(true);
        this.iwx.put(n, blP2);
    }

    public void DJ(int n) {
        if (!this.iwx.containsKey(n)) {
            return;
        }
        blP blP2 = this.iww.get(n);
        blP2.T(false);
        this.iwx.remove(n);
    }

    public void J(@Nullable List<ekp_0> list) {
        this.dug();
        if (list == null) {
            return;
        }
        for (ekp_0 ekp_02 : list) {
            int n = ekp_02.AK();
            blP blP2 = this.iww.get(n);
            if (blP2 == null) continue;
            blP2.T(true);
            this.iwx.put(n, blP2);
        }
    }

    private void dug() {
        this.iwx.forEach((n, blP2) -> blP2.T(false));
        this.iwx.clear();
    }

    public void y(@Nullable Integer n) {
        blP blP2 = this.iww.get(n);
        if (this.iwy == null && blP2 == null) {
            return;
        }
        if (this.iwy != null && blP2 != null && this.iwy.dut() == blP2.dut()) {
            return;
        }
        if (this.iwy != null) {
            this.iwy.gv(false);
        }
        if (blP2 != null && bjf_1.a(this.iwu)) {
            blP2.gv(true);
        }
        this.iwy = blP2;
    }

    public void duh() {
        this.y(this.iwx.isEmpty() ? null : Integer.valueOf(this.iwx.values().stream().findAny().get().dut()));
    }

    void lW(@Nullable String string) {
        if (Objects.equals(this.hVA, string)) {
            return;
        }
        this.hVA = BH.aT(string);
        this.dui();
    }

    void a(@NotNull blQ blQ2) {
        if (this.iwA == blQ2) {
            return;
        }
        this.iwA = blQ2;
        this.duj();
    }

    private void dui() {
        if (this.hVA == null) {
            this.iwz = new ArrayList<blP>(this.iwv);
            this.duj();
            return;
        }
        this.iwz = this.iwv.stream().filter(blP2 -> this.iwC.getOrDefault(blP2.dut(), "").contains(this.hVA)).collect(Collectors.toList());
        if (!this.iwz.isEmpty()) {
            this.hFE = false;
        }
        this.duj();
    }

    private void duj() {
        Comparator<blP> comparator = switch (this.iwA) {
            case blQ.iwP -> this.dul();
            case blQ.iwQ -> this.dul().reversed();
            case blQ.iwR -> this.duk();
            case blQ.iwS -> this.duk().reversed();
            case blQ.iwT -> this.iwu == fm_1.pA ? this.dum() : null;
            case blQ.iwU -> this.iwu == fm_1.pA ? this.dum().reversed() : null;
            default -> null;
        };
        if (comparator != null) {
            this.iwz.sort(comparator);
        }
        this.u(iwq, iwo, iws, iwr);
    }

    private Comparator<blP> duk() {
        return Comparator.comparing(blP2 -> this.iwC.getOrDefault(blP2.dut(), ""));
    }

    private Comparator<blP> dul() {
        return Comparator.comparingInt(blP2 -> this.iwB.getOrDefault(blP2.dut(), Integer.MAX_VALUE));
    }

    private Comparator<blP> dum() {
        return Comparator.comparingInt(blP2 -> {
            byo_2 byo_22 = byp_2.lyZ.JE(blP2.dut());
            if (byo_22 != null) {
                return byo_22.egk().fWK();
            }
            return Integer.MAX_VALUE;
        });
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        this.u(iwr);
        this.dSK();
    }

    @Override
    public aeb_1 bCh() {
        return ((bsg_1)aie_0.cfn().bmH()).b(afh.cpU);
    }

    @Override
    public String dbL() {
        return String.format(iwl, this.iwu.getNumber());
    }

    @Override
    public String[] bxk() {
        return iwt;
    }

    public String toString() {
        return "CosmeticCategoryView{m_type=" + String.valueOf((Object)this.iwu) + "}";
    }
}

