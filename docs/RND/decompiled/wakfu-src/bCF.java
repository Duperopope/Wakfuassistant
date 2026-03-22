/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bCF
extends bCA {
    static final Logger jJI = Logger.getLogger(bCF.class);
    private boolean jJJ;

    @Override
    public void c(ng_1 ng_12) {
        jJI.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkS: {
                if (this.bmf == 1 && !this.jJJ) {
                    jJI.info((Object)("Action [" + String.valueOf(rw_02) + "] performed on interactive element : " + this.Sn()));
                    bqm_0.jbp.b(new brT(this.Sn()));
                    this.c(rw_02, rG);
                } else {
                    jJI.info((Object)("Action [" + String.valueOf(rw_02) + "] ignored on interactive element : " + this.Sn()));
                }
                this.jJJ = true;
                return true;
            }
            case bkT: {
                if (this.bmf == 1 && this.jJJ) {
                    jJI.info((Object)("Action [" + String.valueOf(rw_02) + "] performed on interactive element : " + this.Sn()));
                    this.d(rw_02, rG);
                } else {
                    jJI.info((Object)("Action [" + String.valueOf(rw_02) + "] ignored on interactive element : " + this.Sn()));
                }
                this.jJJ = false;
                return true;
            }
        }
        jJI.info((Object)("Action [" + String.valueOf(rw_02) + "] not processed on interactive element : " + this.Sn()));
        return false;
    }

    protected void d(rw_0 rw_02, RG rG) {
        this.e(rw_02, rG);
    }

    protected void c(rw_0 rw_02, RG rG) {
        this.e(rw_02, rG);
    }

    protected void e(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        this.aVQ();
        this.c(rw_02);
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkS;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkS, rw_0.bkT, rw_0.bkO};
    }

    public boolean dQC() {
        return this.jJJ;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jJJ = false;
    }

    static /* synthetic */ void a(bCF bCF2, ayv_2 ayv_22) {
        bCF2.a(ayv_22);
    }
}

