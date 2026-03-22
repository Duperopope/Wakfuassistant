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

public class bHl
implements aEH {
    private final String jYh;
    private final Map<bHH, TreeMap<Integer, bHI>> jYi = new EnumMap<bHH, TreeMap<Integer, bHI>>(bHH.class);
    private final Set<bHI> jYj = new TreeSet<bHI>(Comparator.comparing(bHI::dWS).thenComparingInt(bHI::dWT));
    private final bHv jYk;
    private final List<bEO> jYl = new ArrayList<bEO>();
    private final @Unmodifiable List<bIl> jYm = bIl.a(new fgj[0]);
    private boolean jYn = false;
    private final @Unmodifiable List<bHE> jYo = bHE.dWP();
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

    bHl(String string) {
        this.jYk = new bHv();
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
                TreeMap<Integer, bHI> treeMap = this.jYi.get((Object)bHH.kcr);
                if (treeMap == null) {
                    return aUM.cWf().c("market.filter.rarities.all", new Object[0]);
                }
                return treeMap.values().stream().map(bHI::dDG).collect(Collectors.joining(", "));
            }
            case "rootItemTypes": {
                return this.jYl;
            }
            case "nameSearch": {
                Object t = this.b(bHH.kcp);
                if (t == null) {
                    return null;
                }
                return ((bHL)t).getName();
            }
            case "onlyExtremePrice": {
                return this.d(bHH.kcs);
            }
            case "onlyIfValid": {
                return this.d(bHH.kct);
            }
            case "minLevel": {
                return this.a(bHH.kcq, true);
            }
            case "maxLevel": {
                return this.a(bHH.kcq, false);
            }
            case "minPrice": {
                return this.a(bHH.kcu, true);
            }
            case "maxPrice": {
                return this.a(bHH.kcu, false);
            }
            case "minQuantity": {
                return this.a(bHH.kcw, true);
            }
            case "maxQuantity": {
                return this.a(bHH.kcw, false);
            }
            case "slotColorsFilter": {
                return this.b(bHH.kcx);
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
                bHT bHT2 = (bHT)this.a(bHH.kcy, 0);
                return bHT2 == null ? this.jYk.dVU() : bHT2.dXa();
            }
            case "selectedSpecialSublimation": {
                bHT bHT3 = (bHT)this.a(bHH.kcy, 1);
                return bHT3 == null ? this.jYk.dVV() : bHT3.dXa();
            }
            case "allCharacteristicsGroups": {
                return this.jYo;
            }
        }
        return null;
    }

    private void a(bHH bHH2) {
        if (bHH2 == bHH.kcq || bHH2 == bHH.kcr || bHH2 == bHH.kcA) {
            this.dVb();
        }
    }

    private void dVb() {
        Object object2;
        bHK bHK2 = (bHK)this.b(bHH.kcq);
        short s = bHK2 != null && bHK2.dWV() ? (short)bHK2.aOa() : (short)0;
        short s2 = bHK2 != null && bHK2.dWW() ? (short)bHK2.aOb() : (short)245;
        EnumSet<fgj> enumSet = EnumSet.noneOf(fgj.class);
        Collection collection = this.c(bHH.kcr);
        for (Object object2 : collection) {
            if (object2 == null) continue;
            enumSet.add(((bHR)object2).dwg());
        }
        LinkedList linkedList = new LinkedList();
        object2 = this.c(bHH.kcA);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            bHJ bHJ2 = (bHJ)iterator.next();
            if (bHJ2 == null) continue;
            linkedList.add(bHJ2.dGh());
        }
        if (bHK2 == null && enumSet.isEmpty() && linkedList.isEmpty()) {
            bDC.dRc().dRe();
        } else {
            bDC.dRc().a((Map.Entry<String, bGV> entry) -> {
                bGV bGV2 = (bGV)entry.getValue();
                if (bGV2.cmL() < s || bGV2.cmL() > s2) {
                    return false;
                }
                if (!enumSet.isEmpty() && !enumSet.contains(bGV2.dwg())) {
                    return false;
                }
                return linkedList.isEmpty() || bHl.a(linkedList, bGV2.dGh());
            });
        }
    }

    private static boolean a(List<fhY> list, fhY fhY2) {
        for (fhY fhY3 : list) {
            if (!fhY2.p(fhY3)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public <T extends bHI> T b(bHH bHH2) {
        bHI bHI3 = this.jYj.stream().filter(bHI2 -> bHI2.dWS() == bHH2).findFirst().orElse(null);
        return (T)bHI3;
    }

    @Nullable
    public <T extends bHI> T a(bHH bHH2, int n) {
        bHI bHI3 = this.jYj.stream().filter(bHI2 -> bHI2.dWS() == bHH2 && bHI2.dWT() == n).findFirst().orElse(null);
        return (T)bHI3;
    }

    public <T extends bHI> @Unmodifiable @NotNull Collection<T> c(bHH bHH2) {
        return this.jYj.stream().filter(bHI2 -> bHI2.dWS() == bHH2).map(bHI2 -> bHI2).toList();
    }

    @Nullable
    private Long a(bHH bHH2, boolean bl) {
        bHQ bHQ2 = (bHQ)this.b(bHH2);
        if (bHQ2 == null) {
            return null;
        }
        long l = bl ? bHQ2.aOa() : bHQ2.aOb();
        return l == -1L ? null : Long.valueOf(l);
    }

    @Nullable
    private Boolean d(bHH bHH2) {
        bHF bHF2 = (bHF)this.b(bHH2);
        if (bHF2 == null) {
            return null;
        }
        return bHF2.isEnabled();
    }

    public void a(bHI bHI2) {
        bHI bHI3 = this.jYi.computeIfAbsent(bHI2.dWS(), bHH2 -> new TreeMap()).put(bHI2.dWT(), bHI2);
        if (bHI3 != null) {
            this.jYj.remove(bHI3);
        }
        this.jYj.add(bHI2);
        this.a(bHI2.dWS());
        fSe.gFu().a((aEF)this, jYq);
    }

    public void b(bHI bHI2) {
        if (bHI2.isValid()) {
            this.a(bHI2);
        } else {
            this.c(bHI2);
        }
    }

    public void c(bHI bHI2) {
        bHH bHH2 = bHI2.dWS();
        TreeMap<Integer, bHI> treeMap = this.jYi.get((Object)bHH2);
        if (treeMap != null) {
            treeMap.remove(bHI2.dWT());
            this.jYj.removeIf(bHI3 -> bHI3.dWS() == bHI2.dWS() && bHI3.dWT() == bHI2.dWT());
            if (treeMap.isEmpty()) {
                this.jYi.remove((Object)bHH2);
            }
        }
        this.a(bHI2.dWS());
        fSe.gFu().a((aEF)this, jYq);
    }

    public void a(@Nullable fiU fiU2) {
        ArrayList<bHI> arrayList = new ArrayList<bHI>(this.jYj);
        this.jYi.clear();
        this.jYj.clear();
        if (fiU2 != null) {
            arrayList.forEach(bHI2 -> bHI2.d(fiU2));
        }
        this.dVb();
        fSe.gFu().a((aEF)this, jYq);
    }

    public void dUQ() {
        this.jYk.dUQ();
        fSe.gFu().a((aEF)this, jYD);
    }

    public void hK(boolean bl) {
        this.jYk.hK(bl);
        fSe.gFu().a((aEF)this, jYF, jYG);
    }

    @Nullable
    public bIj C(String string, boolean bl) {
        return this.jYk.C(string, bl);
    }

    @NotNull
    public bHS hL(boolean bl) {
        ArrayList<fjd> arrayList = new ArrayList<fjd>();
        for (bIi bIi2 : this.jYk.dVM()) {
            arrayList.add(bIi2.dXy());
        }
        bHS bHS2 = new bHS(arrayList, bl, () -> {
            this.jYk.dVI();
            this.hK(false);
            fSe.gFu().a((aEF)this, jYD);
        });
        this.b(bHS2);
        return bHS2;
    }

    public void dVc() {
        fSe.gFu().a((aEF)this, jYt);
    }

    public void dVd() {
        fSe.gFu().a((aEF)this, jYu, jYv);
    }

    public void dVe() {
        fSe.gFu().a((aEF)this, jYw);
    }

    public void dVf() {
        fSe.gFu().a((aEF)this, jYy, jYz);
    }

    public void dVg() {
        fSe.gFu().a((aEF)this, jYA, jYB);
    }

    public void dVh() {
        fSe.gFu().a((aEF)this, jYx);
    }

    public void dVi() {
        fSe.gFu().a((aEF)this, jYH, jYI);
    }

    public void dVj() {
        fSe.gFu().a((aEF)this, jYp, jYr);
    }

    void hM(boolean bl) {
        if (bl) {
            bHS bHS2 = (bHS)this.b(bHH.kcx);
            this.hK(bHS2 != null && bHS2.dWY());
        } else {
            this.jYi.clear();
            this.jYj.forEach(bHI::remove);
            this.jYj.clear();
            this.jYm.forEach(bIl2 -> bIl2.setSelected(false));
            this.dVl();
        }
        if (!bl || this.jYl.isEmpty()) {
            this.dVk();
        }
        this.dVb();
        fSe.gFu().a((aEF)this, jYq, jYp);
    }

    private void dVk() {
        this.jYl.clear();
        for (fhY fhY2 : bEw.dSk().fZi()) {
            if (!fhY2.cpZ()) continue;
            this.jYl.add(new bEO(fhY2, null, fhY::cpZ));
        }
        this.jYl.sort(bEO.jRu);
    }

    public void dVl() {
        this.jYi.remove((Object)bHH.kcx);
        this.jYj.removeIf(bHI2 -> bHI2.dWS() == bHH.kcx);
        this.jYk.dVI();
        this.dUQ();
        this.hK(false);
        fSe.gFu().a((aEF)this, jYq, jYD);
    }

    @Override
    public String[] bxk() {
        return jYK;
    }

    public String toString() {
        return "MarketFilterSetView{" + this.jYh + "}";
    }

    @Generated
    public bHv dVa() {
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
