/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLo
 */
public final class elo_0
extends Enum<elo_0> {
    public static final /* enum */ elo_0 qFT = new elo_0(0);
    public static final /* enum */ elo_0 qFU = new elo_0(1);
    public static final /* enum */ elo_0 qFV = new elo_0(2);
    public static final /* enum */ elo_0 qFW = new elo_0(3);
    private final byte qFX;
    private static final /* synthetic */ elo_0[] qFY;

    public static elo_0[] values() {
        return (elo_0[])qFY.clone();
    }

    public static elo_0 valueOf(String string) {
        return Enum.valueOf(elo_0.class, string);
    }

    private elo_0(byte by) {
        this.qFX = by;
    }

    public static elo_0 eZ(byte by) {
        for (elo_0 elo_02 : elo_0.values()) {
            if (elo_02.qFX != by) continue;
            return elo_02;
        }
        return null;
    }

    public byte aJr() {
        return this.qFX;
    }

    private static /* synthetic */ elo_0[] fzE() {
        return new elo_0[]{qFT, qFU, qFV, qFW};
    }

    static {
        qFY = elo_0.fzE();
    }
}

