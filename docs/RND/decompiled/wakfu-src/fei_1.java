/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from fEI
 */
public final class fei_1
extends Enum<fei_1> {
    public static final /* enum */ fei_1 unq = new fei_1(new fen_2(), 9, 3);
    public static final /* enum */ fei_1 unr = new fei_1(new feo_1(), 9, 3);
    public static final /* enum */ fei_1 uns = new fei_1(new fem_2(), 15, 3);
    public static final /* enum */ fei_1 unt = new fei_1(new feo_1(), 2, 0);
    private static final String unu = "(!!|\uff01\uff01)";
    private static final Pattern unv;
    private static final Pattern unw;
    private static final Pattern unx;
    private static final Pattern uny;
    private final fej_1 unz;
    private final int unA;
    private final int unB;
    private static final /* synthetic */ fei_1[] unC;

    public static fei_1[] values() {
        return (fei_1[])unC.clone();
    }

    public static fei_1 valueOf(String string) {
        return Enum.valueOf(fei_1.class, string);
    }

    private fei_1(fej_1 fej_12, int n2, int n3) {
        this.unz = fej_12;
        this.unA = n2;
        this.unB = n3;
    }

    public fej_1 gvt() {
        return this.unz;
    }

    public int gvu() {
        return this.unA;
    }

    public int gvv() {
        return this.unB;
    }

    public static azx_1<fei_1, String> tS(String string) {
        azx_1<fei_1, String> azx_12 = new azx_1<fei_1, String>();
        fei_1 fei_12 = unq;
        Matcher matcher = unv.matcher(string);
        Matcher matcher2 = unw.matcher(string);
        Matcher matcher3 = unx.matcher(string);
        Matcher matcher4 = uny.matcher(string);
        if (matcher2.matches()) {
            matcher.find();
            if (matcher.start() == 0 && matcher.end() < string.length()) {
                string = string.replaceFirst(unu, "");
            }
            fei_12 = uns;
        } else if (matcher3.matches()) {
            string = string.replaceFirst("\\*\\*", "");
            fei_12 = unr;
        } else if (matcher4.matches()) {
            string = string.replaceFirst("--", "");
            fei_12 = unt;
        }
        azx_12.Q(fei_12);
        azx_12.N(string);
        return azx_12;
    }

    private static /* synthetic */ fei_1[] gvw() {
        return new fei_1[]{unq, unr, uns, unt};
    }

    static {
        unC = fei_1.gvw();
        unv = Pattern.compile(unu, 32);
        unw = Pattern.compile("(.*(!!|\uff01\uff01).*)", 32);
        unx = Pattern.compile("\\*\\*.*", 32);
        uny = Pattern.compile("--.*", 32);
    }
}

