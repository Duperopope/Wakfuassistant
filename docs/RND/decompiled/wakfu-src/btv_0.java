/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from btV
 */
public final class btv_0 {
    public static void a(cqp_0 cqp_02) {
        if (!ewo_0.oBF.k(ewr_0.oDB)) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.i(false, false);
        bsU.dHk().Fu(cqp_02.bha());
        bsj_0 bsj_02 = btv_0.b(cqp_02);
        bsj_02.dGQ().eLo().dS(cqp_02.eym());
        bgt_02.f(bsj_02);
        aJP.cig().yP(bsj_02.d());
        aJP.cig().cij();
        btv_0.cWX();
        aue_0.cVJ().a(cui_2.nNq);
        akj_0.ciY().aPc();
        long l = bsj_02.dGQ().bhz() - ue_0.bjV().getTimeInMillis();
        bsj_02.kx(l);
        if (bsj_02.dGp() == etw_0.rqT) {
            bsj_02.dGs().forEach(bgy::dkL);
            bsj_02.start();
        } else if (bsj_02.dGp() == etw_0.rqU) {
            bsj_02.dGQ().start();
        }
        btv_0.k(bsj_02);
        byf_2.F("is_in_fight_spectator", true);
        ceI.euH().m(bsj_02);
        btv_0.cWW();
        ahc_2 ahc_22 = cAY.eHc().n(bsj_02);
        cAY.eHc().a(ahc_22);
    }

    private static bsj_0 b(cqp_0 cqp_02) {
        btc_0 btc_02 = new btc_0();
        new eUq(btc_02).eL(ByteBuffer.wrap(cqp_02.eyp()));
        bsj_0 bsj_02 = bsU.dHk().a((int)cqp_02.exZ(), cqp_02.bha(), (rh_0)btc_02, cqp_02.dGW(), cqp_02.eyt(), cqp_02.eyl());
        bsM bsM2 = new bsM();
        bsM2.a((cqq_0)cqp_02, bsj_02);
        return bsj_02;
    }

    private static void cWW() {
        List<adi_1> list = btv_0.dIw();
        for (int i = 0; i < list.size(); ++i) {
            adi_1 adi_12 = list.get(i);
            aue_0.cVJ().a(adi_12);
        }
    }

    private static void cWX() {
        aue_0.cVJ().b(cxt_2.eXB());
        List<adi_1> list = btv_0.dIv();
        for (int i = 0; i < list.size(); ++i) {
            adi_1 adi_12 = list.get(i);
            aue_0.cVJ().b(adi_12);
        }
    }

    private static void k(bsj_0 bsj_02) {
        fse_1.gFu().f("fight", bsj_02);
        fse_1.gFu().f("fight.timeline", bsj_02.dGQ());
        fse_1.gFu().f("isInFightCreationOrPlacement", true);
        fse_1.gFu().f("isFightSpectator", true);
    }

    public static List<adi_1> dIv() {
        ArrayList<adi_1> arrayList = new ArrayList<adi_1>();
        arrayList.add(cdt_0.eub());
        return arrayList;
    }

    public static List<adi_1> dIw() {
        ArrayList<adi_1> arrayList = new ArrayList<adi_1>();
        arrayList.add(cya_1.eYj());
        arrayList.add(ceI.euH());
        arrayList.add(cuu_1.eRU());
        return arrayList;
    }
}

