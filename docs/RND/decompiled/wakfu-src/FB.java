/*
 * Decompiled with CFR 0.152.
 */
public final class FB
extends Enum<FB> {
    public static final /* enum */ FB aBD = new FB();
    public static final /* enum */ FB aBE = new FB();
    private static final /* synthetic */ FB[] aBF;

    public static FB[] values() {
        return (FB[])aBF.clone();
    }

    public static FB valueOf(String string) {
        return Enum.valueOf(FB.class, string);
    }

    private static /* synthetic */ FB[] aLc() {
        return new FB[]{aBD, aBE};
    }

    static {
        aBF = FB.aLc();
    }
}

