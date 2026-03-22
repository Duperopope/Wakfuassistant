/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from Ku
 */
public class ku_1
implements JH,
ki_1 {
    private final JG aNg = new JG();
    private final int[] aNh = new int[2];
    private boolean aNe;
    private boolean aNi;
    private boolean aNj;
    private byte aNk;
    private int aNl = 1;
    private int aNm = 771;
    private String p = "Particles System";
    private String aNf = "";
    private byte aNn = (byte)100;
    private byte aNo = 1;

    @Override
    public JG aPi() {
        return this.aNg;
    }

    public int[] aQN() {
        return this.aNh;
    }

    public void F(int n, int n2) {
        this.aNh[0] = n;
        this.aNh[1] = n2;
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

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public String getDescription() {
        return this.aNf;
    }

    public void cA(String string) {
        this.aNf = string;
    }

    public byte aQT() {
        return this.aNn;
    }

    public void o(byte by) {
        this.aNn = by;
    }

    public byte aQU() {
        return this.aNo;
    }

    public void p(byte by) {
        this.aNo = by;
    }

    public String toString() {
        return "EditableParticleSystem{" + String.valueOf(this.aNg) + ", m_duration=" + Arrays.toString(this.aNh) + ", m_geocentric=" + this.aNe + ", m_behindMobile=" + this.aNi + ", m_mustApplyNightColor=" + this.aNj + ", m_sortRadius=" + this.aNk + ", m_srcBlend=" + this.aNl + ", m_dstBlend=" + this.aNm + ", m_name='" + this.p + "', m_description='" + this.aNf + "', m_maxLevel=" + this.aNn + ", m_currentLevel=" + this.aNo + "}";
    }
}

