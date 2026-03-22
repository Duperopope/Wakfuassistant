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
import java.util.List;
import java.util.Map;

/*
 * Renamed from bOS
 */
class bos_0
implements ApiCallback<Article> {
    final /* synthetic */ String kNO;
    final /* synthetic */ boq_0 kNP;

    bos_0(String string, boq_0 boq_02) {
        this.kNO = string;
        this.kNP = boq_02;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        switch (n) {
            case 404: {
                bor_0.kNN.info((Object)("Article with following key " + this.kNO + " isn't found"));
                this.kNP.ehO();
                break;
            }
            default: {
                bor_0.kNN.error((Object)("Following error occured during getArticleByKey request for " + this.kNO), (Throwable)apiException);
                this.kNP.cXM();
            }
        }
    }

    public void a(Article article, int n, Map<String, List<String>> map) {
        bpg_2 bpg_22 = bPq.a(article);
        if (bpg_22 != null) {
            this.kNP.onArticleFound(bpg_22);
        } else {
            this.kNP.ehO();
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Article)object, n, map);
    }
}

