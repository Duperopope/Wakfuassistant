/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Article
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Article;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Renamed from bQt
 */
class bqt_2
implements ApiCallback<Article> {
    final /* synthetic */ Consumer kVw;

    bqt_2(bqr_2 bqr_22, Consumer consumer) {
        this.kVw = consumer;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bqr_2.kUN.error((Object)"Following error occured during getArticleByKey request", (Throwable)apiException);
    }

    public void a(Article article, int n, Map<String, List<String>> map) {
        bpg_2 bpg_22 = bPq.a(article);
        this.kVw.accept(bpg_22 != null ? Collections.singletonList(bpg_22) : Collections.emptyList());
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Article)object, n, map);
    }
}

