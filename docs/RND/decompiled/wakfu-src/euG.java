/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.auth.ApiKeyAuth
 *  com.ankama.haapi.client.okhttp.auth.Authentication
 *  com.ankama.shopi.client.auth.Authentication
 *  com.ankama.shopi.client.auth.HttpBearerAuth
 *  com.ankama.zaap.OverlayPosition
 *  com.ankama.zaap.ZaapClient
 *  com.ankama.zaap.ZaapParametersSources
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Logger
 *  org.apache.thrift.TException
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.haapi.client.okhttp.auth.ApiKeyAuth;
import com.ankama.haapi.client.okhttp.auth.Authentication;
import com.ankama.shopi.client.auth.HttpBearerAuth;
import com.ankama.zaap.OverlayPosition;
import com.ankama.zaap.ZaapClient;
import com.ankama.zaap.ZaapParametersSources;
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.jetbrains.annotations.NotNull;

public class euG {
    private static final Logger orp = Logger.getLogger(euG.class);
    private static final String orq = "demo";
    private static final String orr = "local";
    public static final euG ors = new euG();
    private ZaapClient ort;
    private ZaapParametersSources oru;
    private static final OverlayPosition orv = new OverlayPosition(15, 15, 70, 70);

    public static void fdh() {
        String string = auc_0.cVq().bS("branch");
        if (BH.aU(string)) {
            fse_1.gFu().f("branch", "null");
            fse_1.gFu().f(orq, false);
            throw new fu_0("Property 'branch' can't be null");
        }
        fse_1.gFu().f("branch", string);
        fse_1.gFu().f(orq, orq.equals(string));
    }

    public static ZaapParametersSources fdi() {
        String string = fse_1.gFu().du("branch");
        return orr.equals(string) ? ZaapParametersSources.FILE : ZaapParametersSources.ENV_VARIABLES;
    }

    public static void fdj() {
        abg_2.bUP().i(() -> {
            aue_0.cVJ().a(cwv_1.nSI);
            aue_0.cVJ().a(csn_2.eNY());
        });
    }

    public static void rx(String string) {
        aue_0 aue_02 = aue_0.cVJ();
        aue_02.kS(string);
        aue_02.ja(false);
        euG.eNZ();
    }

    public static void eNZ() {
        abg_2.bUP().i(() -> {
            aue_0.cVJ().a(cwv_1.nSI);
            fiu_1.uCW.N("loginLock", false);
            aue_0.cVJ().a(auz_0.gzl);
            ArrayList<oo_0> arrayList = auc_0.cVq().cVI();
            aue_0.cVJ().B(arrayList);
        });
    }

    public boolean fdk() {
        return this.ort != null;
    }

    public void a(euF euF2) {
        this.a(euF2, ZaapParametersSources.ENV_VARIABLES);
    }

    public void a(euF euF2, ZaapParametersSources zaapParametersSources) {
        this.oru = zaapParametersSources;
        this.a(() -> {
            block5: {
                try {
                    orp.info((Object)("connect(" + String.valueOf(zaapParametersSources) + ")"));
                    this.ort = ZaapClient.connect((ZaapParametersSources)this.oru);
                    if (euF2 != null) {
                        euF2.cZe();
                    }
                }
                catch (TException tException) {
                    orp.error((Object)"Error during Zaap init ", (Throwable)tException);
                    if (euF2 != null) {
                        euF2.kW("thrift.exception");
                    }
                }
                catch (Exception exception) {
                    orp.error((Object)"Error during Zaap init ", (Throwable)exception);
                    if (euF2 == null) break block5;
                    euF2.kW("connect.exception");
                }
            }
            return this.ort;
        }, euF2);
    }

    public void b(euF euF2) {
        if (this.ort == null) {
            this.a(new euH(this, euF2), this.oru);
            return;
        }
        this.a(() -> {
            String string;
            block3: {
                string = null;
                try {
                    string = this.ort.getClient().auth_getGameToken(this.ort.session, 3);
                    orp.info((Object)"Token received from Zaap");
                    aue_0.cVJ().kS(string);
                    if (euF2 != null) {
                        euF2.kX(string);
                    }
                }
                catch (TException tException) {
                    orp.error((Object)"Error during Zaap init ", (Throwable)tException);
                    if (euF2 == null) break block3;
                    euF2.kW("token.exception");
                }
            }
            return string;
        }, euF2);
    }

    public void c(euF euF2) {
        if (this.ort == null) {
            this.a(new euI(this, euF2), this.oru);
            return;
        }
        this.a(() -> {
            String string;
            try {
                string = this.ort.getClient().userInfo_get(this.ort.session);
                orp.info((Object)"User info received from Zaap");
            }
            catch (TException tException) {
                orp.error((Object)"Error during Zaap init ", (Throwable)tException);
                if (euF2 != null) {
                    euF2.kW("userInfo.exception");
                }
                return null;
            }
            if (BH.aU(string)) {
                orp.error((Object)"User info received from Zaap are empty");
                if (euF2 != null) {
                    euF2.kW("userInfo.missing");
                }
                return null;
            }
            try {
                euN euN2 = (euN)new GsonBuilder().create().fromJson(string, euN.class);
                if (euF2 != null) {
                    euF2.a(euN2);
                }
                return euN2;
            }
            catch (Exception exception) {
                orp.error((Object)String.format("Mapping error for following user info received from Zaap : \"%s\"", string), (Throwable)exception);
                if (euF2 != null) {
                    euF2.kW("userInfo.mapping");
                }
                return null;
            }
        }, euF2);
    }

    private <T> void a(Callable<T> callable, euF euF2) {
        try (ExecutorService executorService = Executors.newSingleThreadExecutor();){
            Future<T> future = executorService.submit(callable);
            try {
                future.get(5L, TimeUnit.SECONDS);
            }
            catch (InterruptedException interruptedException) {
                orp.error((Object)"Interruption while connecting to Zaap", (Throwable)interruptedException);
                if (euF2 != null) {
                    euF2.kW("interrupted.exception");
                }
            }
            catch (ExecutionException executionException) {
                orp.error((Object)"ExecutionException while connecting to Zaap", (Throwable)executionException);
                if (euF2 != null) {
                    euF2.kW("execution.exception");
                }
            }
            catch (TimeoutException timeoutException) {
                orp.error((Object)"Timeout while connecting to Zaap", (Throwable)timeoutException);
                executorService.shutdownNow();
                if (euF2 != null) {
                    euF2.kW("timeout.exception");
                }
            }
        }
    }

    public void a(int n, Consumer<euE> consumer) {
        if (this.ort == null) {
            this.a(new euJ(this, n, consumer), this.oru);
            return;
        }
        ((CompletableFuture)CompletableFuture.supplyAsync(this.Oi(n)).thenAccept(bl -> {
            if (bl.booleanValue()) {
                consumer.accept(euE.orh);
            } else {
                consumer.accept(euE.ori);
            }
        })).exceptionally(throwable -> {
            if (throwable instanceof InterruptedException) {
                orp.error((Object)("Interruption while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(euE.ork);
                return null;
            }
            if (throwable instanceof ExecutionException) {
                orp.error((Object)("ExecutionException while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(euE.orl);
                return null;
            }
            if (throwable instanceof TimeoutException) {
                orp.error((Object)("Timeout while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(euE.orm);
                return null;
            }
            orp.error((Object)("Error while purchasing article " + n), throwable);
            consumer.accept(euE.orl);
            return null;
        });
    }

    @NotNull
    private Supplier<Boolean> Oi(int n) {
        return () -> {
            try {
                Authentication authentication = WakfuClient.ceU().getAuthentication("AuthAnkamaApiKey");
                if (!(authentication instanceof ApiKeyAuth)) {
                    orp.error((Object)"Bad implementation of the zaap client API key retrieval");
                    return false;
                }
                int n2 = this.fdl();
                if (n2 == -1) {
                    return false;
                }
                boolean bl = this.ort.getClient().payArticleWithPid(this.ort.session, ((ApiKeyAuth)authentication).getApiKey(), n, n2, orv);
                orp.info((Object)String.format("Purchase result received from zaap for the article %s. Purchase was %ssuccessful", n, bl ? "" : "un"));
                return bl;
            }
            catch (TException tException) {
                orp.info((Object)("Error during purchase of article " + n), (Throwable)tException);
                return false;
            }
        };
    }

    public void a(String string, Consumer<euE> consumer) {
        if (this.ort == null) {
            this.a(new euK(this, string, consumer), this.oru);
            return;
        }
        ((CompletableFuture)CompletableFuture.supplyAsync(this.ry(string)).thenAccept(bl -> {
            if (bl.booleanValue()) {
                consumer.accept(euE.orh);
            } else {
                consumer.accept(euE.ori);
            }
        })).exceptionally(throwable -> {
            if (throwable instanceof InterruptedException) {
                orp.error((Object)("Interruption while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(euE.ork);
                return null;
            }
            if (throwable instanceof ExecutionException) {
                orp.error((Object)("ExecutionException while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(euE.orl);
                return null;
            }
            if (throwable instanceof TimeoutException) {
                orp.error((Object)("Timeout while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(euE.orm);
                return null;
            }
            orp.error((Object)("Error while purchasing card " + string), throwable);
            consumer.accept(euE.orl);
            return null;
        });
    }

    @NotNull
    private Supplier<Boolean> ry(String string) {
        return () -> {
            try {
                com.ankama.shopi.client.auth.Authentication authentication = WakfuClient.ceW().getAuthentication("jwt");
                if (!(authentication instanceof HttpBearerAuth)) {
                    orp.error((Object)"Bad implementation of the shopi JWT retrieval");
                    return false;
                }
                int n = this.fdl();
                if (n == -1) {
                    return false;
                }
                String string2 = this.ort.session;
                String string3 = ((HttpBearerAuth)authentication).getBearerToken();
                String string4 = byj_2.lyN.getValue();
                if (WakfuClient.dSV.cfl().cgf()) {
                    orp.info((Object)("[SHOPI-DEBUG] payCartWithPid by zaap with following session : " + string2 + ", accessToken : " + string3 + ", shopKey: " + string4 + ", cartId : " + string + ", pid : " + n + ", position : " + String.valueOf(orv)));
                }
                boolean bl = this.ort.getClient().payCartWithPid(string2, string3, string4, string, n, orv);
                orp.info((Object)String.format("Purchase result received from zaap for the card %s. Purchase was %ssuccessful", string, bl ? "" : "un"));
                return bl;
            }
            catch (TException tException) {
                orp.info((Object)("Error during purchase of card " + string), (Throwable)tException);
                return false;
            }
        };
    }

    private int fdl() {
        return GC.cw(ProcessHandle.current().pid());
    }

    public static void iY(String string) {
        aaw_1.bUq().h(new vt_0(() -> fiq_2.gCw().d(fik_2.gBZ().l("zaap.error." + string, new Object[0]).vG(ccp_2.mRF.byf()))));
    }
}

