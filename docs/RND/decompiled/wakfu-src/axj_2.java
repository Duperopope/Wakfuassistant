/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from axj
 */
public final class axj_2
extends ayy_2 {
    public static final byte doU = 1;
    public static final byte doV = 2;
    public static final byte doW = 17;
    public static final byte doX = 18;
    private int brs;
    private int brt;
    private short doY;
    private short doZ;
    private acc_1 doE;
    private final int dpa;
    private axk_2 dpb;
    private byte[] ayE;
    private byte dpc = (byte)17;
    private awu_2 dpd;

    public axj_2(int n, int n2, short s, axk_2 axk_22, byte[] byArray) {
        this.brs = n;
        this.brt = n2;
        this.doE = new acc_1(this.brs, this.brt);
        this.dpa = s;
        this.dpb = axk_22;
        this.ayE = byArray;
    }

    public axj_2(short s, short s2, short s3, short s4, byte by, axk_2 axk_22, byte[] byArray) {
        this((int)s, (int)s2, (short)by, axk_22, byArray);
        this.doY = s3;
        this.doZ = s4;
    }

    public axj_2(int n, int n2, short s, axk_2 axk_22, ByteBuffer byteBuffer) {
        this.brs = n;
        this.brt = n2;
        this.doE = new acc_1(this.brs, this.brt);
        this.dpa = s;
        this.dpb = axk_22;
        this.ayE = new byte[byteBuffer.limit()];
        byteBuffer.get(this.ayE);
    }

    public axj_2(axj_2 axj_22) {
        this.brs = axj_22.brs;
        this.brt = axj_22.brt;
        this.doY = axj_22.doY;
        this.doZ = axj_22.doZ;
        this.dpc = axj_22.dpc;
        this.doE = new acc_1(this.brs, this.brt);
        this.dpa = axj_22.dpa;
        axk_2 axk_22 = this.dpb = axj_22.dpb != null ? new axk_2(axj_22.dpb) : null;
        if (axj_22.ayE != null) {
            this.ayE = new byte[axj_22.ayE.length];
            System.arraycopy(axj_22.ayE, 0, this.ayE, 0, this.ayE.length);
        } else {
            this.ayE = null;
        }
        if (axj_22.dpd != null) {
            this.dpd = new awu_2(axj_22.dpd);
        }
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    public acc_1 bQs() {
        return this.doE;
    }

    public short bQG() {
        return this.doY;
    }

    public short bQH() {
        return this.doZ;
    }

    public void A(short s, short s2) {
        this.doY = s;
        this.doZ = s2;
    }

    public int cj(int n, int n2) {
        assert (n < this.brs);
        assert (n2 < this.brt);
        if (this.dpa == 32) {
            int n3 = (n2 * this.brs + n) * 4;
            return this.ayE[n3 + 3] & 0xFF;
        }
        return 255;
    }

    public axb_2 ck(int n, int n2) {
        awx_2 awx_22 = this.cl(n, n2);
        if (this.dpc == 18 || this.dpc == 2) {
            awx_22.uX(awx_22.bPU());
        }
        return awx_22;
    }

    private awx_2 cl(int n, int n2) {
        assert (n < this.brs);
        assert (n2 < this.brt);
        int n3 = (n2 * this.brs + n) * ((this.dpa + 7) / 8);
        if (this.dpa == 32) {
            return new awx_2(this.ayE[n3], this.ayE[n3 + 1], this.ayE[n3 + 2], this.ayE[n3 + 3]);
        }
        if (this.dpa == 24) {
            return new awx_2(this.ayE[n3], this.ayE[n3 + 1], this.ayE[n3 + 2], -1);
        }
        if (this.dpa == 8) {
            return this.bQJ() ? this.dpb.vi(ayj_2.aD(this.ayE[n3])) : new awx_2(this.ayE[n3], this.ayE[n3], this.ayE[n3], -1);
        }
        if (this.dpa == 4) {
            return n3 % 2 == 0 ? this.dpb.vi((byte)(this.ayE[n3 / 2] & 0xF0) >> 4) : this.dpb.vi((byte)(this.ayE[n3 / 2] & 0xF));
        }
        return null;
    }

    public void a(int n, int n2, axb_2 axb_22) {
        assert (n < this.brs);
        assert (n2 < this.brt);
        int n3 = (n2 * this.brs + n) * ((this.dpa + 7) / 8);
        if (this.dpa == 32) {
            this.ayE[n3] = axb_22.bQf();
            this.ayE[n3 + 1] = axb_22.bQg();
            this.ayE[n3 + 2] = axb_22.bQh();
            this.ayE[n3 + 3] = axb_22.bQe();
        } else if (this.dpa == 24) {
            this.ayE[n3] = axb_22.bQf();
            this.ayE[n3 + 1] = axb_22.bQg();
            this.ayE[n3 + 2] = axb_22.bQh();
        } else assert (false) : "Unsupported color format";
    }

    public int bQI() {
        return this.dpa;
    }

    public byte[] aKU() {
        return this.ayE;
    }

    public boolean bQJ() {
        return this.dpb != null;
    }

    public void a(float f2, float f3, axi_2 axi_22) {
        int n = Math.round((float)this.brs * f2);
        int n2 = Math.round((float)this.brt * f3);
        assert (n > 0 && n2 > 0);
        int n3 = this.dpa >> 3;
        byte[] byArray = new byte[n * n2 * n3];
        if (axi_22 == null) {
            int n4 = (int)Math.ceil(1.0f / f2);
            int n5 = (int)Math.ceil(1.0f / f3);
            for (int i = 0; i < n2; ++i) {
                int n6 = (int)((float)i / f3);
                for (int j = 0; j < n; ++j) {
                    int n7 = (int)((float)j / f2);
                    for (int i2 = 0; i2 < n3; ++i2) {
                        byte by;
                        byArray[(i * n + j) * n3 + i2] = by = this.a(n4, n5, n7, n6, i2);
                    }
                }
            }
        } else {
            for (int i = 0; i < n2; ++i) {
                int n8 = (int)((float)i / f3);
                for (int j = 0; j < n; ++j) {
                    int n9 = (int)((float)j / f2);
                    for (int i3 = 0; i3 < n3; ++i3) {
                        byte by;
                        byArray[(i * n + j) * n3 + i3] = by = this.a(axi_22, n9, n8, i3);
                    }
                }
            }
        }
        this.brs = n;
        this.brt = n2;
        this.doE = new acc_1(this.brs, this.brt);
        this.ayE = byArray;
    }

    public void bQK() {
        this.ayE = null;
    }

    public void vh(int n) {
        this.dpd = new awu_2(this, n);
    }

    public awu_2 bQL() {
        return this.dpd;
    }

    public void a(byte[] byArray, byte by) {
        this.dpd = new awu_2(byArray, this.brs, by);
    }

    public void d(axj_2 axj_22) {
        assert (axj_22.brs <= this.brs && axj_22.brt <= this.brt) : "layer trop grand";
        assert (axj_22.dpa == this.dpa) : "Impossible de merger des layers de profondeur diff\u00e9rente";
        if (this.dpa != 32) {
            return;
        }
        for (int i = 0; i < axj_22.brs; ++i) {
            for (int j = 0; j < axj_22.brt; ++j) {
                int n = (j * this.brs + i) * ((this.dpa + 7) / 8);
                float f2 = (float)ayj_2.aD(axj_22.ayE[n + 3]) / 255.0f;
                if (f2 == 0.0f) continue;
                float f3 = (float)ayj_2.aD(this.ayE[n]) * (1.0f - f2) + (float)ayj_2.aD(axj_22.ayE[n]) * f2;
                float f4 = (float)ayj_2.aD(this.ayE[n + 1]) * (1.0f - f2) + (float)ayj_2.aD(axj_22.ayE[n + 1]) * f2;
                float f5 = (float)ayj_2.aD(this.ayE[n + 2]) * (1.0f - f2) + (float)ayj_2.aD(axj_22.ayE[n + 2]) * f2;
                float f6 = (float)ayj_2.aD(this.ayE[n + 3]) * (1.0f - f2) + (float)ayj_2.aD(axj_22.ayE[n + 3]);
                this.ayE[n] = (byte)Math.min(255.0f, f3);
                this.ayE[n + 1] = (byte)Math.min(255.0f, f4);
                this.ayE[n + 2] = (byte)Math.min(255.0f, f5);
                this.ayE[n + 3] = (byte)Math.min(255.0f, f6);
            }
        }
    }

    public void a(awz_2 awz_22) {
        assert (this.dpa == 32 || this.dpa == 24) : "Unsupported color format for this operation";
        byte by = this.dpc;
        for (int i = 0; i < this.brs; ++i) {
            for (int j = 0; j < this.brt; ++j) {
                byte by2;
                int n = (j * this.brs + i) * ((this.dpa + 7) / 8);
                byte by3 = this.ayE[n];
                byte by4 = this.ayE[n + 1];
                byte by5 = this.ayE[n + 2];
                byte by6 = by2 = this.dpa == 32 ? this.ayE[n + 3] : (byte)-1;
                if (!awz_22.a(by3, by4, by5, by2, by)) continue;
                awz_22.a(this.ayE, n, by);
            }
        }
    }

    public void bQM() {
        int n;
        int n2;
        axb_2[][] axb_2Array = new axb_2[this.brs][this.brt];
        for (n2 = 0; n2 < this.brs; ++n2) {
            for (n = 0; n < this.brt; ++n) {
                axb_2Array[n2][n] = this.cl(this.brs - n2 - 1, n);
            }
        }
        for (n2 = 0; n2 < this.brs; ++n2) {
            for (n = 0; n < this.brt; ++n) {
                this.a(n2, n, axb_2Array[n2][n]);
            }
        }
    }

    public void a(ByteBuffer byteBuffer, int n, int n2) {
        int n3 = GC.mV(n);
        int n4 = GC.mV(n2);
        int n5 = this.dpa / 8;
        if (this.ayE == null || this.ayE.length != n3 * n4 * n5) {
            this.ayE = new byte[n3 * n4 * n5];
        }
        int n6 = n * n5;
        int n7 = byteBuffer.capacity() / n6;
        byteBuffer.rewind();
        byte[] byArray = new byte[n6];
        int n8 = n3 * n5;
        int n9 = 0;
        for (int i = 0; i < n7; ++i) {
            byteBuffer.get(byArray, 0, n6);
            System.arraycopy(byArray, 0, this.ayE, n9, n6);
            n9 += n8;
        }
        this.brs = n;
        this.brt = n2;
        this.doE = new acc_1(n3, n4);
    }

    @Override
    protected void bLe() {
        this.ayE = null;
        this.dpc = 0;
        this.dpd = null;
        if (this.dpb != null) {
            this.dpb.bsI();
            this.dpb = null;
        }
    }

    private byte a(axi_2 axi_22, int n, int n2, int n3) {
        int n4 = this.dpa >> 3;
        int n5 = axi_22.bQF() / 2;
        float[] fArray = axi_22.bQE();
        float f2 = 0.0f;
        int n6 = -1;
        for (int i = 0; i < axi_22.bQF(); ++i) {
            int n7 = n2 + i - n5;
            if (n7 >= 0 && n7 <= this.brt) {
                int n8 = n7 * this.brs;
                for (int j = 0; j < axi_22.bQF(); ++j) {
                    int n9 = n + j - n5;
                    ++n6;
                    if (n9 < 0 || n9 > this.brs) continue;
                    float f3 = this.ayE[(n8 + n9) * n4 + n3] & 0xFF;
                    f2 += fArray[n6] * f3;
                }
                continue;
            }
            n6 += axi_22.bQF();
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 > 127.0f) {
            f2 -= 256.0f;
        }
        return (byte)f2;
    }

    private byte a(int n, int n2, int n3, int n4, int n5) {
        int n6 = this.dpa >> 3;
        float f2 = 1.0f / (float)(n * n2);
        float f3 = 0.0f;
        for (int i = 0; i < n2; ++i) {
            int n7 = n4 + i;
            if (n7 < 0 || n7 >= this.brt) continue;
            int n8 = n7 * this.brs;
            for (int j = 0; j < n; ++j) {
                int n9 = n3 + j;
                if (n9 < 0 || n9 >= this.brs) continue;
                float f4 = this.ayE[(n8 + n9) * n6 + n5] & 0xFF;
                f3 += f2 * f4;
            }
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f3 > 127.0f) {
            f3 -= 256.0f;
        }
        return (byte)f3;
    }

    private void a(byte[] byArray, azc_2<Integer> azc_22, byte by) {
        int n = azc_22.aTx();
        awx_2 awx_22 = this.dpb.vi(ayj_2.aD(by));
        byArray[n++] = awx_22.bQf();
        byArray[n++] = awx_22.bQg();
        byArray[n++] = awx_22.bQh();
        azc_22.L(n);
    }

    public byte bPK() {
        return this.dpc;
    }

    public void aC(byte by) {
        this.dpc = by;
    }
}

