/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cfI
extends ceK<cqD, bsj_0> {
    private static final Logger lTd = Logger.getLogger(cfI.class);

    cfI() {
    }

    public boolean a(cqD cqD2) {
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(cqD2.OO());
        if (bgy2 == null) {
            lTd.error((Object)(cqD2.getClass().getSimpleName() + " pour le fighter " + cqD2.OO() + " qui n'est pas dans le combat"));
            return false;
        }
        bgy2.e(exx_2.rGI).op(cqD2.eyJ());
        bgy2.e(exx_2.rGi).op(cqD2.eyI());
        bgy2.e(exx_2.rGi).ot(cqD2.eyK());
        ((bsj_0)this.jkR).dGQ().bhI();
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqD)aam_22);
    }
}

