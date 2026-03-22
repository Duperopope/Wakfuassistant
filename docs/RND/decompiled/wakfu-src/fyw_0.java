/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.EventQueue;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyw
 */
public class fyw_0
implements aey_1,
als_2,
alu_2 {
    static final Logger tBD = Logger.getLogger(fyw_0.class);
    private static final fyw_0 tBE = new fyw_0();
    public static final long tBF = 0L;
    public static final long tBG = 2L;
    public static final long tBH = 4L;
    public static final long tBI = 8L;
    public static final long tBJ = 16L;
    public static final long tBK = 64L;
    public static final long tBL = 256L;
    public static final long tBM = 512L;
    public static final long tBN = 8192L;
    public static final long tBO = 16384L;
    public static final long tBP = 32768L;
    public static final long tBQ = 49152L;
    public static final long tBR = 65536L;
    public static final long tBS = 131072L;
    public static final long tBT = 262144L;
    public static final long tBU = 524288L;
    public static final int tBV = 0;
    public static final int tBW = 25999;
    public static final int tBX = 26999;
    public static final int tBY = 27000;
    public static final int tBZ = 29499;
    private ahv ofW;
    private fhv_2 tCa;
    private final fhq_2 tCb = new fhq_2();
    private final fse_1 tCc = fse_1.gFu();
    private final fhu_1 tCd = new fhu_1();
    fid_2 tCe;
    private fta_2 tCf;
    private My imR;
    private amb_1 tCg;
    public static final int tCh = Integer.MAX_VALUE;
    public static final int tCi = Integer.MIN_VALUE;
    private final List<ftq_1> tCj = new ArrayList<ftq_1>();
    private final List<fts_1> tCk = new ArrayList<fts_1>();
    private final THashMap<String, fhv_1> tCl = new THashMap();
    private final HashMap<String, Class<?>> tCm;
    private URL tCn;
    private int tCo;
    private fyc_0 tCp;
    private fcb_2 tCq;
    private fyc_0 tCr;
    private fdp_1 tCs;
    public String tCt;
    public String tCu;
    public String tCv;
    private final Collection<String> tCw = new ArrayList<String>();
    private final ArrayList<fsk_1> tCx = new ArrayList();
    private final Collection<fsk_1> tCy = new ArrayList<fsk_1>();
    final ArrayList<alx_2> tCz = new ArrayList();
    final Collection<alx_2> tCA = new ArrayList<alx_2>();
    final ArrayList<alw_2> tCB = new ArrayList();
    final Collection<alw_2> tCC = new ArrayList<alw_2>();
    private final Collection<String> tCD = new ArrayList<String>();
    private axb_2 tCE = new awx_2(0, 0, 0, 0);
    private int bUi;
    private alv_2 tCF;
    private boolean tCG = false;

    public static fyw_0 gqw() {
        return tBE;
    }

    private fyw_0() {
        this.tCm = new HashMap();
        this.d("xulor", fyd_0.class);
    }

    @Override
    public void a(alx_2 alx_22) {
        if (alx_22 != null && !this.tCz.contains(alx_22)) {
            this.tCz.add(alx_22);
        }
    }

    @Override
    public void b(alx_2 alx_22) {
        this.tCA.add(alx_22);
    }

    @Override
    public void a(alw_2 alw_22) {
        this.a(alw_22, false);
    }

    public void a(alw_2 alw_22, boolean bl) {
        if (alw_22 != null && !this.tCB.contains(alw_22)) {
            if (bl) {
                this.tCB.addFirst(alw_22);
            } else {
                this.tCB.add(alw_22);
            }
        }
    }

    @Override
    public void b(alw_2 alw_22) {
        this.tCC.add(alw_22);
    }

    public void ta(String string) {
        if (string != null && !this.tCD.contains(string)) {
            this.tCD.add(string);
        }
    }

    public axb_2 gqx() {
        return this.tCE;
    }

    public void w(axb_2 axb_22) {
        this.tCE = axb_22;
    }

    public fta_2 gqy() {
        return this.tCf;
    }

    public void a(fta_2 fta_22) {
        this.tCf = fta_22;
    }

    public void a(fid_2 fid_22) {
        this.tCe = fid_22;
    }

    public fid_2 gqz() {
        return this.tCe;
    }

    public void a(amb_1 amb_12) {
        this.tCg = amb_12;
    }

    public amb_1 gqA() {
        return this.tCg;
    }

    public fhq_2 gqB() {
        return this.tCb;
    }

    public fhu_1 gqC() {
        return this.tCd;
    }

    @Override
    public void a(ahv ahv2) {
        this.ofW = ahv2;
    }

    public ahv bmB() {
        return this.ofW;
    }

    public fhv_2 gqD() {
        return this.tCa;
    }

    public void a(fhv_2 fhv_22) {
        this.tCa = fhv_22;
    }

    public alv_2 gqE() {
        return this.tCF;
    }

    @Override
    public void a(alv_2 alv_22) {
        this.tCF = alv_22;
        this.gqG();
    }

    public void ow(boolean bl) {
        this.tCG = bl;
    }

    public boolean gqF() {
        return this.tCG;
    }

    private void gqG() {
    }

    @Nullable
    public aeb_1 bCh() {
        return this.tCF == null ? null : this.tCF.bCh();
    }

    @Override
    public void propertyChange(aex_1 aex_12) {
    }

    public String k(String string, Object ... objectArray) {
        if (this.imR != null) {
            return this.imR.c(string, objectArray);
        }
        return string;
    }

    public void c(My my) {
        this.imR = my;
    }

    public String gqH() {
        StringBuilder stringBuilder = new StringBuilder("# XULOR INFOS #");
        stringBuilder.append('\n').append("- loadedElementCount = ").append(this.tCl.size());
        stringBuilder.append('\n').append("- loadedElements = \n");
        if (!this.tCl.isEmpty()) {
            this.tCl.forEachKey((TObjectProcedure)new fyx(this, stringBuilder));
        }
        return stringBuilder.toString();
    }

    public void i(URL uRL) {
        this.tCn = uRL;
    }

    public boolean tb(String string) {
        return this.tCm.containsKey(string);
    }

    public void d(String string, Class<?> clazz) {
        this.tCm.put(string, clazz);
    }

    public void tc(String string) {
        this.tCm.remove(string);
    }

    public void gqI() {
        this.tCm.clear();
        this.d("xulor", fyd_0.class);
    }

    public Class<?> td(String string) {
        if (string == null) {
            return this.tCm.get("xulor");
        }
        if (!this.tCm.containsKey(string)) {
            tBD.error((Object)("Le package " + string + " est inconnue !"));
            return null;
        }
        return this.tCm.get(string);
    }

    public fyc_0 te(String string) {
        return fyc_0.tr(string);
    }

    public Optional<fey_2> ax(String string, String string2) {
        try {
            fhs_2 fhs_22 = this.tCd.uP(string2);
            this.tCd.k(fhs_22);
            fyc_0 fyc_02 = this.te(string);
            if (fyc_02 == null) {
                return Optional.empty();
            }
            fhv_1 fhv_12 = this.a(fyc_02, this.tCd, fhs_22);
            if (!(fhv_12 instanceof fey_2)) {
                return Optional.empty();
            }
            fey_2 fey_22 = (fey_2)fhv_12;
            fhv_12.setElementMapRoot(true);
            fey_22.setId(string2);
            fey_22.setModalLevel((short)20000);
            this.a(fey_22.getId(), fey_22, fbj_1.getInstance().getLayeredContainer(), 26000, 256L);
            fyd_0.closePopup(null);
            fhy_2.gBq().eHp();
            return Optional.of(fey_22);
        }
        catch (Exception exception) {
            tBD.error((Object)("[XULOR] An error occurred while loading message box " + string2), (Throwable)exception);
            return Optional.empty();
        }
    }

    public void tf(String string) {
        this.tCp = this.te(string);
        if (this.tCp == null) {
            tBD.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des popupMenu est invalide !"));
        }
    }

    public fcb_2 gqJ() {
        if (this.tCp == null) {
            return null;
        }
        fcb_2 fcb_22 = null;
        try {
            String string = "PopupMenu_" + this.tCo++;
            if (this.tCo > 0x7FFFFFFE) {
                this.tCo = 0;
            }
            fhs_2 fhs_22 = this.tCd.uP(string);
            this.tCd.k(fhs_22);
            fhv_1 fhv_12 = this.a(this.tCp, this.tCd, fhs_22);
            if (fhv_12 instanceof fcb_2) {
                fhv_12.setElementMapRoot(true);
                fcb_22 = (fcb_2)fhv_12;
                fcb_22.setId(string);
                fcb_22.setModalLevel((short)30000);
                fcb_22.setVisible(false);
                this.tCa.getMasterRootContainer().getLayeredContainer().d(fcb_22, 30000);
                this.tCl.put((Object)string, (Object)fcb_22);
            }
        }
        catch (Exception exception) {
            tBD.error((Object)exception.getMessage());
        }
        return fcb_22;
    }

    public void a(fcb_2 fcb_22, int n, int n2) {
        this.gqK();
        this.tCq = fcb_22;
        fcb_22.gL(n, n2);
    }

    public void gqK() {
        if (this.tCq != null) {
            this.tl(this.tCq.getId());
        }
    }

    public void tg(String string) {
        this.tCr = this.te(string);
        if (this.tCr == null) {
            tBD.error((Object)("Le chemin '" + string + "' vers le fichier de d\u00e9finition des mrus est invalide !"));
        }
    }

    public void gqL() {
        ArrayList arrayList = new ArrayList();
        if (!this.tCl.isEmpty()) {
            this.tCl.forEachValue((TObjectProcedure)new fyy_0(this, arrayList));
        }
        for (fhv_1 fhv_12 : arrayList) {
            this.J(fhv_12.getElementMap().getId(), true);
        }
    }

    public fdp_1 gqM() {
        if (this.tCr == null) {
            return null;
        }
        fdp_1 fdp_12 = null;
        try {
            Object object;
            String string = "MRU";
            fes_2 fes_22 = (fes_2)this.tCl.get((Object)"MRU");
            if (fes_22 != null) {
                object = new fmb_1(fes_22);
                ((fiq_1)object).aVI();
                fes_22.h((fiq_1)object);
                this.J("MRU", true);
            }
            object = this.tCd.uP("MRU");
            this.tCd.k((fhs_2)object);
            fhv_1 fhv_12 = this.a(this.tCr, this.tCd, (fhs_2)object);
            if (fhv_12 instanceof fdp_1) {
                fhv_12.setElementMapRoot(true);
                fdp_12 = (fdp_1)fhv_12;
                fdp_12.setId("MRU");
                fdp_12.setModalLevel((short)30000);
                fdp_12.setVisible(false);
                this.tCa.getMasterRootContainer().getLayeredContainer().d(fdp_12, 26999);
                this.tCl.put((Object)"MRU", (Object)fdp_12);
            }
        }
        catch (Exception exception) {
            tBD.error((Object)exception.getMessage());
        }
        return fdp_12;
    }

    public void a(fdp_1 fdp_12) {
        this.gqN();
        this.tCs = fdp_12;
        fdp_12.cDD();
    }

    public void a(fdp_1 fdp_12, int n, int n2) {
        this.gqN();
        this.tCs = fdp_12;
        fhv_2 fhv_22 = fyw_0.gqw().tCa;
        n = fhv_22.abM(n);
        n2 = fhv_22.abN(n2);
        fdp_12.gL(n, n2);
    }

    public void gqN() {
        if (this.tCs != null && !this.tCs.isUnloading()) {
            this.tl(this.tCs.getElementMap().getId());
        }
    }

    public fhv_1 th(String string) {
        return (fhv_1)this.tCl.get((Object)string);
    }

    public Iterator<fhv_1> gqO() {
        return this.tCl.values().iterator();
    }

    public void a(String string, WQ wQ) {
        fhv_1 fhv_12 = this.th(string);
        if (fhv_12 instanceof feq_1) {
            feq_1 feq_12 = (feq_1)fhv_12;
            feq_12.setTarget(wQ);
        } else {
            this.tCj.add(new ftr_1(string, wQ));
        }
    }

    public void a(String string, String string2, fti_1 fti_12) {
        this.tCb.b(string, string2, fti_12);
    }

    public void a(fhg_2 fhg_22, fhi_1 fhi_12, String string) {
        this.tCb.b(fhg_22, fhi_12, string);
    }

    public void ay(String string, String string2) {
        try {
            this.tCb.aK(string, string2);
        }
        catch (RuntimeException runtimeException) {
            tBD.error((Object)("Error occured during theme loading : " + runtimeException.getMessage()), (Throwable)runtimeException);
        }
    }

    public void ti(String string) {
        try {
            this.tCb.uD(string);
        }
        catch (Exception exception) {
            tBD.error((Object)("Error occured during colors loading : " + exception.getMessage()), (Throwable)exception);
        }
    }

    @Override
    public void bCg() {
        fmu_1.gEF().gEE();
        this.tCb.oW(true);
    }

    public fhv_1 az(String string, String string2) {
        return this.a(string, string2, 0L);
    }

    public fhv_1 a(String string, String string2, long l) {
        return this.a(string, string2, Integer.MAX_VALUE, l);
    }

    public fhv_1 a(String string, String string2, int n, long l) {
        fto_2 fto_22 = new fto_2();
        fto_22.wl(string).wk(string2).ach(n).ve(l);
        return this.a(fto_22.gGY());
    }

    public fhv_1 a(String string, String string2, String string3, String string4, String string5) {
        return this.a(string, string2, string3, string4, string5, 0L);
    }

    public fhv_1 a(String string, String string2, String string3, String string4, String string5, long l) {
        fto_2 fto_22 = new fto_2();
        fto_22.wl(string).wk(string2).wm(string3).wn(string4).wo(string5).ve(l);
        return this.a(fto_22.gGY());
    }

    public fhv_1 a(String string, String string2, int n, int n2, long l) {
        return this.a(string, string2, Integer.MAX_VALUE, n, n2, l);
    }

    public fhv_1 a(String string, String string2, int n, int n2, int n3, long l) {
        fto_2 fto_22 = new fto_2();
        fto_22.wl(string).wk(string2).pw(true).aci(n2).acj(n3).ach(n).ve(l);
        return this.a(fto_22.gGY());
    }

    public fhv_1 a(ftn_1 ftn_12) {
        long l = System.nanoTime();
        fhv_1 fhv_12 = this.b(ftn_12);
        int n = ftn_12.getDuration();
        if (n != Integer.MAX_VALUE) {
            this.tCj.add(new fts_1(ftn_12.getId(), n, 0L));
        }
        if (this.gqF()) {
            long l2 = System.nanoTime() - l;
            tBD.info((Object)String.format("[XULOR-DEBUG] Loading of %s take %s ms (%s ns)", ftn_12.getId(), l2 / 1000000L, l2));
        }
        return fhv_12;
    }

    private static boolean aO(long l, long l2) {
        return (l & l2) == l2;
    }

    private fhv_1 b(ftn_1 ftn_12) {
        long l;
        fyc_0 fyc_02 = ftn_12.gGN();
        if (fyc_02 == null) {
            return null;
        }
        String string = ftn_12.getId();
        if (this.tCD.contains(string)) {
            for (int i = this.tCx.size() - 1; i >= 0; --i) {
                this.tCx.get(i).eX(string);
            }
        }
        if (fyw_0.aO(l = ftn_12.gGP(), 16L)) {
            this.tm(string);
        }
        URL uRL = ftn_12.gGQ();
        fhv_1 fhv_12 = ftn_12.gGX();
        fhs_2 fhs_22 = ftn_12.getElementMap();
        fhv_1 fhv_13 = ftn_12.getParent();
        if (fhv_12 != null && fhs_22 == null && (fhs_22 = fhv_12.getElementMap()) != null) {
            fhs_22.uI(string);
        }
        boolean bl = false;
        if (string != null && fhs_22 == null && !this.tCl.containsKey((Object)string)) {
            fhs_22 = this.tCd.uP(string);
            bl = true;
        }
        if (fhs_22 != null) {
            try {
                HashMap<String, String> hashMap = ftn_12.gGO();
                if (hashMap != null) {
                    for (Map.Entry object2 : hashMap.entrySet()) {
                        fhs_22.aM((String)object2.getKey(), (String)object2.getValue());
                    }
                }
                fhs_2 fhs_23 = this.tCd.gAy();
                this.tCd.k(fhs_22);
                URL uRL2 = this.tCn;
                this.tCn = uRL;
                if (fhv_12 == null) {
                    fhv_12 = this.a(fyc_02, this.tCd, fhs_22);
                }
                if (!fyw_0.aO(l, 64L)) {
                    if (fhv_13 == null) {
                        int n;
                        fbw_1 fbw_12 = this.tCa.getMasterRootContainer().getLayeredContainer();
                        if (fyw_0.aO(l, 256L)) {
                            n = 26000;
                            if (this.tCf != null) {
                                this.tCf.eVg();
                            }
                            fyd_0.closePopup(null);
                        } else {
                            n = fyw_0.aO(l, 262144L) ? -10000 : (fyw_0.aO(l, 65536L) ? -40000 : (fyw_0.aO(l, 4L) ? 27000 : (fyw_0.aO(l, 131072L) ? 25999 : (fyw_0.aO(l, 2L) ? 26999 : (fyw_0.aO(l, 8L) ? 29499 : (fyw_0.aO(l, 524288L) ? 35000 : 0))))));
                        }
                        if (fhv_12 instanceof fes_2) {
                            fbw_12.d((fes_2)fhv_12, n);
                            fhv_13 = fbw_12;
                        } else {
                            fbw_12.e(fhv_12);
                        }
                    } else {
                        fhv_13.e(fhv_12);
                    }
                }
                fhv_12.setElementMapRoot(bl);
                if (fyw_0.aO(l, 256L)) {
                    fhx_2.gAQ().r(fhv_12);
                    this.tCw.add(string);
                }
                if (fyw_0.aO(l, 512L)) {
                    fhx_2.gAQ().q(fhv_12);
                    this.tCw.add(string);
                }
                this.tCn = uRL2;
                this.tCd.k(fhs_23);
            }
            catch (Exception exception) {
                tBD.error((Object)("Le chargement de " + String.valueOf(fyc_02.tCS) + " a \u00e9chou\u00e9"), (Throwable)exception);
            }
            this.a(fhv_12, string, ftn_12.gGR(), ftn_12.gGS(), ftn_12.gGT(), ftn_12.gGU(), ftn_12.gGV(), ftn_12.gGW(), l);
        } else {
            tBD.error((Object)"On essaye de charger une dialog existant d\u00e9j\u00e0 sans avoir utilis\u00e9 l'option FORCE_RELOAD");
        }
        EventQueue.invokeLater(new fyz_0(this, string));
        return fhv_12;
    }

    private void a(fhv_1 fhv_12, String string, String string2, String string3, String string4, boolean bl, int n, int n2, long l) {
        if (fhv_12 != null) {
            fhv_1 fhv_13;
            Object object;
            if (string != null) {
                this.tCl.put((Object)string, (Object)fhv_12);
            }
            ftk_2 ftk_22 = null;
            if (fyw_0.aO(l, 32768L)) {
                ftk_22 = new ftk_2((fes_2)fhv_12);
                ftk_22.pu(true);
            }
            if (fyw_0.aO(l, 16384L)) {
                if (ftk_22 == null) {
                    ftk_22 = new ftk_2((fes_2)fhv_12);
                }
                ftk_22.pv(true);
            }
            if (ftk_22 != null) {
                fhv_12.setUserDefinedManager(ftk_22);
                fhv_12.gAH();
                object = this.tCF.bCh();
                if (object != null) {
                    ((aev_1)object).a(fhv_12);
                }
            }
            if (this.tCe != null) {
                if (fyw_0.aO(l, 8192L)) {
                    this.tCe.vs(string);
                } else {
                    this.tCe.M(string, false);
                }
            }
            if (string3 != null) {
                object = (fes_2)fhv_12;
                if (!(((fes_2)object).getLayoutData() instanceof frp_1)) {
                    ((fes_2)object).setLayoutData(new frp_1());
                }
                fhv_13 = (frp_1)((fes_2)object).getLayoutData();
                ((frp_1)fhv_13).setReferentWidget((fes_2)this.tCl.get((Object)string3));
                if (string2 != null) {
                    ((frp_1)fhv_13).setCascadeMethodEnabled(true);
                }
                ((frp_1)fhv_13).setControlGroup(string4);
            }
            if (string4 != null && (object = fhv_12.getParentOfType(fch_1.class)) != null) {
                fhv_13 = (fch_1)object;
                fes_2 fes_22 = (fes_2)fhv_12;
                ((fch_1)fhv_13).getWindowManager().e(fes_22, string4);
                if (string2 != null) {
                    ((fch_1)fhv_13).getWindowManager().g(fes_22, string4);
                }
                fya_0 fya_02 = new fya_0(this, fes_22, (fch_1)fhv_13, string4, string2);
                this.a(fya_02);
            }
            if (bl && fhv_12 instanceof fes_2) {
                if (n != Integer.MIN_VALUE) {
                    ((fes_2)fhv_12).setX(n);
                }
                if (n2 != Integer.MIN_VALUE) {
                    ((fes_2)fhv_12).setY(n2);
                }
            }
        }
    }

    public void tj(String string) {
        this.tCe.vs(string);
    }

    public void tk(String string) {
        this.tCe.vt(string);
    }

    private void a(String string, fhv_1 fhv_12, fhi_2 fhi_22, int n, long l) {
        if (fhi_22 instanceof fbw_1) {
            ((fbw_1)fhi_22).d((fes_2)fhv_12, n);
        } else {
            fhi_22.e(fhv_12);
        }
        if (fyw_0.aO(l, 256L)) {
            fhx_2.gAQ().r(fhv_12);
            this.tCw.add(string);
        }
        if (fyw_0.aO(l, 512L)) {
            fhx_2.gAQ().q(fhv_12);
            this.tCw.add(string);
        }
        this.tCl.put((Object)string, (Object)fhv_12);
    }

    public fhv_1 a(URL uRL, fhu_1 fhu_12, fhs_2 fhs_22, boolean bl, URL uRL2, String string, String string2) {
        aqs_2 aqs_22 = fyw_0.j(uRL);
        return this.tCb.a(aqs_22, uRL, fhu_12, fhs_22, bl, uRL2, string, string2);
    }

    public static aqs_2 j(URL uRL) {
        aqs_2 aqs_22 = new aqs_2();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
        aqr_2 aqr_22 = new aqr_2();
        aqr_22.gU(bufferedInputStream);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        ((InputStream)bufferedInputStream).close();
        return aqs_22;
    }

    public fhv_1 a(fyc_0 fyc_02, fhu_1 fhu_12, fhs_2 fhs_22) {
        if (fyc_02.tCR != null) {
            return this.a(fyc_02.tCR, fhu_12, fhs_22);
        }
        return this.a(fyc_02.tCS, fhu_12, fhs_22, false, null, null, null);
    }

    public fhv_1 a(Class<? extends fhk_1> clazz, fhu_1 fhu_12, fhs_2 fhs_22) {
        return (fhv_1)clazz.newInstance().a(fhu_12, fhs_22);
    }

    public void tl(String string) {
        this.J(string, false);
    }

    public void J(String string, boolean bl) {
        if (!this.tCl.containsKey((Object)string)) {
            return;
        }
        if (!this.tCa.getMasterRootContainer().isVisible()) {
            this.tm(string);
        } else if (bl) {
            this.tm(string);
        } else {
            this.tCj.add(new fts_1(string));
        }
    }

    private void tm(String string) {
        fhv_1 fhv_12;
        if (this.tCl.containsKey((Object)string) && (fhv_12 = (fhv_1)this.tCl.get((Object)string)) != null) {
            fhv_12.gAD();
        }
    }

    public void tn(String string) {
        if (this.tCl.containsKey((Object)string)) {
            for (int i = this.tCz.size() - 1; i >= 0; --i) {
                alx_2 alx_22 = this.tCz.get(i);
                if (this.tCA.contains(alx_22)) continue;
                alx_22.dialogUnloaded(string);
            }
            fhv_1 fhv_12 = (fhv_1)this.tCl.remove((Object)string);
            if (fhv_12 != null && this.tCw.contains(string)) {
                this.tCw.remove(string);
                fhx_2.gAQ().l(fhv_12);
            }
            if (this.tCe != null) {
                this.tCe.vu(string);
            }
        }
    }

    public void gqP() {
        this.gqQ();
    }

    private void gqQ() {
        if (!this.tCl.isEmpty()) {
            tBD.info((Object)"Unloading All !");
            this.tCl.forEachKey((TObjectProcedure)new fyb_0(this));
            for (int i = this.tCj.size() - 1; i >= 0; --i) {
                ftq_1 ftq_12 = this.tCj.get(i);
                tBD.info((Object)("Unloading " + String.valueOf(ftq_12)));
                if (!(ftq_12 instanceof fts_1)) continue;
                this.tCj.remove(i);
            }
        }
        fhx_2.gAQ().bxV();
        this.tCw.clear();
        this.tCa.getMasterRootContainer().gtw();
        this.tCl.clear();
    }

    public boolean to(String string) {
        fhv_1 fhv_12 = (fhv_1)this.tCl.get((Object)string);
        return fhv_12 != null && !fhv_12.isUnloading();
    }

    public boolean aA(String string, String string2) {
        if (this.tCl.containsKey((Object)string2)) {
            return false;
        }
        fhv_1 fhv_12 = (fhv_1)this.tCl.remove((Object)string);
        this.tCl.put((Object)string2, (Object)fhv_12);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(alt_2 alt_22, int n) {
        this.bUi += n;
        if (this.tCb.gAl()) {
            this.tCb.gAk();
        }
        this.tCc.gFv();
        if (!this.tCy.isEmpty()) {
            this.tCx.removeAll(this.tCy);
            this.tCy.clear();
        }
        if (!this.tCC.isEmpty()) {
            this.tCB.removeAll(this.tCC);
            this.tCC.clear();
        }
        if (!this.tCA.isEmpty()) {
            this.tCz.removeAll(this.tCA);
            this.tCA.clear();
        }
        try {
            List<ftq_1> list = this.tCj;
            synchronized (list) {
                ftq_1 ftq_12;
                int n2 = this.tCk.size();
                for (int i = 0; i < n2; ++i) {
                    ftq_12 = this.tCk.get(i);
                    if ((long)(this.bUi - ((fts_1)ftq_12).getDuration()) - ((fts_1)ftq_12).atA() <= 0L) continue;
                    ((fts_1)ftq_12).gGZ();
                    this.tCj.add(this.tCk.remove(i));
                    --i;
                    --n2;
                }
                while (!this.tCj.isEmpty()) {
                    ftq_1 ftq_13 = this.tCj.remove(0);
                    if (ftq_13 instanceof fts_1) {
                        ftq_12 = (fts_1)ftq_13;
                        if (!((fts_1)ftq_12).aLB()) {
                            ((fts_1)ftq_12).hq(this.bUi);
                            this.tCk.add((fts_1)ftq_12);
                            continue;
                        }
                        if (((fts_1)ftq_12).dJd()) {
                            this.gqQ();
                            continue;
                        }
                        this.tm(((fts_1)ftq_12).getId());
                        continue;
                    }
                    if (ftq_13 instanceof ftm_1) {
                        ftq_12 = (ftm_1)ftq_13;
                        this.a(((ftm_1)ftq_12).cHc, ((ftm_1)ftq_12).vfF, ((ftm_1)ftq_12).uxL, ((ftm_1)ftq_12).lHq, ((ftm_1)ftq_12).vfN);
                        continue;
                    }
                    if (ftq_13 instanceof ftr_1) {
                        ftq_12 = (ftr_1)ftq_13;
                        fhv_1 fhv_12 = (fhv_1)this.tCl.get((Object)((ftr_1)ftq_12).aDq());
                        if (fhv_12 instanceof feq_1) {
                            ((feq_1)fhv_12).setTarget(((ftr_1)ftq_12).getTarget());
                            continue;
                        }
                        tBD.error((Object)("Tentative de SetWatcherTarget avec une id invalide " + ((ftr_1)ftq_12).aDq()));
                        continue;
                    }
                    if (ftq_13 instanceof ftp_1) {
                        ftq_12 = (ftp_1)ftq_13;
                        fib_2.gBU().setWidget(((ftp_1)ftq_12).vgd);
                        fib_2.gBU().setXOffset(((ftp_1)ftq_12).vge);
                        fib_2.gBU().setYOffset(((ftp_1)ftq_12).vgf);
                        fib_2.gBU().a(((ftp_1)ftq_12).vgg);
                        fib_2.gBU().cDD();
                        continue;
                    }
                    if (!(ftq_13 instanceof ftt_2)) continue;
                    fib_2.gBU().eKH();
                }
            }
        }
        catch (Throwable throwable) {
            tBD.error((Object)"Exception dans Xulor.onProcess() : ", throwable);
        }
    }

    @Override
    public void a(alt_2 alt_22, int n, int n2) {
        fst_1.gGA().a(this.tCa, n, n2);
    }

    @Override
    public void b(alt_2 alt_22) {
        this.tCa = (fhv_2)alt_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void tp(@NotNull String string) {
        List<ftq_1> list = this.tCj;
        synchronized (list) {
            this.tCj.removeIf(ftq_12 -> {
                fts_1 fts_12;
                return ftq_12 instanceof fts_1 && string.equals((fts_12 = (fts_1)ftq_12).toString());
            });
        }
    }
}

