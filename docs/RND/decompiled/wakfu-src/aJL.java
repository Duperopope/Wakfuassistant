/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import com.google.common.collect.Ordering;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.log4j.Logger;

public final class aJL {
    private static final Logger ebX = Logger.getLogger(aJL.class);
    private static final float ebY = 0.6f;
    private static final TIntObjectHashMap<aJI> ebZ = new TIntObjectHashMap();
    private static final TIntObjectHashMap<aJI> eca = new TIntObjectHashMap();

    private aJL() {
    }

    static void b(bsS bsS2) {
        aJL.a(bsS2, ajs_0.ecr);
    }

    private static void a(bsS bsS2, ajs_0 ajs_02) {
        if (bsS2 == null) {
            return;
        }
        aJL.b(bsS2, ajs_02);
        aJL.e(bsS2);
        aJL.g(bsS2);
    }

    public static void c(bsS bsS2, bgy bgy2) {
        aJI aJI2;
        int n = bsS2.d();
        byte by = bsS2.kp(bgy2.Sn());
        aJI aJI3 = aJI2 = by == 0 ? (aJI)ebZ.get(n) : (aJI)eca.get(n);
        if (aJI2 != null) {
            aJI2.chM();
        }
    }

    public static void c(bsi_0 bsi_02) {
        Object object;
        if (ebZ.containsKey(bsi_02.d())) {
            return;
        }
        acd_1 acd_12 = aJL.d(bsi_02);
        if (acd_12 == null) {
            ebX.error((Object)("pas de cellule trouv\u00e9e pour repr\u00e9senter le combat " + String.valueOf(bsi_02) + " center=" + String.valueOf(bsi_02.bag().bdO())));
            return;
        }
        Optional<aJI> optional = aJC.a(acd_12, bsi_02, 0);
        if (optional.isPresent()) {
            object = optional.get();
            ebZ.put(bsi_02.d(), object);
            ZM.bqw().c((ZC)object);
        }
        if (((Optional)(object = aJC.a(acd_12, bsi_02, 1))).isPresent()) {
            aJI aJI2 = (aJI)((Optional)object).get();
            eca.put(bsi_02.d(), (Object)aJI2);
            ZM.bqw().c(aJI2);
        }
    }

    private static acd_1 d(bsi_0 bsi_02) {
        boolean bl;
        acd_1 acd_12 = bsi_02.bag().bdO();
        acd_12.aM(wa_0.y(acd_12.getX(), acd_12.getY(), acd_12.bdi()));
        boolean bl2 = wa_0.j(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        boolean bl3 = bl = aJL.a(ebZ, acd_12) || aJL.a(eca, acd_12);
        if (!bl2 || bl) {
            return aJL.a((bsS)bsi_02, acd_12);
        }
        return acd_12;
    }

    private static boolean a(TIntObjectHashMap<aJI> tIntObjectHashMap, acd_1 acd_12) {
        return tIntObjectHashMap.valueCollection().stream().anyMatch(aJI2 -> aJI2.bcC() == acd_12.getX() && aJI2.bcD() == acd_12.getY() && aJI2.bcE() == acd_12.bdi());
    }

    private static acd_1 a(bsS bsS2, acd_1 acd_13) {
        Ordering ordering = Ordering.natural().onResultOf(acd_13::A);
        rh_0 rh_02 = bsS2.bag();
        List<acd_1> list = bsS2.dGs().stream().map(exP::aZw).filter(Objects::nonNull).filter(acd_12 -> rh_02.S(acd_12.getX(), acd_12.getY())).sorted((Comparator<acd_1>)ordering).toList();
        return list.isEmpty() ? acd_13 : list.get(0);
    }

    public static void c(bsS bsS2) {
        aJI aJI2;
        aJI aJI3 = (aJI)ebZ.remove(bsS2.d());
        if (aJI3 != null) {
            aJI3.chN();
        }
        if ((aJI2 = (aJI)eca.remove(bsS2.d())) != null) {
            aJI2.chN();
        }
    }

    public static void a(bsi_0 bsi_02, int n, boolean bl) {
        Optional<aJI> optional = aJL.a(bsi_02, n);
        optional.ifPresent(aJI2 -> aJI2.eq(bl));
    }

    public static void b(bsi_0 bsi_02, int n, boolean bl) {
        Optional<aJI> optional = aJL.a(bsi_02, n);
        optional.ifPresent(aJI2 -> aJI2.er(bl));
    }

    private static Optional<aJI> a(bsi_0 bsi_02, int n) {
        byte by = bsi_02.dGr();
        boolean bl = by == n;
        TIntObjectHashMap<aJI> tIntObjectHashMap = bl ? ebZ : eca;
        Optional<aJI> optional = Optional.ofNullable((aJI)tIntObjectHashMap.get(bsi_02.d()));
        if (optional.isEmpty()) {
            ebX.error((Object)("FightSwordElement for the fight with the id " + bsi_02.d() + " not found."));
        }
        return optional;
    }

    public static void yL(int n) {
        aJI aJI2;
        aJI aJI3 = (aJI)ebZ.get(n);
        if (aJI3 != null) {
            aJI3.chP();
        }
        if ((aJI2 = (aJI)eca.get(n)) != null) {
            aJI2.chP();
        }
    }

    static void cia() {
        aJM aJM2 = new aJM();
        ebZ.forEachValue((TObjectProcedure)aJM2);
        eca.forEachValue((TObjectProcedure)aJM2);
        ebZ.clear();
        eca.clear();
    }

    public static void b(bsS bsS2, ajs_0 ajs_02) {
        switch (ajs_02) {
            case ecr: {
                aJL.k(bsS2.dGs());
                break;
            }
            case ecs: {
                aJL.l(bsS2.dGs());
            }
        }
    }

    public static void d(bsS bsS2) {
        Collection collection = bsS2.dGs();
        for (bgy bgy2 : collection) {
            bgy2.ddI().ddk();
            bgy2.ddI().ddl();
        }
    }

    public static void e(bsS bsS2) {
        QR qR = bsS2.bai();
        if (bsS2 instanceof bsj_0) {
            akj_0.ciY().o(((bsj_0)bsS2).fhK());
        }
        if (qR != null) {
            for (QQ qQ : qR.bdh()) {
                aJL.k(qQ);
            }
            aJL.cib();
        }
        akj_0.ciY().aPc();
    }

    public static void f(bsS bsS2) {
        QR qR = bsS2.bai();
        bsj_0 bsj_02 = (bsj_0)bsS2;
        eSM eSM2 = bsj_02.fhK();
        akj_0.ciY().a((QQ)eSM2, bsS2);
        if (qR != null) {
            for (QQ qQ : qR.bdh()) {
                aJL.d(bsS2, qQ);
            }
        }
        aJL.cib();
        akj_0.ciY().aPc();
    }

    public static void g(bsS bsS2) {
        ags_0 ags_02 = bsS2.dGx();
        if (ags_02 != null) {
            ags_02.bzo();
        }
    }

    public static void h(bsS bsS2) {
        ags_0 ags_02 = bsS2.dGx();
        if (ags_02 != null) {
            ags_02.bzn();
        }
    }

    private static void k(Collection<bgy> collection) {
        for (bgy bgy2 : collection) {
            aJL.i(bgy2);
        }
    }

    private static void l(Collection<bgy> collection) {
        for (bgy bgy2 : collection) {
            aJL.h(bgy2);
        }
    }

    static void g(bgy bgy2) {
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.bR(bdj_22.bqk());
        if (bgy2.dlw()) {
            return;
        }
        bdj_22.setVisible(true);
    }

    static void h(bgy bgy2) {
        bgy2.ddI().bA(false);
        bgy2.ddI().bR(0.6f);
        if (bgy2.dlw()) {
            return;
        }
        bgy2.ddI().setVisible(!bgy2.doP());
    }

    static void i(bgy bgy2) {
        bgy2.ddI().setVisible(false);
        bgy2.ddI().bA(false);
    }

    static void cib() {
        ((aIs)aie_0.cfn().bmC()).a(akj_0.ciY());
    }

    static void d(bsS bsS2, QQ qQ) {
        if (bsS2.u(qQ)) {
            akj_0.ciY().a(qQ, bsS2);
        }
    }

    static void k(QQ qQ) {
        akj_0.ciY().o(qQ);
    }

    public static void i(bsS bsS2) {
        aJP.cig().en(aie_0.cfn().bmC().bqL().getZoomFactor());
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        bsj_0 bsj_02 = (bsj_0)bsS2;
        bgy bgy2 = bsj_02.dGQ().dIA();
        if (bgy2 != null) {
            aag_02.c(bgy2.ddI());
            aag_02.byP();
        }
        aag_02.bL(true);
        acq_0.cge.a((acv_0)((Object)bsS2.dGx()));
    }

    public static void j(bsS bsS2) {
        aie_0.cfn().bmC().cy(aJP.cig().cii());
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        aag_02.c(aue_0.cVJ().cVK().ddI());
        aag_02.bL(false);
        AlphaMaskCommand.eV(false);
        HideFightOccluders.zq(0);
        acq_0.cge.b((acv_0)((Object)bsS2.dGx()));
    }

    public static void u(ArrayList<ZH> arrayList) {
        aJN aJN2 = new aJN(arrayList);
        ebZ.forEachValue((TObjectProcedure)aJN2);
        eca.forEachValue((TObjectProcedure)aJN2);
    }

    public static void es(boolean bl) {
        float f2 = bl ? 0.3f : 1.0f;
        int n = HideFightOccluders.ep(f2);
        HideFightOccluders.a(n, f2, 1000);
    }

    public static void et(boolean bl) {
        if (aue_0.cVJ().c(cub_1.eSi()) || aue_0.cVJ().c(cui_2.nNq)) {
            crt_2.jW(bl);
        }
    }
}

