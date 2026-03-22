/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bHl
 */
public class bhl_1
implements aeh_2 {
    private final String jYh;
    private final Map<bhh_1, TreeMap<Integer, bhi_1>> jYi = new EnumMap<bhh_1, TreeMap<Integer, bhi_1>>(bhh_1.class);
    private final Set<bhi_1> jYj = new TreeSet<bhi_1>(Comparator.comparing(bhi_1::dWS).thenComparingInt(bhi_1::dWT));
    private final bhv_1 jYk;
    private final List<bEO> jYl = new ArrayList<bEO>();
    private final @Unmodifiable List<bil_1> jYm = bil_1.a(new fgj[0]);
    private boolean jYn = false;
    private final @Unmodifiable List<bhe_1> jYo = bhe_1.dWP();
    public static final String jYp = "itemRarities";
    public static final String jYq = "currentFilters";
    public static final String jYr = "allSelectedRarities";
    public static final String jYs = "rootItemTypes";
    public static final String jYt = "nameSearch";
    public static final String jYu = "minLevel";
    public static final String jYv = "maxLevel";
    public static final String jYw = "onlyExtremePrice";
    public static final String jYx = "onlyIfValid";
    public static final String jYy = "minPrice";
    public static final String jYz = "maxPrice";
    public static final String jYA = "minQuantity";
    public static final String jYB = "maxQuantity";
    public static final String jYC = "slotColorsFilter";
    public static final String jYD = "selectedSlotColors";
    public static final String jYE = "allSlotColors";
    public static final String jYF = "availableSublimations";
    public static final String jYG = "specialSublimations";
    public static final String jYH = "selectedBasicSublimation";
    public static final String jYI = "selectedSpecialSublimation";
    public static final String jYJ = "allCharacteristicsGroups";
    public static final String[] jYK = new String[]{"itemRarities", "nameSearch", "currentFilters", "allSelectedRarities", "rootItemTypes", "minLevel", "maxLevel", "minPrice", "maxPrice", "slotColorsFilter", "selectedSlotColors", "allSlotColors", "availableSublimations", "specialSublimations", "onlyExtremePrice", "onlyIfValid", "selectedBasicSublimation", "selectedSpecialSublimation", "allCharacteristicsGroups", "minQuantity", "maxQuantity"};

    bhl_1(String string) {
        this.jYk = new bhv_1();
        this.jYh = string;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "itemRarities": {
                return this.jYm;
            }
            case "currentFilters": {
                return this.jYj;
            }
            case "allSelectedRarities": {
                TreeMap<Integer, bhi_1> treeMap = this.jYi.get((Object)bhh_1.kcr);
                if (treeMap == null) {
                    return aum_0.cWf().c("market.filter.rarities.all", new Object[0]);
                }
                return treeMap.values().stream().map(bhi_1::dDG).collect(Collectors.joining(", "));
            }
            case "rootItemTypes": {
                return this.jYl;
            }
            case "nameSearch": {
                Object t = this.b(bhh_1.kcp);
                if (t == null) {
                    return null;
                }
                return ((bhl_2)t).getName();
            }
            case "onlyExtremePrice": {
                return this.d(bhh_1.kcs);
            }
            case "onlyIfValid": {
                return this.d(bhh_1.kct);
            }
            case "minLevel": {
                return this.a(bhh_1.kcq, true);
            }
            case "maxLevel": {
                return this.a(bhh_1.kcq, false);
            }
            case "minPrice": {
                return this.a(bhh_1.kcu, true);
            }
            case "maxPrice": {
                return this.a(bhh_1.kcu, false);
            }
            case "minQuantity": {
                return this.a(bhh_1.kcw, true);
            }
            case "maxQuantity": {
                return this.a(bhh_1.kcw, false);
            }
            case "slotColorsFilter": {
                return this.b(bhh_1.kcx);
            }
            case "selectedSlotColors": {
                return this.jYk.dVM();
            }
            case "allSlotColors": {
                return this.jYk.dVR();
            }
            case "availableSublimations": {
                return this.jYk.dVN();
            }
            case "specialSublimations": {
                return this.jYk.dVO();
            }
            case "selectedBasicSublimation": {
                bht_2 bht_22 = (bht_2)this.a(bhh_1.kcy, 0);
                return bht_22 == null ? this.jYk.dVU() : bht_22.dXa();
            }
            case "selectedSpecialSublimation": {
                bht_2 bht_23 = (bht_2)this.a(bhh_1.kcy, 1);
                return bht_23 == null ? this.jYk.dVV() : bht_23.dXa();
            }
            case "allCharacteristicsGroups": {
                return this.jYo;
            }
        }
        return null;
    }

    private void a(bhh_1 bhh_12) {
        if (bhh_12 == bhh_1.kcq || bhh_12 == bhh_1.kcr || bhh_12 == bhh_1.kcA) {
            this.dVb();
        }
    }

    private void dVb() {
        Object object2;
        bhk_1 bhk_12 = (bhk_1)this.b(bhh_1.kcq);
        short s = bhk_12 != null && bhk_12.dWV() ? (short)bhk_12.aOa() : (short)0;
        short s2 = bhk_12 != null && bhk_12.dWW() ? (short)bhk_12.aOb() : (short)245;
        EnumSet<fgj> enumSet = EnumSet.noneOf(fgj.class);
        Collection collection = this.c(bhh_1.kcr);
        for (Object object2 : collection) {
            if (object2 == null) continue;
            enumSet.add(((bhr_2)object2).dwg());
        }
        LinkedList linkedList = new LinkedList();
        object2 = this.c(bhh_1.kcA);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            bhj_2 bhj_22 = (bhj_2)iterator.next();
            if (bhj_22 == null) continue;
            linkedList.add(bhj_22.dGh());
        }
        if (bhk_12 == null && enumSet.isEmpty() && linkedList.isEmpty()) {
            bdc_0.dRc().dRe();
        } else {
            bdc_0.dRc().a((Map.Entry<String, bgv_2> entry) -> {
                bgv_2 bgv_22 = (bgv_2)entry.getValue();
                if (bgv_22.cmL() < s || bgv_22.cmL() > s2) {
                    return false;
                }
                if (!enumSet.isEmpty() && !enumSet.contains(bgv_22.dwg())) {
                    return false;
                }
                return linkedList.isEmpty() || bhl_1.a(linkedList, bgv_22.dGh());
            });
        }
    }

    private static boolean a(List<fhy_0> list, fhy_0 fhy_02) {
        for (fhy_0 fhy_03 : list) {
            if (!fhy_02.p(fhy_03)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public <T extends bhi_1> T b(bhh_1 bhh_12) {
        bhi_1 bhi_13 = this.jYj.stream().filter(bhi_12 -> bhi_12.dWS() == bhh_12).findFirst().orElse(null);
        return (T)bhi_13;
    }

    @Nullable
    public <T extends bhi_1> T a(bhh_1 bhh_12, int n) {
        bhi_1 bhi_13 = this.jYj.stream().filter(bhi_12 -> bhi_12.dWS() == bhh_12 && bhi_12.dWT() == n).findFirst().orElse(null);
        return (T)bhi_13;
    }

    public <T extends bhi_1> @Unmodifiable @NotNull Collection<T> c(bhh_1 bhh_12) {
        return this.jYj.stream().filter(bhi_12 -> bhi_12.dWS() == bhh_12).map(bhi_12 -> bhi_12).toList();
    }

    @Nullable
    private Long a(bhh_1 bhh_12, boolean bl) {
        bhq_2 bhq_22 = (bhq_2)this.b(bhh_12);
        if (bhq_22 == null) {
            return null;
        }
        long l = bl ? bhq_22.aOa() : bhq_22.aOb();
        return l == -1L ? null : Long.valueOf(l);
    }

    @Nullable
    private Boolean d(bhh_1 bhh_12) {
        bhf_1 bhf_12 = (bhf_1)this.b(bhh_12);
        if (bhf_12 == null) {
            return null;
        }
        return bhf_12.isEnabled();
    }

    public void a(bhi_1 bhi_12) {
        bhi_1 bhi_13 = this.jYi.computeIfAbsent(bhi_12.dWS(), bhh_12 -> new TreeMap()).put(bhi_12.dWT(), bhi_12);
        if (bhi_13 != null) {
            this.jYj.remove(bhi_13);
        }
        this.jYj.add(bhi_12);
        this.a(bhi_12.dWS());
        fse_1.gFu().a((aef_2)this, jYq);
    }

    public void b(bhi_1 bhi_12) {
        if (bhi_12.isValid()) {
            this.a(bhi_12);
        } else {
            this.c(bhi_12);
        }
    }

    public void c(bhi_1 bhi_12) {
        bhh_1 bhh_12 = bhi_12.dWS();
        TreeMap<Integer, bhi_1> treeMap = this.jYi.get((Object)bhh_12);
        if (treeMap != null) {
            treeMap.remove(bhi_12.dWT());
            this.jYj.removeIf(bhi_13 -> bhi_13.dWS() == bhi_12.dWS() && bhi_13.dWT() == bhi_12.dWT());
            if (treeMap.isEmpty()) {
                this.jYi.remove((Object)bhh_12);
            }
        }
        this.a(bhi_12.dWS());
        fse_1.gFu().a((aef_2)this, jYq);
    }

    public void a(@Nullable fiu_0 fiu_02) {
        ArrayList<bhi_1> arrayList = new ArrayList<bhi_1>(this.jYj);
        this.jYi.clear();
        this.jYj.clear();
        if (fiu_02 != null) {
            arrayList.forEach(bhi_12 -> bhi_12.d(fiu_02));
        }
        this.dVb();
        fse_1.gFu().a((aef_2)this, jYq);
    }

    public void dUQ() {
        this.jYk.dUQ();
        fse_1.gFu().a((aef_2)this, jYD);
    }

    public void hK(boolean bl) {
        this.jYk.hK(bl);
        fse_1.gFu().a((aef_2)this, jYF, jYG);
    }

    @Nullable
    public bij_1 C(String string, boolean bl) {
        return this.jYk.C(string, bl);
    }

    @NotNull
    public bhs_2 hL(boolean bl) {
        ArrayList<fjd> arrayList = new ArrayList<fjd>();
        for (bii_1 bii_12 : this.jYk.dVM()) {
            arrayList.add(bii_12.dXy());
        }
        bhs_2 bhs_22 = new bhs_2(arrayList, bl, () -> {
            this.jYk.dVI();
            this.hK(false);
            fse_1.gFu().a((aef_2)this, jYD);
        });
        this.b(bhs_22);
        return bhs_22;
    }

    public void dVc() {
        fse_1.gFu().a((aef_2)this, jYt);
    }

    public void dVd() {
        fse_1.gFu().a((aef_2)this, jYu, jYv);
    }

    public void dVe() {
        fse_1.gFu().a((aef_2)this, jYw);
    }

    public void dVf() {
        fse_1.gFu().a((aef_2)this, jYy, jYz);
    }

    public void dVg() {
        fse_1.gFu().a((aef_2)this, jYA, jYB);
    }

    public void dVh() {
        fse_1.gFu().a((aef_2)this, jYx);
    }

    public void dVi() {
        fse_1.gFu().a((aef_2)this, jYH, jYI);
    }

    public void dVj() {
        fse_1.gFu().a((aef_2)this, jYp, jYr);
    }

    void hM(boolean bl) {
        if (bl) {
            bhs_2 bhs_22 = (bhs_2)this.b(bhh_1.kcx);
            this.hK(bhs_22 != null && bhs_22.dWY());
        } else {
            this.jYi.clear();
            this.jYj.forEach(bhi_1::remove);
            this.jYj.clear();
            this.jYm.forEach(bil_12 -> bil_12.setSelected(false));
            this.dVl();
        }
        if (!bl || this.jYl.isEmpty()) {
            this.dVk();
        }
        this.dVb();
        fse_1.gFu().a((aef_2)this, jYq, jYp);
    }

    private void dVk() {
        this.jYl.clear();
        for (fhy_0 fhy_02 : bew_1.dSk().fZi()) {
            if (!fhy_02.cpZ()) continue;
            this.jYl.add(new bEO(fhy_02, null, fhy_0::cpZ));
        }
        this.jYl.sort(bEO.jRu);
    }

    public void dVl() {
        this.jYi.remove((Object)bhh_1.kcx);
        this.jYj.removeIf(bhi_12 -> bhi_12.dWS() == bhh_1.kcx);
        this.jYk.dVI();
        this.dUQ();
        this.hK(false);
        fse_1.gFu().a((aef_2)this, jYq, jYD);
    }

    @Override
    public String[] bxk() {
        return jYK;
    }

    public String toString() {
        return "MarketFilterSetView{" + this.jYh + "}";
    }

    @Generated
    public bhv_1 dVa() {
        return this.jYk;
    }

    @Generated
    public boolean dVm() {
        return this.jYn;
    }

    @Generated
    public void hN(boolean bl) {
        this.jYn = bl;
    }
}

