/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLu
 */
public class blu_2
implements aeh_2 {
    public static final String ksV = "name";
    private final blr_2 ksW;

    protected blu_2(blr_2 blr_22) {
        this.ksW = blr_22;
    }

    protected blu_2() {
        this.ksW = null;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    public blr_2 ecH() {
        return this.ksW;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ksV)) {
            return aum_0.cWf().c("rewards.type.filter.name." + String.valueOf(this.ksW == null ? "all" : Integer.valueOf(this.ksW.d())), new Object[0]);
        }
        return null;
    }
}

