/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken
 *  org.jetbrains.annotations.Nullable
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

/*
 * Renamed from bQq
 */
public class bqq_2
implements aeh_2 {
    private static final String kUF = "quantity";
    private static final String kUG = "kamasPrice";
    private static final String kUH = "ogrinesQuantity";
    private static final String kUI = "saleDuration";
    private static final String kUJ = "containsOwnSale";
    private final long kUK;
    private final long kUL;
    private final List<OgrineToken> kUM = new ArrayList<OgrineToken>();

    @Override
    public String[] bxk() {
        return new String[]{kUF, kUG, kUH, kUI, kUJ};
    }

    bqq_2(OgrineToken ogrineToken) {
        this.kUK = ogrineToken.getSellingPrice();
        this.kUL = ogrineToken.getOgrineQuantity();
        this.kUM.add(ogrineToken);
    }

    Optional<OgrineToken> ejj() {
        return this.kUM.stream().min(Comparator.comparing(OgrineToken::getSellingDate));
    }

    public Optional<OgrineToken> ejk() {
        return this.kUM.stream().filter(ogrineToken -> ogrineToken.getAccountId().longValue() == aue_0.cVJ().cVO().xl()).min(Comparator.comparing(OgrineToken::getSellingDate));
    }

    void a(OgrineToken ogrineToken) {
        this.kUM.add(ogrineToken);
    }

    long ejl() {
        return this.kUK;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kUF)) {
            return this.kUM.size();
        }
        if (string.equals(kUG)) {
            return this.kUK;
        }
        if (string.equals(kUH)) {
            return this.kUL;
        }
        if (string.equals(kUI)) {
            Optional<OgrineToken> optional = this.ejj();
            if (optional.isEmpty()) {
                return null;
            }
            Date date = DateTimeUtils.toDate((Instant)optional.get().getSellingDate().toInstant());
            Date date2 = aum_0.j(date);
            return aum_0.cWf().h(date2);
        }
        if (string.equals(kUJ)) {
            return this.kUM.stream().anyMatch(ogrineToken -> ogrineToken.getAccountId() != null && ogrineToken.getAccountId().longValue() == aue_0.cVJ().cVO().xl());
        }
        return null;
    }
}

