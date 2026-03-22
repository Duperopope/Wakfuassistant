/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class ceI
implements adi_1 {
    private static final Logger lSy = Logger.getLogger(ceI.class);
    private static final ceI lSz = new ceI();
    final ceF<bsj_0> lSA = new ceF();
    private bsj_0 lSv;

    private ceI() {
        this.euI();
        this.euF();
    }

    public static ceI euH() {
        return lSz;
    }

    private void euI() {
        cgj_0.a(12120, this.lSA);
        cgj_0.a(12514, this.lSA);
        cgj_0.a(12383, this.lSA);
        cgj_0.a(12275, this.lSA);
        cgj_0.a(13859, this.lSA);
        cgj_0.a(12433, this.lSA);
        cgj_0.a(13251, this.lSA);
        cgj_0.a(12866, this.lSA);
        cgj_0.a(13236, this.lSA);
    }

    private void euF() {
        ceL.a(13923, this.lSA);
        ceL.a(12010, this.lSA);
        ceL.a(13461, this.lSA);
        ceL.a(13917, this.lSA);
        ceL.a(13004, this.lSA);
        ceL.a(13556, this.lSA);
        ceL.a(12900, this.lSA);
        ceL.a(13811, this.lSA);
        ceL.a(13127, this.lSA);
        ceL.a(13419, this.lSA);
        ceL.a(12846, this.lSA);
        ceL.a(12096, this.lSA);
        ceL.a(12162, this.lSA);
        ceL.a(13674, this.lSA);
        ceL.a(13124, this.lSA);
        ceL.a(13323, this.lSA);
    }

    public void m(bsj_0 bsj_02) {
        this.lSv = bsj_02;
        this.lSA.v(bsj_02);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.lSv == null) {
            lSy.error((Object)("[FIGHT] La NetSpectatorFightFrame re\u00e7oit un message a traiter alors qu'aucun combat ne lui est associ\u00e9 : " + aam_22.getClass().getSimpleName()));
            return true;
        }
        if (aam_22 instanceof cqf && ((cqf)aam_22).bha() != this.lSv.d()) {
            return true;
        }
        return this.lSA.b(aam_22);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

