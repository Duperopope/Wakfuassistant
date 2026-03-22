/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from PX
 */
public final class px_0
extends Enum<px_0> {
    public static final /* enum */ px_0 beR = new px_0(-1);
    public static final /* enum */ px_0 beS = new px_0(0);
    public static final /* enum */ px_0 beT = new px_0(1);
    public static final /* enum */ px_0 beU = new px_0(2);
    public static final /* enum */ px_0 beV = new px_0(3);
    public static final /* enum */ px_0 beW = new px_0(4);
    private final byte beX;
    private static final /* synthetic */ px_0[] beY;

    public static px_0[] values() {
        return (px_0[])beY.clone();
    }

    public static px_0 valueOf(String string) {
        return Enum.valueOf(px_0.class, string);
    }

    private px_0(byte by) {
        this.beX = by;
    }

    @NotNull
    public static px_0 H(byte by) {
        for (px_0 px_02 : px_0.values()) {
            if (px_02.beX != by) continue;
            return px_02;
        }
        return beR;
    }

    public byte aJr() {
        return this.beX;
    }

    private static /* synthetic */ px_0[] aZe() {
        return new px_0[]{beR, beS, beT, beU, beV, beW};
    }

    static {
        beY = px_0.aZe();
    }
}

