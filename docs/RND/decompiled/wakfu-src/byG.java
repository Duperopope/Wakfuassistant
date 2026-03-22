/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class byG
extends bCA {
    static final Logger jCS = Logger.getLogger(byG.class);

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)0);
        this.setVisible(true);
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.dimensionalBagAdminConsole", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
        jCS.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    protected fi_1 bey() {
        return fi_1.oX;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        aie_0.cfn();
        aue_0 aue_02 = aie_0.cfo();
        switch (rw_02) {
            case bkJ: {
                if (!aue_02.c(ctt_2.eRh())) {
                    aue_02.a(ctt_2.eRh());
                } else {
                    aue_02.b(ctt_2.eRh());
                }
                return true;
            }
            case blo: {
                if (!aue_02.c(ctl_1.eQV())) {
                    aue_02.a(ctl_1.eQV());
                } else {
                    aue_02.b(ctl_1.eQV());
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
        return new rw_0[]{rw_0.bkJ, rw_0.blo};
    }

    @Override
    public cpm_1[] dNh() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02.dnw() == bgt_02.dnx();
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.e(rw_0.bkJ);
        cqw_12.CV(crc_2.nnk.nnW);
        cqw_12.setName("desc.mru.manageRooms");
        cqw_12.setEnabled(bl);
        cqw_1 cqw_13 = (cqw_1)cps_1.niR.eLI();
        cqw_13.e(rw_0.blo);
        cqw_13.CV(crc_2.nmp.nnW);
        cqw_13.setName("desc.mru.manageBagAppearance");
        cqw_13.setEnabled(bl);
        return new cpm_1[]{cqw_12, cqw_13};
    }

    @Override
    public byte bcN() {
        return 4;
    }

    static /* synthetic */ void a(byG byG2, ayv_2 ayv_22) {
        byG2.a(ayv_22);
    }
}

