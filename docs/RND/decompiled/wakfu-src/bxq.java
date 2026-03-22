/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxq
extends bCA {
    static final Logger jBi = Logger.getLogger(bxq.class);
    private static final int jBj = 31;

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bli: {
                jBi.info((Object)"[BallotBox] vote d'un candidat");
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bli;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bli};
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
        return cpm_1.nip;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.urne", new Object[0]);
    }

    static /* synthetic */ void a(bxq bxq2, ayv_2 ayv_22) {
        bxq2.a(ayv_22);
    }
}

