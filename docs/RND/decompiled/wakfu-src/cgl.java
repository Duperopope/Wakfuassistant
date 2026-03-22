/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgl
extends cgc
implements ceJ<cqo, bsi_0> {
    private static final Logger lTF = Logger.getLogger(cgl.class);

    cgl() {
    }

    public boolean a(cqo cqo2) {
        byte by = cqo2.evi();
        euv_0 euv_02 = euv_0.fE(by);
        if (euv_02 == null) {
            lTF.error((Object)("ID d'erreur de cr\u00e9ation de combat inconnue : " + by));
            return false;
        }
        lTF.info((Object)("Erreur de creation de combat " + String.valueOf((Object)euv_02)));
        this.b(euv_02);
        this.a(euv_02);
        return false;
    }

    public void n(bsi_0 bsi_02) {
    }

    @Override
    public int euJ() {
        return 12330;
    }

    @Override
    public void KP(int n) {
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqo)aam_22);
    }

    @Override
    public /* synthetic */ void k(bsS bsS2) {
        this.n((bsi_0)bsS2);
    }
}

