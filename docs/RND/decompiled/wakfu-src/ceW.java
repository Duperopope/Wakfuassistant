/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class ceW
extends ceK<crb, bsj_0> {
    private static final Logger lSF = Logger.getLogger(ceW.class);

    ceW() {
    }

    public boolean a(crb crb2) {
        int n = crb2.bha();
        if (this.jkR == null || ((bsj_0)this.jkR).d() != n) {
            lSF.error((Object)("[_FL_] Frame invalide \u00e0 la r\u00e9ception d'un message " + crb.class.getSimpleName()));
            return false;
        }
        aVQ aVQ2 = new aVQ(crb2.d(), eui_1.rsZ.aJr(), 0, n, crb2.OO());
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVQ2);
        aVi.cWF().m(this.jkR);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crb)aam_22);
    }
}

