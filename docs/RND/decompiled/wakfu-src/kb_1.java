/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from KB
 */
public class kb_1
implements JH,
ki_1 {
    private final JG aOc = new JG();
    private final int[] aOd = new int[2];
    private boolean aNe;
    private boolean aNi;
    private boolean aNj;
    private byte aNk;
    private int aNl = 1;
    private int aNm = 771;

    @Override
    public JG aPi() {
        return this.aOc;
    }

    public int[] aQN() {
        return this.aOd;
    }

    public void F(int n, int n2) {
        this.aOd[0] = n;
        this.aOd[1] = n2;
    }

    public boolean aQM() {
        return this.aNe;
    }

    public void aC(boolean bl) {
        this.aNe = bl;
    }

    public boolean aQO() {
        return this.aNi;
    }

    public void aD(boolean bl) {
        this.aNi = bl;
    }

    public boolean aQP() {
        return this.aNj;
    }

    public void aE(boolean bl) {
        this.aNj = bl;
    }

    public byte aQQ() {
        return this.aNk;
    }

    public void n(byte by) {
        this.aNk = by;
    }

    public int aQR() {
        return this.aNl;
    }

    public void nk(int n) {
        this.aNl = n;
    }

    public int aQS() {
        return this.aNm;
    }

    public void nl(int n) {
        this.aNm = n;
    }

    public String toString() {
        return "EditableParticleSystem{" + String.valueOf(this.aOc) + ", m_duration=" + Arrays.toString(this.aOd) + ", m_geocentric=" + this.aNe + ", m_behindMobile=" + this.aNi + ", m_mustApplyNightColor=" + this.aNj + ", m_sortRadius=" + this.aNk + ", m_srcBlend=" + this.aNl + ", m_dstBlend=" + this.aNm + "}";
    }
}

