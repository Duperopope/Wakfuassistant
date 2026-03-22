/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from fGL
 */
public class fgl_2
extends fgk_2 {
    private static final String uuQ = "image";
    private static final String uuR = "width";
    private static final String uuS = "height";
    private static final String uuT = "pixmap";
    private static final String uuU = "popupTranslatorKey";
    private static final Pattern uuV = Pattern.compile("width=\"([0-9]+)\"");
    private static final Pattern uuW = Pattern.compile("height=\"([0-9]+)\"");
    private static final Pattern uuX = Pattern.compile("pixmap=\"(@?[a-zA-Z0-9\\-_/!:.]+)\"");
    private static final Pattern uuY = Pattern.compile("popupTranslatorKey=\"([ a-zA-Z0-9\\-_/!:.]+)\"");
    private String uuZ;
    private awg_1 tEC;
    private int brs = 0;
    private int brt = 0;
    private boolean uva = false;
    private String uvb;

    public fgl_2(fgj_2 fgj_22, fgk_2 fgk_22) {
        super(fgj_22, fgk_22, true);
        this.a(ahr_2.dSD);
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public void setPixmap(awg_1 awg_12) {
        if (this.tEC != null) {
            this.tEC.setTexture(null);
        }
        this.tEC = awg_12;
    }

    public int getWidth() {
        if (this.uva) {
            return this.brs;
        }
        if (this.tEC != null) {
            return this.tEC.getWidth();
        }
        return 0;
    }

    public void setWidth(int n) {
        this.brs = n;
        this.uva = true;
    }

    public int getHeight() {
        if (this.uva) {
            return this.brt;
        }
        if (this.tEC != null) {
            return this.tEC.getHeight();
        }
        return 0;
    }

    public void setHeight(int n) {
        this.brt = n;
        this.uva = true;
    }

    @Override
    public int aPs() {
        return 1;
    }

    @Override
    protected void b(StringBuilder stringBuilder) {
        super.b(stringBuilder);
        if (this.brs != 0) {
            fgl_2.a(stringBuilder, uuR, this.brs);
        }
        if (this.brt != 0) {
            fgl_2.a(stringBuilder, uuS, this.brt);
        }
        if (this.uuZ != null) {
            fgl_2.a(stringBuilder, uuT, this.uuZ);
        }
    }

    @Override
    protected void aE(String string, String string2) {
        super.aE(string, string2);
        if (string2 != null) {
            Object object;
            Matcher matcher;
            Matcher matcher2;
            Matcher matcher3 = uuV.matcher(string2);
            if (matcher3.find()) {
                this.setWidth(Integer.valueOf(matcher3.group(1)));
            }
            if ((matcher2 = uuW.matcher(string2)).find()) {
                this.setHeight(Integer.valueOf(matcher2.group(1)));
            }
            if ((matcher = uuX.matcher(string2)).find()) {
                object = matcher.group(1);
                awk_1 awk_12 = fmu_1.gEF().vU((String)object);
                if (awk_12 != null) {
                    this.setPixmap(new awg_1(awk_12));
                    this.uuZ = object;
                }
            }
            if (((Matcher)(object = uuY.matcher(string2))).find()) {
                this.uvb = ((Matcher)object).group(1);
            }
        }
    }

    public String gzI() {
        return this.uvb;
    }

    @Override
    public boolean abx(int n) {
        return true;
    }

    @Override
    public boolean ha(int n, int n2) {
        return true;
    }

    @Override
    public boolean aby(int n) {
        return true;
    }

    @Override
    public boolean a(Matcher matcher, ArrayList<fgk_2> arrayList) {
        int n = arrayList.size();
        boolean bl = super.a(matcher, arrayList);
        if (this.uuZ == null) {
            return false;
        }
        arrayList.add(n, this);
        return bl;
    }

    @Override
    protected String ebz() {
        return uuQ;
    }

    @Override
    public String esy() {
        return "";
    }

    @Override
    public void clean() {
        if (this.tEC != null) {
            this.tEC.setTexture(null);
        }
    }
}

