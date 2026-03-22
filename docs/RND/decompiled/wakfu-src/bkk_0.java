/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKk
 */
public class bkk_0
extends bkq_0 {
    private final int kmY;

    public bkk_0(bkn_0 bkn_02, int n) {
        super(bkn_02);
        this.kmY = n;
    }

    @Override
    public String getName() {
        bfU bfU2 = bgd.diV().Cs(this.kmY);
        return bfU2.diA();
    }

    @Override
    public fpf ebf() {
        return fpf.sNy;
    }

    @Override
    public Object eu(String string) {
        bfU bfU2 = bgd.diV().Cs(this.kmY);
        if (bfU2 != null) {
            if (string.equals("description")) {
                return bfU2.diB();
            }
            if (string.equals("title")) {
                return this.getName();
            }
            if (string.equals("nameWithRemainingTime")) {
                Object object = this.ebl();
                if (object == null) {
                    return this.getName();
                }
                return new StringBuilder(this.getName()).append(" (").append(object).append(")");
            }
            if (string.equals("nameWithDuration")) {
                return new StringBuilder(this.getName()).append(" (").append(this.ebm()).append(")");
            }
            if (string.equals("name")) {
                return this.getName();
            }
            if (string.equals("iconUrl")) {
                return bfU2.byf();
            }
            return super.eu(string);
        }
        knn.error((Object)("Impossible de cr\u00e9er la vue pour le challenge id=" + this.kmY));
        return null;
    }

    public int clS() {
        return this.kmY;
    }
}

