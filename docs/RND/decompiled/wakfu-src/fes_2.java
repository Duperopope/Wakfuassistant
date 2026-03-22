/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fEs
 */
public abstract class fes_2
extends fhv_1
implements fkq_1,
fkf_2,
ftd_1 {
    protected fys_0 uki;
    protected fys_0 ukj;
    private final Set<fks_2> ukk = new HashSet<fks_2>();
    private final Set<ffg_2> ukl = new HashSet<ffg_2>();
    @Nullable
    private fgl_1 ukm;
    private final Set<fff_2> ukn = new HashSet<fff_2>();
    protected faw_2 uko;
    protected EntityGroup bVe;
    protected Point ukp;
    private float ukq;
    private float ukr;
    protected final Point uks = new Point(-1, -1);
    public fsm_1 ukt;
    protected fsm_1 uku;
    protected boolean ukv = false;
    protected fsm_1 ukw;
    protected boolean ukx = false;
    protected fsm_1 uky;
    protected boolean ukz = false;
    protected boolean ukA = false;
    protected boolean ukB = true;
    protected boolean ukC = false;
    protected boolean ukD = false;
    protected boolean bmg = false;
    protected boolean ukE = false;
    private fes_2 ukF = null;
    private final ffg_2 ukG = (bl, bl2) -> this.setVisible(bl2);
    protected boolean ukH = false;
    protected boolean cHn = true;
    protected boolean ivk = true;
    protected String ukI = null;
    protected boolean ukJ = false;
    protected boolean ukK = false;
    protected String[] ukL = new String[5];
    protected boolean ukM = false;
    protected HashMap<String, fes_2> ukN = null;
    protected String ukO;
    protected String ukP;
    protected frr_1 ukQ;
    protected fbd_1 ukR;
    protected frx_1 nJs;
    protected fzo_0 mUW = fzo_0.tHq;
    protected boolean ukS = false;
    protected boolean ukT = false;
    protected boolean ukU = true;
    protected Rectangle ukV = null;
    protected boolean ukW = false;
    private boolean mST = true;
    protected boolean ukX = false;
    protected boolean ukY = false;
    protected boolean ukZ = false;
    private fzb_0 ula = fzb_0.tGy;
    public static final int ulb = 3530753;
    public static final int ulc = -1289212732;
    public static final int uld = 844081029;
    public static final int ule = 540120820;
    public static final int ulf = -1354387741;
    public static final int ulg = -1237774176;
    public static final int ulh = 1629011506;
    public static final int uli = -691041417;
    public static final int ulj = -1609594047;
    public static final int ulk = 262323999;
    public static final int ull = 466743410;
    public static final int ulm = -1811609716;
    public static final int uln = -1677991989;
    public static final int ulo = 5106811;
    public static final int ulp = -1752399344;
    public static final int ulq = 120;
    public static final int ulr = 121;
    public static final int uls = 109780401;
    public static final int ult = -164750818;
    public static final int ulu = 1659243607;
    public static final int ulv = 2009226786;
    public static final int ulw = 87587760;
    public static final int ulx = -671195521;
    public static final int uly = 402556127;
    public static final int ulz = 866230023;
    public static final int ulA = 566769062;
    public static final int ulB = 546747627;
    public static final int ulC = -1351902487;
    public static final int ulD = -1164731176;
    public static final int ulE = 1737415497;
    public static final int ulF = 2096925462;
    public static final int ulG = 1076426565;
    public static final int ulH = -842497956;
    public static final int ulI = -347632250;
    public static final int ulJ = -1037804509;
    public static final int ulK = 511141863;
    public static final int ulL = 520837978;
    public static final int ulM = 1497720703;
    public static final int ulN = 555106394;
    public static final int ulO = 881302303;
    public static final int ulP = 1550573716;
    public static final int ulQ = 555372279;
    public static final int ulR = 29251698;
    public static final int ulS = 555142212;
    public static final int ulT = 39515613;
    public static final int ulU = 728660769;
    public static final int ulV = 45681909;
    public static final int ulW = 552298621;
    public static final int ulX = 151596945;
    public static final int ulY = -1013405773;
    public static final int ulZ = -1013405330;
    public static final int uma = -1046180197;
    public static final int umb = -1032982784;
    public static final int umc = 1928152871;
    public static final int umd = -1336887823;
    public static final int ume = 1055781365;
    public static final int umf = -647313169;

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof fbw_2) {
            ((fbw_2)fhv_12).setClient(this);
            fbj_1.getInstance().getLayeredContainer().d((fes_2)fhv_12, 30000);
        } else {
            super.e(fhv_12);
        }
    }

    public boolean setAppearanceOnAdd() {
        return true;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        boolean bl = true;
        if (fhv_12 instanceof fzv || fhv_12 instanceof fzx) {
            this.uki.d(fhv_12);
            return;
        }
        if (fhv_12 instanceof frr_1) {
            bl &= this.setLayoutData((frr_1)fhv_12);
        }
        if (fhv_12 instanceof fys_0 && this.setAppearanceOnAdd()) {
            bl &= this.setAppearance((fys_0)fhv_12);
        }
        if (fhv_12 instanceof frx_1) {
            this.setPopup((frx_1)fhv_12);
        }
        if (bl) {
            super.d(fhv_12);
        }
    }

    public void a(String string, fes_2 fes_22) {
        if (string == null || fes_22 == null) {
            return;
        }
        if (this.ukN == null) {
            this.ukN = new HashMap();
        }
        this.ukN.put(string.toUpperCase(), fes_22);
        this.ukM = true;
        this.setNeedsToPreProcess();
    }

    protected void gra() {
        if (this.uki == null) {
            return;
        }
        this.uki.gra();
        this.eKZ();
        this.ukU = false;
    }

    protected void eKZ() {
    }

    public void setPopup(frx_1 frx_12) {
        this.nJs = frx_12;
    }

    public frx_1 getPopup() {
        return this.nJs;
    }

    public EntityGroup getEntity() {
        return this.bVe;
    }

    public void setContainerParent(faw_2 faw_22) {
        this.uko = faw_22;
    }

    public faw_2 getContainer() {
        return this.uko;
    }

    public fsm_1 getMaxSize() {
        return this.uky;
    }

    public void setMaxSize(fsm_1 fsm_12) {
        this.uky = fsm_12;
        this.ukz = fsm_12 != null;
    }

    public fsm_1 getSpecifiedContentMaxSize() {
        return this.uky;
    }

    public fsm_1 getContentMinSize() {
        if (this.uku != null) {
            return this.uku;
        }
        return new fsm_1(0, 0);
    }

    public fsm_1 getSpecifiedContentMinSize() {
        return this.uku;
    }

    public fsm_1 getMinSize() {
        fsm_1 fsm_12 = this.getContentMinSize();
        return new fsm_1(fsm_12.width + this.uki.getLeftInset() + this.uki.getRightInset(), fsm_12.height + this.uki.getTopInset() + this.uki.getBottomInset());
    }

    public void gvo() {
    }

    public void setMinSize(fsm_1 fsm_12) {
        this.uku = fsm_12;
        this.ukv = fsm_12 != null;
    }

    public fsm_1 getGreedySize() {
        fsm_1 fsm_12 = this.getContentGreedySize();
        return new fsm_1(fsm_12.width + this.uki.getLeftInset() + this.uki.getRightInset(), fsm_12.height + this.uki.getTopInset() + this.uki.getBottomInset());
    }

    public fsm_1 getContentGreedySize() {
        if (this.uko == null) {
            return new fsm_1(this.uki.getContentWidth(), this.uki.getContentHeight());
        }
        return new fsm_1(this.uki.getContentWidth(), this.uki.getContentHeight());
    }

    public fsm_1 getPrefSize() {
        fsm_1 fsm_12 = this.getContentPrefSize();
        if (this.ukC) {
            if (this.uky != null) {
                fsm_12.height = Math.min(fsm_12.height, this.uky.height);
                fsm_12.width = Math.min(fsm_12.width, this.uky.width);
            } else {
                fsm_12.height = 0;
                fsm_12.width = 0;
            }
        }
        return new fsm_1(fsm_12.width + this.uki.getLeftInset() + this.uki.getRightInset(), fsm_12.height + this.uki.getTopInset() + this.uki.getBottomInset());
    }

    public fsm_1 getContentPrefSize() {
        if (this.ukw == null) {
            return this.getContentMinSize();
        }
        fsm_1 fsm_12 = this.getContentMinSize();
        if (fsm_12 == null) {
            return this.ukw;
        }
        int n = Math.max(this.ukw.width, fsm_12.width);
        int n2 = Math.max(this.ukw.height, fsm_12.height);
        return new fsm_1(n, n2);
    }

    public fsm_1 getSpecifiedContentPrefSize() {
        if (this.ukw == null) {
            return this.getSpecifiedContentMinSize();
        }
        return this.ukw;
    }

    public fsm_1 getSetPrefSize() {
        if (this.ukx) {
            return this.ukw;
        }
        return null;
    }

    public void setPrefSize(fsm_1 fsm_12) {
        this.ukw = fsm_12;
        this.ukx = fsm_12 != null;
    }

    public fsm_1 getSize() {
        return this.ukt;
    }

    public void setSize(fsm_1 fsm_12) {
        this.setSize(fsm_12.width, fsm_12.height);
    }

    public void setSize(int n, int n2) {
        this.setSize(n, n2, false);
    }

    public void setSize(int n, int n2, boolean bl) {
        if (!this.ukS || bl) {
            boolean bl2 = this.ukt.width != n | this.ukt.height != n2;
            if (bl2) {
                fsm_1 fsm_12 = new fsm_1(this.ukt.width, this.ukt.height);
                this.ukt.width = n;
                this.ukt.height = n2;
                this.bFM();
                if (this.ukX) {
                    flt_1 flt_12 = new flt_1(fsm_12, new fsm_1(n, n2));
                    flt_12.x(this);
                    this.h(flt_12);
                }
                if (this.ukZ) {
                    this.setPositionWithinParentBounds();
                }
                this.gvp();
                if (this.uxV && this.uxX != null) {
                    ((ftk_2)this.uxX).gGM();
                }
                this.b(fsm_12, new fsm_1(this.ukt.width, this.ukt.height));
            }
        } else {
            this.x(fsc_2.class);
            fsc_2 fsc_22 = new fsc_2(this.getSize(), new fsm_1(n, n2), this, 0, 500, abn.cdr);
            this.a(fsc_22);
        }
    }

    public void setSizeToMinSize() {
        this.setSize(this.getMinSize());
    }

    public void setSizeToPrefSize() {
        this.setSize(this.getPrefSize());
    }

    public void setPositionWithinParentBounds() {
        if (this.uko == null) {
            return;
        }
        int n = GC.a(this.getX(), 0, this.uko.getAppearance().getContentWidth() - this.getWidth());
        int n2 = GC.a(this.getY(), 0, this.uko.getAppearance().getContentHeight() - this.getHeight());
        this.setPosition(n, n2);
    }

    @Override
    public int getWidth() {
        return this.ukt.width;
    }

    public void setWidth(int n) {
        this.setSize(n, this.ukt.height);
    }

    public void setHeight(int n) {
        this.setSize(this.ukt.width, n);
    }

    @Override
    public int getHeight() {
        return this.ukt.height;
    }

    public void setEnableResizeEvents(boolean bl) {
        this.ukX = bl;
    }

    public void setEnablePositionEvents(boolean bl) {
        this.ukY = bl;
    }

    public boolean isNonBlocking() {
        return this.ukD;
    }

    public void setNonBlocking(boolean bl) {
        this.ukD = bl;
    }

    public int getX(faw_2 faw_22) {
        if (this.ukp != null) {
            if (this.uko == null || this.uko == faw_22) {
                return this.ukp.x + this.uki.getLeftInset();
            }
            return this.ukp.x + this.uko.getX(faw_22) + this.uki.getLeftInset();
        }
        return 0;
    }

    public int getY(faw_2 faw_22) {
        if (this.ukp != null) {
            if (this.uko == null || this.uko == faw_22) {
                return this.ukp.y + this.uki.getBottomInset();
            }
            return this.ukp.y + this.uko.getY(faw_22) + this.uki.getBottomInset();
        }
        return 0;
    }

    public int getScreenX() {
        if (this.uks.x != -1 && this.uks.y != -1) {
            return this.uks.x;
        }
        if (this.ukp != null) {
            if (this.uko != null && this.uko.getAppearance() != null) {
                return this.ukp.x + this.uko.getScreenX() + this.uko.getAppearance().getLeftInset();
            }
            return this.ukp.x;
        }
        return 0;
    }

    public int getScreenY() {
        if (this.uks.x != -1 && this.uks.y != -1) {
            return this.uks.y;
        }
        if (this.ukp != null) {
            if (this.uko != null && this.uko.getAppearance() != null) {
                return this.ukp.y + this.uko.getScreenY() + this.uko.getAppearance().getBottomInset();
            }
            return this.ukp.y;
        }
        return 0;
    }

    protected final Point getScreenPosition() {
        return this.uks;
    }

    public void setScreenPosition(int n, int n2) {
        this.uks.setLocation(n, n2);
    }

    @Override
    public Point getPosition() {
        return this.ukp;
    }

    public void setPosition(Point point) {
        this.setPosition(point.x, point.y, false);
    }

    public void setPosition(int n, int n2) {
        this.setPosition(n, n2, false);
    }

    public void setPosition(int n, int n2, boolean bl) {
        this.setPosition(n, n2, bl ? 0 : 300);
    }

    public void setPosition(int n, int n2, int n3) {
        this.setPosition(n, n2, n3, true, true);
    }

    public float getXPercInParent() {
        return this.ukq;
    }

    public float getYPercInParent() {
        return this.ukr;
    }

    public void setPosition(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.setPosition(n, n2, n3, bl, bl2, null);
    }

    public void setPosition(int n, int n2, int n3, boolean bl, boolean bl2, Runnable runnable) {
        if (n3 == 0 || !this.ukT) {
            boolean bl3 = false;
            if (this.ukp == null) {
                this.ukp = new Point(n, n2);
                bl3 = true;
            } else if (this.ukp.x != n || this.ukp.y != n2) {
                this.ukp.x = n;
                this.ukp.y = n2;
                bl3 = true;
            }
            if (bl2 && this.ukZ && this.uko != null) {
                this.ukp.x = GC.a(this.ukp.x, 0, this.uko.getAppearance().getContentWidth() - this.getWidth());
                this.ukp.y = GC.a(this.ukp.y, 0, this.uko.getAppearance().getContentHeight() - this.getHeight());
            }
            if (bl) {
                this.gvp();
            }
            if (this.ukY) {
                fiq_1 fiq_12 = fiq_1.gBH();
                fiq_12.b(fzq_0.tKi);
                fiq_12.x(this);
                this.h(fiq_12);
            }
            if (bl3 && this.uxV && this.uxX != null) {
                ((ftk_2)this.uxX).gGL();
            }
            this.mST = true;
            this.setNeedsToPostProcess();
        } else {
            fsb_2 fsb_22 = new fsb_2(this.ukp.x, this.ukp.y, n, n2, this, 0, n3, abn.cdr);
            fsb_22.a(new fet_1(this, runnable));
            this.a(fsb_22);
        }
    }

    private void gvp() {
        if (this.uko != null) {
            this.ukq = (float)this.ukp.x / (float)(this.uko.getWidth() - this.ukt.width);
            this.ukr = (float)this.ukp.y / (float)(this.uko.getHeight() - this.ukt.height);
        }
    }

    public void setX(int n) {
        this.setPosition(n, this.ukp.y, false);
    }

    public int getX() {
        return this.ukp.x;
    }

    @Override
    public int getDisplayX() {
        return this.getScreenX();
    }

    public void setY(int n) {
        this.setPosition(this.ukp.x, n, false);
    }

    public int getY() {
        return this.ukp.y;
    }

    @Override
    public int getDisplayY() {
        return this.getScreenY();
    }

    public fbj_1 getMasterRootContainer() {
        if (this.uko != null) {
            return this.uko.getMasterRootContainer();
        }
        return null;
    }

    public axl_2 getComputedScissor() {
        if (this.ukV == null) {
            return null;
        }
        return axl_2.t(this.getScreenX() + this.ukV.x, this.getScreenY() + this.ukV.y, this.ukV.width, this.ukV.height);
    }

    public Rectangle getScissor() {
        return this.ukV;
    }

    public void setScissor(Rectangle rectangle) {
        this.ukV = rectangle;
    }

    public boolean isExpandable() {
        return this.ukB;
    }

    public void setExpandable(boolean bl) {
        this.ukB = bl;
    }

    public boolean isShrinkable() {
        return this.ukC;
    }

    public void setShrinkable(boolean bl) {
        this.ukC = bl;
    }

    public boolean getGreedy() {
        return this.ukA;
    }

    public void setGreedy(boolean bl) {
        this.ukA = bl;
    }

    public void setCurrentCursorType(fzo_0 fzo_02) {
        this.mUW = fzo_02;
    }

    public void setCursorType(fzo_0 fzo_02) {
        this.setCurrentCursorType(fzo_02);
    }

    public fzo_0 getCursorType() {
        return this.mUW;
    }

    public boolean getVisible() {
        return this.bmg;
    }

    public boolean isParentVisible() {
        return this.ukH;
    }

    protected void setParentVisible(boolean bl) {
        this.ukH = bl;
    }

    @Deprecated(forRemoval=true)
    public boolean getUsedInLayout() {
        return this.isVisibleForLayout();
    }

    public void setVisible(boolean bl) {
        if (bl != this.bmg) {
            Runnable runnable = () -> this.oy(bl);
            if (this.ukm != null) {
                this.ukm.a(this.bmg, bl, runnable);
            } else {
                runnable.run();
            }
        }
    }

    protected void oy(boolean bl) {
        boolean bl2 = this.bmg;
        this.bmg = bl;
        this.B(bl2, bl);
        if (this.uko != null) {
            this.uko.gsm();
            this.uko.setNeedsToResetMeshes();
        }
        this.setParentVisible(bl && (this.uko == null || this.uko.isParentVisible()));
        this.setNeedsToPostProcess();
    }

    public void setVisibilityChangePreExecutor(@Nullable fgl_1 fgl_12) {
        this.ukm = fgl_12;
    }

    public void gvq() {
        this.setVisibilityChangePreExecutor(null);
    }

    @Nullable
    public fgl_1 getVisibilityChangePreExecutor() {
        return this.ukm;
    }

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisibilityLinked(@Nullable String string) {
        if (string == null) {
            if (this.ukF == null) {
                return;
            }
            this.ukF.b(this.ukG);
            this.ukF = null;
        } else {
            fhv_1 fhv_12 = this.getParentWithId(string);
            if (fhv_12 == null && this.getParent() == null) {
                this.a(new feu_2(this, string));
                return;
            }
            if (!(fhv_12 instanceof fes_2)) {
                uxJ.warn((Object)String.format("Unable to link %s(id: %s) visibility to following parent %s(%s)", this.getClass(), this.getId(), string, fhv_12 == null ? "null" : fhv_12.getClass()));
                return;
            }
            this.ukF = (fes_2)fhv_12;
            this.ukF.a(this.ukG);
        }
    }

    public boolean isVisibleForLayout() {
        return this.ukE || this.isVisible();
    }

    public void setVisibleForLayout(boolean bl) {
        this.ukE = bl;
    }

    @Deprecated(forRemoval=true)
    public void setUsedInLayout(boolean bl) {
        this.setVisible(bl);
    }

    public boolean getUseResizeTween() {
        return this.ukS;
    }

    public void setUseResizeTween(boolean bl) {
        this.ukS = bl;
    }

    public boolean getUsePositionTween() {
        return this.ukT;
    }

    public void setUsePositionTween(boolean bl) {
        this.ukT = bl;
    }

    public boolean getEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
        this.gsv();
    }

    public boolean getNetEnabled() {
        return this.ivk;
    }

    public void setNetEnabled(boolean bl) {
        this.ivk = bl;
        this.gsv();
    }

    public String getNetEnabledId() {
        return this.ukI;
    }

    public void setNetEnabledId(String string) {
        if (this.ukI != null) {
            fiu_1.uCW.d(this.ukI, this);
        }
        this.ukI = string;
        if (this.ukI != null) {
            fiu_1.uCW.c(string, this);
        }
    }

    public boolean isEnabledFull() {
        return this.ivk && this.cHn;
    }

    private void gsv() {
        flp_1 flp_12 = new flp_1(this, this.cHn && this.ivk);
        this.h(flp_12);
    }

    public void setStickWithinContainer(boolean bl) {
        this.ukZ = bl;
    }

    public boolean isStickWithinContainer() {
        return this.ukZ;
    }

    public boolean getFocusable() {
        return this.ukJ;
    }

    public void setFocusable(boolean bl) {
        if (bl && !this.ukJ) {
            fhw_2.gAL().q(this);
        } else if (!bl && this.ukJ) {
            fhw_2.gAL().r(this);
        }
        this.ukJ = bl;
    }

    public void setFocused(boolean bl) {
        if (this.isInTree()) {
            if (fhw_2.gAL().gAM() != this && bl) {
                fhw_2.gAL().s(this);
            } else if (fhw_2.gAL().gAM() == this) {
                fhw_2.gAL().gAP();
            }
        } else {
            this.ukK = bl;
        }
    }

    public faw_2 getRootFocusParent() {
        if (this.uko != null) {
            return this.uko.getRootFocusParent();
        }
        return null;
    }

    @Nullable
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb) {
            return null;
        }
        if (this.bmg && !this.ukD && this.getAppearance().gE(n, n2) && !fbj_1.getInstance().isMovePointMode()) {
            return this;
        }
        return null;
    }

    public void setNeedsToResetMeshes() {
        this.ukU = true;
        this.setNeedsToPostProcess();
    }

    public boolean getNeedsToResetMeshes() {
        return this.ukU;
    }

    public fys_0 getAppearance() {
        return this.uki;
    }

    public boolean guC() {
        return true;
    }

    @Override
    public boolean setAppearance(fys_0 fys_02) {
        return this.setAppearance(fys_02, true);
    }

    public boolean setAppearance(fys_0 fys_02, boolean bl) {
        boolean bl2 = false;
        while (fys_02 instanceof fyl_0) {
            fys_02 = ((fyl_0)fys_02).getInnerAppearance();
        }
        if (fys_02 != null && this.isAppearanceCompatible(fys_02)) {
            if (this.uki != null && this.uki != fys_02) {
                fys_02.setWidget(this);
                if (bl) {
                    this.m(this.uki);
                } else {
                    this.uki.setWidget(null);
                }
                fys_0 fys_03 = this.uki;
                this.uki = fys_02;
                this.b(fys_03, this.uki);
                bl2 = true;
            } else if (this.uki == null) {
                fys_0 fys_04 = this.uki;
                this.uki = fys_02;
                this.b(fys_04, this.uki);
                bl2 = true;
            }
        } else if (fys_02 != null) {
            fys_02.gAD();
        }
        return bl2;
    }

    private void b(fys_0 fys_02, fys_0 fys_03) {
        if (this.ukk.isEmpty()) {
            return;
        }
        HashSet<fks_2> hashSet = new HashSet<fks_2>(this.ukk);
        hashSet.forEach(fks_22 -> {
            try {
                fks_22.d(fys_02, fys_03);
            }
            catch (Exception exception) {
                uxJ.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fks_22, fks_22.getClass().getName(), fys_02, fys_03), (Throwable)exception);
            }
        });
    }

    public boolean a(@NotNull fks_2 fks_22) {
        return this.ukk.add(fks_22);
    }

    public boolean b(@NotNull fks_2 fks_22) {
        return this.ukk.remove(fks_22);
    }

    private void B(boolean bl, boolean bl2) {
        if (this.ukl.isEmpty()) {
            return;
        }
        HashSet<ffg_2> hashSet = new HashSet<ffg_2>(this.ukl);
        hashSet.forEach(ffg_22 -> {
            try {
                ffg_22.onVisibilityChanged(bl, bl2);
            }
            catch (Exception exception) {
                uxJ.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", ffg_22, ffg_22.getClass().getName(), bl, bl2), (Throwable)exception);
            }
        });
    }

    public boolean a(@NotNull ffg_2 ffg_22) {
        return this.ukl.add(ffg_22);
    }

    public boolean b(@NotNull ffg_2 ffg_22) {
        return this.ukl.remove(ffg_22);
    }

    private void b(fsm_1 fsm_12, fsm_1 fsm_13) {
        if (this.ukn.isEmpty()) {
            return;
        }
        HashSet<fff_2> hashSet = new HashSet<fff_2>(this.ukn);
        hashSet.forEach(fff_22 -> {
            try {
                fff_22.onSizeChanged(fsm_12, fsm_13);
            }
            catch (Exception exception) {
                uxJ.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fff_22, fff_22.getClass().getName(), fsm_12, fsm_13), (Throwable)exception);
            }
        });
    }

    public boolean a(@NotNull fff_2 fff_22) {
        return this.ukn.add(fff_22);
    }

    public boolean b(@NotNull fff_2 fff_22) {
        return this.ukn.remove(fff_22);
    }

    public abstract boolean isAppearanceCompatible(fys_0 var1);

    public int getTopMargin() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.top;
    }

    public int getBottomMargin() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.bottom;
    }

    public int getLeftMargin() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.left;
    }

    public int getRightMargin() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.right;
    }

    public int getTopPadding() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getPadding();
        if (insets == null) {
            return 0;
        }
        return insets.top;
    }

    public int getBottomPadding() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getPadding();
        if (insets == null) {
            return 0;
        }
        return insets.bottom;
    }

    public int getLeftPadding() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getPadding();
        if (insets == null) {
            return 0;
        }
        return insets.left;
    }

    public int getRightPadding() {
        if (this.uki == null) {
            return 0;
        }
        Insets insets = this.uki.getPadding();
        if (insets == null) {
            return 0;
        }
        return insets.right;
    }

    public void setDecoratorState(String string) {
        if (this.uki != null && !this.uki.getCurrentState().equalsIgnoreCase(string)) {
            this.uki.grf();
            this.uki.setEnabled(string, true);
        }
    }

    public void tR(String string) {
        if (string == null) {
            return;
        }
        boolean bl = false;
        for (int i = 0; i < this.ukL.length; ++i) {
            if (this.ukL[i] != null) continue;
            this.ukL[i] = string;
            bl = true;
            break;
        }
        if (!bl) {
            String[] stringArray = new String[this.ukL.length + 5];
            this.ukL = stringArray;
            System.arraycopy(this.ukL, 0, stringArray, 0, this.ukL.length);
            this.ukL[i] = string;
        }
        this.ukM = true;
        this.setNeedsToPreProcess();
    }

    public void setStyle(String string, boolean bl) {
        if (this.ukL == null || string == null) {
            return;
        }
        if (bl || !string.equals(this.ukL[0])) {
            this.ukL[0] = string;
            if (this.uwp) {
                if (this.uki != null) {
                    this.uki.grd();
                }
                for (int i = 0; i < this.ukL.length; ++i) {
                    if (this.ukL[i] == null) continue;
                    fyw_0.gqw().gqB().b(this, this.ukL[i]);
                }
                if (this.ukj != null) {
                    if (this.uki instanceof fyl_0 && !(this.ukj instanceof fyl_0)) {
                        fyl_0 fyl_02 = (fyl_0)this.uki;
                        fys_0 fys_02 = fyl_02.getInnerAppearance();
                        if (fys_02 != null) {
                            if (this.ukj.getClass().isAssignableFrom(fys_02.getClass())) {
                                this.ukj.a(fys_02);
                            } else {
                                uxJ.warn((Object)String.format("Unable to copy xmlAppearance in inner appearance (xmlAppearance is %s, appearance is %s and inner appearance is %s)", this.ukj.getClass(), this.uki.getClass(), fys_02.getClass()));
                            }
                        } else {
                            uxJ.warn((Object)String.format("Unable to copy xmlAppearance in null inner appearance (xmlAppearance is %s and appearance is %s)", this.ukj.getClass(), this.uki.getClass()));
                        }
                    } else if (this.ukj.getClass().isAssignableFrom(this.uki.getClass())) {
                        this.ukj.a(this.uki);
                    } else {
                        uxJ.warn((Object)String.format("Unable to copy xmlAppearance in appearance (xmlAppearance is %s and appearance is %s)", this.ukj.getClass(), this.uki.getClass()));
                    }
                }
                this.ukM = false;
            }
        }
    }

    public void setStyle(String string) {
        try {
            this.setStyle(string, false);
        }
        catch (Exception exception) {
            uxJ.error((Object)"Exception ", (Throwable)exception);
        }
    }

    public String getThemeElementName() {
        return this.ukO;
    }

    public void setThemeElementName(String string) {
        this.ukO = string;
    }

    public String getThemeElementParentType() {
        return this.ukP;
    }

    public void setThemeElementParentType(String string) {
        this.ukP = string;
    }

    public String getStyle() {
        return this.ukL[0] == null ? "" : this.ukL[0];
    }

    public String[] getStyles() {
        return this.ukL;
    }

    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (this.ukN != null) {
            return this.ukN.get(string.toUpperCase());
        }
        return null;
    }

    public fes_2 getWidgetByThemeElementName(String string) {
        return this.getWidgetByThemeElementName(string, false);
    }

    public boolean setLayoutData(frr_1 frr_12) {
        boolean bl = false;
        if (this.ukQ != null && this.ukQ != frr_12) {
            this.m(this.ukQ);
            this.ukQ = frr_12;
            bl = true;
        } else if (this.ukQ == null) {
            this.ukQ = frr_12;
            bl = true;
        }
        return bl;
    }

    public frr_1 getLayoutData() {
        return this.ukQ;
    }

    public fbd_1 getDragAndDropParent() {
        return this.ukR;
    }

    public void setDragAndDropParent(fbd_1 fbd_12) {
        this.ukR = fbd_12;
    }

    public void setOnFocusChange(fmn_2 fmn_22) {
        this.a(fmn_22.gBy(), fmn_22, true);
    }

    public void setOnClick(fmz_1 fmz_12) {
        this.a(fmz_12.gBy(), fmz_12, true);
    }

    public void setOnDoubleClick(fma_2 fma_22) {
        this.a(fma_22.gBy(), fma_22, true);
    }

    public void setOnMouseMove(fmg_1 fmg_12) {
        this.a(fmg_12.gBy(), fmg_12, true);
    }

    public void setOnMouseEnter(fme_1 fme_12) {
        this.a(fme_12.gBy(), fme_12, true);
    }

    public void setOnMouseExit(fmf_2 fmf_22) {
        this.a(fmf_22.gBy(), fmf_22, true);
    }

    public void setOnMousePress(fmh_2 fmh_22) {
        this.a(fmh_22.gBy(), fmh_22, true);
    }

    public void setOnMouseRelease(fmi_2 fmi_22) {
        this.a(fmi_22.gBy(), fmi_22, true);
    }

    public void setOnMouseWheel(fmj_2 fmj_22) {
        this.a(fmj_22.gBy(), fmj_22, true);
    }

    public void setOnMouseDrag(fmc_2 fmc_22) {
        this.a(fmc_22.gBy(), fmc_22, true);
    }

    public void setOnMouseDragOut(fmd_1 fmd_12) {
        this.a(fmd_12.gBy(), fmd_12, true);
    }

    public void setOnMouseDragIn(fmb_2 fmb_22) {
        this.a(fmb_22.gBy(), fmb_22, true);
    }

    public void setOnKeyPress(fms_2 fms_22) {
        this.a(fms_22.gBy(), fms_22, true);
    }

    public void setOnKeyRelease(fmt_2 fmt_22) {
        this.a(fmt_22.gBy(), fmt_22, true);
    }

    public void setOnKeyType(fmu_2 fmu_22) {
        this.a(fmu_22.gBy(), fmu_22, true);
    }

    public void setOnPopupDisplay(fmk_2 fmk_22) {
        this.a(fmk_22.gBy(), fmk_22, true);
    }

    public void setOnPopupHide(fml_1 fml_12) {
        this.a(fml_12.gBy(), fml_12, true);
    }

    public void setOnSelectionChange(fmo_1 fmo_12) {
        this.a(fmo_12.gBy(), fmo_12, true);
    }

    public void setOnSliderMove(fmp_2 fmp_22) {
        this.a(fmp_22.gBy(), fmp_22, true);
    }

    public void setOnStick(fms_1 fms_12) {
        this.a(fms_12.gBy(), fms_12, true);
    }

    public void setOnValueChange(fmr_1 fmr_12) {
        this.a(fmr_12.gBy(), fmr_12, true);
    }

    public void setOnListSelectionChange(fmv_2 fmv_22) {
        this.a(fmv_22.gBy(), fmv_22, true);
    }

    public void setOnItemOver(fmr_2 fmr_22) {
        this.a(fmr_22.gBy(), fmr_22, true);
    }

    public void setOnItemOut(fmq_1 fmq_12) {
        this.a(fmq_12.gBy(), fmq_12, true);
    }

    public void setOnItemClick(fmo_2 fmo_22) {
        this.a(fmo_22.gBy(), fmo_22, true);
    }

    public void setOnItemDoubleClick(fmp_1 fmp_12) {
        this.a(fmp_12.gBy(), fmp_12, true);
    }

    public void setOnDrag(fmh_1 fmh_12) {
        this.a(fzq_0.tJv, fmh_12, false);
    }

    public void setOnDrop(fmk_1 fmk_12) {
        this.a(fzq_0.tJy, fmk_12, false);
    }

    public void setOnDropOut(fml_2 fml_22) {
        this.a(fzq_0.tJz, fml_22, false);
    }

    public void setOnDragOut(fmi_1 fmi_12) {
        this.a(fzq_0.tJw, fmi_12, false);
    }

    public void setOnDragOver(fmj_1 fmj_12) {
        this.a(fzq_0.tJx, fmj_12, false);
    }

    public <T extends faw_2> T getWidgetParentOfType(Class<T> clazz) {
        faw_2 faw_22 = this.uko;
        while (faw_22 != null) {
            if (clazz.isAssignableFrom(faw_22.getClass())) {
                return (T)faw_22;
            }
            faw_22 = faw_22.uko;
        }
        return null;
    }

    public void setUserDefinedSize(boolean bl) {
        ftk_2 ftk_22;
        if (this.uxX == null) {
            this.uxX = new ftk_2(this);
        }
        if ((ftk_22 = (ftk_2)this.uxX).gGK() == bl) {
            return;
        }
        ftk_22.pv(bl);
        this.gAH();
    }

    public boolean isSizeInitByUserDefinition() {
        return this.uxX != null && ((ftk_2)this.uxX).gGK() && (this.ukt.getWidth() != 0.0 || this.ukt.getHeight() != 0.0);
    }

    public void setUserDefinedPosition(boolean bl) {
        ftk_2 ftk_22;
        if (this.uxX == null) {
            this.uxX = new ftk_2(this);
        }
        if ((ftk_22 = (ftk_2)this.uxX).gGJ() == bl) {
            return;
        }
        ftk_22.pu(bl);
        this.gAH();
    }

    public boolean isPositionInitByUserDefinition() {
        return this.uxX != null && ((ftk_2)this.uxX).gGJ() && this.uxX.gGH();
    }

    public void setLazyLoadingMode(fzb_0 fzb_02) {
        this.ula = fzb_02;
    }

    public fzb_0 getLazyLoadingMode() {
        return this.ula;
    }

    @Override
    public boolean h(fiq_1 fiq_12) {
        if (this.isEnabledFull() || !(fiq_12 instanceof flf_2)) {
            return super.h(fiq_12);
        }
        fiq_12.aZp();
        return false;
    }

    @Override
    public void bFM() {
        if (this.uki != null) {
            this.uki.bFM();
        }
        super.bFM();
    }

    public boolean isInWidgetTree() {
        if (this.uko != null) {
            return this.uko.isInWidgetTree();
        }
        return false;
    }

    public void eKI() {
        Class<?> clazz;
        Object obj;
        fiw_1<?> fiw_12;
        if (this.ukO != null && this.ukP != null && (fiw_12 = fkc_2.gCQ().vR(this.ukP)) != null && (obj = this.getWidgetParentOfType(clazz = fiw_12.gBQ())) != null) {
            ((fes_2)obj).a(this.ukO, this);
        }
        if (this.ukJ) {
            fhw_2.gAL().q(this);
        }
    }

    public void gsh() {
    }

    @Override
    public void gvr() {
        super.gvr();
        if (this.ukK) {
            this.setFocused(this.ukK);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        if (this.ukj != null) {
            this.ukj.aZp();
        }
        this.ukj = (fys_0)this.uki.gAK();
        if (this.ukL[0] == null) {
            this.setStyle("", true);
        } else {
            this.setStyle(this.ukL[0], true);
        }
    }

    @Override
    public void aVH() {
        fhw_2.gAL().r(this);
        super.aVH();
        if (fbj_1.getInstance() != null) {
            fbj_1.getInstance().p(this);
        }
        this.bVe.a((avc_2)null);
        this.bVe.b((avc_2)null);
        this.bVe.bJk();
        this.bVe.bsI();
        this.bVe = null;
        this.ukt = null;
        this.uku = null;
        this.uky = null;
        this.ukw = null;
        this.ukp = null;
        this.ukV = null;
        this.setNetEnabledId(null);
        this.uko = null;
        this.ukR = null;
        if (this.ukj != null) {
            this.ukj.aZp();
            this.ukj = null;
        }
        this.uki = null;
        this.ukk.clear();
        this.ukl.clear();
        this.ukm = null;
        this.ukn.clear();
        Arrays.fill(this.ukL, null);
        this.ukO = null;
        this.ukP = null;
        if (this.ukN != null) {
            this.ukN.clear();
            this.ukN = null;
        }
        this.ukQ = null;
        this.nJs = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ukY = false;
        this.ukX = false;
        this.ukB = true;
        this.ukC = false;
        this.ukA = false;
        this.ukH = false;
        this.cHn = true;
        this.ivk = true;
        this.ukJ = false;
        this.ukK = false;
        this.ukM = false;
        this.ukZ = false;
        this.ukW = false;
        this.mST = true;
        this.setCursorType(fzo_0.tHq);
        this.ukS = false;
        this.ukT = false;
        this.ukU = true;
        awp_1 awp_12 = new awp_1();
        awp_12.bPx();
        assert (this.bVe == null);
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.bVe.bIS().a(awp_12);
        ffe_1 ffe_12 = new ffe_1(this);
        this.bVe.a(ffe_12);
        this.bVe.b(ffe_12);
        this.bVe.bIT().c(new acr_1(10000.0f, 0.0f, 0.0f));
        this.ukv = false;
        this.ukz = false;
        this.ukx = false;
        this.ukp = new Point(0, 0);
        this.ukt = new fsm_1(0, 0);
        this.bmg = true;
        this.ukE = false;
        this.ukD = false;
        this.ula = fzb_0.tGy;
        this.setNeedsToPostProcess();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.ukM) {
            this.setStyle(this.ukL[0], true);
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.ukU && this.bVe != null) {
            this.bVe.bJk();
            this.gra();
        }
        if (this.mST && this.bmg && this.bVe != null) {
            int n2 = this.ukp.x;
            int n3 = this.ukp.y;
            if (this.uko != null) {
                n2 += this.uko.getAppearance().getLeftInset();
                n3 += this.uko.getAppearance().getBottomInset();
            }
            this.bVe.bIS().d(0, n2, n3);
            this.mST = false;
        }
        return bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[").append(this.getClass().getSimpleName()).append("] ");
        if (this.cHc != null) {
            stringBuilder.append("id = ").append(this.cHc).append(" ");
        }
        if (this.ukp != null) {
            stringBuilder.append("Position <").append(this.ukp.x).append(", ").append(this.ukp.y).append("> ");
        }
        if (this.ukt != null) {
            stringBuilder.append("Taille (").append(this.ukt.width).append(", ").append(this.ukt.height).append(")");
        }
        if (this.cHc != null) {
            stringBuilder.append("Id=").append(this.getId());
        }
        if (this.isUnloading()) {
            stringBuilder.append("released");
        }
        return stringBuilder.toString();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fes_2 fes_22 = (fes_2)fhi_22;
        super.a(fes_22);
        fes_22.ukY = this.ukY;
        fes_22.ukX = this.ukX;
        fes_22.cHn = this.cHn;
        fes_22.setNetEnabledId(this.ukI);
        fes_22.ukB = this.ukB;
        fes_22.ukC = this.ukC;
        fes_22.ukA = this.ukA;
        fes_22.setFocusable(this.ukJ);
        if (this.uky != null) {
            fes_22.uky = this.uky.gGg();
        }
        fes_22.ukz = this.ukz;
        if (this.ukw != null) {
            fes_22.ukw = this.ukw.gGg();
        }
        fes_22.ukx = this.ukx;
        if (this.uku != null) {
            fes_22.uku = this.uku.gGg();
        }
        fes_22.ukv = this.ukv;
        fes_22.ukD = this.ukD;
        fes_22.ukp = (Point)this.ukp.clone();
        fes_22.ukt = (fsm_1)this.ukt.clone();
        fes_22.setCursorType(this.mUW);
        System.arraycopy(this.ukL, 0, fes_22.ukL, 0, this.ukL.length);
        fes_22.ukO = this.ukO;
        fes_22.ukP = this.ukP;
        fes_22.bmg = this.bmg;
        if (fes_22.ukj != null) {
            fes_22.ukj.aZp();
        }
        fes_22.ukj = this.ukj != null ? (fys_0)this.ukj.gAK() : null;
        fes_22.ukW = this.ukW;
        if (this.uxX != null) {
            fes_22.setUserDefinedSize(this.isSizeInitByUserDefinition());
            fes_22.setUserDefinedPosition(this.isPositionInitByUserDefinition());
        }
        fes_22.ukZ = this.ukZ;
        fes_22.setLazyLoadingMode(this.getLazyLoadingMode());
    }

    public final boolean gvs() {
        return this.ukW;
    }

    public void setNeedsScissor(boolean bl) {
        this.ukW = bl;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3530753) {
            this.setSize(fic_12.vn(string));
        } else if (n == 844081029) {
            this.setMaxSize(fic_12.vn(string));
        } else if (n == -1289212732) {
            this.setPrefSize(fic_12.vn(string));
        } else if (n == 540120820) {
            this.setExpandable(Bw.aK(string));
        } else if (n == -1354387741) {
            this.setShrinkable(Bw.aK(string));
        } else if (n == -1237774176) {
            this.setGreedy(Bw.aK(string));
        } else if (n == 262323999) {
            this.setNetEnabledId(string);
        } else if (n == -1609594047) {
            this.setEnabled(Bw.aK(string));
        } else if (n == 1629011506) {
            this.setFocusable(Bw.aK(string));
        } else if (n == -691041417) {
            this.setFocused(Bw.aK(string));
        } else if (n == 466743410 || n == -1811609716) {
            this.setVisible(Bw.aK(string));
        } else if (n == -1677991989) {
            this.setVisibilityLinked(string);
        } else if (n == 5106811) {
            this.setUsePositionTween(Bw.aK(string));
        } else if (n == -1752399344) {
            this.setUseResizeTween(Bw.aK(string));
        } else if (n == 566769062) {
            this.setStickWithinContainer(Bw.aK(string));
        } else if (n == 120) {
            this.setX(Bw.m(string));
        } else if (n == 121) {
            this.setY(Bw.m(string));
        } else if (n == 109780401) {
            this.setStyle(fic_12.a(string, this.nQt));
        } else if (n == -164750818) {
            this.setThemeElementName(fic_12.a(string, this.nQt));
        } else if (n == 1659243607) {
            this.setThemeElementParentType(fic_12.a(string, this.nQt));
        } else if (n == 2009226786) {
            this.setNonBlocking(Bw.aK(string));
        } else if (n == 87587760) {
            this.setCursorType(fzo_0.tx(string));
        } else if (n == -671195521) {
            this.setNeedsScissor(Bw.aK(string));
        } else if (n == 402556127) {
            this.setUserDefinedSize(Bw.aK(string));
        } else if (n == 866230023) {
            this.setUserDefinedPosition(Bw.aK(string));
        } else if (n == 546747627) {
            this.setLazyLoadingMode(fic_12.b(fzb_0.class, string, this.nQt));
        } else if (n == -1013405773) {
            this.setOnDrag(fic_12.b(fmh_1.class, string));
        } else if (n == -1013405330) {
            this.setOnDrop(fic_12.b(fmk_1.class, string));
        } else if (n == -1046180197) {
            this.setOnDragOut(fic_12.b(fmi_1.class, string));
        } else if (n == -1032982784) {
            this.setOnDropOut(fic_12.b(fml_2.class, string));
        } else if (n == 1928152871) {
            this.setOnDragOver(fic_12.b(fmj_1.class, string));
        } else if (n == -1351902487) {
            this.setOnClick(fic_12.b(fmz_1.class, string));
        } else if (n == -1164731176) {
            this.setOnDoubleClick(fic_12.b(fma_2.class, string));
        } else if (n == 1737415497) {
            this.setOnFocusChange(fic_12.b(fmn_2.class, string));
        } else if (n == 2096925462) {
            this.setOnItemClick(fic_12.b(fmo_2.class, string));
        } else if (n == 1076426565) {
            this.setOnItemDoubleClick(fic_12.b(fmp_1.class, string));
        } else if (n == -842497956) {
            this.setOnItemOut(fic_12.b(fmq_1.class, string));
        } else if (n == -347632250) {
            this.setOnItemOver(fic_12.b(fmr_2.class, string));
        } else if (n == -1037804509) {
            this.setOnKeyPress(fic_12.b(fms_2.class, string));
        } else if (n == 511141863) {
            this.setOnKeyRelease(fic_12.b(fmt_2.class, string));
        } else if (n == 520837978) {
            this.setOnKeyType(fic_12.b(fmu_2.class, string));
        } else if (n == 1497720703) {
            this.setOnListSelectionChange(fic_12.b(fmv_2.class, string));
        } else if (n == 555106394) {
            this.setOnMouseDrag(fic_12.b(fmc_2.class, string));
        } else if (n == 881302303) {
            this.setOnMouseDragIn(fic_12.b(fmb_2.class, string));
        } else if (n == 1550573716) {
            this.setOnMouseDragOut(fic_12.b(fmd_1.class, string));
        } else if (n == 555372279) {
            this.setOnMouseMove(fic_12.b(fmg_1.class, string));
        } else if (n == 29251698) {
            this.setOnMouseEnter(fic_12.b(fme_1.class, string));
        } else if (n == 555142212) {
            this.setOnMouseExit(fic_12.b(fmf_2.class, string));
        } else if (n == 39515613) {
            this.setOnMousePress(fic_12.b(fmh_2.class, string));
        } else if (n == 728660769) {
            this.setOnMouseRelease(fic_12.b(fmi_2.class, string));
        } else if (n == 45681909) {
            this.setOnMouseWheel(fic_12.b(fmj_2.class, string));
        } else if (n == 552298621) {
            this.setOnSelectionChange(fic_12.b(fmo_1.class, string));
        } else if (n == 151596945) {
            this.setOnSliderMove(fic_12.b(fmp_2.class, string));
        } else if (n == -1336887823) {
            this.setOnStick(fic_12.b(fms_1.class, string));
        } else if (n == 1055781365) {
            this.setOnPopupDisplay(fic_12.b(fmk_2.class, string));
        } else if (n == -647313169) {
            this.setOnPopupHide(fic_12.b(fml_1.class, string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3530753) {
            this.setSize((fsm_1)object);
        } else if (n == 844081029) {
            this.setMaxSize((fsm_1)object);
        } else if (n == -1289212732) {
            this.setPrefSize((fsm_1)object);
        } else if (n == 540120820) {
            this.setExpandable(Bw.l(object));
        } else if (n == -1354387741) {
            this.setShrinkable(Bw.l(object));
        } else if (n == -1237774176) {
            this.setGreedy(Bw.l(object));
        } else if (n == -1609594047) {
            this.setEnabled(Bw.l(object));
        } else if (n == 1629011506) {
            this.setFocusable(Bw.l(object));
        } else if (n == -691041417) {
            this.setFocused(Bw.l(object));
        } else if (n == 466743410 || n == -1811609716) {
            this.setVisible(Bw.l(object));
        } else if (n == -1677991989) {
            this.setVisibilityLinked(String.valueOf(object));
        } else if (n == 5106811) {
            this.setUsePositionTween(Bw.l(object));
        } else if (n == -1752399344) {
            this.setUseResizeTween(Bw.l(object));
        } else if (n == 120) {
            this.setX(Bw.m(object));
        } else if (n == 121) {
            this.setY(Bw.m(object));
        } else if (n == 109780401) {
            this.setStyle(object == null ? null : String.valueOf(object));
        } else if (n == -164750818) {
            this.setThemeElementName((String)object);
        } else if (n == 1659243607) {
            this.setThemeElementParentType((String)object);
        } else if (n == 2009226786) {
            this.setNonBlocking(Bw.l(object));
        } else if (n == 87587760) {
            this.setCursorType((fzo_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public fhi_2 getNewElement(String string, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        fhi_2 fhi_22 = super.getNewElement(string, fhv_12, stack, fhu_12);
        if (fhi_22 instanceof fys_0 && this.uki != null) {
            fhi_22.aZp();
            fhi_22 = this.getAppearance();
        }
        return fhi_22;
    }

    @Override
    public void b(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        fzb_0 fzb_02 = this.getLazyLoadingMode();
        if (fzb_02.tGC && !this.isVisible()) {
            Runnable runnable = () -> super.b(apd_12, fhv_12, stack, fhu_12);
            fes_2 fes_22 = this;
            this.setVisibilityChangePreExecutor(new fev_1(this, fzb_02, fes_22, runnable));
        } else {
            super.b(apd_12, fhv_12, stack, fhu_12);
        }
    }
}

