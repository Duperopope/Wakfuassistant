/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLCapabilities
 *  com.jogamp.opengl.GLCapabilitiesImmutable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.util.FPSAnimator
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.BackingStoreManager
 *  com.jogamp.opengl.util.packrect.Rect
 *  com.jogamp.opengl.util.packrect.RectVisitor
 *  com.jogamp.opengl.util.packrect.RectanglePacker
 *  jogamp.opengl.Debug
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLCapabilitiesImmutable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.BackingStoreManager;
import com.jogamp.opengl.util.packrect.Rect;
import com.jogamp.opengl.util.packrect.RectVisitor;
import com.jogamp.opengl.util.packrect.RectanglePacker;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Rectangle2D;
import java.nio.Buffer;
import java.util.ArrayList;
import jogamp.opengl.Debug;

/*
 * Renamed from avU
 */
public class avu_2
extends awx_1 {
    static final boolean diu = Debug.debug((String)"jogl.debug.TextRenderer");
    private static final boolean div = false;
    private static final long diw = 10000L;
    static final int dix = 256;
    static final int diy = 128;
    private static final int diz = 1000;
    private static final float diA = 0.7f;
    static final int diB = 100;
    static final int diC = 3;
    static final int diD = 2;
    static final int diE = 4;
    static final int diF = 400;
    static final int diG = 1200;
    static final int diH = 800;
    static final int diI = 4800;
    static final int diJ = 3200;
    static final int diK = 12;
    static final int diL = 8;
    final Font diM;
    private final boolean diN;
    private final boolean diO;
    private final int diP;
    private final int diQ;
    long diR = 0L;
    avn_2 diS;
    boolean diT;
    RectanglePacker diU;
    private boolean diV;
    final aww_1 diW;
    private TextureRenderer diX;
    private Graphics2D diY;
    private FontRenderContext diZ;
    final awb_2 dja;
    private int djb;
    float aAx;
    float aAy;
    private Frame djc;
    private boolean djd;
    awe_1 dje;
    boolean djf = true;
    boolean djg;
    private boolean djh;
    boolean dji = true;
    private final awc_2 djj;
    static final VertexBufferPCT djk;
    static final float[] djl;

    public avu_2(Font font, boolean bl, boolean bl2, int n, int n2) {
        this(font, bl, bl2, null, false, n, n2);
    }

    public avu_2(Font font, boolean bl, boolean bl2, aww_1 aww_12, int n, int n2) {
        this(font, bl, bl2, aww_12, false, n, n2);
    }

    public avu_2(Font font, boolean bl, boolean bl2, aww_1 aww_12, boolean bl3, int n, int n2) {
        this.diM = font;
        this.diN = bl;
        this.diO = bl2;
        this.diT = bl3;
        this.diP = n;
        this.diQ = n2;
        this.diU = new RectanglePacker((BackingStoreManager)new awd_1(this), 256, 128);
        if (aww_12 == null) {
            aww_12 = new awg_2();
        }
        this.diW = aww_12;
        this.dja = new awb_2(this);
        this.djj = awc_2.bOR();
    }

    public Rectangle2D gq(String string) {
        return this.a(string);
    }

    public Rectangle2D a(CharSequence charSequence) {
        return this.b(this.diW.a(charSequence, this.diM, this.bNE()));
    }

    public FontRenderContext bNE() {
        if (this.diZ == null) {
            this.diZ = this.bNG().getFontRenderContext();
        }
        return this.diZ;
    }

    @Override
    public void cd(int n, int n2) {
        this.bb(-n / 2, -n2 / 2);
    }

    @Override
    public void bNA() {
        this.bb(0.0f, 0.0f);
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        this.bNF().setColor(1.0f, 1.0f, 1.0f, 1.0f);
        avu_2.djl[0] = f2 * f5;
        avu_2.djl[1] = f3 * f5;
        avu_2.djl[2] = f4 * f5;
        avu_2.djl[3] = f5;
    }

    public void aKY() {
        this.bNJ();
    }

    @Override
    public void bNz() {
        this.bNH();
    }

    @Override
    public void bNB() {
        this.bNH();
    }

    public void bpI() {
        this.diU.dispose();
        this.diU = null;
        this.diX = null;
        this.diY = null;
        this.diZ = null;
        if (this.djc != null) {
            this.djc.dispose();
        }
    }

    static Rectangle2D a(Rectangle2D rectangle2D) {
        int n = (int)Math.floor(rectangle2D.getMinX()) - 1;
        int n2 = (int)Math.floor(rectangle2D.getMinY()) - 1;
        int n3 = (int)Math.ceil(rectangle2D.getMaxX()) + 1;
        int n4 = (int)Math.ceil(rectangle2D.getMaxY()) + 1;
        return new Rectangle2D.Double(n, n2, n3 - n, n4 - n2);
    }

    Rectangle2D b(Rectangle2D rectangle2D) {
        int n = (int)Math.max(1.0, 0.015 * (double)this.diM.getSize());
        return new Rectangle2D.Double((int)Math.floor(rectangle2D.getMinX() - (double)n), (int)Math.floor(rectangle2D.getMinY() - (double)n), (int)Math.ceil(rectangle2D.getWidth() + (double)(2 * n)), (int)Math.ceil(rectangle2D.getHeight()) + 2 * n);
    }

    TextureRenderer bNF() {
        TextureRenderer textureRenderer = (TextureRenderer)this.diU.getBackingStore();
        if (textureRenderer != this.diX) {
            if (this.diY != null) {
                this.diY.dispose();
                this.diY = null;
                this.diZ = null;
            }
            this.diX = textureRenderer;
        }
        return this.diX;
    }

    Graphics2D bNG() {
        TextureRenderer textureRenderer = this.bNF();
        if (this.diY == null) {
            this.diY = textureRenderer.createGraphics();
            this.diY.setComposite(AlphaComposite.Src);
            this.diY.setColor(Color.WHITE);
            this.diY.setFont(this.diM);
            this.diY.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.diN ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            this.diY.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, this.diO ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        }
        return this.diY;
    }

    private void bb(float f2, float f3) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        this.diR = System.currentTimeMillis();
        if (diu && !this.djd) {
            this.l((GL)gL2);
        }
        this.aAx = f2;
        this.aAy = f3;
        atg_22.dbl.uu(13);
        ava_2.bMH().a(auw_2.dfL, auw_2.dfM);
        ava_2.bMH().h(gL2);
        this.bNF().begin3DRendering();
        if (!this.diV) {
            int[] nArray = new int[1];
            gL2.glGetIntegerv(3379, nArray, 0);
            this.diU.setMaxSize(nArray[0], nArray[0]);
            this.diV = true;
        }
        if (this.diT && !this.bNF().isUsingAutoMipmapGeneration()) {
            if (diu) {
                System.err.println("Disabled mipmapping in TextRenderer");
            }
            this.diT = false;
        }
    }

    private void bNH() {
        this.bNJ();
        this.bNF().end3DRendering();
        if (++this.djb >= 1000) {
            this.djb = 0;
            if (diu) {
                System.err.println("Clearing unused entries in endRendering()");
            }
            this.bNI();
        }
    }

    void bNI() {
        ArrayList arrayList = new ArrayList();
        this.diU.visit((RectVisitor)new avv_2(this, arrayList));
        for (Rect rect : arrayList) {
            this.diU.remove(rect);
            String string = ((awf_1)rect.getUserData()).bNV();
            if (string == null) continue;
            this.dja.gr(string);
        }
        float f2 = this.diU.verticalFragmentationRatio();
        if (!arrayList.isEmpty() && f2 > 0.7f) {
            if (diu) {
                System.err.println("Compacting TextRenderer backing store due to vertical fragmentation " + f2);
            }
            this.diU.compact();
        }
        if (diu) {
            this.bNF().markDirty(0, 0, this.bNF().getWidth(), this.bNF().getHeight());
        }
    }

    private void bNJ() {
        if (this.dje != null) {
            this.dje.bNS();
        }
    }

    private void l(GL gL) {
        this.djc = new Frame("TextRenderer Debug Output");
        GLCanvas gLCanvas = new GLCanvas((GLCapabilitiesImmutable)new GLCapabilities(GLProfile.getDefault()));
        gLCanvas.addGLEventListener((GLEventListener)new avy_2(this, this.djc, gLCanvas));
        this.djc.add((Component)gLCanvas);
        FPSAnimator fPSAnimator = new FPSAnimator((GLAutoDrawable)gLCanvas, 10);
        this.djc.addWindowListener(new avw_2(this, fPSAnimator));
        this.djc.setSize(256, 128);
        this.djc.setVisible(true);
        fPSAnimator.start();
        this.djd = true;
    }

    public void dh(boolean bl) {
        this.djf = bl;
    }

    public final boolean bNK() {
        return this.djf;
    }

    public void di(boolean bl) {
        this.dji = bl;
        this.bNF().setSmoothing(bl);
    }

    public boolean bNL() {
        return this.dji;
    }

    boolean m(GL gL) {
        if (!this.djh) {
            this.djg = gL.isExtensionAvailable("GL_VERSION_1_5");
            this.djh = true;
        }
        return this.djg;
    }

    @Override
    public String bNu() {
        if (this.diM == null) {
            return null;
        }
        String string = this.diM.isBold() ? (this.diM.isItalic() ? "bolditalic" : "bold") : (this.diM.isItalic() ? "italic" : "plain");
        return this.diM.getFamily() + "-" + string + "-" + this.diM.getSize();
    }

    @Override
    public int bNv() {
        int n = 0;
        if (this.diM.isBold()) {
            n |= 1;
        }
        if (this.diM.isItalic()) {
            n |= 2;
        }
        return n;
    }

    @Override
    public awh_2 getFont() {
        if (this.diM == null) {
            return null;
        }
        this.bNM();
        return this.diS;
    }

    public void bNM() {
        if (this.diS == null) {
            this.diS = new avn_2(this.diM, true, this.bNj());
            this.diS.cc(this.diP, this.diQ);
        }
    }

    @Override
    public awh_2 b(int n, float f2) {
        if (this.diM == null) {
            return null;
        }
        Font font = this.diM.deriveFont(n, f2);
        return new avn_2(font, true, awl_2.dkI);
    }

    @Override
    public int e(char c2) {
        FontRenderContext fontRenderContext = this.bNE();
        Rectangle2D rectangle2D = this.diM.getStringBounds(String.valueOf(c2), fontRenderContext);
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int f(char c2) {
        return this.e(c2);
    }

    @Override
    public int g(char c2) {
        FontRenderContext fontRenderContext = this.bNE();
        Rectangle2D rectangle2D = this.diM.getStringBounds(String.valueOf(c2), fontRenderContext);
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int bNw() {
        FontRenderContext fontRenderContext = this.bNE();
        Rectangle2D rectangle2D = this.diM.getMaxCharBounds(fontRenderContext);
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int bNx() {
        FontRenderContext fontRenderContext = this.bNE();
        Rectangle2D rectangle2D = this.diM.getMaxCharBounds(fontRenderContext);
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int e(String string, int n, int n2) {
        for (int i = Math.min(string.length() - 1, n - 1); i >= 0; --i) {
            if (this.gj(string.substring(0, i + 1)) > n2) continue;
            return i + 1;
        }
        return 0;
    }

    @Override
    public int gj(String string) {
        Rectangle2D rectangle2D = this.diM.getStringBounds(string, this.bNE());
        return (int)rectangle2D.getWidth();
    }

    @Override
    public int gk(String string) {
        Rectangle2D rectangle2D = this.diM.getStringBounds(string, this.bNE());
        return (int)rectangle2D.getHeight();
    }

    @Override
    public int gp(String string) {
        LineMetrics lineMetrics = this.diM.getLineMetrics(string, this.bNE());
        return (int)Math.ceil(lineMetrics.getDescent());
    }

    @Override
    public boolean bNy() {
        return false;
    }

    @Override
    public void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4) {
        this.a(cArray, f2, n, f3, f4, 0.0f);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        int n2;
        if (this.diS == null) {
            return;
        }
        float f6 = f2;
        float f7 = f3;
        f6 += this.aAx - (float)this.diW.bND();
        f7 += this.aAy;
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        djk.bIH();
        int n3 = Math.min(cArray.length, n);
        for (n2 = 0; n2 < n3; ++n2) {
            int n4 = 1;
            while (n2 + n4 < n3 && this.djj.h(cArray[n2 + n4])) {
                ++n4;
            }
            String string = new String(cArray, n2, n4);
            awa_2 awa_22 = this.dja.gs(string);
            if (awa_22 == null) continue;
            if (string.equals(" ")) {
                f6 += (awa_22.bNO() + f5) * f4;
                continue;
            }
            awa_22.r(f6, f7, 0.0f, f4);
            f6 += awa_22.bNO() * f4;
            n2 += n4 - 1;
        }
        djk.bIi();
        n2 = djk.bIF();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)djk.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)djk.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)djk.bIA());
        gL2.glDrawArrays(7, 0, n2);
    }

    static {
        djl = new float[4];
        int n = 4096;
        djk = VertexBufferPCT.cWa.ue(4096);
    }
}

