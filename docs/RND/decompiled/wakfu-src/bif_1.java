/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIf
 */
public class bif_1
implements aeh_2 {
    public static final String kew = "countText";
    public static final String kex = "hasPreviousResults";
    public static final String key = "hasNextResults";
    public static final String kez = "searchResults";
    public static final String keA = "totalCount";
    public static final String keB = "totalCountText";
    public static final String keC = "totalCountTextOffer";
    public static final String keD = "totalCountTextAlt";
    public static final String keE = "totalCountTextOfferAlt";
    public static final String[] keF = new String[]{"countText", "hasPreviousResults", "hasNextResults", "searchResults", "totalCount", "totalCountText", "totalCountTextAlt", "totalCountTextOfferAlt", "totalCountTextOffer"};
    private List<aeh_2> keG = new ArrayList<aeh_2>();
    private final int keH;
    private int hQx;
    private int iVf;

    public bif_1(int n) {
        this.keH = n;
    }

    public void a(mk mk2, List<? extends aeh_2> list) {
        this.hQx = mk2.In() < this.keH ? 0 : (mk2.In() - 1) / this.keH;
        this.iVf = mk2.ala();
        this.keG = new ArrayList<aeh_2>(list);
        fse_1.gFu().a((aef_2)this, keF);
    }

    public int dXt() {
        return Math.max(0, this.hQx - 1) * this.keH;
    }

    public int dXu() {
        return Math.max(0, Math.min(this.dCM() - 1, this.hQx + 1)) * this.keH;
    }

    public int dXv() {
        if (this.iVf > 0 && this.iVf % this.keH == 0) {
            return this.keH * (this.iVf / this.keH - 1);
        }
        return this.keH * (this.iVf / this.keH);
    }

    public int dXw() {
        return this.hQx * this.keH;
    }

    public int GW(int n) {
        if (this.GX(n)) {
            return this.dXt();
        }
        return this.dXw();
    }

    private boolean GX(int n) {
        return (this.iVf - n) % this.keH == 0;
    }

    private int dCM() {
        return (int)Math.ceil((double)this.iVf / (double)this.keH);
    }

    public void reset() {
        this.hQx = 0;
        this.iVf = 0;
        this.keG = List.of();
        fse_1.gFu().a((aef_2)this, keF);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "countText": {
                int n = this.dCM() == 0 ? 0 : this.hQx + 1;
                String string2 = new fhl_2(ett_1.opf).bQk();
                return aum_0.cWf().c("market.page.number", string2, n, this.dCM());
            }
            case "hasNextResults": {
                if (this.keG.isEmpty()) {
                    return false;
                }
                return this.hQx < this.dCM() - 1;
            }
            case "hasPreviousResults": {
                if (this.keG.isEmpty()) {
                    return false;
                }
                return this.hQx > 0;
            }
            case "searchResults": {
                return this.keG;
            }
            case "totalCount": {
                return this.iVf;
            }
            case "totalCountText": {
                return aum_0.cWf().c("market.search.result.count", this.iVf);
            }
            case "totalCountTextOffer": {
                return aum_0.cWf().c("market.offer.search.result.count", this.iVf);
            }
            case "totalCountTextAlt": {
                return aum_0.cWf().c("market.currently.for.sale", this.iVf);
            }
            case "totalCountTextOfferAlt": {
                return aum_0.cWf().c("market.current.offers", this.iVf);
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return keF;
    }

    @Generated
    public int ala() {
        return this.iVf;
    }
}

