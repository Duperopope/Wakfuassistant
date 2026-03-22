/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bxd
 */
public class bxd_0
extends bCA {
    static final Logger jAR = Logger.getLogger(bxd_0.class);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkV: {
                this.b(rw_02);
                bkd_2 bkd_22 = new bkd_2(this);
                if (!bkd_22.dsn()) {
                    jAR.error((Object)"[Account Chest] Impossible to start browsing account chest");
                    return false;
                }
                bkd_22.bIH();
                this.c(rw_02);
                return true;
            }
            case bkW: {
                this.b(rw_02);
                if (aue_0.cVJ().c(csb_1.nEA)) {
                    aue_0.cVJ().b(csb_1.nEA);
                }
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
        }
        jAR.error((Object)("Impossible d'effectuer l'action " + String.valueOf(rw_02)), (Throwable)new IllegalArgumentException());
        return false;
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
        return new cpm_1[]{cps_1.njJ.eLI()};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("account.chest.title", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    static /* synthetic */ void a(bxd_0 bxd_02, ayv_2 ayv_22) {
        bxd_02.a(ayv_22);
    }
}

