/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cUa
 */
public class cua_2
implements adi_1 {
    private static final cua_2 nLj = new cua_2();
    protected static final Logger nLk = Logger.getLogger(cua_2.class);
    private bnw_0 nLl;
    private int ejK = -1;
    private boolean nLm = false;
    private alx_2 ikv;

    public static cua_2 eRq() {
        return nLj;
    }

    private cua_2() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19191: {
                ama_1 ama_12 = (ama_1)aam_22;
                int n = ama_12.bCo();
                this.MQ(n);
                return false;
            }
            case 18986: {
                ama_1 ama_13 = (ama_1)aam_22;
                this.nLl.bx(ama_13.bCn());
                return false;
            }
            case 16571: {
                ama_1 ama_14 = (ama_1)aam_22;
                String string = ama_14.bCt();
                if (!string.equals(this.nLl.dwS())) {
                    this.nLl.md(string);
                }
                return false;
            }
            case 17935: {
                ama_1 ama_15 = (ama_1)aam_22;
                short s = ama_15.bCq();
                if (s != this.nLl.dfu()) {
                    this.nLl.bn(s);
                }
                return false;
            }
            case 17408: {
                ama_1 ama_16 = (ama_1)aam_22;
                short s = ama_16.bCq();
                if (s != this.nLl.dfv()) {
                    this.nLl.bo(s);
                }
                return false;
            }
            case 16060: {
                ama_1 ama_17 = (ama_1)aam_22;
                Bu bu = (Bu)ama_17.bCv();
                this.nLl.F((Short)bu.getFirst(), (Short)bu.aHI());
                return false;
            }
            case 18888: {
                dae_0 dae_02 = (dae_0)aam_22;
                eIc eIc2 = (eIc)dae_02.bCv();
                if (eIc2 != this.nLl.dzX()) {
                    this.nLl.a(eIc2);
                }
                return false;
            }
            case 16094: {
                dae_0 dae_03 = (dae_0)aam_22;
                Boolean bl = (Boolean)dae_03.bCv();
                this.nLl.d(bl);
                return false;
            }
            case 18359: {
                ama_1 ama_18 = (ama_1)aam_22;
                boolean bl = ama_18.bCu();
                List list = (List)fse_1.gFu().vY("heroesParty");
                int n = list.size();
                if (n == 0) {
                    return false;
                }
                int n2 = bl ? (this.nLl.dzO() - 1 + n) % n : (this.nLl.dzO() + 1 + n) % n;
                this.nLl.EE(n2);
                fse_1.gFu().a((aef_2)this.nLl, "hero");
                return false;
            }
            case 18615: {
                boolean bl = this.nLl.EG(0);
                if (!bl) {
                    this.MS(0);
                }
                return false;
            }
            case 19011: {
                int n = this.nLl.dAa();
                boolean bl = this.nLl.EG(n);
                if (!bl) {
                    this.MS(n);
                }
                return false;
            }
            case 18815: {
                int n;
                ama_1 ama_19 = (ama_1)aam_22;
                boolean bl = ama_19.bCu();
                int n3 = n = bl ? this.nLl.dfz() - 1 : this.nLl.dfz() + 1;
                if (bl ? !this.nLl.dzY() : !this.nLl.dzZ()) {
                    return false;
                }
                boolean bl2 = this.nLl.EG(n);
                if (!bl2) {
                    if (bl) {
                        this.nLl.dzM();
                    } else {
                        this.nLl.dzN();
                    }
                    fse_1.gFu().a((aef_2)this.nLl, "canGoBack", "canGoForward");
                    this.MS(n);
                }
                return false;
            }
            case 17241: {
                ama_1 ama_110 = (ama_1)aam_22;
                int n = ama_110.bCo();
                eMR eMR2 = eMR.fe((byte)n);
                if (eMR2 != eMR.qNU) {
                    fyw_0.gqw().tl("ladderRewardsDialog");
                }
                if (eMR2 != this.nLl.dzQ()) {
                    this.nLl.a(eMR2);
                    this.MS(0);
                }
                return false;
            }
            case 18777: {
                ama_1 ama_111 = (ama_1)aam_22;
                int n = ama_111.bCo();
                eMN eMN2 = eMN.RB(n);
                if (eMN2 != this.nLl.dzR()) {
                    this.nLl.a(eMN2);
                    this.MS(0);
                }
                return false;
            }
            case 16225: {
                ama_1 ama_112 = (ama_1)aam_22;
                String string = ama_112.bCt();
                if (this.nLl.dzR() != eMN.qNx) {
                    this.nLl.a(eMN.qNx);
                }
                this.qw(string);
                return false;
            }
            case 17022: {
                this.MS(0);
                return false;
            }
            case 16737: {
                this.nLl.gJ(((ama_1)aam_22).bCu());
                return false;
            }
            case 16666: {
                int n = ((ama_1)aam_22).bCo();
                this.MP(n);
                return false;
            }
        }
        return true;
    }

    private void MP(int n) {
        cnz_0 cnz_02 = new cnz_0(n);
        aue_0.cVJ().etu().d(cnz_02);
    }

    public void MQ(int n) {
        this.nLl.dzL();
        this.nLl.aVJ();
        this.nLl.EC(n);
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 != null && eIb2.cmT() || cua_2.MR(n)) {
            this.eI(n, 0);
        }
        if (eIb2 != null && bny_0.EJ(n)) {
            cwv cwv2 = new cwv();
            cwv2.Lr(n);
            cwv2.dL(eMR.qNU.aZv());
            aue_0.cVJ().etu().d(cwv2);
        }
        fse_1.gFu().a((aef_2)this.nLl, "displayRewardsInfo");
        fse_1.gFu().a((aef_2)this.nLl, "hero");
    }

    private static boolean MR(int n) {
        return bwz_0.jAA.FY(n).isPresent();
    }

    private void eI(int n, int n2) {
        switch (this.nLl.dzR()) {
            case qNy: {
                cwt cwt2 = new cwt();
                eMR eMR2 = this.nLl.dzQ();
                cwt2.Lr(n);
                cwt2.dL(eMR2.aZv());
                cwt2.jQ(aue_0.cVJ().cVK().dpI().Ya());
                aue_0.cVJ().etu().d(cwt2);
                break;
            }
            default: {
                cws cws2 = new cws();
                eMR eMR3 = this.nLl.dzQ();
                cws2.Lr(n);
                cws2.dL(eMR3.aZv());
                int n3 = n2 * 12;
                cws2.Lq(n3);
                aue_0.cVJ().etu().d(cws2);
            }
        }
    }

    private void qw(String string) {
        cwu cwu2 = new cwu();
        eMR eMR2 = this.nLl.dzQ();
        int n = this.nLl.dzP();
        cwu2.dL(eMR2.aZv());
        cwu2.setName(string);
        cwu2.Lr(n);
        aue_0.cVJ().etu().d(cwu2);
    }

    private void MS(int n) {
        int n2 = this.nLl.dzP();
        this.eI(n2, n);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cub_2(this);
            this.nLl = new bnw_0();
            List list = (List)fse_1.gFu().vY("heroesParty");
            for (int i = 0; i < list.size(); ++i) {
                if (((bgt_0)list.get(i)).dmc()) continue;
                this.nLl.EE(i);
            }
            fse_1.gFu().f("dungeonList", this.nLl);
            fyw_0.gqw().a(this.ikv);
            if (this.nLm) {
                ccj_2.g("dungeonDialog", 256L);
            } else {
                ccj_2.g("dungeonDialog", 32768L);
            }
            fse_1.gFu().b("dungeonLadderOpenedRewards", false, "dungeonDialog");
            fyw_0.gqw().d("wakfu.dungeon", cet_1.class);
            long l = aue_0.cVJ().cVK().aqZ();
            Optional<eIb> optional = eId.quO.pC(l);
            if (optional.isPresent()) {
                var7_7 = optional.get().d();
                this.MQ(var7_7);
            } else if (this.ejK > 0) {
                this.MQ(this.ejK);
            } else {
                var7_7 = bwz_0.jAA.kU(l);
                if (var7_7 > 0) {
                    this.MQ(var7_7);
                } else {
                    this.MQ(this.nLl.dzS().getFirst().d());
                }
            }
            ux_0 ux_02 = ue_0.bjV().bjc();
            if (!ewo_0.oBF.k(ewr_0.oEo) && ux_02.bjG() < eMM.qNg.bjG() && ux_02.bjI() <= eMM.qNg.bjI()) {
                fiq_2.gCw().d(fik_2.gBZ().l("dungeon.ladder.date.unlock", new Object[0]).abQ(2).vG(ccp_2.mRF.byf()).pd(true));
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("dungeonDialog");
            fyw_0.gqw().tl("ladderRewardsDialog");
            fyw_0.gqw().tc("wakfu.dungeon");
            fse_1.gFu().vX("dungeonList");
        }
    }

    public bnw_0 eRr() {
        return this.nLl;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void Lr(int n) {
        this.ejK = n;
    }

    public void kl(boolean bl) {
        this.nLm = bl;
    }

    public void MT(int n) {
        if (aue_0.cVJ().c(this)) {
            this.MQ(n);
        } else {
            this.ejK = n;
            aue_0.cVJ().a(this);
        }
    }
}

