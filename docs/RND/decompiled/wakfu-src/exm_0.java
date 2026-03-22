/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from exM
 */
public final class exm_0
extends Enum<exm_0> {
    public static final /* enum */ exm_0 pfp = new exm_0();
    public static final /* enum */ exm_0 pfq = new exm_0();
    public static final /* enum */ exm_0 pfr = new exm_0();
    public static final /* enum */ exm_0 pfs = new exm_0();
    public static final /* enum */ exm_0 pft = new exm_0();
    public static final /* enum */ exm_0 pfu = new exm_0();
    public static final /* enum */ exm_0 pfv = new exm_0();
    public static final /* enum */ exm_0 pfw = new exm_0();
    private static final /* synthetic */ exm_0[] pfx;

    public static exm_0[] values() {
        return (exm_0[])pfx.clone();
    }

    public static exm_0 valueOf(String string) {
        return Enum.valueOf(exm_0.class, string);
    }

    @NotNull
    public static exm_0 OB(int n) {
        for (exm_0 exm_02 : exm_0.values()) {
            if (exm_02.ordinal() != n) continue;
            return exm_02;
        }
        return pfw;
    }

    public boolean ffB() {
        return this != pfp;
    }

    private static /* synthetic */ exm_0[] ffC() {
        return new exm_0[]{pfp, pfq, pfr, pfs, pft, pfu, pfv, pfw};
    }

    static {
        pfx = exm_0.ffC();
    }
}

