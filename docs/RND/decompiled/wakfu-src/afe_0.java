/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afE
 */
public abstract class afe_0 {
    private static afe_0 cqH;

    public static afe_0 bxS() {
        if (cqH == null) {
            throw new UnsupportedOperationException("Le provider n'est pas initialis\u00e9");
        }
        return cqH;
    }

    public static void a(afe_0 afe_02) {
        if (cqH != null) {
            throw new UnsupportedOperationException("Le provider a d\u00e9j\u00e0 \u00e9t\u00e9 initialis\u00e9");
        }
        cqH = afe_02;
    }

    public abstract afc_0 se(int var1);

    public abstract String bxT();
}

