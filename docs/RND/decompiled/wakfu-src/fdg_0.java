/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from fdG
 */
public class fdg_0
implements SH {
    private final int rXc;
    private final int rXd;
    private final abi_1 rXe;
    private final int[] rXf;
    private final short rXg;
    private final ang_2 rXh;
    private final int rXi;
    private final short rXj;
    private final int rXk;
    private final short rXl;
    private final boolean rXm;
    private final short rXn;
    private final boolean rXo;
    private boolean rXp;
    private frl_0 rXq;
    private boolean lZb;
    private int iMR;
    private final int rXr;

    public boolean fTI() {
        return this.rXo;
    }

    public boolean fTJ() {
        return this.rXp;
    }

    public int clf() {
        return this.rXd;
    }

    public int bBE() {
        return this.rXi;
    }

    public short cyf() {
        return this.rXj;
    }

    public int fTK() {
        return this.rXk;
    }

    public short fTL() {
        return this.rXl;
    }

    public boolean cmN() {
        return this.rXm;
    }

    public short fTM() {
        return this.rXn;
    }

    public fdg_0(int n, int n2, int n3, int n4, int n5, short s, abi_1 abi_12, ang_2 ang_22, int n6, short s2, int n7, short s3, boolean bl, short s4, boolean bl2, int n8) {
        this.rXc = n;
        this.rXd = n2;
        this.rXe = abi_12;
        this.rXf = new int[]{n3, n4, n5};
        this.rXg = s;
        this.rXh = ang_22;
        this.rXi = n6;
        this.rXj = s2;
        this.rXk = n7;
        this.rXl = s3;
        this.rXm = bl;
        this.rXn = s4;
        this.rXo = bl2;
        this.iMR = 2;
        this.rXr = n8;
    }

    public fdg_0(fdg_0 fdg_02) {
        this.rXc = fdg_02.rXc;
        this.rXd = fdg_02.rXd;
        this.rXe = fdg_02.rXe;
        this.rXf = Arrays.copyOf(fdg_02.rXf, fdg_02.rXf.length);
        this.rXg = fdg_02.rXg;
        this.rXh = fdg_02.rXh;
        this.rXi = fdg_02.rXi;
        this.rXj = fdg_02.rXj;
        this.rXk = fdg_02.rXk;
        this.rXl = fdg_02.rXl;
        this.rXm = fdg_02.rXm;
        this.rXn = fdg_02.rXn;
        this.rXo = fdg_02.rXo;
        this.iMR = fdg_02.iMR;
        this.lZb = fdg_02.lZb;
        this.rXr = fdg_02.rXr;
    }

    public int[] fTN() {
        return this.rXf;
    }

    public short bdL() {
        return this.rXg;
    }

    public abi_1 bcB() {
        return this.rXe;
    }

    @Override
    public int d() {
        return this.rXc;
    }

    @Override
    public ang_2 bdo() {
        return this.rXh;
    }

    @Override
    public short bdn() {
        return 100;
    }

    public void b(frl_0 frl_02) {
        this.rXp = true;
        this.rXq = frl_02;
    }

    public void mT(boolean bl) {
        this.rXp = bl;
    }

    public boolean fTO() {
        return this.rXp;
    }

    public frl_0 fTP() {
        return this.rXq;
    }

    public boolean fTQ() {
        return this.lZb;
    }

    public void jo(boolean bl) {
        this.lZb = bl;
    }

    public int GN() {
        return this.iMR;
    }

    public void Kl(int n) {
        this.iMR = n;
    }

    public int cyj() {
        return this.rXr;
    }

    public String toString() {
        return "Exit{m_id=" + this.rXc + ", m_direction=" + String.valueOf(this.rXe) + ", m_destination=" + Arrays.toString(this.rXf) + ", m_worldId=" + this.rXg + "}";
    }
}

