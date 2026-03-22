/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.ArticleList
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.ArticleList;
import java.util.List;
import java.util.Map;

class bOZ
implements ApiCallback<ArticleList> {
    final /* synthetic */ bOX kOd;
    final /* synthetic */ String kOe;
    final /* synthetic */ int kOf;
    final /* synthetic */ int kOg;

    bOZ(bOX bOX2, String string, int n, int n2) {
        this.kOd = bOX2;
        this.kOe = string;
        this.kOf = n;
        this.kOg = n2;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bOY.kNZ.error((Object)"Following error occured during searchArticles request", (Throwable)apiException);
        this.kOd.cXM();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ArticleList articleList, int n, Map<String, List<String>> map) {
        Class<bOU> clazz = bOU.class;
        synchronized (bOU.class) {
            bOY.kOb = this.kOe;
            bOY.kOc = byj_2.as(articleList.getValues());
            byj_2.a(this.kOd::d, bOY.kOc, this.kOf, this.kOg);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return;
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((ArticleList)object, n, map);
    }
}

