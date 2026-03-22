/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bdn
 */
public final class bdn_2
implements adi_0<adj_0> {
    private static final Logger hKT = Logger.getLogger(bdn_2.class);
    private static final bdr_2 hKU = new bdr_2();
    private static final int hKV = 630;
    private static final int hKW = 5;
    private final bdj_2 hKX;
    private static final ux_0 hKY = new uw_0(0, 0, 10, 14, 2, 2020);
    private static final ux_0 hKZ = new uw_0(0, 0, 10, 21, 2, 2020);

    public bdn_2(bdj_2 bdj_22) {
        assert (bdj_22 != null);
        this.hKX = bdj_22;
    }

    @Override
    public void a(adj_0 adj_02, boolean bl, boolean bl2) {
        assert (adj_02 == this.hKX);
        if (bdn_2.ddx()) {
            return;
        }
        if (bl2) {
            aIp.c(this.hKX);
            return;
        }
        if (bl) {
            bdn_2.c(this.hKX);
        } else {
            bdn_2.d(this.hKX);
        }
    }

    public static void c(bdj_2 bdj_22) {
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
            return;
        }
        bgy bgy2 = bdj_22.dcP();
        if (bgy2 == null) {
            return;
        }
        if (bgy2.dlw()) {
            return;
        }
        if (bgy2.i(exe_1.rEu)) {
            return;
        }
        dci_0 dci_02 = new dci_0(bdj_22, bdj_22.dda());
        bdn_2.a(bgy2, dci_02);
        cxq_1.eWO().a(dci_02);
        bdj_22.a(new bdo_2(bdj_22));
    }

    public static void a(bgy bgy2, dci_0 dci_02) {
        Object object;
        boolean bl;
        boolean bl2;
        bgy bgy3;
        bgy bgy4;
        bgy bgy5;
        bgy bgy6;
        ahv_2[] ahv_2Array = new ahv_2[]{new ahv_2(), new ahv_2()};
        boolean bl3 = bgy2.ddI().bps();
        if (bgy2.a(exe_1.rEh)) {
            bgy6 = bgy2.djZ();
            bgy5 = bgy2.djZ();
            bgy4 = bgy2.djZ();
        } else {
            bgy5 = bgy2;
            bgy6 = bgy2;
            bgy4 = bgy2.aWP() == 3251 ? bgy2.djY() : bgy2;
        }
        String string = null;
        if (!bgy4.doP()) {
            if (bgy4 instanceof bhx_0) {
                bdn_2.a(bl3, bgy4, ahv_2Array, dci_02);
            }
            string = bdn_2.e(bgy4, false);
            bdn_2.a(dci_02, bgy4);
            bdn_2.f(bgy2, true);
        } else if (bgy4 instanceof bhx_0) {
            bgy3 = (bhx_0)bgy4;
            aIp.b(bgy3.ddI());
        }
        bgy3 = aue_0.cVJ().cVK();
        int n = ((bgt_0)bgy3).dmW();
        int n2 = bgy2.bqo();
        boolean bl4 = n == n2;
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bl4 && bsj_02 != null && bsj_02.dGo().fLd() && bgy4 instanceof bhx_0 && bgy4.a(ezj_0.ptb)) {
            ahv_2Array[1].ceH().ceC().ih(awx_2.dnX.bQk());
            ahv_2Array[1].ceD();
        }
        if (bl4 && bsj_02 != null && bsj_02.dGp() == etw_0.rqT && bgy3.bcP() == bgy2.bcP()) {
            if (bgy2.aFW() == 5) {
                bdn_2.f(bgy2, true);
            } else {
                aIp.e(bgy2.ddI());
            }
        }
        bdn_2.b(bgy2, bl4);
        boolean bl5 = bl2 = bgy2.djT() && !bl4;
        if (bl2) {
            ahv_2Array[1].ceH().c(aum_0.cWf().c("desc.inFight", new Object[0]));
        }
        boolean bl6 = bl = bl2 && aJP.cig().cih() != n2;
        if (bl) {
            bdn_2.o(bsU.dHk().Ft(n2));
        }
        if (bsj_02 != null && !bjv_2.aM(bgy5) && (object = bgy5.djK()) != null && ((String)object).length() > 0) {
            ahv_2Array[1].ceH().c((CharSequence)object);
        }
        if (dci_02.fbw().isEmpty()) {
            object = ahv_2Array[0].ceL() + bdn_2.c(bgy6, bl3) + ahv_2Array[1].ceL();
            dci_02.a((String)object, string, bdn_2.W(bgy2));
        }
    }

    public static void a(dci_0 dci_02, bgy bgy2) {
        String string = bdn_2.X(bgy2);
        String string2 = null;
        if (string != null) {
            try {
                string2 = String.format(auc_0.cVq().bS("popupIconPath"), string);
            }
            catch (fu_0 fu_02) {
                hKT.error((Object)fu_02.getMessage(), (Throwable)fu_02);
            }
        }
        dci_02.rd(string2);
    }

    @NotNull
    private static List<String> W(bgy bgy2) {
        boolean bl;
        if (!(bgy2 instanceof bhJ)) {
            return Collections.emptyList();
        }
        if (bgy2.cmL() == 0) {
            return Collections.emptyList();
        }
        boolean bl2 = bgy2.bvY() && eIA.pH(bgy2.Xi());
        boolean bl3 = bl = !bgy2.bvY() && eIA.dF(((bhJ)bgy2).dpa());
        if (!bl2 && !bl) {
            return Collections.emptyList();
        }
        try {
            return Lists.newArrayList((Object[])new String[]{String.format(auc_0.cVq().bS("mentorIconPath"), "newPlayer_32")});
        }
        catch (fu_0 fu_02) {
            hKT.error((Object)fu_02.getMessage(), (Throwable)fu_02);
            return Collections.emptyList();
        }
    }

    private static String X(bgy bgy2) {
        if (bgy2 instanceof bhJ) {
            return "breed" + bgy2.aWP();
        }
        String string = null;
        if (bgy2 instanceof bhx_0) {
            bJr bJr2 = (bJr)bgy2.doW();
            bjz_1 bjz_12 = bja_1.drJ().bC(bgy2.aWP());
            eyv eyv2 = eyw.fik().OW(bjz_12.cqy());
            int n = bgy2.a(ezj_0.psQ) && bJr2 == null ? 0 : eyv2.fii();
            bdq_2 bdq_22 = bdq_2.hLe;
            if (n == 0) {
                bdq_22 = bdq_2.hLd;
            }
            if (bJr2 != null) {
                bdq_22 = bdq_2.hLf;
            }
            if (bdq_22 == bdq_2.hLe) {
                string = "monsters";
            } else if (bdq_22 == bdq_2.hLg) {
                string = "hooded";
            }
        }
        return string;
    }

    private static void b(bgy bgy2, boolean bl) {
        if (bl && !bgy2.doP() && bgy2.doE()) {
            for (QD qD : bgy2.doc()) {
                qu_0 qu_02 = qD.bbd();
                if (qu_02 == null || qD.bba() == null || qD.bba().aZH() != 25274) continue;
                CellParticleSystem cellParticleSystem = agY.bzw().sl(78900);
                cellParticleSystem.r(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
                cellParticleSystem.setDuration(2000);
                agZ.bzy().b(cellParticleSystem);
            }
        }
    }

    public static String Y(bgy bgy2) {
        boolean bl;
        ahv_2 ahv_22 = new ahv_2();
        String string = aum_0.cWf().c("levelShort.custom", bgy2.cmL());
        ahv_22.c(bgy2.getName()).k('\n').k('(').c(string);
        boolean bl2 = bl = bgy2.Xt() != 0;
        if (bl) {
            fpp_0 fpp_02 = bgy2.ffF().gbb();
            String string2 = aum_0.cWf().c("nation.pvpRank." + String.valueOf(fpp_02), new Object[0]);
            ahv_22.c(", ").c(string2).k(')');
        } else {
            ahv_22.k(')');
        }
        return ahv_22.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String c(bgy bgy2, boolean bl) {
        Optional<bnf_0> optional;
        Object object;
        boolean bl2;
        ahv_2 ahv_22 = new ahv_2();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl3 = bl2 = bgy2.aWP() == 3251;
        if (bdm_2.V(bgy2)) {
            bdm_2.e(ahv_22);
        }
        ahv_22.ceu();
        if (bgy2.dkZ() != null) {
            ahv_22.c(bgy2.aZk());
            int n = bgy2.c((pt_0)exx_2.rGi) + bgy2.c((pt_0)exx_2.rHp);
            object = bgy2.e(exx_2.rGi);
            optional = bgy2.e(exx_2.rHp);
            float f2 = (float)n / (float)(((exf_2)object).aYD() + ((exf_2)((Object)optional)).aYD());
            ahv_22.c(" (").c(aum_0.cWf().c("hp.var", n)).c(" - ").yx((int)(f2 * 100.0f)).c("%").c(")");
            float f3 = bgy2.fhi();
            if (f3 > 1.0f) {
                ahv_22.ceH().c(aum_0.cWf().c("desc.healRes", (int)f3));
            }
        } else {
            Object object2;
            if (bl) {
                ahv_22.c("[").hY(bgy2.Sn()).c("] ");
            }
            if (bgy2 instanceof bhx_0 && (bgy2.doP() || bgy2.a(ezj_0.psF))) {
                ahv_22.c(aum_0.cWf().c("npc.corpse", new Object[0]));
            }
            ahv_22.ceC();
            if (bgy2 instanceof bhJ) {
                if (bdn_2.ddy()) {
                    ahv_22.e(awx_2.dnW);
                } else {
                    object2 = ((eve_2)((Object)bgy2)).dpL().fdE().b(euq_1.orT);
                    if (object2 != null && ((eup_1)object2).apJ() == (long)exH.pdx) {
                        ahv_22.e(awx_2.doa);
                    }
                }
            }
            ahv_22.c(bgy2.aZk());
            ahv_22.ceD();
            if (bl) {
                ahv_22.c(" (").yx(bgy2.bcC()).c(";").yx(bgy2.bcD()).c(") ");
            }
            if (bgy2.bvY()) {
                ahv_22.c(" (").c(aum_0.cWf().c("levelShort.custom", bgy2.cmL()));
                try {
                    object2 = bgy2.dnK();
                    if (object2 != null && ((eIm)object2).fwt().tL() != -1) {
                        ahv_22.k(' ').a(auk_0.zU(116), 10, 12, null, null);
                    }
                }
                catch (fu_0 fu_02) {
                    hKT.error((Object)"Exception trying to getNameAndLevel", (Throwable)fu_02);
                }
                finally {
                    ahv_22.c(")");
                }
            }
        }
        if (bdn_2.d(bgy2, bl2)) {
            ahv_22.c("\n").c(aum_0.cWf().c("owners.summoning", bgy2.djZ().getName()));
        }
        if (bgy2 instanceof bhx_0 && bgy2.a(ezj_0.ptH)) {
            ahv_22.c("\n").c(aum_0.cWf().c("companionOwnedBy", bgy2.djY().getName()));
        }
        if (bgy2 instanceof bhx_0 && !bgy2.doP() && !bgy2.a(ezj_0.psF) && !bl2) {
            ahv_22.c("\n(").c(aum_0.cWf().c("levelShort.custom", bgy2.cmL()));
            ahv_22.c(")");
        }
        if (bgy2.baI()) {
            ahv_22.c(" ").c(aum_0.cWf().c("koMessage", bgy2.c((pt_0)exx_2.rGs)));
        }
        ahv_22.cev();
        if (bgt_02.dkZ() != null && bgy2.bqo() == bgt_02.bqo() && bgy2.Sn() != bgt_02.Sn()) {
            bdn_2.a(ahv_22, bgy2, bgt_02);
        }
        if (bl2) {
            bgy2 = bgy2.djY();
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        if (bgy2 instanceof bhx_0) {
            object = (bJr)bgy2.doW();
            if (object != null) {
                optional = ((foP)object).gfR();
                int n = ((fjo_0)((Object)optional)).Xt();
                ahv_2 ahv_23 = new ahv_2();
                ahv_23.ceC();
                ahv_23.ih(brl_2.a(fjn_02, optional).bQk());
                ahv_23.c(aum_0.cWf().a(39, (long)n, new Object[0])).ceD();
                ahv_22.c("\n").c(ahv_23.toString());
            }
        } else if (bgy2 instanceof bhJ) {
            object = (bhJ)bgy2;
            optional = ((bhJ)object).dpz();
            optional.ifPresent(arg_0 -> bdn_2.a((bhJ)object, ahv_22, arg_0));
            if (((bhJ)object).dpO()) {
                bjn_1 bjn_12 = ((bhJ)object).dpI();
                ahv_22.ceH().c(bjn_12.getName());
            }
        }
        return ahv_22.ceL();
    }

    private static void a(long l, String string, bnf_0 bnf_02, ahv_2 ahv_22) {
        if (bym_2.ms(l)) {
            ahv_22.ceH().e(beo_0.d(bnf_02.egk().gkb())).c(string).ceD();
        } else {
            ahv_22.ceH().c(string);
        }
    }

    private static boolean d(bgy bgy2, boolean bl) {
        return bgy2.dOp() && !bl && bgy2.djZ() != bgy2;
    }

    private static void a(ahv_2 ahv_22, bgy bgy2, bgt_0 bgt_02) {
        if (bgt_02.dfW() == eym.pig) {
            bdn_2.b(ahv_22, bgy2, bgt_02);
            return;
        }
    }

    private static void b(ahv_2 ahv_22, bgy bgy2, bgt_0 bgt_02) {
        exf_2 exf_22 = bgy2.e(exx_2.rGi);
        exf_2 exf_23 = bgy2.e(exx_2.rHp);
        float f2 = (float)(exf_22.aYB() + exf_23.aYB()) / (float)(exf_22.aYD() + exf_23.aYD());
        exf_2 exf_24 = bgt_02.e(exx_2.rGi);
        exf_2 exf_25 = bgt_02.e(exx_2.rHp);
        float f3 = (float)(exf_24.aYB() + exf_25.aYB()) / (float)(exf_24.aYD() + exf_25.aYD());
        if (f3 < f2) {
            ahv_22.ceH().ceC().ih(awx_2.dnL.bQk()).c(aum_0.cWf().c("hasMoreLife", new Object[0])).ceD();
        }
    }

    public static void d(bdj_2 bdj_22) {
        bji_1 bji_12;
        cxq_1.eWO().a(bdj_22);
        bgy bgy2 = bdj_22.dcP();
        if (bgy2 == null) {
            return;
        }
        bdj_22.bpV();
        if (bgy2 instanceof bhx_0 && (bji_12 = bjl_1.dri().jO(((bhx_0)bgy2).aXa())) != null) {
            for (bjk_1 bjk_12 : bji_12.dre()) {
                bgy bgy3 = bgg_0.dlO().ju(bjk_12.Sn());
                if (bgy3 == null) continue;
                bgy3.ddI().bpV();
            }
        }
        bdn_2.ddz();
        bdn_2.f(bgy2, false);
    }

    private static void a(boolean bl, bgy bgy2, ahv_2[] ahv_2Array, dci_0 dci_02) {
        bji_1 bji_12 = bjl_1.dri().jO(((bhx_0)bgy2).aXa());
        if (!bgy2.djT() && bji_12 != null) {
            Object object;
            int n = bji_12.drg();
            if (bji_12.dre().size() > 1) {
                bdn_2.a(dci_02, n);
            }
            if (bl) {
                bdn_2.a(dci_02, bji_12.Sn());
                object = bgy2.doW();
                if (object != null) {
                    bdn_2.d(dci_02, ((foP)object).d());
                }
            }
            object = bji_12.dre();
            int n2 = object.size();
            for (int i = 0; i < n2; ++i) {
                bjk_1 bjk_12 = (bjk_1)object.get(i);
                bdn_2.a(bl, bgy2, dci_02, bjk_12);
            }
            bdn_2.a(ahv_2Array, (double)n);
        }
        if (bl && bgy2.djT()) {
            bdn_2.a(bgy2, ahv_2Array);
        }
    }

    public static void a(dci_0 dci_02, int n) {
        dci_02.eQ(new ahv_2().ceu().c(aum_0.cWf().c("levelShort.custom", n)).cev().ceL());
    }

    public static void b(dci_0 dci_02, int n) {
        dci_02.rf(new ahv_2().ceu().c(aum_0.cWf().c("levelShort.custom", n)).cev().ceL());
    }

    public static void c(dci_0 dci_02, int n) {
        dci_02.rg(new ahv_2().ceu().c(aum_0.cWf().c("levelShort.custom", n)).cev().ceJ().ceL());
    }

    private static void a(bgy bgy2, ahv_2[] ahv_2Array) {
        ahv_2 ahv_22 = ahv_2Array[1];
        ahv_22.ceH().ceA().c("        ").ceB().ceH();
        ahv_22.ceC().ih("999999").c("cheap fight debug panel :").ceH();
        ahv_22.c("summoned=").ei(bgy2.dOp()).ceH();
        ahv_22.c(bgy2.fhu()).ceD();
    }

    private static void a(ahv_2[] ahv_2Array, double d2) {
    }

    private static void a(dci_0 dci_02, double d2) {
        dci_02.re(String.format("<b>Group level: %.2f</b>", d2));
    }

    private static void a(dci_0 dci_02, long l) {
        dci_02.re(String.format("<b>Group ID: %d</b>", l));
    }

    private static void d(dci_0 dci_02, int n) {
        dci_02.re(String.format("<b>Protector ID: %d</b>", n));
    }

    public static void a(boolean bl, bgy bgy2, dci_0 dci_02, bjk_1 bjk_12) {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        ahv_2 ahv_22 = new ahv_2();
        bjz_1 bjz_12 = bja_1.drJ().bC(bjk_12.drh());
        eyv eyv2 = eyw.fik().OW(bjz_12.cqy());
        bJr bJr2 = (bJr)bgy2.doW();
        int n = bgy2.a(ezj_0.psQ) && bJr2 == null ? 0 : eyv2.fii();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdq_2 bdq_22 = bdq_2.hLe;
        if (n == 0) {
            bdq_22 = bdq_2.hLd;
        }
        if (bJr2 != null) {
            bdq_22 = bdq_2.hLf;
        }
        if (bjv_2.aM(bgy2)) {
            bdq_22 = bdq_2.hLg;
        }
        if (bjk_12.Sn() == bgy2.Sn() && bdq_22 != bdq_2.hLd) {
            ahv_22.ceu();
        }
        ahv_22.c(bjk_12.a(bl, bdq_22));
        if (bjk_12.Sn() == bgy2.Sn() && bdq_22 != bdq_2.hLd) {
            ahv_22.cev();
        }
        bje_1 bje_12 = bdn_2.a(bjk_12, bjz_12);
        if (bJr2 != null) {
            if (bJr2.cXe() == bgy2.Sn()) {
                bje_12 = bje_1.inx;
            }
            object3 = bJr2.gfR();
            int n2 = ((fjo_0)object3).Xt();
            object2 = bgt_02.ffF();
            object = object2.ems();
            if (!evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ)) {
                ahv_22.c(" (").yx(bJr2.d()).c(")");
            }
            ahv_22.ceH().ceC();
            ahv_22.ih(brl_2.a((fjn_0)object2, (fjo_0)object3).bQk());
            ahv_22.c(aum_0.cWf().a(39, (long)n2, new Object[0])).ceD();
        }
        object3 = null;
        if (bgy2 instanceof bhx_0 && ((bhx_0)bgy2).doL() > 0L) {
            bhx_0 bhx_02 = (bhx_0)bgy2;
            object3 = bdn_2.bj(bhx_02.doQ().aWP());
        } else if (n != 0 && !bl_0.bl((String)(object3 = bje_12.Dh(n)))) {
            object3 = bje_12.Dh(0);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        object2 = bTj.eno().doD();
        if (object2 != null && ((foG)(object = ((bJr)object2).eaH())).XV(eyv2.cqy())) {
            arrayList.add(auc_0.cVq().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
            dci_02.v(awx_2.dnJ);
        }
        if ((bl2 = fcL.rUh.sz(bgt_02.Xi()).stream().anyMatch(exP2 -> exP2.doV() == eym.phX)) && bjz_12.c(exe_1.rDO)) {
            arrayList.add(auc_0.cVq().a("osamodasMonsterIconPath", "defaultIconPath", new Object[0]));
        }
        if (bgy2.djT()) {
            boolean bl3;
            boolean bl4 = bgy2.dkW().dGr() == bgy2.bcP();
            boolean bl5 = bl3 = bgy2.fgU() || bgy2.doP();
            if (bl4) {
                dci_02.a(ahv_22.toString(), null, (String)object3, null, bl3);
            } else {
                dci_02.b(ahv_22.toString(), null, (String)object3, null, bl3);
            }
        } else {
            dci_02.a(ahv_22.ceL(), (String)object3, arrayList);
        }
        bhx_0 bhx_03 = (bhx_0)bgg_0.dlO().ju(bjk_12.Sn());
        if (bhx_03 != null) {
            aIp.b(bhx_03.ddI());
        }
    }

    private static String bj(short s) {
        try {
            return fo_0.b(auc_0.cVq().bS("companionInFightIconsPath"), s);
        }
        catch (fu_0 fu_02) {
            hKT.warn((Object)("Could not retrieve icon path of companion " + s), (Throwable)fu_02);
            return null;
        }
    }

    private static bje_1 a(bjk_1 bjk_12, bjz_1 bjz_12) {
        switch (bjz_12.drz()) {
            case pjz: {
                return bje_1.inu;
            }
            case pjC: {
                return bje_1.int;
            }
        }
        return bje_1.dp(aue_0.cVJ().cVK().cmL(), bjk_12.cmL());
    }

    public static String e(bgy bgy2, boolean bl) {
        if (!(bgy2 instanceof bhJ)) {
            return null;
        }
        bhJ bhJ2 = (bhJ)bgy2;
        long l = bhJ2.Ya();
        if (l <= 0L) {
            if (bl) {
                try {
                    return String.format(auc_0.cVq().bS("guildBlazonBackgroundPartPath"), 5);
                }
                catch (fu_0 fu_02) {
                    return null;
                }
            }
            return null;
        }
        ezb ezb2 = new ezb(bhJ2.dmc() ? bhJ2.HP() : bhJ2.dpI().Yc());
        buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
        buK.dJw().a(buJ2);
        buJ2.bmX();
        return String.valueOf(buJ2.dJu());
    }

    private static void f(bgy bgy2, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null && bsj_02.d() == bgy2.bqo()) {
            bsj_02.dGQ().i(bgy2, bl);
            if (bl) {
                bsj_02.dGQ().bA(bgy2);
            } else {
                bsj_02.dGQ().dIF();
            }
        }
    }

    private static boolean ddx() {
        if (cud_1.eSz().eNj()) {
            return true;
        }
        if (cuj_1.eSQ().eNj()) {
            return true;
        }
        return cuk_2.eSS().eNj();
    }

    private static boolean ddy() {
        return ue_0.bjV().bjc().i(hKY) && ue_0.bjV().bjc().g(hKZ);
    }

    private static void o(bsS bsS2) {
        hKU.ddz();
        hKU.p(bsS2);
        long l = (long)(((bsg_1)aie_0.cfn().bmH()).c(bsn_1.lju) * 1000.0f);
        abb_2.bUA().a(hKU, l, 0, 1L);
    }

    private static void ddz() {
        hKU.ddz();
    }

    private static /* synthetic */ void a(bhJ bhJ2, ahv_2 ahv_22, bnf_0 bnf_02) {
        bdn_2.a(bhJ2.Xi(), bnf_02.cC(bhJ2.aWO()), bnf_02, ahv_22);
    }
}

