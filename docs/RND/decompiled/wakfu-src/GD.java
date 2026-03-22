/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class GD
extends Random
implements Serializable {
    private static final long aGu = 2932129847991607657L;
    private static final GD aGv = new GD();
    private static final int aGw = 624;
    private static final int aGx = 397;
    private static final int aGy = -1727483681;
    private static final int aGz = Integer.MIN_VALUE;
    private static final int aGA = Integer.MAX_VALUE;
    private static final int aGB = -1658038656;
    private static final int aGC = -272236544;
    private int[] aGD;
    private int aGE;
    private int[] aGF;
    private double aGG;
    private boolean aGH;

    public GD() {
        this(System.currentTimeMillis());
    }

    public GD(long l) {
        super(l);
        this.setSeed(l);
    }

    public GD(int[] nArray) {
        super(System.currentTimeMillis());
        this.g(nArray);
    }

    @Override
    public synchronized void setSeed(long l) {
        super.setSeed(l);
        this.aGH = false;
        this.aGD = new int[624];
        this.aGF = new int[2];
        this.aGF[0] = 0;
        this.aGF[1] = -1727483681;
        this.aGD[0] = (int)(l & 0xFFFFFFFL);
        this.aGE = 1;
        while (this.aGE < 624) {
            this.aGD[this.aGE] = 1812433253 * (this.aGD[this.aGE - 1] ^ this.aGD[this.aGE - 1] >>> 30) + this.aGE;
            int n = this.aGE++;
            this.aGD[n] = this.aGD[n] & 0xFFFFFFFF;
        }
    }

    public synchronized void g(int[] nArray) {
        int n;
        this.setSeed(19650218L);
        int n2 = 1;
        int n3 = 0;
        int n4 = n = 624 > nArray.length ? 624 : nArray.length;
        while (n != 0) {
            this.aGD[n2] = (this.aGD[n2] ^ (this.aGD[n2 - 1] ^ this.aGD[n2 - 1] >>> 30) * 1664525) + nArray[n3] + n3;
            int n5 = n2++;
            this.aGD[n5] = this.aGD[n5] & 0xFFFFFFFF;
            ++n3;
            if (n2 >= 624) {
                this.aGD[0] = this.aGD[623];
                n2 = 1;
            }
            if (n3 >= nArray.length) {
                n3 = 0;
            }
            --n;
        }
        for (n = 623; n != 0; --n) {
            this.aGD[n2] = (this.aGD[n2] ^ (this.aGD[n2 - 1] ^ this.aGD[n2 - 1] >>> 30) * 1566083941) - n2;
            int n6 = n2++;
            this.aGD[n6] = this.aGD[n6] & 0xFFFFFFFF;
            if (n2 < 624) continue;
            this.aGD[0] = this.aGD[623];
            n2 = 1;
        }
        this.aGD[0] = Integer.MIN_VALUE;
    }

    @Override
    protected synchronized int next(int n) {
        int n2;
        if (this.aGE >= 624) {
            int n3;
            for (n3 = 0; n3 < 227; ++n3) {
                n2 = this.aGD[n3] & Integer.MIN_VALUE | this.aGD[n3 + 1] & Integer.MAX_VALUE;
                this.aGD[n3] = this.aGD[n3 + 397] ^ n2 >>> 1 ^ this.aGF[n2 & 1];
            }
            while (n3 < 623) {
                n2 = this.aGD[n3] & Integer.MIN_VALUE | this.aGD[n3 + 1] & Integer.MAX_VALUE;
                this.aGD[n3] = this.aGD[n3 + -227] ^ n2 >>> 1 ^ this.aGF[n2 & 1];
                ++n3;
            }
            n2 = this.aGD[623] & Integer.MIN_VALUE | this.aGD[0] & Integer.MAX_VALUE;
            this.aGD[623] = this.aGD[396] ^ n2 >>> 1 ^ this.aGF[n2 & 1];
            this.aGE = 0;
        }
        n2 = this.aGD[this.aGE++];
        n2 ^= n2 >>> 11;
        n2 ^= n2 << 7 & 0x9D2C5680;
        n2 ^= n2 << 15 & 0xEFC60000;
        n2 ^= n2 >>> 18;
        return n2 >>> 32 - n;
    }

    private synchronized void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    private synchronized void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override
    public boolean nextBoolean() {
        return this.next(1) != 0;
    }

    public boolean N(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (f2 == 0.0f) {
            return false;
        }
        if (f2 == 1.0f) {
            return true;
        }
        return this.nextFloat() < f2;
    }

    public boolean l(double d2) {
        if (d2 < 0.0 || d2 > 1.0) {
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        }
        if (d2 == 0.0) {
            return false;
        }
        if (d2 == 1.0) {
            return true;
        }
        return this.nextDouble() < d2;
    }

    @Override
    public int nextInt(int n) {
        int n2;
        int n3;
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) {
            return 0;
        }
        if ((n & -n) == n) {
            return (int)((long)n * (long)this.next(31) >> 31);
        }
        while ((n3 = this.next(31)) - (n2 = n3 % n) + (n - 1) < 0) {
        }
        return n2;
    }

    @Override
    public long nextLong(long l) {
        long l2;
        long l3;
        if (l < 0L) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (l == 0L) {
            return 0L;
        }
        while ((l3 = this.nextLong() >>> 1) - (l2 = l3 % l) + (l - 1L) < 0L) {
        }
        return l2;
    }

    @Override
    public double nextDouble() {
        return (double)(((long)this.next(26) << 27) + (long)this.next(27)) / 9.007199254740992E15;
    }

    @Override
    public float nextFloat() {
        return (float)this.next(24) / 1.6777216E7f;
    }

    @Override
    public void nextBytes(byte[] byArray) {
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)this.next(8);
        }
    }

    public char aNO() {
        return (char)this.next(16);
    }

    public short aHM() {
        return (short)this.next(16);
    }

    public byte aHN() {
        return (byte)this.next(8);
    }

    @Override
    public synchronized double nextGaussian() {
        double d2;
        double d3;
        double d4;
        if (this.aGH) {
            this.aGH = false;
            return this.aGG;
        }
        while ((d4 = (d3 = 2.0 * this.nextDouble() - 1.0) * d3 + (d2 = 2.0 * this.nextDouble() - 1.0) * d2) >= 1.0 || d4 == 0.0) {
        }
        double d5 = Math.sqrt(-2.0 * Math.log(d4) / d4);
        this.aGG = d2 * d5;
        this.aGH = true;
        return d3 * d5;
    }

    public static synchronized GD aNP() {
        return aGv;
    }
}

