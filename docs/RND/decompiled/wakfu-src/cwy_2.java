/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWY
 */
public class cwy_2
implements adi_1 {
    private static final Logger nUb = Logger.getLogger(cwy_2.class);
    public static final cwy_2 nUc = new cwy_2();
    private static final int nUd = 5000;
    private static final int nUe = 6000;
    private static final int nUf = 15000;
    private static final int nUg = 16000;
    private final bix_1 nUh = new bix_1();

    private cwy_2() {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        cdv_0.euj().d(this);
        fse_1.gFu().f("stackedNotifications", this.nUh);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        cdv_0.euj().e(this);
        fse_1.gFu().vX("stackedNotifications");
        this.nUh.dZM();
        fyw_0.gqw().tl("notificationDialog");
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17786: {
                this.a((dbr)aam_22);
                return false;
            }
            case 19324: {
                biy_1 biy_12 = (biy_1)((dae_0)aam_22).bCv();
                biy_12.dZQ();
                this.j(biy_12);
                return false;
            }
            case 19758: {
                biy_1 biy_13 = (biy_1)((dae_0)aam_22).bCv();
                biy_13.dZR();
                this.j(biy_13);
                return false;
            }
            case 19807: {
                this.a((dbw)aam_22);
                return false;
            }
        }
        return true;
    }

    public void y(String string, int n) {
        biw_1.mT(string).Hg(5000).Hh(6000).Hi(n).dZz();
    }

    private void a(dbw dbw2) {
        String string = aum_0.cWf().c("group.guild.invitation", dbw2.aXl(), dbw2.HR());
        biy_1 biy_12 = biw_1.mT(string).Hf(15000).Hh(16000).Hi(4).hR(true).r(() -> {
            aue_0.cVJ().etu().d(new cwv_0(true));
            cxh_2.eWL();
        }).hS(true).s(() -> aue_0.cVJ().etu().d(new cwv_0(false))).t(() -> aue_0.cVJ().etu().d(new cwv_0(false))).dZz();
        biy_12.u(() -> cvg_2.eTB().i(biy_12));
        cvg_2.eTB().h(biy_12);
    }

    private void a(dbr dbr2) {
        String string = "group.party.invitation";
        StringBuilder stringBuilder = new StringBuilder();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        stringBuilder.append(aum_0.cWf().c("group.party.invitation", dbr2.aXl()));
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqA() == Vf.bxK && bzq_22.eqx()) {
            stringBuilder.append(System.lineSeparator()).append(aum_0.cWf().c("group.party.leave.warn.dungeon", new Object[0]));
        }
        biw_1.mT(stringBuilder.toString()).Hi(3).hR(true).r(() -> this.a(dbr2, true)).hS(true).s(() -> this.a(dbr2, false)).t(() -> this.a(dbr2, false)).dZz();
    }

    private void a(dbr dbr2, boolean bl) {
        ot_0 ot_02 = new ot_0();
        ot_02.aP(bl);
        ot_02.cY(dbr2.aXl());
        ot_02.dc(dbr2.aXm());
        ot_02.F(Vf.bxK.bkm());
        aue_0.cVJ().etu().d(ot_02);
    }

    public void j(biy_1 biy_12) {
        this.nUh.c(biy_12);
        biy_12.dZT();
        this.dZP();
    }

    public void b(biy_1 biy_12) {
        this.nUh.c(biy_12);
        this.nUh.b(biy_12);
        this.dZO();
    }

    private void dZP() {
        this.nUh.dZP();
    }

    private void dZO() {
        this.nUh.dZO();
    }

    public void k(biy_1 biy_12) {
        this.nUh.a(biy_12);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

