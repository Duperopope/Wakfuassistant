/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class cdO
implements adi_1 {
    protected static final Logger lRb = Logger.getLogger(cdO.class);
    private static final cdO lRc = new cdO();

    public static cdO eug() {
        return lRc;
    }

    private cdO() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12584: {
                this.a((ctc_0)aam_22);
                return false;
            }
            case 13959: {
                this.a((ctd_0)aam_22);
                return false;
            }
        }
        return true;
    }

    private void a(ctc_0 ctc_02) {
        bgt_0 bgt_02;
        boolean bl;
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        boolean bl2 = bl = ctc_02.KU() == bgt_03.Sn();
        if (ctc_02.eCq().ffB()) {
            if (bl) {
                aPh.czg().iY(aum_0.cWf().c("error.mount." + ctc_02.eCq().name(), new Object[0]));
            }
            return;
        }
        bgy bgy2 = bgt_02 = bl ? bgt_03 : bgg_0.dlO().ju(ctc_02.KU());
        if (!(bgt_02 instanceof bhJ)) {
            return;
        }
        ((bhJ)bgt_02).gi(true);
    }

    private void a(ctd_0 ctd_02) {
        bgt_0 bgt_02;
        boolean bl;
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        boolean bl2 = bl = ctd_02.KU() == bgt_03.Sn();
        if (!bl && fcL.rUh.sw(ctd_02.KU()) != null) {
            ((bhJ)fcL.rUh.sw(ctd_02.KU())).gi(false);
            return;
        }
        bgy bgy2 = bgt_02 = bl ? bgt_03 : bgg_0.dlO().ju(ctd_02.KU());
        if (!(bgt_02 instanceof bhJ)) {
            return;
        }
        ((bhJ)bgt_02).gi(false);
        this.D(bgt_02.ddI());
    }

    public void D(bdj_2 bdj_22) {
        if (bdj_22 == null) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800450);
        if (freeParticleSystem == null) {
            lRb.warn((Object)"le system de particule 800450 n'exsite pas");
            return;
        }
        freeParticleSystem.a(bdj_22);
        agZ.bzy().b(freeParticleSystem);
    }

    public static fos_0 a(fnl_0 fnl_02) {
        int n = fnl_02.agK();
        fos_0 fos_02 = fou_0.sLB.aA(n);
        if (fos_02 != null) {
            return fos_02;
        }
        return fou_0.sLB.az(fnl_02.geL().aVt());
    }

    public static fos_0 c(fnl_0 fnl_02) {
        int n = fnl_02.agK();
        fos_0 fos_02 = fou_0.sLB.aA(n);
        if (fos_02 != null && fnp_0.k(fnl_02)) {
            return fos_02;
        }
        return fou_0.sLB.az(fnl_02.geL().aVt());
    }

    public boolean au(bhJ bhJ2) {
        if (this.av(bhJ2)) {
            return false;
        }
        if (bhJ2.i(ezj_0.puy)) {
            aPd.e(aua_0.gLQ, new Object[0]);
            return false;
        }
        bdj_2 bdj_22 = bhJ2.ddI();
        if (bhJ2.doP()) {
            return false;
        }
        if (bhJ2.djT()) {
            return false;
        }
        long l = bhJ2.Xi();
        long l2 = bbs_2.xl();
        long l3 = fcK.rUe.sq(l);
        long l4 = bhJ2.Sn();
        if (l == l2 && l3 != l4) {
            return false;
        }
        bjo_0 bjo_02 = bhJ2.dpf();
        if (bjo_02 == null) {
            return false;
        }
        fnl_0 fnl_02 = bjo_02.ead();
        if (!fnl_02.apo()) {
            return false;
        }
        if (bdj_22.bvW()) {
            aPd.e("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        bdt_2 bdt_22 = bdj_22.ddm();
        return !bdt_22.ddS() && !bdt_22.ddT();
    }

    public boolean av(bhJ bhJ2) {
        return bhJ2.dps() != null && !bhJ2.dps().dsj();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

