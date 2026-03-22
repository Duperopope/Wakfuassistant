/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHq
 */
public class bhq_1
implements aeh_2 {
    public static final String jZl = "purchasedItemsCount";
    public static final String jZm = "purchasedItemsCountText";
    public static final String jZn = "retrievePurchasedItemsText";
    public static final String jZo = "expiredOffersCount";
    public static final String jZp = "expiredOffersCountText";
    public static final String jZq = "claimExpiredOffersText";
    private int jZr = 0;
    private int jZs = 0;
    private int jZt = 0;
    private int jZu = 0;
    private long jZv = 0L;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "purchasedItemsCount": {
                return this.jZs;
            }
            case "purchasedItemsCountText": {
                return aum_0.cWf().c("market.offers.purchased.items", this.jZr, this.jZs);
            }
            case "retrievePurchasedItemsText": {
                return aum_0.cWf().c("market.offers.retrieve.purchased.items", this.jZs);
            }
            case "expiredOffersCount": {
                return this.jZu;
            }
            case "expiredOffersCountText": {
                return aum_0.cWf().c("market.offers.expired.offers", this.jZu, this.jZv);
            }
            case "claimExpiredOffersText": {
                return aum_0.cWf().c("market.offers.kama.claim", this.jZv);
            }
        }
        return null;
    }

    public static void deS() {
        fse_1.gFu().a((aef_2)bhz_2.dWn(), jZl, jZm, jZn, jZo, jZp, jZq, "canCreateOffer", "createOfferBtnText");
    }

    public void GK(int n) {
        this.jZr = n;
    }

    public void GL(int n) {
        this.jZs = n;
    }

    public void GM(int n) {
        this.jZt = n;
    }

    public void GN(int n) {
        this.jZu = n;
    }

    public void lq(long l) {
        this.jZv = l;
    }

    @Override
    public String[] bxk() {
        return new String[]{jZl, jZm, jZn, jZo, jZp, jZq};
    }

    @Generated
    public int aop() {
        return this.jZr;
    }

    @Generated
    public int dVv() {
        return this.jZs;
    }

    @Generated
    public int dVw() {
        return this.jZt;
    }

    @Generated
    public int dVx() {
        return this.jZu;
    }

    @Generated
    public long dVy() {
        return this.jZv;
    }

    @Generated
    public String toString() {
        return "MarketOffersInfoView(m_purchasesCount=" + this.aop() + ", m_totalPurchasedItemsCount=" + this.dVv() + ", m_currentOffersCount=" + this.dVw() + ", m_expiredOffersCount=" + this.dVx() + ", m_expiredOffersTotalKamas=" + this.dVy() + ")";
    }
}

