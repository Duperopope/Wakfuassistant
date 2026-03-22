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
 * Renamed from bHu
 */
public class bhu_2
implements aeh_2 {
    public static final String jZN = "expiredEntriesCount";
    public static final String jZO = "expiredEntriesCountText";
    public static final String jZP = "claimExpiredEntriesText";
    public static final String jZQ = "kamasCount";
    public static final String jZR = "soldItemsCount";
    public static final String jZS = "soldItemsCountText";
    public static final String jZT = "claimKamasText";
    private int jZU = 0;
    private long jZV = 0L;
    private int jZW = 0;
    private int jZX = 0;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "soldItemsCount": {
                return this.jZU;
            }
            case "kamasCount": {
                return this.jZV;
            }
            case "soldItemsCountText": {
                return aum_0.cWf().c("market.offers.sold.items", this.jZU);
            }
            case "claimKamasText": {
                return aum_0.cWf().c("market.offers.kama.claim", this.jZV);
            }
            case "expiredEntriesCount": {
                return this.jZX;
            }
            case "expiredEntriesCountText": {
                return aum_0.cWf().c("market.offers.expired.items", this.jZX);
            }
            case "claimExpiredEntriesText": {
                return aum_0.cWf().c("market.offers.expired.items.claim", this.jZX);
            }
        }
        return null;
    }

    public static void deS() {
        fse_1.gFu().a((aef_2)bhz_2.dWn(), jZN, jZO, jZP, jZQ, jZR, jZS, jZT, "canSellItem", "sellItemBtnText");
    }

    public void GO(int n) {
        this.jZU = n;
    }

    public void lr(long l) {
        this.jZV = l;
    }

    public void GP(int n) {
        this.jZW = n;
    }

    public void GQ(int n) {
        this.jZX = n;
    }

    @Override
    public String[] bxk() {
        return new String[]{jZN, jZO, jZP, jZQ, jZR, jZS, jZT};
    }

    @Generated
    public int dVF() {
        return this.jZU;
    }

    @Generated
    public long dmi() {
        return this.jZV;
    }

    @Generated
    public int dVG() {
        return this.jZW;
    }

    @Generated
    public int dVH() {
        return this.jZX;
    }

    @Generated
    public String toString() {
        return "MarketSalesInfoView(m_soldItemsCount=" + this.dVF() + ", m_kamasCount=" + this.dmi() + ", m_forSaleEntriesCount=" + this.dVG() + ", m_expiredEntriesCount=" + this.dVH() + ")";
    }
}

