/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from azg
 */
public class azg_1 {
    private static final int duT = 10;
    protected byte[] duU;
    protected int duV;
    protected int cRf;
    protected int duW;

    public azg_1() {
        this.duU = new byte[10];
        this.duV = 10;
        this.cRf = 0;
        this.duW = 10;
    }

    public azg_1(azg_1 azg_12) {
        this.duV = this.cRf = azg_12.cRf;
        this.duU = new byte[azg_12.cRf];
        this.duW = azg_12.duW;
    }

    public azg_1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.duU = new byte[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = 10;
    }

    public azg_1(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.duU = new byte[n];
        this.duV = n;
        this.cRf = 0;
        this.duW = n2;
    }

    public static azg_1 dG(byte[] byArray) {
        if (byArray == null) {
            throw new IllegalArgumentException("Le tableau ne peut \u00eatre nul");
        }
        azg_1 azg_12 = new azg_1();
        azg_12.duU = byArray;
        azg_12.duV = byArray.length;
        azg_12.duW = 10;
        azg_12.cRf = azg_12.duV;
        return azg_12;
    }

    public final void aF(byte by) {
        this.vA(this.cRf + 1);
        this.duU[this.cRf] = by;
        ++this.cRf;
    }

    public final void dH(byte[] byArray) {
        int n = byArray.length;
        this.vA(this.cRf + n);
        System.arraycopy(byArray, 0, this.duU, this.cRf, n);
        this.cRf += n;
    }

    public final void h(byte[] byArray, int n) {
        this.vA(this.cRf + n);
        System.arraycopy(byArray, 0, this.duU, this.cRf, n);
        this.cRf += n;
    }

    public final void d(byte[] byArray, int n, int n2) {
        this.vA(this.cRf + n2);
        System.arraycopy(byArray, n, this.duU, this.cRf, n2);
        this.cRf += n2;
    }

    public final void a(azg_1 azg_12) {
        this.d(azg_12.duU, 0, azg_12.cRf);
    }

    public final void dz(boolean bl) {
        this.aF(bl ? (byte)1 : 0);
    }

    public final void i(char c2) {
        this.vA(this.cRf + 2);
        this.duU[this.cRf] = (byte)(0xFF & c2 >> 8);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFF & c2);
        ++this.cRf;
    }

    public final void aG(short s) {
        this.vA(this.cRf + 2);
        this.duU[this.cRf] = (byte)(0xFF & s >> 8);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFF & s);
        ++this.cRf;
    }

    public final void vC(int n) {
        this.vA(this.cRf + 4);
        this.duU[this.cRf] = (byte)(0xFF & n >> 24);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFF & n >> 16);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFF & n >> 8);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFF & n);
        ++this.cRf;
    }

    public final void gK(long l) {
        this.vA(this.cRf + 8);
        this.duU[this.cRf] = (byte)(0xFFL & l >> 56);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 48);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 40);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 32);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 24);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 16);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l >> 8);
        ++this.cRf;
        this.duU[this.cRf] = (byte)(0xFFL & l);
        ++this.cRf;
    }

    public final boolean aG(byte by) {
        for (int i = 0; i < this.cRf; ++i) {
            if (this.duU[i] != by) continue;
            return true;
        }
        return false;
    }

    public final void di(float f2) {
        this.vC(Float.floatToIntBits(f2));
    }

    public final void H(double d2) {
        this.gK(Double.doubleToLongBits(d2));
    }

    public final void gV(String string) {
        byte[] byArray = BH.aP(string);
        if (byArray.length > Short.MAX_VALUE) {
            throw new IllegalArgumentException("encoded string length (" + byArray.length + ") is not less than a short (32767)");
        }
        this.aG((short)byArray.length);
        this.dH(byArray);
    }

    public final void gW(String string) {
        byte[] byArray = BH.aP(string);
        if (byArray.length > 127) {
            throw new IllegalArgumentException("encoded string length (" + byArray.length + ") is not less than a byte (127)");
        }
        this.aF((byte)byArray.length);
        this.dH(byArray);
    }

    public final byte vD(int n) {
        if (n >= this.cRf) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.duU[n];
    }

    public final int bTc() {
        return this.cRf;
    }

    public final byte[] bTd() {
        return this.duU;
    }

    public final byte[] bTe() {
        if (this.duU.length == this.cRf) {
            return this.duU;
        }
        byte[] byArray = new byte[this.cRf];
        System.arraycopy(this.duU, 0, byArray, 0, this.cRf);
        return byArray;
    }

    private void vA(int n) {
        if (n > this.duV) {
            this.duV = n + this.duW;
            byte[] byArray = new byte[this.duV];
            System.arraycopy(this.duU, 0, byArray, 0, this.cRf);
            this.duU = byArray;
        }
    }

    public final void bTf() {
        Arrays.fill(this.duU, (byte)0);
        this.cRf = 0;
    }
}

