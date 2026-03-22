/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cWw
 */
public class cww_1
implements adi_1,
bex_0 {
    public static final cww_1 nSJ = new cww_1();
    private alx_2 ikv;
    bio_1 nSK;

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17719: {
                Object object;
                dbl_0 dbl_02 = (dbl_0)aam_22;
                ffV ffV2 = dbl_02.getItem();
                long l = aue_0.cVJ().cVO().xl();
                if (ffV2 != null && fcI.ac(l, ffV2.LV()) == null) {
                    cww_1.qQ("mimiSymbic.error.itemNotInInventory");
                    return false;
                }
                if (ffV2 != null && (object = fji.dd(ffV2)) != fjj.sxE) {
                    String string2 = object == fjj.sxK ? "mimiSymbic.error.stack" : "mimiSymbic.error.invalidStatItem";
                    cww_1.qQ(string2);
                    return false;
                }
                object = this.nSK.dXK();
                if (fji.d(ffV2, (ffV)object) != fjj.sxE) {
                    this.nSK.bk(null);
                }
                ffV ffV3 = this.nSK.dXJ();
                this.nSK.bj(ffV2);
                fse_1.gFu().a((aef_2)ffV2, "movable");
                fse_1.gFu().a((aef_2)ffV3, "movable");
                return false;
            }
            case 18288: {
                dbl_0 dbl_03 = (dbl_0)aam_22;
                ffV ffV4 = this.nSK.dXJ();
                long l = aue_0.cVJ().cVO().xl();
                if (ffV4 == null) {
                    cww_1.qQ("mimiSymbic.error.notStat");
                    return false;
                }
                ffV ffV5 = dbl_03.getItem();
                if (ffV5 == null) {
                    ffV ffV6 = this.nSK.dXK();
                    this.nSK.bk(null);
                    if (ffV6 != null) {
                        fse_1.gFu().a((aef_2)ffV6, "movable");
                    }
                    return false;
                }
                if (fcI.ac(l, ffV5.LV()) == null) {
                    cww_1.qQ("mimiSymbic.error.itemNotInInventory");
                    return false;
                }
                fjj fjj2 = fji.d(ffV4, ffV5);
                if (fjj2 != fjj.sxE) {
                    cww_1.qQ(switch (fjj2) {
                        case fjj.sxK -> "mimiSymbic.error.stack";
                        case fjj.sxH -> "mimiSymbic.error.sameSkinItem";
                        case fjj.sxI -> "mimiSymbic.error.invalidType";
                        case fjj.sxJ -> "mimiSymbic.error.invalidLevel";
                        default -> "mimiSymbic.error.invalidSkinItem";
                    });
                    return false;
                }
                ffV ffV7 = this.nSK.dXK();
                this.nSK.bk(ffV5);
                fse_1.gFu().a((aef_2)ffV5, "movable");
                fse_1.gFu().a((aef_2)ffV7, "movable");
                this.eVU();
                return false;
            }
            case 16596: {
                fiq_2.gCw().d(fik_2.a(string -> {
                    ffV ffV2 = this.nSK.dXI();
                    ffV ffV3 = this.nSK.dXJ();
                    ffV ffV4 = this.nSK.dXK();
                    cmj_0 cmj_02 = new cmj_0(ffV2.LV(), ffV3.LV(), ffV4.LV());
                    aue_0.cVJ().etu().d(cmj_02);
                    aue_0.cVJ().b(nSJ);
                }).l("mimiSymbic.validation", new Object[0]).abQ(1));
                return false;
            }
        }
        return true;
    }

    private void eVU() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("mimiSymbicDialog");
        fad_1 fad_12 = (fad_1)fhs_22.uH("makeButton");
        awx_2 awx_22 = new awx_2(awx_2.dnF.aTn());
        awx_2 awx_23 = new awx_2(aid_0.dUD.aTn());
        fym_0 fym_02 = fad_12.getAppearance();
        fym_02.x(fsa_2.class);
        fsa_2 fsa_22 = new fsa_2(awx_23, awx_22, fym_02, 0, 500, 4, abn.cdr);
        fym_02.a(fsa_22);
    }

    public static void qQ(String string) {
        fiq_2.gCw().d(fik_2.gBZ().l(string, new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cwx_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("mimiSymbicDialog", 32768L);
            fse_1.gFu().b("itemDetail", (Object)null, "mimiSymbicDialog");
            fse_1.gFu().b("pet", (Object)null, "mimiSymbicDialog");
            fyw_0.gqw().d("wakfu.mimiSymbic", cft_2.class);
            fse_1.gFu().f("mimiSymbicView", this.nSK);
            cvo_2.daL().dno().dRv();
            bey_0.dTc().a(this);
        }
    }

    public void bN(ffV ffV2) {
        this.nSK = new bio_1(ffV2);
        aue_0.cVJ().a(this);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("mimiSymbicDialog");
            fyw_0.gqw().tc("wakfu.mimiSymbic");
            cft_2.clean();
            cvo_2.daL().dno().dRv();
            bey_0.dTc().b(this);
        }
    }

    @Override
    public void d(@Nullable Sl sl) {
        if (sl instanceof Sn) {
            cft_2.checkEquipItemDropped((ffV)((Sn)sl).bfD());
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public bio_1 eVV() {
        return this.nSK;
    }
}

