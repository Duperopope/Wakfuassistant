/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from caX
 */
public class cax_1 {
    static final byte lHW = 6;
    static final byte lHX = 2;
    static final int lHY = 3;
    static final int lHZ = 9;
    private final TByteObjectHashMap<cay_1> lIa = new TByteObjectHashMap();

    public cax_1(short s, short s2) {
        ajo_0 ajo_02 = (ajo_0)adk.buy().x(s, s2);
        long l = ajo_02 != null ? ajo_02.chx() : 0L;
        long l2 = ajo_02 != null ? ajo_02.chy() : 0L;
        long l3 = ajo_02 != null ? ajo_02.chz() : 0L;
        long l4 = ajo_02 != null ? ajo_02.chA() : 0L;
        this.lIa.put(cbc_1.lIv.aJr(), (Object)new cay_1(l));
        this.lIa.put(cbc_1.lIw.aJr(), (Object)new cay_1(l2));
        this.lIa.put(cbc_1.lIx.aJr(), (Object)new cay_1(l3));
        this.lIa.put(cbc_1.lIy.aJr(), (Object)new cay_1(l4));
    }

    public byte b(byte by, int n, int n2) {
        cay_1 cay_12 = (cay_1)this.lIa.get(by);
        if (cay_12 == null) {
            return 0;
        }
        return cay_12.eo(n, n2);
    }

    public byte c(byte by, int n, int n2) {
        cay_1 cay_12 = (cay_1)this.lIa.get(by);
        if (cay_12 == null) {
            return 0;
        }
        return cay_12.ep(n, n2);
    }

    public boolean d(byte by, int n, int n2) {
        cay_1 cay_12 = (cay_1)this.lIa.get(by);
        return cay_12 != null && cay_12.eq(n, n2);
    }

    public boolean cU(byte by) {
        cay_1 cay_12 = (cay_1)this.lIa.get(by);
        return cay_12 != null && cay_12.erR();
    }

    static int Kr(int n) {
        return n / 9;
    }

    static int Ks(int n) {
        return n * 2 / 6;
    }

    static int ad(int n, int n2, int n3) {
        return n2 + n3 * n;
    }

    public static int Kt(int n) {
        return (int)Math.floor((double)n / 3.0);
    }

    public static int Ku(int n) {
        return (int)Math.floor((double)n / 9.0);
    }

    public static int Kv(int n) {
        return (int)(((double)n + 0.5) * 3.0);
    }

    public static int Kw(int n) {
        return (int)(((double)n + 0.5) * 9.0);
    }

    public static short Kx(int n) {
        return (short)Math.floor((double)n / 6.0);
    }

    public static short Ky(int n) {
        return (short)Math.floor((double)n / 2.0);
    }
}

