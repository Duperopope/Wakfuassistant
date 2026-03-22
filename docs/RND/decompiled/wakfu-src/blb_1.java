/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blb
 */
public final class blb_1 {
    private static final float isW = 0.299f;
    private static final float isX = 0.587f;
    private static final float isY = 0.114f;
    private static final int isZ = 256;
    private static final float ita = 0.5f;

    private blb_1() {
    }

    public static float h(axb_2 axb_22) {
        return ((float)axb_22.bPW() * 0.299f + (float)axb_22.bPX() * 0.587f + (float)axb_22.bPY() * 0.114f) / 256.0f;
    }

    public static boolean i(axb_2 axb_22) {
        return blb_1.h(axb_22) < 0.5f;
    }
}

