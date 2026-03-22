/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from cXN
 */
public class cxn_1
implements adi_1 {
    private static final Logger nWV = LoggerFactory.getLogger(cxn_1.class);
    private static final cxn_1 nWW = new cxn_1();
    private static final alx_2 nWX = string -> {
        if ("ranchBuildingListDialog".equals(string)) {
            aue_0.cVJ().b(nWW);
        }
    };
    @NotNull
    private final bkg_0 nWY = new bkg_0();

    public static cxn_1 eXv() {
        return nWW;
    }

    private cxn_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return switch (aam_22.d()) {
            case 19904 -> {
                String var2_2 = ((dae_0)aam_22).bCt();
                this.nWY.mq(var2_2.isBlank() ? null : BH.aT(var2_2));
                yield false;
            }
            case 16420 -> {
                bkh_0 var2_3 = (bkh_0)((dae_0)aam_22).bCv();
                cap_1.erG().Kn(var2_3.ebJ());
                yield false;
            }
            case 16703 -> {
                if (cxo_1.eXw().b(bke_0.kpt)) {
                    cxo_1.eXw().kR(true);
                } else {
                    boolean var2_4 = cxo_1.eXw().eXx();
                    if (var2_4) {
                        cxo_1.eXw().kR(false);
                        cxo_1.eXw().eXy();
                    }
                    cxo_1.eXw().a((n, n2) -> cap_1.erG().en(n, n2).ifPresent(ftv_02 -> {
                        cno_0 cno_02 = new cno_0(ftv_02.gmj());
                        aue_0.cVJ().etu().d(cno_02);
                    }));
                    cxo_1.eXw().a(bl -> {
                        cap_1.erG().erL();
                        fhn_1.gzT().bYz();
                    });
                    cxo_1.eXw().a(bke_0.kpt);
                    fhn_1.gzT().a(fzo_0.tHw, true);
                    if (!var2_4) {
                        aue_0.cVJ().a(cxo_1.eXw());
                    }
                }
                yield false;
            }
            case 18586 -> {
                if (cxo_1.eXw().b(bke_0.kpu)) {
                    cxo_1.eXw().kR(true);
                } else {
                    boolean var2_5 = cxo_1.eXw().eXx();
                    if (var2_5) {
                        cxo_1.eXw().kR(false);
                        cxo_1.eXw().eXy();
                    }
                    cxo_1.eXw().a((n, n2) -> cap_1.erG().en(n, n2).ifPresent(ftv_02 -> vt_0.b(() -> cap_1.erG().a((ftv_0)ftv_02))));
                    cxo_1.eXw().a(bl -> {
                        cap_1.erG().erL();
                        fhn_1.gzT().bYz();
                    });
                    cxo_1.eXw().a(bke_0.kpu);
                    fhn_1.gzT().a(fzo_0.tHO, true);
                    if (!var2_5) {
                        aue_0.cVJ().a(cxo_1.eXw());
                    }
                }
                yield false;
            }
            default -> true;
        };
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.nWY.buq();
        fse_1.gFu().f("ranchBuildingList", this.nWY);
        fyw_0.gqw().a(nWX);
        fyw_0.gqw().d("wakfu.ranchBuildingList", cgs_1.class);
        ccj_2.g("ranchBuildingListDialog", 32768L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(nWX);
        fyw_0.gqw().tc("wakfu.ranchBuildingList");
        fyw_0.gqw().tl("ranchBuildingListDialog");
        fse_1.gFu().f("ranchBuildingList", (Object)null);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

