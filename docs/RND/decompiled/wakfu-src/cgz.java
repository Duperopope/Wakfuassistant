/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgz
implements ceJ<cqg_0, bsi_0> {
    private static final Logger lTJ = Logger.getLogger(cgz.class);
    private long lTK;

    cgz() {
    }

    public boolean a(cqg_0 cqg_02) {
        int n = cqg_02.bku();
        lTJ.info((Object)("Erreur de creation de combat " + n));
        this.lTK = cqg_02.eyN();
        String string = this.KQ(n);
        aPh.czg().iY(string);
        return false;
    }

    private String KQ(int n) {
        String string;
        if (n == 0) {
            string = aum_0.cWf().c("fight.hero.join.generic.error", new Object[0]);
        } else {
            bNG.egl();
            string = bNG.b(n, new Object[0]);
        }
        String string2 = string;
        Object t = fcL.rUh.sw(this.lTK);
        if (t == null) {
            lTJ.error((Object)("Heros inconnu " + this.lTK));
            return string2;
        }
        return aum_0.cWf().c("fight.hero.join.error", ((exP)t).getName(), string2);
    }

    public void n(bsi_0 bsi_02) {
    }

    @Override
    public int euJ() {
        return 12091;
    }

    @Override
    public void KP(int n) {
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqg_0)aam_22);
    }

    @Override
    public /* synthetic */ void k(bsS bsS2) {
        this.n((bsi_0)bsS2);
    }
}

