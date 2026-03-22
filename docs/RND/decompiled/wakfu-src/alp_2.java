/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from alp
 */
public class alp_2
implements alj_2 {
    private static final Logger cFk = Logger.getLogger(alp_2.class);
    private int cFl;
    private boolean cFm;
    private long[] cFa;
    private byte[] cFb;
    private float[] cFc;
    private float[] cFd;

    public alp_2(apl_1 apl_12) {
        this.a(apl_12);
    }

    public alp_2(int n, boolean bl, long[] lArray, byte[] byArray) {
        this.cFl = n;
        this.cFm = bl;
        this.cFa = lArray;
        this.cFb = byArray;
        int n2 = this.cFa.length;
        this.cFc = new float[n2];
        this.cFd = new float[n2];
        for (int i = 0; i < n2; ++i) {
            this.cFc[i] = 1.0f;
            this.cFd[i] = 1.0f;
        }
    }

    public alp_2(int n, boolean bl, long[] lArray, byte[] byArray, float[] fArray, float[] fArray2) {
        this.cFl = n;
        this.cFm = bl;
        this.cFa = lArray;
        this.cFb = byArray;
        this.cFc = fArray;
        this.cFd = fArray2;
    }

    @Override
    public void a(arj_2 arj_22, int n) {
        int n2 = GC.mR(this.cFa.length);
        long l = this.cFa[n2];
        if (!alu_1.c(arj_22, l)) {
            return;
        }
        if (!alu_1.gh(l)) {
            return;
        }
        if (this.cFc[n2] != this.cFd[n2]) {
            alu_1.a(arj_22, l, this.cFb[n2], GC.b(this.cFc[n2], this.cFd[n2]), (short)1, this.cFl, this.cFm, n);
        } else {
            alu_1.a(arj_22, l, this.cFb[n2], 1.0f, (short)1, this.cFl, this.cFm, n);
        }
    }

    @Override
    public int aeV() {
        return 6;
    }

    @Override
    public void a(apl_1 apl_12) {
        int n = apl_12.aIA();
        this.cFa = new long[n];
        this.cFb = new byte[n];
        this.cFc = new float[n];
        this.cFd = new float[n];
        for (int i = 0; i < n; ++i) {
            this.cFa[i] = apl_12.bFQ();
            this.cFb[i] = apl_12.aIy();
            if (!apl_12.bFS()) continue;
            this.cFc[i] = apl_12.aIB();
            this.cFd[i] = apl_12.aIB();
        }
        this.cFl = apl_12.aIA();
        this.cFm = apl_12.bFS();
    }

    @Override
    public void b(fs_0 fs_02) {
        int n = this.cFa != null ? this.cFa.length : 0;
        fs_02.mz(n);
        for (int i = 0; i < n; ++i) {
            fs_02.cq(this.cFa[i]);
            fs_02.g(this.cFb[i]);
            if (this.cFc[i] != this.cFd[i] || this.cFc[i] != 0.0f) {
                fs_02.ay(true);
                fs_02.b(this.cFc[i]);
                fs_02.b(this.cFd[i]);
                continue;
            }
            fs_02.ay(false);
        }
        fs_02.mz(this.cFl);
        fs_02.ay(this.cFm);
    }

    public void sT(int n) {
        this.cFl = n;
    }

    public void cA(boolean bl) {
        this.cFm = bl;
    }

    public void f(long[] lArray) {
        this.cFa = lArray;
    }

    public void dv(byte[] byArray) {
        this.cFb = byArray;
    }

    public void b(float[] fArray, float[] fArray2) {
        this.cFc = fArray;
        this.cFd = fArray2;
    }
}

