/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.CategoryList
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.CategoryList;
import java.util.List;
import java.util.Map;

class bPf
implements ApiCallback<CategoryList> {
    final /* synthetic */ bPb kOn;

    bPf(bPb bPb2) {
        this.kOn = bPb2;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bPd.kOl.error((Object)"Following error occured during listCategories request", (Throwable)apiException);
        this.kOn.cXM();
    }

    public void a(CategoryList categoryList, int n, Map<String, List<String>> map) {
        this.kOn.ad(byj_2.ar(categoryList.getValues()));
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CategoryList)object, n, map);
    }
}

