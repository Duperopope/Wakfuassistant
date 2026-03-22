/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBy
 */
public class bby_0
extends bCA
implements eIy {
    static final Logger jGk = Logger.getLogger(bby_0.class);
    public static final short jGl = 1;
    protected fdC jGm;

    protected bby_0() {
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.setVisible(true);
        this.bi(true);
        this.bf(true);
        assert (this.jGm == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGm = null;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.bkJ) {
            String string = aum_0.cWf().a(119, (long)this.jGm.d(), new Object[0]);
            String string2 = aum_0.cWf().a(120, (long)this.jGm.d(), new Object[0]);
            fse_1.gFu().f("arcadeDungeon", new bam_0(string, string2, this.jGm.cuV()));
            ccj_2.g("rewardDisplayerDialog", 256L);
            bbz_1 bbz_12 = new bbz_1(this);
            fyw_0.gqw().a(bbz_12);
            cAY.eHc().nP(600120L);
            return true;
        }
        return false;
    }

    @Override
    public void dNq() {
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jGk.error((Object)("[LD] L'IE de RewardDisplayer " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdC fdC2 = (fdC)fda_0.rWI.a(fdv_0.rZm, Integer.valueOf(stringArray[0]));
        if (fdC2 == null) {
            jGk.error((Object)("[LD] L'IE de RewardDisplayer " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jGm = fdC2;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public cpm_1[] dNh() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jGm.clf());
        if (fqy_02 == null) {
            jGk.error((Object)("[LD] Impossible de trouver le visuel " + this.jGm.clf() + " pour l'IE " + this.aXv), (Throwable)new IllegalArgumentException());
            return cpm_1.nip;
        }
        cpv_1 cpv_12 = (cpv_1)cps_1.njm.eLI();
        cpv_12.CV(fqy_02.giv());
        cpv_12.setName("desc.mru." + fqy_02.giw());
        cpv_12.e(this.bdZ());
        return new cpm_1[]{cpv_12};
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public eIw dNx() {
        return this.jGm;
    }

    static /* synthetic */ void a(bby_0 bby_02, ayv_2 ayv_22) {
        bby_02.a(ayv_22);
    }
}

