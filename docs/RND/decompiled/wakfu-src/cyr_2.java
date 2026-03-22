/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.auth.ApiKeyAuth
 *  com.ankama.haapi.client.okhttp.auth.Authentication
 *  com.ankama.shopi.client.auth.Authentication
 *  com.ankama.shopi.client.auth.HttpBearerAuth
 *  com.ankamagames.steam.wrapper.SteamApi
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.auth.ApiKeyAuth;
import com.ankama.haapi.client.okhttp.auth.Authentication;
import com.ankama.shopi.client.auth.HttpBearerAuth;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.wakfu.client.WakfuClient;
import gnu.trove.set.hash.THashSet;
import java.text.ParseException;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cYR
 */
public class cyr_2
implements adi_1 {
    static final cyr_2 nZp = new cyr_2();
    protected static final Logger nZq = Logger.getLogger(cyr_2.class);
    final THashSet<String> nZr = new THashSet();
    private static final int nZs = 5000;
    private static final int nZt = 500;
    private static final int nZu = 10000;
    private static final long nZv = 10000L;
    fbz_2 nZw;
    int nZx;
    long nZy;
    long nZz;
    private long nZA;
    bpp_2 kSK;
    cza_1 nZB;
    private boolean nZC = false;
    private boolean nZD;
    private alx_2 ikv;
    private final Runnable nZE = new cys_1(this);

    public static cyr_2 eYA() {
        return nZp;
    }

    private cyr_2() {
    }

    public void kS(boolean bl) {
        this.nZD = bl;
    }

    public void eYB() {
        this.kT(true);
    }

    public void kT(boolean bl) {
        if (this.nZr.contains((Object)"webShopDialog")) {
            fyw_0.gqw().tl("webShopDialog");
        } else {
            this.kU(bl);
        }
    }

    @NotNull
    public czb_1 eYC() {
        block9: {
            if (!ewo_0.oBF.k(ewr_0.oCa)) {
                return czb_1.nZW;
            }
            if (bMX.kAi.blc() && !bMX.kAi.efl()) {
                return czb_1.nZX;
            }
            if (byj_2.eoR()) {
                com.ankama.shopi.client.auth.Authentication authentication = WakfuClient.ceW().getAuthentication("jwt");
                if (!(authentication instanceof HttpBearerAuth)) {
                    nZq.error((Object)"Bad implementation of the shopi JWT retrieval");
                    return czb_1.nZY;
                }
                try {
                    if (((HttpBearerAuth)authentication).getBearerToken() == null) {
                        return czb_1.nZY;
                    }
                    break block9;
                }
                catch (NullPointerException nullPointerException) {
                    nZq.warn((Object)(String.valueOf(nullPointerException.getClass()) + " occured during jwt retrieval"));
                    return czb_1.nZY;
                }
            }
            Authentication authentication = WakfuClient.ceU().getAuthentication("AuthAnkamaApiKey");
            if (!(authentication instanceof ApiKeyAuth)) {
                nZq.error((Object)"Bad implementation of the zaap client API key retrieval");
                return czb_1.nZY;
            }
            if (((ApiKeyAuth)authentication).getApiKey() == null) {
                return czb_1.nZY;
            }
        }
        return czb_1.nZV;
    }

    public void kU(boolean bl) {
        if (!this.r(bl, true)) {
            return;
        }
        aaw_1.bUq().h(new dae_0(17003));
    }

    public void h(bpt_1<?, ?> bpt_12) {
        if (!this.r(false, true)) {
            return;
        }
        aaw_1.bUq().h(new dcH(18352, bpt_12));
    }

    public void eYD() {
        if (!this.r(false, true)) {
            return;
        }
        aaw_1.bUq().h(new dae_0(18262));
    }

    public void C(int n, boolean bl) {
        if (!this.r(false, false)) {
            nZq.error((Object)("Unable to initialiaze on steamFinalizeTxn, wait what ? (orderId : " + n + ", authorized : " + bl + ")"));
            return;
        }
        dae_0 dae_02 = new dae_0(18250);
        dae_02.sY(n);
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
    }

    public void qT(String string) {
        this.nZr.add((Object)string);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17003: {
                this.x("webShopDialog", "webShopDialog");
                this.eYF();
                return false;
            }
            case 18352: {
                dcH dcH2 = (dcH)aam_22;
                bpt_1<?, ?> bpt_12 = dcH2.dqu();
                String string = this.aK(bpt_12.eid());
                cyt_2 cyt_22 = new cyt_2(this, string, bpt_12);
                fyw_0.gqw().a(cyt_22);
                this.x(string, "webShopArticleDialog");
                this.kSK.e(bpt_12);
                fse_1.gFu().b("webShop.article", bpt_12, string);
                return false;
            }
            case 18262: {
                this.x("webShopDialog", "webShopDialog");
                this.eYF();
                this.kSK.eiU();
                return false;
            }
            case 18711: {
                dae_0 dae_02 = (dae_0)aam_22;
                int n = dae_02.bCo();
                this.NE(n);
                return false;
            }
            case 18610: {
                bpu_1<?> bpu_12 = this.kSK.ns("ogrins");
                if (bpu_12 != null) {
                    this.kSK.d(bpu_12);
                    this.kSK.nt("");
                    return false;
                }
                String string = auc_0.cVq().l("shopBuyOgrinesUrl", null);
                String string2 = String.format(string, aum_0.cWf().aUXX().aUR());
                aet_1.ht(string2);
                abg_2.bUP().h(this.nZE);
                abg_2.bUP().a(this.nZE, 10000L, -1);
                return false;
            }
            case 18313: {
                String string = auc_0.cVq().l("shopServices", null);
                String string3 = String.format(string, aum_0.cWf().aUXX().aUR(), aum_0.cWf().c("webShop.title.short", new Object[0]).toLowerCase(), ((dcI)aam_22).eiz());
                aet_1.ht(string3);
                return false;
            }
            case 19180: {
                String string = ((dae_0)aam_22).bCt();
                if (string == null) {
                    return false;
                }
                aet_1.ht(string);
                return false;
            }
            case 18250: {
                dae_0 dae_03 = (dae_0)aam_22;
                int n = dae_03.bCo();
                boolean bl = dae_03.bCu();
                this.kSK.C(n, bl);
                if (this.nZr.isEmpty()) {
                    aue_0.cVJ().b(nZp);
                }
                return false;
            }
            case 19609: {
                this.kSK.eiU();
                return false;
            }
            case 17349: {
                byte by = ((ama_1)aam_22).bCn();
                bqw_2 bqw_22 = bqw_2.cH(by);
                this.kSK.eiV().a(bqw_22);
                return false;
            }
            case 17090: {
                this.kSK.eiV().eju();
                return false;
            }
            case 18972: {
                this.kSK.eiV().ejv();
                return false;
            }
            case 18708: {
                dae_0 dae_04 = (dae_0)aam_22;
                bqr_2 bqr_22 = this.kSK.eiV();
                bqr_22.lZ(dae_04.bCp());
                return false;
            }
            case 18504: {
                dae_0 dae_05 = (dae_0)aam_22;
                bqr_2 bqr_23 = this.kSK.eiV();
                try {
                    bqr_23.ma(aum_0.cWf().cQ(dae_05.bCt()));
                }
                catch (ParseException parseException) {
                    nZq.error((Object)"Error parsing price to sell conversion stone", (Throwable)parseException);
                }
                return false;
            }
            case 17352: {
                dae_0 dae_06 = (dae_0)aam_22;
                this.kSK.eiV().b((bqq_2)dae_06.bCv());
                return false;
            }
            case 16390: {
                this.kSK.eiV().ejo();
                return false;
            }
            case 17594: {
                this.kSK.eiV().ejp();
                return false;
            }
            case 17497: {
                this.kSK.eiV().ejs();
                return false;
            }
            case 16908: {
                this.kSK.eiV().a((bqq_2)((ama_1)aam_22).bCv());
                return false;
            }
            case 17890: {
                this.kSK.eiV().ejy();
                return false;
            }
            case 16018: {
                if (this.nZC) {
                    return false;
                }
                this.nZC = true;
                Bu bu = (Bu)((dae_0)aam_22).bCv();
                bpt_1 bpt_13 = (bpt_1)bu.getFirst();
                if (bpt_13 == null) {
                    nZq.error((Object)"Cannot purchase a null article");
                    return false;
                }
                if (bpt_13 instanceof bpb_2) {
                    bpb_2 bpb_22 = (bpb_2)bpt_13;
                    euG.ors.a((Integer)bpb_22.eid(), this.k(bpb_22.getName(), bpb_22.eid()));
                } else if (bpt_13 instanceof bpg_2) {
                    bpg_2 bpg_22 = (bpg_2)bpt_13;
                    bpp_2 bpp_22 = (bpp_2)bu.aHI();
                    if (bpp_22 == null) {
                        nZq.error((Object)"Cannot purchase an article without session");
                        return false;
                    }
                    bpp_22.a(bpg_22, new cyu_1(this, bpg_22, bpp_22, bpt_13));
                } else {
                    nZq.error((Object)("[SHOP] Unable to buy following " + String.valueOf(bpt_13)));
                }
                return false;
            }
        }
        return true;
    }

    public bpp_2 eYE() {
        return this.kSK;
    }

    private boolean r(boolean bl, boolean bl2) {
        if (!aue_0.cVJ().c(this)) {
            czb_1 czb_12;
            if (bl2 && !(czb_12 = this.eYC()).isValid()) {
                switch (czb_12.ordinal()) {
                    case 1: {
                        fiq_2.gCw().d(fik_2.gBZ().l("shop.disabled", new Object[0]));
                        break;
                    }
                    case 2: {
                        fiq_2.gCw().d(fik_2.gBZ().l("steam.needOverlayForShop", new Object[0]));
                        break;
                    }
                    case 3: {
                        fiq_2.gCw().d(fik_2.gBZ().l("shop.missingAuth", new Object[0]));
                        if (this.nZA != -1L && System.currentTimeMillis() - this.nZA < 10000L) break;
                        aue_0.cVJ().etu().d(new cyl_0(aum_0.cWf().aUXX().aUP()));
                        this.nZA = System.currentTimeMillis();
                        break;
                    }
                    default: {
                        nZq.warn((Object)("Following " + czb_1.class.getName() + " not managed"));
                    }
                }
                return false;
            }
            this.kS(bl);
            aue_0.cVJ().a(this);
        } else if (bl) {
            this.kSK.eiZ();
        }
        return true;
    }

    private void x(String string, String string2) {
        if (!this.nZr.contains((Object)string)) {
            fyw_0.gqw().a(string, ccj_2.pe(string2), 32768L);
            this.nZr.add((Object)string);
        }
    }

    private void eYF() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("webShopDialog");
        if (fhs_22 == null) {
            return;
        }
        this.nZw = (fbz_2)fhs_22.uH("bannerList");
        if (this.nZw == null) {
            return;
        }
        this.nZw.setScrollMode(fzd_0.tGL);
        this.nZw.setScrollOnMouseWheel(false);
        this.nZy = System.currentTimeMillis();
        this.nZB = new cza_1(this);
        abg_2.bUP().a((Runnable)this.nZB, 250L, -1);
    }

    private void NE(int n) {
        if (!this.nZB.nZT) {
            return;
        }
        int n2 = (this.nZx % this.kSK.eiX() + this.kSK.eiX()) % this.kSK.eiX();
        this.eT(n, n2);
        this.nZz = System.currentTimeMillis();
    }

    void eT(int n, int n2) {
        if (this.nZw == null) {
            return;
        }
        this.nZw.x(fsy_2.class);
        fsy_2 fsy_22 = new fsy_2(n2, n, this.nZw, 0, 500, abn.cdr);
        fsy_22.a(new cyv_1(this));
        this.nZw.a(fsy_22);
    }

    private String aK(Object object) {
        return "webShopArticleDialog" + String.valueOf(object);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cyw_2(this);
            this.kV(this.nZD);
            this.kSK.eiV().ip(false);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.webShop", chw_1.class);
        }
    }

    public void kV(boolean bl) {
        this.kSK = new bpp_2();
        this.kSK.a(new cyx_1(this), bl);
        fse_1.gFu().f("webShop", this.kSK);
        this.nZC = false;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            for (String string : this.nZr) {
                fyw_0.gqw().tl(string);
            }
            this.nZr.clear();
            fyw_0.gqw().tc("wakfu.webShop");
            fse_1.gFu().vX("webShop");
            ckm_0 ckm_02 = new ckm_0();
            ckm_02.os(aum_0.cWf().aUXX().aUR());
            aue_0.cVJ().etu().d(ckm_02);
            abg_2.bUP().h(this.nZE);
            this.kSK = null;
            this.nZC = false;
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void qU(String string) {
        if (!fyw_0.gqw().to("webShopDialog")) {
            this.kU(false);
            if (this.kSK.isInitialized()) {
                this.qV(string);
            } else {
                this.kSK.a(new cyy_1(this, string));
            }
        } else {
            this.qV(string);
        }
    }

    void qV(String string) {
        this.kSK.d(this.kSK.ns(string));
        this.kSK.nt("");
    }

    private Consumer<euE> k(String string, Object object) {
        return this.a(string, object, null);
    }

    Consumer<euE> a(String string, Object object, @Nullable Runnable runnable) {
        return euE2 -> {
            this.nZC = false;
            if (euE2 != euE.orh && runnable != null) {
                runnable.run();
            }
            switch (euE2) {
                case orh: {
                    return;
                }
                case ori: {
                    return;
                }
                case ork: {
                    try {
                        String string2 = auc_0.cVq().bS("payementHandleUrl");
                        String string3 = String.format(string2, aum_0.cWf().aUXX().aUR(), string, aum_0.cWf().c("webShop.title.short", new Object[0]).toLowerCase(), object);
                        if (bMX.kAi.blc()) {
                            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string3);
                            break;
                        }
                        aet_1.ht(string3);
                        break;
                    }
                    catch (fu_0 fu_02) {
                        nZq.error((Object)"Failed to open browser shop", (Throwable)fu_02);
                    }
                }
                default: {
                    fiq_2.gCw().d(fik_2.gBZ().l("webShop.oneClick.error", -3).abQ(1));
                }
            }
        };
    }
}

