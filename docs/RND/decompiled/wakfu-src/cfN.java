/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cfN
extends ceK<cqH, bsj_0> {
    private static final Logger lTf = Logger.getLogger(cfN.class);

    cfN() {
    }

    public boolean a(cqH cqH2) {
        if (this.jkR == null) {
            lTf.error((Object)("The fight with the id " + cqH2.bha() + " was not loaded when the LockFightMessage has been received."));
            return false;
        }
        ((bsj_0)this.jkR).a(cqH2.eyO());
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqH)aam_22);
    }
}

