/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfs
 */
public final class cfs_0
extends ceK<cqj, bsj_0> {
    private static final Logger lSR = Logger.getLogger(cfs_0.class);

    public boolean a(cqj cqj2) {
        cft cft2 = new cft(this, agb_1.cbm(), eui_1.rtt.aJr(), 0, cqj2);
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)cft2);
        aVi.cWF().m(this.jkR);
        return false;
    }

    public void b(cqj cqj2) {
        bgy bgy2;
        long l = cqj2.KU();
        byte[] byArray = cqj2.aKU();
        bgy bgy3 = (bgy)((bsj_0)this.jkR).qJ(l);
        if (bgy3 == null) {
            lSR.error((Object)("Trying to recover character " + l + " but he's not in the fight"));
            return;
        }
        bdj_2 bdj_22 = bgy3.ddI();
        aex aex2 = bdj_22.bvD();
        bdj_22.a(aez.bwu());
        bgy3.a(byArray, false);
        bdj_22.a(aex2);
        if (bgy3.a(exe_1.rDg)) {
            bgy3.a((pv_0)exe_1.rDg, px_0.beR);
        }
        if (bgy3.dOp() && (bgy2 = bgg_0.dlO().jv(bgy3.Xi())) instanceof bhJ) {
            ((bhJ)bgy2).g(bgy3, true);
        }
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqj)aam_22);
    }
}

