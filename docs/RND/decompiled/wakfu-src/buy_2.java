/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUY
 */
public final class buy_2
extends Enum<buy_2> {
    public static final /* enum */ buy_2 lrE = new buy_2("removed");
    private final String lrF;
    private static final /* synthetic */ buy_2[] lrG;

    public static buy_2[] values() {
        return (buy_2[])lrG.clone();
    }

    public static buy_2 valueOf(String string) {
        return Enum.valueOf(buy_2.class, string);
    }

    private buy_2(String string2) {
        this.lrF = string2;
    }

    public String eor() {
        return this.lrF;
    }

    private static /* synthetic */ buy_2[] eos() {
        return new buy_2[]{lrE};
    }

    static {
        lrG = buy_2.eos();
    }
}

