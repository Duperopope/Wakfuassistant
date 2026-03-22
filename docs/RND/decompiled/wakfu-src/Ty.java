/*
 * Decompiled with CFR 0.152.
 */
public final class Ty
extends Enum<Ty> {
    public static final /* enum */ Ty bsQ = new Ty(0);
    public static final /* enum */ Ty bsR = new Ty(1);
    public static final /* enum */ Ty bsS = new Ty(2);
    public static final /* enum */ Ty bsT = new Ty(3);
    public static final /* enum */ Ty bsU = new Ty(4);
    private final byte bsV;
    private static final /* synthetic */ Ty[] bsW;

    public static Ty[] values() {
        return (Ty[])bsW.clone();
    }

    public static Ty valueOf(String string) {
        return Enum.valueOf(Ty.class, string);
    }

    private Ty(int n2) {
        this.bsV = (byte)n2;
    }

    public byte aJr() {
        return this.bsV;
    }

    public static Ty ac(byte by) {
        for (Ty ty : Ty.values()) {
            if (by != ty.bsV) continue;
            return ty;
        }
        throw new IllegalArgumentException("Invalid " + Ty.class.getName() + " id");
    }

    private static /* synthetic */ Ty[] bhr() {
        return new Ty[]{bsQ, bsR, bsS, bsT, bsU};
    }

    static {
        bsW = Ty.bhr();
    }
}

