/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bmw
 */
public class bmw_1
implements aeh_2 {
    public static final String iBI = "allKnownCrafts";
    public static final String iBJ = "crafts";
    public static final String iBK = "craftsByLevel";
    public static final String iBL = "craftsByKnown";
    public static final String iBM = "harvests";
    public static final String iBN = "harvestsByLevel";
    public static final String iBO = "harvestsByKnown";
    public static final String iBP = "allByKnown";
    public static final String iBQ = "allByLevel";
    public static final String iBR = "allByType";
    public static final String iBS = "allByPreferences";
    public static final String iBT = "isCraftSorted";
    public static final String[] iBU = new String[]{"allKnownCrafts", "crafts", "harvests", "craftsByLevel", "harvestsByLevel", "craftsByKnown", "harvestsByKnown", "allByKnown", "allByLevel", "allByType", "allByPreferences", "isCraftSorted"};
    private final long iBV;
    @NotNull
    private final eki_0 iBW;
    private final bmb_2 iBX;
    private final Map<Integer, bms_1> iBY = new HashMap<Integer, bms_1>();
    private final Map<Integer, bms_1> iBZ = new HashMap<Integer, bms_1>();

    public bmw_1(long l, @NotNull eki_0 eki_02) {
        this.iBV = l;
        this.iBW = eki_02;
        if (eki_02 != ekg_0.qDB) {
            this.iBX = new bmb_2(this);
            this.iBW.a(this.iBX);
        } else {
            this.iBX = null;
        }
    }

    public void clear() {
        this.iBZ.clear();
        this.iBY.clear();
        fse_1.gFu().a((aef_2)this, iBJ, iBM, iBK, iBN, iBL, iBO, iBI, iBQ, iBP, iBR, iBS);
    }

    @Nullable
    public bms_1 Eg(int n) {
        if (this.iBZ.containsKey(n)) {
            return this.iBZ.get(n);
        }
        if (this.iBY.containsKey(n)) {
            return this.iBY.get(n);
        }
        return this.Eh(n);
    }

    @Nullable
    public bms_1 e(@NotNull eKW eKW2) {
        int n = eKW2.d();
        if (this.iBZ.containsKey(n)) {
            return this.iBZ.get(n);
        }
        if (this.iBY.containsKey(n)) {
            return this.iBY.get(n);
        }
        return this.f(eKW2);
    }

    @Nullable
    protected bms_1 Eh(int n) {
        eKW eKW2 = eKQ.qEb.QV(n);
        if (eKW2 == null) {
            return null;
        }
        return this.f(eKW2);
    }

    @Nullable
    protected bms_1 f(@NotNull eKW eKW2) {
        bms_1 bms_12;
        int n = eKW2.d();
        if (eKW2.cmx()) {
            return null;
        }
        if (this.iBW.tX(n)) {
            bmf_2 bmf_22 = new bmf_2(n, this.iBV, this.iBW);
            bmf_22.a(new bmh_2(bmf_22, 7));
            bms_12 = bmf_22;
        } else {
            bms_12 = new bmy_1(n, this.iBW);
        }
        boolean bl = ((bms_1)bms_12).dwp();
        if (((bms_1)bms_12).dwp()) {
            this.iBY.put(n, bms_12);
        } else {
            this.iBZ.put(n, bms_12);
        }
        fse_1.gFu().a((aef_2)this, bl ? iBM : iBJ, bl ? iBN : iBK, bl ? iBO : iBL, iBI, iBQ, iBP, iBR, iBS);
        return bms_12;
    }

    @Nullable
    public bmf_2 Ei(int n) {
        bms_1 bms_12 = this.Eg(n);
        if (bms_12 != null && !bms_12.dwn()) {
            return (bmf_2)bms_12;
        }
        return this.dwy();
    }

    protected @Unmodifiable @NotNull List<bms_1> dwv() {
        return eKQ.qEb.fyU().stream().map(this::e).filter(Objects::nonNull).toList();
    }

    public @Unmodifiable @NotNull List<bms_1> dww() {
        return this.dwv().stream().filter(bms_12 -> !bms_12.dwp()).toList();
    }

    public @Unmodifiable @NotNull List<bms_1> dwx() {
        return this.dwv().stream().filter(bms_1::dwp).toList();
    }

    @Nullable
    public bmf_2 dwy() {
        for (bms_1 bms_12 : this.dww()) {
            if (bms_12.dwn()) continue;
            return (bmf_2)bms_12;
        }
        for (bms_1 bms_12 : this.dwx()) {
            if (bms_12.dwn()) continue;
            return (bmf_2)bms_12;
        }
        return null;
    }

    public boolean aJG() {
        return this.iBW.fyp().isEmpty();
    }

    public int aVo() {
        return this.iBW.fyp().size();
    }

    @Override
    public String[] bxk() {
        return iBU;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "crafts": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dww());
                arrayList.sort(bmx_1.iCa);
                return arrayList;
            }
            case "craftsByLevel": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dww());
                arrayList.sort(bmz_1.iCc);
                return arrayList;
            }
            case "craftsByKnown": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dww());
                arrayList.sort(bmy_2.iCb);
                return arrayList;
            }
            case "harvests": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwx());
                arrayList.sort(bmx_1.iCa);
                return arrayList;
            }
            case "harvestsByLevel": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwx());
                arrayList.sort(bmz_1.iCc);
                return arrayList;
            }
            case "harvestsByKnown": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwx());
                arrayList.sort(bmy_2.iCb);
                return arrayList;
            }
            case "allKnownCrafts": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>();
                arrayList.addAll(this.dww().stream().filter(bms_12 -> !bms_12.dwn()).toList());
                arrayList.addAll(this.dwx().stream().filter(bms_12 -> !bms_12.dwn()).toList());
                return arrayList;
            }
            case "allByKnown": 
            case "allByLevel": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwv());
                arrayList.sort(bma_2.iCd);
                return arrayList;
            }
            case "allByType": {
                ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwv());
                arrayList.sort(bmc_2.iCf);
                return arrayList;
            }
            case "allByPreferences": {
                return this.dwA();
            }
            case "isCraftSorted": {
                return this.dwz();
            }
        }
        return null;
    }

    public boolean dwz() {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljZ);
    }

    @NotNull
    public List<bms_1> dwA() {
        ArrayList<bms_1> arrayList = new ArrayList<bms_1>(this.dwv());
        arrayList.sort(this.dwz() ? bma_2.iCd : bmc_2.iCf);
        return arrayList;
    }

    @NotNull
    eki_0 cZr() {
        return this.iBW;
    }

    public void dwB() {
        if (this.iBX == null) {
            return;
        }
        this.iBW.b(this.iBX);
    }
}

