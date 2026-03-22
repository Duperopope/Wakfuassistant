/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.PromoteGroup
 *  com.ankama.shopi.client.model.PromoteSectionArticle
 *  com.ankama.shopi.client.model.PromoteSectionCarousel
 *  com.ankama.shopi.client.model.PromoteSectionOneOf
 *  com.ankama.shopi.client.model.PromoteSectionOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.PromoteGroup;
import com.ankama.shopi.client.model.PromoteSectionArticle;
import com.ankama.shopi.client.model.PromoteSectionCarousel;
import com.ankama.shopi.client.model.PromoteSectionOneOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class bPe
implements ApiCallback<PromoteGroup> {
    final /* synthetic */ bPc kOm;

    bPe(bPc bPc2) {
        this.kOm = bPc2;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bPd.kOl.error((Object)"Following error occured during getHomePhagePromoteGroup request", (Throwable)apiException);
        this.kOm.cXM();
    }

    public void a(PromoteGroup promoteGroup, int n, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        block5: for (PromoteSectionOneOf promoteSectionOneOf : promoteGroup.getPromoteSections()) {
            PromoteSectionOneOf.DiscriminatorEnum discriminatorEnum = promoteSectionOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case PROMOTESECTIONARTICLE: {
                    PromoteSectionArticle promoteSectionArticle = promoteSectionOneOf.getPromoteSectionArticle();
                    if (promoteSectionArticle == null) {
                        bPd.kOl.warn((Object)String.format("Missing %s with following discriminator %s in following %s", PromoteSectionArticle.class, discriminatorEnum, promoteSectionOneOf));
                        continue block5;
                    }
                    arrayList.addAll(byj_2.as(promoteSectionArticle.getTargets()));
                    continue block5;
                }
                case PROMOTESECTIONCAROUSEL: {
                    PromoteSectionArticle promoteSectionArticle = promoteSectionOneOf.getPromoteSectionCarousel();
                    if (promoteSectionArticle == null) {
                        bPd.kOl.warn((Object)String.format("Missing %s with following discriminator %s in following %s", PromoteSectionCarousel.class, discriminatorEnum, promoteSectionOneOf));
                        continue block5;
                    }
                    arrayList2.addAll(bPq.ai(promoteSectionArticle.getPromotes()));
                    continue block5;
                }
                case PROMOTESECTIONIMAGE: {
                    continue block5;
                }
            }
            bPd.kOl.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract promoted stuff from %s", discriminatorEnum, promoteSectionOneOf));
        }
        this.kOm.b(arrayList2, arrayList);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((PromoteGroup)object, n, map);
    }
}

