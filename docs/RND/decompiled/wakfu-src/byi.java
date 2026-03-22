/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class byi
extends bCA {
    static final Logger jCn = Logger.getLogger(byi.class);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkX: {
                bkt_1 bkt_12 = new bkt_1(this);
                if (!bkt_12.dsn()) {
                    jCn.error((Object)"[COIN_MACHINE] Impossible de d\u00e9marrer le browsing");
                    return false;
                }
                bkt_12.bIH();
                this.c(rw_02);
            }
            case bkY: {
                this.b(rw_02);
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
            case bkV: {
                this.b(rw_02);
                this.c(rw_02);
                return true;
            }
            case bkW: {
                this.b(rw_02);
                this.c(rw_02);
                return true;
            }
            case bkJ: {
                this.b(rw_02);
                this.c(rw_02);
                return true;
            }
        }
        jCn.error((Object)("Impossible d'effectuer l'action " + String.valueOf(rw_02)), (Throwable)new IllegalArgumentException());
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkX, rw_0.bkY, rw_0.bkV, rw_0.bkJ, rw_0.bkW};
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    @Override
    public boolean dNL() {
        return false;
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.niQ.eLI()};
    }

    @Override
    public String getName() {
        return "TODO Clem: Bandit-manchot";
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    static /* synthetic */ void a(byi byi2, ayv_2 ayv_22) {
        byi2.a(ayv_22);
    }
}

