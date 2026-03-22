/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLT
 */
public class blt_1 {
    private static final int kvl = 1;
    private static final int kvm = 2;
    private static final int kvn = 3;

    public static int f(short s, byte by, short s2) {
        return blt_1.a(s, by, s2, 1);
    }

    public static int g(short s, byte by, short s2) {
        return blt_1.a(s, by, s2, 2);
    }

    public static int h(short s, byte by, short s2) {
        return blt_1.a(s, by, s2, 3);
    }

    private static int a(short s, byte by, short s2, int n) {
        int n2 = 1000;
        n2 += s * 10 + by;
        n2 *= 100;
        return n2 += n;
    }

    public static boolean Ic(int n) {
        return cpy_2.pX(String.valueOf(n));
    }
}

