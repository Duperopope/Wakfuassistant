/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bzS
extends bCA {
    static final Logger jEz = Logger.getLogger(bzS.class);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 != rw_0.bkJ) {
            return false;
        }
        this.b(rw_02);
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
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
        this.hu(true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bf(false);
        this.bi(false);
        this.ht(false);
        this.hu(false);
    }

    @Override
    public cpm_1[] dNh() {
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        cqf_12.CV(crc_2.nmA.nnW);
        return new cpm_1[]{cqf_12};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("guild.ladder", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    static /* synthetic */ void a(bzS bzS2, ayv_2 ayv_22) {
        bzS2.a(ayv_22);
    }
}

