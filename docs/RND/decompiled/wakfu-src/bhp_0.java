/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bhp
 */
public final class bhp_0
implements bca_2 {
    private static final Logger igk = Logger.getLogger(bhp_0.class);
    private final long igl;
    private final bcd_2 igm;
    ahk_1 ign;
    bhu igo = bhu.igv;
    final ArrayList<Runnable> igp = new ArrayList();
    private final Runnable igq = new bht(this);

    public bhp_0(long l, bcd_2 bcd_22) {
        this.igl = l;
        this.igm = bcd_22;
    }

    @Override
    public void b(bcj_1 bcj_12) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.igl);
        if (!bcj_12.daS().a(bgt_02)) {
            return;
        }
        bci_1 bci_12 = this.e(bcj_12);
        bcc_2 bcc_22 = bcm_1.hIK.s(this.igl, bcj_12.d());
        bcc_22.dbO();
        bci_12.dcn();
        bci_12.dbB();
        this.a(bcj_12.daS(), bgt_02);
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        if (bsg_12.a(bsn_1.ljM) || bsg_12.a(bsn_1.liO)) {
            bsg_12.a((afe)bsn_1.ljM, true);
            czm_2.eZa();
            csc_1.Mo(bcj_12.daS().d());
        }
        if (this.d(bcj_12) && bhu.igw.a(this.igo)) {
            this.igo = bhu.igw;
            if (this.ign != null) {
                this.ign.ccF();
            }
            this.ign = cAY.eHc().a(600074L, 0.4f, 100, 1500, 2200);
            this.CT(2200);
        }
    }

    private boolean d(bcj_1 bcj_12) {
        return bbv_2.a(bcj_12, (bhJ)fcL.rUh.sw(this.igl));
    }

    @Override
    public void a(bbu_2 bbu_22) {
        bsg_1 bsg_12;
        if (!bbu_22.a((PO)fcL.rUh.sw(this.igl))) {
            return;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        bbu_22.dd(ux_02.bjB());
        if (bhu.igx.a(this.igo)) {
            this.igo = bhu.igx;
            if (this.ign != null) {
                this.ign.ccF();
            }
            this.ign = cAY.eHc().a(600075L, 0.4f, 100, 1500, 3300);
            this.CT(3300);
        }
        if ((bsg_12 = (bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljM) || bsg_12.a(bsn_1.liO)) {
            bsg_12.a((afe)bsn_1.ljM, true);
            czm_2.eZa();
        }
        bci_2.hDG.Bi(bbu_22.d());
        bci_1 bci_12 = bcm_1.hIK.t(this.igl, bbu_22.d());
        bci_12.fo(true);
        bci_12.dco();
        bci_2.hDG.daP();
        if (!bbu_22.cje()) {
            return;
        }
        byq_2.k(bci_12);
        boolean bl = bcm_1.hIK.w(this.igl, bbu_22.d());
        if (bl) {
            String string = new ahv_2().ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0])).cev().ceL();
            aPd.f("quest.completedChatMessage", string);
        } else {
            csc_1.eNJ().j(bbu_22);
        }
        if (bhp_0.a(this.igm, bbu_22)) {
            this.i(bbu_22);
        }
    }

    @Override
    public void b(bbu_2 bbu_22) {
        Object object;
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.igl);
        if (!bbu_22.a(bgt_02)) {
            return;
        }
        bcy_1 bcy_12 = bcm_1.hIK.u(this.igl, bbu_22.dat().d());
        bcy_12.dbJ();
        bca_1 bca_12 = csc_1.eNJ().eNK();
        if (bca_12 != null) {
            bcm_1.hIK.v(this.igl, bbu_22.d()).a(bca_12);
        }
        if (bhp_0.a(this.igm, bbu_22)) {
            this.i(bbu_22);
        }
        if (bcm_1.hIK.w(this.igl, bbu_22.d())) {
            if (bbu_22.cjo() != -1) {
                this.g(bbu_22);
            }
            bci_2.hDG.Bh(bbu_22.d());
            object = new ahv_2();
            ((ahv_2)object).ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0])).cev();
            String string = ((ahv_2)object).ceL();
            aPd.f("quest.activatedChatMessage", string);
            fse_1.gFu().f("followedQuestsDisplay", true);
            abg_2.bUP().a((Runnable)new bhq(this), 5000L, 1);
            bci_2.hDG.daP();
            this.a(bbu_22, bgt_02);
        }
        object = bcm_1.hIK.t(this.igl, bbu_22.d());
        ((bci_1)object).fn(true);
        ((bci_1)object).dco();
    }

    private void a(bbu_2 bbu_22, bgt_0 bgt_02) {
        if (bgt_02.i(ezj_0.ptt) || bbu_22.cjr()) {
            long l = bgt_02.aqZ();
            ArrayList<bcj_1> arrayList = bbu_22.dau();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                bcj_1 bcj_12 = arrayList.get(i);
                if (bcj_12.daJ() || !bcj_12.daW() || !bbv_2.a(bcj_12, bgt_02) || bcj_12.jf(l)) continue;
                bcm_1.hIK.a(this.igl, bcj_12.d(), l);
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void g(bbu_2 bbu_22) {
        int n = bbu_22.cjo() * 1000;
        if (n < 0) {
            return;
        }
        bhr_0 bhr_02 = new bhr_0(this, bbu_22);
        ArrayList<Runnable> arrayList = this.igp;
        synchronized (arrayList) {
            this.igp.add(bhr_02);
            abg_2.bUP().a((Runnable)bhr_02, n, 1);
        }
    }

    boolean dov() {
        return cwz_1.eWv().eWA() || !cwz_1.eWv().a(biu_1.kiG) && !cwz_1.eWv().a(biu_1.kiH);
    }

    void h(bbu_2 bbu_22) {
        bci_1 bci_12 = bcm_1.hIK.t(aue_0.cVJ().cVK().Sn(), bbu_22.d());
        byj_1.epo().a(new byb_1(bci_12));
    }

    @Override
    public void d(bbu_2 bbu_22) {
        Object object;
        Object object2;
        if (!bbu_22.a((PO)fcL.rUh.sw(this.igl))) {
            return;
        }
        bcd_2 bcd_22 = aue_0.cVJ().cVK().dpy();
        boolean bl = bcd_22.a(bbu_22.d(), false);
        if (bl) {
            bci_2.hDG.daP();
            object2 = new cjh_0(bbu_22.d(), false);
            aue_0.cVJ().etu().d(object2);
        }
        object2 = bcm_1.hIK.u(this.igl, bbu_22.dat().d());
        ((bcy_1)object2).dbJ();
        if (bbu_22.cjj()) {
            object = new cji_0(bbu_22.d());
            aue_0.cVJ().etu().d(object);
        }
        object = bbu_22.dau();
        int n = ((ArrayList)object).size();
        for (int i = 0; i < n; ++i) {
            bcc_2 bcc_22 = bcm_1.hIK.s(this.igl, ((bcj_1)((ArrayList)object).get(i)).d());
            bcc_22.dbP();
        }
    }

    @Override
    public void a(bcm_2 bcm_22, long l) {
        int n;
        bMX bMX2;
        if (bcm_22.cjL() && (bMX2 = bMX.kAi).blc()) {
            n = bMX2.efp().getIntStat(bcm_22.getName());
            bMX2.v(bcm_22.getName(), (int)((long)n + l));
        }
        if ((bMX2 = this.igm.AR(bcm_22.d())) == null) {
            return;
        }
        int n2 = bMX2.size();
        for (n = 0; n < n2; ++n) {
            bsg_1 bsg_12;
            bcc_2 bcc_22 = bcm_1.hIK.s(this.igl, bMX2.get(n));
            PQ pQ = this.igm.oj(bcc_22.d());
            bcc_22.dbP();
            TIntArrayList tIntArrayList = this.igm.aYv();
            int n3 = pQ.aYA().d();
            if (!tIntArrayList.contains(n3) || !(bsg_12 = (bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljM) && !bsg_12.a(bsn_1.liO)) continue;
            bsg_12.a((afe)bsn_1.ljM, true);
            czm_2.eZa();
            csc_1.Mo(n3);
        }
    }

    @Override
    public void r(int n, boolean bl) {
        if (bl) {
            csc_1.Mo(n);
        }
        bci_2.hDG.Bg(n);
    }

    @Override
    public void b(bcd_2 bcd_22) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.igl);
        if (bgt_02 != null && fcK.rUe.as(bgt_02.Xi(), this.igl)) {
            bcm_1.hIK.b(this.igl, bcd_22);
            return;
        }
        bio_0.ikq.bmX();
        bcm_1.hIK.b(this.igl, bcd_22);
        bck_1.hDV.start();
        bci_2.hDG.bkZ();
        TIntObjectIterator<bbu_2> tIntObjectIterator = bcd_22.daG();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bbu_2 bbu_22 = (bbu_2)tIntObjectIterator.value();
            if (bhp_0.a(this.igm, bbu_22)) {
                this.i(bbu_22);
            }
            if (!bcm_1.hIK.w(this.igl, bbu_22.d()) || !bbu_22.apo() || bbu_22.app()) continue;
            bci_2.hDG.Bh(bbu_22.d());
        }
        bci_2.hDG.daP();
    }

    private void i(bbu_2 bbu_22) {
        bci_1 bci_12 = bcm_1.hIK.t(this.igl, bbu_22.d());
        bck_1.hDV.a(bci_12);
    }

    private static boolean a(PN pN, PL pL) {
        boolean bl;
        boolean bl2 = bl = !pN.od(pL.d());
        if (bl) {
            return false;
        }
        boolean bl3 = pL.aYp() != null;
        boolean bl4 = !pL.app() && pL.atA() != 0L && pL.apv();
        boolean bl5 = pL.aYn() != 0L && pL.aYu() != 0L;
        return bl3 || bl4 || bl5;
    }

    @Override
    public void c(bbu_2 bbu_22) {
        if (!bbu_22.a((PO)fcL.rUh.sw(this.igl))) {
            return;
        }
        bci_1 bci_12 = bcm_1.hIK.t(this.igl, bbu_22.d());
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0]));
        ahv_22.c(" ");
        ahv_22.ceC().ih(awx_2.dnJ.bQk());
        ahv_22.c(aum_0.cWf().c("quest.result.fail", new Object[0]));
        ahv_22.ceD();
        String string = ahv_22.ceL();
        dcd dcd2 = new dcd(string, "", biu_1.kiH, -1, bci_12);
        aaw_1.bUq().h(dcd2);
        ahv_2 ahv_23 = new ahv_2();
        ahv_23.ceu().ih(awx_2.dnJ.bQk()).c(aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0])).cev();
        String string2 = ahv_23.ceL();
        aPd.f("quest.failedChatMessage", string2);
        bci_2.hDG.daP();
    }

    @Override
    public void a(bbu_2 bbu_22, long l) {
        bio_0.ikq.r(bbu_22.d(), l);
    }

    @Override
    public void AK(int n) {
        aue_0.cVJ().etu().d(new cjj_0(n));
    }

    @Override
    public void c(bcj_1 bcj_12) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(this.igl);
        if (!bcj_12.daS().a(bgt_02)) {
            return;
        }
        if (bcm_1.hIK.Bp(bcj_12.d())) {
            bif_2.dYO().dYQ();
        }
        bcc_2 bcc_22 = bcm_1.hIK.s(this.igl, bcj_12.d());
        bcc_22.dbO();
        bci_1 bci_12 = bcm_1.hIK.t(this.igl, bcj_12.daS().d());
        bci_12.dcn();
        bci_12.dbB();
    }

    private void CT(int n) {
        abg_2.bUP().h(this.igq);
        abg_2.bUP().a(this.igq, n, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bmX() {
        ArrayList<Runnable> arrayList = this.igp;
        synchronized (arrayList) {
            for (int i = this.igp.size() - 1; i >= 0; --i) {
                abg_2.bUP().h(this.igp.get(i));
            }
        }
    }

    private bci_1 e(bcj_1 bcj_12) {
        bci_1 bci_12 = bcm_1.hIK.t(this.igl, bcj_12.daS().d());
        if (bcm_1.hIK.Bq(bcj_12.d())) {
            bif_2.dYO().dYQ();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            ArrayList<bcj_1> arrayList = bci_12.dau();
            int n = arrayList.indexOf(bcj_12);
            int n2 = arrayList.size();
            if (n != -1) {
                for (int i = 0; i < n2; ++i) {
                    int n3 = (i + 1 + n) % n2;
                    if (!arrayList.get(n3).daW() || arrayList.get(n3).daJ()) continue;
                    bcm_1.hIK.a(bgt_02.Sn(), arrayList.get(n3).d(), bgt_02.aqZ());
                    break;
                }
            }
        }
        return bci_12;
    }
}

