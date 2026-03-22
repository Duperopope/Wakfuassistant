/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bzw
extends bCA {
    static final Logger jDU = Logger.getLogger(bzw.class);

    bzw() {
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        cui_1.eRw().eRz();
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
    public cpm_1[] dNh() {
        cpm_1[] cpm_1Array = new cpm_1[1];
        Object a2 = cps_1.njI.eLI();
        cpm_1Array[0] = a2;
        return cpm_1Array;
    }

    @Override
    public short chU() {
        return 60;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("enchantment.machine.name", new Object[0]);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(false);
        this.bi(true);
        this.jHu = true;
        this.jHv = true;
    }

    static /* synthetic */ void a(bzw bzw2, ayv_2 ayv_22) {
        bzw2.a(ayv_22);
    }
}

