/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.ArticleList
 *  com.ankama.shopi.client.model.CatalogPage
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.ArticleList;
import com.ankama.shopi.client.model.CatalogPage;
import java.util.List;
import java.util.Map;

class bOV
implements ApiCallback<CatalogPage> {
    final /* synthetic */ bot_0 kNT;

    bOV(bot_0 bot_02) {
        this.kNT = bot_02;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bOU.kNQ.error((Object)("Following error (status code : " + n + ") occured during listArticles request"), (Throwable)apiException);
        this.kNT.cXM();
    }

    public void a(CatalogPage catalogPage, int n, Map<String, List<String>> map) {
        ArticleList articleList = catalogPage.getArticles();
        this.kNT.c(articleList.getCount().intValue(), byj_2.as(articleList.getValues()));
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CatalogPage)object, n, map);
    }
}

