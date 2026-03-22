/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from cXs
 */
public class cxs_1
implements adi_1 {
    protected static final Logger nWg = Logger.getLogger(cxs_1.class);
    private static final cxs_1 nWh = new cxs_1();
    private alx_2 ikv;
    private bvk_0 nWi;
    private long nWj;

    public static cxs_1 eXb() {
        return nWh;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19043: {
                dae_0 dae_02 = (dae_0)aam_22;
                long l = dae_02.bCp();
                this.oE(l);
                return false;
            }
            case 19426: {
                dae_0 dae_03 = (dae_0)aam_22;
                boolean bl = dae_03.bCu();
                long l = dae_03.bCp();
                this.nWi.j(l, bl);
                return false;
            }
            case 17162: {
                dae_0 dae_04 = (dae_0)aam_22;
                String string = dae_04.bCt();
                this.nWi.mA(string);
                aPd.f("group.party.invitationRequestSent", string);
                return false;
            }
            case 19483: {
                dae_0 dae_05 = (dae_0)aam_22;
                long l = dae_05.bCp();
                this.oF(l);
                return false;
            }
        }
        return true;
    }

    public void oE(long l) {
        bzq_2 bzq_22;
        Object object;
        Object object2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bvi_0 bvi_02 = bgt_02.dnQ();
        exz_1 exz_12 = bvi_02.dKL().rw(l);
        if (exz_12 == null) {
            nWg.error((Object)("Can't exclude unknown party member id=" + l));
            return;
        }
        if (l == bgt_02.Sn()) {
            object2 = aum_0.cWf().c("group.party.leave.warn.you", new Object[0]);
        } else {
            object = exz_12.getName();
            object2 = aum_0.cWf().c("group.party.leave.warn.others", object);
        }
        object = bzp_2.eqt().mA(bgt_02.aqZ());
        if (object != null && ((bzq_2)object).eqw()) {
            if (l == bgt_02.Sn()) {
                if (fcL.rUh.sA(bgt_02.Xi()) > 1) {
                    aPd.e("group.error.cannot.exclude.hero.battleground", new Object[0]);
                    return;
                }
            } else {
                boolean bl = fcL.rUh.ax(bgt_02.Xi(), l);
                if (bl) {
                    aPd.e("group.error.cannot.exclude.hero.battleground", new Object[0]);
                    return;
                }
            }
        }
        if ((bzq_22 = bzp_2.eqt().mA(exz_12.aqZ())) != null && bzq_22.eqA() == Vf.bxK) {
            object2 = (String)object2 + "\n" + aum_0.cWf().c("group.party.leave.warn.dungeon", new Object[0]);
        }
        fiq_2.gCw().d(new fik_2().vE((String)object2).vG(ccp_2.mRE.byf()).abQ(1).a(fil_2.gCn()).a(fil_2.gCo()).a((n, string) -> {
            if (n == 400) {
                this.nWi.kO(l);
            }
            if (aue_0.cVJ().c(ctu_2.nJd)) {
                ctu_2.nJd.ePN();
            }
        }));
    }

    public void oF(long l) {
        bvi_0 bvi_02 = aue_0.cVJ().cVK().dnQ();
        exz_1 exz_12 = bvi_02.dKL().rw(l);
        if (exz_12 != null) {
            fiq_2.gCw().d(fik_2.a(string -> this.nWi.kP(l)).l("group.party.giveLead.warn", exz_12.getName()).vG(ccp_2.mRE.byf()).abQ(1));
        } else {
            nWg.error((Object)"On essaye de donner le lead \u00e0 un joueur non pr\u00e9sent en local");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void oG(long l) {
        bvl_0 bvl_02 = this.nWi.kR(l);
        if (bvl_02 != null) {
            bvl_02.dKP();
        }
    }

    public void oH(long l) {
        bvl_0 bvl_02 = this.nWi.kR(l);
        if (bvl_02 != null) {
            bvl_02.dKZ();
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (string.equals("partyListDialog")) {
                aue_0.cVJ().b(cxs_1.eXb());
            }
        };
        fyw_0.gqw().a(this.ikv);
        bgt_0 bgt_02 = null;
        if (fcI.fSM()) {
            bgt_02 = bvz_0.dLl();
        }
        if (bgt_02 == null) {
            bgt_02 = aue_0.cVJ().cVK();
        }
        bvi_0 bvi_02 = bgt_02.dnQ();
        this.nWi = new bvk_0(bvi_02);
        fse_1.gFu().f("partyList", this.nWi);
        ccj_2.g("partyListDialog", 8192L);
        fyw_0.gqw().d("wakfu.partyList", cgc_2.class);
        cAY.eHc().eHq();
        this.nWj = abb_2.bUA().a(new cxt_1(this, bvi_02), 4000L, 159159161);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nWi.clear();
            this.nWi = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("partyListDialog");
            fse_1.gFu().vX("partyList");
            fyw_0.gqw().tc("wakfu.partyList");
            abb_2.bUA().hk(this.nWj);
        }
    }

    public void dRJ() {
        bvi_0 bvi_02;
        if (this.nWi == null) {
            return;
        }
        if (fcI.fSM()) {
            bgt_0 bgt_02 = bvz_0.dLl();
            if (bgt_02 == null) {
                return;
            }
            bvi_02 = bgt_02.dnQ();
        } else {
            bvi_02 = aue_0.cVJ().cVK().dnQ();
        }
        this.nWi.a(bvi_02);
        if (bvi_02.dKL() == null || bvi_02.dKL().aJG()) {
            return;
        }
        Arrays.stream(bvi_02.dKL().fPG().keys()).forEach(this::oJ);
        fse_1.gFu().a((aef_2)this.nWi, bvk_0.jvd);
    }

    public void oI(long l) {
        bvl_0 bvl_02;
        if (this.nWi != null && (bvl_02 = this.nWi.kR(l)) != null) {
            bvl_02.dKW();
        }
    }

    public void oJ(long l) {
        if (this.nWi == null) {
            return;
        }
        bvl_0 bvl_02 = this.nWi.kR(l);
        if (bvl_02 == null) {
            return;
        }
        bvl_02.dLb();
    }

    public bvk_0 eXc() {
        return this.nWi;
    }
}

