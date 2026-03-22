/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgG
 */
final class cgg_0
extends ceK<cqu_0, bsj_0> {
    private static final Logger lTN = Logger.getLogger(cgg_0.class);

    cgg_0() {
    }

    public boolean a(cqu_0 cqu_02) {
        int n = cqu_02.bha();
        if (this.jkR != null && ((bsj_0)this.jkR).d() == n) {
            aVO aVO2 = new aVO(cqu_02.caO(), cqu_02.eza().aJr(), cqu_02.avZ(), ((bsj_0)this.jkR).d(), false);
            aVO2.fc(true);
            ((bsj_0)this.jkR).O(cqu_02.ezi());
            ((bsj_0)this.jkR).Q(cqu_02.ezj());
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVO2);
            aVi.cWF().m(this.jkR);
            return false;
        }
        lTN.error((Object)"Pas de combat associ\u00e9 a la frame pour sortir du mode spectateur");
        return true;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqu_0)aam_22);
    }
}

