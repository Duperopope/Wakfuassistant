/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListSearchCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListSearchRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleSearchRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleSearchRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Objects;
import org.apache.log4j.Logger;

public class bOY {
    static final Logger kNZ = Logger.getLogger(bOY.class);
    public static final int kOa = 100;
    static String kOb;
    static List<bpt_1<?, ?>> kOc;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(bOX bOX2, String string, int n, int n2) {
        if (byj_2.eoR()) {
            Class<bOU> clazz = bOU.class;
            synchronized (bOU.class) {
                if (kOc != null && Objects.equals(string, kOb)) {
                    byj_2.a(bOX2::d, kOc, n, n2);
                    // ** MonitorExit[var4_4] (shouldn't be in output)
                    return;
                }
                ArticleApi articleApi = new ArticleApi(WakfuClient.ceW());
                try {
                    ArticleSearchRequest articleSearchRequest = new ArticleSearchRequest().text(string).limit(Integer.valueOf(100));
                    if (WakfuClient.dSV.cfl().cgf()) {
                        kNZ.info((Object)("[SHOPI-DEBUG] searchArticles with following request : " + String.valueOf(articleSearchRequest)));
                    }
                    articleApi.searchArticlesAsync(byj_2.eoS(), byj_2.lyN, articleSearchRequest, (ApiCallback)new bOZ(bOX2, string, n, n2));
                }
                catch (ApiException apiException) {
                    kNZ.error((Object)"Following error occured during searchArticles request", (Throwable)apiException);
                    bOX2.cXM();
                }
            }
        }
        ShopApi.articlesListSearchRequest articlesListSearchRequest2 = ShopApi.articlesListSearchRequest().text(string).page(Long.valueOf(n)).size(Long.valueOf(n2));
        ShopApi.articlesListSearchCallback articlesListSearchCallback2 = ShopApi.articlesListSearchCallback().on200(apiResponse -> bOX2.d(((ShopArticlesList)apiResponse.getData()).getTotalCount(), ((ShopArticlesList)apiResponse.getData()).getArticles().stream().map(bPq::a).filter(Objects::nonNull).filter(bpt_1::eim).toList())).on403(apiResponse -> {
            bOX2.cXM();
            kNZ.error((Object)("Error during ArticlesListSearch load : " + String.valueOf(apiResponse)));
        }).onDefault(apiResponse -> {
            bOX2.cXM();
            kNZ.error((Object)("Error during ArticlesListSearch load : " + (String)apiResponse.getData()));
        }).onException(throwable -> {
            bOX2.cXM();
            kNZ.error((Object)"Error during ArticlesListSearch load", throwable);
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)articlesListSearchRequest2, (ApiCallback.Callback)articlesListSearchCallback2);
    }

    public static void ehP() {
        kOb = null;
        kOc = null;
    }
}

