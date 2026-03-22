/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/*
 * Renamed from bcy
 */
public abstract class bcy_1
implements aeh_2,
bem_0 {
    private static final String hFm = "collapsedView.achievements.%s";
    public static final String hFn = "name";
    public static final String hFo = "categories";
    public static final String hFp = "allFilteredQuests";
    public static final String hFq = "achievements";
    public static final String hFr = "isHistory";
    public static final String hFs = "achievementsQuickList";
    public static final String hFt = "isCollapsed";
    public static final String hFu = "categoryId";
    public static final String hFv = "is2026SeasonMainCategory";
    public static final String hFw = "is2026SeasonSubCategory";
    public static final String hFx = "progressBarStyle";
    public static final String hFy = "iconStyle";
    public static final String hFz = "tokenItem";
    public static final String hFA = "isToken1Complete";
    public static final String hFB = "isToken2Complete";
    public static final String hFC = "isToken3Complete";
    private static final String hFD = "xpBarExperienceSmall";
    protected boolean hFE;
    protected int hFF;
    protected final long hFG;
    protected final bcd_2 hFH;

    protected bcy_1(long l) {
        this.hFG = l;
        this.hFH = bbw_2.hCq.je(l);
    }

    @Override
    public String[] bxk() {
        return new String[]{hFn, hFo, hFp, hFq, hFr, hFs, hFt, hFu};
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case hFn -> this.getName();
            case hFr -> this.dbG();
            case hFq -> this.dbI();
            case hFs -> this.dbF();
            case hFt -> this.hFE;
            case hFu -> this.d();
            case hFv -> bcn_1.Br(this.d());
            case hFw -> bcn_1.Bs(this.d());
            case hFx -> bcn_1.Bu(this.d()).orElse(hFD);
            case hFy -> bcn_1.Bv(this.d()).orElse(null);
            case hFz -> bcn_1.Bt(this.d()).map(bEm.dSb()::Vd).orElse(null);
            case hFA -> bcn_1.a(this.hFH, this.d(), 0);
            case hFB -> bcn_1.a(this.hFH, this.d(), 1);
            case hFC -> bcn_1.a(this.hFH, this.d(), 2);
            default -> null;
        };
    }

    public bci_1 dbD() {
        ArrayList<bci_1> arrayList = this.dbI();
        bci_1 bci_12 = (bci_1)fse_1.gFu().vY("selectedAchievement");
        if (bci_12 == null) {
            return null;
        }
        int n = arrayList.indexOf(bci_12) - 1;
        if (n < 0) {
            n = arrayList.size() - 1;
        }
        return arrayList.get(n);
    }

    public bci_1 dbE() {
        ArrayList<bci_1> arrayList = this.dbI();
        bci_1 bci_12 = (bci_1)fse_1.gFu().vY("selectedAchievement");
        if (bci_12 == null) {
            return null;
        }
        int n = arrayList.indexOf(bci_12) + 1;
        if (n > arrayList.size() - 1) {
            n = 0;
        }
        return arrayList.get(n);
    }

    public ArrayList<bci_1> dbF() {
        ArrayList<bci_1> arrayList = this.dbI();
        bci_1 bci_12 = (bci_1)fse_1.gFu().vY("selectedAchievement");
        if (bci_12 == null) {
            return null;
        }
        int n = arrayList.indexOf(bci_12);
        if (n == -1) {
            return null;
        }
        ArrayList<bci_1> arrayList2 = new ArrayList<bci_1>();
        int n2 = Math.min(3, arrayList.size());
        if (n2 < 1) {
            return null;
        }
        for (int i = n - n2; i <= n + n2; ++i) {
            int n3 = i < 0 ? arrayList.size() + i : (i >= arrayList.size() ? i % arrayList.size() : i);
            arrayList2.add(arrayList.get(n3));
        }
        return arrayList2;
    }

    protected abstract String getName();

    public abstract boolean dbG();

    public abstract int d();

    public abstract void a(bch_2 var1);

    public abstract LinkedHashMap<Integer, bch_2> dbH();

    protected abstract ArrayList<bci_1> dbI();

    public abstract void a(Collection<bug_0<bci_1>> var1, bde_2 var2);

    public void Bm(int n) {
        this.hFF = n;
        fse_1.gFu().a((aef_2)this, hFq, hFs);
    }

    public void dbJ() {
        fse_1.gFu().a((aef_2)this, hFq, hFs);
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, hFt);
        this.dSK();
    }

    @Override
    public aeb_1 bCh() {
        bsz_2 bsz_22 = (bsz_2)((bsg_1)aie_0.cfn().bmH()).bxm();
        if (bsz_22.KU() == this.hFG) {
            return bsz_22;
        }
        return ((bsg_1)aie_0.cfn().bmH()).fO(this.hFG);
    }

    @Override
    public String dbL() {
        return String.format(hFm, this.d());
    }
}

