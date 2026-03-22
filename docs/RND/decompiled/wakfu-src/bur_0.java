/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bur
 */
public class bur_0
implements aeh_2,
bdz_0 {
    public static final String jpe = "furnitureList";
    public static final String jpf = "furnitureCategoryName";
    public static final String jpg = "furnitureCompletion";
    public static final String jph = "collapsed";
    public static final String jpi = "visible";
    private static final String[] jpj = new String[]{"collapsed", "furnitureList", "furnitureCategoryName", "visible"};
    @NotNull
    private final List<buw_0> jpk = new ArrayList<buw_0>();
    @Nullable
    private List<buw_0> jpl;
    private final buu_0 jpm;
    private boolean hFE;

    public bur_0(buu_0 buu_02, List<buw_0> list) {
        this.jpm = buu_02;
        this.jpk.addAll(list);
        this.hFE = true;
    }

    @Override
    public String[] bxk() {
        return jpj;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jpe)) {
            return this.jpl != null ? this.jpl : this.jpk;
        }
        if (string.equals(jpf)) {
            return aum_0.cWf().a(158, (long)this.jpm.aHp(), new Object[0]);
        }
        if (string.equals(jpg)) {
            if (this.jpl != null) {
                return this.jpl.size();
            }
            int n = this.dIV().aHp();
            int n2 = n == -1 ? fdb.fSX().fSZ() : fdb.fSX().Uh(n);
            return this.jpk.size() + "/" + n2;
        }
        if (string.equals(jph)) {
            return this.hFE;
        }
        if (string.equals(jpi)) {
            return this.jpl == null || !this.jpl.isEmpty();
        }
        return null;
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, jph);
    }

    public int cnG() {
        return this.jpm.cnG();
    }

    public buu_0 dIV() {
        return this.jpm;
    }

    public void a(buw_0 buw_02) {
        this.jpk.add(buw_02);
        fse_1.gFu().a((aef_2)this, jpe, jpg);
    }

    public void mq(@Nullable String string) {
        if (string == null || string.isBlank()) {
            this.jpl = null;
        } else {
            this.jpl = this.jpk.stream().filter(buw_02 -> buw_02.dah().contains(string)).toList();
            if (!this.jpl.isEmpty()) {
                this.hFE = false;
            }
        }
        fse_1.gFu().a((aef_2)this, jpe, jpg, jpi, jph);
    }
}

