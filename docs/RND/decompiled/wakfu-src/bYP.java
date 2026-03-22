/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bYP
implements fti_2 {
    private static final int lBj = 30;

    @Override
    public fsp_2 epw() {
        return new fsp_2(-1, null, null, aum_0.cWf().c("theme.noTheme", new Object[0]), aum_0.cWf().c("theme.noTheme.description", new Object[0]));
    }

    @Override
    public String epx() {
        return aum_0.cWf().c("theme.auto.generated.name", new Object[0]);
    }

    @Override
    public String epy() {
        return aum_0.cWf().c("theme.auto.generated.description", new Object[0]);
    }

    @Override
    public String a(aqt_2 aqt_22, String string) {
        String string2 = this.b(aqt_22, "name");
        return aum_0.cWf().c("theme.displayName", string2.isEmpty() ? string : string2, this.b(aqt_22, "version"), this.b(aqt_22, "author"), this.b(aqt_22, "wakfuVersion"));
    }

    @NotNull
    private String b(aqt_2 aqt_22, String string) {
        return this.a(aqt_22, string, 30);
    }

    @Override
    @NotNull
    public String a(aqt_2 aqt_22, String string, int n) {
        String string2 = aum_0.cWf().aUXX().aUP().toLowerCase();
        String string3 = bYP.b(aqt_22, string + "-" + string2, n);
        if (!string3.isEmpty()) {
            return string3;
        }
        return bYP.b(aqt_22, string, n);
    }

    @NotNull
    private static String b(aqt_2 aqt_22, String string, int n) {
        apd_1 apd_12 = aqt_22.fn(string);
        if (apd_12 == null) {
            return "";
        }
        apd_1 apd_13 = apd_12.fn("#text");
        if (apd_13 == null || apd_13.bCt() == null) {
            return "";
        }
        String string2 = apd_13.bCt().trim().replaceAll("[^\\x0A\\x20-\\x7F\\xA0-\\xFF]", "");
        if (string2.length() < n) {
            return string2;
        }
        return string2.substring(0, n);
    }
}

