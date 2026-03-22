/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class WI
extends WH {
    private static final Logger bOX = Logger.getLogger(WI.class);
    public static final byte bOY = 1;
    public static final byte bOZ = 2;
    private final byte[] bPa = new byte[324];
    private final byte[] bPb = new byte[324];
    private final short[] bPc = new short[324];
    private final short[] bPd = new short[324];
    private final byte[] bPe = new byte[324];
    private final byte[] bPf = new byte[324];

    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        wt_0 wt_02 = wt_0Array[n3];
        wt_02.bap = n;
        wt_02.baq = n2;
        int n4 = this.aU(n, n2);
        wt_02.ban = this.bPd[n4];
        wt_02.bNr = (this.bPf[n4] & 1) == 1;
        wt_02.aXR = this.bPe[n4];
        wt_02.bNP = this.bPa[n4];
        wt_02.bNQ = this.bPb[n4];
        wt_02.bNR = this.bPc[n4];
        return 1;
    }

    @Override
    public short aL(int n, int n2) {
        return this.bPc[this.aU(n, n2)];
    }

    private int aU(int n, int n2) {
        int n3 = n - this.bap;
        int n4 = n2 - this.baq;
        return n4 * 18 + n3;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        wu_0 wu_02 = wu_0Array[n3];
        wu_02.bap = n;
        wu_02.baq = n2;
        int n4 = this.aU(n, n2);
        wu_02.ban = this.bPd[n4];
        wu_02.bNr = (this.bPf[n4] & 2) == 2;
        wu_02.aXR = this.bPe[n4];
        return 1;
    }

    @Override
    public void a(apl_1 apl_12) {
        super.a(apl_12);
        for (int i = 0; i < 324; ++i) {
            this.bPa[i] = apl_12.aIy();
            this.bPb[i] = apl_12.aIy();
            this.bPc[i] = apl_12.aIz();
            this.bPd[i] = apl_12.aIz();
            this.bPe[i] = apl_12.aIy();
            this.bPf[i] = apl_12.aIy();
        }
    }
}

