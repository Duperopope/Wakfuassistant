/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class byZ
extends bCA {
    protected static final Logger jDs = Logger.getLogger(byZ.class);
    private static final byte jDt = 0;
    private static final byte jDu = 1;

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jDs.info((Object)("Action performed on interactive element : " + String.valueOf(rw_02)));
        this.b(rw_02);
        switch (rw_02) {
            case bkJ: {
                this.c(rw_02);
                boolean bl = this.bem() == 1;
                cnf_0 cnf_02 = new cnf_0();
                cnf_02.jp(bl);
                aue_0.cVJ().etu().d(cnf_02);
                cAY.eHc().nP(bl ? 600143L : 600142L);
                return true;
            }
            case blo: {
                ctr_1 ctr_12 = ctr_1.eRg();
                if (aue_0.cVJ().c(ctr_12)) {
                    aue_0.cVJ().b(ctr_12);
                } else {
                    aue_0.cVJ().a(ctr_12);
                }
                return true;
            }
            case blp: {
                boolean bl;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                boolean bl2 = bl = bgt_02.dnw() == bgt_02.dnx();
                if (!bl) break;
                bnn_1 bnn_12 = bgt_02.dnx().dyV();
                boolean bl3 = !bnn_12.gey();
                aue_0.cVJ().etu().d(new cne_0(bl3));
                bnn_12.nE(bl3);
                aPh.czg().iZ(aum_0.cWf().c(bl3 ? "chat.notify.dimensionalBag.bagRemainAtDisconnection" : "chat.notify.dimensionalBag.bagDoesntRemainAtDisconnection", new Object[0]));
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
        return new rw_0[]{rw_0.bkJ, rw_0.blo, rw_0.blp};
    }

    @Override
    public cpm_1[] chR() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02.dnw() == bgt_02.dnx();
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.e(rw_0.bkJ);
        if (this.bem() == 0) {
            cqw_12.CV(crc_2.nmO.nnW);
            cqw_12.setName("desc.mru.dimensionalBag.unlock");
        } else {
            cqw_12.CV(crc_2.nmP.nnW);
            cqw_12.setName("desc.mru.dimensionalBag.lock");
        }
        cqw_12.setEnabled(bl);
        cqw_1 cqw_13 = (cqw_1)cps_1.niR.eLI();
        cqw_13.e(rw_0.blo);
        cqw_13.CV(crc_2.nmD.nnW);
        cqw_13.setName("desc.mru.managePermissions");
        cqw_13.setEnabled(bl);
        cqw_1 cqw_14 = (cqw_1)cps_1.niR.eLI();
        cqw_14.e(rw_0.blp);
        cqw_14.CV(crc_2.nmV.nnW);
        if (bgt_02.dnx().dyV().gey()) {
            cqw_14.setName("desc.mru.dimensionalBag.doesntLeaveBagAtDisconnection");
        } else {
            cqw_14.setName("desc.mru.dimensionalBag.leaveBagAtDisconnection");
        }
        cqw_14.setEnabled(bl);
        return new cpm_1[]{cqw_12, cqw_13, cqw_14};
    }

    @Override
    public short chU() {
        return (short)((float)this.bcN() * 10.0f);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)0);
        this.bf(true);
        this.bi(true);
        this.hu(true);
        this.hw(false);
        this.hv(true);
        this.ht(true);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.dimensional.bag.lock.console", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    static /* synthetic */ void a(byZ byZ2, ayv_2 ayv_22) {
        byZ2.a(ayv_22);
    }
}

