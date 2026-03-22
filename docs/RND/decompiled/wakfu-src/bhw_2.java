/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHW
 */
public final class bhw_2
extends bhy_2 {
    private static final float kdc = 0.4f;
    public static final String kdd = "sellTime";
    public static final String kde = "type";
    public static final String kdf = "styleForType";
    public static final String kdg = "isExpired";
    @NotNull
    private final mt_1 kdh;
    private final ffV kdi;
    private final Date kdj;

    public bhw_2(mt_1 mt_12, long l) {
        this.kdh = mt_12;
        this.kdi = fga_0.w(mt_12.aaA().aem().gY(1).aer());
        this.kdj = bhw_2.a(mt_12, l);
    }

    private static Date a(mt_1 mt_12, long l) {
        uw_0 uw_02 = new uw_0(ue_0.bjV().bjc());
        long l2 = l - mt_12.Fa();
        return uw_02.b(new uz_0(l2 / 1000L)).bjC();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "formattedPrice": {
                if (this.dip()) {
                    return new ahv_2().cew().af(super.eu("formattedPrice")).cex().ceL();
                }
                return super.eu("formattedPrice");
            }
            case "sellTime": {
                Locale locale = aum_0.cWf().aUXX().aUJ();
                DateFormat dateFormat = DateFormat.getDateInstance(1, locale);
                dateFormat.setTimeZone(uw_0.bvG);
                return dateFormat.format(this.kdj);
            }
            case "type": {
                return aum_0.cWf().c("market.history.element.type." + this.kdh.alG().ordinal(), new Object[0]);
            }
            case "styleForType": {
                return this.getStyle();
            }
            case "isExpired": {
                return this.dip();
            }
        }
        return super.eu(string);
    }

    private boolean dip() {
        return this.kdh.alG() == mx_0.Lc || this.kdh.alG() == mx_0.Le;
    }

    public String getStyle() {
        switch (this.kdh.alG()) {
            case Lc: 
            case Le: {
                return "textTagRed";
            }
            case Ld: 
            case Lf: {
                return "textTagGreen";
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])new String[]{kdd, kde, kdf, kdg});
    }

    @Override
    public long Lx() {
        return this.kdh.Lx();
    }

    @Override
    public long akd() {
        return this.kdh.alI();
    }

    @Override
    public int oP() {
        return this.kdh.alK();
    }

    @NotNull
    @Generated
    public mt_1 dXe() {
        return this.kdh;
    }

    @Override
    @Generated
    public ffV getItem() {
        return this.kdi;
    }

    @Generated
    public Date dXf() {
        return this.kdj;
    }
}

