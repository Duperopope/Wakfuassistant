/*
 * Decompiled with CFR 0.152.
 */
public final class eyc
extends Enum<eyc> {
    public static final /* enum */ eyc phc = new eyc();
    public static final /* enum */ eyc phd = new eyc();
    private static final /* synthetic */ eyc[] phe;

    public static eyc[] values() {
        return (eyc[])phe.clone();
    }

    public static eyc valueOf(String string) {
        return Enum.valueOf(eyc.class, string);
    }

    private static /* synthetic */ eyc[] fhD() {
        return new eyc[]{phc, phd};
    }

    static {
        phe = eyc.fhD();
    }
}

