/*
 * Decompiled with CFR 0.152.
 */
public final class frU
extends Enum<frU> {
    public static final /* enum */ frU tak = new frU(-1);
    public static final /* enum */ frU tal = new frU(1);
    public static final /* enum */ frU tam = new frU(0);
    public static final /* enum */ frU tan = new frU(-1);
    public static final /* enum */ frU tao = new frU(1);
    public static final /* enum */ frU tap = new frU(-1);
    private final int taq;
    private static final /* synthetic */ frU[] tar;

    public static frU[] values() {
        return (frU[])tar.clone();
    }

    public static frU valueOf(String string) {
        return Enum.valueOf(frU.class, string);
    }

    private frU(int n2) {
        this.taq = n2;
    }

    public int gky() {
        return this.taq;
    }

    private static /* synthetic */ frU[] gkz() {
        return new frU[]{tak, tal, tam, tan, tao, tap};
    }

    static {
        tar = frU.gkz();
    }
}

