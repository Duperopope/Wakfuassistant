/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLt
 */
public class blt_2
implements aeh_2 {
    public static final String ksT = "name";
    private final blq_2 ksU;

    protected blt_2(blq_2 blq_22) {
        this.ksU = blq_22;
    }

    protected blt_2() {
        this.ksU = null;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public blq_2 ecG() {
        return this.ksU;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ksT)) {
            return aum_0.cWf().c("rewards.category.filter.name." + String.valueOf(this.ksU == null ? "all" : Integer.valueOf(this.ksU.d())), new Object[0]);
        }
        return null;
    }
}

