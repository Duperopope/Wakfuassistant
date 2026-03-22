/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from byr
 */
public class byr_0
extends bCA
implements bDs,
eIy {
    static final Logger jCx = Logger.getLogger(byr_0.class);
    private static final cpm_1[] jCy = new cpm_1[]{new cqx_2()};
    private bDn jCz;

    byr_0() {
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return true;
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
        if (this.jCz == null) {
            jCx.error((Object)("Pas de m_info pour craftTableId=" + this.aXv));
            return jCy;
        }
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jCz.clf());
        if (fqy_02 == null) {
            jCx.error((Object)("Pas de visual id=" + this.jCz.clf()));
            return jCy;
        }
        cqg_2 cqg_22 = (cqg_2)cps_1.niK.eLI();
        cqg_22.b(fqy_02);
        boolean bl = this.c(fcs_0.rUy);
        if (!bl) {
            cqg_2 cqg_23 = (cqg_2)cps_1.njj.eLI();
            cqg_23.b(fqy_02);
            return new cpm_1[]{cqg_22, cqg_23};
        }
        return new cpm_1[]{cqg_22};
    }

    @Override
    public short chU() {
        return this.bcN();
    }

    @Override
    public String getName() {
        if (this.jCz == null) {
            jCx.error((Object)("Pas de param\u00e9trage valide pour craftTableId=" + this.aXv));
            return "#ERROR#";
        }
        return aum_0.cWf().a(59, (long)this.jCz.d(), new Object[0]);
    }

    @Override
    public boolean i(int n, byte by) {
        return by == -2 || by == -1 || this.jCz.fTq().contains(n);
    }

    @Override
    public boolean Gb(int n) {
        return this.jCz.fTq().contains(n);
    }

    @Override
    public int clf() {
        if (this.jCz == null) {
            return -1;
        }
        return this.jCz.clf();
    }

    @Override
    public int cms() {
        return this.jCz.cms();
    }

    @Override
    public void dNq() {
        bDn bDn2 = (bDn)fda_0.rWI.a(fdv_0.rYT, Integer.valueOf(this.baB));
        if (bDn2 == null) {
            jCx.error((Object)("[LD] La Machine de Craft " + this.aXv + " \u00e0 un param\u00e8tre [" + Integer.valueOf(this.baB) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jCz = bDn2;
        this.ht(true);
    }

    @Override
    public void aVS() {
        super.aVS();
        if (aue_0.cVJ().c(ctg_1.eQG())) {
            ctg_1.eQG().a(this);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jCz = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        assert (this.jCz == null);
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    public eIw dNx() {
        return this.jCz;
    }

    @Override
    public bDn dOd() {
        return this.jCz;
    }

    static /* synthetic */ void a(byr_0 byr_02, ayv_2 ayv_22) {
        byr_02.a(ayv_22);
    }
}

