/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxx
extends bCA {
    static final Logger jBo = Logger.getLogger(bxx.class);

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 != rw_0.bkJ) {
            return false;
        }
        this.b(rw_02);
        aIq.cgr().cgs();
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
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.niQ.eLI()};
    }

    @Override
    public String getName() {
        return "TODO Clem: Lit";
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

    static /* synthetic */ void a(bxx bxx2, ayv_2 ayv_22) {
        bxx2.a(ayv_22);
    }
}

