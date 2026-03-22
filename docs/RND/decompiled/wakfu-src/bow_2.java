/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOw
 */
public final class bow_2
extends Enum<bow_2> {
    public static final /* enum */ bow_2 kLe = new bow_2(1);
    public static final /* enum */ bow_2 kLf = new bow_2(2);
    public static final /* enum */ bow_2 kLg = new bow_2(3);
    public static final /* enum */ bow_2 kLh = new bow_2(4);
    public static final /* enum */ bow_2 kLi = new bow_2(5);
    public static final /* enum */ bow_2 kLj = new bow_2(6);
    private final byte kLk;
    private static final int kLl = 3;
    private static final /* synthetic */ bow_2[] kLm;

    public static bow_2[] values() {
        return (bow_2[])kLm.clone();
    }

    public static bow_2 valueOf(String string) {
        return Enum.valueOf(bow_2.class, string);
    }

    private bow_2(byte by) {
        this.kLk = by;
    }

    public byte aJr() {
        return this.kLk;
    }

    public static bow_2 cF(byte by) {
        for (bow_2 bow_22 : bow_2.values()) {
            if (bow_22.kLk != by) continue;
            return bow_22;
        }
        return null;
    }

    public static bow_2 Iz(int n) {
        bow_2[] bow_2Array = bow_2.values();
        if (bow_2Array.length < n || n >= 3) {
            return null;
        }
        return bow_2Array[n];
    }

    public static bow_2 IA(int n) {
        int n2;
        bow_2[] bow_2Array = bow_2.values();
        if (bow_2Array.length < (n2 = n + 3) || n2 < 3) {
            return null;
        }
        return bow_2Array[n2];
    }

    public boolean egX() {
        return this.ordinal() < 3;
    }

    private static /* synthetic */ bow_2[] egY() {
        return new bow_2[]{kLe, kLf, kLg, kLh, kLi, kLj};
    }

    static {
        kLm = bow_2.egY();
    }
}

