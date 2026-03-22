/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cUL
 */
public class cul_2
implements adi_1 {
    private static final Logger nNt = Logger.getLogger(cul_2.class);
    private static final cul_2 nNu = new cul_2();
    public static final int nNv = 5;
    private bgy nNw;
    private crs_2 nNx;
    private ddk nNy;
    private static String nNz = "timelineScrollContainer";

    public static cul_2 eST() {
        return nNu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18201: {
                blh_2 blh_22 = aue_0.cVJ().cVN();
                if (blh_22 != null) {
                    blh_22.edx();
                }
                return false;
            }
            case 16855: {
                blh_2 blh_23 = aue_0.cVJ().cVN();
                if (blh_23 != null) {
                    blh_23.edy();
                }
                return false;
            }
            case 19662: {
                bsj_0 bsj_02 = this.nNw.dkZ();
                if (bsj_02 == null) {
                    return false;
                }
                if (!bsj_02.dGN()) {
                    return false;
                }
                bsj_02.be(this.nNw);
                bqm_0.jbp.b(new brb_1());
                return false;
            }
            case 18543: {
                dbn dbn2 = (dbn)aam_22;
                byte by = dbn2.faH();
                ffV ffV2 = dbn2.getItem();
                bmx_0 bmx_02 = dbn2.eeW();
                if (bmx_02 != null && ffV2 != null) {
                    bmx_0 bmx_03 = cuk_2.eSS().eSR();
                    if (aue_0.cVJ().c(cuj_1.eSQ()) && bmx_03 != null && bmx_03.equals(bmx_02)) {
                        aue_0.cVJ().b(cuj_1.eSQ());
                    } else {
                        if (aue_0.cVJ().c(cud_1.eSz())) {
                            aue_0.cVJ().b(cud_1.eSz());
                        }
                        if (aue_0.cVJ().c(cuk_2.eSS())) {
                            aue_0.cVJ().b(cuk_2.eSS());
                        }
                        if (this.nNw.dkZ().a((exP)this.nNw, ffV2, bmx_02, null) == fqH.sUS) {
                            cuj_1.eSQ().k(bmx_02);
                            cuj_1.eSQ().bW(this.nNw);
                            cuj_1.eSQ().eNa();
                            cuj_1.eSQ().h(ffV2, by);
                            cuj_1.eSQ().bW(this.nNw);
                            cuj_1.eSQ().eNa();
                            cuj_1.eSQ().eNk();
                            this.nNx = cuj_1.eSQ();
                            aue_0.cVJ().a(cuj_1.eSQ());
                        }
                    }
                }
                return false;
            }
            case 17025: {
                dcC dcC2 = (dcC)aam_22;
                bmx_0 bmx_04 = dcC2.eeW();
                if (bmx_04 != null) {
                    if (this.nNy != null) {
                        this.nNy.fcu();
                        if (this.nNy.fcB()) {
                            return false;
                        }
                    }
                    bmx_0 bmx_05 = cuk_2.eSS().eSR();
                    if (aue_0.cVJ().c(cuk_2.eSS()) && bmx_05 != null && bmx_05.equals(bmx_04)) {
                        aue_0.cVJ().b(cuk_2.eSS());
                    } else {
                        if (aue_0.cVJ().c(cud_1.eSz())) {
                            aue_0.cVJ().b(cud_1.eSz());
                        }
                        if (aue_0.cVJ().c(cuj_1.eSQ())) {
                            aue_0.cVJ().b(cuj_1.eSQ());
                        }
                        bln_2 bln_22 = new bln_2();
                        bln_22.l(this.nNw.dkZ());
                        if (bln_22.a(this.nNw, bmx_04, null, true) == fqH.sUS) {
                            cuk_2.eSS().k(bmx_04);
                            cuk_2.eSS().bW(this.nNw);
                            cuk_2.eSS().eNa();
                            cuk_2.eSS().eNk();
                            this.nNx = cuk_2.eSS();
                            aue_0.cVJ().a(cuk_2.eSS());
                        }
                    }
                }
                return false;
            }
            case 16492: {
                dbm dbm2 = (dbm)aam_22;
                ffV ffV3 = dbm2.getItem();
                byte by = dbm2.faH();
                if (ffV3 != null) {
                    ffV ffV4 = cud_1.eSz().getItem();
                    if (aue_0.cVJ().c(cud_1.eSz()) && ffV4 != null && ffV4.equals(ffV3)) {
                        aue_0.cVJ().b(cud_1.eSz());
                        fib_2.gBU().eKH();
                        fhn_1.gzT().bYz();
                    } else {
                        if (aue_0.cVJ().c(cuk_2.eSS())) {
                            aue_0.cVJ().b(cuk_2.eSS());
                        }
                        if (aue_0.cVJ().c(cuj_1.eSQ())) {
                            aue_0.cVJ().b(cuj_1.eSQ());
                        }
                        if (this.nNw.dkZ().a((exP)this.nNw, ffV3, null, true) == fqH.sUS) {
                            cud_1.eSz().h(ffV3, by);
                            cud_1.eSz().bW(this.nNw);
                            cud_1.eSz().eNa();
                            cud_1.eSz().eNk();
                            this.nNx = cud_1.eSz();
                            aue_0.cVJ().a(cud_1.eSz());
                        }
                    }
                }
                return false;
            }
            case 18563: {
                dbm dbm3 = (dbm)aam_22;
                nNt.info((Object)"UIFightTurnFrame : onMessage : Methode a compl\u00e9ter (LIM)");
                return false;
            }
            case 19132: {
                ckx ckx2 = new ckx();
                ckx2.eY(this.nNw.Sn());
                ckx2.m(abi_1.dzq);
                aue_0.cVJ().etu().d(ckx2);
                return false;
            }
            case 18540: {
                ckx ckx3 = new ckx();
                ckx3.eY(this.nNw.Sn());
                ckx3.m(abi_1.dzo);
                aue_0.cVJ().etu().d(ckx3);
                return false;
            }
            case 18450: {
                ckx ckx4 = new ckx();
                ckx4.eY(this.nNw.Sn());
                ckx4.m(abi_1.dzk);
                aue_0.cVJ().etu().d(ckx4);
                return false;
            }
            case 16274: {
                ckx ckx5 = new ckx();
                ckx5.eY(this.nNw.Sn());
                ckx5.m(abi_1.dzm);
                aue_0.cVJ().etu().d(ckx5);
                return false;
            }
        }
        return true;
    }

    private short biN() {
        bsj_0 bsj_02 = this.nNw.dkZ();
        if (bsj_02 == null) {
            return 0;
        }
        bua bua2 = bsj_02.dGQ();
        if (bua2 == null) {
            return 0;
        }
        return bua2.bhJ();
    }

    public void eSU() {
        if (this.nNw != null) {
            cAY.eHc().nP(600128L);
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fhs_2 fhs_22;
            fcq_2 fcq_22 = (fcq_2)fyw_0.gqw().th("timePointBarDialog").getElementMap().uH(nNz);
            if (fcq_22 != null) {
                fcq_22.setVerticalScrollBarPosition(0.0f);
            }
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            try {
                this.nNw = bgt_02.dkZ().dGQ().dIA();
                if (!this.nNw.dkQ()) {
                    nNt.warn((Object)"Frame de tour de combattant pouss\u00e9 pour le localPlayer alors que ce n'est pas lui le propri\u00e9taire de ce combattant");
                    this.nNw = null;
                }
                if (this.nNw != null && this.nNw.fgk()) {
                    nNt.warn((Object)"frame de tour pouss\u00e9, pour le combattant local, mais pourtant g\u00e9r\u00e9 par l'IA");
                }
                cul_2.ce(this.nNw);
                fse_1.gFu().f("currentLocalFighter", this.nNw);
                if (!this.nNw.a(exe_1.rDc)) {
                    dgw.fcT().a(new dgv(dgx.okL, aum_0.cWf().c("fight.yourTurn.0", new Object[0]), 2000));
                }
                aie_0.cfn().a(this.nNw);
            }
            catch (Exception exception) {
                nNt.error((Object)"Frame de tour de combat pouss\u00e9 alors qu'un param\u00e8tre est null (combat ou combattant)", (Throwable)exception);
            }
            if (!aue_0.cVJ().c(cue_2.eSA())) {
                aue_0.cVJ().a(cue_2.eSA());
            }
            aue_0.cVJ().a(cua_1.eSg());
            cty_1.ePV().kg(true);
            this.nNw.dkI().eej();
            blh_2 blh_22 = this.nNw.dlG();
            if (blh_22 != null) {
                if (cul_2.b(this.nNw, bgt_02)) {
                    this.nNw.a(exx_2.rGj, exx_2.rGi, exx_2.rGk, exx_2.rGl);
                }
                cul_2.a(blh_22, this.nNw, true);
            }
            if ((fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog")) != null) {
                fse_1.gFu().b("itemDetail", "usableNow", fhs_22);
            }
        }
    }

    public static void ce(bgy bgy2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        aue_0.cVJ().r(bgy2);
        boolean bl = cul_2.b(bgy2, bgt_02);
        blh_2 blh_22 = bgy2.dlG();
        if (blh_22 == null) {
            return;
        }
        blh_22.edh();
        if (bgy2.dkN()) {
            blh_22.a(bgy2.dkI().eek());
        } else {
            bgt_02.a(exx_2.rGj, exx_2.rGi, exx_2.rGk, exx_2.rGl);
        }
        if (bl && bgy2.aWP() == eym.phX.aWP() && aue_0.cVJ().c(cxo_2.eWM())) {
            cxo_2.eWM().ar((bgt_0)fcL.rUh.sw(bgy2.Sn()));
        }
        cul_2.a(blh_22, bgy2, true);
    }

    private static void a(@NotNull blh_2 blh_22, @NotNull bgy bgy2, boolean bl) {
        if (!bgy2.dkN()) {
            bMV.a(bgy2.dnM(), bgy2.dkB(), blh_22);
        }
        blh_22.b(fqt_0.sTd);
        blh_22.p((byte)fqt_0.sTd.eFS(), true);
        blh_22.dlH();
        cxx_2.eXH().a(blh_22);
        if (bl) {
            if (bgy2 instanceof bgt_0) {
                fse_1.gFu().a((aef_2)bgy2, bgt_0.ieK);
            } else if (bgy2 instanceof bhJ) {
                fse_1.gFu().a((aef_2)bgy2, bhJ.iiF);
            } else if (bgy2 instanceof bhx_0) {
                fse_1.gFu().a((aef_2)bgy2, bhx_0.igD);
            } else {
                fse_1.gFu().a((aef_2)bgy2, bgy.ibP);
            }
        }
        fse_1.gFu().a((aef_2)bgy2, "shortcutBarManager");
        cxx_2.eXH().d(fqt_0.sTc);
    }

    private static boolean b(bgy bgy2, bgt_0 bgt_02) {
        Object t = fcL.rUh.sw(bgy2.Sn());
        return t != null && ((exP)t).Xi() == bgt_02.Xi();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.nNw = null;
        if (!bl) {
            cub_1.eSi().eSs();
            this.nNx = null;
            fib_2.gBU().eKH();
            fhn_1.gzT().bYz();
            fse_1.gFu().f("currentLocalFighter", (Object)null);
            cty_1.ePV().kg(false);
            aue_0.cVJ().b(cuk_2.eSS());
            aue_0.cVJ().b(cud_1.eSz());
            aue_0.cVJ().b(cuj_1.eSQ());
            aue_0.cVJ().b(cua_1.eSg());
            aue_0.cVJ().b(cue_2.eSA());
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public bgy eSH() {
        return this.nNw;
    }

    public crs_2 eSV() {
        return this.nNx;
    }

    public void a(ddk ddk2) {
        this.nNy = ddk2;
    }

    public ddk eSW() {
        return this.nNy;
    }
}

