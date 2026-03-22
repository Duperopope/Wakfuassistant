/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.google.common.base.Strings;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cEy
 */
@fyf_0
public class cey_2 {
    public static final String PACKAGE = "wakfu.encyclopedia";
    private static final ccf_2 mUZ = new ccf_2();

    public static void selectPanel(fiq_1 fiq_12, String string) {
        mUZ.eJG();
        bpr_1.dh(string).ifPresent(bpr_12 -> dae_0.b((short)19747, bpr_12));
    }

    public static void goToFirstPage(fiq_1 fiq_12) {
        dae_0.b((short)17037, (Object)bpq_1.iVg);
    }

    public static void goToPreviousPage(fiq_1 fiq_12) {
        dae_0.b((short)17037, (Object)bpq_1.iVh);
    }

    public static void goToNextPage(fiq_1 fiq_12) {
        dae_0.b((short)17037, (Object)bpq_1.iVi);
    }

    public static void goToLastPage(fiq_1 fiq_12) {
        dae_0.b((short)17037, (Object)bpq_1.iVj);
    }

    public static void mouseWheelScroll(flp_2 flp_22) {
        bpq_1 bpq_12 = flp_22.gEo() > 0 ? bpq_1.iVi : bpq_1.iVh;
        dae_0.b((short)17037, (Object)bpq_12);
        fyd_0.closePopup(null);
    }

    public static void goBackInHistory(fiq_1 fiq_12) {
        dae_0.cV((short)16212);
    }

    public static void goForwardInHistory(fiq_1 fiq_12) {
        dae_0.cV((short)17021);
    }

    public static void highlightContainer(fiq_1 fiq_12, faw_2 faw_22) {
        faw_22.setStyle("white10");
    }

    public static void unhighlightContainer(fiq_1 fiq_12, faw_2 faw_22) {
        faw_22.setStyle("__empty__");
    }

    public static void toggleCollapseSector(fiq_1 fiq_12, String string) {
        buh_0 buh_02 = buh_0.valueOf(string.toUpperCase());
        dae_0.b((short)16192, (Object)buh_02);
    }

    public static void filterCurrentPanelByName(fli_2 fli_22, fdv_1 fdv_12) {
        if (fli_22.bCC() == 10) {
            mUZ.clear();
            cey_2.pv(fdv_12.getText());
            return;
        }
        String string = fdv_12.getText();
        mUZ.a(buh_0.jot.ordinal(), () -> cey_2.pv(string));
    }

    public static void clearCurrentPanelNameSearch(fiq_1 fiq_12) {
        mUZ.clear();
        cey_2.pv("");
    }

    private static void pv(@Nullable String string) {
        String string2 = Strings.isNullOrEmpty((String)string) ? "" : BH.aT(string);
        cey_2.a(new bpp_0(string2));
    }

    public static void filterMonstersByName(fli_2 fli_22, fdv_1 fdv_12, fry_1 fry_12) {
        fry_12.getValueOfSelectedButton().map(Integer::parseInt).flatMap(bqc_0::mL).ifPresent(bqc_02 -> {
            if (fli_22.bCC() == 10) {
                mUZ.clear();
                cey_2.a(fdv_12.getText(), bqc_02);
                return;
            }
            String string = fdv_12.getText();
            mUZ.a(buh_0.jot.ordinal(), () -> cey_2.a(string, bqc_02));
        });
    }

    public static void changeMonsterNameSearchType(fiq_1 fiq_12, fry_1 fry_12, fdv_1 fdv_12) {
        fry_12.getValueOfSelectedButton().map(Integer::parseInt).flatMap(bqc_0::mL).ifPresent(bqc_02 -> {
            mUZ.clear();
            cey_2.a(fdv_12.getText(), bqc_02);
        });
    }

    private static void a(@Nullable String string, @NotNull bqc_0 bqc_02) {
        String string2 = Strings.isNullOrEmpty((String)string) ? "" : BH.aT(string);
        bqg_0 bqg_02 = switch (bqc_02) {
            default -> throw new MatchException(null, null);
            case bqc_0.iYK -> new bpp_0(string2);
            case bqc_0.iYL -> new bqb_0(string2);
            case bqc_0.iYM -> new bqa_0(string2);
            case bqc_0.iYN -> new bpZ(string2);
        };
        cey_2.a(bqg_02);
    }

    public static void filterCurrentPanelWithCurrentLevelSlice(fiq_1 fiq_12, fdu_1 fdu_12, fdu_1 fdu_13, bpx_0 bpx_02) {
        bpo_0 bpo_02;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        Bu<Short, Short> bu = eIi.dD(bgt_02.cmL());
        long l = bu.getFirst().shortValue();
        long l2 = bu.aHI().shortValue();
        bpo_0 bpo_04 = new bpo_0(l, l2);
        boolean bl = bpx_02.b(buh_0.jou).map(bpo_03 -> bpo_03.equals(bpo_04)).orElse(false);
        mUZ.LQ(buh_0.jou.ordinal());
        if (bl) {
            fdu_12.clear();
            fdu_13.clear();
            bpo_02 = new bpo_0(null, null);
        } else {
            fdu_12.setText(l);
            fdu_13.setText(l2);
            bpo_02 = bpo_04;
        }
        cey_2.a((bug_0<bpb_1>)bpo_02);
    }

    public static void filterCurrentPanelByLevel(fli_2 fli_22, fdu_1 fdu_12, fdu_1 fdu_13) {
        Long l = cfe_1.getNumericalValue(fdu_12);
        Long l2 = cfe_1.getNumericalValue(fdu_13);
        bpo_0 bpo_02 = new bpo_0(l, l2);
        if (fli_22.bCC() == 10) {
            mUZ.clear();
            cey_2.a((bug_0<bpb_1>)bpo_02);
            return;
        }
        mUZ.a(buh_0.jou.ordinal(), () -> cey_2.a((bug_0<bpb_1>)bpo_02));
    }

    public static void toggleCurrentPanelMonsterTypeFilter(fiq_1 fiq_12, bqk_1 bqk_12, bpx_0 bpx_02) {
        bqk_12.setSelected(!bqk_12.bqr());
        EnumSet enumSet = bpx_02.b(buh_0.jow).map(bqf_0::dDX).map(EnumSet::copyOf).orElseGet(() -> EnumSet.noneOf(bqe_0.class));
        if (bqk_12.bqr()) {
            enumSet.add(bqk_12.dEb());
        } else {
            enumSet.remove((Object)bqk_12.dEb());
        }
        cey_2.a(new bqf_0(enumSet));
    }

    public static void toggleCapturableMonsterFilter(fiq_1 fiq_12, fdd_2 fdd_22) {
        cey_2.a(new bpY(fdd_22.getSelected()));
    }

    public static void filterByCurrentTerritory(fiq_1 fiq_12, bpz_0 bpz_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        Optional<eIb> optional = eId.quO.pC(bgt_02.aqZ());
        if (optional.isPresent()) {
            cey_2.a(bpz_02, optional.get().d());
            return;
        }
        Optional optional2 = bwz_0.jAA.kV(bgt_02.aqZ()).flatMap(bxa_02 -> bwz_0.jAA.Ga(bxa_02.d()));
        if (optional2.isPresent()) {
            cey_2.a(bpz_02, (Integer)optional2.get());
            return;
        }
        int n = bgt_02.dlp();
        if (n == -1) {
            cey_2.eKh();
            return;
        }
        Optional<bql_1> optional3 = cey_2.d(bpz_02.dDj(), n);
        if (optional3.isEmpty()) {
            cey_2.eKh();
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        optional3.ifPresent(bql_12 -> hashSet.add(bql_12.clk()));
        bqh_0 bqh_02 = new bqh_0(hashSet);
        if (bqh_02.equals(bpz_02.b(buh_0.joR).orElse(null))) {
            cey_2.a(new bqh_0(Collections.emptySet()));
            optional3.ifPresent(bql_12 -> bql_12.gQ(false));
        } else {
            cey_2.a(bqh_02);
        }
    }

    private static void a(bpz_0 bpz_02, int n) {
        cey_2.a(new bqh_0(Collections.emptySet()));
        bpz_02.dDj().forEach(bql_12 -> bql_12.gQ(false));
        Optional optional = bpz_02.b(buh_0.jot);
        bpZ bpZ2 = new bpZ(n);
        if (optional.isPresent() && bpZ2.equals(optional.get())) {
            cey_2.a(new bpZ(""));
        } else {
            cey_2.a(bpZ2);
        }
        vt_0.b(() -> fse_1.gFu().a((aef_2)bpz_02, "nameFilter", "monsterSearchType"));
    }

    private static void eKh() {
        String string = aum_0.cWf().c("encyclopedia.current.territory.no.monsters", new Object[0]);
        byj_1.epo().a(byc_1.b(byh_1.lAG, string));
    }

    private static Optional<bql_1> d(List<bql_1> list, int n) {
        bql_1 bql_12 = null;
        for (bql_1 bql_13 : list) {
            boolean bl = bql_13.clk() == n;
            bql_13.gQ(bl);
            if (!bl) continue;
            bql_12 = bql_13;
        }
        return Optional.ofNullable(bql_12);
    }

    public static void toggleCurrentPanelTerritoryFilter(fiq_1 fiq_12, bql_1 bql_12, bpx_0 bpx_02) {
        bql_12.setSelected(!bql_12.bqr());
        Set set = bpx_02.b(buh_0.joR).map(bqh_0::dDY).map(HashSet::new).orElseGet(HashSet::new);
        if (bql_12.bqr()) {
            set.add(bql_12.clk());
        } else {
            set.remove(bql_12.clk());
        }
        cey_2.a(new bqh_0(set));
    }

    public static void toggleCurrentPanelRarityFilter(fiq_1 fiq_12, bil_1 bil_12, bpx_0 bpx_02) {
        bil_12.setSelected(!bil_12.bqr());
        EnumSet enumSet = bpx_02.b(buh_0.jov).map(bpV::dDQ).map(EnumSet::copyOf).orElseGet(() -> EnumSet.noneOf(fgj.class));
        if (bil_12.bqr()) {
            enumSet.add(bil_12.dxF());
        } else {
            enumSet.remove(bil_12.dxF());
        }
        cey_2.a(new bpV(enumSet));
    }

    public static void toggleCurrentPanelItemAcquisitionFilter(fiq_1 fiq_12, bqj_1 bqj_12, bpx_0 bpx_02) {
        bqj_12.setSelected(!bqj_12.bqr());
        EnumSet enumSet = bpx_02.b(buh_0.joI).map(bps_1::dDM).map(EnumSet::copyOf).orElseGet(() -> EnumSet.noneOf(bpr_0.class));
        if (bqj_12.bqr()) {
            enumSet.add(bqj_12.dDr());
        } else {
            enumSet.remove((Object)bqj_12.dDr());
        }
        cey_2.a(new bps_1(enumSet));
    }

    public static void toggleCurrentPanelBindTypeFilter(fiq_1 fiq_12, bqi_1 bqi_12, bpx_0 bpx_02) {
        bqi_12.setSelected(!bqi_12.bqr());
        EnumSet enumSet = bpx_02.b(buh_0.joJ).map(bpu_0::dDP).map(EnumSet::copyOf).orElseGet(() -> EnumSet.noneOf(bpT.class));
        if (bqi_12.bqr()) {
            enumSet.add(bqi_12.dEa());
        } else {
            enumSet.remove((Object)bqi_12.dEa());
        }
        cey_2.a(new bpu_0(enumSet));
    }

    public static void toggleCurrentPanelEquipmentPositionFilter(fiq_1 fiq_12, ben_0 ben_02, bpx_0 bpx_02) {
        ben_02.gQ(!ben_02.bqr());
        EnumSet enumSet = bpx_02.b(buh_0.jow).map(bpq_0::dDI).map(EnumSet::copyOf).orElseGet(() -> EnumSet.noneOf(ffS.class));
        if (ben_02.bqr()) {
            enumSet.add(ben_02.dSL());
        } else {
            enumSet.remove(ben_02.dSL());
        }
        cey_2.a(new bpq_0(enumSet));
    }

    public static void toggleCharacteristicsGroup(fiq_1 fiq_12, bhe_1 bhe_12) {
        vt_0.b(bhe_12::dLG);
    }

    public static void toggleCharacteristics(fiq_1 fiq_12, bhc_1 bhc_12, fdu_1 fdu_12, fdu_1 fdu_13, bpx_0 bpx_02) {
        boolean bl;
        boolean bl2 = cfe_1.getNumericalValue(fdu_12) != null;
        boolean bl3 = bl = cfe_1.getNumericalValue(fdu_13) != null;
        if (bl2 || bl) {
            fdu_12.clear();
            fdu_13.clear();
            cey_2.a(bhc_12, bpx_02, null, null);
        } else {
            fdu_12.setText("1");
            fdu_13.clear();
            cey_2.a(bhc_12, bpx_02, 1L, null);
        }
    }

    public static void filterCurrentPanelByCharac(fiq_1 fiq_12, bhc_1 bhc_12, fdu_1 fdu_12, fdu_1 fdu_13, bpx_0 bpx_02) {
        Long l = cfe_1.getNumericalValue(fdu_12);
        Long l2 = cfe_1.getNumericalValue(fdu_13);
        mUZ.a(buh_0.joH.ordinal(), () -> cey_2.a(bhc_12, bpx_02, l, l2));
    }

    private static void a(bhc_1 bhc_12, bpx_0 bpx_02, @Nullable Long l, @Nullable Long l2) {
        bhc_12.ai(l == null ? null : Integer.valueOf(l.intValue()));
        bhc_12.aj(l2 == null ? null : Integer.valueOf(l2.intValue()));
        EnumMap enumMap = bpx_02.b(buh_0.joH).map(bpl_0::dDE).map(EnumMap::new).orElseGet(() -> new EnumMap(fja.class));
        enumMap.put(bhc_12.dWK(), new bpm_0(l, l2));
        cey_2.a(new bpl_0(enumMap));
    }

    public static void toggleItemTypeCollapse(fiq_1 fiq_12, bEO bEO2) {
        vt_0.b(bEO2::dLG);
    }

    public static void toggleCurrentPanelItemTypeFilter(fiq_1 fiq_12, bEO bEO3, bpa_1 bpa_12) {
        bEO3.hD(!bEO3.bqr());
        Set set = bpa_12.b(buh_0.jow).map(bpX::dDS).map(HashSet::new).orElseGet(HashSet::new);
        bEO3.k(bEO2 -> {
            if (bEO2.bqr()) {
                set.add(bEO2.dGh().aIi());
            } else {
                set.remove(bEO2.dGh().aIi());
            }
        });
        cey_2.a(new bpX(set, bpa_12));
    }

    private static void a(bug_0<bpb_1> bug_02) {
        dae_0.b((short)18925, bug_02);
    }

    public static void clearCurrentPanelFilters(fiq_1 fiq_12) {
        dae_0.cV((short)17323);
    }

    public static void setCurrentPanelSort(fiq_1 fiq_12, bpt_0 bpt_02) {
        dae_0.b((short)18017, (Object)bpt_02.dCS());
    }

    public static void equipmentPositionPopup(fiq_1 fiq_12, frx_1 frx_12, fdd_2 fdd_22, ben_0 ben_02) {
        fse_1.gFu().f("encyclopediaPopupText", ben_02.getName());
        fyd_0.popup(fiq_12, frx_12, fdd_22);
    }

    public static void popup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22) {
        cey_2.popup(fiq_12, frx_12, fes_22, null);
    }

    public static void popup(fiq_1 fiq_12, frx_1 frx_12, fes_2 fes_22, @Nullable String string) {
        if (string != null) {
            fse_1.gFu().f("encyclopediaPopupText", string);
            fyd_0.popup(fiq_12, frx_12, fes_22);
        } else {
            fyd_0.closePopup(fiq_12);
        }
    }

    public static void showRemainingLootsInPopup(fiq_1 fiq_12, bpg_1 bpg_12, frx_1 frx_12, fes_2 fes_22) {
        fse_1.gFu().f("encyclopediaHoveredMonster", bpg_12);
        fyd_0.popup(fiq_12, frx_12, fes_22);
    }

    public static void displayElementTranslations(fiq_1 fiq_12, bpb_1 bpb_12, frx_1 frx_12, fes_2 fes_22) {
        if (!bpi_1.isEnabled()) {
            return;
        }
        bpi_1 bpi_12 = new bpi_1(bpb_12);
        fse_1.gFu().f("encyclopediaTranslations", bpi_12);
        fyd_0.popup(frx_12, fes_22);
    }

    public static void hideElementTranslations(fiq_1 fiq_12) {
        fse_1.gFu().f("encyclopediaTranslations", (Object)null);
        fyd_0.closePopup(fiq_12);
    }

    public static void clickOnItem(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bek_0)) {
            return;
        }
        bek_0 bek_02 = (bek_0)object;
        if (flg_22.gEm()) {
            if (flg_22.gDR()) {
                aPe.a(bek_02.duo());
            } else {
                cdd_2.sendOpenCloseItemDetailMessage("encyclopediaDialog", bek_02.duo());
            }
        }
    }

    public static void clickOnAcquisition(fiq_1 fiq_12, bpe_1 bpe_12, bpd_1 bpd_12) {
        daz_0 daz_02 = new daz_0(bpe_12, bpd_12.dDr());
        aaw_1.bUq().h(daz_02);
    }

    public static void showAchievementPopup(flr_1 flr_12, frx_1 frx_12, bci_1 bci_12, fes_2 fes_22) {
        if (!bci_12.isVisible()) {
            return;
        }
        fse_1.gFu().f("describedAchievement", bci_12);
        fyd_0.popup(frx_12, fes_22);
    }

    public static void followAchievement(flv_2 flv_22, bci_1 bci_12) {
        cdc_2.followAchievement(flv_22, bci_12);
    }

    public static void openAchievementPopup(fiq_1 fiq_12, bci_1 bci_12) {
        if (!bci_12.isVisible()) {
            return;
        }
        dah_0 dah_02 = new dah_0(bci_12);
        dah_02.fa("encyclopediaLinkedAchievementsDialog");
        aaw_1.bUq().h(dah_02);
    }

    public static void openAchievementInLogbook(fiq_1 fiq_12, bci_1 bci_12) {
        cek_2.openAchievementDialog(fiq_12, bci_12);
    }

    public static void searchItemInEncyclopedia(fiq_1 fiq_12, bek_0 bek_02) {
        cuj_2.eRB().a(bek_02);
    }

    public static void clickOnMonster(flp_2 flp_22, bpg_1 bpg_12) {
        if (cey_2.d((fes_2)flp_22.gBE())) {
            return;
        }
        if (flp_22.fca() == 1) {
            cuj_2.eRB().A(() -> {
                bpg_12.O(null);
                fse_1.gFu().f("encyclopediaOpenMonster", bpg_12);
            });
        } else if (flp_22.fca() == 3 && flp_22.gDR()) {
            aPe.a(bpg_12.dDw());
        }
    }

    private static boolean d(fes_2 fes_22) {
        fcv_1 fcv_12 = fes_22.getParentOfType(fcv_1.class);
        if (fcv_12 == null) {
            return false;
        }
        return fcv_12.getItemValue() instanceof bpf_1;
    }

    public static void closeMonsterPage(fiq_1 fiq_12, bpg_1 bpg_12) {
        cuj_2.eRB().A(() -> {
            bpg_12.O(null);
            fse_1.gFu().f("encyclopediaOpenMonster", (Object)null);
        });
    }

    public static void clickOnMonsterActor(flp_2 flp_22, bpg_1 bpg_12) {
        if (flp_22.fca() == 3 && flp_22.gDR()) {
            aPe.a(bpg_12.dDw());
        }
    }

    public static void searchMonsterFamily(fiq_1 fiq_12, bpg_1 bpg_12) {
        if (!bpg_12.dDw().drD()) {
            return;
        }
        dba_0 dba_02 = new dba_0(bpr_1.iVl, new bqa_0(bpg_12.dDw().cqy()), "nameFilter", "monsterSearchType");
        aaw_1.bUq().h(dba_02);
    }

    public static void openMapOnTerritory(fiq_1 fiq_12, bph_1 bph_12) {
        cey_2.openMapOnTerritory(fiq_12, bph_12.clk());
    }

    public static void openMapOnTerritory(fiq_1 fiq_12, Integer n) {
        cey_2.getMapZone(n).ifPresent(biq_12 -> {
            MapCommand.cTQ();
            bif_2.dYO().a((biq_1)biq_12);
        });
    }

    public static void openMapOnInstance(fiq_1 fiq_12, Short s) {
        cey_2.LU(s.shortValue()).ifPresent(biq_12 -> {
            MapCommand.cTQ();
            bif_2.dYO().a((biq_1)biq_12);
        });
    }

    public static Optional<biq_1> getMapZone(int n) {
        foM foM2 = fpk.sNF.Yn(n);
        if (foM2 == null) {
            return Optional.empty();
        }
        biq_1 biq_12 = big_2.y(n, (short)foM2.aqZ());
        if (biq_12 != null) {
            return Optional.of(biq_12);
        }
        biq_1 biq_13 = big_2.l((short)foM2.aqZ(), true);
        return Optional.ofNullable(biq_13);
    }

    private static Optional<biq_1> LU(int n) {
        biq_1 biq_12 = big_2.l(n, false);
        if (biq_12 != null) {
            return Optional.of(biq_12);
        }
        Optional<biq_1> optional = eId.quO.pC(n).map(eIb::aqZ).map(l -> big_2.l(l, false));
        if (optional.isPresent()) {
            return optional;
        }
        return bwz_0.jAA.kV(n).map(bxa_0::coNN).map(l -> big_2.l(l, false));
    }

    public static void changeOpenMonsterDisplayedLevel(flw_2 flw_22) {
    }

    public static void changeOpenMonsterDisplayedLevel(flw_2 flw_22, bpg_1 bpg_12) {
        bpg_12.Fd((int)flw_22.getValue());
    }

    public static void showLootItemDetails(flg_2 flg_22, frx_1 frx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bpf_1)) {
            return;
        }
        bpf_1 bpf_12 = (bpf_1)object;
        fse_1.gFu().f("encyclopediaHoveredLoot", bpf_12);
        cdd_2.showItemPopup(flg_22, frx_12);
    }

    public static void closeLootPopup(fiq_1 fiq_12) {
        fse_1.gFu().f("encyclopediaHoveredLoot", (Object)null);
        fyd_0.closePopup(fiq_12);
    }

    public static void clickOnMonsterItem(flg_2 flg_22) {
        cey_2.closeLootPopup(flg_22);
        if (flg_22.gEk()) {
            Object object = flg_22.getItemValue();
            if (!(object instanceof bek_0)) {
                return;
            }
            bek_0 bek_02 = (bek_0)object;
            object = bek_02.duo();
            dba_0 dba_02 = new dba_0(bpm_1.k((bgv_2)object), new bpn_0(((fhc_0)object).d(), ((bgv_2)object).getName()), "nameFilter");
            aaw_1.bUq().h(dba_02);
        } else {
            cey_2.clickOnItem(flg_22);
        }
    }
}

