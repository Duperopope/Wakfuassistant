/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class aWt
extends aUT {
    protected static final Logger huN = Logger.getLogger(aWt.class);
    private short huO;
    private final ym_1 huP;
    private final ewc_2 huQ = new ewc_2();

    public aWt(int n, int n2, int n3, int n4, ym_1 ym_12, boolean bl, boolean bl2, long l, int n5, int n6, short s) {
        super(n, n2, n3, n4, bl, bl2, l, n5, n6, s);
        this.huP = ym_12;
    }

    @Override
    public long cbk() {
        bmx_0 bmx_02;
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            return 0L;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.ddf();
        if (bdj_22.dcX() == null || bdj_22.dcX().aeV() != 2) {
            bdj_22.b(new btm_0(bgy2));
        }
        if ((bmx_02 = aWt.a(bgy2, this.huP)) == null) {
            return 0L;
        }
        bmt_0 bmt_02 = (bmt_0)bmx_02.giP();
        this.huO = bmx_02.cmL();
        if (!bmt_02.cvP() && !bdj_22.dcP().a(ezj_0.ptM)) {
            this.xV(bmt_02.cbt());
        }
        boolean bl = true;
        acd_1 acd_12 = new acd_1(this.getX(), this.getY(), this.bdi());
        if (this.cWB()) {
            bsj_0 bsj_02 = bgy2.dkZ();
            if (bsj_02 != null) {
                bsj_02.a(bmx_02, (exP)bgy2);
                bsj_02.a((exP)bgy2, bmt_02, acd_12);
                fqH fqH2 = bsj_02.b(bgy2, bmx_02, acd_12, false);
                if (fqH2 == fqH.sUS) {
                    bl = false;
                }
            }
            if (this.cWw()) {
                this.R(bgy2);
                this.cXl();
            }
        }
        this.huQ.a(this.cja(), bgy2, bmx_02, bmx_02.eeU(), bmx_02.eeT(), acd_12);
        if (bl) {
            this.huQ.fNE();
        }
        if (aue_0.cVJ().cVK() == bgy2) {
            bqm_0.jbp.b(new brg_0(bmt_02.d()));
        }
        if (!bgy2.dlw()) {
            return super.cbk();
        }
        this.caT();
        return -1L;
    }

    public static bmx_0 a(bgy bgy2, ym_1 ym_12) {
        bmx_0 bmx_02;
        fqP<bmx_0> fqP2 = bgy2.dkB();
        if (fqP2 != null && fqP2.beS() != null) {
            bmx_02 = (bmx_0)fqP2.beS().x(ym_12);
        } else {
            bmz_0 bmz_02 = new bmz_0(bgy2);
            bmx_02 = bmz_02.c(ym_12);
        }
        return bmx_02;
    }

    private void R(bgy bgy2) {
        this.d(bgy2, 800017);
    }

    private void d(bgy bgy2, int n) {
        FreeParticleSystem freeParticleSystem;
        if ((aue_0.cVJ().cVK().dkZ() == null || aue_0.cVJ().cVK().bqo() == this.cja().d()) && (freeParticleSystem = agY.bzw().sk(n)) != null) {
            if (this.cja() != null) {
                freeParticleSystem.pu(this.cja().d());
            }
            freeParticleSystem.a(bgy2.ddI());
            agZ.bzy().b(freeParticleSystem);
        }
    }

    private void cXl() {
        if (aue_0.cVJ().cVK().bqo() == this.cja().d()) {
            cAY.eHc().nP(600122L);
        }
    }

    @Override
    public short cmL() {
        return this.huO;
    }

    @Override
    public boolean cWy() {
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            return false;
        }
        bmx_0 bmx_02 = aWt.a(bgy2, this.huP);
        int n = bmx_02.eeU();
        int n2 = bmx_02.eeT();
        int n3 = this.getX();
        int n4 = this.getY();
        boolean bl = ((bmt_0)bmx_02.giP()).l(bmx_02, bgy2, new acd_1(n3, n4, this.bdi()), bgy2.bdV());
        eug_1<bmx_0, bgy> eug_12 = new eug_1<bmx_0, bgy>(null);
        return eug_12.a(bgy2, bmx_02, n, n2, bl, n3, n4);
    }

    @Override
    public QQ cWz() {
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            return null;
        }
        return this.huQ.cWz();
    }

    @Override
    public QQ cWA() {
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            return null;
        }
        return this.huQ.cWA();
    }
}

