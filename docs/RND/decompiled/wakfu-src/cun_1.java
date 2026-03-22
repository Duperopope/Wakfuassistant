/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from cUn
 */
public class cun_1
implements adi_1 {
    private static final Logger nLO = Logger.getLogger(cun_1.class);
    public static final cun_1 nLP = new cun_1();
    private alx_2 ikv;
    private boolean nLQ = true;
    private bsi nLR;
    private long nLS = -1L;

    public static cun_1 eRJ() {
        return nLP;
    }

    private cun_1() {
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16682: {
                ccj_2.g("eventsCalendarCreateDialog", 256L);
                this.nLR = new bsi();
                this.nLR.Z(bsf.dEU().dEJ(), bsf.dEU().dEK() + 1, bsf.dEU().dEL());
                fse_1.gFu().f("calendar.event.editable", this.nLR);
                cAY.eHc().eHq();
                return false;
            }
            case 19210: {
                dae_0 dae_02 = (dae_0)aam_22;
                if (dae_02.bCu()) {
                    dbb dbb2 = (dbb)aam_22;
                    this.nLR.eQ(dbb2.bAD());
                    this.nLR.cA(dbb2.getDescription());
                    if (this.nLR.dFc()) {
                        this.nLR.bC(dbb2.faA());
                        this.nLR.bD(dbb2.faB());
                    }
                    cww cww2 = new cww();
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    eTw eTw2 = this.nLR.dFm();
                    cww2.l(eTw2);
                    eTw2.i(bgt_02.Sn(), bgt_02.getName());
                    bse.dEP().c(eTw2);
                    aue_0.cVJ().etu().d(cww2);
                    bsf.dEU().dEX();
                }
                fyw_0.gqw().tl("eventsCalendarCreateDialog");
                this.nLR = null;
                return false;
            }
            case 19697: {
                dbc dbc2 = (dbc)aam_22;
                if (dbc2.faC() == null) {
                    return false;
                }
                this.nLR = new bsi();
                this.nLR.m(dbc2.faC().dFm());
                ccj_2.g("eventsCalendarEditDialog", 256L);
                cAY.eHc().eHq();
                fse_1.gFu().f("calendar.event.editable", this.nLR);
                boolean bl = this.nLR.dFm().Xi() == aue_0.cVJ().cVK().Sn() || this.nLR.dFm().aFW() == 3 && evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ove);
                fse_1.gFu().f("calendar.event.editable.isOwner", bl);
                return false;
            }
            case 17833: {
                dae_0 dae_03 = (dae_0)aam_22;
                if (dae_03.bCu()) {
                    dbb dbb3 = (dbb)aam_22;
                    this.nLR.eQ(dbb3.bAD());
                    this.nLR.cA(dbb3.getDescription());
                    if (this.nLR.dFc()) {
                        this.nLR.bC(dbb3.faA());
                        this.nLR.bD(dbb3.faB());
                    }
                    this.nLR.dFo();
                    bsf.dEU().dEX();
                }
                fyw_0.gqw().tl("eventsCalendarEditDialog");
                this.nLR = null;
                return false;
            }
            case 16642: {
                if (fyw_0.gqw().to("calendarDialog")) {
                    fyw_0.gqw().tl("calendarDialog");
                } else {
                    dae_0 dae_04 = (dae_0)aam_22;
                    this.nLQ = dae_04.bCu();
                    bsd bsd2 = new bsd();
                    ux_0 ux_02 = this.nLQ ? this.nLR.dFm().dis() : this.nLR.dFm().bka();
                    bsd2.F(ux_02);
                    fse_1.gFu().f("calendar.editable", bsd2);
                    ccj_2.g("calendarDialog", 256L);
                    cAY.eHc().eHq();
                }
                return false;
            }
            case 19892: {
                dae_0 dae_05 = (dae_0)aam_22;
                if (this.nLQ) {
                    this.nLR.d((int)dae_05.bCs(), (int)dae_05.bCp(), dae_05.bCn(), dae_05.bCq(), dae_05.bCo());
                } else {
                    this.nLR.e((int)dae_05.bCs(), (int)dae_05.bCp(), dae_05.bCn(), dae_05.bCq(), dae_05.bCo());
                }
                fyw_0.gqw().tl("calendarDialog");
                return false;
            }
            case 16767: {
                cwB cwB2 = new cwB();
                cwB2.nI(this.nLR.dFm().Lx());
                aue_0.cVJ().etu().d(cwB2);
                return false;
            }
            case 19543: {
                cwI cwI2 = new cwI();
                cwI2.nI(this.nLR.dFm().Lx());
                aue_0.cVJ().etu().d(cwI2);
                this.nLR.dFl();
                return false;
            }
            case 19809: {
                fyw_0.gqw().tl("eventsCalendarEditDialog");
                bse.dEP().f(this.nLR.dFn());
                bsf.dEU().dEX();
                cwC cwC2 = new cwC();
                cwC2.nH(this.nLR.dFm().Lx());
                aue_0.cVJ().etu().d(cwC2);
                this.nLR = null;
                return false;
            }
            case 16066: {
                dae_0 dae_06 = (dae_0)aam_22;
                cwK cwK2 = new cwK();
                cwK2.db(dae_06.bCp());
                cwK2.nH(this.nLR.dFm().Lx());
                aue_0.cVJ().etu().d(cwK2);
                return false;
            }
            case 16034: {
                dae_0 dae_07 = (dae_0)aam_22;
                cwJ cwJ2 = new cwJ();
                cwJ2.db(dae_07.bCp());
                cwJ2.nH(this.nLR.dFm().Lx());
                aue_0.cVJ().etu().d(cwJ2);
                return false;
            }
            case 17124: {
                TLongObjectIterator tLongObjectIterator = this.nLR.dFm().fJj().iterator();
                while (tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    if (((String)tLongObjectIterator.value()).equals(aue_0.cVJ().cVK().getName())) continue;
                    dbs dbs2 = new dbs();
                    dbs2.c(Vf.bxK);
                    dbs2.setName((String)tLongObjectIterator.value());
                    aaw_1.bUq().h(dbs2);
                }
                return false;
            }
            case 16189: {
                dae_0 dae_08 = (dae_0)aam_22;
                cwy cwy2 = new cwy();
                cwy2.nH(this.nLR.dFm().Lx());
                cwy2.oz(dae_08.bCt());
                aue_0.cVJ().etu().d(cwy2);
                return false;
            }
        }
        return true;
    }

    public void eRK() {
        if (this.nLR != null) {
            this.nLR.dFj();
        }
    }

    public void eRL() {
        if (this.nLR != null) {
            this.nLR.dFk();
        }
    }

    public void reset() {
        this.nLS = -1L;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            return;
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("eventsCalendarDialog");
            fyw_0.gqw().tc("wakfu.eventsCalendar");
            fse_1.gFu().vX("eventsCalendar");
            cAY.eHc().eHr();
        }
    }
}

