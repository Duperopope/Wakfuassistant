/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class ceP
extends ceK<cqX, bsj_0> {
    private static final Logger lSE = Logger.getLogger(ceP.class);

    ceP() {
    }

    public boolean a(cqX cqX2) {
        if (((bsj_0)this.jkR).d() != cqX2.bha()) {
            lSE.error((Object)"Le message ne concerne pas notre combat");
            return false;
        }
        ((bsj_0)this.jkR).SD(cqX2.ezo());
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqX)aam_22);
    }
}

