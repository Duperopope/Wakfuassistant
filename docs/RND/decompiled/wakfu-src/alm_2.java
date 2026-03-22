/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from alm
 */
public class alm_2 {
    private long[] cFa;
    private byte[] cFb;
    private float[] cFc;
    private float[] cFd;
    private boolean cDy;
    private int cDx;
    private int cDw;
    private boolean cFe;
    private int bSr;

    public alm_2() {
    }

    public alm_2(apl_1 apl_12) {
        this.a(apl_12);
    }

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
        this.cDy = apl_12.bFS();
        this.cDx = apl_12.aIA();
        this.cDw = apl_12.aIA();
        this.cFe = apl_12.bFS();
        this.bSr = apl_12.aIA();
    }

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
        fs_02.ay(this.cDy);
        fs_02.mz(this.cDx);
        fs_02.mz(this.cDw);
        fs_02.ay(this.cFe);
        fs_02.mz(this.bSr);
    }

    public long[] bBO() {
        return this.cFa;
    }

    public byte[] bBP() {
        return this.cFb;
    }

    public boolean bBD() {
        return this.cDy;
    }

    public int bBG() {
        return this.cDx;
    }

    public int bBF() {
        return this.cDw;
    }

    public boolean bBQ() {
        return this.cFe;
    }

    public int bBR() {
        return this.bSr;
    }

    public void sO(int n) {
        this.bSr = n;
    }

    public void f(long[] lArray) {
        this.cFa = lArray;
    }

    public void dv(byte[] byArray) {
        this.cFb = byArray;
    }

    public void cy(boolean bl) {
        this.cDy = bl;
    }

    public void sP(int n) {
        this.cDx = n;
    }

    public void sQ(int n) {
        this.cDw = n;
    }

    public void cz(boolean bl) {
        this.cFe = bl;
    }

    public void A(float[] fArray) {
        this.cFd = fArray;
    }

    public float[] bBS() {
        return this.cFd;
    }

    public void B(float[] fArray) {
        this.cFc = fArray;
    }

    public float[] bBT() {
        return this.cFc;
    }

    public boolean bBU() {
        if (this.cFa == null) {
            return this.cFb == null;
        }
        return this.bBP().length == this.bBO().length;
    }

    public boolean bBV() {
        if (this.cFa == null) {
            return this.cFc == null;
        }
        if (this.cFc == null) {
            return false;
        }
        return this.bBT().length == this.bBO().length;
    }

    public boolean bBW() {
        if (this.cFa == null) {
            return this.cFd == null;
        }
        if (this.cFd == null) {
            return false;
        }
        return this.bBS().length == this.bBS().length;
    }
}

