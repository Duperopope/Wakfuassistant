/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIg
 */
public class big_1
implements aeh_2 {
    public static final String keI = "name";
    public static final String keJ = "taxFactor";
    private final fjg keK;

    public big_1(fjg fjg2) {
        this.keK = fjg2;
    }

    @Override
    public String[] bxk() {
        return new String[]{keI, keJ};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(keI)) {
            long l = this.keK.Tz() / 3600000L;
            long l2 = l / 24L;
            long l3 = l % 24L;
            return aum_0.cWf().c("remainingDurationShortMonthDayHour", 0, l2, l3);
        }
        if (string.equals(keJ)) {
            return aum_0.cWf().c("desc.taxFactor", (int)(this.keK.gaM() * 100.0));
        }
        return null;
    }

    public fjg dXx() {
        return this.keK;
    }
}

