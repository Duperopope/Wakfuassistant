/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class WJ
extends WH {
    private static final Logger bPh = Logger.getLogger(WJ.class);
    private byte[] bOQ;
    private byte[] bOR;
    private short[] bOS;
    private byte[] bPf;
    private short[] bPd;
    private byte[] bPe;
    private long[] bPi;

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
        wt_02.bNP = this.bOQ[n4];
        wt_02.bNQ = this.bOR[n4];
        wt_02.bNR = this.bOS[n4];
        return 1;
    }

    @Override
    public short aL(int n, int n2) {
        return this.bOS[this.aU(n, n2)];
    }

    private int aU(int n, int n2) {
        int n3 = n - this.bap;
        int n4 = n2 - this.baq;
        int n5 = n4 * 18 + n3;
        return WD.a(this.bPi, n5, this.bOQ.length);
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
        int n;
        super.a(apl_12);
        int n2 = apl_12.aIy() & 0xFF;
        this.bOQ = new byte[n2];
        this.bOR = new byte[n2];
        this.bOS = new short[n2];
        this.bPd = new short[n2];
        this.bPe = new byte[n2];
        this.bPf = new byte[n2];
        for (n = 0; n < n2; ++n) {
            this.bOQ[n] = apl_12.aIy();
            this.bOR[n] = apl_12.aIy();
            this.bOS[n] = apl_12.aIz();
            this.bPd[n] = apl_12.aIz();
            this.bPe[n] = apl_12.aIy();
            this.bPf[n] = apl_12.aIy();
        }
        n = apl_12.aIy() & 0xFF;
        this.bPi = WD.a(this.bPi, n, apl_12);
    }
}

