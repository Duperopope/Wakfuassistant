/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$homeCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$homeRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopHome
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CategoryApi
 *  com.ankama.shopi.client.api.PromoteApi
 *  com.ankama.shopi.client.model.ShopKey
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopHome;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CategoryApi;
import com.ankama.shopi.client.api.PromoteApi;
import com.ankama.shopi.client.model.ShopKey;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bPd {
    static final Logger kOl = Logger.getLogger(bPd.class);

    private bPd() {
    }

    private static void a(@Nullable bPc bPc2, @Nullable bPb bPb2) {
        ShopApi.homeRequest homeRequest2 = ShopApi.homeRequest();
        ShopApi.homeCallback homeCallback2 = ShopApi.homeCallback().on200(apiResponse -> {
            if (bPb2 != null) {
                bPb2.ad(bQz.ar(((ShopHome)apiResponse.getData()).getCategories()));
            }
            if (bPc2 != null) {
                List<bpt_1<?, ?>> list = bQz.aq(((ShopHome)apiResponse.getData()).getGondolaheadArticle());
                List<bpw_1<?, ?>> list2 = bPq.ah(((ShopHome)apiResponse.getData()).getHightlightCarousel());
                bPc2.b(list2, list);
            }
        }).onDefault(apiResponse -> {
            kOl.warn((Object)("Error " + apiResponse.getStatusCode() + " while retrieving shop home: " + (String)apiResponse.getData()));
            if (bPb2 != null) {
                bPb2.cXM();
            }
            if (bPc2 != null && bPc2 != bPb2) {
                bPc2.cXM();
            }
        }).onException(throwable -> {
            kOl.error((Object)"Error while retrieving shop home", throwable);
            if (bPb2 != null) {
                bPb2.cXM();
            }
            if (bPc2 != null && bPc2 != bPb2) {
                bPc2.cXM();
            }
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)homeRequest2, (ApiCallback.Callback)homeCallback2);
    }

    private static void a(@NotNull bPc bPc2) {
        PromoteApi promoteApi = new PromoteApi(WakfuClient.ceW());
        try {
            if (WakfuClient.dSV.cfl().cgf()) {
                kOl.info((Object)"[SHOPI-DEBUG] getHomePagePromoteGroup");
            }
            promoteApi.getHomePagePromoteGroupAsync(byj_2.eoS(), byj_2.lyN, (ApiCallback)new bPe(bPc2));
        }
        catch (ApiException apiException) {
            kOl.error((Object)"Following error occured during getHomePhagePromoteGroup request", (Throwable)apiException);
            bPc2.cXM();
        }
    }

    private static void a(@NotNull bPb bPb2) {
        CategoryApi categoryApi = new CategoryApi(WakfuClient.ceW());
        try {
            int n = 100;
            boolean bl = true;
            String string = "0";
            if (WakfuClient.dSV.cfl().cgf()) {
                kOl.info((Object)"[SHOPI-DEBUG] listCategories with following limit : 100, page : 1, parentCategoryId: 0");
            }
            categoryApi.listCategoriesAsync(byj_2.eoS(), ShopKey.WAKFU_INGAME, Integer.valueOf(100), Integer.valueOf(1), "0", (ApiCallback)new bPf(bPb2));
        }
        catch (ApiException apiException) {
            kOl.error((Object)"Exception occured during retrieval of categories", (Throwable)apiException);
            bPb2.cXM();
        }
    }

    public static void b(@NotNull bPb bPb2) {
        if (byj_2.eoR()) {
            bPd.a(bPb2);
        } else {
            bPd.a(null, bPb2);
        }
    }

    public static void b(@NotNull bPc bPc2, @Nullable bPb bPb2) {
        if (byj_2.eoR()) {
            if (bPb2 != null) {
                bPd.a(bPb2);
            }
            bPd.a(bPc2);
        } else {
            bPd.a(bPc2, bPb2);
        }
    }
}

