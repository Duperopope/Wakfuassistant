/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cEx
 */
@fyf_0
public class cex_1 {
    public static final String PACKAGE = "wakfu.enchantment";

    private static void a(flv_2 flv_22, String string, short s) {
        if (!flv_22.bqr()) {
            return;
        }
        Optional<fhw_0> optional = fhw_0.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(s);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    private static <T, F extends boq_1<T>> Set<T> a(Optional<F> optional, T t, boolean bl) {
        Set set = optional.map(boq_1::dCe).map(HashSet::new).orElseGet(HashSet::new);
        if (bl) {
            set.add(t);
        } else {
            set.remove(t);
        }
        return set;
    }

    public static void slotPopup(fiq_1 fiq_12, bES bES2, frx_1 frx_12, fes_2 fes_22) {
        fse_1.gFu().f("hoveredSlot", bES2);
        fyd_0.popup(fiq_12, frx_12, fes_22);
    }

    public static void resetItemsListFilters(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19886));
    }

    public static void filterItemsListByName(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = Objects.requireNonNullElse(fdv_12.getText(), "");
        String string2 = BH.aT(string);
        if (string2.startsWith(":")) {
            cex_1.a(box_0.ml(string2.substring(1)));
        } else if (string2.startsWith("/")) {
            cex_1.a(new boy_0(string2.substring(1)));
        } else {
            cex_1.a(new bEn(string2));
        }
    }

    public static void addItemsListEquippedFilter(fiq_1 fiq_12, String string) {
        bot_1.dh(string).ifPresent(bot_12 -> cex_1.a(new bos_1((bot_1)((Object)bot_12))));
    }

    public static void removeItemsListIdentificationFilter(fiq_1 fiq_12) {
        cex_1.a(new bou_0(null));
    }

    public static void addItemsListIdentificationFilter(fiq_1 fiq_12, String string) {
        cex_1.a(new bou_0(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void removeItemsListShardsFilter(fiq_1 fiq_12) {
        cex_1.a(new bow_1(null));
    }

    public static void addItemsListShardsFilter(fiq_1 fiq_12, String string) {
        cex_1.a(new bow_1(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void removeItemsListSublimationsFilter(fiq_1 fiq_12) {
        cex_1.a(new boz_1(null));
    }

    public static void addItemsListSublimationsFilter(fiq_1 fiq_12, String string) {
        cex_1.a(new boz_1(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    private static void a(bug_0<ffV> bug_02) {
        dae_0 dae_02 = new dae_0(17490);
        dae_02.D(bug_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleItemsListRarityFilter(fiq_1 fiq_12, bop_1 bop_12, bil_1 bil_12) {
        Optional optional = bop_12.b(buh_0.jov);
        bil_12.setSelected(!bil_12.bqr());
        cex_1.a(new bov_0(cex_1.a(optional, bil_12.dxF(), bil_12.bqr())));
    }

    public static void sortItemsListBy(flv_2 flv_22, String string) {
        cex_1.a(flv_22, string, (short)19650);
    }

    public static void identifyItem(fiq_1 fiq_12, ffV ffV2) {
        ctj_2.a(ffV2, null);
    }

    public static void selectItem(flk_2 flk_22, fbz_2 fbz_22) {
        if (!flk_22.bqr()) {
            return;
        }
        if (!(flk_22.getValue() instanceof ffV)) {
            return;
        }
        fbz_22.setSelectedOffset(-1);
        cex_1.selectItem((ffV)flk_22.getValue());
    }

    public static void selectItem(@Nullable ffV ffV2) {
        if (ffV2 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(19559);
        dae_02.D(ffV2);
        aaw_1.bUq().h(dae_02);
    }

    public static void showItemPopup(fiq_1 fiq_12, ffV ffV2, frx_1 frx_12, fes_2 fes_22) {
        cgn_1.showPopup(fiq_12, ffV2, frx_12, fes_22);
    }

    public static void unselectItem(fiq_1 fiq_12, fbz_2 fbz_22, fry_1 fry_12) {
        fbz_22.setSelectedOffset(-1);
        fry_12.gFq();
        aaw_1.bUq().h(new dae_0(18555));
    }

    public static void selectPanel(fiq_1 fiq_12, String string) {
        Optional<bov_1> optional = bov_1.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(18599);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void sortSimilarItemsListBy(flv_2 flv_22, String string) {
        cex_1.a(flv_22, string, (short)16722);
    }

    public static void removeSimilarItemsListIdentificationFilter(fiq_1 fiq_12) {
        cex_1.f(new bou_0(null));
    }

    public static void addSimilarItemsListIdentificationFilter(fiq_1 fiq_12, String string) {
        cex_1.f(new bou_0(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void removeSimilarItemsListShardsFilter(fiq_1 fiq_12) {
        cex_1.f(new bow_1(null));
    }

    public static void addSimilarItemsListShardsFilter(fiq_1 fiq_12, String string) {
        cex_1.f(new bow_1(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    private static void f(bug_0<ffV> bug_02) {
        dae_0 dae_02 = new dae_0(19615);
        dae_02.D(bug_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectItemToSacrifice(flk_2 flk_22) {
        if (!flk_22.bqr()) {
            return;
        }
        if (!(flk_22.getValue() instanceof ffV)) {
            return;
        }
        dae_0 dae_02 = new dae_0(16078);
        dae_02.D(flk_22.getValue());
        aaw_1.bUq().h(dae_02);
    }

    public static boolean openSimilarItem(fiq_1 fiq_12, ffV ffV2) {
        cex_1.selectItem(ffV2);
        return true;
    }

    public static void selectSacrificeAction(fiq_1 fiq_12, String string) {
        Optional<rb_0> optional = rb_0.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(17954);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void runSacrificeAction(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17188));
    }

    public static void selectSlotToChange(flv_2 flv_22, boz_0 boz_02, bod_0 bod_02) {
        if (!flv_22.bqr()) {
            return;
        }
        boz_02.a(bod_02);
    }

    public static void selectNewColor(flv_2 flv_22, boz_0 boz_02, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        rd_0 rd_02 = rd_0.di(string);
        if (rd_02 == null) {
            return;
        }
        boz_02.b(rd_02);
    }

    public static void selectAction(flv_2 flv_22, String string, bon_0 bon_02) {
        if (!flv_22.bqr()) {
            return;
        }
        Optional<rc_0> optional = rc_0.dh(string);
        optional.ifPresent(bon_02::b);
    }

    public static void runSlotAction(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19911));
    }

    public static void openBonusSelection(fiq_1 fiq_12, bok_0 bok_02) {
        bok_02.dBn();
    }

    public static void openBonusSelection(flp_2 flp_22, bom_0 bom_02, bok_0 bok_03, String string) {
        if (flp_22.gDT()) {
            boolean bl = Boolean.TRUE.toString().equalsIgnoreCase(string);
            bom_02.dBL().forEach(bok_02 -> {
                if (bl) {
                    if (bok_02.dBC().aJG()) {
                        bok_02.dBn();
                    }
                } else if (bok_02.dBl() != bol_0.iSd) {
                    bok_02.dBn();
                }
            });
        } else {
            cex_1.openBonusSelection(flp_22, bok_03);
        }
    }

    public static void removeSlotBonusTypeFilter(fiq_1 fiq_12, bok_0 bok_02) {
        bok_02.a((boj_0)null);
    }

    public static void addSlotBonusTypeFilter(fiq_1 fiq_12, bok_0 bok_02, String string) {
        boj_0.dh(string).ifPresent(bok_02::a);
    }

    public static void closeBonusSelection(flp_2 flp_22, bom_0 bom_02, bok_0 bok_03) {
        if (flp_22.gDT()) {
            bom_02.dBL().forEach(bok_02 -> {
                if (bok_02.dBl() == bol_0.iSg) {
                    bok_02.dBm();
                }
            });
        } else {
            bok_03.dBm();
        }
    }

    public static void selectBonus(flg_2 flg_22, bok_0 bok_02) {
        if (!(flg_22.getItemValue() instanceof bob_1)) {
            return;
        }
        bok_02.c((bob_1)flg_22.getItemValue());
        if (flg_22.gDT()) {
            bok_02.dBy();
        }
    }

    public static void decreaseBonusLevel(flp_2 flp_22, bok_0 bok_02) {
        if (flp_22.gDT()) {
            bok_02.dBz();
        } else {
            bok_02.dBA();
        }
    }

    public static void increaseBonusLevel(flp_2 flp_22, bok_0 bok_02) {
        if (flp_22.gDT()) {
            bok_02.dBy();
        } else {
            bok_02.dBx();
        }
    }

    public static void removeCurrentBonus(flp_2 flp_22, bom_0 bom_02, bok_0 bok_02) {
        if (flp_22.gDT()) {
            bom_02.dBL().forEach(bok_0::dBs);
        } else {
            bok_02.dBs();
        }
    }

    public static void restoreBonus(flp_2 flp_22, bom_0 bom_02, bok_0 bok_03) {
        if (flp_22.gDT()) {
            bom_02.dBL().forEach(bok_02 -> {
                if (bok_02.dBl() == bol_0.iSf) {
                    bok_02.dBt();
                }
            });
        } else {
            bok_03.dBt();
        }
    }

    public static void cancelAllChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19039));
    }

    public static void validateSlotChanges(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17753));
    }

    public static void filterSublimationsByName(fiq_1 fiq_12, fdv_1 fdv_12) {
        String string = Objects.requireNonNullElse(fdv_12.getText(), "");
        String string2 = BH.aT(string);
        if (string2.startsWith(":")) {
            cex_1.g(bpi_0.mm(string2.substring(1)));
        } else {
            cex_1.g(new bpg_0(string2));
        }
    }

    public static void toggleSublimationType(fiq_1 fiq_12, fdd_2 fdd_22) {
        dae_0 dae_02 = new dae_0(19256);
        dae_02.cC(fdd_22.getSelected());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleSublimationType(fiq_1 fiq_12, String string) {
        dae_0 dae_02 = new dae_0(19256);
        dae_02.cC(Boolean.TRUE.toString().equalsIgnoreCase(string));
        aaw_1.bUq().h(dae_02);
    }

    public static void removeSublimationsOwnedFilter(fiq_1 fiq_12) {
        cex_1.g(new bph_0(null));
    }

    public static void addSublimationOwnedFilter(fiq_1 fiq_12, String string) {
        cex_1.g(new bph_0(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void removeSublimationsValidForItemFilter(fiq_1 fiq_12) {
        cex_1.g(new bpk_0(null));
    }

    public static void addSublimationsValidForItemFilter(fiq_1 fiq_12, String string) {
        cex_1.g(new bpk_0(Boolean.TRUE.toString().equalsIgnoreCase(string)));
    }

    public static void toggleSublimationsLevelFilter(flv_2 flv_22, bpb_0 bpb_02, String string) {
        int n;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        if (n < 1 || n > 3) {
            return;
        }
        Optional optional = bpb_02.b(buh_0.jou);
        cex_1.g(new bpf_0(cex_1.a(optional, n, flv_22.bqr())));
    }

    private static void g(bug_0<bpe_0> bug_02) {
        dae_0 dae_02 = new dae_0(17798);
        dae_02.D(bug_02);
        aaw_1.bUq().h(dae_02);
    }

    public static void sortSublimationsBy(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        Optional<bpa_0> optional = bpa_0.dh(string);
        if (optional.isEmpty()) {
            return;
        }
        dae_0 dae_02 = new dae_0(16320);
        dae_02.D((Object)optional.get());
        aaw_1.bUq().h(dae_02);
    }

    public static void onHoverSublimationList(flg_2 flg_22, frx_1 frx_12) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bpe_0)) {
            return;
        }
        bpe_0 bpe_02 = (bpe_0)object;
        int n = bpe_02.dCA();
        cfg_2.displaySublimationPopup(n, frx_12, (fes_2)flg_22.gBE());
    }

    public static void selectSublimation(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bpe_0)) {
            return;
        }
        bpe_0 bpe_02 = (bpe_0)object;
        if (flg_22.gEk()) {
            object = new dae_0(16039);
            ((ama_1)object).sY(bpe_02.dCA());
            aaw_1.bUq().h((aam_2)object);
        } else if (flg_22.gEm()) {
            cfg_2.toggleSublimationDialog(bpe_02.dCA(), (fes_2)flg_22.gBE());
        }
    }

    public static void addSublimation(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16180));
    }

    public static void removeSublimation(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17215));
    }
}

