/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.regex.Pattern;

final class Bq
extends Enum<Bq> {
    public static final /* enum */ Bq atv = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\uff03'))), "#");
    public static final /* enum */ Bq atw = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u00a0'))), " ");
    public static final /* enum */ Bq atx = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2026'))), "...");
    public static final /* enum */ Bq aty = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2018'))), "'");
    public static final /* enum */ Bq atz = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2019'))), "'");
    public static final /* enum */ Bq atA = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u201c'))), "\"");
    public static final /* enum */ Bq atB = new Bq(Pattern.compile(String.format("[%s]+", Character.valueOf('\u201d'))), "\"");
    public static final /* enum */ Bq atC = new Bq(Pattern.compile(String.format("%s\\s*", Character.valueOf('\u00ab'))), "\"");
    public static final /* enum */ Bq atD = new Bq(Pattern.compile(String.format("\\s*%s", Character.valueOf('\u00bb'))), "\"");
    public static final /* enum */ Bq atE = new Bq(Pattern.compile("[ \t]+$"), "", true);
    public static final Bq[] atF;
    public static final Bq[] atG;
    final Pattern atH;
    final String atI;
    private final boolean atJ;
    private static final /* synthetic */ Bq[] atK;

    public static Bq[] values() {
        return (Bq[])atK.clone();
    }

    public static Bq valueOf(String string) {
        return Enum.valueOf(Bq.class, string);
    }

    private Bq(Pattern pattern, String string2) {
        this(pattern, string2, false);
    }

    private Bq(Pattern pattern, String string2, boolean bl) {
        this.atH = pattern;
        this.atI = string2;
        this.atJ = bl;
    }

    private static /* synthetic */ Bq[] aHD() {
        return new Bq[]{atv, atw, atx, aty, atz, atA, atB, atC, atD, atE};
    }

    static {
        atK = Bq.aHD();
        atF = (Bq[])Arrays.stream(Bq.values()).filter(bq -> !bq.atJ).toArray(Bq[]::new);
        atG = Bq.values();
    }
}

