/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from far
 */
public abstract class far_0<T extends fsx_0>
implements fam_0 {
    private static final Logger rPn = Logger.getLogger(far_0.class);
    private final long rPo;
    private final int rPp;
    private final short rPq;
    private final short rPr;
    private final short rPs = 0;
    private int asA;
    private final fsy_0<T> rPt;
    private T rPu;

    protected far_0(fsy_0<T> fsy_02, long l, int n, int n2, short s, short s2) {
        this.rPt = fsy_02;
        this.rPo = l;
        this.rPp = n;
        this.rPq = s;
        this.rPr = s2;
        this.lP(n2);
    }

    protected far_0(fsy_0<T> fsy_02, ul_1 ul_12) {
        this(fsy_02, ul_12.adX.adP, ul_12.adX.adQ, ul_12.adX.adT, ul_12.adX.adR, ul_12.adX.adS);
    }

    protected far_0(fsy_0<T> fsy_02, fas_0 fas_02) {
        this(fsy_02, fas_02.Lx(), fas_02.erN().aIi(), fas_02.fRk(), fas_02.bsM(), fas_02.bsN());
    }

    @Override
    public boolean fRa() {
        return this.rPo <= 0L;
    }

    @Override
    public long ZC() {
        return this.rPo;
    }

    @Override
    public int fRb() {
        return this.rPp;
    }

    @Override
    public int azv() {
        return this.asA;
    }

    @Override
    public void lP(int n) {
        this.asA = n;
        if (!this.rPt.bgF()) {
            return;
        }
        this.dZe();
    }

    protected void dZe() {
        this.rPu = this.rPt.aag(this.conn());
    }

    @Override
    public int conn() {
        fbk_0 fbk_02 = this.erN();
        if (fbk_02 == null) {
            rPn.error((Object)("pas de d\u00e9finition de batiment " + this.rPp));
            return 0;
        }
        return fbk_02.Kp(this.asA);
    }

    @Override
    public fbk_0 erN() {
        return fbw_0.rSQ.eE((short)this.rPp);
    }

    @Override
    public short fRc() {
        return this.rPq;
    }

    @Override
    public short fRd() {
        return this.rPr;
    }

    public String toString() {
        return "EditorGroupInstanceInfo{m_buildingUid=" + this.rPo + ", m_buildingDefinitionId=" + this.rPp + ", m_itemId=" + this.asA + ", m_cellX=" + this.rPq + ", m_cellY=" + this.rPr + "}";
    }

    @Override
    public aci_1 fRe() {
        if (this.rPu == null) {
            return null;
        }
        return new aci_1(this.rPq, this.rPq + ((fsx_0)this.rPu).getWidth(), this.rPr, this.rPr + ((fsx_0)this.rPu).getHeight());
    }

    @Override
    public aci_1 fRf() {
        if (this.rPu == null) {
            return null;
        }
        return vz_0.i(this.rPq, this.rPr, ((fsx_0)this.rPu).getWidth(), ((fsx_0)this.rPu).getHeight());
    }

    public int cov() {
        fby_0 fby_02 = this.fRh();
        if (fby_02 == null) {
            rPn.error((Object)("pas d' entr\u00e9e pour " + String.valueOf(this)));
            return -1;
        }
        return fby_02.cov();
    }

    @Override
    public final int a(int n, int n2, wt_0[] wt_0Array, int n3) {
        if (this.rPu == null) {
            return 0;
        }
        short s = this.rPq;
        short s2 = this.rPr;
        boolean bl = false;
        int n4 = ((fsx_0)this.rPu).b(n - s, n2 - s2, wt_0Array, n3);
        for (int i = 0; i < n4; ++i) {
            wt_0Array[n3 + i].bap += s;
            wt_0Array[n3 + i].baq += s2;
            wt_0Array[n3 + i].ban = (short)(wt_0Array[n3 + i].ban + 0);
        }
        return n4;
    }

    @Override
    public int a(int n, int n2, wu_0[] wu_0Array, int n3) {
        if (this.rPu == null) {
            return 0;
        }
        short s = this.rPq;
        short s2 = this.rPr;
        boolean bl = false;
        int n4 = ((fsx_0)this.rPu).a(n - s, n2 - s2, wu_0Array, n3);
        for (int i = 0; i < n4; ++i) {
            wu_0Array[n3 + i].bap += s;
            wu_0Array[n3 + i].baq += s2;
            wu_0Array[n3 + i].ban = (short)(wu_0Array[n3 + i].ban + 0);
        }
        return n4;
    }

    @Override
    public boolean aq(int n, int n2) {
        if (this.rPu == null) {
            return false;
        }
        return ((fsx_0)this.rPu).aK(n - this.rPq, n2 - this.rPr);
    }

    @Override
    public boolean fH(int n, int n2) {
        if (this.rPu == null) {
            return false;
        }
        return ((fsx_0)this.rPu).fH(n - this.rPq, n2 - this.rPr);
    }

    @Override
    public boolean aJ(int n, int n2) {
        if (this.rPu == null) {
            return true;
        }
        return ((fsx_0)this.rPu).aJ(n - this.rPq, n2 - this.rPr);
    }

    @Override
    public boolean am(int n, int n2, int n3) {
        if (this.rPu == null) {
            return true;
        }
        return ((fsx_0)this.rPu).gA(n - this.rPq, n2 - this.rPr);
    }

    public T fRg() {
        return this.rPu;
    }

    @Override
    public boolean fI(int n, int n2) {
        if (this.rPu == null) {
            return false;
        }
        return ((fsx_0)this.rPu).fI(n - this.rPq, n2 - this.rPr);
    }

    @Override
    public fby_0 fRh() {
        return fbo_0.eD((short)this.rPp);
    }

    @Override
    public void f(azg_1 azg_12) {
        azg_12.gK(this.rPo);
        azg_12.aG((short)this.rPp);
        azg_12.vC(this.asA);
        azg_12.aG(this.rPq);
        azg_12.aG(this.rPr);
    }
}

