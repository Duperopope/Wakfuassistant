/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bbR
 */
public class bbr_2
implements aeh_2 {
    private final frj hBG;
    public static final String hBH = "contextName";
    public static final String hBI = "taxValue";
    public static final String hBJ = "taxPercentage";
    public static final String hBK = "taxPercentageLongDesc";
    public static final String[] hBL = new String[]{"contextName", "taxValue", "taxPercentage", "taxPercentageLongDesc"};

    public bbr_2(frj frj2) {
        this.hBG = frj2;
    }

    @Override
    public String[] bxk() {
        return hBL;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hBH)) {
            return this.daq();
        }
        if (string.equals(hBI)) {
            return Float.valueOf(this.hBG.getValue() * 100.0f / 5.0f);
        }
        if (string.equals(hBJ)) {
            return this.dap();
        }
        if (string.equals(hBK)) {
            return aum_0.cWf().c("protector.tax.longDesc", new ahv_2().ceC().yu(14).c(this.dap()).ceD().ceL());
        }
        return null;
    }

    private String dap() {
        return bbr_2.a(this.hBG);
    }

    private String daq() {
        return bbr_2.b(this.hBG);
    }

    public String getDescription() {
        return bbr_2.c(this.hBG);
    }

    public frj dar() {
        return this.hBG;
    }

    public static String a(@NotNull frj frj2) {
        return String.format("%d%%", (int)(frj2.getValue() * 100.0f));
    }

    public static String b(@NotNull frj frj2) {
        return aum_0.cWf().a(55, (long)frj2.gjW().sXI, new Object[0]);
    }

    public static String c(@NotNull frj frj2) {
        return bbr_2.b(frj2) + " : " + bbr_2.a(frj2);
    }
}

