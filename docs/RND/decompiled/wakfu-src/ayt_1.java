/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayt
 */
public class ayt_1 {
    public static final ayt_1 dsP = new ayt_1(1.0f, 100.0f);
    private final float dsQ;
    private final float dsR;

    public ayt_1(float f2, float f3) {
        this.dsQ = f2;
        this.dsR = f3;
    }

    public final int K(int n, int n2, int n3) {
        return (int)this.b(n, n2, n3);
    }

    public final int d(int[] nArray, int n) {
        return this.K(nArray[0], nArray[1], n);
    }

    public final short a(short s, short s2, int n) {
        return (short)this.b(s, s2, n);
    }

    public final short a(short[] sArray, int n) {
        return this.a(sArray[0], sArray[1], n);
    }

    public final long a(long l, long l2, int n) {
        return (long)this.b(l, l2, n);
    }

    public final long a(long[] lArray, int n) {
        return this.a(lArray[0], lArray[1], n);
    }

    public final float b(float f2, float f3, int n) {
        if ((float)n <= this.dsQ) {
            return f2;
        }
        if ((float)n >= this.dsR) {
            return f3;
        }
        if (f3 == f2) {
            return f2;
        }
        float f4 = ((float)n - this.dsQ) / (this.dsR - this.dsQ);
        return GC.a(f2, f3, f4);
    }

    public final float h(float[] fArray, int n) {
        return this.b(fArray[0], fArray[1], n);
    }
}

