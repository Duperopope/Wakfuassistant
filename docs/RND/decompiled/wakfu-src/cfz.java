/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cfz
extends ceK<cqm_0, bsj_0> {
    private static final Logger lSX = Logger.getLogger(cfz.class);

    cfz() {
    }

    public boolean a(cqm_0 cqm_02) {
        if (!cfC.lTb.lSZ) {
            lSX.warn((Object)"On re\u00e7oit une fin de creation de combat mais nous ne sommes pas en phase de creation");
            return true;
        }
        cfC.lTb.lTa.bGy();
        cfC.lTb.lTa.reset();
        cfC.lTb.lSZ = false;
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqm_0)aam_22);
    }
}

