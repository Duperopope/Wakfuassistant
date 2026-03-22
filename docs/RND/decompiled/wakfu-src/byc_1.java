/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYC
 */
public class byc_1
implements aeh_2,
bye_1 {
    static final int lzX = 300;
    static final int lzY = 500;
    private static final int lzZ = 2000;
    private static final int lAa = 6000;
    private static final int lAb = 50;
    public static final String lAc = "text";
    public static final String lAd = "style";
    public static final String[] lAe = new String[]{"text", "style"};
    @NotNull
    private final byh_1 lAf;
    @NotNull
    private final byd_1 lAg;
    private final String lAh;

    private byc_1(@NotNull byh_1 byh_12, @NotNull byd_1 byd_12, String string) {
        this.lAf = byh_12;
        this.lAg = byd_12;
        this.lAh = string;
    }

    public static byc_1 a(@NotNull byh_1 byh_12, String string) {
        return new byc_1(byh_12, byd_1.lAi, string);
    }

    public static byc_1 b(@NotNull byh_1 byh_12, String string) {
        return new byc_1(byh_12, byd_1.lAj, string);
    }

    public static byc_1 c(@NotNull byh_1 byh_12, String string) {
        return new byc_1(byh_12, byd_1.lAk, string);
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return this.lAf;
    }

    @Override
    @NotNull
    public String eoV() {
        return "textToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAo;
    }

    @Override
    public byg_1 eoX() {
        return new byg_1(300, byc_1.nO(this.lAh), 500);
    }

    public static int nO(String string) {
        return GC.a(string.length() * 50, 2000, 6000);
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("textToast", (Object)this, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("textToast", (Object)this, fey_22.getElementMap());
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("textToast", null, fey_22.getElementMap());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case lAc -> this.lAh;
            case lAd -> this.lAg.lAl;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return lAe;
    }
}

