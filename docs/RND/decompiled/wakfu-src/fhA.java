/*
 * Decompiled with CFR 0.152.
 */
public final class fhA
extends Enum<fhA> {
    public static final /* enum */ fhA soV = new fhA();
    public static final /* enum */ fhA soW = new fhA();
    public static final /* enum */ fhA soX = new fhA();
    private static final /* synthetic */ fhA[] soY;

    public static fhA[] values() {
        return (fhA[])soY.clone();
    }

    public static fhA valueOf(String string) {
        return Enum.valueOf(fhA.class, string);
    }

    private static /* synthetic */ fhA[] fYf() {
        return new fhA[]{soV, soW, soX};
    }

    static {
        soY = fhA.fYf();
    }
}

