/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aYI
implements afl {
    private static final Logger hxT = Logger.getLogger(aYI.class);

    public void a(WL wL) {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkZ);
        aYI.ff(bl);
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 != ewr_0.oCX) {
                return;
            }
            boolean bl = ewo_0.oBF.k(ewr_0.oCX);
            if (bpu.dCU() == bl) {
                return;
            }
            aYI.ff(bl);
        });
        wL.b(this);
    }

    private static void ff(boolean bl) {
        try {
            bpm_1.dCG().reset();
            bpu.gN(bl);
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkZ, bl);
            bpm_1.dCG().dCI();
            bpm_1.dCG().dCH();
            bpm_1.dCG().s(bja_1.drJ().drK());
            bpm_1.dCG().dCJ();
            bpm_1.dCG().dCK();
            bpm_1.dCG().t(bEm.dSb().fXi());
            cuj_2.eRB().eRC();
        }
        catch (Exception exception) {
            hxT.error((Object)"Unable to init encyclopedia", (Throwable)exception);
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.encyclopedia", new Object[0]);
    }
}

