/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNp
 */
public final class enp_0 {
    public static long B(int n, short s) {
        return (n << 16) + (s & 0xFF);
    }

    public static int qu(long l) {
        return (int)(l >> 16);
    }

    public static short qv(long l) {
        return (short)(l & 0xFFL);
    }
}

