/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.primitives.Ints
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.commons.lang3.tuple.Pair
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.base.Stopwatch;
import com.google.common.primitives.Ints;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cco
 */
public class cco_0
implements adi_1 {
    protected static final Logger lOA = Logger.getLogger(cco_0.class);
    private static final cco_0 lOB = new cco_0();
    private static final List<Long> lOC = new ArrayList<Long>();
    private static final List<Long> lOD = new ArrayList<Long>();
    private static boolean lOE = true;

    public static cco_0 etB() {
        return lOB;
    }

    private cco_0() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 13928: {
                return cco_0.a((coR)aam_22);
            }
            case 12567: {
                return cco_0.a((conn_0)aam_22);
            }
            case 12385: {
                return cco_0.a((cpU)aam_22);
            }
            case 12466: {
                return this.a((cuy)aam_22);
            }
            case 13946: {
                return cco_0.a((coQ)aam_22);
            }
            case 13792: {
                return cco_0.a((cou_0)aam_22);
            }
            case 12575: {
                return this.a((com_0)aam_22);
            }
            case 12876: {
                return this.a((cov_0)aam_22);
            }
            case 12621: {
                return cco_0.a((cof)aam_22);
            }
            case 12461: {
                return this.a((coe)aam_22);
            }
            case 12524: {
                return cco_0.a((cow_0)aam_22);
            }
            case 12747: {
                return cco_0.a((coP)aam_22);
            }
            case 12260: {
                return cco_0.a((coT)aam_22);
            }
            case 12147: {
                return cco_0.a((coq_0)aam_22);
            }
            case 13251: {
                return cco_0.a((col_0)aam_22);
            }
            case 13315: {
                return cco_0.a((conn)aam_22);
            }
            case 439: {
                return cco_0.a((cis_0)aam_22);
            }
            case 12136: {
                aue_0.cVJ().cVK().ffF().Jo(((cti_0)aam_22).Xt());
                return false;
            }
            case 13126: {
                ((bri_2)aue_0.cVJ().cVK().ffF()).elo();
                return false;
            }
            case 13488: {
                return cco_0.a((cvQ)aam_22);
            }
            case 12021: {
                return cco_0.a((cog)aam_22);
            }
            case 12678: {
                return cco_0.a((cot_0)aam_22, cxs_2.nXl);
            }
            case 13843: {
                return cco_0.a((cod)aam_22);
            }
            case 13933: {
                return cco_0.a((cue_0)aam_22);
            }
            case 13826: {
                return cco_0.a((coj)aam_22);
            }
            case 13740: {
                return cco_0.a((cwn_0)aam_22);
            }
            case 12178: {
                throw new UnsupportedOperationException("On ne devrait plus passer par l\u00e0 mais par la GameActionPlayScript");
            }
            case 12114: {
                return cco_0.a((coi)aam_22);
            }
            case 13670: {
                return cco_0.a((cwo_0)aam_22);
            }
            case 13206: {
                return cco_0.a((cwp_0)aam_22);
            }
            case 12949: {
                return cco_0.a((cwq_0)aam_22);
            }
            case 13703: {
                cco_0.j(aam_22);
                return false;
            }
            case 13721: {
                return cco_0.a((cvX)aam_22);
            }
            case 13212: {
                cth cth2 = (cth)aam_22;
                bgt_0 bgt_02 = (bgt_0)bvz_0.ju(cth2.KU());
                if (bgt_02 == null) {
                    return false;
                }
                bgt_02.dmD().f(cth2.cyj(), cth2.eBR());
                return false;
            }
            case 13808: {
                cti cti2 = (cti)aam_22;
                bgt_0 bgt_03 = (bgt_0)bvz_0.ju(cti2.KU());
                if (bgt_03 == null) {
                    return false;
                }
                bgt_03.dmD().fW(cti2.cyj(), cti2.eBS());
                return false;
            }
            case 12036: {
                return cco_0.a((crt)aam_22);
            }
            case 12041: {
                return cco_0.a((crs)aam_22);
            }
            case 13723: {
                aPd.e("kick.error", new Object[0]);
                return false;
            }
            case 12913: {
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                fse_1.gFu().a((aef_2)bgt_04, bgt_04.bxk());
                break;
            }
            case 13240: {
                this.a((cvW)aam_22);
                return false;
            }
            case 12864: {
                cco_0.a((cqP)aam_22);
                return false;
            }
        }
        return true;
    }

    private static boolean a(coR coR2) {
        boolean bl = coR2.ewM();
        List<coS> list = coR2.ewN();
        Comparator<coS> comparator = Comparator.comparing(coS2 -> coS2.aKU().length);
        list.sort(comparator.reversed());
        list.forEach(coS2 -> cco_0.a(bl, coS2));
        return false;
    }

    private static void a(boolean bl, coS coS2) {
        try {
            cco_0.a(coS2, bl);
        }
        catch (RuntimeException runtimeException) {
            lOA.error((Object)"Exception raised", (Throwable)runtimeException);
        }
    }

    private static void b(List<coS> list, boolean bl) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        while (stopwatch.elapsed(TimeUnit.MILLISECONDS) < 5L) {
            if (list.isEmpty()) {
                return;
            }
            coS coS2 = list.remove(0);
            long l = coS2.Sn();
            if (lOD.contains(l)) {
                lOD.remove(l);
                continue;
            }
            cco_0.a(coS2, bl);
            lOC.add(l);
        }
        stopwatch.stop();
        if (list.isEmpty()) {
            return;
        }
        abg_2.bUP().i(() -> cco_0.b(list, bl));
    }

    private static void a(coS coS2, boolean bl) {
        amg_1 amg_12;
        byte by = coS2.aFW();
        long l = coS2.Sn();
        byte[] byArray = coS2.aKU();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && l == bgt_02.Sn()) {
            return;
        }
        if (fcL.rUh.sw(l) != null) {
            return;
        }
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null) {
            if (bgy2.dlv()) {
                bgy2.ddI().bqa();
                bgg_0.dlO().av(bgy2);
            } else {
                if (bl) {
                    if (!bgy2.djB()) {
                        bgy2.fN(true);
                    }
                    return;
                }
                bgg_0.dlO().av(bgy2);
            }
        }
        bgy bgy3 = null;
        switch (by) {
            case 0: {
                bgy3 = new bhJ();
                break;
            }
            case 1: {
                bgy3 = bhx_0.doA();
                break;
            }
            case 4: {
                bgy3 = new bgq_0();
            }
        }
        if (bgy3 == null) {
            return;
        }
        boolean bl2 = false;
        bgy3.as(byArray);
        bgy3.aPg();
        if (bl) {
            bgy3.fN(true);
        } else {
            bgy3.fM(true);
        }
        if (bgg_0.dlO().aq(bgy3)) {
            bgy3.dld();
            if (bgy3.bqo() != -1) {
                bl2 = true;
            }
        } else {
            bgy3.aZp();
            return;
        }
        if (bgy3 instanceof bhJ) {
            amg_12 = (bhJ)bgy3;
            if (bgt_02.dnQ().dfG() && bgt_02.dnQ().dKL().fa(l)) {
                cxs_1.eXb().oH(l);
            }
            ((bhJ)amg_12).dpF();
            ((bgy)amg_12).djo();
            ((bgy)amg_12).ddI().dds();
        }
        amg_12 = bgy3.ddI();
        if (bl2) {
            cco_0.f(bgy3, (bdj_2)amg_12);
        }
        if (bgy3.dlw()) {
            bgy3.a((pv_0)exe_1.rDg, px_0.beR);
        } else {
            ((ZC)amg_12).bpH();
        }
        if (bgy3.aFW() == 5) {
            ((bdj_2)amg_12).setVisible(false);
        }
        if (bgy3 instanceof bhx_0 && bgy3.doP() && (!bgy3.djT() || bgy3.doE())) {
            ((bhx_0)bgy3).doF();
        }
        agX.c((agV)((Object)amg_12));
    }

    private static boolean a(conn_0 conn_02) {
        for (azx_1<Byte, Long> azx_12 : conn_02.ewD()) {
            long l = azx_12.aHI();
            cco_0.a(conn_02, azx_12, l);
        }
        return false;
    }

    private static void a(conn_0 conn_02, azx_1<Byte, Long> azx_12, long l) {
        try {
            cco_0.a(l, azx_12.getFirst(), false, conn_02.ewE());
        }
        catch (RuntimeException runtimeException) {
            lOA.error((Object)"Exception raised", (Throwable)runtimeException);
        }
    }

    private static boolean a(coQ coQ2) {
        long l = coQ2.evP();
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (bdj_22.bvF() != null) {
            if (coQ2.ewK()) {
                return false;
            }
            bgy2.a(new bdg_1(bgy2, coQ2.avZ(), coQ2.ewI(), coQ2.ewJ()));
        } else {
            fqy_0 fqy_02 = fqz_0.giz().YY(coQ2.avZ());
            if (fqy_02 == null) {
                return false;
            }
            bKV bKV2 = bLe.ecw().dQ(coQ2.ewI(), coQ2.ewJ());
            ni_1 ni_12 = bKV2 == null ? bzj_2.eqi().my(coQ2.evy()) : null;
            bgy2.l(bKV2);
            String string = bdj_22.bkI();
            String[] stringArray = (bKV2 != null ? fqy_02.giu() : (ni_12 != null ? "AnimCraft-Debut" : "")).split("-");
            if (coQ2.ewK()) {
                String string2 = stringArray[0].isEmpty() ? bdj_22.ddu() : stringArray[0] + "-Fin";
                bdj_22.dT(string2);
                bdj_22.bqf();
                bdj_22.dcM().ebT();
            } else if (!string.equals(stringArray[0])) {
                if (bKV2 != null && ni_12 != null) {
                    short s;
                    int n;
                    int n2;
                    if (bKV2 != null) {
                        n2 = bKV2.bcC();
                        n = bKV2.bcD();
                        s = bKV2.bcE();
                    } else {
                        n2 = ni_12.bcC();
                        n = ni_12.bcD();
                        s = ni_12.bcE();
                    }
                    abi_1 abi_12 = bgy2.eap().O(n2, n, s);
                    if (abi_12 == null) {
                        abi_12 = bgy2.eap().x(new acd_1(coQ2.ewI(), coQ2.ewJ(), 0));
                    }
                    if (abi_12 != null) {
                        bdj_22.a(abi_12);
                    }
                }
                if (ni_12 == null) {
                    blq_0.a(bdj_22, fqy_02);
                } else {
                    bdj_22.dT("AnimCraft-Debut");
                }
            }
        }
        return false;
    }

    private static boolean a(cou_0 cou_02) {
        bgy bgy2 = bgg_0.dlO().ju(cou_02.evP());
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.bvA();
        if (!bdj_22.c(new acd_1(cou_02.getX(), cou_02.getY(), cou_02.bdi()), false, false)) {
            bdj_22.e(cou_02.getX(), cou_02.getY(), cou_02.bdi());
        }
        return false;
    }

    private boolean a(com_0 com_02) {
        bgy bgy2 = bgg_0.dlO().ju(com_02.aXb());
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (bdj_22.bvF() == null || bdj_22.bvF().bDU() == 0) {
            bdj_22.a(com_02.bcB());
            bgy2.dkR();
        } else {
            abi_1 abi_12 = com_02.bcB();
            bdj_22.b(new ccp_0(this, abi_12));
        }
        return false;
    }

    private boolean a(cov_0 cov_02) {
        double d2;
        Object object;
        double d3;
        double d4;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = bgg_0.dlO().ju(cov_02.evP());
        if (bgy2 == null) {
            return false;
        }
        if (bgy2.djT()) {
            lOA.error((Object)"on ne catche pas un teleport dans les frames de fight ?");
            return true;
        }
        bsj_0 bsj_02 = bgt_02.dnB();
        if (bsj_02 != null && bgy2.aZj() == bgt_02.aZj()) {
            aVi.cWF().zY(bsj_02.d());
            btw_0 btw_02 = new btw_0();
            btw_02.bGy();
        }
        int n = cov_02.getX();
        int n2 = cov_02.getY();
        short s = cov_02.bsy();
        lOA.trace((Object)("T\u00e9l\u00e9portation de l'acteur ID=" + cov_02.evP() + " vers [" + n + ":" + n2 + ":" + cov_02.bsy() + "]"));
        aam_0 aam_02 = aie_0.cfn().bmC();
        if (bgy2 == bgt_02 && !cov_02.ewP() && ((d4 = ((d3 = (double)((agf)(object = aam_02.bqL())).bsf()) - (double)n) * (d3 - (double)n) + ((d2 = (double)((agf)object).bsg()) - (double)n2) * (d2 - (double)n2)) > 400.0 || cov_02.ewQ())) {
            long l = WX.bhh();
            aIq.cgr().ia(l);
            WX.a(aam_02, n, n2, s);
        }
        if (bgy2 != bgt_02) {
            cco_0.a(bgy2, n, n2, s, cov_02.ewP());
        } else {
            object = bgt_02.ddI();
            ccq_0 ccq_02 = new ccq_0(this, bgy2, n, n2, cov_02);
            ((adj_0)object).c(bzj_2.eqi());
            cco_0.a(bgy2, n, n2, s, cov_02.ewP());
            ((adj_0)object).a(bzj_2.eqi());
            if (asj_2.bJt().bJu()) {
                asj_2.bJt().a(ccq_02);
            } else {
                ccq_02.buf();
            }
        }
        return false;
    }

    private static boolean a(cof cof2) {
        bgy bgy2 = bgg_0.dlO().ju(cof2.evP());
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        abj_2 abj_22 = cof2.evt();
        bdj_22.b(abj_22);
        if (bgy2 instanceof bhJ) {
            lOA.trace((Object)("Update de chemin re\u00e9ue pour le personnage " + bgy2.getName() + "(" + bgy2.Sn() + ") : currentPos=[" + bdj_22.bvI() + ":" + bdj_22.bvJ() + "] newPath=" + String.valueOf(abj_22)));
        }
        return false;
    }

    private boolean a(coe coe2) {
        bgy bgy2 = bgg_0.dlO().ju(coe2.evP());
        if (bgy2 == null) {
            return false;
        }
        this.a(coe2, bgy2, coe2.bwe());
        return false;
    }

    private static boolean a(coP coP2) {
        pv_0 pv_02 = coP2.ewG();
        if (pv_02 == null) {
            return false;
        }
        bgy bgy2 = bgg_0.dlO().ju(coP2.KU());
        if (bgy2 == null) {
            return false;
        }
        switch (coP2.ewH()) {
            case beT: {
                bgy2.f(pv_02);
                break;
            }
            case beU: {
                bgy2.h(pv_02);
                break;
            }
            case beV: {
                bgy2.g(pv_02);
            }
        }
        return false;
    }

    private static boolean a(cow_0 cow_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Iterator<Map.Entry<Long, Byte>> iterator = cow_02.ewR();
        while (iterator.hasNext()) {
            Map.Entry<Long, Byte> entry = iterator.next();
            bgy bgy2 = bgg_0.dlO().ju(entry.getKey());
            if (entry.getValue() == 1) {
                if (bgy2 == null || bgt_02 == null) continue;
                bgy2.a(acp_1.bp(bgt_02.bcC() - bgy2.bcC(), bgt_02.bcD() - bgy2.bcD()));
                bgy2.ddI().bf((byte)-1);
                continue;
            }
            if (bgy2 == null) continue;
            bgy2.ddI().ddj();
        }
        return false;
    }

    private static boolean a(col_0 col_02) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(col_02.KU());
        if (bgt_02 == null) {
            return false;
        }
        bgt_02.dpg().dl(col_02.getValue(), col_02.evY());
        return false;
    }

    private static boolean a(conn conn2) {
        bgy bgy2 = bvz_0.ju(conn2.KU());
        if (bgy2 == null) {
            return false;
        }
        bgy2.as(conn2.ewc());
        return false;
    }

    public static boolean a(cis_0 cis_02) {
        byte[] byArray = cis_02.evg();
        if (byArray == null) {
            return false;
        }
        aUQ aUQ2 = new aUQ();
        aUQ2.as(byArray);
        aue_0.cVJ().a(aUQ2);
        if (aue_0.cVJ().c(ctu_2.nJd)) {
            bly_0.ivl.dtX();
        }
        return false;
    }

    private static boolean a(cvQ cvQ2) {
        if (!cvQ2.aGv()) {
            if (!cxt_2.eXB().eNw()) {
                aPh aPh2 = aPh.czg();
                bNG.egl();
                aPh2.iZ(bNG.b(13, new Object[0]));
            }
        } else if (aue_0.cVJ().c(cxt_2.eXB())) {
            cxt_2.eXB().eNy();
        }
        cxt_2.eXB().eNz();
        bgz_2.e(cxt_2.eXB().getItem(), 1);
        return false;
    }

    private static boolean a(cog cog2) {
        ffV ffV2;
        if (!cog2.aGv()) {
            if (!cxs_2.nXl.eNw()) {
                bNG.egl();
                bNG.a(38, new Object[0]);
            }
        } else if (aue_0.cVJ().c(cxs_2.nXl)) {
            cxs_2.nXl.eNy();
            aPd.f("searchTreasureSuccess", new Object[0]);
        }
        if ((ffV2 = cxs_2.nXl.getItem()) == null) {
            lOA.error((Object)"[SEARCH_TREASURE] On creuse sans item !?");
        } else {
            fgl_0 fgl_02 = ffV2.dOg().fUZ();
            if (fgl_02 != null && fgl_02.fXq()) {
                bgz_2.e(ffV2, 1);
            }
        }
        cxs_2.nXl.eNz();
        return false;
    }

    private static boolean a(cod cod2) {
        bgy bgy2 = bvz_0.ju(cod2.evP());
        if (bgy2 == null) {
            return false;
        }
        byte[] byArray = cod2.evO().keys();
        for (int n = 0; n < byArray.length; n = (int)((byte)(n + 1))) {
            byte by = byArray[n];
            int n2 = (Integer)((Pair)cod2.evO().get(by)).getLeft();
            int n3 = (Integer)((Pair)cod2.evO().get(by)).getRight();
            cco_0.a(bgy2, by, n2);
            cco_0.b(bgy2, by, n3);
        }
        bgy2.dlk();
        bgy2.dkr();
        return false;
    }

    private static boolean a(coj coj2) {
        bzj_2.eqi().ef(coj2.aqT(), coj2.aqV());
        return false;
    }

    private static boolean a(cwn_0 cwn_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = cwn_02.aXb();
        if (fcL.rUh.ax(bgt_02.aZj(), l)) {
            return false;
        }
        long l2 = cwn_02.eEL();
        bhJ bhJ2 = (bhJ)bgg_0.dlO().ju(l);
        if (bhJ2 != null) {
            bhJ2.jF(l2);
        }
        return false;
    }

    private static boolean a(coi coi2) {
        lOA.info((Object)("[TRANSPORT] Message d'evenement de transport : " + String.valueOf((Object)coi2.evS())));
        bck_0 bck_02 = (bck_0)bzj_2.eqi().my(coi2.evT());
        switch (coi2.evS()) {
            case sXQ: {
                bck_02.bl(false);
                break;
            }
            case sXR: {
                bck_02.bl(true);
                break;
            }
            case sXS: {
                aPd.f("boat.startTravel", new Object[0]);
                return false;
            }
            case sXT: {
                aPd.e("boat.cantTravel", new Object[0]);
                return false;
            }
            case sXU: {
                aPd.e("boat.full", new Object[0]);
                return false;
            }
        }
        ArrayList<ni_1> arrayList = bzj_2.eqi().eqk();
        int n = arrayList.size();
        block11: for (int i = 0; i < n; ++i) {
            bxD bxD2;
            ni_1 ni_12 = arrayList.get(i);
            if (!(ni_12 instanceof bxD) || (long)(bxD2 = (bxD)ni_12).dNI() != coi2.evT()) continue;
            switch (coi2.evS()) {
                case sXQ: {
                    bxD2.o(bck_02.dQf());
                    bxD2.hq(true);
                    continue block11;
                }
                case sXR: {
                    bxD2.p(bck_02.dQf());
                    bxD2.hq(false);
                }
            }
        }
        return false;
    }

    private static boolean a(coT coT2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        lOA.trace((Object)"[SPELL] reception d'un message d'apprentissage de nouveaux sorts");
        ArrayList<azy_1<Integer, Long, Short>> arrayList = coT2.ewO();
        bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(coT2.KU());
        for (azy_1<Integer, Long, Short> azy_12 : arrayList) {
            try {
                bmx_0 bmx_02 = new bmx_0(bmb_0.eeV().If(azy_12.getFirst()), azy_12.bTE(), azy_12.aHI(), bgt_03);
                ((Sg)bgt_03.dkB()).b(bmx_02);
                bgt_03.dkD().a((bmt_0)bmx_02.giP());
                bqm_0.jbp.b(new brh_0(((bmt_0)bmx_02.giP()).d()));
                String string = bmb_0.eeV().If(azy_12.getFirst()).getName();
                aPd.f("spell.newSpellLearn", aPc.eww, string);
                cty_1.ePV().eQa();
                if (!((bmt_0)bmx_02.giP()).eeY()) continue;
                for (enk_0 enk_02 : bmx_02) {
                    if (enk_02.aZG() != 0) continue;
                    enk_02.a(bmx_02, bgt_03, bgt_03.dmQ(), enf_0.fBb(), bgt_03.bcC(), bgt_03.bcD(), bgt_03.bcE(), bgt_03, null, false);
                }
            }
            catch (sa_0 sa_02) {
                lOA.error((Object)"[SPELL] Plus de place dans l'inventaire des sort pour en apprendre un nouveau");
            }
            catch (Sz sz) {
                lOA.error((Object)"[SPELL] Sort d\u00e9j\u00e9 appri et pr\u00e9sent dans l'inventaire");
            }
        }
        if (cvu_2.eQx()) {
            fse_1.gFu().a((aef_2)bgt_02.dpH(), bmw_0.kxs);
        }
        return false;
    }

    private static boolean a(cpU cpU2) {
        int n = cpU2.exM();
        String string = aum_0.cWf().a(80, (long)n, new Object[0]);
        if (!cpU2.aGv()) {
            aPd.e("error.emote.alreadyKnown", string);
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bbe_0 bbe_02 = bbe_0.hAP;
        bbe_02.AB(n);
        aPd.f("emote.learnt", string);
        fse_1.gFu().a((aef_2)bbe_02, bbe_02.bxk());
        bgt_02.dlG().b(fqt_0.sTc);
        bbi_0 bbi_02 = bbe_02.AE(n);
        dcz dcz2 = new dcz();
        dcz2.db(bgt_02.Sn());
        dcz2.aL(bbi_02);
        dcz2.NO(-1);
        dcz2.pz(-1);
        dcz2.cC(false);
        dcz2.lb(true);
        dcz2.lK(19934);
        aaw_1.bUq().h(dcz2);
        cco_0.a(bgt_02, bbi_02);
        return false;
    }

    private boolean a(cuy cuy2) {
        bDq.C(Ints.toArray(cuy2.eDi()));
        Set<Integer> set = cuy2.eDi();
        String string = bDq.x(set);
        aPd.f("furniture.learnt", string, set.size());
        if (fyw_0.gqw().to("furnitureListDialog")) {
            cus_1 cus_12 = cus_1.eTb();
            cus_12.g(set);
        }
        return false;
    }

    private static boolean a(cwo_0 cwo_02) {
        ftP ftP2 = ftR.gmM().aao(cwo_02.cmh());
        if (ftP2 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            lOA.info((Object)("Buff de zone id=" + cwo_02.cmh() + " appliqu\u00e9 pour " + cwo_02.eEM() + " ms"));
            bgt_02.dnT().a(new ftQ(ftP2, cwo_02.eEM()));
            bgt_02.lh(true);
        } else {
            lOA.error((Object)("Buff de zone id=" + cwo_02.cmh() + " inconnu"));
        }
        return false;
    }

    private static boolean a(cwp_0 cwp_02) {
        boolean bl = false;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (ftQ ftQ2 : bgt_02.dnS()) {
            if (ftQ2.gmI() != cwp_02.cmh()) continue;
            lOA.info((Object)("Buff de zone id=" + cwp_02.cmh() + " retir\u00e9"));
            bgt_02.dnT().b(ftQ2);
            bgt_02.lh(true);
            bl = true;
            break;
        }
        if (!bl) {
            lOA.error((Object)("Buff de zone id=" + cwp_02.cmh() + " inconnu"));
        }
        return false;
    }

    private static boolean a(cwq_0 cwq_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.dnT().dsX();
        for (int i = 0; i < cwq_02.eEN(); ++i) {
            ftP ftP2 = ftR.gmM().aao(cwq_02.Lo(i));
            if (ftP2 != null) {
                lOA.info((Object)("Buff de zone id=" + cwq_02.Lo(i) + " appliqu\u00e9 pour " + cwq_02.Lp(i) + " ms"));
                bgt_02.dnT().a(new ftQ(ftP2, cwq_02.Lp(i)));
                continue;
            }
            lOA.error((Object)("Buff de zone id=" + cwq_02.Lo(i) + " inconnu"));
        }
        bgt_02.lh(true);
        return false;
    }

    private static boolean a(crt crt2) {
        TIntArrayList tIntArrayList = crt2.ezT();
        TIntArrayList tIntArrayList2 = crt2.ezU();
        TIntArrayList tIntArrayList3 = crt2.ezV();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null) {
            aVi.cWF().a(bgt_02.dmW(), (aft_2)new avv_0(() -> {
                int n = tIntArrayList.size();
                for (int i = 0; i < n; ++i) {
                    int n2 = tIntArrayList.get(i);
                    int n3 = tIntArrayList2.get(i);
                    int n4 = tIntArrayList3.get(i);
                    ewp_1 ewp_12 = ewu_1.rCG.Tb(n2);
                    if (ewp_12 == null) continue;
                    bud.joo.a(ewp_12, n3, n4);
                }
            }));
            aVi.cWF().m(bsj_02);
        }
        return false;
    }

    private static boolean a(crs crs2) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return false;
        }
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null) {
            bgt_0 bgt_03 = aue_0.cVJ().cVK();
            aVi.cWF().a(bgt_03.dmW(), (aft_2)new avv_0(() -> bud.joo.c(crs2.clS(), crs2.ezS())));
            aVi.cWF().m(bsj_02);
        }
        return false;
    }

    private static boolean a(cue_0 cue_02) {
        bnt_2.dyI().eX(cue_02.Xi());
        return false;
    }

    private static boolean a(coq_0 coq_02) {
        lOA.trace((Object)"[ERROR] reception d'une erreur");
        int n = coq_02.ewg();
        bNG.egl();
        bNG.a(n, new Object[0]);
        if (bro_0.Fk(n)) {
            bqm_0.jbp.b(new bro_0(n));
        }
        return false;
    }

    private static boolean a(cot_0 cot_02, crx_2 crx_22) {
        int n = cot_02.evL();
        bNG.egl();
        bNG.a(n, new Object[0]);
        if (bro_0.Fk(n)) {
            bqm_0.jbp.b(new bro_0(n));
        }
        crx_22.Mn(n);
        return false;
    }

    private static void a(bgt_0 bgt_02, bbi_0 bbi_02) {
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(bbi_02.byf(), 32, 32, (xu_0)xp_02, 3000);
        xo_02.a(bgt_02);
        int n = xd_0.bnv().b(bgt_02, 4);
        xo_02.qC(n * 500);
        xd_0.bnv().a(xo_02);
    }

    private static void a(bgy bgy2, byte by, int n) {
        if (!(bgy2 instanceof bhJ)) {
            return;
        }
        bhJ bhJ2 = (bhJ)bgy2;
        if (n <= 0) {
            bhJ2.dpw().remove(by);
        } else {
            bhJ2.dpw().put(by, n);
        }
    }

    private static void b(bgy bgy2, byte by, int n) {
        TByteIntHashMap tByteIntHashMap = bgy2.dkE();
        if (tByteIntHashMap == null) {
            return;
        }
        if (n <= 0) {
            tByteIntHashMap.remove(by);
        } else {
            tByteIntHashMap.put(by, n);
        }
    }

    private static boolean a(cvX cvX2) {
        long l = aue_0.cVJ().cVO().xl();
        if (frz.b(l, cvX2.eEy(), cvX2.eEz())) {
            aPd.f("chat.travel.discovered", new Object[0]);
        }
        return false;
    }

    private static void a(bgy bgy2, int n, int n2, short s, boolean bl) {
        lOA.info((Object)("tp " + bgy2.Sn() + " to " + n + ", " + n2));
        if (bl) {
            bgy2.ddI().b(n, n2, s, false, false);
        } else {
            bgy2.b(n, n2, s, false);
            bgy2.ddI().dds();
        }
    }

    private static void f(bgy bgy2, bdj_2 bdj_22) {
        aUZ aUZ2;
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        if (!(bsS2 instanceof bsi_0)) {
            return;
        }
        bsi_0 bsi_02 = (bsi_0)bsS2;
        bsi_02.aQ(bgy2);
        btn_0.bx(bgy2);
        if (bgy2 instanceof bhx_0 && (bsS2.dGp() == etw_0.rqT || bsS2.dGp() == etw_0.rqV)) {
            bdj_22.bf((byte)-1);
        }
        if (bgy2.baF()) {
            aUZ2 = new aUZ(agb_1.cbm(), eui_1.rsh.aJr(), 0, 0, bsS2.d(), false);
            aUZ2.fg(bgy2.Sn());
            aVi.cWF().a(bsS2.d(), (aft_2)aUZ2);
            aVi.cWF().m(bsS2);
        }
        if (bgy2.baK()) {
            aUZ2 = new aUZ(agb_1.cbm(), eui_1.rsh.aJr(), 0, 2, bsS2.d(), false);
            aUZ2.fg(bgy2.Sn());
            aVi.cWF().a(bsS2.d(), (aft_2)aUZ2);
            aVi.cWF().m(bsS2);
        }
    }

    private static void j(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        cor_0 cor_02 = (cor_0)aam_22;
        long l = cor_02.aXb();
        int n = cor_02.ewh();
        bhJ bhJ2 = (bhJ)bvz_0.ju(l);
        if (bhJ2 == null) {
            lOA.error((Object)("R\u00e9ception d'un update de jauge wakfu pour un joueur inconnu id=" + l));
            return;
        }
        if (bhJ2.dkZ() != null) {
            aVi.cWF().a(bhJ2.bqo(), (aft_2)new ccr_0(agb_1.cbm(), eui_1.rtn.aJr(), 0, bhJ2, n, l, bgt_02));
        } else {
            bhJ2.CR(n);
            if (l == bgt_02.Sn()) {
                bqm_0.jbp.b(new brs_1());
            }
        }
    }

    private void a(coe coe2, bgy bgy2, aea_0 aea_02) {
        this.a(bgy2, new acd_1(coe2.getX(), coe2.getY(), coe2.bdi()), abi_1.wG(coe2.coI()), aea_02);
    }

    public void a(bgy bgy2, acd_1 acd_12, abi_1 abi_12) {
        this.a(bgy2, acd_12, abi_12, aea_0.cmC);
    }

    public void a(bgy bgy2, acd_1 acd_12, abi_1 abi_12, aea_0 aea_02) {
        bdj_2 bdj_22;
        if (!bdj_22.a(acd_12, false, (bdj_22 = bgy2.ddI()).bvx() == 8, aea_02)) {
            bdj_22.a(acd_12, true, false, bdj_22.bvx() == 8);
            bdj_22.a(abi_12);
        }
        bdj_22.b(new ccs_0(this, abi_12));
        if (lOA.isTraceEnabled() && bgy2 instanceof bhJ) {
            lOA.trace((Object)String.format("Update de chemin re\u00e9ue pour le personnage %s(%d) : currentPos=[%d:%d] to=%s", bgy2.getName(), bgy2.Sn(), bdj_22.bvI(), bdj_22.bvJ(), acd_12));
        }
    }

    public static void a(long l, byte by, boolean bl, boolean bl2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && l == bgt_02.Sn()) {
            return;
        }
        if (fcI.fSM() && bgt_02 != null && fcL.rUh.ax(bgt_02.Xi(), l)) {
            return;
        }
        try {
            switch (by) {
                case 0: {
                    cco_0.mN(l);
                    cco_0.a(l, bl, bgt_02, bl2);
                    break;
                }
                case 1: {
                    cco_0.a(l, bl, bgt_02, bl2);
                    break;
                }
                case 4: {
                    cco_0.a(l, bl, bgt_02, bl2);
                    break;
                }
                default: {
                    lOA.error((Object)("Unknown Actor Type " + by + " for actor " + l));
                    break;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            lOA.error((Object)("Exception lors du despawn de l'acteur " + l), (Throwable)runtimeException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(long l, boolean bl, bgt_0 bgt_02, boolean bl2) {
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            return;
        }
        if (bl) {
            if (!bgy2.djB()) {
                lOA.info((Object)("Despawn de " + l + " de myFight alors qu'il ne l'\u00e9tait pas => ignor\u00e9"));
                return;
            }
            bgy2.fN(false);
        } else {
            if (!bgy2.djz()) {
                lOA.info((Object)("Despawn de " + l + " de world alors qu'il ne l'\u00e9tait pas => ignor\u00e9"));
                return;
            }
            bgy2.fM(false);
            cph_1 cph_12 = cwd_2.eVe().eVf();
            if (cph_12 != null) {
                int n = cph_12.eLr();
                for (int i = 0; i < n; ++i) {
                    if (cph_12.Mh(i) != bgy2) continue;
                    cwd_2.eVe().eVg();
                    break;
                }
            }
            if (bgt_02 != null && bgt_02.dps() != null && bgt_02.dla() == bgy2.ddI()) {
                bgt_02.dps().k(false, true);
            }
        }
        if (bgy2.djz()) return;
        if (bgy2.dkZ() != null) {
            bgy2.dkZ().bg(bgy2);
            return;
        }
        cco_0.a(bl2, bgy2);
    }

    public static void mN(long l) {
        bhJ bhJ2 = (bhJ)bgg_0.dlO().ju(l);
        if (bhJ2 == null) {
            return;
        }
        fjn_0 fjn_02 = bhJ2.ffF();
        if (fjn_02 == null) {
            return;
        }
        fjn_02.ems().tU(bhJ2.Sn());
    }

    public static void a(boolean bl, bgy bgy2) {
        cco_0.j(bgy2, bl);
        if (bgy2.ddI().dcN()) {
            bgy2.fS(true);
            bgy2.ddI().a((ZC zC) -> {
                if (zC instanceof bdf_1) {
                    bgy bgy2 = bgg_0.dlO().ju(zC.Sn());
                    bgg_0.dlO().av(bgy2);
                }
            });
        } else {
            bgg_0.dlO().av(bgy2);
        }
    }

    private static void j(@NotNull bgy bgy2, boolean bl) {
        cco_0.bN(bgy2);
        cco_0.k(bgy2, bl);
    }

    private static void bN(bgy bgy2) {
        if (bgy2.bqo() == -1) {
            return;
        }
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        if (bsS2 == null) {
            return;
        }
        if (bsS2 instanceof bsi_0) {
            ((bsi_0)bsS2).aT(bgy2);
        }
    }

    private static void k(bgy bgy2, boolean bl) {
        if (bl) {
            FreeParticleSystem freeParticleSystem = agY.bzw().sk(800030);
            freeParticleSystem.a(bgy2.ddI());
            agZ.bzy().b(freeParticleSystem);
        } else {
            agZ.bzy().e(bgy2.ddI());
        }
    }

    private void a(cvW cvW2) {
        frs frs2 = cvW2.eEx();
        switch (frs2) {
            case sYc: {
                break;
            }
            case sYd: {
                bND.lW(cvW2.Tz()).egf();
                break;
            }
            case sYe: {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                if (!bgt_02.fhA()) {
                    return;
                }
                bgt_02.fhB().cancel();
                break;
            }
        }
    }

    private static void a(cqP cqP2) {
        Object t = fcL.rUh.sw(cqP2.KU());
        if (t == null) {
            lOA.error((Object)("[SYMBIOT] Cannot update symbiot, invalid hero id=" + cqP2.KU()));
            return;
        }
        ezn_0 ezn_02 = ((exP)t).dob();
        if (!(ezn_02 instanceof blx_1)) {
            lOA.error((Object)("[SYMBIOT] Cannot update symbiot, hero " + cqP2.KU() + " has no symbiot"));
            return;
        }
        ezq_0.a((ezk_0)ezn_02, cqP2.eyZ());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        lOE = true;
        lOC.clear();
        lOD.clear();
    }

    public void jb(boolean bl) {
        lOE = bl;
    }
}

