/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from cak
 */
public class cak_1 {
    private static final Logger lFL = Logger.getLogger(cak_1.class);
    public static final byte[] lFM = null;
    private final byte lFN;
    private final byte lFO;
    private final byte lFP;
    private final byte lFQ;
    private final boolean lFR;
    private final byte lFS;
    private final aeS lFT;
    private final byte[] lFU;
    private final int lFV;
    private final short lFW;

    cak_1(int n, byte by, byte by2, byte by3, byte by4, boolean bl, int n2, short s, byte by5, byte[] byArray) {
        this.lFN = by;
        this.lFO = by2;
        this.lFP = by3;
        this.lFQ = by4;
        this.lFR = bl;
        this.lFV = n2;
        this.lFW = s;
        this.lFT = aeT.sc(n);
        if (this.lFT == null) {
            lFL.error((Object)("l'element " + n + " n'a pas \u00e9t\u00e9 export\u00e9"));
        }
        this.lFS = by5;
        this.lFU = byArray;
    }

    public static cak_1 B(apl_1 apl_12) {
        int n = apl_12.aIA();
        byte by = apl_12.aIy();
        byte by2 = apl_12.aIy();
        byte by3 = apl_12.aIy();
        byte by4 = apl_12.aIy();
        boolean bl = apl_12.aIy() != 0;
        int n2 = apl_12.aIA();
        short s = apl_12.aIz();
        byte by5 = apl_12.aIy();
        boolean bl2 = apl_12.aIy() != 0;
        byte[] byArray = bl2 ? apl_12.mv(3) : lFM;
        return new cak_1(n, by, by2, by3, by4, bl, n2, s, by5, byArray);
    }

    public static byte[] a(int n, byte by, byte by2, byte by3, byte by4, boolean bl, int n2, short s, byte by5, byte[] byArray) {
        fs_0 fs_02 = new fs_0();
        fs_02.mz(n);
        fs_02.g(by);
        fs_02.g(by2);
        fs_02.g(by3);
        fs_02.g(by4);
        fs_02.g(bl ? (byte)1 : 0);
        fs_02.mz(n2);
        fs_02.k(s);
        fs_02.g(by5);
        if (Arrays.equals(byArray, lFM)) {
            fs_02.g((byte)0);
        } else {
            fs_02.g((byte)1);
            fs_02.di(byArray);
        }
        return fs_02.aKU();
    }

    public aeS eqX() {
        return this.lFT;
    }

    public byte eqY() {
        return this.lFN;
    }

    public byte eqZ() {
        return this.lFO;
    }

    public byte era() {
        return this.lFP;
    }

    public byte[] erb() {
        return this.lFU;
    }

    public byte erc() {
        return this.lFS;
    }

    public byte bcN() {
        return this.lFQ;
    }

    public boolean bsr() {
        return this.lFR;
    }

    public int bpp() {
        return this.lFV;
    }

    public short erd() {
        return this.lFW;
    }
}

