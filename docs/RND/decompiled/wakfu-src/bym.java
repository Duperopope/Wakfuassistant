/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bym
extends bCA
implements bld_0 {
    static final Logger jCq = Logger.getLogger(bym.class);
    private fdl jCr;
    private blf_0 jCs;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        switch (rw_02) {
            case bkV: {
                try {
                    bke_1 bke_12 = new bke_1(this, new byn_1(this));
                    if (!bke_12.dsn()) {
                        jCq.error((Object)"[IE] Impossible de d\u00e9marrer le browsing");
                        return false;
                    }
                    bke_12.bIH();
                    this.c(rw_02);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    jCq.error((Object)"[IE] Impossible de d\u00e9marrer le browsing", (Throwable)unsupportedOperationException);
                    return false;
                }
                return true;
            }
            case bkW: {
                aue_0.cVJ().b(ble_0.itc);
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
        }
        jCq.error((Object)("Action non trait\u00e9e sur une Collector : " + String.valueOf(rw_02)));
        return false;
    }

    @Override
    public eJy djj() {
        return (eJy)((Object)this.jCs);
    }

    @Override
    public fdl djh() {
        return this.jCr;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(86, (long)this.jCr.d(), new Object[0]);
    }

    @Override
    public void dT(byte[] byArray) {
        this.jCs.cg(byArray);
    }

    @Override
    public bCA dji() {
        return this;
    }

    @Override
    public cpm_1[] dNh() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jCr.clf());
        cpm_1[] cpm_1Array = new cpm_1[1];
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        cqf_12.CV(fqy_02.giv());
        cqf_12.qb("desc.mru." + fqy_02.giw());
        cpm_1Array[0] = cqf_12;
        return cpm_1Array;
    }

    @Override
    public void dNq() {
        this.jCr = (fdl)fda_0.rWI.a(fdv_0.rZb, Integer.valueOf(this.baB));
        this.jCs = this.jCr.fTp() ? new blh_0(this.jCr) : new blg_0(this.jCr);
        this.ht(true);
        this.bi(true);
        this.bf(true);
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jCr = null;
        this.jCs = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        assert (this.jCr == null);
        assert (this.jCs == null);
    }

    @Override
    public String toString() {
        return "Collector : \r\nm_info=" + String.valueOf(this.jCr) + "\r\nm_inventory=" + String.valueOf(this.jCs);
    }

    static /* synthetic */ void a(bym bym2, ayv_2 ayv_22) {
        bym2.a(ayv_22);
    }
}

