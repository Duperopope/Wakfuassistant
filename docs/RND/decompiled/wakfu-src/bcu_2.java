/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcu
 */
public abstract class bcu_2
implements aeh_2,
bcz_1 {
    public static final String hEx = "totalProgressionText";
    public static final String hEy = "totalProgressionValue";
    public static final String hEz = "lastCompletedAchievement";
    public static final String hEA = "rootCategories";
    public static final String hEB = "selectedRootCategory";
    public static final String hEC = "isQuestView";
    public static final String hED = "shortcutText";
    public static final String[] hEE = new String[]{"totalProgressionText", "totalProgressionValue", "lastCompletedAchievement", "rootCategories", "selectedRootCategory", "isQuestView", "shortcutText"};
    protected csf_1 hEF = csf_1.nEY;
    protected final LinkedHashMap<Integer, bcy_1> hEG = new LinkedHashMap();
    protected final ArrayList<bcy_1> hEH = new ArrayList();
    protected bcy_1 hEI;
    protected bcd_2 hEJ;
    protected bck_2 hEK;
    protected final long hEL;

    protected bcu_2(long l, bcd_2 bcd_22) {
        this.hEL = l;
        this.hEJ = bcd_22;
    }

    @Override
    public String[] bxk() {
        return hEE;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hEC)) {
            return this.dbh();
        }
        if (string.equals(hEx)) {
            return this.dbl() + "/" + this.dbk();
        }
        if (string.equals(hEy)) {
            return Float.valueOf((float)this.dbl() / (float)this.dbk());
        }
        if (string.equals(hEz)) {
            return this.dbj();
        }
        if (string.equals(hEA)) {
            return this.hEH;
        }
        if (string.equals(hEB)) {
            return this.hEI;
        }
        if (string.equals(hED)) {
            return aUl.kf(this.dbi());
        }
        return null;
    }

    public abstract boolean dbh();

    public abstract String dbi();

    public bci_1 dbj() {
        if (this.hEK == null) {
            return null;
        }
        ArrayList<bci_1> arrayList = this.hEK.dbI();
        return arrayList.size() > 0 ? arrayList.get(arrayList.size() - 1) : null;
    }

    @Override
    public int dbk() {
        int n = 0;
        PO pO = (PO)fcL.rUh.sw(this.hEL);
        TIntObjectIterator<bbu_2> tIntObjectIterator = this.hEJ.daG();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bbu_2 bbu_22 = (bbu_2)tIntObjectIterator.value();
            boolean bl = bcm_1.hIK.w(this.hEL, bbu_22.d());
            if (bl || !bbu_22.a(pO)) continue;
            ++n;
        }
        return n;
    }

    @Override
    public int dbl() {
        int n = 0;
        TIntObjectIterator<bbu_2> tIntObjectIterator = this.hEJ.daG();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bbu_2 bbu_22 = (bbu_2)tIntObjectIterator.value();
            boolean bl = bcm_1.hIK.w(this.hEL, bbu_22.d());
            PO pO = (PO)fcL.rUh.sw(this.hEL);
            if (bl || !bbu_22.a(pO) || !this.hEJ.oe(bbu_22.d()) || !bbu_22.isVisible()) continue;
            ++n;
        }
        return n;
    }

    @Override
    public boolean d(bci_1 bci_12) {
        return false;
    }

    public void a(bca_1 bca_12) {
        this.hEH.forEach(bcy_12 -> bcy_12.a(bca_12.dbN(), bca_12.dbM()));
        fse_1.gFu().a((aef_2)this, hEA, hEB);
    }

    public bck_2 dbm() {
        return this.hEK;
    }

    public bcy_1 Bk(int n) {
        return this.hEG.get(n);
    }

    public Collection<bcy_1> dbn() {
        return this.hEG.values();
    }

    public bcy_1 dbo() {
        return this.hEI;
    }

    public void a(bcy_1 bcy_12) {
        if (this.hEI == bcy_12) {
            return;
        }
        this.hEI = bcy_12;
        fse_1.gFu().a((aef_2)this, hEB);
    }

    @Nullable
    public bcy_1 Bl(int n) {
        return this.a(n, this.hEG);
    }

    @Nullable
    public <T extends bcy_1> bcy_1 a(int n, LinkedHashMap<Integer, T> linkedHashMap) {
        if (linkedHashMap == null) {
            return null;
        }
        LW lW = new LW();
        linkedHashMap.forEach((n2, bcy_12) -> {
            if (lW.aTx() != null) {
                return;
            }
            bcy_1 bcy_13 = bcy_12;
            if (bcy_13.d() == n) {
                lW.v(bcy_13);
                return;
            }
            LinkedHashMap<Integer, bch_2> linkedHashMap = bcy_13.dbH();
            bcy_1 bcy_14 = this.a(n, linkedHashMap);
            if (bcy_14 != null) {
                lW.v(bcy_12);
            }
        });
        return (bcy_1)lW.aTx();
    }

    public csf_1 dbp() {
        return this.hEF;
    }

    public void a(csf_1 csf_12) {
        this.hEF = csf_12;
    }
}

