/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Renamed from cHV
 */
public class chv_2
extends faw_2
implements pu_0,
fjh_2 {
    public static final String nbC = "timelineElementType";
    public static final int nbD = 1;
    public static final int nbE = 2;
    public static final String TAG = "timeline";
    private static final int nbF = 250;
    String nbG = "enemyBorderGlow";
    String nbH = "allyBorderGlow";
    String nbI = "enemyBorder";
    String nbJ = "allyBorder";
    fsm_1 nbK = new fsm_1(66, 0);
    fsm_1 nbL = new fsm_1(82, 0);
    private cpx_2 naP;
    private fjf_1 naS;
    int nbM;
    private ArrayList<chw_2> naU;
    ArrayList<chw_2> naV;
    cib_2 nbN;
    final HashMap<fcv_1, Integer> nbO = new HashMap();
    fbt_1 nbP;
    private boolean nbb = false;
    boolean nbQ = false;
    boolean nbR = true;
    private boolean nbS = false;
    ArrayList<fss_2<Object>> nbT;
    ArrayList<fss_2<Object>> nbU;
    private final chu_2 nbV = new chu_2();
    private static final int nbW = 100;
    final Object nbX = new Object();
    public static final int nbY = "content".hashCode();

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof fje_2) {
            this.naS.aB((fje_2)fhv_12);
        } else if (fhv_12 instanceof fbt_1) {
            this.nbP = (fbt_1)fhv_12;
        }
        super.e(fhv_12);
    }

    private void eKN() {
        this.nbN = new cib_2();
        fcv_1 fcv_12 = new fcv_1();
        fcv_12.aVI();
        fcv_12.setNonBlocking(this.ukD);
        fcv_12.setRendererManager(this.naS);
        fcv_12.setEnableDND(false);
        fcv_12.setEnabled(this.cHn);
        fcv_12.setNetEnabled(this.ivk);
        this.nbN.b(fcv_12);
        this.d(fcv_12);
        fcv_12.setContentProperty("timelineTurn", null);
        fcv_12.setContent(this.nbV);
        this.nbO.put(fcv_12, 1);
    }

    public chw_2 f(cpu_2 cpu_22) {
        chw_2 chw_22 = new chw_2(cpu_22);
        cpu_22.e(exx_2.rGI).a(this);
        this.naU.add(chw_22);
        this.nbb = true;
        this.setNeedsToPreProcess();
        fcv_1 fcv_12 = new fcv_1();
        fcv_12.aVI();
        fcv_12.setNonBlocking(this.ukD);
        fcv_12.setRendererManager(this.naS);
        fcv_12.setEnableDND(false);
        fcv_12.setEnabled(this.cHn);
        fcv_12.setNetEnabled(this.ivk);
        this.d(fcv_12);
        fcv_12.setContentProperty(TAG + cpu_22.Sn(), null);
        fcv_12.setContent(cpu_22);
        chw_22.b(fcv_12);
        this.nbO.put(fcv_12, 1);
        this.setWidgetOnTop(this.nbP);
        return chw_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(chw_2 chw_22) {
        if (this.naU == null) {
            return;
        }
        Object object = this.nbX;
        synchronized (object) {
            this.naU.remove(chw_22);
            chw_22.dHC().e(exx_2.rGI).b(this);
            fcv_1 fcv_12 = chw_22.getRenderable();
            int n = this.nbO.get(fcv_12);
            if (n == 1) {
                this.nbO.remove(fcv_12);
                fcv_12.gAD();
            } else {
                this.nbO.put(fcv_12, n - 1);
            }
            this.nbb = true;
            this.setNeedsToPreProcess();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(cpu_2 cpu_22) {
        if (this.naU == null) {
            return;
        }
        Object object = this.nbX;
        synchronized (object) {
            for (int i = this.naU.size() - 1; i >= 0; --i) {
                chw_2 chw_22 = this.naU.get(i);
                if (chw_22.dHC() != cpu_22) continue;
                this.nbb = true;
                this.setNeedsToPreProcess();
                this.naV.remove(chw_22);
                this.naU.remove(i);
                cpu_22.e(exx_2.rGI).b(this);
                fcv_1 fcv_12 = chw_22.getRenderable();
                Integer n = this.nbO.get(fcv_12);
                if (n == null || n == 1) {
                    this.nbO.remove(fcv_12);
                    fcv_12.gAD();
                    continue;
                }
                this.nbO.put(fcv_12, n - 1);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidget(String string, int n) {
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (chw_2 chw_22 : this.naU) {
            chw_22.getRenderable().setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (chw_2 chw_22 : this.naU) {
            chw_22.getRenderable().setNetEnabled(bl);
        }
    }

    public void setContent(cpx_2 cpx_22) {
        if (this.naP == cpx_22) {
            return;
        }
        this.naP = cpx_22;
        if (this.naP != null) {
            this.naP.a(this);
        }
        this.jT(true);
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2)) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    private chw_2 getFighterElement(cpu_2 cpu_22, long l) {
        for (chw_2 chw_22 : this.naU) {
            if (chw_22.dHC() != cpu_22) continue;
            if (l <= 0L) {
                return chw_22;
            }
            --l;
        }
        return null;
    }

    public void jT(boolean bl) {
        Object object;
        boolean bl2;
        if (this.naP == null) {
            return;
        }
        cpu_2 cpu_22 = this.naP.dII();
        List<cpu_2> list = this.naP.dID();
        int n = this.naP.bhG();
        if (n == -1) {
            n = list.indexOf(cpu_22);
        }
        if (n == -1) {
            return;
        }
        this.nbM = list.size() - n - 1;
        this.naV = new ArrayList();
        List<cpu_2> list2 = this.naP.dIE();
        List<cpu_2> list3 = this.naP.dIE();
        ArrayList<cpu_2> arrayList = new ArrayList<cpu_2>();
        boolean bl3 = bl2 = list.indexOf(cpu_22) != list.lastIndexOf(cpu_22);
        if (bl || bl2) {
            this.eKO();
        }
        int n2 = list.size();
        for (int i = n; i < n2; ++i) {
            cpu_2 cpu_23 = list.get(i);
            object = this.f(cpu_23);
            this.naV.add((chw_2)object);
            list3.remove(cpu_23);
            arrayList.add(cpu_23);
        }
        ArrayList<chw_2> arrayList2 = new ArrayList<chw_2>();
        int n3 = list.size();
        for (n2 = 0; n2 < n3 && !list3.isEmpty() && n2 < n; ++n2) {
            object = list.get(n2);
            list3.remove(object);
            chw_2 chw_22 = this.getFighterElement((cpu_2)object, arrayList.stream().filter(arg_0 -> chv_2.a((cpu_2)object, arg_0)).count());
            if (chw_22 == null) {
                chw_22 = this.f((cpu_2)object);
            }
            if (arrayList2.contains(chw_22)) continue;
            arrayList2.add(chw_22);
        }
        this.naV.addAll(arrayList2);
        n2 = this.naU.size();
        for (n3 = n2 - 1; n3 >= 0; --n3) {
            object = this.naU.get(n3);
            if (this.naV.contains(object)) continue;
            this.a((chw_2)object);
        }
        this.nbR = true;
    }

    private void eKO() {
        if (this.naU != null) {
            for (chw_2 chw_22 : this.naU) {
                chw_22.dHC().e(exx_2.rGI).b(this);
                fcv_1 fcv_12 = chw_22.getRenderable();
                this.nbO.remove(fcv_12);
                fcv_12.gAD();
            }
            this.naU.clear();
        } else {
            this.naU = new ArrayList();
        }
    }

    public void bhS() {
    }

    public void bhT() {
        this.jT(true);
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void b(cpu_2 cpu_22) {
        this.jT(false);
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void c(cpu_2 cpu_22) {
        this.a(cpu_22);
        this.jT(false);
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void bhR() {
        this.nbS = true;
        this.nbV.Mb(this.naP.bhJ());
    }

    public void setFightStarted() {
        this.nbS = true;
    }

    public void d(cpu_2 cpu_22) {
    }

    public void e(cpu_2 cpu_22) {
        this.jT(false);
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(pr_0 pr_02) {
        exf_2 exf_22 = (exf_2)pr_02;
        if (exf_22.dqy() == exx_2.rGI && !this.nbS) {
            this.naP.bhH();
            this.naP.dIF();
            this.jT(false);
            this.nbb = true;
            this.setNeedsToPreProcess();
            this.setNeedsToPostProcess();
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.nbb) {
            this.gsm();
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setNeedsToResetMeshes();
        this.eKN();
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.naU != null) {
            for (chw_2 chw_22 : this.naU) {
                exf_2 exf_22 = chw_22.dHC().e(exx_2.rGI);
                exf_22.b(this);
            }
            this.naU.clear();
            this.naU = null;
        }
        this.naV = null;
        this.nbT = null;
        this.nbU = null;
        this.nbP = null;
        this.nbO.clear();
        this.naP = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.nbS = false;
        this.nbT = new ArrayList();
        this.nbU = new ArrayList();
        this.naS = new fjf_1();
        this.naU = new ArrayList();
        this.tRj = true;
        this.nbQ = false;
        this.nbR = false;
        this.nbV.Mb(1);
        this.setNonBlocking(true);
        chz_2 chz_22 = new chz_2(this);
        chz_22.aVI();
        this.a(chz_22);
        this.ukX = true;
        this.a(fzq_0.tKh, (fiq_1 fiq_12) -> {
            if (fiq_12.gBE() == this) {
                this.nbQ = true;
            }
            return false;
        }, false);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != nbY) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((cpx_2)object);
        return true;
    }

    private static /* synthetic */ boolean a(cpu_2 cpu_22, cpu_2 cpu_23) {
        return cpu_23 == cpu_22;
    }
}

