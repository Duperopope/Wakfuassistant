/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEJ
 */
public class bej_0 {
    private static final Logger jRl = Logger.getLogger(bej_0.class);

    private bej_0() {
    }

    private static bfw_1 b(aMU aMU2) {
        return bfw_1.bW(aMU2.cpx());
    }

    private static bey_1 c(aMU aMU2) {
        return bey_1.bU(aMU2.cpy());
    }

    private static void a(bgw_2 bgw_22, aMU aMU2, Map<ffj_0, ang_2> map) {
        ((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)((bgw_2)bgw_22.Vr(aMU2.d())).fb(aMU2.cpe())).Vs(aMU2.aVt())).Vt(aMU2.cpf() == 0 ? aMU2.aVt() : aMU2.cpf())).Vu(aMU2.cpg())).fc(aMU2.cmL())).N(map)).j(bej_0.d(aMU2))).fd(aMU2.cpj())).gw(aMU2.cpk())).gx(aMU2.cpl())).gy(aMU2.cpm())).Vv(aMU2.cpn())).Vw(aMU2.cpo())).nl(aMU2.cpp())).nm(aMU2.cpq())).nn(aMU2.cpr())).no(aMU2.cps())).h(bej_0.f(aMU2))).c(bej_0.g(aMU2))).b(bej_0.e(aMU2))).b(bej_0.i(aMU2))).c(bej_0.h(aMU2))).gz(aMU2.cpz())).gA(aMU2.cpA())).fc(aMU2.cpC())).fb(aMU2.cpB())).c(fgl.gn(aMU2.cpD()));
    }

    private static fhy_0 d(aMU aMU2) {
        return bew_1.dSk().Gy(aMU2.cpi());
    }

    private static fgp_0 e(aMU aMU2) {
        return fgp_0.valueOf(aMU2.cpv());
    }

    private static fgj f(aMU aMU2) {
        return fgj.eV(aMU2.cpt());
    }

    private static fgW g(aMU aMU2) {
        fgW fgW2 = fgW.go(aMU2.cpu());
        if (fgW2 != fgW.smf && ewo_0.oBF.k(ewr_0.oDs)) {
            return fgW.e(true, fgW2.fXx(), fgW2.bKa());
        }
        return fgW2;
    }

    public static bgv_2 a(aMU aMU2, Map<ffj_0, ang_2> map) {
        bgw_2 bgw_22 = new bgw_2();
        bej_0.a(bgw_22, aMU2, map);
        bgw_22.b(bej_0.b(aMU2)).b(bej_0.c(aMU2));
        return (bgv_2)bgw_22.dhn();
    }

    @Nullable
    public static fhg_0 h(aMU aMU2) {
        byte[] byArray;
        fhg_0 fhg_02 = new fhg_0(aMU2.d());
        amx_0 amx_02 = aMU2.cpF();
        if (amx_02 == null) {
            return null;
        }
        for (byte by : byArray = amx_02.cpN()) {
            ffS ffS2 = ffS.gj(by);
            if (ffS2 == null) {
                jRl.fatal((Object)("Item " + aMU2.d() + " has invalid EquipmentPosition : " + by));
                continue;
            }
            fhg_02.w(ffS2);
        }
        rd_0 rd_02 = rd_0.O(amx_02.cpM());
        if (rd_02 == null) {
            jRl.fatal((Object)("Item " + aMU2.d() + " has invalid SlotColor : " + amx_02.cpM()));
        } else {
            fhg_02.f(rd_02);
        }
        fhg_02.R(amx_02.cpO()).S(amx_02.cpP()).np(amx_02.cpQ());
        return fhg_02;
    }

    @Nullable
    public static fhp_0 i(aMU aMU2) {
        amy_0 amy_02 = aMU2.cpG();
        if (amy_02 == null) {
            return null;
        }
        byte[] byArray = amy_02.cpR();
        if (byArray == null) {
            return null;
        }
        fhp_0 fhp_02 = new fhp_0();
        rd_0[] rd_0Array = new rd_0[byArray.length];
        for (int i = 0; i < byArray.length; ++i) {
            rd_0 rd_02 = rd_0.O(byArray[i]);
            if (rd_02 == null) {
                jRl.fatal((Object)("Item " + aMU2.d() + " has invalid SlotColor : " + i + " for slotColorPattern"));
                return null;
            }
            rd_0Array[i] = rd_02;
        }
        fhp_02.c(rd_0Array);
        fhr_0 fhr_02 = fhr_0.v(amy_02.cpS(), amy_02.cpT());
        fhp_02.c(fhr_02);
        return fhp_02;
    }
}

