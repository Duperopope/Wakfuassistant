/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUa
 */
public class fua_2 {
    private static final int vhr = 256;
    private static final int[] vhs = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, Short.MAX_VALUE, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    int vht = 0;
    byte[] dQZ = null;
    int vhu = 0;
    int vhv = 0;
    int vhw = 0;

    public void gHy() {
        this.dQZ = new byte[256];
        this.vht = 0;
        this.dQZ[0] = 0;
        this.vhw = 256;
    }

    public void fb(byte[] byArray) {
        for (byte by : byArray) {
            if (by == 0) break;
            this.hk(by, 8);
        }
    }

    public void l(byte[] byArray, int n) {
        int n2 = 0;
        while (n-- != 0) {
            byArray[n2++] = (byte)this.acn(8);
        }
    }

    void reset() {
        this.vht = 0;
        this.dQZ[0] = 0;
        this.vhv = 0;
        this.vhu = 0;
    }

    public void gHz() {
        this.dQZ = null;
    }

    public void m(byte[] byArray, int n) {
        this.f(byArray, 0, n);
    }

    public void f(byte[] byArray, int n, int n2) {
        this.vht = n;
        this.dQZ = byArray;
        this.vhv = 0;
        this.vhu = 0;
        this.vhw = n2;
    }

    public void hk(int n, int n2) {
        if (this.vhv + 4 >= this.vhw) {
            byte[] byArray = new byte[this.vhw + 256];
            System.arraycopy(this.dQZ, 0, byArray, 0, this.vhw);
            this.dQZ = byArray;
            this.vhw += 256;
        }
        n &= vhs[n2];
        int n3 = this.vht;
        this.dQZ[n3] = (byte)(this.dQZ[n3] | (byte)(n << this.vhu));
        if ((n2 += this.vhu) >= 8) {
            this.dQZ[this.vht + 1] = (byte)(n >>> 8 - this.vhu);
            if (n2 >= 16) {
                this.dQZ[this.vht + 2] = (byte)(n >>> 16 - this.vhu);
                if (n2 >= 24) {
                    this.dQZ[this.vht + 3] = (byte)(n >>> 24 - this.vhu);
                    if (n2 >= 32) {
                        this.dQZ[this.vht + 4] = this.vhu > 0 ? (byte)(n >>> 32 - this.vhu) : (byte)0;
                    }
                }
            }
        }
        this.vhv += n2 / 8;
        this.vht += n2 / 8;
        this.vhu = n2 & 7;
    }

    public int acl(int n) {
        int n2 = vhs[n];
        if (this.vhv + 4 >= this.vhw && this.vhv + ((n += this.vhu) - 1) / 8 >= this.vhw) {
            return -1;
        }
        int n3 = (this.dQZ[this.vht] & 0xFF) >>> this.vhu;
        if (n > 8) {
            n3 |= (this.dQZ[this.vht + 1] & 0xFF) << 8 - this.vhu;
            if (n > 16) {
                n3 |= (this.dQZ[this.vht + 2] & 0xFF) << 16 - this.vhu;
                if (n > 24) {
                    n3 |= (this.dQZ[this.vht + 3] & 0xFF) << 24 - this.vhu;
                    if (n > 32 && this.vhu != 0) {
                        n3 |= (this.dQZ[this.vht + 4] & 0xFF) << 32 - this.vhu;
                    }
                }
            }
        }
        return n2 & n3;
    }

    public int gHA() {
        if (this.vhv >= this.vhw) {
            return -1;
        }
        return this.dQZ[this.vht] >> this.vhu & 1;
    }

    public void acm(int n) {
        this.vht += (n += this.vhu) / 8;
        this.vhv += n / 8;
        this.vhu = n & 7;
    }

    public void gHB() {
        ++this.vhu;
        if (this.vhu > 7) {
            this.vhu = 0;
            ++this.vht;
            ++this.vhv;
        }
    }

    public int acn(int n) {
        int n2;
        int n3 = vhs[n];
        n += this.vhu;
        if (this.vhv + 4 >= this.vhw) {
            n2 = -1;
            if (this.vhv + (n - 1) / 8 >= this.vhw) {
                this.vht += n / 8;
                this.vhv += n / 8;
                this.vhu = n & 7;
                return n2;
            }
        }
        n2 = (this.dQZ[this.vht] & 0xFF) >>> this.vhu;
        if (n > 8) {
            n2 |= (this.dQZ[this.vht + 1] & 0xFF) << 8 - this.vhu;
            if (n > 16) {
                n2 |= (this.dQZ[this.vht + 2] & 0xFF) << 16 - this.vhu;
                if (n > 24) {
                    n2 |= (this.dQZ[this.vht + 3] & 0xFF) << 24 - this.vhu;
                    if (n > 32 && this.vhu != 0) {
                        n2 |= (this.dQZ[this.vht + 4] & 0xFF) << 32 - this.vhu;
                    }
                }
            }
        }
        this.vht += n / 8;
        this.vhv += n / 8;
        this.vhu = n & 7;
        return n2 &= n3;
    }

    public int aco(int n) {
        int n2;
        int n3 = 32 - n;
        n += this.vhu;
        if (this.vhv + 4 >= this.vhw) {
            n2 = -1;
            if (this.vhv * 8 + n > this.vhw * 8) {
                this.vht += n / 8;
                this.vhv += n / 8;
                this.vhu = n & 7;
                return n2;
            }
        }
        n2 = (this.dQZ[this.vht] & 0xFF) << 24 + this.vhu;
        if (n > 8) {
            n2 |= (this.dQZ[this.vht + 1] & 0xFF) << 16 + this.vhu;
            if (n > 16) {
                n2 |= (this.dQZ[this.vht + 2] & 0xFF) << 8 + this.vhu;
                if (n > 24) {
                    n2 |= (this.dQZ[this.vht + 3] & 0xFF) << this.vhu;
                    if (n > 32 && this.vhu != 0) {
                        n2 |= (this.dQZ[this.vht + 4] & 0xFF) >> 8 - this.vhu;
                    }
                }
            }
        }
        n2 = n2 >>> (n3 >> 1) >>> (n3 + 1 >> 1);
        this.vht += n / 8;
        this.vhv += n / 8;
        this.vhu = n & 7;
        return n2;
    }

    public int gHC() {
        if (this.vhv >= this.vhw) {
            int n = -1;
            ++this.vhu;
            if (this.vhu > 7) {
                this.vhu = 0;
                ++this.vht;
                ++this.vhv;
            }
            return n;
        }
        int n = this.dQZ[this.vht] >> this.vhu & 1;
        ++this.vhu;
        if (this.vhu > 7) {
            this.vhu = 0;
            ++this.vht;
            ++this.vhv;
        }
        return n;
    }

    public int gHD() {
        return this.vhv + (this.vhu + 7) / 8;
    }

    public int gHE() {
        return this.vhv * 8 + this.vhu;
    }

    public byte[] gHF() {
        return this.dQZ;
    }

    public static int acp(int n) {
        int n2 = 0;
        while (n > 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    public static void ww(String string) {
        System.err.println(string);
        System.exit(1);
    }
}

