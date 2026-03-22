/*
 * Decompiled with CFR 0.152.
 */
public final class Tx
extends Enum<Tx> {
    public static final /* enum */ Tx bsM = new Tx();
    public static final /* enum */ Tx bsN = new Tx();
    public static final /* enum */ Tx bsO = new Tx();
    private static final /* synthetic */ Tx[] bsP;

    public static Tx[] values() {
        return (Tx[])bsP.clone();
    }

    public static Tx valueOf(String string) {
        return Enum.valueOf(Tx.class, string);
    }

    public static Tx pw(int n) {
        for (Tx tx : Tx.values()) {
            if (tx.ordinal() != n) continue;
            return tx;
        }
        return null;
    }

    public static Tx px(int n) {
        return switch (n) {
            case 0 -> bsM;
            case 1 -> bsN;
            default -> bsO;
        };
    }

    private static /* synthetic */ Tx[] bhq() {
        return new Tx[]{bsM, bsN, bsO};
    }

    static {
        bsP = Tx.bhq();
    }
}

