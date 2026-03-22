/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.AccountStatusReference
 *  com.ankama.shopi.client.model.Article
 *  com.ankama.shopi.client.model.ArticleVirtualPaymentMode
 *  com.ankama.shopi.client.model.CartPaymentModeList
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.CartVirtualPaymentMode
 *  com.ankama.shopi.client.model.Category
 *  com.ankama.shopi.client.model.ChosenReferenceRequest
 *  com.ankama.shopi.client.model.ClassicReference
 *  com.ankama.shopi.client.model.GameActionReference
 *  com.ankama.shopi.client.model.GoultineReference
 *  com.ankama.shopi.client.model.KardReference
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.OgrineReference
 *  com.ankama.shopi.client.model.OgrineTokenReference
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Price
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ServerReference
 *  com.ankama.shopi.client.model.ShopKey
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualPaymentRequest
 *  com.ankama.shopi.client.model.VirtualSubscriptionReference
 *  com.ankama.shopi.client.model.VodReference
 *  com.ankama.shopi.client.model.WavenItemReference
 *  com.ankama.shopi.client.model.WebtoonReference
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankama.shopi.client.model.AccountStatusReference;
import com.ankama.shopi.client.model.Article;
import com.ankama.shopi.client.model.ArticleVirtualPaymentMode;
import com.ankama.shopi.client.model.CartPaymentModeList;
import com.ankama.shopi.client.model.CartPaymentModeOneOf;
import com.ankama.shopi.client.model.CartVirtualPaymentMode;
import com.ankama.shopi.client.model.Category;
import com.ankama.shopi.client.model.ChosenReferenceRequest;
import com.ankama.shopi.client.model.ClassicReference;
import com.ankama.shopi.client.model.GameActionReference;
import com.ankama.shopi.client.model.GoultineReference;
import com.ankama.shopi.client.model.KardReference;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.OgrineReference;
import com.ankama.shopi.client.model.OgrineTokenReference;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.Price;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ServerReference;
import com.ankama.shopi.client.model.ShopKey;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualPaymentRequest;
import com.ankama.shopi.client.model.VirtualSubscriptionReference;
import com.ankama.shopi.client.model.VodReference;
import com.ankama.shopi.client.model.WavenItemReference;
import com.ankama.shopi.client.model.WebtoonReference;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bYj
 */
public class byj_2 {
    public static final ShopKey lyN = ShopKey.WAKFU_INGAME;
    public static final String lyO = "shopi";
    private static final Logger lyP = Logger.getLogger(byj_2.class);

    public static boolean eoR() {
        String string = WakfuClient.dSV.cfl().cgi();
        if (string == null) {
            string = ewo_0.oBF.l(ewr_0.oCc);
        }
        return Objects.equals(lyO, string);
    }

    public static Language eoS() {
        Language language = Language.fromValue((String)aum_0.cWf().aUXX().aUR());
        if (language == Language.UNKNOWN_DEFAULT_OPEN_API) {
            return Language.EN;
        }
        return language;
    }

    public static boolean nN(String string) {
        ArrayList<String> arrayList = ewo_0.oBF.m(ewr_0.oCe);
        return arrayList.contains(string);
    }

    public static void a(@NotNull BiConsumer<Integer, List<bpt_1<?, ?>>> biConsumer, @NotNull List<bpt_1<?, ?>> list, int n, int n2) {
        int n3 = n2 * (n - 1);
        int n4 = n3 + n2;
        int n5 = list.size();
        int n6 = Math.min(n4, n5);
        biConsumer.accept(n5, n5 <= n3 ? Collections.emptyList() : list.subList(n3, n6));
    }

    public static @Unmodifiable List<bpt_1<?, ?>> as(List<Article> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bPq::a).filter(Objects::nonNull).filter(bpt_1::eim).toList();
    }

    public static @Unmodifiable List<bpu_1<?>> ar(List<Category> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        List<bpi_2> list2 = list.stream().map(byj_2::a).filter(Objects::nonNull).toList();
        for (bpi_2 bpi_22 : list2) {
            byj_2.a(bpi_22, list2);
        }
        return Collections.unmodifiableList(list2);
    }

    @Nullable
    private static bpi_2 a(@NotNull Category category) {
        bpi_2 bpi_22 = new bpi_2(category.getId(), category.getName(), category.getDescription(), category.getImage().getUri().toString(), bpv_2.kQw, category.getKey(), category.getParentCategoryId());
        if (!bPq.a(bpi_22)) {
            return null;
        }
        return bpi_22;
    }

    private static void a(bpi_2 bpi_22, List<bpi_2> list) {
        for (bpi_2 bpi_23 : list) {
            if (!Objects.equals(bpi_22.eid(), bpi_23.eiK())) continue;
            bpi_22.b(bpi_23);
            bpi_23.c(bpi_22);
        }
    }

    @Nullable
    public static ChosenReferenceRequest b(@NotNull SingleReference singleReference) {
        ReferenceOneOf referenceOneOf = singleReference.getReference();
        if (referenceOneOf == null) {
            return null;
        }
        ChosenReferenceRequest chosenReferenceRequest = new ChosenReferenceRequest().lineNumber(singleReference.getLineNumber()).quantity(singleReference.getQuantity());
        ReferenceOneOf.DiscriminatorEnum discriminatorEnum = referenceOneOf.getDiscriminator();
        switch (discriminatorEnum) {
            case KARDREFERENCE: {
                KardReference kardReference = referenceOneOf.getKardReference();
                if (kardReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", KardReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(kardReference.getId());
                break;
            }
            case GAMEACTIONREFERENCE: {
                GameActionReference gameActionReference = referenceOneOf.getGameActionReference();
                if (gameActionReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GameActionReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(gameActionReference.getId());
                break;
            }
            case CLASSICREFERENCE: {
                ClassicReference classicReference = referenceOneOf.getClassicReference();
                if (classicReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ClassicReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(classicReference.getId());
                break;
            }
            case SERVERREFERENCE: {
                ServerReference serverReference = referenceOneOf.getServerReference();
                if (serverReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ServerReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(serverReference.getId());
                break;
            }
            case WAVENITEMREFERENCE: {
                WavenItemReference wavenItemReference = referenceOneOf.getWavenItemReference();
                if (wavenItemReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WavenItemReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(wavenItemReference.getId());
                break;
            }
            case ACCOUNTSTATUSREFERENCE: {
                AccountStatusReference accountStatusReference = referenceOneOf.getAccountStatusReference();
                if (accountStatusReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", AccountStatusReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(accountStatusReference.getId());
                break;
            }
            case VIRTUALSUBSCRIPTIONREFERENCE: {
                VirtualSubscriptionReference virtualSubscriptionReference = referenceOneOf.getVirtualSubscriptionReference();
                if (virtualSubscriptionReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualSubscriptionReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(virtualSubscriptionReference.getId());
                break;
            }
            case VODREFERENCE: {
                VodReference vodReference = referenceOneOf.getVodReference();
                if (vodReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VodReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(vodReference.getId());
                break;
            }
            case WEBTOONREFERENCE: {
                WebtoonReference webtoonReference = referenceOneOf.getWebtoonReference();
                if (webtoonReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", WebtoonReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(webtoonReference.getId());
                break;
            }
            case OGRINEREFERENCE: {
                OgrineReference ogrineReference = referenceOneOf.getOgrineReference();
                if (ogrineReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(ogrineReference.getId());
                break;
            }
            case OGRINETOKENREFERENCE: {
                OgrineTokenReference ogrineTokenReference = referenceOneOf.getOgrineTokenReference();
                if (ogrineTokenReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", OgrineTokenReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(ogrineTokenReference.getId());
                break;
            }
            case GOULTINEREFERENCE: {
                GoultineReference goultineReference = referenceOneOf.getGoultineReference();
                if (goultineReference == null) {
                    lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", GoultineReference.class, discriminatorEnum, referenceOneOf));
                    return null;
                }
                chosenReferenceRequest.referenceId(goultineReference.getId());
                break;
            }
            default: {
                lyP.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract %s from %s", discriminatorEnum, ChosenReferenceRequest.class, referenceOneOf));
                return null;
            }
        }
        return chosenReferenceRequest;
    }

    @Nullable
    public static PaymentRequestOneOf a(@NotNull CartPaymentModeList cartPaymentModeList) {
        PaymentRequestOneOf paymentRequestOneOf = null;
        block7: for (CartPaymentModeOneOf cartPaymentModeOneOf : cartPaymentModeList.getValues()) {
            CartPaymentModeOneOf.DiscriminatorEnum discriminatorEnum = cartPaymentModeOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case CARTFREEPAYMENTMODE: {
                    return new PaymentRequestOneOf().discriminator(PaymentRequestOneOf.DiscriminatorEnum.FREE);
                }
                case CARTVIRTUALPAYMENTMODE: {
                    CartVirtualPaymentMode cartVirtualPaymentMode = cartPaymentModeOneOf.getCartVirtualPaymentMode();
                    if (cartVirtualPaymentMode == null) {
                        lyP.warn((Object)String.format("Missing %s with following discriminator %s in following %s", ArticleVirtualPaymentMode.class, discriminatorEnum, cartPaymentModeOneOf));
                        continue block7;
                    }
                    VirtualPaymentModeId virtualPaymentModeId = cartVirtualPaymentMode.getPaymentModeId();
                    switch (virtualPaymentModeId) {
                        case SW: 
                        case OG: {
                            Price price = cartVirtualPaymentMode.getPrice();
                            paymentRequestOneOf = new PaymentRequestOneOf().discriminator(PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL).virtualPaymentRequest(new VirtualPaymentRequest().paymentModeId(virtualPaymentModeId).amount(price.getAmount()).currency(price.getCurrency()));
                            continue block7;
                        }
                    }
                    lyP.warn((Object)String.format("Unknown/Unsupported paymentMode %s to order a cart from client", virtualPaymentModeId));
                    continue block7;
                }
            }
            lyP.warn((Object)String.format("Unknown/Unsupported discriminator %s to order a from client", discriminatorEnum));
        }
        return paymentRequestOneOf;
    }
}

