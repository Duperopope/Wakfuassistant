/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqI
 */
public class aqi_1
extends aqj_1 {
    static final int cQY = 756423;
    private final fs_0 cQZ = new fs_0(102400);

    public aqi_1(int n, int n2) {
        super(n, n2);
        this.cQZ.mz(n2 - 756423);
    }

    public byte[] aKU() {
        return this.cQZ.aKU();
    }

    public void close() {
        this.cQZ.close();
    }

    @Override
    public long bGF() {
        return this.cQZ.aKV();
    }

    public void cM(boolean bl) {
        this.bGQ();
        byte by = bl ? (byte)1 : 0;
        this.cQZ.g((byte)(by + this.cRa));
    }

    public void g(byte by) {
        this.bGQ();
        this.cQZ.g((byte)(by + this.cRa));
    }

    public void k(short s) {
        this.bGQ();
        this.cQZ.k((short)(s + this.cRa));
    }

    public void b(float f2) {
        this.bGQ();
        this.cQZ.b(f2);
    }

    public void mz(int n) {
        this.bGQ();
        this.cQZ.mz(n + this.cRa);
    }

    public void b(double d2) {
        this.bGQ();
        this.cQZ.b(d2);
    }

    public void cq(long l) {
        this.bGQ();
        this.cQZ.cq(l + (long)this.cRa);
    }

    public void fL(String string) {
        byte[] byArray = BH.aP(string);
        this.mz(byArray.length);
        this.cQZ.di(byArray);
    }

    public void dz(byte[] byArray) {
        if (byArray == null) {
            this.mz(0);
            return;
        }
        this.mz(byArray.length);
        for (int i = 0; i < byArray.length; ++i) {
            this.g(byArray[i]);
        }
    }

    public void q(int[] nArray) {
        if (nArray == null) {
            this.mz(0);
            return;
        }
        this.mz(nArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            this.mz(nArray[i]);
        }
    }

    public void l(short[] sArray) {
        if (sArray == null) {
            this.mz(0);
            return;
        }
        this.mz(sArray.length);
        for (int i = 0; i < sArray.length; ++i) {
            this.k(sArray[i]);
        }
    }

    public void C(float[] fArray) {
        if (fArray == null) {
            this.mz(0);
            return;
        }
        this.mz(fArray.length);
        for (int i = 0; i < fArray.length; ++i) {
            this.b(fArray[i]);
        }
    }

    public void m(String[] stringArray) {
        if (stringArray == null) {
            this.mz(0);
            return;
        }
        this.mz(stringArray.length);
        for (int i = 0; i < stringArray.length; ++i) {
            this.fL(stringArray[i]);
        }
    }

    public void g(long[] lArray) {
        if (lArray == null) {
            this.mz(0);
            return;
        }
        this.mz(lArray.length);
        for (int i = 0; i < lArray.length; ++i) {
            this.cq(lArray[i]);
        }
    }

    public void I(Object object) {
        ((aqk_1)object).a(this);
    }

    public byte bGP() {
        return this.cRa;
    }
}

