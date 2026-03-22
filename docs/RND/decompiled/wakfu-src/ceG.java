/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class ceG
implements adi_1 {
    private static final Logger lSs = Logger.getLogger(ceG.class);
    private static final ceG lSt = new ceG();
    final ceF<bsj_0> lSu = new ceF();
    private bsj_0 lSv;

    public static ceG euA() {
        return lSt;
    }

    private ceG() {
        this.euB();
        this.euC();
    }

    private void euB() {
        ceL.a(12162, this.lSu);
        ceL.a(12010, this.lSu);
        ceL.a(13923, this.lSu);
        ceL.a(13811, this.lSu);
        ceL.a(13556, this.lSu);
        ceL.a(13419, this.lSu);
        ceL.a(13127, this.lSu);
        ceL.a(13461, this.lSu);
        ceL.a(13328, this.lSu);
        ceL.a(13917, this.lSu);
        ceL.a(12522, this.lSu);
        ceL.a(13970, this.lSu);
        ceL.a(12138, this.lSu);
        ceL.a(12107, this.lSu);
        ceL.a(12597, this.lSu);
        ceL.a(12846, this.lSu);
        ceL.a(12096, this.lSu);
        ceL.a(13004, this.lSu);
        ceL.a(12160, this.lSu);
        ceL.a(12310, this.lSu);
        ceL.a(12543, this.lSu);
        ceL.a(13438, this.lSu);
        ceL.a(13432, this.lSu);
        ceL.a(12625, this.lSu);
        ceL.a(12900, this.lSu);
        ceL.a(13674, this.lSu);
    }

    private void euC() {
        cfL.a(13305, this.lSu);
        cfL.a(13015, this.lSu);
        cfL.a(12461, this.lSu);
        cfL.a(13842, this.lSu);
        cfL.a(13916, this.lSu);
        cfL.a(12022, this.lSu);
        cfL.a(13192, this.lSu);
        cfL.a(13141, this.lSu);
        cfL.a(12683, this.lSu);
        cfL.a(12120, this.lSu);
        cfL.a(12514, this.lSu);
        cfL.a(12383, this.lSu);
        cfL.a(12913, this.lSu);
        cfL.a(12275, this.lSu);
        cfL.a(12930, this.lSu);
        cfL.a(13323, this.lSu);
        cfL.a(12866, this.lSu);
        cfL.a(13203, this.lSu);
        cfL.a(13124, this.lSu);
        cfL.a(13083, this.lSu);
        cfL.a(12876, this.lSu);
        cfL.a(13251, this.lSu);
        cfL.a(12264, this.lSu);
        cfL.a(13503, this.lSu);
        cfL.a(12381, this.lSu);
        cfL.a(13079, this.lSu);
        cfL.a(13976, this.lSu);
        cfL.a(13859, this.lSu);
        cfL.a(12433, this.lSu);
        cfL.a(12209, this.lSu);
        cfL.a(13475, this.lSu);
        cfL.a(12703, this.lSu);
        cfL.a(13512, this.lSu);
    }

    public void m(bsj_0 bsj_02) {
        this.lSv = bsj_02;
        this.lSu.v(bsj_02);
    }

    public bsj_0 euD() {
        return this.lSv;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        lSs.info((Object)"NetInFight Added");
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        lSs.info((Object)"NetInFight Removed");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.lSv == null) {
            lSs.error((Object)("[FIGHT] La NetInFightManagementFrame re\u00e7oit un message a traiter alors qu'aucun combat ne lui est associ\u00e9 : " + aam_22.getClass().getSimpleName()));
            return true;
        }
        if (aam_22 instanceof cqf && ((cqf)aam_22).bha() != this.lSv.d()) {
            return true;
        }
        return this.lSu.b(aam_22);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

