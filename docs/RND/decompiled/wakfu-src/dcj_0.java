/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from dcj
 */
public class dcj_0
implements aeh_2 {
    public static final String oeH = "text";
    public static final String oeI = "iconUrl";
    public static final String oeJ = "guildIconUrl";
    public static final String oeK = "overIconsUrl";
    public static final String oeL = "smileyDescriptorLibrary";
    public static final String oeM = "isDead";
    public final String[] oeN = new String[]{"text", "iconUrl", "overIconsUrl"};
    private final List<String> oeO;
    private final String oeP;
    private final String oeQ;
    private final String oeR;
    private final String oeS;
    private final bue_0 oeT;
    private final boolean oeU;

    dcj_0(String string, String string2, String string3, String string4, List<String> list, bue_0 bue_02, boolean bl) {
        this.oeR = string;
        this.oeS = string2;
        this.oeP = string3;
        this.oeQ = string4;
        this.oeO = list;
        this.oeT = bue_02;
        this.oeU = bl;
    }

    public String getText() {
        return this.oeR;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(oeH)) {
            if (fse_1.gFu().dp("isAdmin") && this.oeS != null) {
                if (this.oeR != null) {
                    return String.format("%s%n%s", this.oeR, this.oeS);
                }
                return this.oeS;
            }
            return this.oeR;
        }
        if (string.equals(oeJ)) {
            return this.oeP;
        }
        if (string.equals(oeI)) {
            return this.oeQ;
        }
        if (string.equals(oeK)) {
            return this.oeO;
        }
        if (string.equals(oeL)) {
            return this.oeT;
        }
        if (string.equals(oeM)) {
            return this.oeU;
        }
        return null;
    }
}

