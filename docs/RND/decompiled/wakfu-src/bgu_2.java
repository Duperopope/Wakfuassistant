/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGU
 */
public class bgu_2
implements aeh_2 {
    public static final String jWH = "name";
    public static final String jWI = "xpValue";
    public static final String jWJ = "xpProgress";
    private final String jWK;
    private final long jWL;
    private final String jWM;

    public bgu_2(String string, long l, float f2) {
        this.jWK = string;
        this.jWL = l;
        this.jWM = String.valueOf(new BigDecimal(f2).setScale(2, RoundingMode.HALF_UP)) + "%";
    }

    @Override
    public String[] bxk() {
        return new String[]{jWH, jWI, jWJ};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jWH.equals(string)) {
            return this.jWK;
        }
        if (jWI.equals(string)) {
            return this.jWL;
        }
        if (jWJ.equals(string)) {
            return this.jWM;
        }
        return null;
    }
}

