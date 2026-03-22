/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticle
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopCategory
 *  javax.annotation.Nullable
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 *  org.threeten.bp.OffsetDateTime
 *  org.threeten.bp.ZoneId
 */
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticle;
import com.ankama.haapi.client.okhttp.ankama.model.ShopCategory;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

public final class bQz {
    public static @Unmodifiable List<bpt_1<?, ?>> aq(List<ShopArticle> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bPq::a).filter(Objects::nonNull).filter(bpt_1::eim).toList();
    }

    public static @Unmodifiable List<bpu_1<?>> ar(List<ShopCategory> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream().map(bQz::a).filter(Objects::nonNull).toList();
    }

    private static bpc_2 a(@NotNull ShopCategory shopCategory) {
        bpc_2 bpc_22 = new bpc_2(GC.cw(shopCategory.getId()), shopCategory.getName(), shopCategory.getDescription(), shopCategory.getUrl(), bpv_2.nk(shopCategory.getDisplaymode()), shopCategory.getKey());
        if (!bPq.a(bpc_22)) {
            return null;
        }
        List list = shopCategory.getChild();
        if (list == null) {
            return bpc_22;
        }
        list.stream().map(bQz::a).filter(Objects::nonNull).forEach(bpc_22::b);
        return bpc_22;
    }

    public static OffsetDateTime l(@Nullable Date date) {
        if (date == null) {
            return null;
        }
        return OffsetDateTime.ofInstant((Instant)DateTimeUtils.toInstant((Date)date), (ZoneId)ZoneId.systemDefault());
    }

    public static uw_0 a(@Nullable OffsetDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return uw_0.bju();
        }
        return new uw_0(offsetDateTime.getSecond(), offsetDateTime.getMinute(), offsetDateTime.getHour(), offsetDateTime.getDayOfMonth(), offsetDateTime.getMonthValue(), offsetDateTime.getYear());
    }
}

