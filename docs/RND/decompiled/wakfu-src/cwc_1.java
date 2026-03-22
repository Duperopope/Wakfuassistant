/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWc
 */
public class cwc_1
implements adi_1 {
    private static final Logger nRz = Logger.getLogger(cwc_1.class);
    private static final cwc_1 nRA = new cwc_1();
    private static final float[] nRB = new float[]{0.0f, 1.0f, 0.0f, 0.6f};
    private aad_0 nEp;
    private ffV iWZ;
    private acd_1 nEn;

    public static cwc_1 eVd() {
        return nRA;
    }

    public ffV getItem() {
        return this.iWZ;
    }

    public void setItem(ffV ffV2) {
        this.iWZ = ffV2;
    }

    public void eNa() {
        fhn_1.gzT().a(fzo_0.tHC, true);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nEp = new aad_0("actionRange", nRB);
            aam_0 aam_02 = aie_0.cfn().bmC();
            acd_1 acd_12 = cwc_1.eF(aam_02.bqM(), aam_02.bqN());
            this.c(acd_12, false);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nEp.bqC();
            fhn_1.gzT().bYz();
        }
        this.iWZ = null;
        this.nEn = null;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                acd_1 acd_12 = cwc_1.eF(dcm_02.bqM(), dcm_02.bqN());
                this.c(acd_12, false);
                return false;
            }
            case 16902: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                if (dcm_03.fch()) {
                    acd_1 acd_13 = cwc_1.eF(dcm_03.bqM(), dcm_03.bqN());
                    this.eE(acd_13.getX(), acd_13.getY());
                } else {
                    aue_0.cVJ().b(this);
                }
                return false;
            }
        }
        return true;
    }

    protected void c(acd_1 acd_12, boolean bl) {
        if (acd_12 == null) {
            this.nEp.bqC();
            this.nEn = null;
            return;
        }
        if (acd_12.equals(this.nEn) && !bl) {
            return;
        }
        this.nEp.bqC();
        this.nEn = acd_12;
        int n = this.al(acd_12);
        this.nEp.q(nRB);
        this.ae(acd_12);
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

    protected void ae(acd_1 acd_12) {
        bfx_1 bfx_12 = (bfx_1)this.iWZ.dOg().fUZ();
        int n = bfx_12.getRadius();
        this.nEp.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        int n2 = acd_12.getX() + n;
        for (int i = acd_12.getX() - n; i <= n2; ++i) {
            int n3 = acd_12.getY() + n;
            for (int j = acd_12.getY() - n; j <= n3; ++j) {
                if (!(GC.K(i - acd_12.getX()) + GC.K(j - acd_12.getY()) <= GC.K(n))) continue;
                this.nEp.E(i, j, acd_12.bdi());
            }
        }
    }

    protected void eNv() {
    }

    protected void eE(int n, int n2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bfx_1 bfx_12 = (bfx_1)this.iWZ.dOg().fUZ();
        bfx_12.U(new acd_1(n, n2, bgt_02.bcE()));
        bfx_12.a(this.iWZ, n, n2);
    }

    protected int al(acd_1 acd_12) {
        if (this.iWZ == null) {
            return -1;
        }
        return 0;
    }
}

