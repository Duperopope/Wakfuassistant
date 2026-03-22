/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bzV
extends bCA {
    static final Logger jEB = Logger.getLogger(bzV.class);
    private static final String jEC = "guild.machine";

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkJ: {
                cva_1.eTu().a(this, bvd_0.juz);
                return true;
            }
            case blo: {
                cva_1.eTu().a(this, bvd_0.juA);
                return true;
            }
            case blp: {
                cva_1.eTu().a(this, bvd_0.juB);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ, rw_0.blo, rw_0.blp};
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    @Override
    public cpm_1[] dNh() {
        cqz_1 cqz_12 = (cqz_1)cps_1.njo.eLI();
        cqz_12.CV(crc_2.nnq.nnW);
        cqz_12.qb("guild.mru.create");
        cqx_1 cqx_12 = (cqx_1)cps_1.njF.eLI();
        cqx_12.e(rw_0.blo);
        cqx_12.CV(crc_2.nnU.nnW);
        cqx_12.setName("guild.mru.change.blazon");
        cqy_1 cqy_12 = (cqy_1)cps_1.njG.eLI();
        cqy_12.e(rw_0.blp);
        cqy_12.CV(crc_2.nnV.nnW);
        cqy_12.setName("guild.mru.change.name");
        return new cpm_1[]{cqz_12, cqx_12, cqy_12};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c(jEC, new Object[0]);
    }

    static /* synthetic */ void a(bzV bzV2, ayv_2 ayv_22) {
        bzV2.a(ayv_22);
    }
}

