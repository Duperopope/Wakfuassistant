/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from cRX
 */
public abstract class crx_2
implements adi_1,
bLa,
bLb,
Runnable {
    private static final float[] nEd = new float[]{0.0f, 1.0f, 0.0f, 0.6f};
    private static final float[] nEe = new float[]{1.0f, 0.0f, 0.0f, 0.6f};
    private static final float[] nEf = new float[]{1.0f, 0.5f, 0.0f, 0.6f};
    private static final float[] nEg = new float[]{1.0f, 1.0f, 0.0f, 0.6f};
    private static final float[] nEh = new float[]{0.0f, 0.0f, 0.0f, 0.6f};
    private static final float[] nEi = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private static final int[] nEj = new int[]{36, 10, 35};
    protected static final int nEk = 8;
    private static final Logger nEl = Logger.getLogger(crx_2.class);
    protected ffV iWZ;
    protected final afU nEm = new afU();
    protected acd_1 nEn;
    private acd_1 nEo;
    protected final aad_0 nEp;
    protected final aad_0 nEq;
    protected final LinkedList<csa_1> nEr = new LinkedList();
    protected csa_1 nEs;
    private adm_0 nlb;
    private final fmz_1 nEt = new cry_2(this);

    protected crx_2() {
        this.nEp = new aad_0("seedVeryBadRange", nEd);
        this.nEq = new aad_0("seedSelectedCells", nEi);
    }

    public void y(ffV ffV2) {
        this.iWZ = ffV2;
    }

    public ffV getItem() {
        return this.iWZ;
    }

    protected Qk bbf() {
        return this.iWZ;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void eNa() {
        String string = (String)this.iWZ.eu("iconUrl");
        if (string != null) {
            this.qg(string);
        } else {
            fib_2.gBU().eKH();
            fhn_1.gzT().bYz();
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                acd_1 acd_12 = crx_2.eF(dcm_02.bqM(), dcm_02.bqN());
                this.c(acd_12, false);
                return false;
            }
            case 16990: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                acd_1 acd_13 = crx_2.eF(dcm_03.bqM(), dcm_03.bqN());
                if (!crx_2.h(acd_13, this.nEn) && dcm_0.fck()) {
                    this.ag(acd_13);
                    this.nEn = acd_13;
                }
                return false;
            }
            case 19373: {
                dcm_0 dcm_04 = (dcm_0)aam_22;
                if (dcm_04.fch()) {
                    this.nEn = null;
                }
                return false;
            }
            case 16902: {
                dcm_0 dcm_05 = (dcm_0)aam_22;
                if (dcm_05.fch()) {
                    acd_1 acd_14 = crx_2.eF(dcm_05.bqM(), dcm_05.bqN());
                    this.ag(acd_14);
                } else {
                    this.e(dcm_05);
                }
                return false;
            }
        }
        return true;
    }

    private static boolean h(acd_1 acd_12, acd_1 acd_13) {
        if (acd_12 == null && acd_13 == null) {
            return true;
        }
        if (acd_12 == null) {
            return false;
        }
        return acd_12.equals(acd_13);
    }

    private void e(dcm_0 dcm_02) {
        boolean bl;
        bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
        boolean bl2 = bl = bkb_02 != null && bkb_02.dsm() == 2;
        if ((!this.nEr.isEmpty() || bl) && dcm_02.fci()) {
            csa_1 csa_12 = this.nEr.removeLast();
            acd_1 acd_12 = csa_12.eLV();
            if (!this.ah(acd_12)) {
                this.nEq.G(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            }
        } else {
            if (bl) {
                bkb_02.dsg();
            }
            aue_0.cVJ().b(this);
        }
    }

    protected void c(acd_1 acd_12, boolean bl) {
        if (acd_12 == null) {
            this.nEp.bqC();
            this.nEn = null;
            this.diW();
            return;
        }
        if (acd_12.equals(this.nEn) && !bl) {
            return;
        }
        this.nEp.bqC();
        this.nEn = acd_12;
        fib_2.gBU().setText(this.eNA());
        int n = this.al(acd_12);
        this.Ml(n);
        this.ae(acd_12);
        this.nEm.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        if (n < 0) {
            this.diW();
            return;
        }
        this.eNv();
    }

    protected abstract void ae(acd_1 var1);

    protected abstract void eNv();

    protected void Ml(int n) {
        if (n < 0) {
            this.nEp.q(nEh);
        } else if (this.eNw()) {
            this.nEp.q(nEd);
        } else if (n <= 25) {
            this.nEp.q(nEe);
        } else if (n <= 50) {
            this.nEp.q(nEf);
        } else if (n <= 75) {
            this.nEp.q(nEg);
        } else if (n <= 100) {
            this.nEp.q(nEd);
        } else {
            this.nEp.q(nEh);
            nEl.error((Object)("Validit\u00e9 inattendue pour planter sur la case [" + String.valueOf(this.nEn) + "] : " + n));
        }
    }

    public boolean eNw() {
        return this.iWZ.dOg().c(fgg_0.sie);
    }

    private boolean af(acd_1 acd_12) {
        int n = Math.abs(acd_12.getX() - aue_0.cVJ().cVK().bcC()) + Math.abs(acd_12.getY() - aue_0.cVJ().cVK().bcD());
        return n >= 8;
    }

    private boolean ag(acd_1 acd_12) {
        if (acd_12 == null || this.al(acd_12) == -1) {
            return false;
        }
        csa_1 csa_12 = new csa_1(acd_12);
        int n = this.nEr.size();
        if (n > 98 || !this.Mm(n)) {
            return false;
        }
        if (this.ah(acd_12)) {
            return false;
        }
        if (this.nEs == null) {
            this.a(csa_12);
        } else {
            this.nEr.add(csa_12);
            this.nEq.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
        return true;
    }

    csa_1 eNx() {
        this.nEs = null;
        if (this.nEr.isEmpty()) {
            return null;
        }
        return this.nEr.poll();
    }

    protected boolean ah(acd_1 acd_12) {
        if (this.nEs != null && this.nEs.eLV().equals(acd_12)) {
            return true;
        }
        for (csa_1 csa_12 : this.nEr) {
            if (!csa_12.eLV().equals(acd_12)) continue;
            return true;
        }
        return false;
    }

    protected void ai(acd_1 acd_12) {
        csa_1[] csa_1Array = this.nEr.toArray(new csa_1[this.nEr.size()]);
        for (int i = csa_1Array.length - 1; i >= 0; --i) {
            csa_1 csa_12 = csa_1Array[i];
            if (!csa_12.eLV().equals(acd_12)) continue;
            this.nEr.remove(csa_12);
        }
    }

    private int aj(acd_1 acd_12) {
        int n = 0;
        for (csa_1 csa_12 : this.nEr) {
            if (!csa_12.eLV().equals(acd_12)) continue;
            ++n;
        }
        return n;
    }

    public abstract void eNy();

    public void dsH() {
        this.dsI();
        abg_2.bUP().a((Runnable)this, 5000L, 1);
    }

    public void dsI() {
        abg_2.bUP().h(this);
    }

    @Override
    public void run() {
        nEl.warn((Object)"[Plantation] timeOut execut\u00e9");
        this.eNz();
    }

    @Override
    public void i(bKV bKV2) {
        if (this.s(bKV2)) {
            this.c(this.nEn, true);
        }
    }

    @Override
    public void h(bKV bKV2) {
        if (this.s(bKV2)) {
            this.c(this.nEn, true);
        }
    }

    private boolean s(bKV bKV2) {
        return this.nEm != null && this.nEm.bcC() == bKV2.bcC() && this.nEm.bcD() == bKV2.bcD();
    }

    public void eNz() {
        while (!this.a(this.eNx())) {
        }
    }

    boolean a(csa_1 csa_12) {
        this.nEs = csa_12;
        if (csa_12 == null) {
            return true;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        int n = csa_12.eNB();
        int n2 = csa_12.eNC();
        short s = csa_12.eND();
        acd_1 acd_12 = csa_12.eLV();
        float f2 = (float)s - bdj_22.getAltitude();
        if (Math.abs(f2) > (float)Math.abs(bgt_02.bvy())) {
            nEl.error((Object)("Plantation impossible sur la cellule " + String.valueOf(acd_12) + " : hauteur maximale de saut de " + bgt_02.bvy()));
            bNG.egl();
            bNG.a(5, new Object[0]);
            this.ak(acd_12);
            this.nEs = null;
            return false;
        }
        if (this.nlb != null) {
            bdj_22.c(this.nlb);
        }
        this.nlb = new crz_2(this, n, n2);
        bdj_22.b(this.nlb);
        int n3 = acd_12.cH(bdj_22.bcC(), bdj_22.bcD());
        if (n3 >= 2 || n3 == 0) {
            List<acd_1> list = wa_0.a(acd_12, false);
            if (!bdj_22.b(false, true, list)) {
                bdj_22.c(this.nlb);
                bNG.egl();
                bNG.a(2, new Object[0]);
                this.nEs = null;
                return false;
            }
        } else {
            bdj_22.c(this.nlb);
            this.eE(n, n2);
        }
        if (this.aj(acd_12) <= 1) {
            this.ak(acd_12);
        }
        if (!this.Mm(1)) {
            aue_0.cVJ().b(this);
        }
        return true;
    }

    protected abstract void eE(int var1, int var2);

    protected boolean Mm(int n) {
        ffV ffV2 = fcI.aj(aue_0.cVJ().cVK().Xi(), this.iWZ.LV());
        if (ffV2 == null) {
            return false;
        }
        fgl_0 fgl_02 = ffV2.dOg().fUZ();
        if (!fgl_02.fXq()) {
            return true;
        }
        return ffV2.bfd() > n;
    }

    protected void ak(acd_1 acd_12) {
        this.nEq.G(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        this.nEs = null;
        bLe.ecw().b(this);
        bLe.ecw().b(this);
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        fhn_1.gzT().a(fzo_0.tHU, true);
        aIs2.en(true);
        aIs2.eo(true);
        acd_1 acd_12 = crx_2.eF(aIs2.bqM(), aIs2.bqN());
        this.c(acd_12, false);
        fbj_1.getInstance().a(fzq_0.tJU, this.nEt, true);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bLe.ecw().c(this);
            bLe.ecw().c(this);
            fib_2.gBU().eKH();
            fhn_1.gzT().bYz();
            this.nEr.clear();
            this.nEp.bqC();
            this.nEq.bqC();
            this.nEn = null;
            this.diW();
            fbj_1.getInstance().b(fzq_0.tJU, this.nEt, true);
        }
    }

    private static acd_1 eF(int n, int n2) {
        acd_1 acd_12 = aeO.a(aie_0.cfn().bmC(), n, n2, false);
        if (acd_12 == null) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        wa_0.a(bgt_02.bcN(), bgt_02.bcO(), bgt_02.bvy());
        short s = wa_0.v(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        if (s == Short.MIN_VALUE || Math.abs(acd_12.bdi() - s) > 1) {
            return null;
        }
        acd_12.aM(s);
        return acd_12;
    }

    private void qg(String string) {
        if (string != null) {
            fib_2.gBU().a(string, this.eNA(), 30, 0, faa_2.tLN);
        }
    }

    protected abstract String eNA();

    protected abstract int al(acd_1 var1);

    public void Mn(int n) {
        if (ArrayUtils.contains((int[])nEj, (int)n)) {
            aue_0.cVJ().b(this);
            return;
        }
        this.eNz();
    }

    protected abstract void diW();
}

