/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fCC
 */
public class fcc_2
extends faw_2
implements fyo_0,
fyv_0 {
    private static Logger oO = Logger.getLogger(fcc_2.class);
    public static final String TAG = "rollingText";
    private long tZm;
    static final String[] tZn = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String tZo = "text";
    private final ArrayList<fcd_2> tZp = new ArrayList();
    private final ArrayList<fcf_1> tZq = new ArrayList();
    private final ArrayList<fcg_2> tZr = new ArrayList();
    boolean tZs;
    private static final int tZt = 25;
    private static final float tZu = 500.0f;
    public static final int tZv = 2000;
    int tZw;
    int tZx;
    int tZy = -1;
    private awx_1 cVs;
    private axb_2 isS;
    private boolean tZz;
    private boolean tZA;

    @Override
    public void setFont(awx_1 awx_12) {
        if (awx_12 == this.cVs) {
            return;
        }
        this.cVs = awx_12;
        for (fcd_2 fcd_22 : this.tZp) {
            fdy_1 fdy_12 = (fdy_1)fcd_22.getList().getElementMap().uH(tZo);
            fdy_12.setFont(awx_12);
        }
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equals(tZo)) {
            if (axb_22 == this.isS) {
                return;
            }
            this.isS = axb_22;
            for (fcd_2 fcd_22 : this.tZp) {
                fdy_1 fdy_12 = (fdy_1)fcd_22.getList().getElementMap().uH(tZo);
                fdy_12.setColor(axb_22, tZo);
            }
        }
    }

    private fbz_2 gtZ() {
        int n = 0;
        int n2 = 0;
        for (String object2 : tZn) {
            int frb_13 = this.cVs.e(object2.charAt(0));
            int fyW2 = this.cVs.g(object2.charAt(0));
            if (frb_13 > n) {
                n = frb_13;
            }
            if (fyW2 <= n2) continue;
            n2 = fyW2;
        }
        fbz_2 fbz_22 = new fbz_2();
        fbz_22.aVI();
        fbz_22.setElementMap(this.nQt);
        fbz_22.setCellSize(new fsm_1(n, n2));
        fbz_22.setAutoIdealSize(true);
        fbz_22.setIdealSizeMinRows(1);
        fbz_22.setIdealSizeMaxRows(1);
        fbz_22.setIdealSizeMinColumns(1);
        fbz_22.setIdealSizeMaxColumns(1);
        fbz_22.setExpandable(false);
        fbz_22.setNonBlocking(false);
        fbz_22.setScrollMode(fzd_0.tGL);
        fbz_22.setSelectionable(false);
        fbz_22.setScrollBar(false);
        fbz_22.setScrollOnMouseWheel(false);
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setAlign(faa_2.tLO);
        fbz_22.d(frb_12);
        fje_2 fje_22 = new fje_2();
        fje_22.aVI();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(this.nQt);
        fdy_12.setExpandable(false);
        frb_1 frb_13 = new frb_1();
        frb_13.aVI();
        frb_13.setAlign(faa_2.tLO);
        fdy_12.d(frb_13);
        if (this.cVs != null) {
            fyW fyp_02 = new fyW();
            fyp_02.aVI();
            fyp_02.setRenderer(this.cVs);
            fdy_12.getAppearance().d(fyp_02);
        }
        if (this.isS != null) {
            fyp_0 fsd_12 = new fyp_0();
            fsd_12.aVI();
            fsd_12.setColor(this.isS);
            fdy_12.getAppearance().d(fsd_12);
        }
        fdy_12.setId(tZo);
        fsd_1 fsd_12 = new fsd_1();
        fsd_12.aVI();
        fsd_12.setAttribute(tZo);
        fdy_12.d(fsd_12);
        fdy_12.onChildrenAdded();
        fje_22.d(fdy_12);
        fje_22.onChildrenAdded();
        fbz_22.d(fje_22);
        fbz_22.onChildrenAdded();
        fbz_22.setContent(tZn);
        this.d(fbz_22);
        this.onChildrenAdded();
        return fbz_22;
    }

    public void setNumber(long l) {
        this.tZm = l;
        int n = String.valueOf(this.tZm).length();
        if (n != this.tZx) {
            this.tZx = n;
            this.tZw = 2000 / (this.tZx * 2 - 1);
            this.tZz = true;
            this.setNeedsToPreProcess();
        }
        this.tZA = true;
        this.setNeedsToPostProcess();
    }

    private void gua() {
        fcd_2 fcd_22 = null;
        int n = this.tZp.size();
        if (!this.tZp.isEmpty()) {
            fcd_22 = this.tZp.get(n - 1);
        }
        Byte by = Byte.valueOf("" + String.valueOf(this.tZm).charAt(n));
        try {
            fcd_2 fcd_23 = new fcd_2(this, this.gtZ(), n, fcd_22, by);
            this.tZp.add(fcd_23);
        }
        catch (Exception exception) {
            oO.error((Object)("Could not init " + fcd_2.class.getSimpleName() + " of " + String.valueOf(this)), (Throwable)exception);
        }
    }

    public boolean gjZ() {
        if (this.tZp.isEmpty()) {
            return false;
        }
        if (this.tZx > this.tZp.size()) {
            return false;
        }
        fcd_2 fcd_22 = this.tZp.get(this.tZp.size() - 1);
        this.tZy = 0;
        if (this.tZp.size() > 1) {
            fcd_22.guc();
        } else {
            fcd_22.gub();
        }
        return true;
    }

    public void clean() {
        for (fcd_2 fcd_22 : this.tZp) {
            fcd_22.clean();
        }
        this.tZp.clear();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tZz) {
            int n2;
            int n3 = this.tZp.size();
            for (n2 = 0; n2 < n3; ++n2) {
                fcd_2 fcd_22 = this.tZp.get(n2);
                fcd_22.getList().gAD();
            }
            this.tZp.clear();
            for (n2 = 0; n2 < this.tZx; ++n2) {
                this.gua();
            }
            this.tZz = false;
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl;
        boolean bl2 = super.LY(n);
        if (this.tZA && (bl = this.gjZ())) {
            this.tZA = false;
        }
        return bl2;
    }

    int getCurrentValue() {
        int n = 0;
        for (fcd_2 fcd_22 : this.tZp) {
            n = (int)((double)n + (double)fcd_22.gud().byteValue() * Math.pow(10.0, this.tZp.size() - 1 - fcd_22.guf()));
        }
        return n;
    }

    public long getTotalDuration() {
        int n = 0;
        for (fcd_2 fcd_22 : this.tZp) {
            byte by = fcd_22.gue();
            n += this.tZw * 2 * by;
        }
        return 4000L;
    }

    @Override
    public void aVI() {
        super.aVI();
        frz_2 frz_22 = new frz_2();
        frz_22.aVI();
        frz_22.setAlign(faa_2.tLP);
        this.a(frz_22);
        this.tZA = false;
        this.tZz = false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.clean();
        this.tZr.clear();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void a(fcf_1 fcf_12) {
        if (!this.tZq.contains(fcf_12)) {
            this.tZq.add(fcf_12);
        }
    }

    public void b(fcf_1 fcf_12) {
        this.tZq.remove(fcf_12);
    }

    void cbz() {
        for (int i = this.tZq.size() - 1; i >= 0; --i) {
            this.tZq.get(i).gug();
        }
    }

    public void a(fcg_2 fcg_22) {
        if (!this.tZr.contains(fcg_22)) {
            this.tZr.add(fcg_22);
        }
    }

    public void b(fcg_2 fcg_22) {
        this.tZr.remove(fcg_22);
    }

    void aaG(int n) {
        for (int i = this.tZr.size() - 1; i >= 0; --i) {
            this.tZr.get(i).aaG(n);
        }
    }
}

