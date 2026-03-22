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
 * Renamed from cPt
 */
public class cpt_1
implements aeh_2 {
    public static final String nhG = "text";
    public static final String nhH = "xOffset";
    public static final String nhI = "yOffset";
    public static final String nhJ = "alignment";
    public static final String[] nhK = new String[]{"text", "xOffset", "yOffset", "alignment"};
    private String bJz;
    private int bRf = -10;
    private int bRg = 10;
    private fzw_0 nhL = ctu_1.nKV;

    public cpt_1(@NotNull String string) {
        this.bJz = string;
    }

    @Override
    public String[] bxk() {
        return nhK;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case nhG -> aum_0.cWf().c(this.bJz, new Object[0]);
            case nhH -> Integer.valueOf(this.bRf);
            case nhI -> Integer.valueOf(this.bRg);
            case nhJ -> this.nhL;
            default -> null;
        };
    }

    public String toString() {
        return "DisplayButtonView{m_tradKey='" + this.bJz + "'}";
    }

    public void pW(String string) {
        this.bJz = string;
    }

    public void setXOffset(int n) {
        this.bRf = n;
    }

    public void setYOffset(int n) {
        this.bRg = n;
    }

    public void setAlignment(fzw_0 fzw_02) {
        this.nhL = fzw_02;
    }
}

