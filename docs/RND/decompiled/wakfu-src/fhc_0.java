/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fhC
 */
public abstract class fhc_0
implements ffj {
    private int o;
    private short spe;
    private int ciZ;
    private int elH;
    private int elI;
    private final azl_2<enk_0> spf;
    private short ejt;
    private final EnumMap<ffj_0, ang_2> spg = new EnumMap(ffj_0.class);
    private fhy_0 jhS;
    protected short sph;
    private boolean spi;
    private boolean spj;
    private byte elM;
    private byte elN;
    private byte spk;
    private int elP;
    private int elQ;
    private boolean elR;
    private boolean elS;
    private boolean spl;
    private boolean spm;
    private fgj iBi;
    private fgp_0 spn;
    private fgW sfp = fgW.smf;
    private float spo;
    private float spp;
    private final EnumSet<fgg_0> spq = EnumSet.noneOf(fgg_0.class);
    private boolean spr;
    protected fgl_0 sps;
    private fhp_0 iUB;
    private fhg_0 jSo;
    private byte emb;
    private byte emc;
    private fgl spt;

    protected fhc_0() {
        this.spf = new azl_2();
    }

    void lK(int n) {
        this.o = n;
    }

    void eZ(short s) {
        this.spe = s;
    }

    void CV(int n) {
        this.ciZ = n;
    }

    void Vm(int n) {
        this.elH = n;
    }

    void Vn(int n) {
        this.elI = n;
    }

    void bw(short s) {
        this.ejt = s;
    }

    void h(fhy_0 fhy_02) {
        this.i(fhy_02);
        this.jhS = fhy_02;
    }

    void M(Map<ffj_0, ang_2> map) {
        this.spg.putAll(map);
    }

    void fa(short s) {
        this.sph = (short)Math.max(1, s);
    }

    void gr(byte by) {
        this.elM = by;
    }

    void gs(byte by) {
        this.elN = by;
    }

    void gt(byte by) {
        this.spk = by;
    }

    void Vo(int n) {
        this.elP = n;
    }

    void Vp(int n) {
        this.elQ = n;
    }

    void ng(boolean bl) {
        this.elR = bl;
    }

    void nh(boolean bl) {
        this.elS = bl;
    }

    void ni(boolean bl) {
        this.spl = bl;
    }

    void nj(boolean bl) {
        this.spm = bl;
    }

    void g(fgj fgj2) {
        this.iBi = fgj2;
    }

    void a(fgW fgW2) {
        this.sfp = fgW2;
    }

    void a(fgp_0 fgp_02) {
        this.spn = fgp_02;
    }

    void a(fhp_0 fhp_02) {
        this.iUB = fhp_02;
    }

    void b(fhg_0 fhg_02) {
        this.jSo = fhg_02;
    }

    void gu(byte by) {
        this.emb = by;
    }

    void gv(byte by) {
        this.emc = by;
    }

    public void eZ(float f2) {
        this.spo = f2;
    }

    public void fa(float f2) {
        this.spp = f2;
    }

    public void b(fgl fgl2) {
        this.spt = fgl2;
    }

    public final void i(fhy_0 fhy_02) {
        if (fhy_02 == null) {
            throw new IllegalArgumentException("m_itemType ne peut \u00eatre null pour l'objet " + this.o);
        }
    }

    public azl_2<enk_0> bcx() {
        return this.spf;
    }

    public Iterator<Map.Entry<ffj_0, ang_2>> fYg() {
        return this.spg.entrySet().iterator();
    }

    public void d(fgg_0 fgg_02) {
        this.spq.add(fgg_02);
    }

    public boolean c(fgg_0 fgg_02) {
        return this.spq.contains(fgg_02);
    }

    public void v(enk_0 enk_02) {
        this.spf.M(enk_02);
        if (enk_02.beB()) {
            this.spi = true;
        }
        if (enk_02.fAu()) {
            this.spj = true;
        }
        if (enk_02.df(1L)) {
            this.spr = true;
        }
    }

    public boolean fYh() {
        return this.spr;
    }

    public byte fYi() {
        return this.elM;
    }

    public ang_2 a(ffj_0 ffj_02) {
        return this.spg.get(ffj_02);
    }

    public boolean a(ffj_0 ffj_02, exP exP2, eKR eKR2) {
        ang_2 ang_22 = this.a(ffj_02);
        return ang_22 == null || ang_22.b(exP2, exP2, eKR2, exP2.bdV());
    }

    public String getDescription() {
        throw new UnsupportedOperationException("M\u00e9thode non cod\u00e9e dans le refactor");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Cannot get name of AbstractReferenceItem");
    }

    @Override
    public String dah() {
        throw new UnsupportedOperationException("Cannot get name of AbstractReferenceItem");
    }

    public Iterator<enk_0> fYj() {
        return this.spf.iterator();
    }

    public byte fYk() {
        return this.spk;
    }

    public byte fYl() {
        return this.elN;
    }

    public short dpq() {
        return this.spe;
    }

    public boolean fYm() {
        return this.elR;
    }

    public boolean fYn() {
        return this.spl;
    }

    public boolean fYo() {
        return this.elS;
    }

    public boolean v(ffS ffS2) {
        return this.jhS.v(ffS2);
    }

    public boolean fYp() {
        Object[] objectArray = this.jhS.fZs();
        if (objectArray == null) {
            return false;
        }
        Object[] objectArray2 = this.jhS.fZq();
        return ArrayUtils.contains((Object[])objectArray2, (Object)ffS.sgQ) && ArrayUtils.contains((Object[])objectArray, (Object)ffS.sgR);
    }

    public int aVt() {
        return this.ciZ;
    }

    public int cpf() {
        return this.elH;
    }

    public int cpg() {
        return this.elI;
    }

    @Override
    public int d() {
        return this.o;
    }

    public fhy_0 dGh() {
        return this.jhS;
    }

    public short cmL() {
        return this.ejt;
    }

    public int cpo() {
        return this.elQ;
    }

    public int cpn() {
        return this.elP;
    }

    public boolean beB() {
        if (ewo_0.oBF.o(ewr_0.oDC).contains(this.o)) {
            return false;
        }
        return this.spi;
    }

    public boolean fAu() {
        if (ewo_0.oBF.o(ewr_0.oDC).contains(this.o)) {
            return false;
        }
        return this.spj;
    }

    public boolean fYq() {
        return this.spm;
    }

    @Override
    public short bfe() {
        return this.sph;
    }

    public void nk(boolean bl) {
        this.spj = bl;
    }

    public void a(fgl_0 fgl_02) {
        this.sps = fgl_02;
    }

    @Override
    @Nullable
    public fgl_0 fUZ() {
        return this.sps;
    }

    public fgj dwg() {
        return this.iBi;
    }

    public fgW fVc() {
        return this.sfp;
    }

    public fgp_0 fYr() {
        return this.spn;
    }

    public float fYs() {
        return this.spo;
    }

    public float fYt() {
        return this.spp;
    }

    public fgl fYu() {
        return this.spt;
    }

    public boolean fYv() {
        return this.c(fgg_0.shZ);
    }

    public boolean fYw() {
        ffS[] ffSArray;
        for (ffS ffS2 : ffSArray = this.jhS.fZq()) {
            if (ffS2 == ffS.sgY) continue;
            return true;
        }
        return false;
    }

    public boolean fbT() {
        return this.fYw() || this.jhS.aIi() == 218 || this.jhS.aIi() == 399;
    }

    public boolean bqp() {
        return this.c(fgg_0.siu);
    }

    public boolean dUt() {
        return false;
    }

    public int fYx() {
        if (this.c(fgg_0.sij)) {
            return 2;
        }
        return fik_0.tX(this.o) ? 1 : 0;
    }

    public boolean agg() {
        return fin_0.srJ.tX(this.fYx());
    }

    public boolean adO() {
        return foy_0.sLJ.XQ(this.o) != null;
    }

    public short aVe() {
        fim_0 fim_02 = fin_0.srJ.VL(this.fYx());
        if (fim_02 == null) {
            return this.ejt;
        }
        fij_0 fij_02 = fip_0.b(fim_02);
        return fij_02.aVe();
    }

    public fhp_0 dCC() {
        return this.iUB;
    }

    public fhg_0 dSY() {
        return this.jSo;
    }

    public boolean fYy() {
        return this.emb != 0 && this.emc != 0;
    }

    public byte cpz() {
        return this.emb;
    }

    public byte cpA() {
        return this.emc;
    }

    public boolean fYz() {
        Iterator<enk_0> iterator = this.fYj();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            if (enk_02.avZ() != enf_0.qSU.d()) continue;
            return true;
        }
        return false;
    }

    public boolean fYA() {
        for (enk_0 enk_02 : this.spf) {
            if (enk_02.avZ() != enf_0.qPQ.d() && enk_02.avZ() != enf_0.qPR.d()) continue;
            return true;
        }
        return false;
    }

    public boolean fYB() {
        for (enk_0 enk_02 : this.spf) {
            if (enk_02.avZ() != enf_0.qPQ.d()) continue;
            return true;
        }
        return false;
    }

    public boolean fYC() {
        for (enk_0 enk_02 : this.spf) {
            if (enk_02.avZ() != enf_0.qPR.d()) continue;
            return true;
        }
        return false;
    }

    public int Vq(int n) {
        int n2 = 0;
        Iterator<enk_0> iterator = this.fYj();
        while (iterator.hasNext()) {
            enk_0 enk_02 = iterator.next();
            int n3 = enk_02.avZ();
            if (n3 != n) continue;
            n2 += (int)enk_02.Rz(1);
        }
        return n2;
    }

    public abstract boolean dUw();

    public String toString() {
        return "AbstractReferenceItem{m_id=" + this.o + ", m_setId=" + this.spe + ", m_level=" + this.ejt + "}";
    }
}

