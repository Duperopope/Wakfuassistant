/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ask
 */
public abstract sealed class ask_2
extends Enum<ask_2>
permits asl_2, asm_2, asn_2, aso_2 {
    public static final /* enum */ ask_2 cXP = new asl_2();
    public static final /* enum */ ask_2 cXQ = new asm_2();
    public static final /* enum */ ask_2 cXR = new asn_2();
    public static final /* enum */ ask_2 cXS = new aso_2();
    private static final /* synthetic */ ask_2[] cXT;

    public static ask_2[] values() {
        return (ask_2[])cXT.clone();
    }

    public static ask_2 valueOf(String string) {
        return Enum.valueOf(ask_2.class, string);
    }

    abstract void c(asi_2 var1);

    ask_2 bJz() {
        ask_2[] ask_2Array;
        int n = this.ordinal();
        if (n == (ask_2Array = ask_2.values()).length - 1) {
            return ask_2Array[0];
        }
        return ask_2Array[n + 1];
    }

    private static /* synthetic */ ask_2[] bJA() {
        return new ask_2[]{cXP, cXQ, cXR, cXS};
    }

    static {
        cXT = ask_2.bJA();
    }
}

