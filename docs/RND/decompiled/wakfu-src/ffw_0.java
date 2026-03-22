/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ffW
 */
public class ffw_0 {
    private static final Pattern shw = Pattern.compile("(\\d+)(?:;(.*))?");
    private final String shx;
    private boolean shy;
    private int eQp;
    private String shz;

    private ffw_0(String string) {
        this.shx = string;
        this.shy = false;
    }

    private void fWA() {
        Matcher matcher = shw.matcher(this.shx);
        if (matcher.matches()) {
            this.shy = true;
            this.eQp = Integer.parseInt(matcher.group(1));
            this.shz = null;
            if (matcher.group(2) != null && !matcher.group(2).isEmpty()) {
                this.shz = matcher.group(2);
            }
        }
    }

    @Nullable
    private ffV fQJ() {
        if (!this.shy) {
            return null;
        }
        ffV ffV2 = ffV.k(fgD.fXh().Vd(this.eQp));
        if (this.shz == null) {
            return ffV2;
        }
        if (!ffV2.sI(this.shz)) {
            return null;
        }
        return ffV2;
    }

    @Nullable
    public static ffV sJ(String string) {
        ffw_0 ffw_02 = new ffw_0(string);
        ffw_02.fWA();
        return ffw_02.fQJ();
    }
}

