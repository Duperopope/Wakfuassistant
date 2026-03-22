/*
 * Decompiled with CFR 0.152.
 */
public final class fnG
extends Enum<fnG> {
    public static final /* enum */ fnG sKl = new fnG(0);
    public static final /* enum */ fnG sKm = new fnG(1);
    public final byte sKn;
    private static final /* synthetic */ fnG[] sKo;

    public static fnG[] values() {
        return (fnG[])sKo.clone();
    }

    public static fnG valueOf(String string) {
        return Enum.valueOf(fnG.class, string);
    }

    private fnG(int n2) {
        this.sKn = GC.ct(n2);
    }

    public static fnG hd(byte by) {
        for (fnG fnG2 : fnG.values()) {
            if (fnG2.sKn != by) continue;
            return fnG2;
        }
        throw new IllegalArgumentException("Impossible de r\u00e9cup\u00e9rer le GroupType d'Id " + by);
    }

    private static /* synthetic */ fnG[] geJ() {
        return new fnG[]{sKl, sKm};
    }

    static {
        sKo = fnG.geJ();
    }
}

