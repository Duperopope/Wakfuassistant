/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$cancelCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$cancelRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$getRateCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$getRateRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listBidsCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listBidsRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$sellCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$sellRequest
 *  com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken
 *  com.ankama.haapi.client.okhttp.wakfu.model.Rate
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleByKeyRequest
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi;
import com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken;
import com.ankama.haapi.client.okhttp.wakfu.model.Rate;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleByKeyRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

/*
 * Renamed from bQr
 */
public class bqr_2
implements aeh_2 {
    static final Logger kUN = Logger.getLogger(bqr_2.class);
    private static final Timer kUO = new Timer();
    private static final String kUP = "mode";
    private static final String kUQ = "offersList";
    private static final String kUR = "bestOffer";
    private static final String kUS = "price";
    private static final String kUT = "averagePrice";
    private static final String kUU = "averagePriceText";
    private static final String kUV = "lastRefreshDelayText";
    private static final String kUW = "ownPendingStoneAmount";
    private static final String kUX = "ownPendingStoneAmountText";
    private static final String kUY = "ownOffersCheckboxValue";
    private static final String kUZ = "canBuyBestOffer";
    private static final String kVa = "canBuyBestOfferText";
    private static final String kVb = "notificationMessage";
    private static final String kVc = "exchangeConversionStoneText";
    private static final String kVd = "exchangeKamasText";
    private static final String kVe = "canPurchaseStone";
    public static final int kVf = 6000;
    private static final Date kVg = new Date(2019, 10, 1, 10, 0, 0);
    private static final uw_0 kVh = new uw_0(0, 0, 10, 1, 11, 2019);
    private final List<OgrineToken> kVi = new ArrayList<OgrineToken>();
    private final List<bqq_2> kVj = new ArrayList<bqq_2>();
    bqw_2 kVk;
    private long kVl;
    private long kVm;
    private Rate kVn = new Rate();
    private bpt_1<?, ?> kVo;
    private bpt_1<?, ?> kVp;
    private java.time.Instant kVq = java.time.Instant.now();
    TimerTask kVr;
    private boolean kVs;
    private boolean kVt;
    String kVu;

    @Override
    public String[] bxk() {
        return new String[]{kUP, kUQ, kUR, kUS, kUT, kUU, kUV, kUW, kUX, kUY, kUZ, kVa, kVb, kVc, kVd};
    }

    public void bkZ() {
        if (this.kVo == null) {
            this.a((List<bpt_1<?, ?>> list) -> {
                this.kVo = this.c((List<bpt_1<?, ?>>)list, "CONVERSION_STONE");
            }, "CONVERSION_STONE");
        }
        if (this.kVp == null) {
            this.a((List<bpt_1<?, ?>> list) -> {
                this.kVp = this.c((List<bpt_1<?, ?>>)list, "CONVERSION_STONE_MULTI");
            }, "CONVERSION_STONE_MULTI");
        }
        this.ejq();
        this.ejn();
    }

    public void ip(boolean bl) {
        this.kVt = bl;
    }

    private bpt_1<?, ?> c(List<bpt_1<?, ?>> list, String string) {
        for (bpt_1<?, ?> bpt_12 : list) {
            if (bpt_12 == null || !Objects.equals(bpt_12.getKey(), string)) continue;
            return bpt_12;
        }
        return null;
    }

    private void ejm() {
        if (this.kVr != null) {
            this.kVr.cancel();
        }
        this.kVr = new bqs_2(this);
        kUO.scheduleAtFixedRate(this.kVr, 1000L, 1000L);
    }

    public void a(bqq_2 bqq_22) {
        Optional<OgrineToken> optional = bqq_22.ejk();
        if (optional.isEmpty()) {
            return;
        }
        OgrineToken ogrineToken = optional.get();
        Long l = ogrineToken.getId();
        OgrineTokenApi.cancelRequest cancelRequest2 = OgrineTokenApi.cancelRequest().tokenId(l);
        OgrineTokenApi.cancelCallback cancelCallback2 = OgrineTokenApi.cancelCallback().on204(apiResponse -> {
            this.ejn();
            this.ejs();
            this.E("webShop.conversion.stone.cancel.success.message", false);
        }).on403(apiResponse -> {
            kUN.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + String.valueOf(apiResponse)));
            this.E("webShop.conversion.stone.cancel.error.message", true);
        }).on404(apiResponse -> {
            kUN.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + String.valueOf(apiResponse)));
            this.E("webShop.conversion.stone.cancel.error.message", true);
        }).on422(apiResponse -> {
            kUN.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + String.valueOf(apiResponse)));
            this.E("webShop.conversion.stone.cancel.error.message", true);
        }).onDefault(apiResponse -> {
            kUN.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + (String)apiResponse.getData()));
            this.E("webShop.conversion.stone.cancel.error.message", true);
        }).onException(throwable -> {
            kUN.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l), throwable);
            this.E("webShop.conversion.stone.cancel.error.message", true);
        });
        WakfuClient.ceV().sendAsync((ApiCallback.Request)cancelRequest2, (ApiCallback.Callback)cancelCallback2);
    }

    public void lZ(long l) {
        this.kVl = l;
        fse_1.gFu().a((aef_2)this, kUS);
    }

    public void ma(long l) {
        if (this.kVi.isEmpty()) {
            return;
        }
        if (l <= 0L) {
            this.E("webShop.conversion.stone.price.cant.be.zero", true);
            return;
        }
        Optional<OgrineToken> optional = this.kVi.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst();
        optional.ifPresent(ogrineToken -> this.a(l, (OgrineToken)ogrineToken));
    }

    private void a(long l, OgrineToken ogrineToken) {
        if (l < this.kVm / 2L || l > this.kVm * 2L) {
            fiq_2.gCw().d(fik_2.a(string -> this.a(ogrineToken, l)).l("webShop.conversion.stone.warning.sell.price", new Object[0]));
        } else {
            this.a(ogrineToken, l);
        }
    }

    private void a(OgrineToken ogrineToken, long l) {
        long l2 = ewo_0.oBF.i(ewr_0.oDt);
        this.kVi.remove(ogrineToken);
        OgrineTokenApi.sellRequest sellRequest2 = OgrineTokenApi.sellRequest().tokenId(ogrineToken.getId()).serverId(Long.valueOf(l2)).price(Long.valueOf(l));
        OgrineTokenApi.sellCallback sellCallback2 = OgrineTokenApi.sellCallback().on204(apiResponse -> {
            this.ejn();
            this.E("webShop.conversion.stone.sell.success.message", false);
        }).onDefault(apiResponse -> {
            this.ejn();
            this.E("webShop.conversion.stone.sell.error.message", true);
            kUN.error((Object)("Error requesting to sell conversion stone, price : " + l + " : " + (String)apiResponse.getData()));
        }).onException(throwable -> {
            this.ejn();
            this.E("webShop.conversion.stone.sell.error.message", true);
            kUN.error((Object)("Error requesting to sell conversion stone, price : " + l), throwable);
        });
        WakfuClient.ceV().sendAsync((ApiCallback.Request)sellRequest2, (ApiCallback.Callback)sellCallback2);
    }

    private void ejn() {
        OgrineTokenApi.listRequest listRequest2 = OgrineTokenApi.listRequest();
        OgrineTokenApi.listCallback listCallback2 = OgrineTokenApi.listCallback().on200(apiResponse -> {
            this.kVi.clear();
            this.kVi.addAll((Collection)apiResponse.getData());
            fse_1.gFu().a((aef_2)this, kUW, kUX, kVc);
            this.kVi.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst().ifPresent(ogrineToken -> {
                Date date = DateTimeUtils.toDate((Instant)ogrineToken.getAddedDate().toInstant());
                Date date2 = aum_0.j(date);
                if (date2.after(kVg)) {
                    return;
                }
                this.E("webShop.conversion.stone.sell.price.changed", false);
            });
        }).on403(apiResponse -> kUN.error((Object)("Error requesting own conversion stones : " + String.valueOf(apiResponse)))).on404(apiResponse -> kUN.error((Object)("Error requesting own conversion stones : " + String.valueOf(apiResponse)))).onDefault(apiResponse -> kUN.error((Object)("Error requesting own conversion stones : " + (String)apiResponse.getData()))).onException(throwable -> kUN.error((Object)("Error requesting own conversion stones : " + String.valueOf(throwable))));
        WakfuClient.ceV().sendAsync((ApiCallback.Request)listRequest2, (ApiCallback.Callback)listCallback2);
    }

    public void ejo() {
        this.ejq();
        this.ejn();
    }

    public void ejp() {
        this.ejq();
        this.ejs();
    }

    private void ejq() {
        long l = ewo_0.oBF.i(ewr_0.oDt);
        OgrineTokenApi.getRateRequest getRateRequest2 = OgrineTokenApi.getRateRequest().serverId(Long.valueOf(l));
        OgrineTokenApi.getRateCallback getRateCallback2 = OgrineTokenApi.getRateCallback().on200(apiResponse -> {
            this.kVn = (Rate)apiResponse.getData();
            this.ejr();
            this.kVl = this.kVm;
            fse_1.gFu().a((aef_2)this, kUS);
        }).onDefault(apiResponse -> kUN.error((Object)("ApiError " + apiResponse.getStatusCode() + " requesting average conversion stone price " + (String)apiResponse.getData()))).onException(throwable -> kUN.error((Object)"ApiError requesting average conversion stone price", throwable));
        WakfuClient.ceV().sendAsync((ApiCallback.Request)getRateRequest2, (ApiCallback.Callback)getRateCallback2);
    }

    private void ejr() {
        if (this.kVn.getAvgLast30d() == null || this.kVi.isEmpty()) {
            return;
        }
        this.kVi.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst().ifPresent(ogrineToken -> {
            this.kVm = ogrineToken.getOgrineQuantity() * this.kVn.getAvgLast30d().longValue();
        });
        fse_1.gFu().a((aef_2)this, kUT, kUU);
    }

    public void ejs() {
        this.kVs = false;
        fse_1.gFu().a((aef_2)this, kUY);
        long l = ewo_0.oBF.i(ewr_0.oDt);
        OgrineTokenApi.listBidsRequest listBidsRequest2 = OgrineTokenApi.listBidsRequest().serverId(Long.valueOf(l)).page(Long.valueOf(1L)).resultsPerPage(Long.valueOf(20L));
        OgrineTokenApi.listBidsCallback listBidsCallback2 = OgrineTokenApi.listBidsCallback().on200(apiResponse -> this.an((List)apiResponse.getData())).onDefault(apiResponse -> kUN.error((Object)("ApiError requesting conversion stone bids : " + (String)apiResponse.getData()))).onException(throwable -> kUN.error((Object)"ApiError requesting conversion stone bids", throwable));
        WakfuClient.ceV().sendAsync((ApiCallback.Request)listBidsRequest2, (ApiCallback.Callback)listBidsCallback2);
    }

    public void a(Consumer<List<bpt_1<?, ?>>> consumer, String string) {
        if (byj_2.eoR()) {
            ArticleApi articleApi = new ArticleApi(WakfuClient.ceW());
            try {
                ArticleByKeyRequest articleByKeyRequest = new ArticleByKeyRequest().key(string);
                if (WakfuClient.dSV.cfl().cgf()) {
                    kUN.info((Object)("[SHOPI-DEBUG] getArticleByKey with following request : " + String.valueOf(articleByKeyRequest)));
                }
                articleApi.getArticleByKeyAsync(byj_2.eoS(), byj_2.lyN, articleByKeyRequest, (ApiCallback)new bqt_2(this, consumer));
            }
            catch (ApiException apiException) {
                kUN.error((Object)"Following error occured during getArticleByKey request", (Throwable)apiException);
            }
        } else {
            ShopApi.articlesListByKeyRequest articlesListByKeyRequest2 = ShopApi.articlesListByKeyRequest().key(Collections.singletonList(string));
            ShopApi.articlesListByKeyCallback articlesListByKeyCallback2 = ShopApi.articlesListByKeyCallback().on200(apiResponse -> {
                List<bpt_1<?, ?>> list = bQz.aq(((ShopArticlesList)apiResponse.getData()).getArticles());
                if (list == null || list.isEmpty()) {
                    return;
                }
                consumer.accept(list);
            }).onDefault(apiResponse -> kUN.error((Object)("Error requesting" + string + " article : " + (String)apiResponse.getData()))).onException(throwable -> kUN.error((Object)("Error requesting " + string + " article"), throwable));
            WakfuClient.ceU().sendAsync((ApiCallback.Request)articlesListByKeyRequest2, (ApiCallback.Callback)articlesListByKeyCallback2);
        }
    }

    public void b(bqq_2 bqq_22) {
        if (this.kVt) {
            return;
        }
        if (!bPq.ehY()) {
            this.E("webShop.conversion.stone.error.message.conditions.not.met", true);
            return;
        }
        Optional<OgrineToken> optional = bqq_22.ejj();
        if (optional.isEmpty()) {
            return;
        }
        this.kVt = true;
        fse_1.gFu().a((aef_2)this, kUZ, kVa);
        cjl cjl2 = new cjl(optional.get().getId(), bqq_22.ejl());
        aue_0.cVJ().etu().d(cjl2);
    }

    public void a(long l, boolean bl, eia_0 eia_02) {
        this.kVt = false;
        this.ejp();
        cyr_2.eYA().eYE().ejf();
        this.E(this.a(bl, eia_02), !bl);
    }

    private String a(boolean bl, eia_0 eia_02) {
        switch (eia_02) {
            case quh: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.relayed";
                }
                throw new IllegalStateException("We received a state RELAYED with success true on conversion stone buy result");
            }
            case qui: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.requested";
                }
                throw new IllegalStateException("We received a state REQUESTED with success true on conversion stone buy result");
            }
            case quj: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.booked";
                }
                throw new IllegalStateException("We received a state BOOKED with success true on conversion stone buy result");
            }
            case quk: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.paid";
                }
                throw new IllegalStateException("We received a state PAID with success true on conversion stone buy result");
            }
            case qun: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.conditions.not.met";
                }
                throw new IllegalStateException("We received a state NOT_ELIGIBLE with success true on conversion stone buy result");
            }
            case qum: {
                return "webShop.conversion.stone.buy.success.message";
            }
        }
        return "webShop.conversion.stone.error.message.generic";
    }

    public void ejt() {
        this.ejn();
        if (this.kVk == bqw_2.kVC) {
            this.ejo();
        }
    }

    public void E(String string, boolean bl) {
        String string2;
        if (string == null || string.isEmpty()) {
            this.kVu = null;
            fse_1.gFu().a((aef_2)this, kVb);
            return;
        }
        this.kVu = string2 = new ahv_2().ceu().e(bl ? awx_2.dnK : awx_2.dnM).c(aum_0.cWf().c(string, new Object[0])).ceL();
        fse_1.gFu().a((aef_2)this, kVb);
        new Timer().schedule((TimerTask)new bqu_2(this, string2), 6000L);
    }

    public void eju() {
        if (this.kVo == null) {
            this.E("webShop.conversion.stone.error.message.no.article", true);
            return;
        }
        cyr_2.eYA().h(this.kVo);
    }

    public void ejv() {
        if (this.kVp == null) {
            this.E("webShop.conversion.stone.error.message.no.article", true);
            return;
        }
        cyr_2.eYA().h(this.kVp);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kUP)) {
            return this.kVk.aJr();
        }
        if (string.equals(kUQ)) {
            return this.kVj;
        }
        if (string.equals(kUR)) {
            return this.kVj.isEmpty() ? bqx_2.kVJ : this.kVj.get(0);
        }
        if (string.equals(kUS)) {
            return aum_0.cWf().cQ(this.kVl);
        }
        if (string.equals(kUT)) {
            return this.kVm;
        }
        if (string.equals(kUU)) {
            return aum_0.cWf().c("webShop.conversion.stone.average.price", this.kVm);
        }
        if (string.equals(kUV)) {
            long l = Duration.between(this.kVq, java.time.Instant.now()).getSeconds();
            return aum_0.cWf().c("webShop.conversion.stone.last.refresh.delay", l);
        }
        if (string.equals(kUW)) {
            return this.ejx();
        }
        if (string.equals(kUX)) {
            return aum_0.cWf().c("webShop.conversion.stone.own.pending.amount", this.ejx());
        }
        if (string.equals(kUY)) {
            return this.kVs ? 1 : 0;
        }
        if (string.equals(kUZ)) {
            if (this.kVj.isEmpty()) {
                return false;
            }
            if (this.kVt) {
                return false;
            }
            return this.ejw();
        }
        if (string.equals(kVa)) {
            if (this.kVj.isEmpty()) {
                return aum_0.cWf().c("webShop.conversion.stone.no.sale", new Object[0]);
            }
            if (this.kVt) {
                return aum_0.cWf().c("webShop.conversion.stone.pending.buy.request", new Object[0]);
            }
            return this.ejw() ? "" : aum_0.cWf().c("webShop.conversion.stone.not.enough.kama", new Object[0]);
        }
        if (string.equals(kVb)) {
            return this.kVu;
        }
        if (string.equals(kVc)) {
            return aum_0.cWf().c("webShop.conversion.stone.exchange.stone.available", this.ejx());
        }
        if (string.equals(kVd) && aue_0.cVJ().cVK() != null) {
            return aum_0.cWf().c("webShop.conversion.stone.exchange.kamas.available", aue_0.cVJ().cVK().cWp().exS());
        }
        if (string.equals(kVe)) {
            return bPq.ehY();
        }
        return null;
    }

    private boolean ejw() {
        bqq_2 bqq_22 = this.kVj.get(0);
        return bqq_22.ejl() <= aue_0.cVJ().cVK().cWp().exS();
    }

    private long ejx() {
        return this.kVi.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).count();
    }

    public void ejy() {
        boolean bl = this.kVs = !this.kVs;
        if (!this.kVs) {
            this.ejs();
            return;
        }
        long l = ewo_0.oBF.i(ewr_0.oDt);
        OgrineTokenApi.listRequest listRequest2 = OgrineTokenApi.listRequest().sellingServerId(Long.valueOf(l)).status("ON_SALE");
        OgrineTokenApi.listCallback listCallback2 = OgrineTokenApi.listCallback().on200(apiResponse -> this.an((List)apiResponse.getData())).onDefault(apiResponse -> kUN.error((Object)("Error requesting own conversion stones for offers list : " + (String)apiResponse.getData()))).onException(throwable -> kUN.error((Object)"Error requesting own conversion stones for offers list", throwable));
        WakfuClient.ceV().sendAsync((ApiCallback.Request)listRequest2, (ApiCallback.Callback)listCallback2);
    }

    private void an(List<OgrineToken> list) {
        this.kVj.clear();
        list.forEach(ogrineToken -> {
            Optional<bqq_2> optional = this.kVj.stream().filter(bqq_22 -> bqq_22.ejl() == ogrineToken.getSellingPrice().longValue()).findFirst();
            if (optional.isPresent()) {
                optional.get().a((OgrineToken)ogrineToken);
            } else {
                this.kVj.add(new bqq_2((OgrineToken)ogrineToken));
            }
        });
        this.kVj.sort(Comparator.comparingLong(bqq_2::ejl));
        this.kVq = java.time.Instant.now();
        fse_1.gFu().a((aef_2)this, kUQ, kUR, kUZ, kVa, kUV);
    }

    public void a(bqw_2 bqw_22) {
        this.kVk = bqw_22;
        switch (this.kVk.ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                fse_1.gFu().a((aef_2)this, kVc, kVd);
                break;
            }
            case 2: {
                this.ejo();
                break;
            }
            case 3: {
                this.ejp();
                this.ejm();
                if (!ue_0.bjV().bjc().g(kVh)) break;
                this.E("webShop.conversion.stone.buy.price.changed", false);
                break;
            }
            case 4: {
                this.ejs();
            }
        }
        fse_1.gFu().a((aef_2)this, this.bxk());
    }

    public bqw_2 ejz() {
        return this.kVk;
    }
}

