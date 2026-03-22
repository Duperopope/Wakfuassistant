/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDz
 */
public abstract class fdz_1
extends fes_2
implements fgt_2,
fzc {
    public static final String ugF = "text";
    private static final double ugG = 0.001;
    public static final String ugH = "textWidget";
    private fgx_1 ugI;
    protected Entity3D ugJ;
    protected boolean ugK = true;
    protected String ugL = null;
    private static final ach_1 ugM = new ach_1();
    private final ArrayList<fdc_2> ugN = new ArrayList();
    private float aXn;
    private float ugO;
    private boolean ugP = false;
    private boolean ugQ = false;
    public static final int ugR = 92903173;
    public static final int ugS = -1249482096;
    public static final int ugT = 3148879;
    public static final int ugU = 48371712;
    public static final int ugV = -919628796;
    public static final int ugW = 1307418143;
    public static final int ugX = -1326227699;
    public static final int ugY = 400381634;
    public static final int ugZ = -1375815020;
    public static final int uha = -467842239;
    public static final int uhb = 139285235;
    public static final int uhc = 2068626633;
    public static final int uhd = -1206239059;
    public static final int uhe = 390232059;
    public static final int uhf = -515807685;
    public static final int uhg = -1439500848;
    public static final int uhh = 3556653;
    public static final int uhi = -1852365066;
    public static final int uhj = 1153931755;
    public static final int uhk = -1152148181;
    public static final int uhl = 3744723;
    public static final int uhm = 1913333550;

    public void a(fdc_2 fdc_22) {
        if (!this.ugN.contains(fdc_22)) {
            this.ugN.add(fdc_22);
        }
    }

    public void b(fdc_2 fdc_22) {
        if (this.ugN.contains(fdc_22)) {
            this.ugN.remove(fdc_22);
        }
    }

    public boolean a(fga_2 fga_22) {
        return this.ugI.a(fga_22);
    }

    public boolean b(fga_2 fga_22) {
        return this.ugI.b(fga_22);
    }

    public void guV() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        gLTextGeometry.va(-1L);
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.ugJ);
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    public fgx_1 getTextBuilder() {
        return this.ugI;
    }

    protected void setTextBuilder(fgx_1 fgx_12) {
        this.ugI = fgx_12;
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        gLTextGeometry.setTextBuilder(fgx_12);
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        gLTextGeometry.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        return gLTextGeometry.getModulationColor();
    }

    @Override
    public String getText() {
        return this.ugI.gyi();
    }

    public boolean isTextReduced() {
        return this.ugI.isTextReduced();
    }

    @NotNull
    protected String bb(@Nullable Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof Number) {
            if (object instanceof Double || object instanceof Float) {
                return My.aUV().w(((Number)object).doubleValue());
            }
            return My.aUV().cQ(((Number)object).longValue());
        }
        return String.valueOf(object);
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        String string = this.bb(object);
        if (this.ugL != null || !this.ugI.tY(string)) {
            this.ugL = string;
            this.setNeedsToPreProcess();
        }
        return this.ugL;
    }

    public void setZoomTween(float f2, int n) {
        this.x(fdb_1.class);
        this.a(new fdb_1(Float.valueOf(this.aXn), Float.valueOf(f2), this, 0, n, abn.cdr));
    }

    public void setTextImmediate(String string) {
        this.setText(string);
        this.guF();
    }

    @Override
    public void setBrightenColor(boolean bl) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        gLTextGeometry.setBrightenColor(bl);
    }

    @Override
    public boolean isBrightenColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        return gLTextGeometry.isBrightenColor();
    }

    @Override
    public void setDarkenColor(boolean bl) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        gLTextGeometry.setDarkenColor(bl);
    }

    @Override
    public boolean isDarkenColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.ugJ.uh(0);
        return gLTextGeometry.isDarkenColor();
    }

    @Override
    public void setUseHighContrast(boolean bl) {
        this.ugI.setUseHighContrast(bl);
    }

    @Override
    public boolean isUseHighContrast() {
        return this.ugI.isUseHighContrast();
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase(ugF)) {
            this.ugI.C(axb_22);
        }
    }

    @Override
    public boolean isEnableAutoZoomShrink() {
        return this.ugP;
    }

    @Override
    public void setEnableAutoZoomShrink(boolean bl) {
        this.ugP = bl;
        this.ugQ = true;
    }

    @Override
    public void setAlign(faa_2 faa_22) {
        if (faa_22.grT()) {
            this.setVerticalAlignment(fzY.tLv);
        } else if (faa_22.grU()) {
            this.setVerticalAlignment(fzY.tLw);
        } else {
            this.setVerticalAlignment(fzY.tLz);
        }
        if (faa_22.grV()) {
            this.setHorizontalAlignment(fzY.tLy);
        } else if (faa_22.grW()) {
            this.setHorizontalAlignment(fzY.tLx);
        } else {
            this.setHorizontalAlignment(fzY.tLz);
        }
    }

    @Override
    public void setHorizontalAlignment(fzY fzY2) {
        this.ugI.a(fzY2);
    }

    @Override
    public void setVerticalAlignment(fzY fzY2) {
        this.ugI.setVerticalAlignment(fzY2);
    }

    @Override
    public void setOrientation(fzu_0 fzu_02) {
        this.ugI.setOrientation(fzu_02);
        this.ugK = true;
        this.setNeedsToPostProcess();
    }

    @Override
    public fzu_0 getOrientation() {
        return this.ugI.getOrientation();
    }

    public boolean isEnableAWTFont() {
        return this.getTextBuilder().gyh().isEnableAWTFont();
    }

    public void setEnableAWTFont(boolean bl) {
        this.getTextBuilder().gyh().setEnableAWTFont(bl);
    }

    @Override
    public void setMultiline(boolean bl) {
        this.ugI.setMultiline(bl);
    }

    @Override
    public boolean isMultiline() {
        return this.ugI.isMultiline();
    }

    @Override
    public void setMaxLines(int n) {
        this.ugI.setMaxLines(n);
    }

    @Override
    public int getMaxLines() {
        return this.ugI.getMaxLines();
    }

    @Override
    public void setLineHeight(int n) {
        this.ugI.setLineHeight(n);
    }

    @Override
    public int getLineHeight() {
        return this.ugI.getLineHeight();
    }

    @Override
    public void setEnableShrinking(boolean bl) {
        this.ugI.setEnableShrinking(bl);
    }

    @Override
    public boolean isEnableShrinking() {
        return this.ugI.isEnableShrinking();
    }

    @Override
    public void setMinWidth(int n) {
        this.ugI.setMinWidth(n);
    }

    @Override
    public int getMinWidth() {
        return this.ugI.getMinWidth();
    }

    @Override
    public void setMaxWidth(int n) {
        this.ugI.setMaxWidth(n);
    }

    @Override
    public int getMaxWidth() {
        return this.ugI.getMaxWidth();
    }

    @Override
    public void setInheritParentWidth(boolean bl) {
        this.ugI.oO(bl);
    }

    @Override
    public boolean isInheritParentWidth() {
        return this.ugI.gyo();
    }

    @Override
    public void setUseParentMaxWidth(boolean bl) {
        this.ugI.oP(bl);
    }

    @Override
    public boolean isUseParentMaxWidth() {
        return this.ugI.gyp();
    }

    @Override
    public void setMinSizeComputationBehaviour(fzk_0 fzk_02) {
        this.ugI.setMinSizeComputationBehaviour(fzk_02);
    }

    @Override
    public fzk_0 getMinSizeComputationBehaviour() {
        return this.ugI.getMinSizeComputationBehaviour();
    }

    @Override
    public void setFont(awx_1 awx_12) {
        this.ugI.a(awx_12);
    }

    @Override
    public void setSize(int n, int n2) {
        super.setSize(n, n2);
        fsm_1 fsm_12 = this.uki.getContentSize();
        if (this.ugP) {
            fsm_1 fsm_13 = this.ugI.gyx();
            float f2 = Math.min((float)Math.min(fsm_12.width, this.ugI.gyN()) / (float)fsm_13.width, (float)fsm_12.height / (float)fsm_13.height);
            if (f2 < 1.0f && (double)Math.abs(this.ugO - f2) > 0.001) {
                this.ugO = f2;
                this.setNeedsToPostProcess();
            } else if (f2 >= 1.0f && (double)Math.abs(this.ugO - 1.0f) > 0.001) {
                this.ugO = 1.0f;
                this.setNeedsToPostProcess();
            }
        }
        float f3 = this.getAppliedZoom();
        this.ugI.setSize((int)Math.ceil((float)fsm_12.width / f3), (int)Math.ceil((float)fsm_12.height / f3));
    }

    public float getAppliedZoom() {
        return this.aXn != 1.0f ? this.aXn : this.ugO;
    }

    @Override
    public void setZoom(float f2) {
        this.aXn = f2;
        if (this.uko != null) {
            this.uko.gsm();
        }
        this.setNeedsToPostProcess();
    }

    @Override
    public fsm_1 getContentMinSize() {
        fsm_1 fsm_12 = this.ugI.getMinSize();
        fsm_12.setWidth((int)((float)fsm_12.width * this.aXn));
        fsm_12.setHeight((int)((float)fsm_12.height * this.aXn));
        return fsm_12;
    }

    @Override
    public void setDisplayCharDelay(long l) {
        this.ugI.vd(l);
    }

    @Override
    public boolean isJustify() {
        return this.ugI.isJustify();
    }

    @Override
    public void setJustify(boolean bl) {
        this.ugI.setJustify(bl);
    }

    protected void guF() {
        if (this.ugL != null) {
            this.ugI.tZ(this.ugL);
            this.guW();
            this.ugL = null;
        }
    }

    public void guW() {
        ((GLTextGeometry)this.ugJ.uh(0)).gwC();
    }

    @Override
    public void grg() {
        super.grg();
        if (this.ugI.gyz()) {
            this.ugI.cUN();
        }
        if (this.ugI.gyA()) {
            this.ugI.gyP();
        }
    }

    @Override
    public void bFM() {
        super.bFM();
        this.ugK = true;
        this.setNeedsToPostProcess();
    }

    @Override
    public boolean LZ(int n) {
        this.guF();
        if (this.ugI.gyy()) {
            this.ugI.gyO();
            this.ugK = true;
            this.setNeedsToPostProcess();
            if (this.uko != null) {
                this.uko.gsm();
            }
        }
        return super.LZ(n);
    }

    @Override
    public boolean aaB(int n) {
        boolean bl = super.aaB(n);
        if (this.ugI.gyz() || this.ugI.gyA()) {
            this.bFM();
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (!this.ugK) {
            return bl;
        }
        fsm_1 fsm_12 = this.ugI.getSize();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        switch (this.getOrientation()) {
            case tKC: {
                f2 = this.uki.getLeftInset() + fsm_12.width;
                f3 = this.uki.getBottomInset();
                f4 = 1.5707964f;
                break;
            }
            case tKE: {
                f2 = this.uki.getLeftInset();
                f3 = this.uki.getBottomInset();
                f4 = 0.0f;
                break;
            }
            case tKD: {
                f2 = this.uki.getLeftInset();
                f3 = this.uki.getBottomInset() + fsm_12.height;
                f4 = -1.5707964f;
                break;
            }
            case tKF: {
                f2 = this.uki.getLeftInset();
                f3 = this.uki.getBottomInset() + fsm_12.height;
                f4 = (float)Math.PI;
                break;
            }
            default: {
                assert (false) : "We should never end here";
                break;
            }
        }
        float f5 = this.getAppliedZoom();
        this.ugJ.bIS().e(0, f5, f5);
        awp_1 awp_12 = (awp_1)this.ugJ.bIS().uW(1);
        awp_12.A(f2, f3, 0.0f);
        ugM.a(acp_1.dAW, f4);
        awp_12.a(ugM);
        this.ugJ.bIS().b(1, awp_12);
        this.ugK = false;
        return bl;
    }

    public void eUJ() {
        for (int i = this.ugN.size() - 1; i >= 0; --i) {
            this.ugN.get(i).eUJ();
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.ugI != null) {
            this.ugI.clean();
            this.ugI = null;
        }
        this.ugN.clear();
        this.ugJ.a((avc_2)null);
        this.ugJ.b((avc_2)null);
        this.ugJ.bsI();
        this.ugJ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        assert (this.ugJ == null);
        this.ugJ = (Entity3D)Entity3D.cXb.bSK();
        awp_1 awp_12 = new awp_1();
        awp_12.bPx();
        this.ugJ.bIS().a(awp_12);
        awp_12 = new awp_1();
        awp_12.bPx();
        this.ugJ.bIS().a(awp_12);
        GLTextGeometry gLTextGeometry = (GLTextGeometry)GLTextGeometry.uqC.bSK();
        this.ugJ.b(gLTextGeometry);
        gLTextGeometry.bsI();
        this.aXn = 1.0f;
        this.ugO = 1.0f;
        this.ugP = false;
        this.ugQ = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdz_1 fdz_12 = (fdz_1)fhi_22;
        super.a(fdz_12);
        fdz_12.setText(this.ugI.gyi());
        if (this.ugL != null) {
            fdz_12.ugL = this.ugL;
        }
        fdz_12.setJustify(this.isJustify());
        fdz_12.setMaxWidth(this.getMaxWidth());
        fdz_12.setMinWidth(this.getMinWidth());
        fdz_12.setEnableShrinking(this.gxK());
        fdz_12.setMultiline(this.gxI());
        fdz_12.setMaxLines(this.getMaxLines());
        fdz_12.setLineHeight(this.getLineHeight());
        fdz_12.setOrientation(this.getOrientation());
        fdz_12.setUseHighContrast(this.getUseHighContrast());
        fdz_12.setBrightenColor(this.gxG());
        fdz_12.setDarkenColor(this.gxH());
        fdz_12.setZoom(this.aXn);
        if (this.ugQ) {
            fdz_12.setEnableAutoZoomShrink(this.ugP);
        }
        fdz_12.setEnableAWTFont(this.isEnableAWTFont());
    }

    @Override
    public String toString() {
        return super.toString() + (String)(this.ugI != null ? " : " + this.getText() : "");
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == -1249482096) {
            this.setJustify(Bw.aK(string));
        } else if (n == 3148879) {
            this.setFont(fic_12.vq(string));
        } else if (n == 1307418143) {
            this.setHorizontalAlignment(fzY.tG(string));
        } else if (n == 48371712) {
            this.setBrightenColor(Bw.aK(string));
        } else if (n == -919628796) {
            this.setDarkenColor(Bw.aK(string));
        } else if (n == -1326227699) {
            this.setVerticalAlignment(fzY.tG(string));
        } else if (n == 400381634) {
            this.setMaxWidth(Bw.m(string));
        } else if (n == -1375815020) {
            this.setMinWidth(Bw.m(string));
        } else if (n == -1206239059) {
            this.setMultiline(Bw.aK(string));
        } else if (n == 390232059) {
            this.setMaxLines(Bw.m(string));
        } else if (n == -515807685) {
            this.setLineHeight(Bw.m(string));
        } else if (n == -467842239) {
            this.setInheritParentWidth(Bw.aK(string));
        } else if (n == 139285235) {
            this.setUseParentMaxWidth(Bw.aK(string));
        } else if (n == 2068626633) {
            this.setMinSizeComputationBehaviour(fic_12.b(fzk_0.class, string));
        } else if (n == -1439500848) {
            this.setOrientation(fzu_0.tC(string));
        } else if (n == 3556653) {
            this.setText(fic_12.a(string, this.nQt));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Bw.aK(string));
        } else if (n == -1852365066) {
            this.setEnableShrinking(Bw.aK(string));
        } else if (n == 3744723) {
            this.setZoom(Bw.o(string));
        } else if (n == -1152148181) {
            this.setDisplayCharDelay(Bw.p(string));
        } else if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.setText(object);
        } else if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == -1249482096) {
            this.setJustify(Bw.l(object));
        } else if (n == 3148879) {
            this.setFont((awm_2)object);
        } else if (n == 48371712) {
            this.setBrightenColor(Bw.l(object));
        } else if (n == -919628796) {
            this.setDarkenColor(Bw.l(object));
        } else if (n == 1307418143) {
            this.setHorizontalAlignment((fzY)((Object)object));
        } else if (n == -1326227699) {
            this.setVerticalAlignment((fzY)((Object)object));
        } else if (n == 400381634) {
            this.setMaxWidth(Bw.m(object));
        } else if (n == -1375815020) {
            this.setMinWidth(Bw.m(object));
        } else if (n == -467842239) {
            this.setInheritParentWidth(Bw.l(object));
        } else if (n == 139285235) {
            this.setUseParentMaxWidth(Bw.l(object));
        } else if (n == 2068626633) {
            this.setMinSizeComputationBehaviour((fzk_0)((Object)object));
        } else if (n == -1206239059) {
            this.setMultiline(Bw.l(object));
        } else if (n == 390232059) {
            this.setMaxLines(Bw.m(object));
        } else if (n == -515807685) {
            this.setLineHeight(Bw.m(object));
        } else if (n == -1439500848) {
            this.setOrientation((fzu_0)((Object)object));
        } else if (n == -1852365066) {
            this.setEnableShrinking(Bw.l(object));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Bw.l(object));
        } else if (n == 3744723) {
            this.setZoom(Bw.o(object));
        } else if (n == -1152148181) {
            this.setDisplayCharDelay(Bw.p(object));
        } else if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

