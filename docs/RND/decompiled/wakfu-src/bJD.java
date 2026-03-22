/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class bJD
extends fpe<bJr> {
    public static final bJD kmg = new bJD();
    protected static final Logger kmh = Logger.getLogger(bJD.class);

    protected bJD() {
    }

    @Override
    public void a(bJr bJr2, wv_1 wv_12) {
    }

    @Override
    public void b(bJr bJr2, wv_1 wv_12) {
    }

    @Override
    public void a(bJr bJr2, wm_2 wm_22) {
    }

    @Override
    public void b(bJr bJr2, wm_2 wm_22) {
    }

    @Override
    public void a(bJr bJr2, wl_1 wl_12) {
    }

    @Override
    public void b(bJr bJr2, wl_1 wl_12) {
        bJr2.lB(wl_12.aiu);
    }

    @Override
    public void a(bJr bJr2, wx_1 wx_12) {
    }

    @Override
    public void b(bJr bJr2, wx_1 wx_12) {
        Object object;
        TIntArrayList tIntArrayList = bJr2.eaz();
        tIntArrayList.clear();
        ArrayList<xr_1> arrayList = wx_12.aiW.ajI;
        for (int i = 0; i < arrayList.size(); ++i) {
            object = arrayList.get(i);
            if (((xr_1)object).ajM == Integer.MAX_VALUE) continue;
            tIntArrayList.add(((xr_1)object).Th);
        }
        xs_1 xs_12 = wx_12.aiW.ajJ;
        object = xs_12 != null ? xs_12.ajO : null;
        bJr2.eaB().clear();
        if (object == null) {
            bJr2.eaB().ensureCapacity(tIntArrayList.size());
            var8_10 = tIntArrayList.size();
            for (var7_8 = 0; var7_8 < var8_10; ++var7_8) {
                bJr2.eaB().add(tIntArrayList.get(var7_8));
            }
        } else {
            var8_10 = ((ArrayList)object).size();
            for (var7_8 = 0; var7_8 < var8_10; ++var7_8) {
                bJr2.eaB().add(((xt_1)((ArrayList)object).get((int)var7_8)).Th);
            }
        }
        ArrayList<xr_1> arrayList2 = wx_12.aiY.ajI;
        TIntArrayList tIntArrayList2 = bJr2.eaC();
        tIntArrayList2.clear();
        int n = arrayList2.size();
        for (int i = 0; i < n; ++i) {
            tIntArrayList2.add(arrayList2.get((int)i).Th);
        }
        fse_1.gFu().a((aef_2)bTj.eno(), "boughtChallenges");
    }

    @Override
    public void a(bJr bJr2, wt_1 wt_12) {
    }

    @Override
    public void b(bJr bJr2, wt_1 wt_12) {
        bkm_0 bkm_02 = bJr2.ear();
        if (bkm_02 == null) {
            bkm_02 = new bkm_0(wt_12.aiI.adP, bkp_0.knm, fgz_0.sjK, 99, 1, false, fpf.sNy);
            bJr2.a(bkm_02);
        }
        bkm_02.a(wt_12.aiI);
        bJr2.eas();
        bkm_0 bkm_03 = bJr2.eax();
        if (bkm_03 == null) {
            bkm_03 = new bkm_0(wt_12.aiJ.adP, bkp_0.knm, fgz_0.sjL, 99, 1, true, fpf.sNz);
            bJr2.b(bkm_03);
        }
        bkm_03.a(wt_12.aiJ);
        kmh.info((Object)("#### MerchantInventory (challenges) du protecteur id=" + bJr2.d()));
        for (bkn_0 bkn_02 : bkm_02) {
            kmh.info((Object)("####   refId=" + bkn_02.avr() + " price=" + bkn_02.eAU() + " type=" + bkn_02.ebh().name() + " featureReferenceId=" + bkn_02.ebi()));
        }
        kmh.info((Object)("#### MerchantInventory (buffs) du protecteur id=" + bJr2.d()));
        for (bkn_0 bkn_02 : bkm_03) {
            kmh.info((Object)("####   refId=" + bkn_02.avr() + " price=" + bkn_02.eAU() + " type=" + bkn_02.ebh().name() + " featureReferenceId=" + bkn_02.ebi()));
        }
    }

    @Override
    public void a(bJr bJr2, xh_1 xh_12) {
    }

    @Override
    public void b(bJr bJr2, xh_1 xh_12) {
        bJI bJI2 = (bJI)bJr2.eav();
        if (bJI2 == null) {
            bJI2 = new bJI(bJr2, bTg.lmY);
            bJr2.a(bJI2);
        }
        bJI2.b(xh_12);
        kmh.info((Object)("#### Wallet du protecteur id=" + bJr2.d() + " : cashAmount=" + bJI2.exS()));
    }

    @Override
    public void a(bJr bJr2, xc_2 xc_22) {
    }

    @Override
    public void b(bJr bJr2, xc_2 xc_22) {
    }

    @Override
    public void a(bJr bJr2, xd_1 xd_12) {
    }

    @Override
    public void b(bJr bJr2, xd_1 xd_12) {
        EnumMap<frk, frj> enumMap = bJr2.eaD();
        ArrayList<xe_1> arrayList = xd_12.ajl;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            yk_1 yk_12 = arrayList.get((int)i).ajm;
            frk frk2 = frk.hA(yk_12.amn);
            enumMap.put(frk2, new frj(frk2, yk_12.amo));
        }
        cwl_1.eVw();
    }

    @Override
    public void a(bJr bJr2, xj_1 xj_12) {
    }

    @Override
    public void b(bJr bJr2, xj_1 xj_12) {
        ArrayList<xk_1> arrayList = xj_12.ajv;
        bJr2.eay().clear();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            xk_1 xk_12 = arrayList.get(i);
            uw_0 uw_02 = uw_0.fn(xk_12.ajw);
            wd_0 wd_02 = ejx_0.qzT.Qc(xk_12.ajx);
            if (wd_02 != null) {
                wj_0 wj_02 = new wj_0(wd_02, uw_02);
                bJr2.eay().add(wj_02);
                continue;
            }
            kmh.error((Object)("Modificateur m\u00e9t\u00e9o ignor\u00e9 -- pas/plus de bonus de climat d'ID=" + xk_12.ajx + ", pour le protecteur ID=" + bJr2.d()));
        }
    }

    @Override
    protected void a(bJr bJr2, wz_1 wz_12) {
    }

    @Override
    protected void b(bJr bJr2, wz_1 wz_12) {
        bJB bJB2 = bJr2.eaE();
        ArrayList<xa_1> arrayList = wz_12.ajf;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            xa_1 xa_12 = arrayList.get(i);
            bJB2.d(xa_12.ajg.Th, new abm_1(xa_12.ajg.aaw, xa_12.ajg.aax));
        }
    }

    @Override
    protected void a(bJr bJr2, wr_1 wr_12) {
    }

    @Override
    protected void b(bJr bJr2, wr_1 wr_12) {
        bJB bJB2 = bJr2.eaE();
        ArrayList<ws_2> arrayList = wr_12.aiG;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ws_2 ws_22 = arrayList.get(i);
            bJB2.c(ws_22.aiH.Th, new abm_1(ws_22.aiH.aaw, ws_22.aiH.aax));
        }
    }

    @Override
    protected void a(bJr bJr2, xb_2 xb_22) {
        fpb fpb2 = fpb.hi(xb_22.ajh);
        if (fpb2 != null) {
            bJr2.eaE().a(fpb2);
        } else {
            kmh.error((Object)("Erreur \u00e0 la d\u00e9serialisation de la satisfaction du protecteur id=" + bJr2.d() + " niveau de satisfaction id=" + xb_22.ajh + " inexistant"));
        }
    }

    @Override
    protected void b(bJr bJr2, xb_2 xb_22) {
    }

    @Override
    protected void a(bJr bJr2, wo_1 wo_12) {
        bJv bJv2 = bJr2.eaH();
        ArrayList<wp_2> arrayList = wo_12.aiB;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bJv2.XX(arrayList.get((int)i).aiD);
        }
        ArrayList<wq_2> arrayList2 = wo_12.aiC;
        int n2 = arrayList2.size();
        for (n = 0; n < n2; ++n) {
            bJv2.XY(arrayList2.get((int)n).aiD);
        }
    }

    @Override
    protected void b(bJr bJr2, wo_1 wo_12) {
    }

    protected void e(bJr bJr2) {
        try {
            aNQ aNQ2 = new aNQ();
            if (!aqb_1.bGD().a(bJr2.d(), aNQ2)) {
                kmh.error((Object)("le protector " + bJr2.d() + " non trouv\u00e9"));
                return;
            }
            TIntArrayList tIntArrayList = bJr2.eaA();
            tIntArrayList.clear();
            alb_0 alb_02 = new alb_0();
            if (!aqb_1.bGD().a(aNQ2.cto(), alb_02)) {
                return;
            }
            fiH<bfY> fiH2 = new fiH<bfY>();
            for (aLC aLC2 : alb_02.clR()) {
                bfY bfY2 = new bfY(aLC2.clS(), 1, ehu_0.rY(aLC2.clB()));
                fiH2.a(bfY2);
                tIntArrayList.add(aLC2.clS());
            }
            bJr2.a(fiH2);
        }
        catch (Exception exception) {
            kmh.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    protected /* synthetic */ void c(foP foP2) {
        this.e((bJr)foP2);
    }

    @Override
    protected /* synthetic */ void a(foP foP2, wo_1 wo_12) {
        this.b((bJr)foP2, wo_12);
    }

    @Override
    protected /* synthetic */ void b(foP foP2, wo_1 wo_12) {
        this.a((bJr)foP2, wo_12);
    }

    @Override
    protected /* synthetic */ void a(foP foP2, xb_2 xb_22) {
        this.b((bJr)foP2, xb_22);
    }

    @Override
    protected /* synthetic */ void b(foP foP2, xb_2 xb_22) {
        this.a((bJr)foP2, xb_22);
    }

    @Override
    protected /* synthetic */ void a(foP foP2, wr_1 wr_12) {
        this.b((bJr)foP2, wr_12);
    }

    @Override
    protected /* synthetic */ void b(foP foP2, wr_1 wr_12) {
        this.a((bJr)foP2, wr_12);
    }

    @Override
    protected /* synthetic */ void a(foP foP2, wz_1 wz_12) {
        this.b((bJr)foP2, wz_12);
    }

    @Override
    protected /* synthetic */ void b(foP foP2, wz_1 wz_12) {
        this.a((bJr)foP2, wz_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, xj_1 xj_12) {
        this.b((bJr)foP2, xj_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, xj_1 xj_12) {
        this.a((bJr)foP2, xj_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, xd_1 xd_12) {
        this.b((bJr)foP2, xd_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, xd_1 xd_12) {
        this.a((bJr)foP2, xd_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, xh_1 xh_12) {
        this.b((bJr)foP2, xh_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, xh_1 xh_12) {
        this.a((bJr)foP2, xh_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, wt_1 wt_12) {
        this.b((bJr)foP2, wt_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, wt_1 wt_12) {
        this.a((bJr)foP2, wt_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, wx_1 wx_12) {
        this.b((bJr)foP2, wx_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, wx_1 wx_12) {
        this.a((bJr)foP2, wx_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, wl_1 wl_12) {
        this.b((bJr)foP2, wl_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, wl_1 wl_12) {
        this.a((bJr)foP2, wl_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, wm_2 wm_22) {
        this.b((bJr)foP2, wm_22);
    }

    @Override
    public /* synthetic */ void b(foP foP2, wm_2 wm_22) {
        this.a((bJr)foP2, wm_22);
    }

    @Override
    public /* synthetic */ void a(foP foP2, wv_1 wv_12) {
        this.b((bJr)foP2, wv_12);
    }

    @Override
    public /* synthetic */ void b(foP foP2, wv_1 wv_12) {
        this.a((bJr)foP2, wv_12);
    }

    @Override
    public /* synthetic */ void a(foP foP2, xc_2 xc_22) {
        this.b((bJr)foP2, xc_22);
    }

    @Override
    public /* synthetic */ void b(foP foP2, xc_2 xc_22) {
        this.a((bJr)foP2, xc_22);
    }
}

