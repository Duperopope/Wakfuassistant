/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYv
 */
public class byv_2
implements aeh_2,
bye_1 {
    public static final String lzv = "illustrationUrl";
    public static final String lzw = "mainText";
    public static final String lzx = "levelUpData";
    private final String lzy;
    @NotNull
    private final String lzz;
    @NotNull
    private final List<byw_1> lzA;
    private final byg_1 lzB;

    public byv_2(@NotNull bhJ bhJ2, short s, int n, boolean bl) {
        this.lzy = (String)bhJ2.eu("characterSheetCircleIllustrationUrl");
        this.lzz = aum_0.cWf().c("level.up.toast.text", bhJ2.getName(), s + n, n);
        this.lzA = byx_1.a(bhJ2, s, n, bl).stream().map(byz_12 -> new byw_1((byz_1)byz_12, bhJ2.Sn())).toList();
        int n2 = byc_1.nO(this.lzz + this.lzA.stream().map(byw_12 -> byw_12.lzE.epf()).collect(Collectors.joining()));
        this.lzB = new byg_1(300, n2, 500);
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return byh_1.lAD;
    }

    @Override
    @NotNull
    public String eoV() {
        return "levelUpToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAn;
    }

    @Override
    public byg_1 eoX() {
        return this.lzB;
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("levelUpToast", (Object)this, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        this.a(fey_22);
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("levelUpToast", null, fey_22.getElementMap());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{lzv, lzw, lzx}, (Object)string2, n)) {
            case 0 -> this.lzy;
            case 1 -> this.lzz;
            case 2 -> this.lzA;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{lzv, lzw, lzx};
    }
}

