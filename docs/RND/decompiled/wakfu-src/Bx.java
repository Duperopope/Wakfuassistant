/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class Bx {
    private static final int auF = 32;
    private static final int auG = 126;
    private static final long auH = 3471289200L;
    private long auI;

    public Bx() {
    }

    public Bx(long l) {
        this.auI = l;
    }

    public void ck(long l) {
        this.auI = l;
    }

    private long aHJ() {
        this.auI ^= this.auI << 13;
        this.auI ^= this.auI >> 7;
        this.auI ^= this.auI << 17;
        return this.auI < 0L ? this.auI - Long.MIN_VALUE : this.auI;
    }

    public long aHK() {
        return this.a(0L, Long.MAX_VALUE);
    }

    public long nextLong(long l) {
        return this.a(0L, l);
    }

    public long a(long l, long l2) {
        if (l >= l2) {
            return l;
        }
        return this.aHJ() % (l2 - l) + l;
    }

    public int aHL() {
        return this.n(0, Integer.MAX_VALUE);
    }

    public int nextInt(int n) {
        return this.n(0, n);
    }

    public int n(int n, int n2) {
        return (int)this.a(n, n2);
    }

    public short aHM() {
        return this.a((short)0, (short)Short.MAX_VALUE);
    }

    public short i(short s) {
        return this.a((short)0, s);
    }

    public short a(short s, short s2) {
        return (short)this.a((long)s, (long)s2);
    }

    public byte aHN() {
        return this.a((byte)0, (byte)127);
    }

    public byte d(byte by) {
        return this.a((byte)0, by);
    }

    public byte a(byte by, byte by2) {
        return (byte)this.a((long)by, (long)by2);
    }

    public boolean aHO() {
        return this.aHJ() % 2L == 0L;
    }

    public String mi(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Random String length cannot be < 0: " + n);
        }
        char[] cArray = new char[n];
        for (int i = 0; i < n; ++i) {
            cArray[i] = (char)this.n(32, 127);
        }
        return new String(cArray);
    }

    public <T> T a(T[] TArray) {
        return TArray[this.nextInt(TArray.length)];
    }

    public <T> T a(List<T> list) {
        return list.get(this.nextInt(list.size()));
    }

    public long aHP() {
        return this.aHJ() % 3471289200L;
    }
}

