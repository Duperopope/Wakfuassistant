/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.GameActionsActionsTypeMeta
 *  com.ankama.haapi.client.okhttp.ankama.model.GameActionsDefinition
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticle
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopHighlight
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopPrice
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopPromo
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReference
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeAccountStatus
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeGameAction
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeIceGift
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeKard
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeOgrine
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeVirtualSubscriptionLevel
 *  com.ankama.shopi.client.model.AccountStatusReference
 *  com.ankama.shopi.client.model.Article
 *  com.ankama.shopi.client.model.ArticleNonVirtualPaymentMode
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ArticleVirtualPaymentMode
 *  com.ankama.shopi.client.model.Category
 *  com.ankama.shopi.client.model.ClassicReference
 *  com.ankama.shopi.client.model.GameActionActionOneOf
 *  com.ankama.shopi.client.model.GameActionDefinition
 *  com.ankama.shopi.client.model.GameActionReference
 *  com.ankama.shopi.client.model.GoultineReference
 *  com.ankama.shopi.client.model.KardReference
 *  com.ankama.shopi.client.model.MetadataOneOf
 *  com.ankama.shopi.client.model.MetadataOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.OgrineReference
 *  com.ankama.shopi.client.model.OgrineTokenReference
 *  com.ankama.shopi.client.model.Price
 *  com.ankama.shopi.client.model.PromoteCarousel
 *  com.ankama.shopi.client.model.PromoteImage
 *  com.ankama.shopi.client.model.PromoteTargetOneOf
 *  com.ankama.shopi.client.model.PromoteTargetOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Promotion
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ServerReference
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.StringMetadata
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualSubscriptionReference
 *  com.ankama.shopi.client.model.VodReference
 *  com.ankama.shopi.client.model.WakfuItemAction
 *  com.ankama.shopi.client.model.WavenItemReference
 *  com.ankama.shopi.client.model.WebtoonReference
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 *  org.jsoup.Jsoup
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.ankama.model.GameActionsActionsTypeMeta;
import com.ankama.haapi.client.okhttp.ankama.model.GameActionsDefinition;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticle;
import com.ankama.haapi.client.okhttp.ankama.model.ShopHighlight;
import com.ankama.haapi.client.okhttp.ankama.model.ShopPrice;
import com.ankama.haapi.client.okhttp.ankama.model.ShopPromo;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReference;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeAccountStatus;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeGameAction;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeIceGift;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeKard;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeOgrine;
import com.ankama.haapi.client.okhttp.ankama.model.ShopReferenceTypeVirtualSubscriptionLevel;
import com.ankama.shopi.client.model.AccountStatusReference;
import com.ankama.shopi.client.model.Article;
import com.ankama.shopi.client.model.ArticleNonVirtualPaymentMode;
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.ArticleVirtualPaymentMode;
import com.ankama.shopi.client.model.Category;
import com.ankama.shopi.client.model.ClassicReference;
import com.ankama.shopi.client.model.GameActionActionOneOf;
import com.ankama.shopi.client.model.GameActionDefinition;
import com.ankama.shopi.client.model.GameActionReference;
import com.ankama.shopi.client.model.GoultineReference;
import com.ankama.shopi.client.model.KardReference;
import com.ankama.shopi.client.model.MetadataOneOf;
import com.ankama.shopi.client.model.OgrineReference;
import com.ankama.shopi.client.model.OgrineTokenReference;
import com.ankama.shopi.client.model.Price;
import com.ankama.shopi.client.model.PromoteCarousel;
import com.ankama.shopi.client.model.PromoteImage;
import com.ankama.shopi.client.model.PromoteTargetOneOf;
import com.ankama.shopi.client.model.Promotion;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ServerReference;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.StringMetadata;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualSubscriptionReference;
import com.ankama.shopi.client.model.VodReference;
import com.ankama.shopi.client.model.WakfuItemAction;
import com.ankama.shopi.client.model.WavenItemReference;
import com.ankama.shopi.client.model.WebtoonReference;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jsoup.Jsoup;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

public class bPq {
    private static final Logger kPa = Logger.getLogger(bPq.class);
    private static final String kPb = "OG";
    private static final String kPc = "SW";
    private static final String kPd = "WD";
    public static final bPq kPe = new bPq();
    private bpa_2 kPf;
    private String kPg;

    private bPq() {
    }

    public void ng(String string) {
        this.kPf = bpa_2.nn(string);
    }

    public void nh(String string) {
        this.kPg = string;
    }

    public bpa_2 ehX() {
        return this.kPf;
    }

    static @Unmodifiable List<bpw_1<?, ?>> ah(List<ShopHighlight> list) {
        return list.stream().map(bPq::a).filter(Optional::isPresent).map(Optional::get).toList();
    }

    private static Optional<bpd_2> a(ShopHighlight shopHighlight) {
        int n = Bw.m(shopHighlight.getId());
        try {
            String string = shopHighlight.getName();
            String string2 = shopHighlight.getDescription();
            String string3 = shopHighlight.getLink();
            String string4 = shopHighlight.getType();
            String string5 = shopHighlight.getMode();
            ArrayList<bPh> arrayList = bPh.ae(shopHighlight.getImage());
            bpb_2 bpb_22 = string4.equals("ARTICLE") && shopHighlight.getExternalArticle() != null ? bPq.a(shopHighlight.getExternalArticle()) : null;
            Integer n2 = string4.equals("CATEGORY") && shopHighlight.getExternalCategory() != null ? Integer.valueOf(Bw.m(shopHighlight.getExternalCategory().getId())) : null;
            return Optional.of(new bpd_2(n, string, string2, string3, string4, string5, arrayList, bpb_22, n2));
        }
        catch (Exception exception) {
            kPa.error((Object)("Highlight with id " + n + " can't be loaded"), (Throwable)exception);
            return Optional.empty();
        }
    }

    @Nullable
    public static bpb_2 a(ShopArticle shopArticle) {
        ArrayList<bpf_2> arrayList;
        if (!bPq.h(shopArticle.getIngameConditions(), shopArticle.getId())) {
            return null;
        }
        ArrayList<bPh> arrayList2 = bPh.ae(shopArticle.getImage());
        ArrayList<bpk_2> arrayList3 = new ArrayList<bpk_2>();
        List list = shopArticle.getReferences();
        bPq.a(arrayList3, list);
        List list2 = shopArticle.getPromo();
        if (list2 != null) {
            arrayList = new ArrayList<bpf_2>();
            bPq.a(arrayList, list2);
        } else {
            arrayList = null;
        }
        bpa_2 bpa_22 = bpa_2.nn(shopArticle.getCurrency());
        Float f2 = bpa_22 == bpa_2.kRg ? shopArticle.getPrice() : Float.valueOf(0.0f);
        Float f3 = bpa_22 == bpa_2.kRg ? shopArticle.getOriginalPrice() : Float.valueOf(0.0f);
        bpa_2 bpa_23 = bpa_22 == bpa_2.kRg ? bpa_2.kRg : null;
        Float f4 = null;
        Float f5 = null;
        bpa_2 bpa_24 = null;
        Float f6 = null;
        Float f7 = null;
        bpa_2 bpa_25 = null;
        List list3 = shopArticle.getPricelist();
        if (list3 != null) {
            boolean bl = bMX.kAi.blc();
            boolean bl2 = false;
            bpa_2 bpa_26 = bPq.kPe.kPf;
            for (ShopPrice shopPrice : list3) {
                if (!bl && bPq.kPe.kPg.equals(shopPrice.getPaymentmode()) && kPd.equals(shopPrice.getCountry())) {
                    f6 = shopPrice.getPrice();
                    f7 = shopPrice.getOriginalPrice();
                    bpa_25 = bpa_2.nn(shopPrice.getCurrency());
                }
                if (!bl && bPq.kPe.kPg.equals(shopPrice.getPaymentmode()) && !kPd.equals(shopPrice.getCountry()) && bpa_26 != null && shopPrice.getCurrency().equals(bpa_26.eiE())) {
                    f4 = shopPrice.getPrice();
                    f5 = shopPrice.getOriginalPrice();
                    bpa_24 = bpa_2.nn(shopPrice.getCurrency());
                }
                if (bl && kPc.equals(shopPrice.getPaymentmode()) && bpa_26 != null && shopPrice.getCurrency().equals(bpa_26.eiE())) {
                    f2 = shopPrice.getPrice();
                    f3 = shopPrice.getOriginalPrice();
                    bpa_23 = bpa_2.nn(shopPrice.getCurrency());
                    bl2 = true;
                }
                if (bl && !bl2) {
                    f2 = shopPrice.getPrice();
                    f3 = shopPrice.getOriginalPrice();
                    bpa_23 = bpa_2.nn(shopPrice.getCurrency());
                    bl2 = true;
                }
                if (!kPb.equals(shopPrice.getPaymentmode())) continue;
                f2 = shopPrice.getPrice();
                f3 = shopPrice.getOriginalPrice();
                bpa_23 = bpa_2.nn(shopPrice.getCurrency());
            }
        }
        return new bpb_2(GC.cw(shopArticle.getId()), shopArticle.getKey(), shopArticle.getName(), shopArticle.getDescription(), shopArticle.getSubtitle(), f2 == null ? null : Float.valueOf(GC.a(f2.floatValue(), 2)), f3, bpa_23, (Integer)GC.cw(shopArticle.getStock() != null ? shopArticle.getStock() : -1L), arrayList3, shopArticle.getReferences(), arrayList2, arrayList, shopArticle.getEnddate() != null && shopArticle.getShowCountDown() != false ? uw_0.g(DateTimeUtils.toDate((Instant)shopArticle.getEnddate().toInstant())) : uw_0.bju(), Float.valueOf(GC.a(((Float)Optional.ofNullable(f4).orElse(Optional.ofNullable(f6).orElse(Float.valueOf(-1.0f)))).floatValue(), 2)), Optional.ofNullable(f5).orElse(Optional.ofNullable(f7).orElse(Float.valueOf(-1.0f))), Optional.ofNullable(bpa_24).orElse(bpa_25));
    }

    private static void a(Collection<bpf_2> collection, List<ShopPromo> list) {
        for (ShopPromo shopPromo : list) {
            String string = shopPromo.getName();
            String string2 = shopPromo.getDescription();
            collection.add(new bpf_2(string, string2));
        }
    }

    private static void a(ArrayList<bpk_2> arrayList, List<ShopReference> list) {
        for (ShopReference shopReference : list) {
            bpy_2 bpy_22 = bpy_2.nm(shopReference.getType());
            switch (bpy_22) {
                case kQU: 
                case kQV: {
                    bPq.a(arrayList, shopReference.getReferenceIcegift(), bpy_22);
                    break;
                }
                case kQW: {
                    bPq.a(arrayList, shopReference.getReferenceVirtualsubscriptionlevel());
                    break;
                }
                case kQX: {
                    bPq.a(arrayList, shopReference.getReferenceAccountstatus());
                    break;
                }
                case kQY: {
                    bPq.a(arrayList, shopReference.getReferenceOgrine());
                    break;
                }
                case kRa: {
                    bPq.a(arrayList, shopReference.getReferenceGameaction(), (long)shopReference.getQuantity());
                    break;
                }
                case kRb: {
                    bPq.b(arrayList, shopReference.getReferenceKard());
                    break;
                }
            }
        }
    }

    private static void a(List<bpk_2> list, ShopReferenceTypeGameAction shopReferenceTypeGameAction, long l) {
        if (shopReferenceTypeGameAction == null) {
            return;
        }
        GameActionsDefinition gameActionsDefinition = shopReferenceTypeGameAction.getDefinition();
        if (gameActionsDefinition == null) {
            kPa.error((Object)"We have an action without definition");
            return;
        }
        List list2 = gameActionsDefinition.getActions();
        for (GameActionsActionsTypeMeta gameActionsActionsTypeMeta : list2) {
            if (faq.rPi.aLZ().equalsIgnoreCase(gameActionsActionsTypeMeta.getType())) {
                Long l2 = gameActionsActionsTypeMeta.getQuantity();
                bpk_2 bpk_22 = new bpk_2(gameActionsActionsTypeMeta.getItemId().intValue(), GC.a(l * (l2 != null ? l2 : 0L), 0L, Long.MAX_VALUE), bpy_2.kRa);
                list.add(bpk_22);
                continue;
            }
            kPa.error((Object)("We have an action with a unhandled type : " + gameActionsActionsTypeMeta.getType() + ", on action definition : " + gameActionsDefinition.getId()));
        }
    }

    private static void a(Collection<bpk_2> collection, ShopReferenceTypeAccountStatus shopReferenceTypeAccountStatus) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQX);
        String string = shopReferenceTypeAccountStatus.getStatus();
        String string2 = shopReferenceTypeAccountStatus.getType();
        if (string != null) {
            bpk_22.ai("STATUS", string);
        }
        if (string2 != null) {
            bpk_22.ai("TYPE", string2);
        }
        collection.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, ShopReferenceTypeVirtualSubscriptionLevel shopReferenceTypeVirtualSubscriptionLevel) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQW);
        bpk_22.ai("server.id", shopReferenceTypeVirtualSubscriptionLevel.getServerId());
        arrayList.add(bpk_22);
    }

    private static void b(ArrayList<bpk_2> arrayList, List<ShopReferenceTypeKard> list) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRb);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, List<ShopReferenceTypeIceGift> list, bpy_2 bpy_22) {
        if (list == null) {
            return;
        }
        for (ShopReferenceTypeIceGift shopReferenceTypeIceGift : list) {
            int n = Bw.b((Object)shopReferenceTypeIceGift.getId(), -1);
            bpk_2 bpk_22 = new bpk_2(n, 1L, bpy_22);
            arrayList.add(bpk_22);
            Map map = shopReferenceTypeIceGift.getMetas();
            if (map == null) continue;
            for (Map.Entry entry : map.entrySet()) {
                bpk_22.ai((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    private static void a(ArrayList<bpk_2> arrayList, ShopReferenceTypeOgrine shopReferenceTypeOgrine) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQY);
        arrayList.add(bpk_22);
    }

    static List<bpw_1<?, ?>> ai(List<PromoteCarousel> list) {
        return list.stream().map(bPq::a).filter(Optional::isPresent).map(Optional::get).toList();
    }

    static List<bpw_1<?, ?>> aj(List<PromoteImage> list) {
        return list.stream().map(bPq::a).filter(Optional::isPresent).map(Optional::get).toList();
    }

    private static Optional<bpj_2> a(PromoteCarousel promoteCarousel) {
        String string = promoteCarousel.getName();
        String string2 = bPq.ni(promoteCarousel.getDescription());
        ArrayList<bPh> arrayList = bPh.ag(promoteCarousel.getDeviceImages());
        return bPq.a(string, string2, promoteCarousel.getTarget(), arrayList);
    }

    private static Optional<bpj_2> a(PromoteImage promoteImage) {
        String string = promoteImage.getName();
        String string2 = bPq.ni(promoteImage.getDescription());
        ArrayList<bPh> arrayList = bPh.ag(promoteImage.getDeviceImages());
        return bPq.a(string, string2, promoteImage.getTarget(), arrayList);
    }

    private static Optional<bpj_2> a(String string, String string2, PromoteTargetOneOf promoteTargetOneOf, ArrayList<bPh> arrayList) {
        PromoteTargetOneOf.DiscriminatorEnum discriminatorEnum = promoteTargetOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case ARTICLE: {
                Article article = promoteTargetOneOf.getArticle();
                if (article == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", Article.class, discriminatorEnum, promoteTargetOneOf));
                    return Optional.empty();
                }
                return Optional.of(new bpj_2(string, string2, null, discriminatorEnum, arrayList, bPq.a(article), null));
            }
            case CATEGORY: {
                Category category = promoteTargetOneOf.getCategory();
                if (category == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", Category.class, discriminatorEnum, promoteTargetOneOf));
                    return Optional.empty();
                }
                return Optional.of(new bpj_2(string, string2, null, discriminatorEnum, arrayList, null, category.getId()));
            }
        }
        kPa.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, bpw_1.class, promoteTargetOneOf));
        return Optional.empty();
    }

    @Nullable
    public static bpg_2 a(Article article) {
        ArrayList<bpf_2> arrayList;
        if (!bPq.b(article)) {
            return null;
        }
        ArrayList<bPh> arrayList2 = bPh.af(article.getMedia());
        ArrayList<bpk_2> arrayList3 = new ArrayList<bpk_2>();
        List list = article.getSingleReferences();
        bPq.c(arrayList3, list);
        List list2 = article.getPromotions();
        if (list2 != null) {
            arrayList = new ArrayList<bpf_2>();
            bPq.b(arrayList, list2);
        } else {
            arrayList = null;
        }
        Double d2 = null;
        Double d3 = null;
        bpa_2 bpa_22 = null;
        ArticlePaymentModeOneOf.DiscriminatorEnum discriminatorEnum = null;
        Double d4 = null;
        Double d5 = null;
        bpa_2 bpa_23 = null;
        boolean bl = false;
        boolean bl2 = bMX.kAi.blc();
        for (ArticlePaymentModeOneOf articlePaymentModeOneOf : article.getPaymentModes()) {
            ArticlePaymentModeOneOf.DiscriminatorEnum discriminatorEnum2 = articlePaymentModeOneOf.getDiscriminator();
            switch (discriminatorEnum2) {
                case ARTICLEFREEPAYMENTMODE: {
                    bl = true;
                    break;
                }
                case ARTICLENONVIRTUALPAYMENTMODE: {
                    ArticleNonVirtualPaymentMode articleNonVirtualPaymentMode = articlePaymentModeOneOf.getArticleNonVirtualPaymentMode();
                    if (articleNonVirtualPaymentMode == null) {
                        kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ArticleNonVirtualPaymentMode.class, discriminatorEnum2, articlePaymentModeOneOf));
                        break;
                    }
                    Price price = articleNonVirtualPaymentMode.getPrice();
                    bpa_2 bpa_24 = bpa_2.nn(price.getCurrency());
                    if (bl2 || bpa_23 != null && bpa_23 != bpa_24 || d4 != null && !(d4 > price.getAmount())) break;
                    d4 = price.getAmount();
                    d5 = price.getOriginalAmount();
                    bpa_23 = bpa_24;
                    break;
                }
                case ARTICLEVIRTUALPAYMENTMODE: {
                    ArticleNonVirtualPaymentMode articleNonVirtualPaymentMode = articlePaymentModeOneOf.getArticleVirtualPaymentMode();
                    if (articleNonVirtualPaymentMode == null) {
                        kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ArticleVirtualPaymentMode.class, discriminatorEnum2, articlePaymentModeOneOf));
                        break;
                    }
                    Price price = articleNonVirtualPaymentMode.getPrice();
                    bpa_2 bpa_24 = bpa_2.nn(price.getCurrency());
                    VirtualPaymentModeId virtualPaymentModeId = articleNonVirtualPaymentMode.getPaymentModeId();
                    if (virtualPaymentModeId == VirtualPaymentModeId.OG) {
                        d2 = price.getAmount();
                        d3 = price.getOriginalAmount();
                        bpa_22 = bpa_24;
                        discriminatorEnum = virtualPaymentModeId;
                        break;
                    }
                    if (!bl2 || virtualPaymentModeId != VirtualPaymentModeId.SW || bpa_22 == bpa_2.kRg || bpa_22 != null && bpa_22 != bpa_24 || d2 != null && !(d2 > price.getAmount())) break;
                    d2 = price.getAmount();
                    d3 = price.getOriginalAmount();
                    bpa_22 = bpa_24;
                    discriminatorEnum = virtualPaymentModeId;
                    break;
                }
                default: {
                    kPa.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract prices from %s", discriminatorEnum2, articlePaymentModeOneOf));
                }
            }
            if (!bl) continue;
            d2 = 0.0;
            d3 = 0.0;
            bpa_22 = bpa_2.kRg;
            discriminatorEnum = ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE;
            d4 = null;
            d5 = null;
            bpa_23 = null;
            break;
        }
        if (d2 == null && d4 == null) {
            kPa.warn((Object)String.format("No payment method found for following article id : %s", article.getId()));
            return null;
        }
        return new bpg_2(article.getId(), article.getKey(), article.getName(), bPq.ni(article.getDescription()), article.getSubtitle(), d2 == null ? null : Double.valueOf(GC.b(d2, 2)), d3, bpa_22, discriminatorEnum, -1, arrayList3, article.getSingleReferences(), arrayList2, arrayList, article.getCountdownTo() != null ? uw_0.g(Date.from(article.getCountdownTo().toInstant())) : uw_0.bju(), GC.b(Optional.ofNullable(d4).orElse(-1.0), 2), Optional.ofNullable(d5).orElse(-1.0), bpa_23);
    }

    public static boolean b(Article article) {
        List list = article.getMetadata();
        if (list == null) {
            return true;
        }
        block3: for (MetadataOneOf metadataOneOf : list) {
            MetadataOneOf.DiscriminatorEnum discriminatorEnum = metadataOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case STRINGMETADATA: {
                    StringMetadata stringMetadata = metadataOneOf.getStringMetadata();
                    if (stringMetadata == null) {
                        kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", StringMetadata.class, discriminatorEnum, metadataOneOf));
                        break;
                    }
                    if (!"in_game_requirements".equals(stringMetadata.getKey())) break;
                    if (bPq.h(stringMetadata.getValue(), article.getId())) continue block3;
                    return false;
                }
                default: {
                    kPa.warn((Object)String.format("Unknown/Unsupported discriminator %s to validate %s from %s", discriminatorEnum, Article.class, metadataOneOf));
                }
            }
        }
        return true;
    }

    private static void b(Collection<bpf_2> collection, List<Promotion> list) {
        for (Promotion promotion : list) {
            String string = promotion.getTitle();
            String string2 = promotion.getDescription();
            collection.add(new bpf_2(string, string2));
        }
    }

    private static void c(ArrayList<bpk_2> arrayList, List<SingleReference> list) {
        for (SingleReference singleReference : list) {
            ReferenceOneOf referenceOneOf = singleReference.getReference();
            if (referenceOneOf == null) continue;
            bPq.a(arrayList, referenceOneOf, singleReference);
        }
    }

    private static void a(ArrayList<bpk_2> arrayList, ReferenceOneOf referenceOneOf, SingleReference singleReference) {
        ReferenceOneOf.DiscriminatorEnum discriminatorEnum = referenceOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case KARDREFERENCE: {
                KardReference kardReference = referenceOneOf.getKardReference();
                if (kardReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", KardReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, kardReference);
                break;
            }
            case GAMEACTIONREFERENCE: {
                GameActionReference gameActionReference = referenceOneOf.getGameActionReference();
                if (gameActionReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GameActionReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, gameActionReference, (long)singleReference.getQuantity().intValue());
                break;
            }
            case CLASSICREFERENCE: {
                ClassicReference classicReference = referenceOneOf.getClassicReference();
                if (classicReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ClassicReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, classicReference);
                break;
            }
            case SERVERREFERENCE: {
                ServerReference serverReference = referenceOneOf.getServerReference();
                if (serverReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ServerReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, serverReference);
                break;
            }
            case WAVENITEMREFERENCE: {
                WavenItemReference wavenItemReference = referenceOneOf.getWavenItemReference();
                if (wavenItemReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WavenItemReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, wavenItemReference);
                break;
            }
            case ACCOUNTSTATUSREFERENCE: {
                AccountStatusReference accountStatusReference = referenceOneOf.getAccountStatusReference();
                if (accountStatusReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", AccountStatusReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, accountStatusReference);
                break;
            }
            case VIRTUALSUBSCRIPTIONREFERENCE: {
                VirtualSubscriptionReference virtualSubscriptionReference = referenceOneOf.getVirtualSubscriptionReference();
                if (virtualSubscriptionReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualSubscriptionReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, virtualSubscriptionReference);
                break;
            }
            case VODREFERENCE: {
                VodReference vodReference = referenceOneOf.getVodReference();
                if (vodReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VodReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, vodReference);
                break;
            }
            case WEBTOONREFERENCE: {
                WebtoonReference webtoonReference = referenceOneOf.getWebtoonReference();
                if (webtoonReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WebtoonReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, webtoonReference);
                break;
            }
            case OGRINEREFERENCE: {
                OgrineReference ogrineReference = referenceOneOf.getOgrineReference();
                if (ogrineReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, ogrineReference);
                break;
            }
            case OGRINETOKENREFERENCE: {
                OgrineTokenReference ogrineTokenReference = referenceOneOf.getOgrineTokenReference();
                if (ogrineTokenReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, ogrineTokenReference);
                break;
            }
            case GOULTINEREFERENCE: {
                GoultineReference goultineReference = referenceOneOf.getGoultineReference();
                if (goultineReference == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GoultineReference.class, discriminatorEnum, referenceOneOf));
                    break;
                }
                bPq.a(arrayList, goultineReference);
                break;
            }
            default: {
                kPa.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, bpk_2.class, referenceOneOf));
            }
        }
    }

    private static void a(ArrayList<bpk_2> arrayList, GameActionReference gameActionReference, long l) {
        GameActionDefinition gameActionDefinition = gameActionReference.getDefinition();
        for (GameActionActionOneOf gameActionActionOneOf : gameActionDefinition.getActions()) {
            String string = gameActionActionOneOf.getDiscriminator();
            if (fqq_0.sST.aLZ().equalsIgnoreCase(string)) {
                WakfuItemAction wakfuItemAction = gameActionActionOneOf.getWakfuItemAction();
                if (wakfuItemAction == null) {
                    kPa.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WakfuItemAction.class, string, gameActionActionOneOf));
                    break;
                }
                try {
                    bpk_2 bpk_22 = new bpk_2(Integer.parseInt(wakfuItemAction.getItemId()), l, bpy_2.kRa);
                    arrayList.add(bpk_22);
                }
                catch (NumberFormatException numberFormatException) {
                    kPa.error((Object)("We have an " + String.valueOf(WakfuItemAction.class) + " with non numerical id, how ? In following action definition : " + gameActionDefinition.getId()), (Throwable)numberFormatException);
                }
                continue;
            }
            kPa.error((Object)("We have an action with a unhandled type : " + string + ", on action definition : " + gameActionDefinition.getId()));
        }
    }

    private static void a(ArrayList<bpk_2> arrayList, KardReference kardReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRb);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, ClassicReference classicReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, ServerReference serverReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        bpk_22.ai("server.id", serverReference.getTargetServerId());
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, WavenItemReference wavenItemReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        arrayList.add(bpk_22);
    }

    private static void a(Collection<bpk_2> collection, AccountStatusReference accountStatusReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQX);
        String string = accountStatusReference.getStatus();
        String string2 = accountStatusReference.getType();
        bpk_22.ai("STATUS", string);
        bpk_22.ai("TYPE", string2);
        collection.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, VirtualSubscriptionReference virtualSubscriptionReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQW);
        bpk_22.ai("server.id", virtualSubscriptionReference.getServer());
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, VodReference vodReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, WebtoonReference webtoonReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, OgrineReference ogrineReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQY);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, OgrineTokenReference ogrineTokenReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kQZ);
        arrayList.add(bpk_22);
    }

    private static void a(ArrayList<bpk_2> arrayList, GoultineReference goultineReference) {
        bpk_2 bpk_22 = new bpk_2(bpy_2.kRc);
        arrayList.add(bpk_22);
    }

    private static String ni(String string) {
        return Jsoup.parse((String)string).wholeText();
    }

    public static boolean a(bpu_1<?> bpu_12) {
        String string = bpu_12.getKey();
        if (string == null) {
            return true;
        }
        return ewo_0.oBF.k(ewr_0.oDg) || !string.equals("companions");
    }

    public static <T> boolean h(@Nullable String string, @NotNull T t) {
        if (string == null) {
            return true;
        }
        try {
            bPs bPs2 = (bPs)new GsonBuilder().create().fromJson(string, bPs.class);
            if (!bPs2.isValid()) {
                return false;
            }
        }
        catch (Exception exception) {
            kPa.error((Object)String.format("Mapping error for following %s received from shop : \"%s\" (id : %s)", bPs.class, string, t), (Throwable)exception);
        }
        return true;
    }

    public static boolean ehY() {
        Optional optional = bbs_2.a(eva_1.owq);
        if (optional.isEmpty()) {
            return false;
        }
        Optional<Short> optional2 = ((eig_0)optional.get()).fwJ();
        if (optional2.isEmpty()) {
            return false;
        }
        short s = (short)ewo_0.oBF.i(ewr_0.oCd);
        return optional2.get() >= s;
    }
}

