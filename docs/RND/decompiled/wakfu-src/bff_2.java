/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFf
 */
public final class bff_2
extends bfc_1 {
    private static final Logger jSW = Logger.getLogger(bff_2.class);

    bff_2(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        fiq_2.gCw().d(fik_2.a(string -> this.aS(ffV2)).l("question.activate.commonAptitudeRestat", new Object[0]).abQ(1).vG(ccp_2.mRE.byf()));
        return true;
    }

    private void aS(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jSW.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return;
        }
        this.jU(ffV2.LV());
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skI;
    }
}

