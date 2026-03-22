/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class WF
extends WH {
    private static final Logger bOP = Logger.getLogger(WF.class);
    private final byte[] bOQ = new byte[324];
    private final byte[] bOR = new byte[324];
    private final short[] bOS = new short[324];

    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        wt_0 wt_02 = wt_0Array[n3];
        wt_02.bap = n;
        wt_02.baq = n2;
        wt_02.ban = this.ban;
        wt_02.bNr = false;
        wt_02.aXR = 0;
        int n4 = this.aU(n, n2);
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
        return n4 * 18 + n3;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        wu_0 wu_02 = wu_0Array[n3];
        wu_02.bap = n;
        wu_02.baq = n2;
        wu_02.ban = this.ban;
        wu_02.bNr = false;
        wu_02.aXR = 0;
        return 1;
    }

    @Override
    public void a(apl_1 apl_12) {
        super.a(apl_12);
        for (int i = 0; i < 324; ++i) {
            this.bOQ[i] = apl_12.aIy();
            this.bOR[i] = apl_12.aIy();
            this.bOS[i] = apl_12.aIz();
        }
    }
}

