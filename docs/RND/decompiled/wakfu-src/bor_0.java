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
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleByKeyRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleByKeyRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bOR
 */
public class bor_0 {
    static final Logger kNN = Logger.getLogger(bor_0.class);

    public static void a(boq_0 boq_02, String string) {
        if (fse_1.gFu().dp("demo")) {
            return;
        }
        if (byj_2.eoR()) {
            ArticleApi articleApi = new ArticleApi(WakfuClient.ceW());
            try {
                ArticleByKeyRequest articleByKeyRequest = new ArticleByKeyRequest().key(string);
                if (WakfuClient.dSV.cfl().cgf()) {
                    kNN.info((Object)("[SHOPI-DEBUG] getArticleByKey with following request : " + String.valueOf(articleByKeyRequest)));
                }
                articleApi.getArticleByKeyAsync(byj_2.eoS(), byj_2.lyN, articleByKeyRequest, (ApiCallback)new bos_0(string, boq_02));
            }
            catch (ApiException apiException) {
                kNN.error((Object)("Following error occured during getArticleByKey request for" + string), (Throwable)apiException);
                boq_02.cXM();
            }
        } else {
            ShopApi.articlesListByKeyRequest articlesListByKeyRequest2 = ShopApi.articlesListByKeyRequest().key(Collections.singletonList(string));
            ShopApi.articlesListByKeyCallback articlesListByKeyCallback2 = ShopApi.articlesListByKeyCallback().on200(apiResponse -> {
                List<bpt_1<?, ?>> list = bQz.aq(((ShopArticlesList)apiResponse.getData()).getArticles());
                if (list.isEmpty()) {
                    boq_02.ehO();
                } else {
                    boq_02.onArticleFound(list.get(0));
                }
            }).on403(apiResponse -> {
                boq_02.cXM();
                kNN.error((Object)("Error during loadArticleByKey for " + string + " : " + String.valueOf(apiResponse)));
            }).onDefault(apiResponse -> {
                boq_02.cXM();
                kNN.error((Object)("Error during loadArticleByKey for " + string + " : " + (String)apiResponse.getData()));
            }).onException(throwable -> {
                boq_02.cXM();
                kNN.error((Object)("Error during loadArticleByKey for " + string), throwable);
            });
            WakfuClient.ceU().sendAsync((ApiCallback.Request)articlesListByKeyRequest2, (ApiCallback.Callback)articlesListByKeyCallback2);
        }
    }
}

