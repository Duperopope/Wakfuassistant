/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpB
 */
public abstract class bpb_1
implements aeh_2 {
    public static final String iWH = "id";
    public static final String iWI = "name";

    public abstract int d();

    public abstract String dDp();

    public abstract String a(Mt var1, Mv var2);

    public abstract short aVf();

    public abstract short aVe();

    public abstract String dDq();

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iWH -> this.d();
            case iWI -> {
                if (fse_1.gFu().dp("isAdmin")) {
                    yield this.dDp() + " (" + this.d() + ")";
                }
                yield this.dDp();
            }
            default -> null;
        };
    }
}

