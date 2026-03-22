/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bGi
 */
public class bgi_1
implements aeh_2 {
    public static final String jUD = "rarities";
    public static final String jUE = "isSearching";
    public static final String jUF = "selectedCategoryValue";
    public static final String jUG = "isQuest";
    public static final String jUH = "itemNameFilter";
    public static final String jUI = "minItemLevelFilter";
    public static final String jUJ = "maxItemLevelFilter";
    public static final String jUK = "slotCountFilterSelected";
    public static final String jUL = "selectedLearnedFilterValue";
    public static final String jUM = "currentInventoryView";
    public static final String[] jUN = new String[]{"rarities", "isSearching", "selectedCategoryValue", "isQuest", "itemNameFilter", "minItemLevelFilter", "maxItemLevelFilter", "slotCountFilterSelected", "selectedLearnedFilterValue", "currentInventoryView"};
    private final @Unmodifiable List<bil_1> jUO = bil_1.a(new fgj[0]);
    @NotNull
    private bdl_0 jUP;
    private final Map<buh_0, bug_0<ffV>> jUQ = new EnumMap<buh_0, bug_0<ffV>>(buh_0.class);
    @Nullable
    private bgz_1<bgj_1> jUR;

    public bgi_1(@NotNull bdl_0 bdl_02) {
        this.jUP = bdl_02;
    }

    public void a(@NotNull bdl_0 bdl_02) {
        this.jUP = bdl_02;
        this.hE(this.dTJ());
        this.dTL();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        Object object;
        String string2 = string;
        int n = 0;
        block12: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jUD, jUE, jUF, jUG, jUH, jUI, jUJ, String.class, jUL, jUM}, (Object)string2, n)) {
                case 0: {
                    object = this.jUO;
                    break block12;
                }
                case 1: {
                    object = this.dTI();
                    break block12;
                }
                case 2: {
                    object = this.dTC();
                    break block12;
                }
                case 3: {
                    object = !this.dTJ();
                    break block12;
                }
                case 4: {
                    object = this.dTF();
                    break block12;
                }
                case 5: {
                    object = this.dTD();
                    break block12;
                }
                case 6: {
                    object = this.dTE();
                    break block12;
                }
                case 7: {
                    String string3 = string2;
                    if (!string3.startsWith(jUK)) {
                        n = 8;
                        continue block12;
                    }
                    object = this.mH(string.substring(jUK.length()));
                    break block12;
                }
                case 8: {
                    object = this.dTG();
                    break block12;
                }
                case 9: {
                    object = this.dTH();
                    break block12;
                }
                default: {
                    object = null;
                    break block12;
                }
            }
            break;
        }
        return object;
    }

    @NotNull
    private Integer dTC() {
        return this.b(buh_0.joE).map(bgl_1::dTO).map(bgk_1::d).orElse(bgk_1.jUU.d());
    }

    private boolean mH(String string) {
        int n = Integer.parseInt(string);
        Optional<bet_1> optional = this.b(buh_0.joF);
        return optional.map(bet_12 -> bet_12.dSj().contains(n)).orElse(false);
    }

    @Nullable
    private String dTD() {
        return this.b(buh_0.jou).map(bui_0::dIO).map(Object::toString).orElse(null);
    }

    @Nullable
    private String dTE() {
        return this.b(buh_0.jou).map(bui_0::dIP).map(Object::toString).orElse(null);
    }

    @Nullable
    private String dTF() {
        return this.b(buh_0.jot).map(buj_0::dIR).orElse(null);
    }

    private int dTG() {
        return this.b(buh_0.joG).map(bEk::dRZ).map(bl -> bl != false ? 1 : 2).orElse(0);
    }

    @NotNull
    private bgz_1<?> dTH() {
        if (this.dTI()) {
            return this.jUR != null ? this.jUR : new bgz_1(List.of());
        }
        return this.jUP.hy(this.dTJ());
    }

    public boolean dTI() {
        if (this.dTJ()) {
            return !this.jUQ.isEmpty();
        }
        return this.jUQ.size() > 1;
    }

    public boolean dTJ() {
        return this.b(buh_0.joE).map(bgl_12 -> bgl_12.dTO().dTJ()).orElse(true);
    }

    public void dTK() {
        this.jUQ.clear();
        this.jUO.forEach(bil_12 -> bil_12.gQ(false));
        this.hE(true);
        this.dTL();
    }

    public void a(bug_0<ffV> bug_02) {
        this.jUQ.remove((Object)bug_02.dcz());
        if (bug_02.isValid()) {
            this.jUQ.put(bug_02.dcz(), bug_02);
        }
        this.hE(this.dTJ());
        fse_1.gFu().a((aef_2)this, jUE, jUG, jUM);
    }

    public boolean L(ffV ffV2) {
        for (bug_0<ffV> bug_02 : this.jUQ.values()) {
            if (bug_02.ah(ffV2)) continue;
            return false;
        }
        return true;
    }

    public void hE(boolean bl) {
        if (bl != this.dTJ()) {
            return;
        }
        this.jUR = null;
        if (this.dTI()) {
            bgz_1<? extends bDy> bgz_12 = this.jUP.hy(this.dTJ());
            int n = bgz_12.dTW();
            ArrayList<fgf_0> arrayList = new ArrayList<fgf_0>(n);
            HashMap<fgf_0, bDy> hashMap = new HashMap<fgf_0, bDy>(n);
            bgz_12.f(bDy2 -> bDy2.j(fgf_02 -> {
                if (this.L(fgf_02.getItem())) {
                    arrayList.add((fgf_0)fgf_02);
                    hashMap.put((fgf_0)fgf_02, (bDy)bDy2);
                }
            }));
            this.jUR = new bgz_1<bgj_1>(List.of(new bgj_1(arrayList, hashMap)));
        }
        fse_1.gFu().a((aef_2)this, jUM);
    }

    public <T extends bug_0<ffV>> Optional<T> b(buh_0 buh_02) {
        return Optional.ofNullable(this.jUQ.get((Object)buh_02));
    }

    public void dTL() {
        fse_1.gFu().a((aef_2)this, jUN);
    }

    public OptionalInt lm(long l) {
        bgz_1<?> bgz_12 = this.dTH();
        int n = 0;
        for (bDy bDy2 : bgz_12.dcb()) {
            if (bDy2 == null) continue;
            OptionalInt optionalInt = bDy2.lb(l);
            if (optionalInt.isPresent()) {
                return OptionalInt.of(n + optionalInt.getAsInt());
            }
            n += bDy2.bTg();
        }
        return OptionalInt.empty();
    }

    public OptionalLong GB(int n) {
        bgz_1<?> bgz_12 = this.dTH();
        int n2 = 0;
        for (bDy bDy2 : bgz_12.dcb()) {
            if (bDy2 == null) continue;
            if (n < n2 + bDy2.bTg()) {
                return bDy2.Gk(n - n2);
            }
            n2 += bDy2.bTg();
        }
        return OptionalLong.empty();
    }

    public int dTM() {
        int n = 0;
        for (bDy bDy2 : this.dTH().dcb()) {
            if (bDy2 == null) continue;
            n += bDy2.bTg();
        }
        return n;
    }

    public long KU() {
        return this.jUP.KU();
    }

    @Override
    public String[] bxk() {
        return jUN;
    }
}

