/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from cHM
 */
public class chm_2
extends faw_2
implements fjh_2 {
    public static final String TAG = "TimePointBarWidget";
    private static final String naG = "labels";
    private static final String naH = "points";
    private static final String naI = "avatar";
    public static final String naJ = "turnLabel";
    public static final String naK = "turnArrow";
    public static final String naL = "pointItemRenderer";
    public static final String naM = "avatarItemRenderer";
    public static final String naN = "timePointDescriptionPopup";
    public static final String naO = "timePointDescriptionPopupRenderable";
    cpx_2 naP;
    private cpw_2 naQ;
    frx_1 naR;
    private fjf_1 naS;
    private fjf_1 naT;
    ArrayList<cpv_2> naU;
    private ArrayList<cpv_2> naV;
    ArrayList<fcv_1> naW;
    ArrayList<fcv_1> naX;
    ArrayList<fbv_2> naY;
    fbt_1 naZ;
    private fbv_2 nba;
    private boolean nbb = false;
    private int[] nbc;
    private int[] nbd;
    private int[] nbe;
    int[] nbf;
    int[] nbg;
    private int[] nbh;
    int[] nbi;
    int nbj;
    boolean nbk = false;
    public static final int nbl = "content".hashCode();

    public static int getAdjustedX(fcv_1 fcv_12, int n, int n2, int n3, ArrayList<fcv_1> arrayList, cpu_2 cpu_22) {
        boolean bl;
        int n4 = 0;
        block0: do {
            for (int i = n3 - 1; i >= 0; --i) {
                fcv_1 fcv_13 = arrayList.get(i);
                cpu_2 cpu_23 = (cpu_2)fcv_13.getItemValue();
                if (fcv_13.getX() != n || fcv_13.getY() < n2 && fcv_13.getY() + fcv_13.getHeight() < n2 || n2 < fcv_13.getY() && n2 + fcv_12.getHeight() < fcv_13.getY()) continue;
                bl = true;
                n -= fcv_12.getWidth();
                if (cpu_23 != cpu_22) continue block0;
                n -= fcv_12.getWidth();
                continue block0;
            }
            bl = false;
        } while (bl && n4++ < 20);
        return n;
    }

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof fbv_2 && naJ.equals(fhv_12.getId())) {
            this.nba = (fbv_2)fhv_12;
        } else if (fhv_12 instanceof fbt_1 && naK.equals(fhv_12.getId())) {
            this.naZ = (fbt_1)fhv_12;
            this.naZ.setVisible(false);
            super.e(fhv_12);
        } else if (fhv_12 instanceof frx_1 && naN.equals(fhv_12.getId())) {
            this.naR = (frx_1)fhv_12;
        } else if (fhv_12 instanceof fje_2 && naM.equals(fhv_12.getId())) {
            this.naT.aB((fje_2)fhv_12);
        } else if (fhv_12 instanceof fje_2 && naL.equals(fhv_12.getId())) {
            this.naS.aB((fje_2)fhv_12);
        } else {
            super.e(fhv_12);
        }
    }

    public void a(int n, cpu_2 cpu_22) {
        this.naU.add(n, cpu_22.dlN());
        this.naV.add(cpu_22.dlN());
        this.nbb = true;
        this.setNeedsToPreProcess();
        if (this.naW.size() < this.naU.size()) {
            fcv_1 fcv_12 = new fcv_1();
            fcv_12.aVI();
            fcv_12.setNonBlocking(this.ukD);
            fcv_12.setRendererManager(this.naS);
            fcv_12.setEnableDND(false);
            fcv_12.setEnabled(this.cHn);
            fcv_12.setNetEnabled(this.ivk);
            this.naW.add(n, fcv_12);
            this.d(fcv_12);
            fcv_12.setContentProperty("timePointBar" + cpu_22.Sn(), null);
            fcv_12.setContent(cpu_22);
            fcv_1 fcv_13 = new fcv_1();
            fcv_13.aVI();
            fcv_13.setNonBlocking(this.ukD);
            fcv_13.setRendererManager(this.naT);
            fcv_13.setEnableDND(false);
            fcv_13.setEnabled(this.cHn);
            fcv_13.setNetEnabled(this.ivk);
            this.naX.add(n, fcv_13);
            this.d(fcv_13);
            fcv_13.setContentProperty("timePointBar" + cpu_22.Sn(), null);
            fcv_13.setContent(cpu_22);
        }
    }

    public void a(cpu_2 cpu_22) {
        int n = this.getFighterIndex(cpu_22);
        if (n == -1) {
            return;
        }
        this.naV.remove(this.naU.remove(n));
        this.naW.remove(n).gAD();
        this.naX.remove(n).gAD();
        this.nbb = true;
        this.setNeedsToPreProcess();
    }

    private int getFighterIndex(cpu_2 cpu_22) {
        int n = this.naU.size();
        for (int i = 0; i < n; ++i) {
            if (this.naU.get(i).dHC() != cpu_22) continue;
            return i;
        }
        return -1;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    public fes_2 getWidget(String string, int n) {
        if (string == null) {
            return null;
        }
        if (string.equals(naG)) {
            if (n >= 0 && n < this.naY.size()) {
                return this.naY.get(n);
            }
            return null;
        }
        if (string.equals(naI)) {
            if (n >= 0 && n < this.naX.size()) {
                return this.naX.get(n);
            }
            return null;
        }
        if (string.equals(naH)) {
            if (n >= 0 && n < this.naW.size()) {
                return this.naW.get(n);
            }
            return null;
        }
        return null;
    }

    cic_2 getDecorator() {
        ArrayList<fhv_1> arrayList = this.getAppearance().getChildren();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fhv_1 fhv_12 = arrayList.get(i);
            if (!(fhv_12 instanceof cic_2)) continue;
            return (cic_2)fhv_12;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        int n = this.naW.size();
        for (int i = 0; i < n; ++i) {
            this.naW.get(i).setEnabled(bl);
            this.naX.get(i).setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        int n = this.naW.size();
        for (int i = 0; i < n; ++i) {
            this.naW.get(i).setNetEnabled(bl);
            this.naX.get(i).setNetEnabled(bl);
        }
    }

    public void setContent(cpx_2 cpx_22) {
        if (this.naP == cpx_22) {
            return;
        }
        this.naP = cpx_22;
        this.naP.a(this);
        this.nbj = this.naP.eLo().dIB();
        this.nbb = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2)) {
            return null;
        }
        fes_2 fes_22 = super.getWidget(n, n2);
        if (fes_22 == this || fes_22 == null) {
            n -= this.getAppearance().getLeftInset();
            n2 -= this.getAppearance().getBottomInset();
            int n3 = this.getDecorator().getMesh().eKT().getHeight();
            int n4 = this.getDecorator().getMesh().eKT().getWidth();
            int n5 = this.getAppearance().getContentWidth() - n4;
            int[] nArray = this.getDecorator().getPixelSeparations();
            if (nArray != null) {
                for (int i = 0; i < nArray.length; ++i) {
                    int n6 = nArray[i];
                    if (n <= n5 || n >= n4 + n5 || n2 <= n6 - n3 || n2 >= n6) continue;
                    fes_22 = this.naY.get(i);
                    break;
                }
            }
        }
        return fes_22;
    }

    public void a(cpv_2 cpv_22, int n) {
        this.nbb = true;
        this.setNeedsToPreProcess();
    }

    private void cCm() {
        if (this.naP == null) {
            return;
        }
        List<cpu_2> list = this.naP.dID();
        int n = list.size();
        for (int i = n - 1; i >= 0; --i) {
            cpu_2 object = list.get(i);
            int n2 = this.getFighterIndex(object);
            if (n2 != -1) continue;
            this.a(n - i - 1, object);
        }
        for (cpv_2 cpv_22 : this.naU) {
            cpu_2 cpu_22 = cpv_22.dHC();
            if (list.contains(cpu_22)) continue;
            this.a(cpu_22);
        }
    }

    public void bhS() {
    }

    public void b(cpu_2 cpu_22) {
    }

    public void c(cpu_2 cpu_22) {
        this.a(cpu_22);
    }

    public void eKJ() {
        this.naZ.setVisible(true);
    }

    public void bhR() {
        this.nbj = this.naP.dIB();
        this.cCm();
        this.nbb = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void d(cpu_2 cpu_22) {
    }

    public void e(cpu_2 cpu_22) {
        this.nbb = true;
        this.setNeedsToPreProcess();
    }

    void eKK() {
        int n;
        this.naV.sort(chp_2.nbo);
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int i = this.naU.size() - 1; i >= 0; --i) {
            cpv_2 cpv_22 = this.naU.get(i);
            tIntHashSet.add(cpv_22.dHA());
        }
        int[] nArray = tIntHashSet.toArray();
        Arrays.sort(nArray);
        this.nbc = nArray;
        int n2 = -1;
        int n3 = -1;
        this.nbd = new int[this.nbc.length];
        this.nbe = new int[this.nbc.length];
        int n4 = this.naV.size();
        for (n = 0; n < n4; ++n) {
            cpv_2 cpv_23 = this.naV.get(n);
            if (cpv_23.dHA() != n2) {
                n2 = cpv_23.dHA();
                this.nbd[++n3] = n;
            }
            int n5 = n3;
            this.nbe[n5] = this.nbe[n5] + 1;
        }
        this.nbg = this.nbf;
        if (this.nbc.length != 0) {
            n = 1;
            int n6 = this.nbc.length - 1;
            for (n4 = 0; n4 < n6; ++n4) {
                if (this.nbc[n4] + 1 == this.nbc[n4 + 1]) continue;
                ++n;
            }
            this.nbf = new int[n + this.nbc.length];
            this.nbh = new int[n + this.nbc.length];
            this.nbi = new int[n + this.nbc.length];
            n4 = 0;
            int n7 = this.nbc.length;
            for (n6 = 0; n6 < n7; ++n6) {
                this.nbf[n4] = this.nbc[n6];
                this.nbh[n4] = this.nbd[n6];
                this.nbi[n4] = this.nbe[n6];
                if (this.nbc.length == n6 + 1 || this.nbc[n6] + 1 != this.nbc[n6 + 1]) {
                    this.nbf[++n4] = this.nbc[n6] + 1;
                    this.nbh[n4] = -1;
                    this.nbi[n4] = 0;
                }
                ++n4;
            }
        } else {
            this.nbf = new int[0];
            this.nbh = new int[0];
            this.nbi = new int[0];
        }
        n = Math.max(this.nbf.length, this.nbg.length);
        while (this.naY.size() > n) {
            this.naY.remove(this.naY.size() - 1).gAD();
        }
        n4 = 0;
        while (this.naY.size() < n) {
            fbv_2 fbv_22 = (fbv_2)this.nba.gAK();
            fbv_22.setNonBlocking(true);
            fzq fzq2 = fbv_22.getAppearance();
            fzq2.setAlign(faa_2.tLO);
            this.d(fbv_22);
            this.naY.add(fbv_22);
            n4 = 1;
        }
        if (n4 != 0) {
            int n8;
            for (n8 = this.naY.size() - 1; n8 >= 0; --n8) {
                this.tRe.remove(this.naY.get(n8));
            }
            for (n8 = this.naY.size() - 1; n8 >= 0; --n8) {
                this.tRe.add(0, (fes_2)this.naY.get(n8));
            }
        }
        this.nbb = false;
    }

    private int getDisplayedTurnsNumber() {
        if (this.nbc == null || this.nbc.length == 0) {
            return 0;
        }
        int n = 1;
        int n2 = this.nbc.length - 1;
        for (int i = 0; i < n2; ++i) {
            if (this.nbc[i] + 1 == this.nbc[i + 1]) continue;
            ++n;
        }
        return this.nbc.length + n;
    }

    fsm_1 eKL() {
        cic_2 cic_22 = this.getDecorator();
        cid_1 cid_12 = cic_22.getMesh();
        int n = 0;
        int n2 = 0;
        n2 = Math.max(n2, cid_12.eKQ().getWidth());
        n += cid_12.eKQ().getHeight();
        n2 = Math.max(n2, cid_12.eKS().getWidth());
        int n3 = this.getDisplayedTurnsNumber();
        n2 = Math.max(n2, cid_12.eKT().getWidth());
        n += cid_12.eKT().getHeight() * n3;
        n2 = Math.max(n2, cid_12.eKR().getWidth());
        return new fsm_1(n2, n += cid_12.eKR().getHeight());
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.nbb) {
            this.eKK();
            this.gsm();
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setNeedsToResetMeshes();
        fse_1.gFu().f("fight.describedTimePointBonus", this.naQ);
        this.a(fzq_0.tJQ, new chn_2(this), true);
        this.a(fzq_0.tJR, new cho_2(this), true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.naS = null;
        this.naW.clear();
        this.naW = null;
        this.naQ = null;
        this.naV.clear();
        this.naV = null;
        this.naU.clear();
        this.naU = null;
        this.naY.clear();
        this.naY = null;
        this.naP = null;
        this.naZ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tRj = true;
        this.naS = new fjf_1();
        this.naT = new fjf_1();
        this.naQ = (cpw_2)FG.aLe().f(cpw_2.class).get();
        this.naU = new ArrayList();
        this.naV = new ArrayList();
        this.naX = new ArrayList();
        this.naW = new ArrayList();
        this.naY = new ArrayList();
        this.nbf = new int[0];
        this.nbg = new int[0];
        this.nbk = false;
        this.setNonBlocking(false);
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        this.a(fro_12);
        cht_2 cht_22 = new cht_2(this);
        cht_22.aVI();
        this.a(cht_22);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != nbl) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((cpx_2)object);
        return true;
    }
}

