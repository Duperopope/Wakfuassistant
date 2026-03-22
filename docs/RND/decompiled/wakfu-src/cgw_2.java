/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.commonIn.RideMountCommand;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from cGW
 */
@fyf_0
public class cgw_2 {
    public static final String PACKAGE = "wakfu.shortcutBar";
    private static final Logger mYW = Logger.getLogger(cgw_2.class);
    public static boolean mYX = true;
    private static final int mYY = 1500;
    private static final int mYZ = 3;
    private static GE mZa = new GE(1500, TimeUnit.MILLISECONDS);
    private static final int mZb = 4;
    private static final int mZc = 6;
    private static byte mZd = (byte)-1;
    private static int mZe = -1;

    public static void closeShortcutBarDialog(fiq_1 fiq_12) {
        dae_0.cV((short)16366);
    }

    public static void openCloseAdditionalShortcutBar(fiq_1 fiq_12, Byte by) {
        dae_0 dae_02 = new dae_0(19029);
        dae_02.ay(by);
        aaw_1.bUq().h(dae_02);
    }

    public static void activateBuildSheet(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0(18337);
        dae_02.D(flg_22.getItemValue());
        aaw_1.bUq().h(dae_02);
    }

    private static void S(short s, short s2) {
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dkZ();
        if (bsj_02 == null) {
            dae_0.cV(s2);
            return;
        }
        if (!bsj_02.dGQ().bhE()) {
            return;
        }
        if (bsj_02.dGQ().dIA().djA()) {
            return;
        }
        if (fse_1.gFu().dp("isInFightPlacement")) {
            dae_0.cV(s);
            return;
        }
        if (bsj_02.dGQ().dIA().dkQ()) {
            dae_0.cV(s);
            return;
        }
    }

    public static void setSouthEastDirection(fiq_1 fiq_12) {
        cgw_2.S((short)18450, (short)18112);
    }

    public static void setSouthWestDirection(fiq_1 fiq_12) {
        cgw_2.S((short)16274, (short)19740);
    }

    public static void setNorthWestDirection(fiq_1 fiq_12) {
        cgw_2.S((short)18540, (short)19284);
    }

    public static void setNorthEastDirection(fiq_1 fiq_12) {
        cgw_2.S((short)19132, (short)17640);
    }

    public static void displaySpellRange(flg_2 flg_22) {
        Object object;
        if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liP)) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.djT()) {
            return;
        }
        fqr_0 fqr_02 = (fqr_0)flg_22.getItemValue();
        if (fqr_02.gih() != fqu_0.sTq) {
            return;
        }
        bmx_0 bmx_02 = bgt_02.jr(fqr_02.LV());
        if (bmx_02 == null) {
            object = cul_2.eST().eSH();
            if (object == null) {
                return;
            }
            bmx_0 bmx_03 = ((bgy)object).jr(fqr_02.LV());
            if (bmx_03 != null) {
                bmx_02 = bmx_03;
            } else {
                return;
            }
        }
        object = new dcd_0();
        ((dcd_0)object).g(bmx_02);
        ((dcd_0)object).cb(true);
        ((ama_1)object).lK(16680);
        aaw_1.bUq().h((aam_2)object);
    }

    public static void undisplaySpellRange(flg_2 flg_22) {
        if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liP)) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.djT()) {
            return;
        }
        dcd_0 dcd_02 = new dcd_0();
        dcd_02.cb(false);
        dcd_02.lK(16680);
        aaw_1.bUq().h(dcd_02);
    }

    public static void dropItem(fiq_1 fiq_12, Byte by) {
        if (fiq_12 instanceof fla_2) {
            Object object;
            cfe_1.onDropItem();
            fla_2 fla_22 = (fla_2)fiq_12;
            int n = ((fhv_1)fla_22.gBE()).getRenderableParent().getCollection().getTableIndex(((fhv_1)fla_22.gBE()).getRenderableParent());
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            blh_2 blh_22 = bgt_02.dlG();
            fqt_0 fqt_02 = blh_22.cm(by).ecS();
            if (fla_22.getValue() instanceof ffV) {
                boolean bl;
                ffV ffV2 = (ffV)fla_22.getValue();
                cfe_1.onDropItem();
                boolean bl2 = fqt_02 == fqt_0.sTc;
                boolean bl3 = bl = fqt_02 == fqt_0.sTd && ffV2.beB();
                if (!bl2 && !bl) {
                    return;
                }
                dcz dcz2 = new dcz();
                dcz2.aL(ffV2);
                dcz2.NO(by.byteValue());
                dcz2.pz(n);
                dcz2.lK(19934);
                dcz2.cC(true);
                aaw_1.bUq().h(dcz2);
                return;
            }
            if (fla_22.getValue() instanceof bmx_0) {
                return;
            }
            if (fla_22.getValue() instanceof blb_2 && ((fqr_0)(object = (blb_2)fla_22.getValue())).gih() == fqu_0.sTq) {
                dae_0 dae_02 = new dae_0(19637);
                dae_02.sY(((fqr_0)object).avr());
                int n2 = by - 4;
                int n3 = n2 * 6;
                dae_02.ay((byte)(n3 + n));
                aaw_1.bUq().h(dae_02);
                return;
            }
            if (fla_22.getValue() != null) {
                object = new dcz();
                ((dcz)object).aL(fla_22.getValue());
                ((dcz)object).NO(by.byteValue());
                ((dcz)object).pz(n);
                ((dcz)object).eo(mZd);
                ((dcz)object).NP(mZe);
                ((ama_1)object).lK(19934);
                ((ama_1)object).cC(true);
                aaw_1.bUq().h((aam_2)object);
            }
        }
        mZd = (byte)-1;
        mZe = -1;
    }

    public static void dragItem(fiq_1 fiq_12, Byte by) {
        if (fiq_12 instanceof flu_1) {
            flu_1 flu_12 = (flu_1)fiq_12;
            int n = ((fhv_1)flu_12.gBE()).getRenderableParent().getCollection().getItemIndex(flu_12.getValue());
            if (flu_12.getValue() != null) {
                dcz dcz2 = new dcz();
                dcz2.aL(flu_12.getValue());
                dcz2.NO(by.byteValue());
                mZd = by;
                mZe = n;
                dcz2.pz(n);
                dcz2.lK(17548);
                aaw_1.bUq().h(dcz2);
            }
        }
    }

    public static void dropOutItem(fiq_1 fiq_12, Byte by) {
        flc_2 flc_22;
        if (fiq_12 instanceof flc_2 && (flc_22 = (flc_2)fiq_12).getValue() != null) {
            Object object;
            int n = 19419;
            if (flc_22.getValue() instanceof blb_2 && ((fqr_0)(object = (blb_2)flc_22.getValue())).gih() == fqu_0.sTq) {
                n = 19934;
            }
            object = new dcz();
            ((dcz)object).aL(flc_22.getValue());
            ((dcz)object).NO(by.byteValue());
            ((dcz)object).pz(mZe);
            ((ama_1)object).lK(n);
            aaw_1.bUq().h((aam_2)object);
        }
        mZd = (byte)-1;
        mZe = -1;
    }

    public static void addItem(flg_2 flg_22, Integer n) {
        dcz dcz2 = new dcz();
        dcz2.aL(flg_22.getItemValue());
        dcz2.NO(n);
        dcz2.pz(-1);
        dcz2.lK(19934);
        dcz2.cC(true);
        aaw_1.bUq().h(dcz2);
    }

    public static void selectPreviousShortcutBar(flp_2 flp_22) {
        if (flp_22.gEk()) {
            dae_0.cV((short)17621);
        }
    }

    public static void selectNextShortcutBar(flp_2 flp_22) {
        if (flp_22.gEk()) {
            dae_0.cV((short)19450);
        }
    }

    public static void rotateShortcutBar(flp_2 flp_22) {
        if (flp_22.gEo() < 0) {
            dae_0.cV((short)19450);
        } else if (flp_22.gEo() > 0) {
            dae_0.cV((short)17621);
        }
    }

    public static void useItem(flg_2 flg_22) {
        if (flg_22.getItemValue() != null && flg_22.getItemValue() instanceof blb_2) {
            blb_2 blb_22 = (blb_2)flg_22.getItemValue();
            cgw_2.useItem(flg_22, blb_22, false);
        }
    }

    public static void doubleClickItem(flg_2 flg_22) {
        if (flg_22.getItemValue() != null && flg_22.getItemValue() instanceof blb_2) {
            blb_2 blb_22 = (blb_2)flg_22.getItemValue();
            cgw_2.useItem(flg_22, blb_22, true);
        }
    }

    public static void selectSpell(flg_2 flg_22, bmx_0 bmx_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = bgt_02;
        if (flg_22 != null && flg_22.gEm()) {
            if (bmx_02 == null) {
                mYW.error((Object)"On tente d'utiliser un sort null dans les barres raccourcis !!! ");
                return;
            }
            fhs_2 fhs_22 = ((fhv_1)flg_22.gBD()).getElementMap();
            if (fhs_22 != null) {
                cdu_1.openSpellDescription(3, bmx_02, fhs_22.getId());
            }
        } else if (bgt_02.djT() && bgt_02.dkZ() != null) {
            bmt_0 bmt_02;
            if (bmx_02 == null) {
                mYW.error((Object)"On tente d'utiliser un sort null dans les barres raccourcis !!! ");
                return;
            }
            bgy2 = bgt_02.dkZ().dGQ().dIA();
            if (bgy2 == null) {
                bgy2 = bgt_02;
            }
            if ((bmt_02 = (bmt_0)bmx_02.giP()) == null) {
                mYW.error((Object)("spell null pour le spellLevel (uniqueId=" + bmx_02.LV() + ")"));
                return;
            }
            if (bmt_02.cvP()) {
                dbn dbn2 = new dbn();
                dbn2.g(bgy2.jr(bmx_02.LV()));
                ffV ffV2 = bgy2.dmL().a(bgy2.dnP(), ffS.sgQ);
                dbn2.dh(ffS.sgQ.aJr());
                dbn2.setItem(ffV2);
                dbn2.lK(18543);
                aaw_1.bUq().h(dbn2);
            } else {
                dcC dcC2 = new dcC();
                dcC2.g(bgy2.jr(bmx_02.LV()));
                dcC2.lK(17025);
                if (bmt_02.d() == 7348) {
                    if (!fyw_0.gqw().to("osamodasSymbiotDialog")) {
                        aue_0.cVJ().a(cxo_2.eWM());
                    } else {
                        aaw_1.bUq().h(dcC2);
                    }
                } else {
                    aaw_1.bUq().h(dcC2);
                }
            }
        }
    }

    public static void useLeftHandWeapon(flg_2 flg_22) {
        blb_2 blb_22 = (blb_2)flg_22.getItemValue();
        if (blb_22 == null || !blb_22.isUsable()) {
            return;
        }
        dae_0.cV((short)18201);
        cAY.eHc().nP(600004L);
    }

    public static void useRightHandWeapon(flg_2 flg_22) {
        blb_2 blb_22 = (blb_2)flg_22.getItemValue();
        if (blb_22 == null || !blb_22.isUsable()) {
            return;
        }
        dae_0.cV((short)16855);
        cAY.eHc().nP(600004L);
    }

    public static void useItem(flg_2 flg_22, blb_2 blb_22, boolean bl) {
        if (blb_22 != null && blb_22.isUsable()) {
            if (mZa.aNS() > 3) {
                return;
            }
            mZa.aNQ();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            switch (blb_22.gih()) {
                case sTv: {
                    dae_0 dae_02 = new dae_0(18337);
                    dae_02.D(blb_22);
                    aaw_1.bUq().h(dae_02);
                    break;
                }
                case sTw: {
                    dae_0 dae_03 = new dae_0(17585);
                    dae_03.D(blb_22);
                    aaw_1.bUq().h(dae_03);
                    break;
                }
                case sTu: {
                    if (bl) {
                        return;
                    }
                    bbi_0 bbi_02 = bbl_0.hBr.AF(blb_22.avr());
                    if (bbi_02.dam()) {
                        ((bbf_0)bbi_02).dai();
                        break;
                    }
                    day_0 day_02 = new day_0();
                    day_02.a(bbi_02);
                    aaw_1.bUq().h(day_02);
                    break;
                }
                case sTq: {
                    if (bl) {
                        return;
                    }
                    bsj_0 bsj_02 = bgt_02.dkZ();
                    bgy bgy2 = bgt_02;
                    if (!(bsj_02 == null || (bgy2 = bsj_02.dGQ().dIA()) != null && bgy2.dkQ())) {
                        bgy2 = bgt_02;
                    }
                    bmx_0 bmx_02 = bgy2.jr(blb_22.LV());
                    cgw_2.selectSpell(flg_22, bmx_02);
                    break;
                }
                case sTt: {
                    if (bl) {
                        return;
                    }
                    dbm dbm2 = new dbm();
                    bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(2145);
                    ffV ffV2 = new ffV(-1L);
                    ffV2.l(bgv_22);
                    ffV2.ak((short)1);
                    dbm2.j(ffV2, bgv_22.dGh().fZq()[0].shb);
                    dbm2.lK(16492);
                    aaw_1.bUq().h(dbm2);
                    break;
                }
                case sTr: {
                    ffV ffV3 = bgt_02.dno().UK(blb_22.avr());
                    if (flg_22 == null || flg_22.gEk()) {
                        if (ffV3 == null) {
                            return;
                        }
                        cgw_2.useUsableItem(ffV3, bl);
                        break;
                    }
                    if (!flg_22.gEm()) break;
                    dbk_0 dbk_02 = new dbk_0();
                    dbk_02.lK(16264);
                    dbk_02.setX(flg_22.getScreenX());
                    dbk_02.setY(flg_22.getScreenY() + 20);
                    dbk_02.c(ffV3);
                    aaw_1.bUq().h(dbk_02);
                    break;
                }
                case sTs: {
                    Object object;
                    ffV ffV4;
                    if (bl) {
                        return;
                    }
                    switch (blb_22.dij()) {
                        case 2: 
                        case 4: 
                        case 5: {
                            ffV4 = bgt_02.dno().UK(blb_22.avr());
                            if (flg_22 != null && !flg_22.gEk()) break;
                            if (ffV4 == null) {
                                ffV4 = bgt_02.dnP().UH(blb_22.avr());
                            }
                            if (ffV4 == null || !ffV4.apo()) break;
                            cgw_2.a(blb_22, ffV4, bgt_02, bl);
                            break;
                        }
                        case 3: {
                            ffV4 = bgt_02.dmL().a(bgt_02.dnP(), blb_22.avr());
                            if (ffV4 == null || !ffV4.adO() || !ffV4.ead().geL().gfz()) break;
                            object = (bgt_0)fcI.ag(bgt_02.Xi(), ffV4.LV());
                            if (((exP)object).Sn() != bgt_02.Sn()) {
                                return;
                            }
                            RideMountCommand.e(bgt_02);
                            break;
                        }
                    }
                    if (flg_22 == null || !flg_22.gEm()) break;
                    ffV4 = bgt_02.dno().UK(blb_22.avr());
                    if (ffV4.adO()) {
                        object = new dbo_0<bjm_0>(new bjm_0(ffV4));
                        ((ama_1)object).lK(19685);
                    } else {
                        object = new dbk_0();
                        ((dbE)object).c(ffV4);
                        ((ama_1)object).lK(16264);
                    }
                    ((dbE)object).setX(flg_22.getScreenX());
                    ((dbE)object).setY(flg_22.getScreenY() + 20);
                    aaw_1.bUq().h((aam_2)object);
                }
            }
        }
    }

    private static boolean a(ffV ffV2, ffj_0 ffj_02) {
        return ffV2.dOg().a(ffj_02) != null;
    }

    private static boolean a(ffV ffV2, bgt_0 bgt_02, ffj_0 ffj_02) {
        ang_2 ang_22 = ffV2.dOg().a(ffj_02);
        return ang_22 == null || ang_22.b(bgt_02, bgt_02.aZw(), ffV2, bgt_02.fgg());
    }

    private static void a(blb_2 blb_22, ffV ffV2, bgt_0 bgt_02, boolean bl) {
        fgl_0 fgl_02 = ffV2.dOg().fUZ();
        if (!(fgl_02 == null || bgt_02.djT() && bgt_02.dkZ().dGp() != etw_0.rqT)) {
            if (cgw_2.a(ffV2, bgt_02, ffj_0.sgc)) {
                bqm_0.jbp.b(new brw(ffV2.dOg()));
                ((bfc_1)fgl_02).aQ(ffV2);
            }
            return;
        }
        if (bgt_02.djT()) {
            if (ffV2.beB() && !cgw_2.a(ffV2, ffj_0.sgd) || cgw_2.a(ffV2, bgt_02, ffj_0.sgd)) {
                dbm dbm2 = new dbm();
                if (blb_22.dij() == 2) {
                    try {
                        dbm2.j(ffV2, ffV2.dOg().dGh().fZq()[0].aJr());
                    }
                    catch (Exception exception) {
                        dbm2.j(ffV2, (byte)-1);
                    }
                } else {
                    dbm2.j(ffV2, (byte)-1);
                }
                dbm2.lK(16492);
                aaw_1.bUq().h(dbm2);
            }
            return;
        }
        if (ffV2.fAu() && !cgw_2.a(ffV2, ffj_0.sgc) || cgw_2.a(ffV2, bgt_02, ffj_0.sgc)) {
            dcu dcu2 = new dcu(ffV2, (byte)blb_22.avr(), bl);
            dcu2.lK(17805);
            aaw_1.bUq().h(dcu2);
            return;
        }
    }

    private static void a(ffV ffV2, bgt_0 bgt_02, boolean bl) {
        if (bgt_02.djT()) {
            if (bgt_02.dmL().tz(ffV2.LV()) != null) {
                dbm dbm2 = new dbm();
                try {
                    ffS[] ffSArray = ffV2.dOg().dGh().fZq();
                    dbm2.j(ffV2, ffSArray.length > 0 ? ffSArray[0].shb : (byte)-1);
                }
                catch (Exception exception) {
                    dbm2.j(ffV2, (byte)-1);
                }
                dbm2.lK(16492);
                aaw_1.bUq().h(dbm2);
            } else {
                dcu dcu2 = new dcu(ffV2, (byte)ffV2.avr(), bl);
                dcu2.lK(17805);
                aaw_1.bUq().h(dcu2);
            }
            return;
        }
        dcu dcu3 = new dcu(ffV2, (byte)ffV2.avr(), bl);
        dcu3.lK(17805);
        aaw_1.bUq().h(dcu3);
    }

    public static boolean useUsableItem(ffV ffV2, boolean bl) {
        bgt_0 bgt_02 = cvo_2.daL();
        bgt_0 bgt_03 = bvz_0.dLl();
        if (bgt_03 != null && bgt_03.doP()) {
            bNG.egl();
            bNG.a(6, new Object[0]);
            return false;
        }
        if (ffV2 == null) {
            mYW.error((Object)"Trying to use a null item");
            return false;
        }
        if (ffV2.apo() && bEf.aB(ffV2)) {
            cgw_2.a(ffV2, bgt_02, bl);
            return true;
        }
        if (!ffV2.fAu()) {
            return false;
        }
        if (foy_0.sLJ.XS(ffV2.avr())) {
            bNG.egl();
            bNG.a(64, new Object[0]);
            return false;
        }
        bNG.egl();
        bNG.a(61, new Object[0]);
        return false;
    }

    public static void openCloseShortcutDescription(flg_2 flg_22) {
        cgw_2.openCloseShortcutDescription(flg_22, (Byte)null);
    }

    public static void openCloseShortcutDescription(flg_2 flg_22, String string) {
        cgw_2.openCloseShortcutDescription(flg_22, Byte.parseByte(string));
    }

    public static void openCloseShortcutDescription(flg_2 flg_22, Byte by) {
        Object object;
        ayx_2 ayx_22;
        Object object2;
        if (flg_22.getItemValue() == null || !(flg_22.getItemValue() instanceof fqr_0)) {
            return;
        }
        faw_2 faw_22 = (faw_2)flg_22.gBE();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Object object3 = bgt_02;
        if (bgt_02.djT() && bgt_02.dkZ() != null) {
            if (bgt_02.dkZ().dGQ().bhE()) {
                boolean bl;
                object2 = bgt_02.dkZ().dGQ().dIA();
                boolean bl2 = bl = !((exP)object2).fgk() && ((bgy)object2).dkQ();
                if (((exP)object2).Sn() == bgt_02.Sn() || bl) {
                    object3 = object2;
                }
            }
            if (object3 == null) {
                object3 = bgt_02;
            }
        }
        if (((fqr_0)(object2 = (fqr_0)flg_22.getItemValue())).gih() == fqu_0.sTq) {
            bmx_0 bmx_02 = ((bgy)object3).jr(((fqr_0)object2).LV());
            fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a((fqr_0)object2, by)));
            cgz_2.openCloseDescription(flg_22, bmx_02, "spellDetailPopup");
        }
        if (((fqr_0)object2).gih() == fqu_0.sTt) {
            frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
            if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                if (((fqr_0)object2).avr() == 2145) {
                    ayx_22 = new ffV(-1L);
                    object = fgD.fXh().Vd(2145);
                    ((ffV)ayx_22).l((fhc_0)object);
                    ((ffV)ayx_22).ak((short)1);
                } else {
                    object = bgt_02.dnP().B(((fqr_0)object2).LV());
                    ayx_22 = ((Optional)object).orElseGet(() -> cgw_2.a(bgt_02, (fqr_0)object2));
                }
                fse_1.gFu().f("handsOfWeapon", "twoHands");
                fse_1.gFu().f("itemPopupDetail", ayx_22);
                fse_1.gFu().f("isFromEquipedShortcut", true);
                fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a((fqr_0)object2, by)));
                fyd_0.popup(frx_12, faw_22);
            } else if (flg_22.gBy() == fzq_0.tJD) {
                fse_1.gFu().f("itemPopupDetail", (Object)null);
                fse_1.gFu().f("isFromEquipedShortcut", false);
                fse_1.gFu().f("isFromShortcut", false);
                fse_1.gFu().f("handsOfWeapon", "none");
                fse_1.gFu().f("currentShortcutShortcut", (Object)null);
                fyd_0.closePopup(flg_22, frx_12);
            }
        }
        if (((fqr_0)object2).gih() == fqu_0.sTu) {
            bbi_0 bbi_02 = bbl_0.hBr.AF(((fqr_0)object2).avr());
            fse_1.gFu().f("currentDescribedEmote", bbi_02);
            ayx_22 = (frx_1)faw_22.getElementMap().uH("emotePopup");
            cgw_2.a(flg_22, by, (fqr_0)object2, (frx_1)ayx_22, faw_22);
        }
        if (((fqr_0)object2).gih() == fqu_0.sTv) {
            eIj eIj2 = aue_0.cVJ().cVK().dnK().PR(((fqr_0)object2).avr());
            if (eIj2 == null) {
                return;
            }
            fse_1.gFu().f("currentDescribedBuild", eIj2.getName());
            ayx_22 = (frx_1)faw_22.getElementMap().uH("buildPopup");
            cgw_2.a(flg_22, by, (fqr_0)object2, (frx_1)ayx_22, faw_22);
        }
        if (((fqr_0)object2).gih() == fqu_0.sTw) {
            bjf_1.Di(((fqr_0)object2).avr()).ifPresent(arg_0 -> cgw_2.a(faw_22, flg_22, by, (fqr_0)object2, arg_0));
        }
        if (((fqr_0)object2).gih() == fqu_0.sTs) {
            ffV ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ((fqr_0)object2).avr());
            if (ffV2 != null) {
                short s = bgt_02.dmL().tz(ffV2.LV()).aJr();
                if (s == 15 || s == 16) {
                    object = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
                    if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                        if (s == 15) {
                            if (ffV2.dOg().fYp()) {
                                fse_1.gFu().f("handsOfWeapon", "twoHands");
                            } else {
                                fse_1.gFu().f("handsOfWeapon", "rightHand");
                            }
                            aUl aUl2 = (aUl)aUn.cUM().eu("closeCombatRight");
                            fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(aUl2 != null ? aUl2.cUy() : aum_0.cWf().c("shortcut.unknown", new Object[0])));
                        } else if (s == 16) {
                            fse_1.gFu().f("handsOfWeapon", "leftHand");
                            aUl aUl3 = (aUl)aUn.cUM().eu("closeCombatLeft");
                            fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(aUl3 != null ? aUl3.cUy() : aum_0.cWf().c("shortcut.unknown", new Object[0])));
                        }
                        fse_1.gFu().f("itemPopupDetail", ffV2);
                        fse_1.gFu().f("isFromEquipedShortcut", true);
                        fyd_0.popup((frx_1)object, faw_22);
                    } else if (flg_22.gBy() == fzq_0.tJD) {
                        fse_1.gFu().f("itemPopupDetail", (Object)null);
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                        fse_1.gFu().f("isFromShortcut", false);
                        fse_1.gFu().f("handsOfWeapon", "none");
                        fse_1.gFu().f("currentShortcutShortcut", (Object)null);
                        fyd_0.closePopup(flg_22, (frx_1)object);
                    }
                } else {
                    fse_1.gFu().f("isFromShortcut", false);
                    if (ffV2.isUsable()) {
                        fse_1.gFu().f("isFromEquipedShortcut", true);
                    } else {
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                    }
                    object = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
                    if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                        fse_1.gFu().f("itemPopupDetail", ffV2);
                        fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a((fqr_0)object2, by)));
                        fyd_0.popup((frx_1)object, faw_22);
                    } else if (flg_22.gBy() == fzq_0.tJD) {
                        fse_1.gFu().f("itemPopupDetail", (Object)null);
                        fse_1.gFu().f("currentShortcutShortcut", (Object)null);
                        fyd_0.closePopup(flg_22, (frx_1)object);
                    }
                }
            } else {
                ffV2 = aue_0.cVJ().cVK().dno().UK(((fqr_0)object2).avr());
                if (ffV2 != null) {
                    ayx_22 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
                    if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                        fse_1.gFu().f("itemPopupDetail", ffV2);
                        fse_1.gFu().f("isFromShortcut", true);
                        fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a((fqr_0)object2, by)));
                        fyd_0.popup((frx_1)ayx_22, faw_22);
                    } else if (flg_22.gBy() == fzq_0.tJD) {
                        fse_1.gFu().f("itemPopupDetail", (Object)null);
                        fse_1.gFu().f("isFromShortcut", false);
                        fse_1.gFu().f("isFromEquipedShortcut", false);
                        fse_1.gFu().f("currentShortcutShortcut", (Object)null);
                        fyd_0.closePopup(flg_22, (frx_1)ayx_22);
                    }
                }
            }
        } else if (fqu_0.sTr == ((fqr_0)object2).gih()) {
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(((fqr_0)object2).avr());
            if (bgv_22 == null) {
                return;
            }
            ayx_22 = (frx_1)faw_22.getElementMap().uH("itemDetailPopup");
            if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
                fse_1.gFu().f("itemPopupDetail", bgv_22);
                fse_1.gFu().f("isFromShortcut", true);
                fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a((fqr_0)object2, by)));
                fyd_0.popup((frx_1)ayx_22, faw_22);
            } else if (flg_22.gBy() == fzq_0.tJD) {
                fse_1.gFu().f("itemPopupDetail", (Object)null);
                fse_1.gFu().f("isFromShortcut", false);
                fse_1.gFu().f("isFromEquipedShortcut", false);
                fse_1.gFu().f("currentShortcutShortcut", (Object)null);
                fyd_0.closePopup(flg_22, (frx_1)ayx_22);
            }
        }
    }

    private static void a(flg_2 flg_22, Byte by, fqr_0 fqr_02, frx_1 frx_12, faw_2 faw_22) {
        if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fse_1.gFu().f("currentShortcutShortcut", cgw_2.pP(cgw_2.a(fqr_02, by)));
            fyd_0.popup(frx_12, faw_22);
        } else if (flg_22.gBy() == fzq_0.tJD) {
            fse_1.gFu().f("currentShortcutShortcut", (Object)null);
            fyd_0.closePopup(flg_22, frx_12);
        }
    }

    private static String pP(String string) {
        return aum_0.cWf().c("shortcuts", new Object[0]) + " (" + aUl.kg(string) + ")";
    }

    private static String a(fqr_0 fqr_02, Byte by) {
        blg_2 blg_22;
        int n;
        if (by == null) {
            return aum_0.cWf().c("shortcut.unknown", new Object[0]);
        }
        blh_2 blh_22 = aue_0.cVJ().cVN();
        if (fqr_02.gih() == fqu_0.sTq || fqr_02.gih() == fqu_0.sTt) {
            n = by - 4;
            blg_22 = blh_22.ck((byte)n);
        } else {
            n = by.byteValue();
            blg_22 = blh_22.cj((byte)n);
        }
        short s = blg_22.a((blb_2)fqr_02);
        aUl aUl2 = (aUl)aUn.cUM().eu("shortcut" + n + s);
        return aUl2 != null ? aUl2.cUy() : aum_0.cWf().c("shortcut.unknown", new Object[0]);
    }

    public static void toggleShortcutBarMode(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(17716));
    }

    public static void openEmotesInventory(fiq_1 fiq_12) {
        if (aue_0.cVJ().c(cug_1.eRu())) {
            aue_0.cVJ().b(cug_1.eRu());
        } else {
            aue_0.cVJ().a(cug_1.eRu());
        }
    }

    public static void displaySpellDescription(fiq_1 fiq_12, bmx_0 bmx_02) {
    }

    public static void showHideState(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, bmq_0 bmq_02) {
        cfa_1.showHideState(fiq_12, fes_22, frx_12, bmq_02);
    }

    public static void shortcutBarResizeStart(fiq_1 fiq_12, fey_2 fey_22) {
        ((frp_1)fey_22.getLayoutData()).setInitValue(true);
        blk_2.ib(true);
    }

    public static void shortcutBarResized(flt_1 flt_12) {
        if (!blk_2.edO()) {
            return;
        }
        blh_2 blh_22 = cxx_2.eXH().dlG();
        if (blh_22 != null && blh_22.ede() == fqt_0.sTc) {
            blk_2.a(flt_12.gEt(), flt_12.getSize());
        }
    }

    public static void shortcutBarResizeEnd(flp_2 flp_22, fey_2 fey_22) {
        blk_2.ib(false);
        ((frp_1)fey_22.getLayoutData()).setInitValue(false);
        dae_0 dae_02 = new dae_0(19940);
        aaw_1.bUq().h(dae_02);
    }

    public static void showWorldToolbar(flp_2 flp_22, fes_2 fes_22) {
        fes_22.setVisible(true);
    }

    public static void hideWorldToolbar(flp_2 flp_22, fes_2 fes_22) {
        fes_22.setVisible(false);
    }

    private static /* synthetic */ void a(faw_2 faw_22, flg_2 flg_22, Byte by, fqr_0 fqr_02, eks_0 eks_02) {
        fse_1.gFu().f("currentDescribedBuild", eks_02.getName());
        frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH("buildPopup");
        cgw_2.a(flg_22, by, fqr_02, frx_12, faw_22);
    }

    private static /* synthetic */ ffV a(bgt_0 bgt_02, fqr_0 fqr_02) {
        return bgt_02.dno().tb(fqr_02.LV());
    }
}

