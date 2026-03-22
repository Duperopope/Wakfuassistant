/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByCategoryCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByCategoryRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CatalogApi
 *  com.ankama.shopi.client.model.GetCatalogPageRequest
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CatalogApi;
import com.ankama.shopi.client.model.GetCatalogPageRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

public class bOU {
    static final Logger kNQ = Logger.getLogger(bOU.class);
    public static final int kNR = 100;
    static final Map<String, @Unmodifiable List<bpt_1<?, ?>>> kNS = new HashMap();

    public static void a(bot_0 bot_02, Object object, int n, int n2) {
        if (byj_2.eoR()) {
            String string = String.valueOf(object);
            if (byj_2.nN(string)) {
                bOU.a(bot_02, string, n, n2);
            } else {
                bOU.b(bot_02, string, n, n2);
            }
        } else {
            long l = object instanceof Number ? ((Number)object).longValue() : Long.parseLong(String.valueOf(object));
            bOU.a(bot_02, l, (long)n, (long)n2);
        }
    }

    private static void a(bot_0 bot_02, long l, long l2, long l3) {
        ShopApi.articlesListByCategoryRequest articlesListByCategoryRequest2 = ShopApi.articlesListByCategoryRequest().categoryId(Long.valueOf(l)).page(Long.valueOf(l2)).size(Long.valueOf(l3));
        ShopApi.articlesListByCategoryCallback articlesListByCategoryCallback2 = ShopApi.articlesListByCategoryCallback().on200(apiResponse -> bot_02.c(((ShopArticlesList)apiResponse.getData()).getTotalCount(), bQz.aq(((ShopArticlesList)apiResponse.getData()).getArticles()))).on403(apiResponse -> {
            bot_02.cXM();
            kNQ.error((Object)("Error during articlesListByCategoryRequest load : " + String.valueOf(apiResponse)));
        }).onDefault(apiResponse -> {
            bot_02.cXM();
            kNQ.error((Object)("Error during articlesListByCategoryRequest load : " + (String)apiResponse.getData()));
        }).onException(throwable -> {
            bot_02.cXM();
            kNQ.error((Object)"Error during articlesListByCategoryRequest load", throwable);
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)articlesListByCategoryRequest2, (ApiCallback.Callback)articlesListByCategoryCallback2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(bot_0 bot_02, String string, int n, int n2) {
        Class<bOU> clazz = bOU.class;
        synchronized (bOU.class) {
            if (kNS.containsKey(string)) {
                byj_2.a(bot_02::c, kNS.get(string), n, n2);
                // ** MonitorExit[var4_4] (shouldn't be in output)
                return;
            }
            bOW bOW2 = new bOW(string, bot_02, n, n2);
            bOU.b(bOW2, string, bOW2.dfz(), 100);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return;
        }
    }

    public static void ehP() {
        kNS.clear();
    }

    static void b(bot_0 bot_02, String string, int n, int n2) {
        CatalogApi catalogApi = new CatalogApi(WakfuClient.ceW());
        try {
            GetCatalogPageRequest getCatalogPageRequest = new GetCatalogPageRequest().categoryId(string).limit(Integer.valueOf(n2)).page(Integer.valueOf(n));
            if (WakfuClient.dSV.cfl().cgf()) {
                kNQ.info((Object)("[SHOPI-DEBUG] getCatalogPage with following request : " + String.valueOf(getCatalogPageRequest)));
            }
            catalogApi.getCatalogPageAsync(byj_2.eoS(), byj_2.lyN, getCatalogPageRequest, (ApiCallback)new bOV(bot_02));
        }
        catch (ApiException apiException) {
            kNQ.error((Object)"Following error occured during listArticles request", (Throwable)apiException);
            bot_02.cXM();
        }
    }
}

