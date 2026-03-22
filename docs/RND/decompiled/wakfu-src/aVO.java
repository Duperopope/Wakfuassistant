/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.Iterator;
import java.util.List;

public class aVO
extends aUS {
    private final boolean htA;
    private boolean htB;
    private boolean htC;
    private List<Long> hsC;
    private List<Long> hsD;
    private List<Long> hsE;

    public aVO(int n, int n2, int n3, int n4, boolean bl) {
        super(n, n2, n3, n4);
        this.htA = bl;
    }

    @Override
    protected void cWv() {
        aVO.cWV();
        bsS bsS2 = this.cja();
        if (bsS2 instanceof bsi_0) {
            avh_0 avh_02 = new avh_0(0, 0, 0, bsS2.d());
            avh_02.m(this.hsC);
            avh_02.n(this.hsD);
            avh_02.o(this.hsE);
            avh_02.cWv();
            return;
        }
        if (!(bsS2 instanceof bsj_0)) {
            return;
        }
        bsj_0 bsj_02 = (bsj_0)bsS2;
        dJP.info((Object)("[FIGHT] End fight with id " + bsj_02.d()));
        bgt_0 bgt_02 = bvz_0.dLl();
        boolean bl = bsj_02.kv(bgt_02.Sn());
        if (!this.htA) {
            this.htB = !bl;
        } else {
            this.htB = false;
            bsj_02.qI(bgt_02.Sn());
            bsj_02.bd(bgt_02);
        }
        aJP.j(bsj_02);
        if (this.htA && bsj_02.dGG()) {
            return;
        }
        fse_1.gFu().vX("fight");
        fse_1.gFu().f("isInFightCreationOrPlacement", false);
        aVO.cWX();
        fse_1.gFu().f("fight.timeline", (Object)null);
        aVO.cWW();
        aVO.d(bsj_02);
        aki_0.ciX().clear();
        akj_0.ciY().clear();
        cuu_1.eRY();
        cxx_2.eXH().a(bgt_02.dlG());
        if (!this.htA) {
            bgy bgy2;
            var5_6 = bsj_02.fKr();
            Iterator object = var5_6.iterator();
            while (object.hasNext()) {
                bgy2 = (bgy)object.next();
                bgy2.djX();
            }
            Iterator iterator = var5_6.iterator();
            while (iterator.hasNext()) {
                bgy2 = (bgy)iterator.next();
                bgy2.dkS();
            }
            bsj_02.chN();
        } else {
            bgt_02.dkS();
            var5_6 = new btb_0(bsj_02).dHD();
            aJP.cig().b(bgt_02, ((bsi_0)((Object)var5_6)).d());
        }
        if (this.htC) {
            new btw_0().bGy();
        }
        if (bl) {
            bqm_0.jbp.b(new bra_0());
        }
        for (ni_1 ni_12 : bzj_2.eqi().eqk()) {
            ni_12.aVQ();
        }
        aVi.cWF().zZ(bsj_02.d());
        aJP.cig().cij();
        bud.joo.clear();
        acq_0.cge.btE();
        adn_0.bvh().bpg();
        bLe.ecw().bpg();
        ZM.bqw().bpg();
        afh_0.bxU().bpg();
        this.h(bgt_02);
        bgt_02.a(exx_2.rGj, exx_2.rGi, exx_2.rGk, exx_2.rGl);
        bgt_02.dlG().b(fqt_0.sTc);
        aue_0.cVJ().r(bgt_02);
        this.cWY();
        if (cvu_2.eQx()) {
            cvu_2.eTO().dHP();
        }
        if (ctb_2.eQx()) {
            bmh.dvr().dvw();
        }
        if (bgt_02.bwb()) {
            bgt_02.dni();
        }
        aie_0.cfn().a(bgt_02);
    }

    private void h(bgt_0 bgt_02) {
        fcL.rUh.b(bgt_02.Xi(), exP2 -> {
            bgt_0 bgt_02 = (bgt_0)exP2;
            bMV.a(bgt_02.dnM(), bgt_02.dkB(), bgt_02.dlG());
            return true;
        });
    }

    private static void cWV() {
        TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bsS bsS2 = (bsS)tIntObjectIterator.value();
            if (!(bsS2 instanceof bsi_0)) continue;
            for (bgy bgy2 : bsS2.dGs()) {
                bgy2.lo(true);
                bdj_2 bdj_22 = bgy2.ddI();
                if (bsS2.dGp() != etw_0.rqT || !(bgy2 instanceof bhJ)) continue;
                bdj_22.bf((byte)0);
            }
        }
    }

    private static void d(bsj_0 bsj_02) {
        acq_0.cge.b(bsj_02.dGJ());
    }

    private static void cWW() {
        aue_0.cVJ().a(czi_2.eYU());
        aue_0.cVJ().a(cdt_0.eub());
    }

    private static void cWX() {
        try {
            aue_0.cVJ().b(cya_1.eYj());
            aue_0.cVJ().b(cyx_2.eYd());
            aue_0.cVJ().b(cuh_2.eSM());
            aue_0.cVJ().b(cul_2.eST());
            aue_0.cVJ().b(cua_1.eSg());
            aue_0.cVJ().b(cue_2.eSA());
            aue_0.cVJ().b(cug_2.eSL());
            aue_0.cVJ().b(cub_1.eSi());
            aue_0.cVJ().b(ceG.euA());
            ceG.euA().m(null);
            aue_0.cVJ().b(cuu_1.eRU());
        }
        catch (Exception exception) {
            dJP.error((Object)"Raised exception when remove frames", (Throwable)exception);
        }
    }

    @Override
    protected void caV() {
        bsS bsS2 = this.cja();
        if (bsS2 == null) {
            return;
        }
        eUw eUw2 = bsS2.dGo();
        if (eUw2.fKY()) {
            cAY.eHc().jA(this.htB);
        }
        if (this.htC) {
            return;
        }
        ckp ckp2 = new ckp(bsS2.d(), this.htB);
        aue_0.cVJ().etu().d(ckp2);
    }

    public void fc(boolean bl) {
        this.htC = bl;
    }

    public void a(List<Long> list, List<Long> list2, List<Long> list3) {
        this.hsE = list;
        this.hsD = list2;
        this.hsC = list3;
    }

    public void cWY() {
        bsn_1 bsn_12 = bsn_1.liV;
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_12);
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        aaj_02.bqL().cp(bl);
    }
}

