/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ccc
 */
public class ccc_2
implements aeh_2 {
    public static final String lNz = "type";
    public static final String lNA = "id";
    public static final String lNB = "sanctionText";
    private final exj lNC;

    public ccc_2(exj exj2) {
        this.lNC = exj2;
    }

    @Override
    public String[] bxk() {
        return ArrayUtils.EMPTY_STRING_ARRAY;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lNz.equals(string)) {
            return this.lNC.ffl();
        }
        if (lNB.equals(string)) {
            return aum_0.cWf().c(String.format("moderationPanel.sanction%d", this.lNC.ezB()), new Object[0]);
        }
        if (lNA.equals(string)) {
            return this.lNC.d();
        }
        return null;
    }

    public int eth() {
        return this.lNC.d();
    }
}

