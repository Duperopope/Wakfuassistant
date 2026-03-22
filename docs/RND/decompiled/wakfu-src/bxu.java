/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxu
extends bCA {
    static final Logger jBm = Logger.getLogger(bxu.class);

    bxu() {
    }

    public fpx_0 dNA() {
        return fpx_0.fy(this.bem());
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jBm.info((Object)String.format("Action %s performed by player %s", rw_02, rG.Sn()));
        if (rw_02 != rw_0.bkJ) {
            return false;
        }
        this.b(rw_02);
        this.aVQ();
        this.c(rw_02);
        return true;
    }

    @Override
    public cpm_1[] dNh() {
        cqf_1 cqf_12 = (cqf_1)cps_1.njE.eLI();
        cqf_12.CV(crc_2.nmU.nnW);
        return new cpm_1[]{cqf_12};
    }

    @Override
    public void c(ng_1 ng_12) {
        jBm.info((Object)("Update view : " + String.valueOf(ng_12)));
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
    public String getName() {
        return aum_0.cWf().a(103, (long)this.beA(), new Object[0]);
    }

    static /* synthetic */ void a(bxu bxu2, ayv_2 ayv_22) {
        bxu2.a(ayv_22);
    }
}

