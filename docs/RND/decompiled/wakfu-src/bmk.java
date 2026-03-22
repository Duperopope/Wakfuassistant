/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bmk
implements aeh_2,
bmm_1 {
    public static final String izT = "hasActivePreset";
    public static final String izU = "presetName";
    public static final String izV = "isActive";
    public static final String izW = "firstSlots";
    public static final String izX = "secondSlots";
    public static final String izY = "hasCostume";
    public static final String izZ = "isHatHidden";
    public static final String iAa = "petColoration";
    public static final String iAb = "mountColoration";
    public static final String[] iAc = new String[]{"hasActivePreset", "presetName", "isActive", "firstSlots", "secondSlots", "hasCostume", "isHatHidden", "petColoration", "mountColoration"};
    @NotNull
    private final eks_0 iAd;
    private final Map<fm_1, bmi> iAe = new LinkedHashMap<fm_1, bmi>();
    private final List<bmi> iAf = new ArrayList<bmi>();
    private final List<bmi> iAg = new ArrayList<bmi>();
    @Nullable
    private bmf iAh;
    @Nullable
    private bmf iAi;
    private boolean dxk;

    public bmk(bhJ bhJ2) {
        this(new eks_0(-1, -1, null, Map.of(), uw_0.bju()), bhJ2);
    }

    public bmk(@NotNull eks_0 eks_02, bhJ bhJ2) {
        bmi bmi2;
        Object object2;
        this.iAd = eks_02;
        int n = eks_02.BL();
        Map<fm_1, List<ekp_0>> map = this.iAd.fye();
        for (Object object2 : bjf_1.inI) {
            bmi2 = new bmi((fm_1)((Object)object2), map.get(object2), n);
            this.iAe.put((fm_1)((Object)object2), bmi2);
            this.iAf.add(bmi2);
        }
        for (Object object2 : bjf_1.inJ) {
            bmi2 = new bmi((fm_1)((Object)object2), map.get(object2), n);
            this.iAe.put((fm_1)((Object)object2), bmi2);
            this.iAg.add(bmi2);
        }
        ekp_0 ekp_02 = this.iAe.get((Object)fm_1.pv).dvG();
        this.iAh = ekp_02 != null ? new bmf(ekp_02) : null;
        object2 = this.iAe.get((Object)fm_1.pu).dvG();
        this.iAi = object2 != null ? new bmf((ekp_0)object2) : null;
        this.dvN();
        this.ah(bhJ2);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "hasActivePreset": {
                return this.iAd.BJ() != -1;
            }
            case "presetName": {
                return this.getName();
            }
            case "isActive": {
                return this.dxk;
            }
            case "firstSlots": {
                return this.iAf;
            }
            case "secondSlots": {
                return this.iAg;
            }
            case "hasCostume": {
                return this.iAe.get((Object)fm_1.pw).aaz();
            }
            case "isHatHidden": {
                return this.iAd.dva();
            }
            case "petColoration": {
                return this.iAh;
            }
            case "mountColoration": {
                return this.iAi;
            }
        }
        return null;
    }

    public boolean dvL() {
        return this.iAd.BJ() != -1;
    }

    @NotNull
    public eks_0 dvM() {
        return this.iAd;
    }

    public final void dvN() {
        boolean bl = this.iAe.get((Object)fm_1.pw).aaz();
        for (fm_1 fm_12 : bjf_1.inK) {
            this.iAe.get((Object)fm_12).setEnabled(!bl);
        }
        fse_1.gFu().a((aef_2)this, izY);
    }

    public final void ah(bhJ bhJ2) {
        Optional<ekr_0> optional = bbs_2.a(eva_1.owz);
        this.dxk = optional.flatMap(ekr_02 -> ekr_02.qd(bhJ2.Sn())).map(eks_02 -> eks_02.BJ() == this.d()).orElse(false);
    }

    public void dvO() {
        this.dxk = !this.dxk;
        fse_1.gFu().a((aef_2)this, izV);
    }

    public int d() {
        return this.iAd.BJ();
    }

    public int bnd() {
        return this.iAd.BL();
    }

    public String getName() {
        return bjf_1.lM(this.iAd.getName());
    }

    @Override
    public boolean dva() {
        return this.iAd.dva();
    }

    public Collection<bmi> dvP() {
        return Collections.unmodifiableCollection(this.iAe.values());
    }

    public bmi r(fm_1 fm_12) {
        return this.iAe.get((Object)fm_12);
    }

    @Override
    public Optional<ekp_0> s(fm_1 fm_12) {
        return Optional.ofNullable(this.iAe.get((Object)fm_12).dvG());
    }

    @Override
    public bhJ cXJ() {
        return ctb_2.eQw();
    }

    @Override
    public Optional<ffV> d(@NotNull ffS ffS2) {
        return eIp.a((exP)this.cXJ(), ffS2);
    }

    @Override
    public Iterable<fm_1> dvQ() {
        return bjf_1.inK;
    }

    public List<ekp_0> t(fm_1 fm_12) {
        return this.iAd.fye().get((Object)fm_12);
    }

    public Optional<bmi> Ea(int n) {
        for (bmi bmi2 : this.iAe.values()) {
            if (!bmi2.DW(n)) continue;
            return Optional.of(bmi2);
        }
        return Optional.empty();
    }

    @Override
    public String[] bxk() {
        return iAc;
    }

    public String toString() {
        return "CurrentCosmeticPresetView{m_cosmeticPreset=" + String.valueOf(this.iAd) + "}";
    }
}

