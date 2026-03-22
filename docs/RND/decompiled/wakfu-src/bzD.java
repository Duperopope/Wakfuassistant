/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bzD
extends bCA {
    static final Logger jEd = Logger.getLogger(bzD.class);
    private fds_0 jEe;

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 != rw_0.bkJ) {
            return false;
        }
        this.b(rw_02);
        cus_2.eRQ().a(this);
        this.c(rw_02);
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
    public void dNq() {
        this.jEe = (fds_0)fda_0.rWI.a(fdv_0.rZi, Integer.parseInt(this.baB));
    }

    @Override
    public cpm_1[] dNh() {
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jEe.clf());
        cqf_12.CV(fqy_02.giv());
        return new cpm_1[]{cqf_12};
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(107, this.jEe == null ? -1L : (long)this.jEe.d(), new Object[0]);
    }

    public String getDescription() {
        int n = this.jEe == null ? -1 : this.jEe.d();
        return aum_0.cWf().e(153, n) ? aum_0.cWf().a(153, (long)n, new Object[0]) : null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(true);
        this.bi(true);
        this.jHu = true;
        this.jHv = true;
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDf(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    public fds_0 dOP() {
        return this.jEe;
    }

    static /* synthetic */ void a(bzD bzD2, ayv_2 ayv_22) {
        bzD2.a(ayv_22);
    }
}

