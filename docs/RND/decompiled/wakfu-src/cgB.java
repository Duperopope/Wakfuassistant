/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cgB
extends ceK<cqH, bsi_0> {
    private static final Logger lTL = Logger.getLogger(cgB.class);

    public boolean a(cqH cqH2) {
        byte by = cqH2.eyO().bcP();
        boolean bl = cqH2.eyO().bfb();
        bsS bsS2 = bsU.dHk().Ft(cqH2.bha());
        if (bsS2 == null) {
            lTL.warn((Object)("The fight with the id " + cqH2.bha() + " has not been found"));
            return false;
        }
        if (bsS2 instanceof bsi_0) {
            bsi_0 bsi_02 = (bsi_0)bsS2;
            bsi_02.i(by, bl);
            aJL.b(bsi_02, by, bl);
        } else if (bsS2 instanceof bsj_0) {
            bsj_0 bsj_02 = (bsj_0)bsS2;
            bsj_02.a(cqH2.eyO());
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqH)aam_22);
    }
}

