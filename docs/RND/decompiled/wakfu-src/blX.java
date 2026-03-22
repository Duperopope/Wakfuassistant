/*
 * Decompiled with CFR 0.152.
 */
public final class blX
extends Enum<blX> {
    public static final /* enum */ blX iya = new blX();
    public static final /* enum */ blX iyb = new blX();
    public static final /* enum */ blX iyc = new blX();
    public static final /* enum */ blX iyd = new blX();
    private static final blX[] iye;
    private static final /* synthetic */ blX[] iyf;

    public static blX[] values() {
        return (blX[])iyf.clone();
    }

    public static blX valueOf(String string) {
        return Enum.valueOf(blX.class, string);
    }

    public blX duX() {
        return iye[(this.ordinal() + 1) % iye.length];
    }

    private static /* synthetic */ blX[] duY() {
        return new blX[]{iya, iyb, iyc, iyd};
    }

    static {
        iyf = blX.duY();
        iye = blX.values();
    }
}

