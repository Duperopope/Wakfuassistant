/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDY
 */
public final class ady_1
extends Enum<ady_1> {
    public static final /* enum */ ady_1 dEA = new ady_1("unknown", "UNKNOWN", 0);
    public static final /* enum */ ady_1 dEB = new ady_1("windows", "WINDOWS", 3);
    public static final /* enum */ ady_1 dEC = new ady_1("mac", "MACOS", 4);
    public static final /* enum */ ady_1 dED = new ady_1("sunos", "SUNOS", 5);
    public static final /* enum */ ady_1 dEE = new ady_1("linux", "LINUX", 5);
    private static ady_1 dEF;
    private final String dEG;
    private final String dEH;
    private final byte dEI;
    private static final /* synthetic */ ady_1[] dEJ;

    public static ady_1[] values() {
        return (ady_1[])dEJ.clone();
    }

    public static ady_1 valueOf(String string) {
        return Enum.valueOf(ady_1.class, string);
    }

    private ady_1(String string2, String string3, byte by) {
        this.dEG = string2;
        this.dEH = string3;
        this.dEI = by;
    }

    public static ady_1 bYZ() {
        return dEF;
    }

    public static boolean bZa() {
        return dEF == dEC;
    }

    public static boolean bZb() {
        return dEF == dEB;
    }

    public String getName() {
        return this.dEG;
    }

    public String bZc() {
        return this.dEH;
    }

    public byte bZd() {
        return this.dEI;
    }

    private static /* synthetic */ ady_1[] bZe() {
        return new ady_1[]{dEA, dEB, dEC, dED, dEE};
    }

    static {
        dEJ = ady_1.bZe();
        String string = System.getProperty("os.name").toLowerCase();
        for (ady_1 ady_12 : ady_1.values()) {
            if (!string.startsWith(ady_12.getName())) continue;
            dEF = ady_12;
        }
        if (dEF == null) {
            dEF = dEA;
        }
    }
}

