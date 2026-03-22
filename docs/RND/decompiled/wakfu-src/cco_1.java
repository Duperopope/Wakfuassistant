/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from ccO
 */
public class cco_1
implements adi_1 {
    private static final cco_1 lPO = new cco_1();
    protected static final Logger lPP = Logger.getLogger(cco_1.class);

    public static cco_1 etV() {
        return lPO;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            return;
        }
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 == null) {
            return;
        }
        if (bso_02.bfr() == RY.bnk) {
            bso_02.a((bsp_0)bso_02.bfm(), Ss.boq);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 12997: {
                cpX cpX2 = (cpX)aam_22;
                bso_0 bso_02 = bsl_0.jfZ.dFt();
                if (bso_02 != null && bso_02.Sn() != cpX2.exN()) {
                    return false;
                }
                bhJ bhJ2 = (bhJ)bgg_0.dlO().ju(cpX2.bfl());
                if (bhJ2 == null) {
                    return false;
                }
                bsp_0 bsp_02 = new bsp_0(bhJ2);
                bsp_0 bsp_03 = new bsp_0(bgt_02);
                bso_0 bso_03 = new bso_0(cpX2.exN(), bsp_02, bsp_03);
                bsn_0 bsn_02 = new bsn_0(bso_03);
                bsp_02.a(bsn_02);
                bsp_03.a(bsn_02);
                if (apd_0.cAO().cAR().ii(bhJ2.Xi()) != null) {
                    bso_03.a(bsp_02, Ss.bow);
                    return false;
                }
                if (AwayCommand.eAb && !AwayCommand.eAc.isEmpty()) {
                    aPd.Q(AwayCommand.eAc, bhJ2.getName());
                    bso_03.a(bsp_02, Ss.boq);
                    return false;
                }
                bso_03.start();
                if (bso_03.bfr() != RY.bnm) {
                    bsl_0.jfZ.a(bso_03);
                }
                return false;
            }
            case 13493: {
                cpw_0 cpw_02 = (cpw_0)aam_22;
                bso_0 bso_04 = bsl_0.jfZ.dFt();
                if (bso_04 != null && bso_04.Sn() != cpw_02.exN()) {
                    return false;
                }
                switch (cpw_02.bks()) {
                    case 0: {
                        bhJ bhJ3 = (bhJ)bgg_0.dlO().ju(cpw_02.exO());
                        bsp_0 bsp_04 = new bsp_0(bgt_02);
                        bsp_0 bsp_05 = new bsp_0(bhJ3);
                        bso_0 bso_05 = new bso_0(cpw_02.exN(), bsp_04, bsp_05);
                        bsn_0 bsn_03 = new bsn_0(bso_05);
                        bsp_04.a(bsn_03);
                        bsp_05.a(bsn_03);
                        bso_05.start();
                        if (bso_05.bfr() == RY.bnm) break;
                        bsl_0.jfZ.a(bso_05);
                        break;
                    }
                    case 3: {
                        if (bso_04 != null) {
                            bhJ bhJ4 = (bhJ)bgg_0.dlO().ju(cpw_02.exO());
                            bso_04.dQ(bhJ4.Sn());
                        }
                        cvo_2.eUK().eUO();
                        break;
                    }
                    case 1: {
                        bhJ bhJ5 = (bhJ)bgg_0.dlO().ju(cpw_02.exP());
                        String string = aum_0.cWf().c("exchange.canceledUserBusy", bhJ5 == null ? "" : bhJ5.getName());
                        fiq_2.gCw().d(fik_2.gBZ().vE(string).vG(ccp_2.mRF.byf()).abQ(1));
                        if (bso_04 == null) break;
                        if (bhJ5 != null) {
                            bso_04.dR(bhJ5.Sn());
                            break;
                        }
                        fiq_2.gCw().a(bso_04.dFw(), false);
                        aue_0.cVJ().b(cur_1.eRP());
                        Sb.bfy().b(bso_04);
                        break;
                    }
                    case 2: {
                        if (bso_04 == null) break;
                        bso_04.a((bsp_0)bso_04.dP(cpw_02.exO()), Ss.bos);
                        break;
                    }
                    case 4: {
                        bhJ bhJ6 = (bhJ)bgg_0.dlO().ju(cpw_02.exO());
                        aPd.e("error.chat.userIgnoreYou", bhJ6.getName());
                        if (bso_04 == null) break;
                        bso_04.dS(bgt_02.Sn());
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

