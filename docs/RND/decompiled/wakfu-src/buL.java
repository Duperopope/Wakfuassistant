/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class buL
extends Enum<buL>
permits buM, buN {
    public static final /* enum */ buL jqN = new buM();
    public static final /* enum */ buL jqO = new buN();
    private static final /* synthetic */ buL[] jqP;

    public static buL[] values() {
        return (buL[])jqP.clone();
    }

    public static buL valueOf(String string) {
        return Enum.valueOf(buL.class, string);
    }

    public abstract void a(axb_2 var1, buJ var2);

    private static /* synthetic */ buL[] dJy() {
        return new buL[]{jqN, jqO};
    }

    static {
        jqP = buL.dJy();
    }
}

