/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.Arrays;

public class VL {
    public static final int bKj = 16;
    private final short bKk;
    private final short[] bKl;
    private final byte[] bKm;

    public VL(VL vL) {
        this.bKk = vL.bKk;
        if (vL.bKl != null) {
            this.bKl = new short[vL.bKl.length];
            System.arraycopy(vL.bKl, 0, this.bKl, 0, vL.bKl.length);
        } else {
            this.bKl = null;
        }
        if (vL.bKm != null) {
            this.bKm = new byte[vL.bKm.length];
            System.arraycopy(vL.bKm, 0, this.bKm, 0, vL.bKm.length);
        } else {
            this.bKm = null;
        }
    }

    public VL(short s, short[] sArray, byte[] byArray) {
        this.bKk = s;
        this.bKl = sArray;
        this.bKm = byArray;
    }

    final int bkL() {
        return this.bKl.length;
    }

    short pY(int n) {
        return this.bKl[n];
    }

    public short pZ(int n) {
        int n2 = this.bKl.length;
        if (n2 == 1) {
            return this.bKl[0];
        }
        if (n2 > 16) {
            assert (false) : "ne devrait pas arriver, export foireux(?)";
            return this.bKk;
        }
        int n3 = 2;
        int n4 = 15;
        if (n2 <= 4) {
            n3 = 4;
            n4 = 3;
        }
        if (n2 <= 2) {
            n3 = 8;
            n4 = 1;
        }
        int n5 = n % n3 * (8 / n3);
        int n6 = (this.bKm[n / n3] & 0xFF) >>> n5 & n4;
        return this.bKl[n6];
    }

    public static VL a(TShortArrayList tShortArrayList, short[] sArray, short s) {
        int n = tShortArrayList.size();
        if (n == 1) {
            return new VL(s, tShortArrayList.toArray(), null);
        }
        int n2 = 2;
        if (n <= 4) {
            n2 *= 2;
        }
        if (n == 2) {
            n2 *= 2;
        }
        int n3 = (sArray.length + (n2 - 1)) / n2;
        byte[] byArray = new byte[n3];
        int n4 = 8 / n2;
        for (int i = 0; i < sArray.length; ++i) {
            int n5;
            byte by = (byte)tShortArrayList.indexOf(sArray[i]);
            int n6 = i % n2 * n4;
            int n7 = n5 = i / n2;
            byArray[n7] = (byte)(byArray[n7] | (by & 0xF) << n6);
        }
        return new VL(s, tShortArrayList.toArray(), byArray);
    }

    public void d(fs_0 fs_02) {
        int n = this.bKl.length;
        assert (n < 255);
        fs_02.g((byte)(n & 0xFF));
        for (int i = 0; i < n; ++i) {
            fs_02.k(this.bKl[i]);
        }
        if (n != 1) {
            fs_02.g((byte)(this.bKm.length & 0xFF));
            fs_02.di(this.bKm);
        }
    }

    public static VL a(apl_1 apl_12, short s) {
        byte[] byArray;
        int n = apl_12.aIy() & 0xFF;
        if (n == 0) {
            return null;
        }
        short[] sArray = apl_12.mw(n);
        if (n != 1) {
            int n2 = apl_12.aIy() & 0xFF;
            byArray = apl_12.mv(n2);
        } else {
            byArray = null;
        }
        return new VL(s, sArray, byArray);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof VL)) {
            return false;
        }
        VL vL = (VL)object;
        return (this.bKl == null ? vL.bKl == null : Arrays.equals(this.bKl, vL.bKl)) && (this.bKm == null ? vL.bKm == null : Arrays.equals(this.bKm, vL.bKm));
    }
}

