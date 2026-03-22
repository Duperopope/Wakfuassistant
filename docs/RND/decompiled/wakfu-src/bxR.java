/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxR
extends bCA {
    protected static final Logger jBU = Logger.getLogger(bxR.class);
    protected int ciZ;
    protected int jBV;
    protected int jBW;
    private final fi_1 jBX = new bxS(this, 22);

    @Override
    public void aVI() {
        super.aVI();
        this.jHu = true;
        this.jJp = 40;
        this.ciZ = 0;
        this.jBV = 0;
        this.jBW = 0;
        this.bi(true);
        this.bf(false);
    }

    @Override
    protected fi_1 bey() {
        return this.jBX;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case blf: {
                this.b(rw_02);
                this.aVQ();
                this.c(rw_02);
                this.b(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.blf;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.blf};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.challenge." + this.jBV, new Object[0]);
    }

    @Override
    public short chU() {
        return (short)((float)this.bcN() * 10.0f);
    }

    @Override
    public cpm_1[] dNh() {
        cpm_1[] cpm_1Array = new cpm_1[1];
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.CV(this.jBW);
        cqw_12.setName("ie.challenge.mru." + this.jBV);
        cqw_12.e(rw_0.blf);
        cpm_1Array[0] = cqw_12;
        return cpm_1Array;
    }

    @Override
    public void aVS() {
        super.aVS();
    }

    public void aPg() {
        if (this.ciZ == -1) {
            bzj_2.eqi().e(this);
        } else {
            for (ng_1 ng_12 : this.aVG()) {
                if (!(ng_12 instanceof bcs_0)) continue;
                ng_12.nU(this.ciZ);
            }
        }
    }

    static /* synthetic */ void a(bxR bxR2, ayv_2 ayv_22) {
        bxR2.a(ayv_22);
    }

    static /* synthetic */ acd_1 a(bxR bxR2) {
        return bxR2.bmd;
    }
}

