/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUH
 */
public class cuh_2
implements adi_1 {
    private static final Logger nNm = Logger.getLogger(cuh_2.class);
    private static final cuh_2 nNn = new cuh_2();
    private final aad_0 nNo = new aad_0("fightPlacement", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
    private bgy nNp;
    private akc_0 nMT = new akc_0();

    public static cuh_2 eSM() {
        return nNn;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        switch (aam_22.d()) {
            case 17287: {
                bsj_0 bsj_02 = bgt_02.dkZ();
                bsj_0 bsj_03 = bgt_02.dnB();
                if (bsj_03 != null) {
                    return false;
                }
                if (bsj_02 == null) {
                    nNm.error((Object)"Receiving ready status message without being in a fight");
                    return false;
                }
                if (bsj_02.dGp() != etw_0.rqT) {
                    return false;
                }
                ckA ckA2 = new ckA();
                bdj_2 bdj_22 = bgt_02.ddI();
                if (!bsj_02.bj(bgt_02)) {
                    this.cd(null);
                    this.eSO();
                    ckA2.bj(true);
                    bsj_02.bh(bgt_02);
                    if (!bsj_02.bk(bgt_02)) {
                        cuh_2.u(bsj_02);
                    } else {
                        btn_0.b(bdj_22, bdj_22.dcX());
                    }
                } else {
                    ckA2.bj(false);
                    cuh_2.v(bsj_02);
                    bsj_02.bi(bgt_02);
                }
                aue_0.cVJ().etu().d(ckA2);
                return false;
            }
            case 19132: {
                ckx ckx2 = new ckx();
                if (this.nNp == null) {
                    ckx2.eY(aue_0.cVJ().cVK().Sn());
                } else {
                    ckx2.eY(this.nNp.Sn());
                }
                ckx2.m(abi_1.dzq);
                aue_0.cVJ().etu().d(ckx2);
                return false;
            }
            case 18450: {
                ckx ckx3 = new ckx();
                if (this.nNp == null) {
                    ckx3.eY(aue_0.cVJ().cVK().Sn());
                } else {
                    ckx3.eY(this.nNp.Sn());
                }
                ckx3.m(abi_1.dzk);
                aue_0.cVJ().etu().d(ckx3);
                return false;
            }
            case 16274: {
                ckx ckx4 = new ckx();
                if (this.nNp == null) {
                    ckx4.eY(aue_0.cVJ().cVK().Sn());
                } else {
                    ckx4.eY(this.nNp.Sn());
                }
                ckx4.m(abi_1.dzm);
                aue_0.cVJ().etu().d(ckx4);
                return false;
            }
            case 18540: {
                ckx ckx5 = new ckx();
                if (this.nNp == null) {
                    ckx5.eY(aue_0.cVJ().cVK().Sn());
                } else {
                    ckx5.eY(this.nNp.Sn());
                }
                ckx5.m(abi_1.dzo);
                aue_0.cVJ().etu().d(ckx5);
                return false;
            }
            case 19770: {
                if (bgt_02.a(ezj_0.ptw)) {
                    return false;
                }
                bsj_0 bsj_04 = bgt_02.dkZ();
                if (bsj_04 == null) {
                    nNm.error((Object)"The current fight for the local player has not been found");
                    return false;
                }
                boolean bl = !bsj_04.bG(bgt_02.bcP());
                bsj_04.h(bgt_02.bcP(), bl);
                fse_1.gFu().f("currentFightRequestHelp", bl);
                ckl ckl2 = new ckl();
                ckl2.jj(bl);
                aue_0.cVJ().etu().d(ckl2);
                aPd.g("fight.callForHelp", bgt_02.getName());
                return false;
            }
            case 17914: {
                if (cub_1.eSi().cXk() != null) {
                    if (bgt_02.a(ezj_0.ptx)) {
                        return false;
                    }
                    ckF ckF2 = new ckF();
                    boolean bl = ((dae_0)aam_22).bCu();
                    ckF2.jm(bl);
                    aue_0.cVJ().etu().d(ckF2);
                }
                return false;
            }
            case 16346: 
            case 16990: {
                if (!cub_1.eSi().eSo()) {
                    return true;
                }
                this.nMT.ciS();
                dcm_0 dcm_02 = (dcm_0)aam_22;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                bsj_0 bsj_05 = bgt_03.dkZ();
                if (bsj_05 == null) {
                    return true;
                }
                if (bsj_05.bj(bgt_03)) {
                    return true;
                }
                rh_0 rh_02 = bsj_05.bag();
                ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(dcm_02.bqM(), dcm_02.bqN(), bgt_03.bcE(), aar.bZk);
                boolean bl = this.eM(dcm_02.bqM(), dcm_02.bqN()) != null;
                bgy bgy2 = this.nNp == null ? bgt_03 : this.nNp;
                acd_1 acd_12 = this.a(bgt_03, rh_02, arrayList);
                this.nNo.bqC();
                if (acd_12 != null && !bl && !acd_12.equals(bgy2.aZw())) {
                    this.nNo.E(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                }
                return true;
            }
            case 16902: {
                if (!cub_1.eSi().eSo()) {
                    return true;
                }
                dcm_0 dcm_03 = (dcm_0)aam_22;
                bgt_0 bgt_04 = aue_0.cVJ().cVK();
                bsj_0 bsj_06 = bgt_04.dmV();
                if (bsj_06.bj(bgt_04)) {
                    return true;
                }
                rh_0 rh_03 = bsj_06.bag();
                ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(dcm_03.bqM(), dcm_03.bqN(), bgt_04.bcE(), aar.bZk);
                if (dcm_03.fch()) {
                    bgy bgy3;
                    acd_1 acd_13 = this.a(bgt_04, rh_03, arrayList);
                    boolean bl = this.eL(dcm_03.bqM(), dcm_03.bqN());
                    bgy bgy4 = bgy3 = this.nNp == null ? bgt_04 : this.nNp;
                    if (!bl && acd_13 != null && !acd_13.equals(bgy3.aZw())) {
                        cAY.eHc().nP(600071L);
                        ckn ckn2 = new ckn();
                        ckn2.db(this.nNp == null ? bgt_04.Sn() : this.nNp.Sn());
                        ckn2.b(acd_13);
                        aue_0.cVJ().etu().d(ckn2);
                    }
                } else {
                    if (dcm_03.fcj()) {
                        this.cd(null);
                        this.eSO();
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private boolean eL(int n, int n2) {
        bgy bgy2 = this.nNp;
        bgy bgy3 = this.eM(n, n2);
        if (bgy3 != null) {
            this.cd(bgy3);
        }
        this.eSO();
        return this.nNp != bgy2;
    }

    public void cd(@Nullable bgy bgy2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.nNp = bgy2 != null ? bgy2 : bgt_02;
        fse_1.gFu().f("currentLocalFighter", this.nNp);
    }

    public bgy eSN() {
        return this.nNp;
    }

    public void eSO() {
        bgy bgy2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy3 = bgy2 = this.nNp == null ? bgt_02 : this.nNp;
        if (bgy2 instanceof bhx_0) {
            bhx_0 bhx_02 = (bhx_0)bgy2;
            if (bhx_02.i(ezj_0.ptH)) {
                try {
                    String string = String.format(auc_0.cVq().bS("companionIconsPath"), bhx_02.aWP());
                    this.qz(string);
                }
                catch (fu_0 fu_02) {
                    nNm.error((Object)"PropertyException during handleCharacterIconDisplay", (Throwable)fu_02);
                }
            }
        } else if (bgy2 != null && bgt_02.dnQ().dfG() && !bgt_02.dnQ().dKL().rv(bgt_02.aZj()).isEmpty()) {
            try {
                String string = String.format(auc_0.cVq().bS("breedPortraitIllustrationPath"), bgy2.aWP() + String.valueOf(bgy2.aWO()));
                this.qz(string);
            }
            catch (fu_0 fu_03) {
                nNm.error((Object)"PropertyException during handleCharacterIconDisplay", (Throwable)fu_03);
            }
        } else {
            fib_2.gBU().eKH();
        }
    }

    private void qz(String string) {
        fib_2.gBU().a(string, null, 42, -10, faa_2.tLO);
    }

    @Nullable
    private bgy eM(int n, int n2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<adj_0> arrayList = aie_0.cfn().bmC().aD(n, n2);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (adj_0 adj_02 : arrayList) {
            if (!(adj_02 instanceof bdj_2)) continue;
            bdj_2 bdj_22 = (bdj_2)adj_02;
            bgy bgy2 = bdj_22.dcP();
            this.nMT.j(bgy2);
            if (fcK.rUe.c(bgt_02.aZj(), bgy2)) {
                return bgy2;
            }
            if (!bgy2.dkQ()) continue;
            return bgy2;
        }
        return null;
    }

    private acd_1 a(bgt_0 bgt_02, rh_0 rh_02, ArrayList<DisplayedScreenElement> arrayList) {
        acd_1 acd_12 = new acd_1();
        byte by = bgt_02.bcP();
        for (int i = 0; i < arrayList.size(); ++i) {
            DisplayedScreenElement displayedScreenElement = arrayList.get(i);
            acd_12.C(displayedScreenElement.brk().bsx());
            byte by2 = rh_02.aa(acd_12.getX(), acd_12.getY());
            if (by != by2 || rh_02.Z(acd_12.getX(), acd_12.getY()) != acd_12.bdi()) continue;
            return acd_12;
        }
        return null;
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
        if (!bl) {
            fse_1.gFu().f("isInFightPlacement", true);
            cty_1.ePV().kg(true);
            fyw_0.gqw().d("wakfu.fightAction", cef_1.class);
            this.cd(null);
            this.eSO();
            if (aue_0.cVJ().c(cux_2.eSa())) {
                aue_0.cVJ().b(cux_2.eSa());
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().f("isInFightPlacement", false);
            cty_1.ePV().kg(false);
            this.qx("worldAndFightBarDialog");
            fyw_0.gqw().tc("wakfu.fightCreationOrPlacement");
            this.nNo.bqC();
            this.nNp = null;
            fse_1.gFu().f("currentLocalFighter", (Object)null);
            this.nMT.ciS();
            fib_2.gBU().eKH();
        }
    }

    private void qx(String string) {
        fes_2 fes_22;
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 != null && (fes_22 = (fes_2)fhs_22.uH("apsContainer")) != null) {
            fes_22.setVisible(false);
        }
    }

    private static void u(bsj_0 bsj_02) {
        for (bgy bgy2 : bsj_02.dGs()) {
            if (!bgy2.dkQ()) continue;
            bgy2.ddI().dcY();
        }
    }

    private static void v(bsj_0 bsj_02) {
        for (bgy bgy2 : bsj_02.dGs()) {
            if (!bgy2.dkQ()) continue;
            bgy2.ddI().dcZ();
        }
    }
}

