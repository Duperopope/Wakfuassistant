/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fDK
 */
public class fdk_2
extends faw_2
implements fiz_1,
fyo_0 {
    public static final String TAG = "tree";
    public static final String uhD = "button";
    public static final String uhE = "cell";
    public static final String uhF = "openedCell";
    public static final String uhG = "leafCell";
    public static final String uhH = "selectedCell";
    public static final String uhI = "oddCell";
    public static final String uhJ = "evenCell";
    public static final String uhK = "scrollBar";
    fjf_1 tMx;
    private fgr_1 uhL;
    ArrayList<fgr_1> uhM;
    ArrayList<fcv_1> ncz;
    fcj_2 tLZ;
    boolean tMl = false;
    boolean tMh;
    int crT;
    private String tMB = null;
    private fhs_2 tMC = null;
    private boolean ueb;
    private boolean uhN;
    private boolean uhO;
    ArrayList<fle_1> ued;
    boolean uhP = true;
    boolean uhQ = true;
    fgr_1 uhR = null;
    ArrayList<fgr_1> uhS;
    private boolean uhT = false;
    boolean uhU = false;
    boolean uhV = false;
    int uef;
    int ueg;
    int tQy;
    boolean tMe;
    private axb_2 uei;
    private axb_2 uej;
    public static final int uhW = "content".hashCode();
    public static final int uhX = -1675365079;
    public static final int uhY = -631680873;
    public static final int uhZ = 1063854923;
    public static final int uia = 844056925;
    public static final int uib = -1510502032;
    public static final int uic = -590219650;
    public static final int uid = 1714281668;
    public static final int uie = -1649785707;
    public static final int uif = 71989981;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fje_2) {
            this.tMx.aB((fje_2)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    protected void eKZ() {
        for (int i = this.ued.size() - 1; i >= 0; --i) {
            this.bVe.g(this.ued.get(i).gDq());
        }
        super.eKZ();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(uhK)) {
            return this.tLZ;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equals(uhJ)) {
            this.uei = axb_22;
        } else if (string.equals(uhI)) {
            this.uej = axb_22;
        }
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    public int getCellHeight() {
        return this.uef;
    }

    public void setCellHeight(int n) {
        this.uef = n;
    }

    public int getMinRows() {
        return this.ueg;
    }

    public void setMinRows(int n) {
        this.ueg = n;
    }

    public int getMaxRows() {
        return this.tQy;
    }

    public void setMaxRows(int n) {
        this.tQy = n;
    }

    public boolean isEnableDND() {
        return this.tMe;
    }

    public void setEnableDND(boolean bl) {
        this.tMe = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        int n = this.ncz.size();
        for (int i = 0; i < n; ++i) {
            this.ncz.get(i).setEnabled(bl);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        int n = this.ncz.size();
        for (int i = 0; i < n; ++i) {
            this.ncz.get(i).setNetEnabled(bl);
        }
    }

    public boolean getSelectOnlyOne() {
        return this.uhP;
    }

    public void setSelectOnlyOne(boolean bl) {
        this.uhP = bl;
    }

    public fgr_1 getSelected() {
        return this.uhR;
    }

    public boolean getOpenOnlyOne() {
        return this.uhQ;
    }

    public void setOpenOnlyOne(boolean bl) {
        this.uhQ = bl;
    }

    public fgr_1 getTopOpened() {
        if (!this.uhS.isEmpty()) {
            return this.uhS.get(this.uhS.size() - 1);
        }
        return null;
    }

    public void setContent(fgr_1 fgr_12) {
        this.uhL = fgr_12;
        if (!this.uhT) {
            this.uhL.hW(true);
        }
        this.setContentDirty();
    }

    void setContentDirty() {
        this.uhO = true;
        this.setNeedsToPreProcess();
    }

    private void setTreeDirty() {
        this.uhN = true;
        this.setNeedsToPreProcess();
    }

    private void setValuesDirty() {
        this.ueb = true;
        this.setNeedsToPostProcess();
    }

    public void setOffset(int n) {
        if (this.crT == n) {
            return;
        }
        float f2 = this.aaI(n);
        this.tLZ.getSlider().setValue(f2);
    }

    void setListOffset(int n) {
        if (this.crT == n) {
            return;
        }
        this.crT = n;
        this.setValuesDirty();
    }

    public void setDisplayRoot(boolean bl) {
        this.uhT = bl;
    }

    public void setNoClosingOnClick(boolean bl) {
        this.uhU = bl;
    }

    public void setNoUnselectingOnClick(boolean bl) {
        this.uhV = bl;
    }

    private void gsj() {
        boolean bl;
        fgr_1 fgr_12 = this.getTopOpened();
        this.uhM.clear();
        fgs_1 fgs_12 = new fgs_1(this.uhL);
        boolean bl2 = bl = !this.uhT;
        while (fgs_12.hasNext()) {
            if (bl) {
                fgs_12.gzL();
                bl = false;
                continue;
            }
            this.uhM.add(fgs_12.gzL());
        }
        int n = this.crT;
        int n2 = this.uhM.indexOf(fgr_12);
        if (this.uhM.size() <= this.ncz.size()) {
            n = 0;
        } else if ((n2 == -1 || n2 < this.crT || n2 >= this.crT + this.ncz.size()) && n2 != -1 && n2 + this.ncz.size() <= this.uhM.size()) {
            n = n2;
        }
        n = GC.a(n, 0, this.uhM.size() - this.ncz.size());
        if (n != this.crT) {
            this.crT = n;
            this.setOffset(n);
        }
    }

    int gva() {
        return this.a(this.uhL) - (this.uhT ? 0 : 1);
    }

    private int a(fgr_1 fgr_12) {
        if (fgr_12 == null) {
            return 0;
        }
        int n = 1;
        if (fgr_12.gzJ() && fgr_12.edc()) {
            ArrayList<fgr_1> arrayList = fgr_12.getChildren();
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                n += this.a(arrayList.get(i));
            }
        }
        return n;
    }

    private float aaI(int n) {
        int n2;
        int n3;
        if (n < 0) {
            n = 0;
        }
        if (n > (n3 = (n2 = this.gva()) - this.ncz.size()) + 1) {
            n = n3 + 1;
        }
        return 1.0f - (float)n / (float)n3;
    }

    int fA(float f2) {
        int n = this.gva();
        float f3 = n - this.ncz.size();
        float f4 = f3 - (float)Math.round(f3 * f2);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > f3 + 1.0f) {
            f4 = f3 + 1.0f;
        }
        return Math.round(f4);
    }

    public void ebw() {
        Object object;
        Object object2;
        int n;
        if (this.tMh || this.ncz == null) {
            return;
        }
        int n2 = this.crT;
        int n3 = 0;
        int n4 = this.uhM.size();
        for (n = 0; n < n4; ++n) {
            object2 = this.uhM.get(n);
            if (n2 != 0) {
                --n2;
                continue;
            }
            if (n3 == this.ncz.size()) break;
            object = this.ncz.get(n3);
            String string = this.tMB + "#" + (n3 + this.crT);
            ((fcv_1)object).setContentProperty(string, this.tMC);
            ((fcv_1)object).setContent(object2.getValue());
            String string2 = this.getStyle();
            StringBuilder stringBuilder = new StringBuilder(TAG);
            if (string2 != null) {
                stringBuilder.append(string2);
            }
            stringBuilder.append("$");
            if (object2.edc()) {
                stringBuilder.append(uhF);
            } else if (object2.bqr()) {
                stringBuilder.append(uhH);
            } else if (object2.gzJ()) {
                stringBuilder.append(uhE);
            } else {
                stringBuilder.append(uhG);
            }
            ((faw_2)object).getAppearance().setMargin(new Insets(0, (object2.bDN() - (this.uhT ? 0 : 1)) * 10 + 5, 0, 0));
            ((fes_2)object).setStyle(stringBuilder.toString(), true);
            ++n3;
        }
        n4 = this.ncz.size();
        for (n = n3; n < n4; ++n) {
            object2 = this.ncz.get(n3);
            object = this.tMB + "#" + (n + this.crT);
            ((fcv_1)object2).setContentProperty((String)object, this.tMC);
            ((fcv_1)object2).setContent(null);
        }
    }

    @Override
    public void eKI() {
        this.tLZ.eKI();
        super.eKI();
        this.a(fzq_0.tKa, new fdl_1(this), false);
        this.a(fzq_0.tJW, new fdm_2(this), false);
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.uhO) {
            this.gsj();
            this.setValuesDirty();
            this.uhN = true;
            this.uhO = false;
        }
        if (this.uhN) {
            super.gsm();
            this.bFM();
            this.uhN = false;
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.ueb) {
            this.ebw();
            this.ueb = false;
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fdk_2 fdk_22 = (fdk_2)fhi_22;
        fdk_22.setCellHeight(this.uef);
        fdk_22.setMinRows(this.ueg);
        fdk_22.setMaxRows(this.tQy);
        fdk_22.setEnableDND(this.tMe);
        fdk_22.setSelectOnlyOne(this.uhP);
        fdk_22.setOpenOnlyOne(this.uhQ);
        for (int i = fdk_22.tRe.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = (fes_2)fdk_22.tRe.get(i);
            if (fes_22 == fdk_22.tLZ) continue;
            fes_22.gAD();
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uei = null;
        this.uej = null;
        this.tLZ = null;
        this.uhL = null;
        this.uhM = null;
        this.ued = null;
        this.ncz = null;
        this.uhR = null;
        this.uhS = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fdn_1 fdn_12 = new fdn_1(this);
        fdn_12.aVI();
        this.a(fdn_12);
        this.tLZ = new fcj_2();
        this.tLZ.aVI();
        this.tLZ.setHorizontal(false);
        this.tLZ.setValue(1.0f);
        this.d(this.tLZ);
        this.ueg = -1;
        this.tQy = -1;
        this.uef = 30;
        this.tMe = true;
        this.crT = 0;
        this.tMh = false;
        this.uhN = false;
        this.tMx = new fjf_1();
        this.ncz = new ArrayList();
        this.ued = new ArrayList();
        this.uhM = new ArrayList();
        this.uhS = new ArrayList();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1675365079) {
            this.setCellHeight(Bw.m(string));
        } else if (n == -631680873) {
            this.setEnableDND(Bw.aK(string));
        } else if (n == 1063854923) {
            this.setMinRows(Bw.m(string));
        } else if (n == 844056925) {
            this.setMaxRows(Bw.m(string));
        } else if (n == -1510502032) {
            this.setOpenOnlyOne(Bw.aK(string));
        } else if (n == -590219650) {
            this.setSelectOnlyOne(Bw.aK(string));
        } else if (n == 1714281668) {
            this.setDisplayRoot(Bw.aK(string));
        } else if (n == -1649785707) {
            this.setNoClosingOnClick(Bw.aK(string));
        } else if (n == 71989981) {
            this.setNoUnselectingOnClick(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != uhW) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fgr_1)object);
        return true;
    }

    static /* synthetic */ Logger aGh() {
        return uxJ;
    }
}

