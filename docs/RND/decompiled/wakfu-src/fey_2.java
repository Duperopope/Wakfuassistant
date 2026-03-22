/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fEy
 */
public class fey_2
extends fch_1 {
    public static final String TAG = "Window";
    public static final String umr = "MessageBox";
    public static final String ums = "titleBar";
    public static final String umt = "label";
    public static final String umu = "content";
    public static final String umv = "closeButton";
    public static final String umw = "minButton";
    public static final String umx = "maxButton";
    private boolean nFw;
    private boolean umy = true;
    private boolean umz = false;
    private fki_2 umA;
    private boolean umB = true;
    private boolean umC = true;
    private final ArrayList<fea_1> umD = new ArrayList();
    private String umE;
    private String umF;
    private final ArrayList<ftl_1> umG = new ArrayList();
    public static final int umH = 1699002606;
    public static final int umI = 1243452014;
    public static final int umJ = -208490308;
    public static final int umK = -1468557212;
    public static final int umL = 2101661594;
    public static final int umM = -1984181620;
    public static final int umN = -894345122;
    public static final int umO = 1463972723;

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof frr_1) {
            this.d(fhv_12);
        } else if (fhv_12 instanceof fys_0) {
            this.d(fhv_12);
        } else if (fhv_12 instanceof fsj_2) {
            this.d(fhv_12);
        } else if (fhv_12 instanceof fsd_1) {
            this.d(fhv_12);
        } else {
            super.e(fhv_12);
        }
    }

    void a(fea_1 fea_12) {
        this.umD.add(fea_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public ArrayList<fea_1> getMovePoints() {
        return this.umD;
    }

    public boolean isMovable() {
        return this.umC;
    }

    public void setMovable(boolean bl) {
        this.umC = bl;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        return null;
    }

    @Deprecated
    public boolean isStickWithinDisplayBounds() {
        return this.umy;
    }

    @Deprecated
    public void setStickWithinDisplayBounds(boolean bl) {
        this.umy = bl;
    }

    public boolean isStickWithinRootContainer() {
        return this.umy;
    }

    public void setStickWithinRootContainer(boolean bl) {
        this.umy = bl;
    }

    public boolean getStickFullyWithinRootContainer() {
        return this.umz;
    }

    public void setStickFullyWithinRootContainer(boolean bl) {
        this.umz = bl;
    }

    public void setStickData(fki_2 fki_22) {
        this.umA = fki_22;
    }

    public fki_2 getStickData() {
        return this.umA;
    }

    @Override
    public void setStyle(String string, boolean bl) {
        super.setStyle(string, bl);
        if (this.ukN != null) {
            for (fes_2 fes_22 : this.ukN.values()) {
                fes_22.setStyle(this.getStyleTag() + this.getStyle() + "$" + fes_22.getThemeElementName(), bl);
            }
        }
    }

    public boolean getCanBePushedToTop() {
        return this.umB;
    }

    public void setCanBePushedToTop(boolean bl) {
        this.umB = bl;
    }

    public void a(ftl_1 ftl_12) {
        if (ftl_12 != null && !this.umG.contains(ftl_12)) {
            this.umG.add(ftl_12);
        }
    }

    public void b(ftl_1 ftl_12) {
        this.umG.remove(ftl_12);
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        for (int i = this.umG.size() - 1; i >= 0; --i) {
            this.umG.get(i).epr();
        }
        return bl;
    }

    public String getHorizontalDialog() {
        return this.umE;
    }

    public void setHorizontalDialog(String string) {
        this.umE = string;
    }

    public String getVerticalDialog() {
        return this.umF;
    }

    public void setVerticalDialog(String string) {
        this.umF = string;
    }

    public void setOnResize(fmm_1 fmm_12) {
        this.a(fmm_12.gBy(), fmm_12, true);
    }

    public void gvm() {
        fbw_1 fbw_12;
        if (this.umB && (fbw_12 = this.getParentOfType(fbw_1.class)) != null) {
            fbw_12.o(this);
            fyw_0.gqw().gqz().M(this.nQt.getId(), true);
        }
    }

    private void dKc() {
        this.a(fzq_0.tJS, new fez_2(this), true);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fey_2 fey_22 = (fey_2)fhi_22;
        fey_22.setMovable(this.umC);
        fey_22.umB = this.umB;
        fey_22.nFw = this.nFw;
        fey_22.umy = this.umy;
        fey_22.umz = this.umz;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.umG.clear();
        if (this.umA != null) {
            fkj_2.gCW().bK(this);
            this.umA = null;
        }
        this.umD.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        frz_2 frz_22 = frz_2.checkOut();
        this.a(frz_22);
        this.umC = true;
        this.ukD = false;
        this.ukZ = true;
        this.umy = true;
        this.umz = false;
        this.ukX = true;
        this.dKc();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1699002606) {
            this.setCanBePushedToTop(Bw.aK(string));
        } else if (n == 1243452014) {
            this.setMovable(Bw.aK(string));
        } else if (n == -208490308 || n == -1468557212) {
            this.setStickWithinRootContainer(Bw.aK(string));
        } else if (n == 2101661594) {
            this.setStickFullyWithinRootContainer(Bw.aK(string));
        } else if (n == -1984181620) {
            this.setHorizontalDialog(fic_12.a(string, this.nQt));
        } else if (n == -894345122) {
            this.setVerticalDialog(fic_12.a(string, this.nQt));
        } else if (n == 1463972723) {
            this.setOnResize(fic_12.b(fmm_1.class, string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1699002606) {
            this.setCanBePushedToTop(Bw.l(object));
        } else if (n == 1243452014) {
            this.setMovable(Bw.l(object));
        } else if (n == -208490308 || n == -1468557212) {
            this.setStickWithinRootContainer(Bw.l(object));
        } else if (n == 2101661594) {
            this.setStickFullyWithinRootContainer(Bw.l(object));
        } else if (n == -1984181620) {
            this.setHorizontalDialog((String)object);
        } else if (n == -894345122) {
            this.setVerticalDialog((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

