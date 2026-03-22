/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class My
extends Mt {
    public static final TimeZone aVO = TimeZone.getTimeZone("UTC");
    private DateFormat aVP;
    private DateFormat aVQ;
    private DateFormat aVR;
    private DateFormat aVS;
    protected static My aVT;
    protected Mv aVU = My.aUY();
    protected String awN;

    public static My aUV() {
        if (aVT == null) {
            aVT = new My();
        }
        return aVT;
    }

    public void d(Mv mv) {
        this.aVU = mv;
        this.aUH();
        this.a(mv);
        this.aUW();
        this.aUI();
    }

    protected void aUW() {
        this.aVP = DateFormat.getDateInstance(0, this.aUZ());
        this.aVP.setTimeZone(aVO);
        this.aVR = DateFormat.getTimeInstance(3, this.aUZ());
        this.aVR.setTimeZone(aVO);
        this.aVQ = DateFormat.getDateInstance(3, this.aUZ());
        this.aVQ.setTimeZone(aVO);
        this.aVS = DateFormat.getDateTimeInstance(3, 3, this.aUZ());
        this.aVS.setTimeZone(aVO);
    }

    public Mv aUXX() {
        return this.aVU;
    }

    @NotNull
    public String c(String string, Object ... objectArray) {
        return this.a(this.aVU, string, objectArray);
    }

    @NotNull
    public String d(String string, Object ... objectArray) {
        return this.b(this.aVU, string, objectArray);
    }

    public boolean cO(String string) {
        return this.a(this.aVU, string);
    }

    @NotNull
    public String J(int n, int n2) {
        return this.a(this.aVU, n, n2);
    }

    @NotNull
    public String a(int n, long l, Object ... objectArray) {
        return this.a(this.aVU, n, l, objectArray);
    }

    @NotNull
    public String b(int n, long l, Object ... objectArray) {
        return this.b(this.aVU, n, l, objectArray);
    }

    public boolean e(int n, long l) {
        return this.a(this.aVU, n, l);
    }

    public static Mv aUY() {
        String string = System.getProperty("user.language");
        return Mv.cM(string);
    }

    @Override
    protected void aUI() {
        if (this.aVU == null) {
            return;
        }
        super.aUI();
    }

    @Nullable
    public Map<Integer, String> nD(int n) {
        return this.a(this.aVU, n);
    }

    public String w(double d2) {
        return NumberFormat.getNumberInstance(this.aUZ()).format(d2);
    }

    public String cQ(long l) {
        return NumberFormat.getIntegerInstance(this.aUZ()).format(l);
    }

    public Number cP(String string) {
        return NumberFormat.getIntegerInstance(this.aUZ()).parse(string);
    }

    public long cQ(String string) {
        return this.cP(string).longValue();
    }

    public int cR(String string) {
        return this.cP(string).intValue();
    }

    public String x(double d2) {
        return NumberFormat.getPercentInstance(this.aUZ()).format(d2);
    }

    private Locale aUZ() {
        return this.aVU.aUJ();
    }

    public String c(Date date) {
        return this.aVP.format(date);
    }

    public String d(Date date) {
        return this.aVR.format(date);
    }

    public String e(Date date) {
        return this.aVQ.format(date);
    }

    public String f(Date date) {
        return this.aVS.format(date);
    }

    @Override
    public String toString() {
        return "SingleLanguageTranslator{m_path='" + this.awN + "', m_language=" + String.valueOf((Object)this.aVU) + "}";
    }
}

