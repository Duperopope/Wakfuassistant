/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHY
 */
public abstract class bhy_2
implements aeh_2,
fgf_0 {
    public static final String kdl = "item";
    public static final String kdm = "price";
    public static final String kdn = "formattedPrice";
    public static final String kdo = "totalPrice";
    public static final String kdp = "totalQuantity";
    public static final String kdq = "shortenedQuantity";

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "item": {
                return this.getItem();
            }
            case "price": {
                return this.akd();
            }
            case "formattedPrice": {
                return aum_0.cWf().cQ(this.akd()) + " $";
            }
            case "totalPrice": {
                return this.akd() * (long)this.oP();
            }
            case "totalQuantity": {
                return this.oP();
            }
            case "shortenedQuantity": {
                int n = this.oP();
                if (n < 10000) {
                    return n;
                }
                return n / 1000 + "k";
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{kdl, kdn, kdo, kdm, kdp, kdq};
    }

    public abstract long Lx();

    public abstract long akd();

    public abstract int oP();
}

