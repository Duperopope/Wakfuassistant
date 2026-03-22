/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$buyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$buyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance$CurrencyEnum
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CartApi
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.CartDetailClassicRequest
 *  com.ankama.shopi.client.model.CartDetailRequestOneOf
 *  com.ankama.shopi.client.model.CartDetailRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.CreateCartRequest
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ShopKey
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualPaymentRequest
 *  com.google.gson.Gson
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CartApi;
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.CartDetailClassicRequest;
import com.ankama.shopi.client.model.CartDetailRequestOneOf;
import com.ankama.shopi.client.model.CreateCartRequest;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ShopKey;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualPaymentRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.gson.Gson;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPP
 */
public class bpp_2
implements aeh_2 {
    private static final int[] kSQ = new int[]{8818, 8819, 8820, 8821, 8822, 8823};
    static final Logger kSR = Logger.getLogger(bpp_2.class);
    public static final String kSS = "ready";
    public static final String kST = "mode";
    public static final String kSU = "conversionStoneView";
    public static final String kSV = "carrousel";
    public static final String kSW = "rootCategories";
    public static final String kSX = "categories";
    public static final String kSY = "currentCategory";
    public static final String kSZ = "parentCategory";
    public static final String kTa = "articles";
    public static final String kTb = "homeArticles";
    public static final String kTc = "currentPage";
    public static final String kTd = "totalPages";
    public static final String kTe = "currentCarrousel";
    private static final String kTf = "wallet";
    private static final String kTg = "ogrinWallet";
    private static final String kTh = "pagesDescription";
    public static final int kTi = 12;
    public static final int kTj = 1000;
    final Object kTk = new Object();
    private static final int kTl = 1;
    private static final int kTm = 2;
    private static final int kTn = 3;
    private boolean kTo;
    bqo_2 kTp;
    final bqr_2 kTq = new bqr_2();
    private bqn_2 kTr;
    final List<bpo_2> kTs = new ArrayList<bpo_2>();
    private final TByteIntHashMap kTt = new TByteIntHashMap();
    final List<bpu_1<?>> kTu = new ArrayList();
    final List<bpu_1<?>> kTv = new ArrayList();
    final List<bpw_1<?, ?>> kTw = new ArrayList();
    final List<bpt_1<?, ?>> kTx = new ArrayList();
    private final List<bpt_1<?, ?>> kTy = new ArrayList();
    bpu_1<?> kTz;
    private bpw_1<?, ?> kTA;
    private final List<bpt_1<?, ?>> kTB = new ArrayList();
    private int hQx = 0;
    int jwd = 0;
    private String kTC = null;
    private int gxk = 1;
    int kTD = 1;
    int kTE = 1;
    private final List<bpl_2> kTF = new ArrayList<bpl_2>();
    final Map<Integer, bql_2> kTG = new HashMap<Integer, bql_2>();
    final Map<String, bpg_2> kTH = new HashMap<String, bpg_2>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bpo_2 bpo_22, boolean bl) {
        if (fse_1.gFu().dp("demo")) {
            return;
        }
        Object object = this.kTk;
        synchronized (object) {
            if (this.gxk == 3) {
                bpo_22.eiQ();
            } else {
                this.kTs.add(bpo_22);
            }
            this.kTp = bqo_2.kUx;
            this.kTq.a(bqw_2.kVA);
            this.kTr = bqn_2.kUv;
            if (this.gxk != 1) {
                return;
            }
            kSR.info((Object)"WebSession Init");
            this.gxk = 2;
            this.kTE = 2;
            this.kTD = 2;
            this.kTF.add(new bpl_2(bpa_2.kRg, this));
            fse_1.gFu().a((aef_2)this, kTf, kTg);
            this.d(bl, true, true);
            bop_0.a(new bpq_2(this));
        }
    }

    private void d(boolean bl, boolean bl2, boolean bl3) {
        if (!bl && !bl2) {
            return;
        }
        bpu_2 bpu_22 = new bpu_2(this, bl, bl2, bl3);
        bpv_1 bpv_12 = new bpv_1(this, bl, bpu_22);
        bpw_2 bpw_22 = new bpw_2(this, bpu_22);
        if (bl2 && !bl) {
            bPd.b(bpv_12);
        } else if (!bl2) {
            bPd.b(bpw_22, null);
        } else {
            bPd.b(bpw_22, bpv_12);
        }
    }

    public void eiU() {
        this.kTp = bqo_2.kUA;
        this.kTq.a(bqw_2.kVB);
        this.kTq.bkZ();
        fse_1.gFu().a((aef_2)this, kST);
    }

    public void cG(byte by) {
        this.kTq.a(bqw_2.cH(by));
    }

    public bqr_2 eiV() {
        return this.kTq;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void eiW() {
        Object object = this.kTk;
        synchronized (object) {
            if (this.gxk != 3 && this.kTE == 3 && this.kTD == 3) {
                this.gxk = 3;
                for (bpo_2 bpo_22 : new ArrayList<bpo_2>(this.kTs)) {
                    bpo_22.eiQ();
                }
            }
        }
    }

    public int eiX() {
        return this.kTw.size();
    }

    public int a(bpw_1<?, ?> bpw_12) {
        return this.kTw.indexOf(bpw_12);
    }

    public void IP(int n) {
        this.kTA = n < 0 || n >= this.kTw.size() ? null : this.kTw.get(n);
        fse_1.gFu().a((aef_2)this, kTe);
    }

    void IQ(int n) {
        this.kTt.put(bpa_2.kRg.aJr(), n);
        this.kTF.forEach(bpl_2::eiP);
        Stream.concat(Stream.concat(this.kTx.stream(), this.kTB.stream()), this.kTy.stream()).forEach(bpt_12 -> fse_1.gFu().a((aef_2)bpt_12, "hasEnoughMoney"));
    }

    public void a(@NotNull PaymentRequestOneOf paymentRequestOneOf) {
        bpa_2 bpa_22 = bpa_2.kRg;
        PaymentRequestOneOf.DiscriminatorEnum discriminatorEnum = paymentRequestOneOf.getDiscriminator();
        if (paymentRequestOneOf.getDiscriminator() != PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL) {
            return;
        }
        VirtualPaymentRequest virtualPaymentRequest = paymentRequestOneOf.getVirtualPaymentRequest();
        if (virtualPaymentRequest == null) {
            kSR.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualPaymentRequest.class, discriminatorEnum, paymentRequestOneOf));
            return;
        }
        if (!virtualPaymentRequest.getCurrency().equals(bpa_22.eiE())) {
            return;
        }
        int n = this.a(bpa_22) - virtualPaymentRequest.getAmount().intValue();
        this.IQ(n);
    }

    public void a(@NotNull bpg_2 bpg_22) {
        int n = this.a(bpa_2.kRg);
        block3: for (SingleReference singleReference : bpg_22.eit()) {
            ReferenceOneOf referenceOneOf = singleReference.getReference();
            switch (referenceOneOf.getDiscriminator()) {
                case OGRINEREFERENCE: {
                    n += singleReference.getQuantity().intValue();
                    continue block3;
                }
            }
        }
        this.IQ(n);
    }

    int a(bpa_2 bpa_22) {
        if (bpa_22 == null) {
            return 0;
        }
        return this.kTt.get(bpa_22.aJr());
    }

    public bpu_1<?> eiY() {
        return this.kTz;
    }

    public void d(bpu_1<?> bpu_12) {
        this.kTz = bpu_12;
        if (this.kTz != null) {
            this.kTr = bqn_2.kUv;
        }
        fse_1.gFu().a((aef_2)this, kSY);
        fse_1.gFu().a((aef_2)this, kSZ);
        this.ejc();
    }

    public bpu_1<?> at(Object object) {
        if (this.kTE != 3) {
            return null;
        }
        Optional<bpu_1> optional = this.kTv.stream().filter(bpu_12 -> Objects.equals(bpu_12.eid(), object)).findFirst();
        return optional.orElse(null);
    }

    public bpu_1<?> ns(String string) {
        if (string == null || this.kTE != 3) {
            return null;
        }
        Optional<bpu_1> optional = this.kTv.stream().filter(Objects::nonNull).filter(bpu_12 -> bpu_12.getKey() != null).filter(bpu_12 -> bpu_12.getKey().equals(string)).findFirst();
        return optional.orElse(null);
    }

    public void nt(String string) {
        this.w(string, 1);
    }

    public void dxn() {
        if (this.hQx == 1) {
            return;
        }
        this.w(this.kTC, 1);
    }

    public void dxo() {
        if (this.hQx <= 1) {
            return;
        }
        this.w(this.kTC, this.hQx - 1);
    }

    public void dxp() {
        if (this.hQx == this.jwd) {
            return;
        }
        this.w(this.kTC, this.hQx + 1);
    }

    public void dxq() {
        if (this.hQx == this.jwd) {
            return;
        }
        this.w(this.kTC, this.jwd);
    }

    public void c(bpt_1<?, ?> bpt_12) {
        if (bpt_12.ehX() == bpa_2.kRg && bpt_12.eif() > (double)this.a(bpa_2.kRg)) {
            return;
        }
        this.ejd();
        if (bpt_12 instanceof bpb_2) {
            this.a((bpb_2)bpt_12);
        } else if (bpt_12 instanceof bpg_2) {
            this.b((bpg_2)bpt_12);
        } else {
            kSR.error((Object)("[SHOP] Unable to quick buy following " + String.valueOf(bpt_12)));
            this.nu("unknownArticleType");
        }
    }

    void d(bpt_1<?, ?> bpt_12) {
        bpk_2 bpk_22;
        ArrayList<bpk_2> arrayList;
        String string = "shop.purchaseSuccessWarning";
        if (bpt_12.a(bpy_2.kQW)) {
            arrayList = new ciq_0(evu_1.owU.aJr());
            aue_0.cVJ().etu().d(arrayList);
        } else if (bpt_12.a(bpy_2.kQX)) {
            arrayList = bpt_12.eik();
            if (!arrayList.isEmpty()) {
                bpk_22 = (bpk_2)arrayList.get(0);
                if ("WKCHARACTERS".equals(bpk_22.nq("STATUS"))) {
                    cip_0 cip_02 = new cip_0();
                    aue_0.cVJ().etu().d(cip_02);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                } else if ("WKVAULTUP".equals(bpk_22.nq("STATUS"))) {
                    cym_0 cym_02 = new cym_0();
                    aue_0.cVJ().etu().d(cym_02);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                }
            }
        } else if (bpt_12.a(bpx_2.kQQ)) {
            string = "shop.purchaseConversionStoneSuccessWarning";
            this.kTq.ejt();
        } else if (bpt_12.a(bpy_2.kRb)) {
            string = "shop.purchaseWebRedirection";
        }
        bpt_12.eij();
        arrayList = new ckm_0();
        ((ckm_0)((Object)arrayList)).os(aum_0.cWf().aUXX().aUR());
        aue_0.cVJ().etu().d(arrayList);
        bpk_22 = bpt_12.eid();
        if (ado_1.a(kSQ, bpk_22 instanceof Integer ? (Integer)((Object)bpk_22) : Integer.parseInt(bpk_22.toString()))) {
            string = "shop.purchaseSubSuccessWarning";
        }
        fiq_2.gCw().d(fik_2.gBZ().l(string, new Object[0]).abQ(1).pd(true));
    }

    private void a(bpb_2 bpb_22) {
        bpe_2 bpe_22 = new bpe_2(bpb_22);
        Gson gson = new Gson();
        String string = gson.toJson((Object)bpe_22);
        ShopApi.buyRequest buyRequest2 = ShopApi.buyRequest().data("[" + string + "]").currency(bpb_22.ehX().eiE());
        ShopApi.buyCallback buyCallback2 = ShopApi.buyCallback().on200(apiResponse -> {
            try {
                this.d(bpb_22);
                int n = 0;
                for (MoneyBalance moneyBalance : ((ShopBuyResult)apiResponse.getData()).getBalance()) {
                    if (moneyBalance.getCurrency() != MoneyBalance.CurrencyEnum.OGR) continue;
                    n = GC.B(moneyBalance.getAmount().floatValue());
                }
                this.IQ(n);
            }
            catch (Exception exception) {
                kSR.error((Object)("Error during on200 of buy, result : " + String.valueOf(apiResponse)), (Throwable)exception);
            }
            finally {
                this.eje();
            }
        }).onDefault(apiResponse -> {
            kSR.error((Object)("Error when buying an article: " + String.valueOf(bpb_22.eid()) + " : " + (String)apiResponse.getData()));
            this.nu("haapiBuy" + apiResponse.getStatusCode());
        }).onException(throwable -> {
            kSR.error((Object)("Error when buying an article: " + String.valueOf(bpb_22.eid())), throwable);
            this.nu("haapiBuyException");
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)buyRequest2, (ApiCallback.Callback)buyCallback2);
    }

    public void a(@NotNull bpg_2 bpg_22, @NotNull bqm_2 bqm_22) {
        this.a(new CartApi(WakfuClient.ceW()), byj_2.eoS(), byj_2.lyN, bpg_22, bqm_22);
    }

    public void a(@NotNull CartApi cartApi, @NotNull Language language, @NotNull ShopKey shopKey, @NotNull bpg_2 bpg_22, @NotNull bqm_2 bqm_22) {
        try {
            CreateCartRequest createCartRequest = new CreateCartRequest().addCartDetailsItem(new CartDetailRequestOneOf().discriminator(CartDetailRequestOneOf.DiscriminatorEnum.CARTDETAILCLASSICREQUEST).cartDetailClassicRequest(new CartDetailClassicRequest().articleId((String)bpg_22.eid()).quantity(Integer.valueOf(1)).chosenReferences(bpg_22.kQb.stream().map(byj_2::b).filter(Objects::nonNull).toList())));
            if (WakfuClient.dSV.cfl().cgf()) {
                kSR.info((Object)("[SHOPI-DEBUG] createCart with following request : " + String.valueOf(createCartRequest)));
            }
            cartApi.createCartAsync(language, shopKey, createCartRequest, (ApiCallback)new bpx_1(this, bqm_22));
        }
        catch (ApiException apiException) {
            kSR.error((Object)"Following error occured during createCart request", (Throwable)apiException);
            bqm_22.b((Exception)((Object)apiException));
        }
    }

    private void b(bpg_2 bpg_22) {
        Object object = bpg_22.eiJ();
        if (object != VirtualPaymentModeId.OG && object != VirtualPaymentModeId.SW && object != ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE) {
            kSR.warn((Object)String.format("Unable to quickBuy following %s because following paymentMode %s isn't supported", bpg_22, object));
            this.nu("paymentModeUnsupported");
            return;
        }
        CartApi cartApi = new CartApi(WakfuClient.ceW());
        Language language = byj_2.eoS();
        ShopKey shopKey = byj_2.lyN;
        this.a(cartApi, language, shopKey, bpg_22, new bpy_1(this, cartApi, language, shopKey, bpg_22));
    }

    public void a(@NotNull Cart cart) {
        this.a(new CartApi(WakfuClient.ceW()), byj_2.eoS(), byj_2.lyN, cart);
    }

    public void a(@NotNull CartApi cartApi, Language language, ShopKey shopKey, @NotNull Cart cart) {
        try {
            if (WakfuClient.dSV.cfl().cgf()) {
                kSR.info((Object)("[SHOPI-DEBUG] deleteCart with following id : " + cart.getId()));
            }
            cartApi.deleteCartAsync(language, shopKey, cart.getId(), (ApiCallback)new bqe_2(this));
        }
        catch (ApiException apiException) {
            kSR.error((Object)"Following error occured during deleteCart request", (Throwable)apiException);
        }
    }

    void nu(String string) {
        fiq_2.gCw().d(fik_2.gBZ().l("webShop.oneClick.error", string).abQ(1).pd(true));
        this.eje();
    }

    public void C(int n, boolean bl) {
        if (!bMX.kAi.blc()) {
            return;
        }
        this.ejd();
        bPm.a(n, bl, new bqf_2(this));
    }

    private void w(String string, int n) {
        if (this.kTo) {
            return;
        }
        if (!BH.a(this.kTC, string, true)) {
            this.ejc();
        }
        this.kTC = string;
        this.hQx = n;
        if (this.kTr == bqn_2.kUv && this.kTz == null && BH.aU(string)) {
            this.eja();
        } else {
            this.a(n, new bqp_2(this, this.kTz != null ? this.kTz.eid() : Integer.valueOf(0)));
        }
    }

    private void a(int n, bqk_2 bqk_22) {
        if (this.kTG.get(n) != null) {
            bqk_22.ak(null);
            return;
        }
        if (this.kTr == bqn_2.kUv) {
            if (BH.aU(this.kTC)) {
                bOU.a((bot_0)new bqg_2(this, bqk_22, n), this.kTz.eid(), n, 12);
            } else {
                bqi_2 bqi_22 = new bqi_2(this.kTC, n, bqk_22, this);
                this.kTG.put(n, bqi_22);
                bqi_22.bkZ();
            }
        }
    }

    public void eiZ() {
        this.eja();
        this.kTp = bqo_2.kUy;
        this.kTq.a(bqw_2.kVA);
        fse_1.gFu().a((aef_2)this, kST);
    }

    public void eja() {
        this.d(true, false, false);
    }

    void au(Object object) {
        if (object != null && this.kTz != null && object != this.kTz.eid()) {
            return;
        }
        this.ejb();
    }

    private void ejb() {
        bql_2 bql_22 = this.kTG.get(this.hQx);
        if (bql_22 == null) {
            this.a(new ArrayList(), true);
            return;
        }
        if (bql_22.aLB()) {
            this.a(bql_22.ehT(), false);
        } else {
            this.ejd();
            bql_22.a(new bpr_2(this));
        }
        for (bpo_2 bpo_22 : new ArrayList<bpo_2>(this.kTs)) {
            bpo_22.eiT();
        }
    }

    private void ejc() {
        this.kTG.values().forEach(bql_2::clean);
        this.kTG.clear();
    }

    void a(List<bpt_1<?, ?>> list, boolean bl) {
        this.kTp = bqo_2.kUz;
        this.kTq.a(bqw_2.kVA);
        this.kTB.clear();
        this.kTB.addAll(list);
        if (bl) {
            this.eje();
        }
        fse_1.gFu().a((aef_2)this, kTa, kTc, kTd, kTh, kST);
    }

    private void ejd() {
        this.kTo = true;
        fse_1.gFu().a((aef_2)this, kSS);
    }

    void eje() {
        this.kTo = false;
        fse_1.gFu().a((aef_2)this, kSS);
    }

    public boolean isInitialized() {
        return this.gxk == 3;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kTf)) {
            return this.kTF;
        }
        if (string.equals(kST)) {
            return this.kTp.aJr();
        }
        if (string.equals(kSU)) {
            return this.kTq;
        }
        if (string.equals(kSX)) {
            return this.kTv;
        }
        if (string.equals(kTe)) {
            return this.kTA;
        }
        if (string.equals(kTb)) {
            return this.kTx;
        }
        if (string.equals(kSV)) {
            return this.kTw;
        }
        if (string.equals(kSW)) {
            return this.kTu;
        }
        if (string.equals(kSY)) {
            return this.kTz;
        }
        if (string.equals(kSZ)) {
            return this.kTz != null ? this.kTz.eiw() : null;
        }
        if (string.equals(kTa)) {
            return this.kTB;
        }
        if (string.equals(kTc)) {
            return this.hQx;
        }
        if (string.equals(kTd)) {
            return this.jwd;
        }
        if (string.equals(kSS)) {
            return !this.kTo;
        }
        if (string.equals(kTh)) {
            if (this.jwd != 0) {
                return this.hQx + "/" + this.jwd;
            }
            return aum_0.cWf().c("marketBoard.noResults", new Object[0]);
        }
        if (string.equals(kTg)) {
            Optional<bpl_2> optional = this.kTF.stream().filter(bpl_22 -> bpl_22.ehX().aJr() == bpa_2.kRg.aJr()).findFirst();
            return optional.orElse(null);
        }
        return null;
    }

    public void ejf() {
        bop_0.a(new bps_2(this));
    }

    public bqo_2 ejg() {
        return this.kTp;
    }

    public void a(bpo_2 bpo_22) {
        this.kTs.add(bpo_22);
    }

    public void b(bpo_2 bpo_22) {
        this.kTs.remove(bpo_22);
    }

    @Nullable
    protected bpg_2 IR(int n) {
        return this.kTH.get(String.valueOf(n));
    }

    protected void IS(int n) {
        this.kTH.remove(String.valueOf(n));
    }

    public void e(bpt_1<?, ?> bpt_12) {
        this.kTy.add(bpt_12);
    }

    public void f(bpt_1<?, ?> bpt_12) {
        this.kTy.remove(bpt_12);
    }
}

