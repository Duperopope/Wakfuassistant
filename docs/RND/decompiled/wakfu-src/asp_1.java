/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asP
 */
public final class asp_1
extends Enum<asp_1> {
    public static final /* enum */ asp_1 dac = new asp_1(false);
    public static final /* enum */ asp_1 dad = new asp_1(true);
    public static final /* enum */ asp_1 dae = new asp_1(false);
    public static final /* enum */ asp_1 daf = new asp_1(true);
    private final boolean dag;
    private static final /* synthetic */ asp_1[] dah;

    public static asp_1[] values() {
        return (asp_1[])dah.clone();
    }

    public static asp_1 valueOf(String string) {
        return Enum.valueOf(asp_1.class, string);
    }

    private asp_1(boolean bl) {
        this.dag = bl;
    }

    public boolean bKt() {
        return this.dag;
    }

    public static asp_1 gh(String string) {
        asp_1[] asp_1Array;
        for (asp_1 asp_12 : asp_1Array = asp_1.values()) {
            if (!asp_12.name().equals(string.toUpperCase())) continue;
            return asp_12;
        }
        return asp_1Array[0];
    }

    public static boolean a(asp_1 asp_12, asp_1 asp_13) {
        return asp_12.ordinal() % 2 != asp_13.ordinal() % 2;
    }

    private static /* synthetic */ asp_1[] bKu() {
        return new asp_1[]{dac, dad, dae, daf};
    }

    static {
        dah = asp_1.bKu();
    }
}

