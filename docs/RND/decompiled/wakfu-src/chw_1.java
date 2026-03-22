/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.wrapper.SteamApi
 */
import com.ankamagames.steam.wrapper.SteamApi;
import java.text.ParseException;
import java.util.Objects;

/*
 * Renamed from cHw
 */
@fyf_0
public class chw_1 {
    public static final String PACKAGE = "wakfu.webShop";

    public static void first(fiq_1 fiq_12, bpp_2 bpp_22) {
        bpp_22.dxn();
    }

    public static void previous(fiq_1 fiq_12, bpp_2 bpp_22) {
        bpp_22.dxo();
    }

    public static void next(fiq_1 fiq_12, bpp_2 bpp_22) {
        bpp_22.dxp();
    }

    public static void last(fiq_1 fiq_12, bpp_2 bpp_22) {
        bpp_22.dxq();
    }

    public static void selectCategory(flk_2 flk_22, bpp_2 bpp_22) {
        if (flk_22.bqr()) {
            chw_1.search((fiq_1)flk_22, bpp_22, (bpu_1)flk_22.getValue());
        }
    }

    public static void selectCategory(fiq_1 fiq_12, bpp_2 bpp_22, bpu_1<?> bpu_12) {
        if (bpp_22.eiY() != bpu_12) {
            chw_1.search(fiq_12, bpp_22, bpu_12);
        }
    }

    public static void discoverHighLight(fiq_1 fiq_12, bpp_2 bpp_22, bpw_1<?, ?> bpw_12) {
        if (bpw_12.aEc()) {
            chw_1.goToHighlightCategory(fiq_12, bpp_22, bpw_12);
        } else if (bpw_12.eiB()) {
            chw_1.openLink(fiq_12, bpp_22, bpw_12);
        }
    }

    public static void goToHighlightCategory(fiq_1 fiq_12, bpp_2 bpp_22, bpw_1<?, ?> bpw_12) {
        bpu_1<?> bpu_12 = bpp_22.at(bpw_12.eiz());
        if (bpu_12 != null) {
            bpp_22.d(bpu_12);
            bpp_22.nt("");
        } else {
            aaw_1.bUq().h(new dcI(18313, bpw_12.eiz()));
        }
    }

    public static void openLink(fiq_1 fiq_12, bpp_2 bpp_22, bpw_1<?, ?> bpw_12) {
        String string = bpw_12.eiy();
        if (string == null) {
            return;
        }
        dae_0 dae_02 = new dae_0(19180);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void selectCarrouselHighlight(fiq_1 fiq_12, bpp_2 bpp_22, bpw_1<?, ?> bpw_12) {
        int n = bpp_22.a(bpw_12);
        if (n == -1) {
            return;
        }
        dae_0 dae_02 = new dae_0(18711);
        dae_02.sY(n);
        aaw_1.bUq().h(dae_02);
    }

    public static void search(fiq_1 fiq_12, bpp_2 bpp_22, bpu_1<?> bpu_12) {
        bpp_22.d(bpu_12);
        bpp_22.nt("");
    }

    public static void home(fiq_1 fiq_12, bpp_2 bpp_22) {
        fdz_1 fdz_12 = (fdz_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("textEditor");
        if (fdz_12 != null) {
            fdz_12.setText("");
        }
        bpp_22.eja();
    }

    public static void search2(flv_2 flv_22, bpp_2 bpp_22) {
        if (flv_22.bqr()) {
            // empty if block
        }
    }

    public static void search3(flv_2 flv_22, bpp_2 bpp_22) {
        if (flv_22.bqr()) {
            // empty if block
        }
    }

    public static void search4(flv_2 flv_22, bpp_2 bpp_22) {
        if (flv_22.bqr()) {
            // empty if block
        }
    }

    public static void search(fiq_1 fiq_12, bpp_2 bpp_22, fdz_1 fdz_12) {
        bpp_22.nt(fdz_12.getText());
    }

    public static void search(fli_2 fli_22, bpp_2 bpp_22) {
        fdu_1 fdu_12 = (fdu_1)fli_22.gBE();
        if (fli_22.bCC() == 10) {
            bpp_22.nt(fdu_12.getText());
        }
    }

    public static void resetSearch(fiq_1 fiq_12, bpp_2 bpp_22, fdz_1 fdz_12) {
        fdz_12.setText("");
        bpp_22.nt("");
    }

    public static void quickBuy(fiq_1 fiq_12, bpp_2 bpp_22, bpt_1<?, ?> bpt_12) {
        bpp_22.c(bpt_12);
    }

    public static void oneClick(fiq_1 fiq_12, bpp_2 bpp_22, bpt_1<?, ?> bpt_12) {
        dae_0 dae_02 = new dae_0(16018);
        dae_02.D(new Bu(bpt_12, bpp_22));
        aaw_1.bUq().h(dae_02);
    }

    public static void openItemDescription(flp_2 flp_22, bgv_2 bgv_22) {
        if (flp_22.gEm()) {
            cdd_2.sendOpenCloseItemDetailMessage(((fhv_1)flp_22.gBE()).getElementMap().gAt(), bgv_22);
        }
    }

    public static void openArticleDescription(fiq_1 fiq_12, bpt_1<?, ?> bpt_12) {
        cyr_2.eYA().h(bpt_12);
    }

    public static void openStuffPreviewWindow(fiq_1 fiq_12, bpt_1<?, ?> bpt_12) {
        bgv_2 bgv_22 = chw_1.getPetItemReference(bpt_12);
        if (bgv_22 != null) {
            cdd_2.sendOpenCloseItemDetailMessage(bgv_22, fbj_1.getInstance().getWidth() / 2 - ((fhv_1)fiq_12.gBE()).getRenderableParent().getWidth() / 2, fbj_1.getInstance().getHeight() / 2 - ((fhv_1)fiq_12.gBE()).getRenderableParent().getHeight());
        } else {
            bpt_12.eip();
        }
    }

    public static bgv_2 getPetItemReference(bpt_1<?, ?> bpt_12) {
        return bpt_12.eik().stream().map(bpk_2::eiM).filter(Objects::nonNull).filter(fhc_0::adO).findFirst().orElse(null);
    }

    public static void buyOgrines(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18610));
    }

    public static void mouseOverArticle(flp_2 flp_22, bpt_1<?, ?> bpt_12) {
        fse_1.gFu().f("overArticle", bpt_12);
    }

    public static void mouseOutArticle(flp_2 flp_22, bpt_1<?, ?> bpt_12) {
        fse_1.gFu().f("overArticle", (Object)null);
    }

    private static void pn(String string) {
        if (bMX.kAi.blc()) {
            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string);
        } else {
            aet_1.ht(string);
        }
    }

    public static void goToConversionStone(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19609));
    }

    public static void goToConversionStoneTab(fiq_1 fiq_12, String string) {
        dae_0 dae_02 = new dae_0(17349);
        dae_02.ay(Byte.valueOf(string));
        aaw_1.bUq().h(dae_02);
    }

    public static void conversionStoneGoToArticle(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17090));
    }

    public static void conversionStoneMultipleGoToArticle(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(18972));
    }

    public static void conversionStoneSell(fiq_1 fiq_12, fdu_1 fdu_12) {
        dae_0 dae_02 = new dae_0(18504);
        dae_02.fa(fdu_12.getText());
        aaw_1.bUq().h(dae_02);
    }

    public static void conversionStoneBuy(fiq_1 fiq_12, bqq_2 bqq_22) {
        dae_0 dae_02 = new dae_0(17352);
        dae_02.D(bqq_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void conversionStoneRefreshSell(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16390));
    }

    public static void conversionStoneRefreshBuy(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17594));
    }

    public static void conversionStoneRefreshOffersList(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17497));
    }

    public static void conversionStoneCancelOffer(fiq_1 fiq_12, bqq_2 bqq_22) {
        dae_0 dae_02 = new dae_0(16908);
        dae_02.D(bqq_22);
        aaw_1.bUq().h(dae_02);
    }

    public static void conversionStoneChangeOwnOffer(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(17890));
    }

    public static void onConversionStoneSellPriceChanged(fiq_1 fiq_12) {
        long l;
        ayx_2 ayx_22;
        if (fiq_12 instanceof fli_2 && ((flf_2)(ayx_22 = (fli_2)fiq_12)).gDQ()) {
            return;
        }
        ayx_22 = (fdu_1)fiq_12.gBE();
        String string = ((fdu_1)ayx_22).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = aum_0.cWf().cQ(string);
        }
        catch (ParseException parseException) {
            l = 0L;
        }
        dae_0 dae_02 = new dae_0(18708);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }
}

