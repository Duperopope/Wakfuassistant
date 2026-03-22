/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bno
 */
public class bno_2
implements aeh_2 {
    public static final String iHt = "craftStepViewList";
    public static final String iHu = "isFreeForGuild";
    public static final String iHv = "stepsFallthroughEnabled";
    public static final String iHw = "overriddenCraftFeeViewList";
    public static final String iHx = "overriddenCraftFeeViewListFilter";
    public static final String iHy = "minFee";
    public static final String[] iHz = new String[]{"craftStepViewList", "isFreeForGuild", "stepsFallthroughEnabled", "overriddenCraftFeeViewList", "overriddenCraftFeeViewListFilter", "minFee"};
    @NotNull
    private final List<bnk_1> iHA = new ArrayList<bnk_1>();
    @NotNull
    private final List<bnx_2> iHB = new ArrayList<bnx_2>();
    private final fez_1 iHC = new fez_1();
    @NotNull
    private final Map<ekb_0, ekd_0> iHD;
    @NotNull
    private final Map<Integer, Integer> iHE;
    private boolean iHF;
    private boolean iHG;

    public bno_2(@NotNull eki_0 eki_02) {
        Map<ekb_0, ekd_0> map = eki_02.qg();
        this.iHD = map.isEmpty() ? new EnumMap<ekb_0, ekd_0>(ekb_0.class) : new EnumMap<ekb_0, ekd_0>(map);
        this.iHE = new HashMap<Integer, Integer>(eki_02.dyy());
        this.iHF = !eki_02.fyq();
        this.iHG = eki_02.fyr();
        for (ekb_0 ekb_02 : ekb_0.values()) {
            ekc_0<ekd_0> ekc_02 = this.a(ekb_02);
            this.iHA.add(new bnk_1(ekb_02, ekc_02.getValue(), ekc_02.fyB(), this.iHD.containsKey((Object)ekb_02)));
        }
        this.dyv();
    }

    @Override
    public String[] bxk() {
        return iHz;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "craftStepViewList": {
                return this.iHA;
            }
            case "isFreeForGuild": {
                return this.iHF;
            }
            case "stepsFallthroughEnabled": {
                return this.iHG;
            }
            case "overriddenCraftFeeViewList": {
                return this.iHB;
            }
            case "overriddenCraftFeeViewListFilter": {
                return this.iHC;
            }
            case "minFee": {
                return 0;
            }
        }
        return null;
    }

    @NotNull
    public ekc_0<ekd_0> a(ekb_0 ekb_02) {
        return ekb_02.a(this.iHD, this.iHG);
    }

    public boolean dyu() {
        boolean bl = false;
        for (bnk_1 bnk_12 : this.iHA) {
            ekb_0 ekb_02 = bnk_12.dyn();
            ekc_0<ekd_0> ekc_02 = this.a(ekb_02);
            bl |= bnk_12.a(ekc_02.getValue(), ekc_02.fyB(), this.iHD.containsKey((Object)ekb_02));
        }
        if (bl) {
            this.dyw();
        }
        return bl;
    }

    public void dyv() {
        this.iHB.clear();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eki_0 eki_02 = bgt_02.dpK();
        for (eKR eKR2 : eki_02.fyI()) {
            ekd_0 ekd_02;
            if (!eKK.fyJ().j(eKR2) || !eKR2.av(bgt_02)) continue;
            this.iHB.add(new bnx_2(eKR2, this.iHE.get(eKR2.d()), (ekd_02 = this.a(eKR2.fyW()).getValue()) != null ? ekd_02.d(eKR2) : 0));
        }
        this.iHB.sort(Comparator.comparing(bnx_2::dzk).thenComparing(bnx_2::dzh).thenComparing(bnx_2::dwg));
        fse_1.gFu().a((aef_2)this, iHw);
    }

    public boolean dyw() {
        boolean bl = false;
        for (bnx_2 bnx_22 : this.iHB) {
            bl |= this.a(bnx_22);
        }
        return bl;
    }

    private boolean Ev(int n) {
        boolean bl = false;
        for (bnx_2 bnx_22 : this.iHB) {
            eKR eKR2 = bnx_22.dxR();
            if (eKR2.d() != n) continue;
            bl |= this.a(bnx_22);
        }
        return bl;
    }

    private boolean a(bnx_2 bnx_22) {
        ekd_0 ekd_02;
        eKR eKR2;
        return bnx_22.a(this.iHE.get(eKR2.d()), (ekd_02 = this.a((eKR2 = bnx_22.dxR()).fyW()).getValue()) != null ? ekd_02.d(eKR2) : 0);
    }

    @NotNull
    public Map<ekb_0, ekd_0> dyx() {
        return this.iHD;
    }

    @Nullable
    public ekd_0 b(@NotNull ekb_0 ekb_02) {
        return this.iHD.get((Object)ekb_02);
    }

    public void a(@NotNull ekb_0 ekb_02, @NotNull ekd_0 ekd_02, boolean bl) {
        this.iHD.put(ekb_02, ekd_02);
        if (bl) {
            this.dyu();
        }
    }

    public void c(@NotNull ekb_0 ekb_02) {
        this.iHD.remove((Object)ekb_02);
        this.dyu();
    }

    @NotNull
    public Map<Integer, Integer> dyy() {
        return this.iHE;
    }

    public void j(int n, int n2, boolean bl) {
        if (!eKK.fyJ().QT(n)) {
            return;
        }
        this.iHE.put(n, n2);
        if (bl) {
            this.Ev(n);
        }
    }

    public void Ew(int n) {
        if (!eKK.fyJ().QT(n)) {
            return;
        }
        this.iHE.remove(n);
        this.Ev(n);
    }

    public void gE(boolean bl) {
        if (bl == this.iHF) {
            return;
        }
        this.iHF = bl;
        fse_1.gFu().a((aef_2)this, iHu);
    }

    public void gF(boolean bl) {
        if (bl == this.iHG) {
            return;
        }
        this.iHG = bl;
        fse_1.gFu().a((aef_2)this, iHv);
        this.dyu();
    }

    @Generated
    public boolean dyz() {
        return this.iHF;
    }

    @Generated
    public boolean dyA() {
        return this.iHG;
    }
}

