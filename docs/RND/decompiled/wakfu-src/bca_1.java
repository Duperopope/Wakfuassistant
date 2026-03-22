/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.EnumMap;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcA
 */
public class bca_1
implements aeh_2 {
    public static final String hFI = "sortingType";
    public static final String hFJ = "displayCategories";
    public static final String hFK = "hasFilterOfDrawer";
    public static final String hFL = "typeFilter";
    public static final String hFM = "completionFilter";
    public static final String hFN = "nameFilter";
    public static final String hFO = "completionFilterValuesForQuests";
    public static final String hFP = "completionFilterValuesForAchievements";
    public static final String hFQ = "minLevelFilter";
    public static final String hFR = "maxLevelFilter";
    public static final String hFS = "minPlayerCountFilter";
    public static final String hFT = "maxPlayerCountFilter";
    public static final String hFU = "hasXpRewardFilter";
    public static final String hFV = "hasKamasRewardFilter";
    public static final String hFW = "hasTokensRewardFilter";
    public static final String hFX = "hasItemsRewardFilter";
    public static final String hFY = "hasOtherRewardFilter";
    public static final int hFZ = 0;
    @NotNull
    private bde_2 hGa = bde_2.hJD;
    private final EnumMap<buh_0, bug_0<bci_1>> hGb = new EnumMap(buh_0.class);
    private static final String[] hGc = new String[]{"sortingType", "displayCategories", "hasFilterOfDrawer", "typeFilter", "completionFilter", "nameFilter", "minLevelFilter", "maxLevelFilter", "minPlayerCountFilter", "maxPlayerCountFilter"};
    private static final String[] hGd = new String[]{"sortingType", "displayCategories", "hasFilterOfDrawer", "typeFilter", "completionFilter", "minLevelFilter", "maxLevelFilter", "minPlayerCountFilter", "maxPlayerCountFilter"};

    @Override
    public String[] bxk() {
        return hGc;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "sortingType": {
                return this.hGa.ordinal();
            }
            case "displayCategories": {
                return this.hGa == bde_2.hJD;
            }
            case "hasFilterOfDrawer": {
                return this.hGb.keySet().stream().anyMatch(bca_1::a);
            }
            case "completionFilterValuesForQuests": {
                return csf_1.nFb;
            }
            case "completionFilterValuesForAchievements": {
                return csf_1.nFc;
            }
            case "typeFilter": {
                Optional<bcw_2> optional = this.b(buh_0.jow);
                return optional.map(bcw_22 -> bcw_22.dcB().d()).orElse(0);
            }
            case "completionFilter": {
                Optional<bcr_1> optional = this.b(buh_0.joy);
                return optional.map(bcr_1::dcA).orElse(null);
            }
            case "nameFilter": {
                Optional<bcu_1> optional = this.b(buh_0.jot);
                return optional.map(buo_0::dIR).orElse(null);
            }
            case "minLevelFilter": {
                Optional<bct_1> optional = this.b(buh_0.jou);
                return optional.map(bui_0::dIO).orElse(null);
            }
            case "maxLevelFilter": {
                Optional<bct_1> optional = this.b(buh_0.jou);
                return optional.map(bui_0::dIP).orElse(null);
            }
            case "minPlayerCountFilter": {
                Optional<bcv_2> optional = this.b(buh_0.jox);
                return optional.map(bui_0::dIO).orElse(null);
            }
            case "maxPlayerCountFilter": {
                Optional<bcv_2> optional = this.b(buh_0.jox);
                return optional.map(bui_0::dIP).orElse(null);
            }
            case "hasXpRewardFilter": {
                return this.b(buh_0.joz).isPresent();
            }
            case "hasKamasRewardFilter": {
                return this.b(buh_0.joA).isPresent();
            }
            case "hasTokensRewardFilter": {
                return this.b(buh_0.joB).isPresent();
            }
            case "hasItemsRewardFilter": {
                return this.b(buh_0.joC).isPresent();
            }
            case "hasOtherRewardFilter": {
                return this.b(buh_0.joD).isPresent();
            }
        }
        return null;
    }

    private static boolean a(@NotNull buh_0 buh_02) {
        return switch (buh_02) {
            case buh_0.jot, buh_0.jow, buh_0.joy -> false;
            default -> true;
        };
    }

    public bde_2 dbM() {
        return this.hGa;
    }

    public void a(@NotNull bde_2 bde_22) {
        this.hGa = bde_22;
        fse_1.gFu().a((aef_2)this, hGc);
    }

    private <T extends bug_0<bci_1>> Optional<T> b(buh_0 buh_02) {
        return Optional.ofNullable(this.hGb.get((Object)buh_02));
    }

    public void a(bug_0<bci_1> bug_02) {
        this.hGb.remove((Object)bug_02.dcz());
        if (bug_02.isValid()) {
            this.hGb.put(bug_02.dcz(), bug_02);
        }
        fse_1.gFu().a((aef_2)this, hGd);
    }

    public void b(bug_0<bci_1> bug_02) {
        this.c(bug_02.dcz());
    }

    public void c(buh_0 buh_02) {
        this.hGb.remove((Object)buh_02);
    }

    public List<bug_0<bci_1>> dbN() {
        return ImmutableList.copyOf(this.hGb.values());
    }

    public boolean d(buh_0 buh_02) {
        return this.hGb.containsKey((Object)buh_02);
    }

    public void clear() {
        this.hGb.clear();
    }
}

