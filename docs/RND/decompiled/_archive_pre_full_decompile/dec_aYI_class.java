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
        boolean bl = ((bSG)aIe.cfn().bmH()).a(bSN.lkZ);
        aYI.ff(bl);
        ewo.oBF.a((ewr ewr2, Object object) -> {
            if (ewr2 != ewr.oCX) {
                return;
            }
            boolean bl = ewo.oBF.k(ewr.oCX);
            if (bpu.dCU() == bl) {
                return;
            }
            aYI.ff(bl);
        });
        wL.b(this);
    }

    private static void ff(boolean bl) {
        try {
            bpm.dCG().reset();
            bpu.gN(bl);
            ((bSG)aIe.cfn().bmH()).a((afe)bSN.lkZ, bl);
            bpm.dCG().dCI();
            bpm.dCG().dCH();
            bpm.dCG().s(bjA.drJ().drK());
            bpm.dCG().dCJ();
            bpm.dCG().dCK();
            bpm.dCG().t(bEm.dSb().fXi());
            cUj.eRB().eRC();
        }
        catch (Exception exception) {
            hxT.error((Object)"Unable to init encyclopedia", (Throwable)exception);
        }
    }

    @Override
    public String getName() {
        return aUM.cWf().c("contentLoader.encyclopedia", new Object[0]);
    }
}
