/*
 * Decompiled with CFR 0.152.
 */
public final class ahc
extends Enum<ahc> {
    public static final /* enum */ ahc cvA = new ahc();
    public static final /* enum */ ahc cvB = new ahc();
    public static final /* enum */ ahc cvC = new ahc();
    public static final /* enum */ ahc cvD = new ahc();
    public static final /* enum */ ahc cvE = new ahc();
    public static final /* enum */ ahc cvF = new ahc();
    public static final /* enum */ ahc cvG = new ahc();
    public static final /* enum */ ahc cvH = new ahc();
    private static final /* synthetic */ ahc[] cvI;

    public static ahc[] values() {
        return (ahc[])cvI.clone();
    }

    public static ahc valueOf(String string) {
        return Enum.valueOf(ahc.class, string);
    }

    public static ahc eL(String string) {
        ahc[] ahcArray;
        for (ahc ahc2 : ahcArray = ahc.values()) {
            if (!ahc2.name().equals(string.toUpperCase())) continue;
            return ahc2;
        }
        return ahcArray[0];
    }

    private static /* synthetic */ ahc[] bzE() {
        return new ahc[]{cvA, cvB, cvC, cvD, cvE, cvF, cvG, cvH};
    }

    static {
        cvI = ahc.bzE();
    }
}

