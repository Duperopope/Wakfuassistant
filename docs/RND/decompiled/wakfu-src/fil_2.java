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
 * Renamed from fIL
 */
public class fil_2 {
    public static final int uCf = -1;
    public static final int uCg = 400;
    public static final int uCh = 300;
    public static final int uCi = 200;
    public static final int uCj = 100;
    public static final String uCk = "primaryMedium";
    public static final String uCl = "secondaryMedium";
    public static final String uCm = "negativeMedium";
    private final int uCn;
    @NotNull
    private String bKP = "";
    @NotNull
    private String iYo = "secondaryMedium";
    private boolean uCo = false;
    @Nullable
    private Integer uCp;
    @Nullable
    private fim_2 uCq;

    public fil_2(int n) {
        this.uCn = Math.max(n, 0);
    }

    public static fil_2 gCm() {
        return new fil_2(400).vH(fyw_0.gqw().k("yes", new Object[0])).vI(uCk).pf(true).aI(fhy_2.gBq().eHZ());
    }

    public static fil_2 gCn() {
        return new fil_2(400).vH(fyw_0.gqw().k("yes", new Object[0])).vI(uCm).pf(true).aI(fhy_2.gBq().eHZ());
    }

    public static fil_2 gCo() {
        return new fil_2(200).vH(fyw_0.gqw().k("no", new Object[0])).vI(uCl).pf(false).aI(fhy_2.gBq().eIa());
    }

    public static fil_2 gCp() {
        return new fil_2(300).vH(fyw_0.gqw().k("ok", new Object[0])).vI(uCk).pf(true).aI(fhy_2.gBq().eHZ());
    }

    public static fil_2 gCq() {
        return new fil_2(100).vH(fyw_0.gqw().k("cancel", new Object[0])).vI(uCl).pf(false).aI(fhy_2.gBq().eIa());
    }

    public fil_2 vH(@Nullable String string) {
        this.bKP = string != null ? string : "";
        return this;
    }

    public fil_2 m(@NotNull String string, Object ... objectArray) {
        this.bKP = fyw_0.gqw().k(string, objectArray);
        return this;
    }

    public fil_2 vI(@Nullable String string) {
        this.iYo = string != null ? string : uCl;
        return this;
    }

    public fil_2 pf(boolean bl) {
        this.uCo = bl;
        return this;
    }

    public fil_2 aI(Integer n) {
        this.uCp = n;
        return this;
    }

    public fil_2 c(@NotNull fim_2 fim_22) {
        this.uCq = fim_22;
        return this;
    }

    public int gCr() {
        return this.uCn;
    }

    @NotNull
    public String getText() {
        return this.bKP;
    }

    @NotNull
    public String getStyle() {
        return this.iYo;
    }

    public boolean gCs() {
        return this.uCo;
    }

    @Nullable
    public Integer gCt() {
        return this.uCp;
    }

    @Nullable
    public fim_2 gCu() {
        return this.uCq;
    }
}

