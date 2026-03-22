/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from byN
 */
public class byn_0
extends bCA {
    protected static final Logger jDa = Logger.getLogger(byn_0.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.bf(false);
        this.bi(true);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.dimensional.bag.craft.console", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    protected fi_1 bey() {
        return fi_1.oX;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        switch (rw_02) {
            case bkJ: {
                cto_2 cto_22 = cto_2.eQY();
                if (!aue_0.cVJ().c(cto_22)) {
                    aue_0.cVJ().a(cto_22);
                } else {
                    aue_0.cVJ().b(cto_22);
                }
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
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public cpm_1[] dNh() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02.dnw() == bgt_02.dnx();
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.e(rw_0.bkJ);
        cqw_12.CV(crc_2.nmM.nnW);
        cqw_12.setName("desc.mru.manageCraftFee");
        cqw_12.setEnabled(bl);
        return new cpm_1[]{cqw_12};
    }

    static /* synthetic */ void a(byn_0 byn_02, ayv_2 ayv_22) {
        byn_02.a(ayv_22);
    }
}

