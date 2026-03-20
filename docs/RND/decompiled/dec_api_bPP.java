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

public class bPP
implements aEH {
    private static final int[] kSQ = new int[]{8818, 8819, 8820, 8821, 8822, 8823};
    static final Logger kSR = Logger.getLogger(bPP.class);
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
    bQo kTp;
    final bQr kTq = new bQr();
    private bQn kTr;
    final List<bPO> kTs = new ArrayList<bPO>();
    private final TByteIntHashMap kTt = new TByteIntHashMap();
    final List<bPu<?>> kTu = new ArrayList();
    final List<bPu<?>> kTv = new ArrayList();
    final List<bPw<?, ?>> kTw = new ArrayList();
    final List<bPt<?, ?>> kTx = new ArrayList();
    private final List<bPt<?, ?>> kTy = new ArrayList();
    bPu<?> kTz;
    private bPw<?, ?> kTA;
    private final List<bPt<?, ?>> kTB = new ArrayList();
    private int hQx = 0;
    int jwd = 0;
    private String kTC = null;
    private int gxk = 1;
    int kTD = 1;
    int kTE = 1;
    private final List<bPL> kTF = new ArrayList<bPL>();
    final Map<Integer, bQl> kTG = new HashMap<Integer, bQl>();
    final Map<String, bPG> kTH = new HashMap<String, bPG>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bPO bPO2, boolean bl) {
        if (fSe.gFu().dp("demo")) {
            return;
        }
        Object object = this.kTk;
        synchronized (object) {
            if (this.gxk == 3) {
                bPO2.eiQ();
            } else {
                this.kTs.add(bPO2);
            }
            this.kTp = bQo.kUx;
            this.kTq.a(bQw.kVA);
            this.kTr = bQn.kUv;
            if (this.gxk != 1) {
                return;
            }
            kSR.info((Object)"WebSession Init");
            this.gxk = 2;
            this.kTE = 2;
            this.kTD = 2;
            this.kTF.add(new bPL(bPA.kRg, this));
            fSe.gFu().a((aEF)this, kTf, kTg);
            this.d(bl, true, true);
            bOP.a(new bPQ(this));
        }
    }

    private void d(boolean bl, boolean bl2, boolean bl3) {
        if (!bl && !bl2) {
            return;
        }
        bPU bPU2 = new bPU(this, bl, bl2, bl3);
        bPV bPV2 = new bPV(this, bl, bPU2);
        bPW bPW2 = new bPW(this, bPU2);
        if (bl2 && !bl) {
            bPd.b(bPV2);
        } else if (!bl2) {
            bPd.b(bPW2, null);
        } else {
            bPd.b(bPW2, bPV2);
        }
    }

    public void eiU() {
        this.kTp = bQo.kUA;
        this.kTq.a(bQw.kVB);
        this.kTq.bkZ();
        fSe.gFu().a((aEF)this, kST);
    }

    public void cG(byte by) {
        this.kTq.a(bQw.cH(by));
    }

    public bQr eiV() {
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
                for (bPO bPO2 : new ArrayList<bPO>(this.kTs)) {
                    bPO2.eiQ();
                }
            }
        }
    }

    public int eiX() {
        return this.kTw.size();
    }

    public int a(bPw<?, ?> bPw2) {
        return this.kTw.indexOf(bPw2);
    }

    public void IP(int n) {
        this.kTA = n < 0 || n >= this.kTw.size() ? null : this.kTw.get(n);
        fSe.gFu().a((aEF)this, kTe);
    }

    void IQ(int n) {
        this.kTt.put(bPA.kRg.aJr(), n);
        this.kTF.forEach(bPL::eiP);
        Stream.concat(Stream.concat(this.kTx.stream(), this.kTB.stream()), this.kTy.stream()).forEach(bPt2 -> fSe.gFu().a((aEF)bPt2, "hasEnoughMoney"));
    }

    public void a(@NotNull PaymentRequestOneOf paymentRequestOneOf) {
        bPA bPA2 = bPA.kRg;
        PaymentRequestOneOf.DiscriminatorEnum discriminatorEnum = paymentRequestOneOf.getDiscriminator();
        if (paymentRequestOneOf.getDiscriminator() != PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL) {
            return;
        }
        VirtualPaymentRequest virtualPaymentRequest = paymentRequestOneOf.getVirtualPaymentRequest();
        if (virtualPaymentRequest == null) {
            kSR.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualPaymentRequest.class, discriminatorEnum, paymentRequestOneOf));
            return;
        }
        if (!virtualPaymentRequest.getCurrency().equals(bPA2.eiE())) {
            return;
        }
        int n = this.a(bPA2) - virtualPaymentRequest.getAmount().intValue();
        this.IQ(n);
    }

    public void a(@NotNull bPG bPG2) {
        int n = this.a(bPA.kRg);
        block3: for (SingleReference singleReference : bPG2.eit()) {
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

    int a(bPA bPA2) {
        if (bPA2 == null) {
            return 0;
        }
        return this.kTt.get(bPA2.aJr());
    }

    public bPu<?> eiY() {
        return this.kTz;
    }

    public void d(bPu<?> bPu2) {
        this.kTz = bPu2;
        if (this.kTz != null) {
            this.kTr = bQn.kUv;
        }
        fSe.gFu().a((aEF)this, kSY);
        fSe.gFu().a((aEF)this, kSZ);
        this.ejc();
    }

    public bPu<?> at(Object object) {
        if (this.kTE != 3) {
            return null;
        }
        Optional<bPu> optional = this.kTv.stream().filter(bPu2 -> Objects.equals(bPu2.eid(), object)).findFirst();
        return optional.orElse(null);
    }

    public bPu<?> ns(String string) {
        if (string == null || this.kTE != 3) {
            return null;
        }
        Optional<bPu> optional = this.kTv.stream().filter(Objects::nonNull).filter(bPu2 -> bPu2.getKey() != null).filter(bPu2 -> bPu2.getKey().equals(string)).findFirst();
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

    public void c(bPt<?, ?> bPt2) {
        if (bPt2.ehX() == bPA.kRg && bPt2.eif() > (double)this.a(bPA.kRg)) {
            return;
        }
        this.ejd();
        if (bPt2 instanceof bPB) {
            this.a((bPB)bPt2);
        } else if (bPt2 instanceof bPG) {
            this.b((bPG)bPt2);
        } else {
            kSR.error((Object)("[SHOP] Unable to quick buy following " + String.valueOf(bPt2)));
            this.nu("unknownArticleType");
        }
    }

    void d(bPt<?, ?> bPt2) {
        bPK bPK2;
        ArrayList<bPK> arrayList;
        String string = "shop.purchaseSuccessWarning";
        if (bPt2.a(bPy.kQW)) {
            arrayList = new ciq(evU.owU.aJr());
            aUE.cVJ().etu().d(arrayList);
        } else if (bPt2.a(bPy.kQX)) {
            arrayList = bPt2.eik();
            if (!arrayList.isEmpty()) {
                bPK2 = (bPK)arrayList.get(0);
                if ("WKCHARACTERS".equals(bPK2.nq("STATUS"))) {
                    cip cip2 = new cip();
                    aUE.cVJ().etu().d(cip2);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                } else if ("WKVAULTUP".equals(bPK2.nq("STATUS"))) {
                    cyM cyM2 = new cyM();
                    aUE.cVJ().etu().d(cyM2);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                }
            }
        } else if (bPt2.a(bPx.kQQ)) {
            string = "shop.purchaseConversionStoneSuccessWarning";
            this.kTq.ejt();
        } else if (bPt2.a(bPy.kRb)) {
            string = "shop.purchaseWebRedirection";
        }
        bPt2.eij();
        arrayList = new ckM();
        ((ckM)((Object)arrayList)).os(aUM.cWf().aUXX().aUR());
        aUE.cVJ().etu().d(arrayList);
        bPK2 = bPt2.eid();
        if (aDO.a(kSQ, bPK2 instanceof Integer ? (Integer)((Object)bPK2) : Integer.parseInt(bPK2.toString()))) {
            string = "shop.purchaseSubSuccessWarning";
        }
        fIQ.gCw().d(fIK.gBZ().l(string, new Object[0]).abQ(1).pd(true));
    }

    private void a(bPB bPB2) {
        bPE bPE2 = new bPE(bPB2);
        Gson gson = new Gson();
        String string = gson.toJson((Object)bPE2);
        ShopApi.buyRequest buyRequest2 = ShopApi.buyRequest().data("[" + string + "]").currency(bPB2.ehX().eiE());
        ShopApi.buyCallback buyCallback2 = ShopApi.buyCallback().on200(apiResponse -> {
            try {
                this.d(bPB2);
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
            kSR.error((Object)("Error when buying an article: " + String.valueOf(bPB2.eid()) + " : " + (String)apiResponse.getData()));
            this.nu("haapiBuy" + apiResponse.getStatusCode());
        }).onException(throwable -> {
            kSR.error((Object)("Error when buying an article: " + String.valueOf(bPB2.eid())), throwable);
            this.nu("haapiBuyException");
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)buyRequest2, (ApiCallback.Callback)buyCallback2);
    }

    public void a(@NotNull bPG bPG2, @NotNull bQm bQm2) {
        this.a(new CartApi(WakfuClient.ceW()), bYj.eoS(), bYj.lyN, bPG2, bQm2);
    }

    public void a(@NotNull CartApi cartApi, @NotNull Language language, @NotNull ShopKey shopKey, @NotNull bPG bPG2, @NotNull bQm bQm2) {
        try {
            CreateCartRequest createCartRequest = new CreateCartRequest().addCartDetailsItem(new CartDetailRequestOneOf().discriminator(CartDetailRequestOneOf.DiscriminatorEnum.CARTDETAILCLASSICREQUEST).cartDetailClassicRequest(new CartDetailClassicRequest().articleId((String)bPG2.eid()).quantity(Integer.valueOf(1)).chosenReferences(bPG2.kQb.stream().map(bYj::b).filter(Objects::nonNull).toList())));
            if (WakfuClient.dSV.cfl().cgf()) {
                kSR.info((Object)("[SHOPI-DEBUG] createCart with following request : " + String.valueOf(createCartRequest)));
            }
            cartApi.createCartAsync(language, shopKey, createCartRequest, (ApiCallback)new bPX(this, bQm2));
        }
        catch (ApiException apiException) {
            kSR.error((Object)"Following error occured during createCart request", (Throwable)apiException);
            bQm2.b((Exception)((Object)apiException));
        }
    }

    private void b(bPG bPG2) {
        Object object = bPG2.eiJ();
        if (object != VirtualPaymentModeId.OG && object != VirtualPaymentModeId.SW && object != ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE) {
            kSR.warn((Object)String.format("Unable to quickBuy following %s because following paymentMode %s isn't supported", bPG2, object));
            this.nu("paymentModeUnsupported");
            return;
        }
        CartApi cartApi = new CartApi(WakfuClient.ceW());
        Language language = bYj.eoS();
        ShopKey shopKey = bYj.lyN;
        this.a(cartApi, language, shopKey, bPG2, new bPY(this, cartApi, language, shopKey, bPG2));
    }

    public void a(@NotNull Cart cart) {
        this.a(new CartApi(WakfuClient.ceW()), bYj.eoS(), bYj.lyN, cart);
    }

    public void a(@NotNull CartApi cartApi, Language language, ShopKey shopKey, @NotNull Cart cart) {
        try {
            if (WakfuClient.dSV.cfl().cgf()) {
                kSR.info((Object)("[SHOPI-DEBUG] deleteCart with following id : " + cart.getId()));
            }
            cartApi.deleteCartAsync(language, shopKey, cart.getId(), (ApiCallback)new bQe(this));
        }
        catch (ApiException apiException) {
            kSR.error((Object)"Following error occured during deleteCart request", (Throwable)apiException);
        }
    }

    void nu(String string) {
        fIQ.gCw().d(fIK.gBZ().l("webShop.oneClick.error", string).abQ(1).pd(true));
        this.eje();
    }

    public void C(int n, boolean bl) {
        if (!bMX.kAi.blc()) {
            return;
        }
        this.ejd();
        bPm.a(n, bl, new bQf(this));
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
        if (this.kTr == bQn.kUv && this.kTz == null && BH.aU(string)) {
            this.eja();
        } else {
            this.a(n, new bQp(this, this.kTz != null ? this.kTz.eid() : Integer.valueOf(0)));
        }
    }

    private void a(int n, bQk bQk2) {
        if (this.kTG.get(n) != null) {
            bQk2.ak(null);
            return;
        }
        if (this.kTr == bQn.kUv) {
            if (BH.aU(this.kTC)) {
                bOU.a((bOT)new bQg(this, bQk2, n), this.kTz.eid(), n, 12);
            } else {
                bQi bQi2 = new bQi(this.kTC, n, bQk2, this);
                this.kTG.put(n, bQi2);
                bQi2.bkZ();
            }
        }
    }

    public void eiZ() {
        this.eja();
        this.kTp = bQo.kUy;
        this.kTq.a(bQw.kVA);
        fSe.gFu().a((aEF)this, kST);
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
        bQl bQl2 = this.kTG.get(this.hQx);
        if (bQl2 == null) {
            this.a(new ArrayList(), true);
            return;
        }
        if (bQl2.aLB()) {
            this.a(bQl2.ehT(), false);
        } else {
            this.ejd();
            bQl2.a(new bPR(this));
        }
        for (bPO bPO2 : new ArrayList<bPO>(this.kTs)) {
            bPO2.eiT();
        }
    }

    private void ejc() {
        this.kTG.values().forEach(bQl::clean);
        this.kTG.clear();
    }

    void a(List<bPt<?, ?>> list, boolean bl) {
        this.kTp = bQo.kUz;
        this.kTq.a(bQw.kVA);
        this.kTB.clear();
        this.kTB.addAll(list);
        if (bl) {
            this.eje();
        }
        fSe.gFu().a((aEF)this, kTa, kTc, kTd, kTh, kST);
    }

    private void ejd() {
        this.kTo = true;
        fSe.gFu().a((aEF)this, kSS);
    }

    void eje() {
        this.kTo = false;
        fSe.gFu().a((aEF)this, kSS);
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
            return aUM.cWf().c("marketBoard.noResults", new Object[0]);
        }
        if (string.equals(kTg)) {
            Optional<bPL> optional = this.kTF.stream().filter(bPL2 -> bPL2.ehX().aJr() == bPA.kRg.aJr()).findFirst();
            return optional.orElse(null);
        }
        return null;
    }

    public void ejf() {
        bOP.a(new bPS(this));
    }

    public bQo ejg() {
        return this.kTp;
    }

    public void a(bPO bPO2) {
        this.kTs.add(bPO2);
    }

    public void b(bPO bPO2) {
        this.kTs.remove(bPO2);
    }

    @Nullable
    protected bPG IR(int n) {
        return this.kTH.get(String.valueOf(n));
    }

    protected void IS(int n) {
        this.kTH.remove(String.valueOf(n));
    }

    public void e(bPt<?, ?> bPt2) {
        this.kTy.add(bPt2);
    }

    public void f(bPt<?, ?> bPt2) {
        this.kTy.remove(bPt2);
    }
}
