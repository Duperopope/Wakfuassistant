/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public class ewe {
    private static final Logger oxX = Logger.getLogger(ewe.class);
    public static final short oxY = -1;
    public static final int oxZ = 0;
    public static final int oya = (int)Math.ceil(40.5);
    private final byte[] oyb;
    private final int[] oyc;

    public ewe() {
        this(new byte[oya], null);
    }

    public ewe(byte[] byArray, int[] nArray) {
        assert (byArray.length == oya);
        this.oyb = byArray;
        this.oyc = nArray;
    }

    public ewe(ewe ewe2) {
        this.oyb = (byte[])ewe2.oyb.clone();
        this.oyc = ewe2.oyc == null ? null : (int[])ewe2.oyc.clone();
    }

    public boolean a(byte by, byte by2, short s) {
        boolean bl;
        assert (by >= 0 && by < 18);
        assert (by2 >= 0 && by2 < 18);
        int n = by + by2 * 18;
        int n2 = 128 >> n % 8;
        boolean bl2 = bl = (this.oyb[n / 8] & n2) != 0;
        if (this.oyc == null || !bl) {
            return bl;
        }
        int n3 = ewe.b(by, by2, s);
        if (this.oyc.length < 16) {
            return ArrayUtils.contains((int[])this.oyc, (int)n3);
        }
        return Arrays.binarySearch(this.oyc, n3) >= 0;
    }

    public static int b(byte by, byte by2, short s) {
        return by | by2 << 8 | s << 16;
    }

    public static void a(ewe ewe2, fs_0 fs_02) {
        if (ewe2 == null) {
            fs_02.k((short)-1);
            return;
        }
        int n = ewe2.oyc == null ? 0 : ewe2.oyc.length;
        fs_02.k((short)n);
        fs_02.di(ewe2.oyb);
        if (n != 0) {
            for (int i = 0; i < n; ++i) {
                fs_02.mz(ewe2.oyc[i]);
            }
        }
    }

    public static ewe H(apl_1 apl_12) {
        int[] nArray;
        int n = apl_12.aIz();
        if (n == -1) {
            return null;
        }
        byte[] byArray = apl_12.mv(oya);
        if (n == 0) {
            nArray = null;
        } else {
            nArray = new int[n];
            for (int i = 0; i < n; ++i) {
                nArray[i] = apl_12.aIA();
            }
        }
        return new ewe(byArray, nArray);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ewe ewe2 = (ewe)object;
        return this.a(ewe2);
    }

    public boolean a(ewe ewe2) {
        return Arrays.equals(this.oyb, ewe2.oyb) && Arrays.equals(this.oyc, ewe2.oyc);
    }
}

