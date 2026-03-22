/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxn
extends bCA
implements eIy {
    static final Logger jBd = Logger.getLogger(bxn.class);
    public static final short jBe = 1;
    protected fdi_0 jBf;

    protected bxn() {
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.setVisible(true);
        this.bi(true);
        this.bf(true);
        assert (this.jBf == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jBf = null;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.bkJ) {
            cso_2 cso_22 = cso_2.eOa();
            cso_22.Mr(this.jBf.fTm());
            aue_0.cVJ().a(cso_22);
            this.c(rw_02);
            return true;
        }
        return false;
    }

    @Override
    public void dNq() {
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jBd.error((Object)("[LD] L'IE de BackgroundDisplay " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdi_0 fdi_02 = (fdi_0)fda_0.rWI.a(fdv_0.rYY, Integer.valueOf(stringArray[0]));
        if (fdi_02 == null) {
            jBd.error((Object)("[LD] L'IE de BackgroundDisplay " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jBf = fdi_02;
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
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jBf.clf());
        if (fqy_02 == null) {
            jBd.error((Object)("[LD] Impossible de trouver le visuel " + this.jBf.clf() + " pour l'IE " + this.aXv), (Throwable)new IllegalArgumentException());
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
        return aum_0.cWf().a(79, (long)this.jBf.d(), new Object[0]);
    }

    @Override
    public eIw dNx() {
        return this.jBf;
    }

    static /* synthetic */ void a(bxn bxn2, ayv_2 ayv_22) {
        bxn2.a(ayv_22);
    }
}

