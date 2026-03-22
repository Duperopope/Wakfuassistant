/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import lombok.Generated;
import org.apache.log4j.Logger;

/*
 * Renamed from als
 */
public class als_1
implements alj_2 {
    private static final Logger cFr = Logger.getLogger(als_1.class);
    private boolean cFm;
    private long[] cFa;
    private byte[] cFb;
    private float[] cFc;
    private float[] cFd;

    public als_1() {
    }

    public als_1(apl_1 apl_12) {
        this.a(apl_12);
    }

    public als_1(boolean bl, long[] lArray, byte[] byArray) {
        this.cFm = bl;
        this.cFa = lArray;
        this.cFb = byArray;
        int n = this.cFa.length;
        this.cFc = new float[n];
        this.cFd = new float[n];
        for (int i = 0; i < n; ++i) {
            this.cFc[i] = 1.0f;
            this.cFd[i] = 1.0f;
        }
    }

    public als_1(boolean bl, long[] lArray, byte[] byArray, float[] fArray, float[] fArray2) {
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
        alu_1.a(arj_22, l, (float)this.cFb[n2], GC.b(this.cFc[n2], this.cFd[n2]), (short)1, this.cFm, n);
    }

    @Override
    public int aeV() {
        return 4;
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
        fs_02.ay(this.cFm);
    }

    @Generated
    public boolean bBY() {
        return this.cFm;
    }

    @Generated
    public long[] bBO() {
        return this.cFa;
    }

    @Generated
    public byte[] bBP() {
        return this.cFb;
    }

    @Generated
    public float[] bBT() {
        return this.cFc;
    }

    @Generated
    public float[] bBS() {
        return this.cFd;
    }

    @Generated
    public void cA(boolean bl) {
        this.cFm = bl;
    }

    @Generated
    public void f(long[] lArray) {
        this.cFa = lArray;
    }

    @Generated
    public void dv(byte[] byArray) {
        this.cFb = byArray;
    }

    @Generated
    public void B(float[] fArray) {
        this.cFc = fArray;
    }

    @Generated
    public void A(float[] fArray) {
        this.cFd = fArray;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof als_1)) {
            return false;
        }
        als_1 als_12 = (als_1)object;
        if (!als_12.C(this)) {
            return false;
        }
        if (this.bBY() != als_12.bBY()) {
            return false;
        }
        if (!Arrays.equals(this.bBO(), als_12.bBO())) {
            return false;
        }
        if (!Arrays.equals(this.bBP(), als_12.bBP())) {
            return false;
        }
        if (!Arrays.equals(this.bBT(), als_12.bBT())) {
            return false;
        }
        return Arrays.equals(this.bBS(), als_12.bBS());
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof als_1;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.bBY() ? 79 : 97);
        n2 = n2 * 59 + Arrays.hashCode(this.bBO());
        n2 = n2 * 59 + Arrays.hashCode(this.bBP());
        n2 = n2 * 59 + Arrays.hashCode(this.bBT());
        n2 = n2 * 59 + Arrays.hashCode(this.bBS());
        return n2;
    }

    @Generated
    public String toString() {
        return "PlayRandomSoundData(m_stopOnAnimationChange=" + this.bBY() + ", m_soundIds=" + Arrays.toString(this.bBO()) + ", m_gains=" + Arrays.toString(this.bBP()) + ", m_minPitchs=" + Arrays.toString(this.bBT()) + ", m_maxPitchs=" + Arrays.toString(this.bBS()) + ")";
    }
}

