/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from Fs
 */
public class fs_0
implements fp_0 {
    private OutputStream aBj;
    private ByteArrayOutputStream aBk;
    private int aBl;
    private int aBm;
    private boolean aBn = false;
    private long aBo;
    private boolean aBp;

    public fs_0(OutputStream outputStream) {
        this.aBj = outputStream;
    }

    public fs_0() {
        this.aBk = new ByteArrayOutputStream();
        this.aBj = this.aBk;
        this.aBp = true;
    }

    public fs_0(int n) {
        this.aBk = new ByteArrayOutputStream(n);
        this.aBj = this.aBk;
        this.aBp = true;
    }

    public byte[] aKU() {
        if (!this.aBp) {
            throw new IllegalStateException("Use this method only with memory streams!");
        }
        try {
            this.aBj.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this.aBk.toByteArray();
    }

    public static int a(double d2) {
        if (d2 == 0.0) {
            return 1;
        }
        long l = (long)(d2 * 65536.0);
        return fs_0.co(l);
    }

    public long aKV() {
        return this.aBo;
    }

    public static int co(long l) {
        int n = l == 0L ? 0 : (int)(Math.floor(Math.log(Math.abs(l)) / Math.log(2.0)) + 2.0);
        return n;
    }

    public static int cp(long l) {
        if (l < 1L) {
            return 0;
        }
        return (int)(Math.floor(Math.log(l) / Math.log(2.0)) + 1.0);
    }

    public void aKW() {
        if (this.aBm > 0) {
            this.aBj.write(this.aBl);
            ++this.aBo;
            this.aBm = 0;
            this.aBl = 0;
        }
    }

    public void close() {
        this.aKW();
        this.aBj.close();
    }

    public void aKX() {
        if (!this.aBn) {
            this.aBj = new BufferedOutputStream(new DeflaterOutputStream(this.aBj, new Deflater(9)));
            this.aBn = true;
        }
    }

    public void aKY() {
        this.aBj.flush();
    }

    public void ay(boolean bl) {
        this.d(bl ? 1L : 0L, 1);
    }

    public void di(byte[] byArray) {
        this.aKW();
        if (byArray == null) {
            return;
        }
        this.aBj.write(byArray);
        this.aBo += (long)byArray.length;
    }

    public void b(double d2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putDouble(d2);
        this.di(byteBuffer.array());
    }

    public void c(double d2) {
        this.k((short)(d2 * 256.0));
    }

    public void a(double d2, int n) {
        long l = (long)(d2 * 65536.0);
        this.c(l, n);
    }

    @Override
    public void b(float f2) {
        this.mz(Float.floatToIntBits(f2));
    }

    public void y(float f2) {
        int n = Float.floatToIntBits(f2);
        int n2 = Math.abs((n & Integer.MIN_VALUE) >> 31);
        int n3 = (n & 0x7F800000) >> 23;
        int n4 = n & 0x7FFFFF;
        int n5 = 0;
        if (n3 != 0) {
            n5 = n3 == 255 ? 31 : n3 - 127 + 15;
        }
        int n6 = 0;
        if (n5 < 0) {
            n5 = 0;
        } else if (n5 > 31) {
            n5 = 31;
        } else {
            n6 = n4 >> 13;
        }
        int n7 = n2 << 15;
        n7 |= n5 << 10;
        this.mQ(n7 |= n6);
    }

    @Override
    public void k(short s) {
        this.aKW();
        this.aBj.write(s & 0xFF);
        this.aBj.write(s >> 8);
        this.aBo += 2L;
    }

    @Override
    public void mz(int n) {
        this.aKW();
        this.aBj.write(n & 0xFF);
        this.aBj.write(n >> 8);
        this.aBj.write(n >> 16);
        this.aBj.write(n >> 24);
        this.aBo += 4L;
    }

    public void cq(long l) {
        this.aKW();
        this.aBj.write((byte)(l & 0xFFL));
        this.aBj.write((byte)(l >> 8));
        this.aBj.write((byte)(l >> 16));
        this.aBj.write((byte)(l >> 24));
        this.aBj.write((byte)(l >> 32));
        this.aBj.write((byte)(l >> 40));
        this.aBj.write((byte)(l >> 48));
        this.aBj.write((byte)(l >> 56));
        this.aBo += 8L;
    }

    @Override
    public void g(byte by) {
        this.aKW();
        this.aBj.write(by);
        ++this.aBo;
    }

    public void c(long l, int n) {
        int n2 = fs_0.co(l);
        if (n < n2) {
            throw new IOException("At least " + n2 + " bits needed for representation of " + l);
        }
        this.e(l, n);
    }

    @Override
    public void bo(String string) {
        this.di(BH.aP(string));
        this.aBj.write(0);
        ++this.aBo;
    }

    public void mQ(int n) {
        this.aKW();
        this.aBj.write(n & 0xFF);
        this.aBj.write(n >> 8);
        this.aBo += 2L;
    }

    public void cr(long l) {
        this.aKW();
        this.aBj.write((int)(l & 0xFFL));
        this.aBj.write((int)(l >> 8));
        this.aBj.write((int)(l >> 16));
        this.aBj.write((int)(l >> 24));
        this.aBo += 4L;
    }

    public void w(short s) {
        this.aKW();
        this.aBj.write(s);
        ++this.aBo;
    }

    public void d(long l, int n) {
        int n2 = fs_0.cp(l);
        if (n < n2) {
            throw new IOException("At least " + n2 + " bits needed for representation of " + l + ". Used bits: " + n);
        }
        this.e(l, n);
    }

    private void e(long l, int n) {
        for (int i = n; i > 0; --i) {
            ++this.aBm;
            if ((1L << i - 1 & l) != 0L) {
                this.aBl |= 1 << 8 - this.aBm;
            }
            if (this.aBm != 8) continue;
            this.aBj.write(this.aBl);
            ++this.aBo;
            this.aBm = 0;
            this.aBl = 0;
        }
    }

    public void b(byte[] byArray, int n, int n2) {
        this.aKW();
        if (byArray == null) {
            return;
        }
        this.aBj.write(byArray, n, n2);
        this.aBo += (long)n2;
    }
}

