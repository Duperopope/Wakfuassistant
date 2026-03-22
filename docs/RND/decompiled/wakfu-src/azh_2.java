/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

/*
 * Renamed from azh
 */
public final class azh_2 {
    private static final int duX = 8;
    private static final int duY = 3;
    private byte[] duZ;

    private azh_2() {
    }

    public azh_2(azh_2 azh_22) {
        this.duZ = new byte[azh_22.duZ.length];
        System.arraycopy(azh_22.duZ, 0, this.duZ, 0, this.duZ.length);
    }

    public azh_2(int n) {
        this.duZ = new byte[azh_2.vG(n)];
    }

    public azh_2(int n, boolean bl) {
        this.duZ = new byte[azh_2.vG(n)];
        this.dA(bl);
    }

    public final boolean vE(int n) {
        return azh_2.i(this.duZ, n);
    }

    public final void j(int n, boolean bl) {
        azh_2.a(this.duZ, n, bl);
    }

    public final void dA(boolean bl) {
        if (bl) {
            for (int i = 0; i < this.duZ.length; ++i) {
                this.duZ[i] = -1;
            }
        } else {
            for (int i = 0; i < this.duZ.length; ++i) {
                this.duZ[i] = 0;
            }
        }
    }

    private void ub(int n) {
        assert (n >= this.duZ.length * 8) : "loosing data in BitSet (oldSize=" + this.duZ.length + " newSize=" + n + ")";
        byte[] byArray = new byte[(n + 7) / 8];
        System.arraycopy(this.duZ, 0, byArray, 0, this.duZ.length);
        this.duZ = byArray;
    }

    public final int bTg() {
        return this.duZ.length * 8;
    }

    private static byte vF(int n) {
        assert (n < 8) : "bit index should be < 8 , found : " + n;
        return (byte)(1 << n);
    }

    public final byte[] bTh() {
        return this.duZ;
    }

    public final void d(OutputStream outputStream) {
        outputStream.write(this.duZ);
    }

    public static azh_2 e(byte[] byArray, int n, int n2) {
        azh_2 azh_22 = new azh_2();
        azh_22.duZ = new byte[n2];
        System.arraycopy(byArray, n, azh_22.duZ, 0, n2);
        return azh_22;
    }

    public static azh_2 dI(byte[] byArray) {
        azh_2 azh_22 = new azh_2();
        azh_22.duZ = byArray;
        return azh_22;
    }

    public static boolean i(byte[] byArray, int n) {
        assert (n >> 3 < byArray.length) : "trying to get a bit index=" + n + " but only " + byArray.length * 8 + " available.";
        int n2 = n >> 3;
        int n3 = 7 - (n - (n2 << 3));
        return (byArray[n2] & azh_2.vF(n3)) != 0;
    }

    public static void a(byte[] byArray, int n, boolean bl) {
        assert (n >> 3 < byArray.length) : "trying to set a bit index=" + n + " but only " + byArray.length * 8 + " available.";
        int n2 = n >> 3;
        int n3 = 7 - (n - (n2 << 3));
        if (bl) {
            int n4 = n2;
            byArray[n4] = (byte)(byArray[n4] | azh_2.vF(n3));
        } else {
            int n5 = n2;
            byArray[n5] = (byte)(byArray[n5] & ~azh_2.vF(n3));
        }
    }

    public static int vG(int n) {
        return n + 7 >> 3;
    }
}

