/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fzD
 */
public abstract sealed class fzd_0
extends Enum<fzd_0>
permits fze_0, fzf_0 {
    public static final /* enum */ fzd_0 tGK = new fze_0();
    public static final /* enum */ fzd_0 tGL = new fzf_0();
    private static final /* synthetic */ fzd_0[] tGM;

    public static fzd_0[] values() {
        return (fzd_0[])tGM.clone();
    }

    public static fzd_0 valueOf(String string) {
        return Enum.valueOf(fzd_0.class, string);
    }

    @Nullable
    public abstract <T> T c(ArrayList<T> var1, int var2);

    public abstract <T> float a(float var1, ArrayList<T> var2, boolean var3, float var4, float var5, int var6);

    private static /* synthetic */ fzd_0[] grH() {
        return new fzd_0[]{tGK, tGL};
    }

    static {
        tGM = fzd_0.grH();
    }
}

