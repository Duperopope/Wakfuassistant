/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

public class WK
extends WH {
    private static final Logger bPk = Logger.getLogger(WK.class);
    private static final TIntArrayList bPl = new TIntArrayList(32);
    private static final Object bPm = new Object();
    private static final byte bPn = 1;
    private static final byte bPo = 2;
    public static final int bPp = 1;
    private byte[] bOQ;
    private byte[] bOR;
    private short[] bOS;
    private byte[] bPf;
    private short[] bPd;
    private byte[] bPe;
    private long[] bPi;
    private int[] bPq;

    public final boolean aV(int n, int n2) {
        int n3 = this.aU(n, n2);
        if (n3 == 0) {
            return false;
        }
        return (this.bPf[n3 - 1] & 1) == 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        assert (this.a(n, n2, wt_0Array));
        int n4 = this.aU(n, n2);
        if (n4 != 0) {
            wt_0 wt_02 = wt_0Array[n3];
            wt_02.bap = n;
            wt_02.baq = n2;
            this.a(wt_02, n4 - 1);
            return 1;
        }
        Object object = bPm;
        synchronized (object) {
            TIntArrayList tIntArrayList = this.a(n - this.bap, n2 - this.baq, bPl);
            int n5 = tIntArrayList.size();
            for (int i = 0; i < n5; ++i) {
                wt_0 wt_03 = wt_0Array[n3 + i];
                wt_03.bap = n;
                wt_03.baq = n2;
                this.a(wt_03, tIntArrayList.getQuick(i));
            }
            return n5;
        }
    }

    @Override
    public short aL(int n, int n2) {
        int n3 = this.aU(n, n2);
        if (n3 >= this.bOS.length) {
            return 0;
        }
        return this.bOS[n3];
    }

    private void a(wt_0 wt_02, int n) {
        wt_02.ban = this.bPd[n];
        wt_02.bNr = (this.bPf[n] & 1) == 1;
        wt_02.aXR = this.bPe[n];
        wt_02.bNP = this.bOQ[n];
        wt_02.bNQ = this.bOR[n];
        wt_02.bNR = this.bOS[n];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        assert (this.a(n, n2, wu_0Array));
        int n4 = this.aU(n, n2);
        if (n4 != 0) {
            wu_0 wu_02 = wu_0Array[n3];
            wu_02.bap = n;
            wu_02.baq = n2;
            this.a(wu_02, n4 - 1);
            return 1;
        }
        Object object = bPm;
        synchronized (object) {
            TIntArrayList tIntArrayList = this.a(n - this.bap, n2 - this.baq, bPl);
            int n5 = tIntArrayList.size();
            for (int i = 0; i < n5; ++i) {
                wu_0 wu_03 = wu_0Array[n3 + i];
                wu_03.bap = n;
                wu_03.baq = n2;
                this.a(wu_03, tIntArrayList.getQuick(i));
            }
            return n5;
        }
    }

    private void a(wu_0 wu_02, int n) {
        wu_02.ban = this.bPd[n];
        wu_02.bNr = (this.bPf[n] & 2) == 2;
        wu_02.aXR = this.bPe[n];
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
        int n3 = apl_12.aIz() & 0xFFFF;
        this.bPq = apl_12.mx(n3);
    }

    private int aU(int n, int n2) {
        int n3 = n - this.bap;
        int n4 = n2 - this.baq;
        int n5 = n4 * this.bmm() + n3;
        return WD.a(this.bPi, n5, this.bOQ.length + 1);
    }

    private TIntArrayList a(int n, int n2, TIntArrayList tIntArrayList) {
        tIntArrayList.reset();
        for (int n3 : this.bPq) {
            int n4 = n3 >> 8 & 0xFF;
            if (n4 < n2) continue;
            if (n4 > n2) break;
            int n5 = n3 & 0xFF;
            if (n5 < n) continue;
            if (n5 > n) break;
            int n6 = n3 >> 16 & 0xFFFF;
            tIntArrayList.add(n6);
        }
        assert (tIntArrayList.size() != 1) : "nombre de z incorrect";
        return tIntArrayList;
    }
}

