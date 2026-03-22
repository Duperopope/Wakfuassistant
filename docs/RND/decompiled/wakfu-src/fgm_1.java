/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Strings;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fGM
 */
public class fgm_1
extends fgk_2 {
    private static final Logger uvc = Logger.getLogger(fgm_1.class);
    private static final String uvd = "text";
    private static final String uve = "font";
    private static final String uvf = "u";
    private static final String uvg = "b";
    private static final String uvh = "i";
    private static final String uvi = "c";
    private static final String uvj = "name";
    private static final String uvk = "(name|face)";
    private static final String uvl = "color";
    private static final String uvm = "id";
    private static final Pattern uvn = Pattern.compile("(name|face)=\"([a-zA-Z 0-9-]+)\"");
    private static final Pattern uvo = Pattern.compile("size=\"([0-9]+)\"");
    private static final Pattern uvp = Pattern.compile("color=\"([0-9A-Fa-f]{6})\"");
    private static final Pattern uvq = Pattern.compile("color=\"([0-9A-Za-z]+)\"");
    private static final Pattern uvr = Pattern.compile("id=\"(([^,]+)|([^,]+\\-[^,]+))\"");
    private String cHc = null;
    private awx_1 cVs;
    private boolean uvs = false;
    private boolean uvt = false;
    private Color bXH;
    private boolean uuo = false;
    private boolean uup = false;

    public fgm_1(fgj_2 fgj_22, fgk_2 fgk_22, boolean bl) {
        super(fgj_22, fgk_22, bl);
        if (!bl) {
            this.a(ahr_2.dSC);
        }
    }

    @Override
    public void uh(String string) {
        super.uh(this.uk(string));
    }

    public int A(String string, int n) {
        String string2 = this.uk(string);
        String string3 = this.getText();
        String string4 = string3 == null ? "" : string3.substring(0, n);
        String string5 = string3 == null ? "" : string3.substring(n);
        super.uh(string4 + string2 + string5);
        return string2.length();
    }

    public void setText(String string) {
        this.uh(string);
    }

    public String getText() {
        return this.esy();
    }

    public String dDG() {
        String string = this.getText();
        if (this.gyh().isPassword()) {
            return Strings.repeat((String)"*", (int)string.length());
        }
        return string;
    }

    public awx_1 gzc() {
        return this.cVs;
    }

    public void b(awx_1 awx_12) {
        this.cVs = awx_12;
    }

    public Color gze() {
        return this.bXH;
    }

    public void c(Color color) {
        if (color != null) {
            this.bXH = color;
        }
    }

    public boolean gzf() {
        return this.uuo;
    }

    public void oR(boolean bl) {
        this.uuo = bl;
    }

    public boolean gzg() {
        return this.uup;
    }

    public void oS(boolean bl) {
        this.uup = bl;
    }

    public String getId() {
        return this.cHc;
    }

    public void setId(String string) {
        this.cHc = string;
    }

    @Override
    protected String ebz() {
        return uvd;
    }

    @Override
    public int aPs() {
        return this.getText().length();
    }

    @Override
    public boolean a(Matcher matcher, ArrayList<fgk_2> arrayList) {
        int n = arrayList.size();
        boolean bl = super.a(matcher, arrayList);
        if (bl && (this.esy() == null || this.esy().length() == 0)) {
            return false;
        }
        arrayList.add(n, this);
        return bl;
    }

    public String uk(String string) {
        return fgm_1.c(string, this.gyh().gzk());
    }

    public static String c(@NotNull String string, @Nullable Pattern pattern) {
        if (pattern == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            String string2 = Character.toString(string.charAt(i));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    @Override
    protected void b(StringBuilder stringBuilder) {
        String string;
        super.b(stringBuilder);
        if (this.cVs != null && (string = this.cVs.bNu()) != null) {
            fgm_1.a(stringBuilder, uvj, string);
        }
        if (this.bXH != null) {
            fgm_1.a(stringBuilder, uvl, this.bXH);
        }
        if (this.cHc != null) {
            fgm_1.a(stringBuilder, uvm, this.cHc);
        }
        if (this.uuo) {
            fgm_1.a(stringBuilder, uvf, this.uuo);
        }
        if (this.uup) {
            fgm_1.a(stringBuilder, uvi, this.uup);
        }
    }

    @Override
    protected void aE(String string, String string2) {
        Matcher matcher;
        Matcher matcher2;
        super.aE(string, string2);
        int n = 0;
        fgm_1 fgm_12 = (fgm_1)this.b(ahr_2.dSC);
        if (fgm_12 != null) {
            this.uvs = fgm_12.uvs;
            this.uvt = fgm_12.uvt;
            this.uuo = fgm_12.uuo;
            this.uup = fgm_12.uup;
            this.bXH = fgm_12.bXH;
            this.cVs = fgm_12.cVs;
            this.cHc = fgm_12.cHc;
            if (this.uvs) {
                n |= 1;
            }
            if (this.uvt) {
                n |= 2;
            }
        }
        awh_2 awh_22 = null;
        if (this.gyh().gyc() != null) {
            awh_22 = this.gyh().gyc().getFont();
        }
        if (this.cVs != null) {
            awh_22 = this.cVs.getFont();
        }
        boolean bl = false;
        if (string2 != null && (matcher2 = uvn.matcher(string2)).find()) {
            String string3 = matcher2.group(2);
            awh_22 = awk_2.v(string3, this.gyh().isEnableAWTFont());
            bl = true;
        }
        float f2 = 0.0f;
        boolean bl2 = false;
        if (string2 != null) {
            matcher = uvo.matcher(string2);
            if (awh_22 != null && matcher.find()) {
                f2 = Float.parseFloat(matcher.group(1));
                bl2 = true;
            }
        }
        if (awh_22 != null) {
            if (string2 != null) {
                matcher = uvp.matcher(string2);
                if (matcher.find()) {
                    try {
                        int n2 = Integer.valueOf(matcher.group(1), 16);
                        this.c(new Color(n2));
                    }
                    catch (NumberFormatException numberFormatException) {
                        uvc.warn((Object)("Invalid color in text document : " + matcher.group(1)));
                    }
                } else {
                    Matcher matcher3 = uvq.matcher(string2);
                    if (matcher3.find()) {
                        String string4 = matcher3.group(1);
                        if (fhm_2.uwB.uz(string4)) {
                            axb_2 axb_22 = fhm_2.uwB.uy(string4);
                            this.c(new Color(axb_22.bPW(), axb_22.bPX(), axb_22.bPY()));
                        } else {
                            uvc.warn((Object)("Invalid theme color in text document :" + string4));
                        }
                    }
                }
            }
            n = awh_22.bNf();
            boolean bl3 = false;
            if (uvg.equalsIgnoreCase(string)) {
                this.uvs = true;
                bl3 = true;
            }
            if (uvh.equalsIgnoreCase(string)) {
                this.uvt = true;
                bl3 = true;
            }
            if (bl3) {
                if (this.uvs) {
                    n |= 1;
                }
                if (this.uvt) {
                    n |= 2;
                }
            }
            if (!bl2) {
                f2 = awh_22.bNe();
            }
            if (bl2 || bl3) {
                awh_22 = awh_22.c(n, f2, this.gyh().isEnableAWTFont());
                bl = true;
            }
            if (bl) {
                this.b(awa_1.c(awh_22));
            }
        }
        if (uvf.equals(string)) {
            this.oR(true);
        }
        if (uvi.equals(string)) {
            this.oS(true);
        }
        if (string2 != null && (matcher = uvr.matcher(string2)).find()) {
            this.setId(String.valueOf(matcher.group(1)));
        }
    }

    @Override
    public boolean abx(int n) {
        String string = this.getText();
        if (string.length() <= n) {
            return false;
        }
        this.setText(string.substring(0, n));
        return this.getText().length() == 0;
    }

    @Override
    public boolean ha(int n, int n2) {
        String string = this.getText();
        if (string == null) {
            return false;
        }
        if (n < 0 || n > string.length() || n2 < 0 || n2 > string.length()) {
            return false;
        }
        this.setText(string.substring(0, n) + string.substring(n2));
        return this.getText().length() == 0;
    }

    @Override
    public boolean aby(int n) {
        this.setText(this.getText().substring(n));
        return this.getText().length() == 0;
    }

    @Override
    public void clean() {
    }
}

