/*
 * Decompiled with CFR 0.152.
 */
public final class fro
extends Enum<fro> {
    public static final /* enum */ fro sXQ = new fro(1);
    public static final /* enum */ fro sXR = new fro(2);
    public static final /* enum */ fro sXS = new fro(3);
    public static final /* enum */ fro sXT = new fro(4);
    public static final /* enum */ fro sXU = new fro(5);
    private final byte sXV;
    private static final /* synthetic */ fro[] sXW;

    public static fro[] values() {
        return (fro[])sXW.clone();
    }

    public static fro valueOf(String string) {
        return Enum.valueOf(fro.class, string);
    }

    private fro(int n2) {
        this.sXV = (byte)n2;
    }

    public static fro ZC(int n) {
        for (fro fro2 : fro.values()) {
            if (fro2.sXV != n) continue;
            return fro2;
        }
        return null;
    }

    public byte aJr() {
        return this.sXV;
    }

    private static /* synthetic */ fro[] gjY() {
        return new fro[]{sXQ, sXR, sXS, sXT, sXU};
    }

    static {
        sXW = fro.gjY();
    }
}

