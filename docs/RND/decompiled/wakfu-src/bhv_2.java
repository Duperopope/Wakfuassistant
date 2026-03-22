/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHV
 */
public class bhv_2
implements aeh_2 {
    private static final int kcZ = 1;
    public static final String kda = "name";
    @Nullable
    private final fjb kdb;

    public bhv_2(@Nullable fjb fjb2) {
        this.kdb = fjb2;
    }

    @Override
    public String[] bxk() {
        return new String[]{kda};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kda)) {
            if (this.kdb == null) {
                return aum_0.cWf().c("market.history.element.type.all", new Object[0]);
            }
            return aum_0.cWf().c("market.history.element.type." + this.kdb.aJr(), 1);
        }
        return null;
    }

    @Nullable
    public fjb dXd() {
        return this.kdb;
    }
}

