/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.LinkedList;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cSZ
 */
public class csz_1
extends Vx
implements adi_1,
fis_1 {
    private static final Logger nHN = Logger.getLogger(csz_1.class);
    private static final csz_1 nHO = new csz_1();
    private String nHP;
    private boolean nHQ = true;
    private boolean nHR;
    private fey_2 nHS;
    private final TIntObjectHashMap<czp_2> nHT = new TIntObjectHashMap();
    private static final int nHU = 2;
    static final TIntObjectHashMap<ctd_1> nHV = new TIntObjectHashMap();
    static final TIntObjectHashMap<ctd_1> nHW = new TIntObjectHashMap();
    public static final int nHX = 5000;
    private final LinkedList<Long> nHY = new LinkedList();

    public boolean ePm() {
        return this.nHS != null;
    }

    public static csz_1 ePn() {
        return nHO;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            aba_2 aba_22 = (aba_2)aam_22;
            switch (aba_22.bUy()) {
                case 2: {
                    if (this.nHY.isEmpty()) break;
                    long l = this.nHY.removeFirst();
                    bif_2.dYO().dYQ();
                }
            }
            return false;
        }
        switch (aam_22.d()) {
            case 19707: {
                apr_0 apr_02;
                daw daw2 = (daw)aam_22;
                AwayCommand.cAY();
                aOY aOY2 = daw2.eZP();
                if (aOY2 == null && (apr_02 = aPt.cAg().cAl()) != null) {
                    aOY2 = apr_02.czW();
                }
                if (aOY2 != null) {
                    aPh.czg().czh().jE(daw2.getMessage());
                }
                return false;
            }
            case 19772: {
                day_0 day_02 = (day_0)aam_22;
                AwayCommand.cAY();
                apr_0 apr_03 = aPt.cAg().cAl();
                if (apr_03 == null || apr_03.czW() == null) {
                    return false;
                }
                apn_0 apn_02 = apr_03.czW();
                bbi_0 bbi_02 = day_02.eZR();
                Object object = bbi_02.dam() ? bbi_02.bkG() : apn_02.cyL() + " " + bbi_02.bkG();
                aPh.czg().czh().jE((String)object);
                return false;
            }
            case 17196: {
                dav dav2 = (dav)aam_22;
                aOY aOY3 = dav2.eZP();
                aPR aPR2 = dav2.eZO();
                aOY3.a(aPR2.cBm(), true);
                return false;
            }
            case 16466: {
                if (fyw_0.gqw().to("contactListDialog")) {
                    aue_0.cVJ().b(ctw_2.ePU());
                } else {
                    aue_0.cVJ().a(ctw_2.ePU());
                }
                return false;
            }
            case 17252: {
                dae_0 dae_02 = (dae_0)aam_22;
                aPt.cAg().zf(dae_02.bCo());
                return false;
            }
            case 16315: {
                aPt.cAg().cAl().czP();
                aPt.cAg().cAw();
                return false;
            }
            case 17611: {
                daz daz2 = (daz)aam_22;
                aPt.cAg().cAl().a(daz2.eZS(), true);
                aPt.cAg().cAw();
                return false;
            }
            case 19776: {
                dae_0 dae_03 = (dae_0)aam_22;
                return this.c(dae_03.bCt(), aPa.evr);
            }
            case 17357: {
                dae_0 dae_04 = (dae_0)aam_22;
                return this.c(dae_04.bCt(), aPa.evw);
            }
            case 19272: {
                dae_0 dae_05 = (dae_0)aam_22;
                String string = dae_05.bCt();
                String string2 = apn_0.jh(string);
                apr_0 apr_04 = aym_0.a(null, aPa.evr, string);
                int n = apr_04.czm();
                apn_0 apn_03 = apr_04.yZ(0);
                apn_03.iC(string2);
                aPt.cAg().zj(n);
                fse_1.gFu().b("chat", apr_04, "exchangeDialog");
                return false;
            }
            case 19651: {
                cza_2.eZs();
                return false;
            }
            case 18635: {
                dax dax2 = (dax)aam_22;
                String string = dax2.xO();
                String string3 = apn_0.jh(string);
                apr_0 apr_05 = aym_0.a(null, aPa.evr, string);
                int n = apr_05.czm();
                apn_0 apn_04 = apr_05.yZ(0);
                apn_04.iC(string3);
                aPt.cAg().zk(n);
                fse_1.gFu().b("chat", apr_05, "moderatorChatDialog");
                if (dax2.eZQ() != null) {
                    dax2.eZQ().a(apr_05);
                }
                return false;
            }
            case 18779: {
                cza_2.eZs();
                return false;
            }
            case 18691: {
                dae_0 dae_06 = (dae_0)aam_22;
                int n = dae_06.bCo();
                this.Mw(n);
                return false;
            }
            case 18095: {
                dae_0 dae_07 = (dae_0)aam_22;
                bgy bgy2 = bgg_0.dlO().lI(dae_07.bCt());
                if (bgy2 == null || !bgy2.ddI().isVisible()) {
                    aPd.e("error.group.memberTooFar", new Object[0]);
                    return false;
                }
                acd_1 acd_12 = bgy2.aZw();
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                long l = bgy2.Sn();
                if (!this.nHY.contains(l)) {
                    bif_2.dYO().a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.aqZ(), bgy2, false);
                    abb_2.bUA().a(this, 5000L, 2, 1L);
                    this.nHY.add(l);
                }
                return false;
            }
            case 19275: {
                dae_0 dae_08 = (dae_0)aam_22;
                boolean bl = dae_08.bCu();
                if (!bl && this.nHQ) {
                    return false;
                }
                long l = dae_08.bCp();
                int n = dae_08.bCo();
                ctd_1 ctd_12 = (ctd_1)nHW.get(n);
                if (ctd_12 != null && bl) {
                    abg_2.bUP().h(ctd_12);
                }
                if ((ctd_12 = (ctd_1)nHV.get(n)) != null) {
                    abg_2.bUP().h(ctd_12);
                }
                if (l == -1L) {
                    return false;
                }
                if (ctd_12 == null) {
                    ctd_12 = new ctd_1(this, n, true);
                }
                nHV.put(n, (Object)ctd_12);
                abg_2.bUP().a((Runnable)ctd_12, l, 1);
                return false;
            }
            case 19751: {
                dae_0 dae_09 = (dae_0)aam_22;
                boolean bl = dae_09.bCu();
                if (!bl && this.nHQ) {
                    return false;
                }
                long l = dae_09.bCp();
                int n = dae_09.bCo();
                ctd_1 ctd_13 = (ctd_1)nHV.get(n);
                if (ctd_13 != null && bl) {
                    abg_2.bUP().h(ctd_13);
                }
                if ((ctd_13 = (ctd_1)nHW.get(n)) != null) {
                    abg_2.bUP().h(ctd_13);
                }
                if (ctd_13 == null) {
                    ctd_13 = new ctd_1(this, n, false);
                }
                nHW.put(n, (Object)ctd_13);
                abg_2.bUP().a((Runnable)ctd_13, l, 1);
                return false;
            }
            case 17698: {
                this.nHQ = ((dae_0)aam_22).bCu();
                return false;
            }
            case 19862: {
                if (aue_0.cVJ().cVK().djT()) {
                    return false;
                }
                long l = ((dae_0)aam_22).bCp();
                Optional<cuz_2> optional = cux_2.eSa().op(l);
                if (optional.isEmpty()) {
                    return false;
                }
                if (aue_0.cVJ().c(cux_2.eSa())) {
                    if (cux_2.eSa().eSb() == l) {
                        aue_0.cVJ().b(cux_2.eSa());
                    } else {
                        cux_2.eSa().a(optional.get());
                    }
                    return false;
                }
                cux_2.eSa().a(optional.get());
                aue_0.cVJ().a(cux_2.eSa());
                return false;
            }
        }
        return true;
    }

    private boolean c(String string, aPa aPa2) {
        apn_0 apn_02 = aPt.cAg().a(string, aPa2);
        if (apn_02 != null) {
            cdc_1.selectView(apn_02);
            return false;
        }
        apr_0 apr_02 = aPt.cAg().cAi();
        boolean bl = apr_02 == null;
        return this.a(string, aPa2, aym_0.a(apr_02, aPa2, string), bl);
    }

    private boolean a(String string, aPa aPa2, apr_0 apr_02, boolean bl) {
        apn_0 apn_02 = apr_02.czW();
        apn_02.iC(apn_0.a(string, aPa2));
        int n = apr_02.czm();
        String string2 = cza_2.NL(n);
        fey_2 fey_22 = bl ? (fey_2)this.a(apr_02, this.nHP) : this.My(apr_02.czm());
        fyw_0.gqw().a(new cta_1(this, string2, n));
        frp_1 frp_12 = (frp_1)fey_22.getLayoutData();
        frp_12.setAlign(fzw_0.tLg);
        this.nHP = string2;
        this.nHT.put(n, (Object)new czp_2(fey_22, apr_02));
        aPt.cAg().zf(apr_02.czm());
        fey_22.a(new ctb_1(this, fey_22));
        fse_1.gFu().b("chat", apr_02, string2);
        fse_1.gFu().a((aef_2)apr_02, apr_0.eyF);
        return false;
    }

    void Mw(int n) {
        String string = cza_2.NL(n);
        aPt.cAg().dc(n, -1);
        this.Mx(n);
        if (string != null && string.equals(this.nHP)) {
            this.nHP = null;
        }
    }

    public fey_2 ePo() {
        apr_0 apr_02 = aPt.cAg().cAl();
        return apr_02 != null ? ((czp_2)this.nHT.get(apr_02.czm())).getWindow() : null;
    }

    @Override
    public long Sn() {
        return 10L;
    }

    @Override
    public void dC(long l) {
    }

    void e(boolean bl, int n) {
        czp_2 czp_22 = (czp_2)this.nHT.get(n);
        if (czp_22 == null) {
            return;
        }
        cza_2.a(n, czp_22, bl);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nHQ = !((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lji);
            fse_1.gFu().f("chat.isMaximize", false);
            fse_1.gFu().f("chatManager", aPt.cAg());
            fse_1.gFu().f("chat.editedView", (Object)null);
            TIntObjectIterator<apr_0> tIntObjectIterator = aPt.cAg().cAn();
            boolean bl2 = true;
            String string = null;
            boolean bl3 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljv);
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
                fhv_1 fhv_12 = this.a(apr_02, null);
                if (bl3) {
                    string = fhv_12.getElementMap().getId();
                }
                if (this.nHQ) continue;
                aPd.p(tIntObjectIterator.key(), false);
            }
            fyw_0.gqw().d("wakfu.chat", cdc_1.class);
            fbj_1.getInstance().a(fzq_0.tJM, this, false);
            fbj_1.getInstance().a(fzq_0.tJW, this, false);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            TIntObjectIterator<apr_0> tIntObjectIterator = this.nHT.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((czp_2)tIntObjectIterator.value()).dQY();
            }
            fbj_1.getInstance().b(fzq_0.tJM, this, false);
            fbj_1.getInstance().b(fzq_0.tJW, this, false);
            nHV.clear();
            nHW.clear();
            this.nHT.clear();
            this.nHS = null;
            this.nHY.clear();
            aPe.czf().clear();
            abb_2.bUA().b(this);
            fse_1.gFu().vX("chatManager");
            fse_1.gFu().vX("chat.editedView");
            try {
                tIntObjectIterator = aPt.cAg().cAn();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    apr_0 apr_02 = (apr_0)tIntObjectIterator.value();
                    apr_02.cAc();
                    fyw_0.gqw().tl(cza_2.NL(apr_02.czm()));
                }
            }
            catch (Exception exception) {
                nHN.error((Object)("Erreur \u00e0 la fermeture des chats " + String.valueOf(exception)));
            }
            fyw_0.gqw().tc("wakfu.chat");
            cdv_0.euj().e(this);
        }
    }

    public fhv_1 a(apr_0 apr_02, String string) {
        fhv_1 fhv_12 = cza_2.a(apr_02, string);
        this.nHT.put(apr_02.czm(), (Object)new czp_2((fey_2)fhv_12, apr_02));
        return fhv_12;
    }

    public apr_0 c(flp_2 flp_22) {
        TIntObjectIterator tIntObjectIterator = this.nHT.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fey_2 fey_22 = ((czp_2)tIntObjectIterator.value()).getWindow();
            if (!fey_22.getAppearance().gE(flp_22.x(fey_22), flp_22.y(fey_22))) continue;
            return aPt.cAg().ze(tIntObjectIterator.key());
        }
        return null;
    }

    public fey_2 d(flp_2 flp_22) {
        TIntObjectIterator tIntObjectIterator = this.nHT.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fey_2 fey_22 = ((czp_2)tIntObjectIterator.value()).getWindow();
            if (!fey_22.getAppearance().gE(flp_22.x(fey_22), flp_22.y(fey_22))) continue;
            return fey_22;
        }
        return null;
    }

    public apn_0 e(flp_2 flp_22) {
        TIntObjectIterator tIntObjectIterator = this.nHT.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fey_2 fey_22 = ((czp_2)tIntObjectIterator.value()).getWindow();
            if (!fey_22.getAppearance().gE(flp_22.x(fey_22), flp_22.y(fey_22))) continue;
            fbz_2 fbz_22 = (fbz_2)fey_22.getElementMap().uH("viewsList");
            fes_2 fes_22 = fbz_22.getWidget(flp_22.x(fbz_22), flp_22.y(fbz_22));
            if (fes_22 == null) {
                return null;
            }
            return (apn_0)fes_22.getRenderableParent().getItemValue();
        }
        return null;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        flp_2 flp_22 = (flp_2)fiq_12;
        block0 : switch (fiq_12.gBy()) {
            case tJM: {
                TIntObjectIterator tIntObjectIterator = this.nHT.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    fey_2 fey_22 = ((czp_2)tIntObjectIterator.value()).getWindow();
                    if (fey_22.isUnloading()) continue;
                    fhs_2 fhs_22 = fey_22.getElementMap();
                    fes_2 fes_22 = (fes_2)fhs_22.uH("chatWindow");
                    boolean bl = fes_22.getAppearance().gE(flp_22.x(fey_22), flp_22.y(fey_22));
                    fey_2 fey_23 = this.nHS = bl ? fey_22 : null;
                    if (!bl) continue;
                    break block0;
                }
                break;
            }
            case tJW: {
                if (this.nHS == null) break;
                fcq_2 fcq_22 = (fcq_2)this.nHS.getElementMap().uH("chatScrollContainer");
                if (flp_22.gEo() > 0) {
                    cdc_1.goDownText(flp_22, fcq_22, false);
                    break;
                }
                cdc_1.goUpText(flp_22, fcq_22, false);
            }
        }
        return false;
    }

    public void Mx(int n) {
        czp_2 czp_22 = (czp_2)this.nHT.remove(n);
        if (czp_22 == null) {
            return;
        }
        fey_2 fey_22 = czp_22.getWindow();
        if (fey_22 == null) {
            return;
        }
        String string = fey_22.getElementMap().getId();
        String string2 = fey_22.getId();
        ftk_2 ftk_22 = (ftk_2)fey_22.getUserDefinedManager();
        fyw_0.gqw().tl(cza_2.NL(n));
        ftk_22.ba(string, string2);
    }

    public fey_2 My(int n) {
        czp_2 czp_22 = (czp_2)this.nHT.get(n);
        return czp_22 == null ? null : czp_22.getWindow();
    }

    public void d(apr_0 apr_02) {
        fse_1.gFu().a((aef_2)apr_02, apr_02.bxk());
    }

    @Override
    public boolean i(int n, long l) {
        return this.b(n, l, -1);
    }

    public boolean b(int n, long l, int n2) {
        if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljB)) {
            return false;
        }
        return csz_1.c(n, l, n2);
    }

    public static boolean c(int n, long l, int n2) {
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            return czr_2.d(n, l, n2);
        }
        eyp eyp2 = bgy2.doV();
        if (eyp2 instanceof bjz_1) {
            return czr_2.a(n, l, n2, bgy2);
        }
        return czr_2.a(n, bgy2);
    }

    public void kf(boolean bl) {
        if (this.nHT == null) {
            return;
        }
        TIntObjectIterator tIntObjectIterator = this.nHT.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fhs_2 fhs_22 = ((czp_2)tIntObjectIterator.value()).getWindow().getElementMap();
            if (fhs_22 == null) {
                return;
            }
            fhv_1 fhv_12 = fhs_22.uH("chatOptionsButton");
            if (fhv_12 == null) {
                return;
            }
            ((fdd_2)fhv_12).setSelected(bl);
        }
    }

    public void Mz(int n) {
        fey_2 fey_22 = this.My(n);
        cza_2.bG(fey_22);
    }
}

