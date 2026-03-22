/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cfT
 */
final class cft_0
extends ceK<cqM, bsj_0> {
    private static final Logger lTi = Logger.getLogger(cft_0.class);

    cft_0() {
    }

    public boolean a(cqM cqM2) {
        byte by = cqM2.eyl();
        this.b(cqM2);
        this.dc(by);
        btj_0.j((bsj_0)this.jkR);
        this.eh(cqM2.eyG());
        this.eg(cqM2.eyX());
        this.a(cqM2.eyW());
        this.a(cqM2, by);
        this.euN();
        this.euQ();
        this.euR();
        this.euP();
        this.euO();
        akj_0.ciY().ig(aue_0.cVJ().cVK().Sn());
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        aag_02.cC(5.0f);
        asj_2.bJt().a(new bta_0());
        return false;
    }

    private void euN() {
        for (bgy bgy2 : ((bsj_0)this.jkR).dGs()) {
            pl_1 pl_12 = bgy2.dmj().fiw();
            if (!(bgy2.ffE() instanceof blu_1) || pl_12 == null) continue;
            blu_1 blu_12 = (blu_1)bgy2.ffE();
            if (pl_12.Tw.TA.afC != null) {
                blu_12.a((exP)bgy2, pl_12.Tw.TA.afC.afH.act);
            }
            if (!bgy2.djz() || !bgy2.djB()) continue;
            bgy2.dkr();
        }
    }

    private void euO() {
        if (((bsj_0)this.jkR).dGp() == etw_0.rqU) {
            cAY.eHc().q((bsj_0)this.jkR);
        }
    }

    private void euP() {
        Collection<QQ> collection = ((bsj_0)this.jkR).bai().bdh();
        for (QQ qQ : collection) {
            qu_0 qu_02;
            baw_0 baw_02;
            if (!(qQ instanceof baw_0) || (baw_02 = (baw_0)qQ).bci() != null || (qu_02 = ((bsj_0)this.jkR).dg(baw_02.Xi())) == null) continue;
            baw_02.j(qu_02);
            baw_02.aPg();
        }
    }

    private void euQ() {
        long l = ((bsj_0)this.jkR).bhF();
        Collection collection = ((bsj_0)this.jkR).dGs();
        for (bgy bgy2 : collection) {
            ers_0 ers_02;
            if (bgy2.Sn() == l) {
                cul_2.ce(bgy2);
                continue;
            }
            if (!bgy2.dkQ()) continue;
            if (bgy2 instanceof bhx_0) {
                bgy.an(bgy2);
            }
            if ((ers_02 = bgy2.doc()) == null) {
                lTi.error((Object)String.format("Unable to retrieve %s for fighter (id:%s, breedId:%s, instanceId:%s)", ers_0.class, bgy2.Sn(), bgy2.aWP(), bgy2.aqZ()));
                continue;
            }
            List<QD> list = ers_02.oH(enf_0.qUJ.d());
            for (QD qD : list) {
                if (!(qD instanceof eOk) || !qD.bbI()) continue;
                eOk eOk2 = (eOk)qD;
                eOk2.fCg();
            }
        }
    }

    private void eg(byte[] byArray) {
        evr_0 evr_02 = ((bsj_0)this.jkR).fKv();
        TLongObjectHashMap<eVw> tLongObjectHashMap = evy_0.eH(byArray);
        tLongObjectHashMap.forEachEntry((TLongObjectProcedure)new cfu_0(this, evr_02));
    }

    private void eh(byte[] byArray) {
        Un.a(byArray, ((bsj_0)this.jkR).dGQ().c(((bsj_0)this.jkR).bbh()), ((bsj_0)this.jkR).dGQ().bhN());
    }

    private void a(THashSet<eVZ> tHashSet) {
        tHashSet.forEach((TObjectProcedure)new cfv_0(this));
    }

    boolean a(eVZ eVZ2) {
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(eVZ2.fNw());
        Object object = ((bsj_0)this.jkR).qJ(eVZ2.fNx());
        if (object == null) {
            object = ((bsj_0)this.jkR).bai().dp(eVZ2.fNx());
        }
        if (bgy2 == null || object == null) {
            lTi.error((Object)("Impossible de recr\u00e9er le port\u00e9 pour " + String.valueOf(bgy2) + " et " + String.valueOf(object)));
            return true;
        }
        enk_0 enk_02 = bat_2.cZD().RN(eVZ2.aZH());
        if (enk_02 == null) {
            lTi.error((Object)("Impossible de recr\u00e9er le port\u00e9 pour " + String.valueOf(bgy2) + " et " + String.valueOf(object) + ", l'effet est inconnu " + eVZ2.aZH()));
            return true;
        }
        QD qD = this.a(bgy2, (qu_0)object, enk_02);
        aWv aWv2 = this.a(bgy2, enk_02, (ero_0)qD);
        this.a(aWv2);
        return true;
    }

    private void a(aWv aWv2) {
        aWv2.cXq();
        aWv2.caV();
    }

    private aWv a(bgy bgy2, enk_0 enk_02, ero_0 ero_02) {
        aWv aWv2 = new aWv(0, 0, 0, ((bsj_0)this.jkR).d(), ero_02, false);
        aWv2.hB(bgy2.Sn());
        aWv2.dw(true);
        aWv2.fg(ero_02.bbd().Sn());
        aWv2.xV(enk_02.cbj());
        return aWv2;
    }

    private QD a(bgy bgy2, qu_0 qu_02, enk_0 enk_02) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        QD qD = ero_02.b(((bsj_0)this.jkR).bbh());
        qD.b(enk_02);
        qD.f(qu_02);
        qD.e(bgy2);
        return qD;
    }

    private void euR() {
        Collection collection = ((bsj_0)this.jkR).dGs();
        for (bgy bgy2 : collection) {
            cub_1.n(bgy2, cub_1.eNp());
        }
    }

    private void dc(byte by) {
        ((bsj_0)this.jkR).a(etw_0.fk(by));
    }

    private void b(cqM cqM2) {
        ((bsj_0)this.jkR).dGQ().eLo().dS(cqM2.eym());
    }

    private void a(cqM cqM2, byte by) {
        ArrayList<adi_1> arrayList = btd_0.dHE();
        for (adi_1 adi_12 : arrayList) {
            aue_0.cVJ().a(adi_12);
        }
        if (by == etw_0.rqU.aJr()) {
            this.euS();
            this.c(cqM2);
        }
    }

    private void c(cqM cqM2) {
        long l = ue_0.bjV().bjZ() - cqM2.eyV();
        int n = GC.C((float)l / 1000.0f);
        int n2 = cqM2.eyU() - n;
        ((bsj_0)this.jkR).kx((long)n2 * 1000L);
    }

    private void euS() {
        bua bua2 = ((bsj_0)this.jkR).dGQ();
        bgy bgy2 = bua2.dIA();
        if (bgy2 == null) {
            return;
        }
        boolean bl = bsj_0.bq(bgy2);
        if (bl && bua2.eA(bgy2.Sn()) && !aue_0.cVJ().c(cul_2.eST())) {
            aue_0.cVJ().a(cul_2.eST());
            ((bsj_0)this.jkR).ky(bgy2.Sn());
        }
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqM)aam_22);
    }
}

