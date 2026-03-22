/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fGK
 */
public abstract class fgk_2 {
    private static final String uuH = "text";
    private static final String uuI = "image";
    private static final String uuJ = "align";
    private static final Pattern uuK = Pattern.compile("(text|image)");
    private static final Pattern uuL = Pattern.compile("align=\"(west|center|east)\"");
    private ahr_2 uuM = ahr_2.dSB;
    private final boolean uuN;
    private final fgj_2 uuO;
    private final fgk_2 uuP;
    private fzY utm = null;
    private String shz = null;

    public fgk_2(fgj_2 fgj_22, fgk_2 fgk_22, boolean bl) {
        this.uuO = fgj_22;
        this.uuN = bl;
        this.uuP = fgk_22;
    }

    protected abstract String ebz();

    public ahr_2 gzE() {
        return this.uuM;
    }

    public fgj_2 gyh() {
        return this.uuO;
    }

    protected void a(ahr_2 ahr_22) {
        this.uuM = ahr_22;
    }

    public String esy() {
        return this.shz;
    }

    public void uh(String string) {
        this.shz = string != null ? string.intern() : null;
    }

    public fzY getAlignment() {
        return this.utm;
    }

    public void setAlignment(fzY fzY2) {
        if (fzY2 != null) {
            this.utm = fzY2;
        }
    }

    public abstract int aPs();

    public boolean a(Matcher matcher, ArrayList<fgk_2> arrayList) {
        String string = matcher.group(5);
        if (string != null) {
            String string2 = matcher.group(2);
            String string3 = matcher.group(4);
            this.aE(string2, string3);
            Matcher matcher2 = fgh_2.uut.matcher(string);
            boolean bl = false;
            while (matcher2.find()) {
                fgk_2 fgk_22 = ((fgh_2)this.uuO).a(matcher2, this, bl);
                if (fgk_22 != this) {
                    bl = true;
                }
                fgk_22.a(matcher2, arrayList);
            }
        } else {
            this.uh(this.ui(matcher.group(7)));
            this.aE(null, null);
        }
        return true;
    }

    public final String gzF() {
        StringBuilder stringBuilder = new StringBuilder(512);
        this.b(stringBuilder);
        if (StringUtils.isEmpty((CharSequence)stringBuilder)) {
            return this.esy();
        }
        StringBuilder stringBuilder2 = new StringBuilder("<").append(this.ebz());
        stringBuilder2.append(stringBuilder.toString()).append('>');
        stringBuilder2.append(this.gzG());
        stringBuilder2.append("</").append(this.ebz()).append('>');
        return stringBuilder2.toString();
    }

    protected static void a(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"").append(string2).append('\"');
    }

    protected static void a(StringBuilder stringBuilder, String string, int n) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"").append(n).append('\"');
    }

    protected static void a(StringBuilder stringBuilder, String string, boolean bl) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append('=').append(bl);
    }

    protected static void a(StringBuilder stringBuilder, String string, Color color) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"");
        stringBuilder.append(Integer.toHexString(color.getRed() & 0xFF));
        stringBuilder.append(Integer.toHexString(color.getGreen() >> 8 & 0xFF));
        stringBuilder.append(Integer.toHexString(color.getBlue() >> 16 & 0xFF));
        stringBuilder.append('\"');
    }

    private String gzG() {
        String string = this.esy();
        string = StringUtils.replace((String)string, (String)"<", (String)"&lt;");
        string = StringUtils.replace((String)string, (String)">", (String)"&gt;");
        return string;
    }

    private String ui(String string) {
        String string2 = string;
        string2 = StringUtils.replace((String)string2, (String)"&lt;", (String)"<");
        string2 = StringUtils.replace((String)string2, (String)"&gt;", (String)">");
        return string2;
    }

    protected void b(StringBuilder stringBuilder) {
        if (this.utm != null) {
            fgk_2.a(stringBuilder, uuJ, this.utm.toString().toLowerCase());
        }
    }

    protected void aE(String string, String string2) {
        fzY fzY2;
        if (this.uuP != null) {
            this.utm = this.uuP.utm;
        }
        if (string2 == null) {
            return;
        }
        Matcher matcher = uuL.matcher(string2);
        if (matcher.find() && (fzY2 = fzY.valueOf(matcher.group(1).toUpperCase())) != null) {
            this.setAlignment(fzY2);
        }
    }

    public static ahr_2 uj(String string) {
        Matcher matcher;
        ahr_2 ahr_22 = ahr_2.dSC;
        if (string != null && string.length() != 0 && (matcher = uuK.matcher(string)).find()) {
            ahr_22 = ahr_2.valueOf(matcher.group(1).toUpperCase());
        }
        return ahr_22;
    }

    public abstract boolean abx(int var1);

    public abstract boolean aby(int var1);

    public abstract boolean ha(int var1, int var2);

    public String toString() {
        return this.getClass().getSimpleName() + " data=" + this.esy();
    }

    public fgk_2 gzH() {
        return this.uuP;
    }

    @Nullable
    public fgk_2 b(ahr_2 ahr_22) {
        if (this.uuP == null) {
            return null;
        }
        if (this.uuP.gzE() == ahr_22) {
            return this.uuP;
        }
        return this.uuP.b(ahr_22);
    }

    public abstract void clean();
}

