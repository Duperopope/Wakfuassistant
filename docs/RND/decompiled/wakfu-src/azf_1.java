/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azf
 */
public class azf_1 {
    private int btZ;
    private byte[] ayE;

    public azf_1(int n) {
        this.ayE = new byte[n / 8 + 1];
        this.btZ = 0;
    }

    public void dy(boolean bl) {
        this.vA(1);
        int n = this.btZ / 8;
        int n2 = this.btZ % 8;
        if (bl) {
            int n3 = n;
            this.ayE[n3] = (byte)(this.ayE[n3] | 1 << n2);
        } else {
            int n4 = n;
            this.ayE[n4] = (byte)(this.ayE[n4] & ~(1 << n2));
        }
        ++this.btZ;
    }

    public void aE(byte by) {
        this.vA(8);
        for (int i = 0; i < 8; ++i) {
            int n = this.btZ / 8;
            int n2 = this.btZ % 8;
            int n3 = n;
            this.ayE[n3] = (byte)(this.ayE[n3] + ((by >> i & 1) << n2));
            ++this.btZ;
        }
    }

    public void aF(short s) {
        this.vA(16);
        for (int i = 0; i < 16; ++i) {
            int n = this.btZ / 8;
            int n2 = this.btZ % 8;
            int n3 = n;
            this.ayE[n3] = (byte)(this.ayE[n3] + ((s >> i & 1) << n2));
            ++this.btZ;
        }
    }

    public void vz(int n) {
        this.vA(32);
        for (int i = 0; i < 32; ++i) {
            int n2 = this.btZ / 8;
            int n3 = this.btZ % 8;
            int n4 = n2;
            this.ayE[n4] = (byte)(this.ayE[n4] + ((n >> i & 1) << n3));
            ++this.btZ;
        }
    }

    public void q(long l, int n) {
        this.vA(n);
        for (int i = 0; i < n; ++i) {
            int n2 = this.btZ / 8;
            int n3 = this.btZ % 8;
            int n4 = n2;
            this.ayE[n4] = (byte)((long)this.ayE[n4] + ((l >> i & 1L) << n3));
            ++this.btZ;
        }
    }

    public void vA(int n) {
        int n2 = this.btZ + n - this.ayE.length * 8;
        if (n2 > 0) {
            int n3 = (int)Math.ceil((float)n2 / 8.0f);
            int n4 = this.ayE.length;
            byte[] byArray = new byte[n4 + n3];
            System.arraycopy(this.ayE, 0, byArray, 0, n4);
            this.ayE = byArray;
        }
    }

    public void a(azf_1 azf_12) {
        this.vA(azf_12.bTa());
        for (int i = 0; i < azf_12.bTa(); ++i) {
            int n = this.btZ / 8;
            int n2 = this.btZ % 8;
            int n3 = n;
            this.ayE[n3] = (byte)(this.ayE[n3] + (azf_12.vB(i) << n2));
            ++this.btZ;
        }
    }

    public int vB(int n) {
        int n2 = n / 8;
        int n3 = n % 8;
        return this.ayE[n2] >> n3;
    }

    public int bTa() {
        return this.btZ;
    }

    public int bTb() {
        return (int)Math.ceil((float)this.btZ / 8.0f);
    }

    public byte[] bFW() {
        return this.ayE;
    }
}

