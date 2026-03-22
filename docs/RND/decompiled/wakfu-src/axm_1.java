/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.GLPipelineFactory
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.awt.AWTGLReadBufferUtil
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLPipelineFactory;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.awt.AWTGLReadBufferUtil;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from axM
 */
public class axm_1
implements GLEventListener,
FocusListener,
KeyListener,
MouseListener,
MouseMotionListener,
MouseWheelListener {
    public static final long dqK = 2L;
    public static final long dqL = 20L;
    public static boolean dqM = false;
    public static boolean dqN = false;
    public static PrintStream dqO = null;
    protected static final Logger dqP = Logger.getLogger(axm_1.class);
    private static final boolean dqQ = ady_1.bYZ() == ady_1.dEC;
    public static final Color dqR = Color.BLACK;
    private float dqS;
    private float dqT;
    private float dqU;
    private float dqV;
    private final Object dqW = new Object();
    private final List<axu_1> dqX = new ArrayList<axu_1>();
    private final Object dqY = new Object();
    private final List<axu_1> dqZ = new ArrayList<axu_1>();
    private final ArrayList<aba_1> dra;
    private final ArrayList<abz_1> drb;
    private final ArrayList<aby_1> drc;
    private final ArrayList<axn_1> drd;
    private final ArrayList<axp_1> dre;
    private final HashMap<String, String> drf = new HashMap();
    private boolean drg;
    private boolean drh = true;
    private boolean dri = !this.drh;
    private long drj = System.nanoTime();
    private int drk;
    private final float[] drl = new float[180];
    private boolean drm;
    private axo_1 drn;
    private int dro;
    private int drp;
    private final List<axl_1> drq = new ArrayList<axl_1>();
    private boolean bXs;
    private boolean drr;
    private boolean drs;
    private boolean drt;
    private float dru = 1.0f;
    private float drv = 1.0f;

    public axm_1() {
        this.a(dqR);
        this.dra = new ArrayList();
        this.drb = new ArrayList();
        this.drc = new ArrayList();
        this.drg = true;
        this.dri = true;
        this.dre = new ArrayList();
        this.drd = new ArrayList();
    }

    public void bf(float f2, float f3) {
        this.dru = f2;
        this.drv = f3;
    }

    public float bRb() {
        return this.dru;
    }

    public float bRc() {
        return this.drv;
    }

    public void W(float ... fArray) {
        this.dqS = fArray[0];
        this.dqT = fArray[1];
        this.dqU = fArray[2];
        this.dqV = fArray[3];
    }

    public void a(Color color) {
        this.dqS = (float)color.getRed() / 255.0f;
        this.dqT = (float)color.getGreen() / 255.0f;
        this.dqU = (float)color.getBlue() / 255.0f;
        this.dqV = (float)color.getAlpha() / 255.0f;
    }

    public void dq(boolean bl) {
        this.drr = bl;
    }

    public void dr(boolean bl) {
        this.drs = bl;
    }

    public boolean bRd() {
        return this.drt;
    }

    public void ds(boolean bl) {
        this.drt = bl;
    }

    private void a(GLAutoDrawable gLAutoDrawable, boolean bl) {
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        if (this.dri == bl) {
            return;
        }
        this.dri = bl;
        if (this.dri) {
            gLAutoDrawable.setAutoSwapBufferMode(true);
            gL2.setSwapInterval(1);
        } else {
            gLAutoDrawable.setAutoSwapBufferMode(false);
            gL2.setSwapInterval(0);
        }
        for (axp_1 axp_12 : this.dre) {
            axp_12.cl(bl);
        }
    }

    public void dt(boolean bl) {
        this.drh = bl;
        this.dri = !this.drh;
    }

    public final boolean bRe() {
        return this.dri;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(axu_1 axu_12, boolean bl) {
        Object object = this.dqW;
        synchronized (object) {
            Object object2 = this.dqY;
            synchronized (object2) {
                if (this.dqX.contains(axu_12)) {
                    return;
                }
                if (bl) {
                    this.dqX.add(axu_12);
                    this.dqZ.add(axu_12);
                } else {
                    this.dqX.add(0, axu_12);
                    this.dqZ.add(0, axu_12);
                }
            }
        }
    }

    public void a(axu_1 axu_12) {
        this.dqX.remove(axu_12);
    }

    public void a(axn_1 axn_12) {
        if (this.drd.contains(axn_12)) {
            return;
        }
        this.drd.add(axn_12);
    }

    public void b(axn_1 axn_12) {
        this.drd.remove(axn_12);
    }

    public void a(axp_1 axp_12) {
        if (this.dre.contains(axp_12)) {
            return;
        }
        this.dre.add(axp_12);
    }

    public void b(axp_1 axp_12) {
        this.dre.remove(axp_12);
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
        dqP.info((Object)"Renderer.init started");
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        if (dqN) {
            gL2 = gLAutoDrawable.setGL(GLPipelineFactory.create((String)"com.jogamp.opengl.Debug", null, (GL)gL2, null)).getGL2();
        }
        if (dqO != null) {
            gL2 = gLAutoDrawable.setGL(GLPipelineFactory.create((String)"com.jogamp.opengl.Trace", null, (GL)gL2, (Object[])new Object[]{dqO})).getGL2();
        }
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.d(gL2);
        axj_1.o((GL)gL2);
        axj_1.a((GL)gL2, this.drf);
        ava_2 ava_22 = ava_2.bMH();
        ava_22.bMI();
        gL2.glClearColor(this.dqS, this.dqT, this.dqU, this.dqV);
        avd_2.bMO().j((GL)gL2);
        ava_22.a((GL)gL2, 0, 0, gLAutoDrawable.getSurfaceWidth(), gLAutoDrawable.getSurfaceHeight());
        gL2.glTexParameterf(3553, 10242, 33071.0f);
        gL2.glTexParameterf(3553, 10243, 33071.0f);
        gL2.glTexParameterf(3553, 10240, 9729.0f);
        gL2.glTexParameterf(3553, 10241, 9728.0f);
        gL2.glHint(3152, 4354);
        gL2.glHint(34031, 4354);
        gL2.glHint(33170, 4354);
        gL2.glDisable(2896);
        ava_22.dc(false);
        ava_22.de(false);
        ava_22.df(false);
        gL2.glAlphaFunc(517, 0.0f);
        gL2.glEnable(3008);
        gL2.glDisable(2884);
        ava_22.cY(false);
        gL2.glShadeModel(7425);
        gL2.glPixelZoom(1.0f, 1.0f);
        ava_22.db(true);
        gL2.glIndexMask(0);
        gL2.glDisable(3024);
        gL2.glDrawBuffer(this.drg ? 1029 : 1028);
        this.a(gLAutoDrawable, this.drh);
        ava_22.h(gL2);
        for (axn_1 axn_12 : this.drd) {
            axn_12.b(gLAutoDrawable);
        }
        asy_2.bKX();
        this.bXs = true;
        dqP.info((Object)"Renderer.init ended");
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
    }

    public final HashMap<String, String> bRf() {
        return this.drf;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void display(GLAutoDrawable gLAutoDrawable) {
        GL2 gL2 = gLAutoDrawable.getGL().getGL2();
        this.bRg();
        if (!this.bXs) {
            return;
        }
        try {
            int n = this.bRh();
            this.c(gLAutoDrawable);
            atg_2 atg_22 = aru_2.cVG.bIv();
            Object object = this.dqW;
            synchronized (object) {
                this.a(gLAutoDrawable, this.drh);
                this.d(gLAutoDrawable);
                this.b(gL2, n);
                arq_1.bHF().aPc();
                awo_2.dlu.qF(n);
                awm_1.bPn().j(gL2);
                this.bRi();
                axm_1.k(gL2);
                axm_1.a(gL2, atg_22);
                this.l(gL2);
                awm_1.bPn().bPq();
                aro_2.bIf().b(atg_22);
                aum_2.b(atg_22);
                aum_2.bMy();
                this.bRj();
                this.e(gLAutoDrawable);
                ahu_1.cdi().cdB();
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Throwable dans le process du renderer : ", throwable);
        }
    }

    private void bRg() {
        long l;
        float f2;
        if (!(this.drr || this.drs && !dqM)) {
            return;
        }
        float f3 = this.drr ? 500.0f : 50.0f;
        if (f3 - (f2 = (float)((l = System.nanoTime()) - this.drj) / 1000000.0f) <= 0.0f) {
            return;
        }
        try {
            Thread.sleep(Math.round(f3));
        }
        catch (InterruptedException interruptedException) {
            dqP.error((Object)"Cannot wait in slowed downed mode", (Throwable)interruptedException);
        }
    }

    private int bRh() {
        long l = System.nanoTime();
        float f2 = (float)(l - this.drj) / 1000000.0f;
        int n = this.drl.length;
        this.drl[++this.drk % n] = f2;
        float f3 = 0.0f;
        for (int i = 0; i < n; ++i) {
            f3 += this.drl[i];
        }
        float f4 = f3 / (float)n;
        float f5 = f2 / f4;
        float f6 = f5 <= 2.0f ? f2 : f2 / 2.0f;
        this.drj = l;
        return Math.round(f6);
    }

    private void c(GLAutoDrawable gLAutoDrawable) {
        if (this.drd == null) {
            return;
        }
        int n = this.drd.size();
        for (int i = 0; i < n; ++i) {
            this.drd.get(i).a(gLAutoDrawable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(GLAutoDrawable gLAutoDrawable) {
        Object object = this.dqY;
        synchronized (object) {
            int n = gLAutoDrawable.getSurfaceWidth();
            n += n % 2;
            int n2 = gLAutoDrawable.getSurfaceHeight();
            n2 += n2 % 2;
            int n3 = this.dqZ.size();
            for (int i = 0; i < n3; ++i) {
                axu_1 axu_12 = this.dqZ.get(i);
                axu_12.init(gLAutoDrawable);
                axu_12.bb(n, n2);
            }
            this.dqZ.clear();
        }
    }

    private void b(GL2 gL2, int n) {
        aum_2.b("process", 0.0f, 0.2f, 0.2f);
        int n2 = this.dqX.size();
        for (int i = 0; i < n2; ++i) {
            this.dqX.get(i).qy(n);
        }
        aum_2.bIi();
    }

    private void bRi() {
        if (this.drq.isEmpty()) {
            return;
        }
        axl_1 axl_12 = this.drq.get(0);
        if (axl_12.bwM()) {
            return;
        }
        this.drq.remove(0);
    }

    private static void k(GL2 gL2) {
        ava_2 ava_22 = ava_2.bMH();
        ava_22.df(false);
        ava_22.de(false);
        ava_22.h(gL2);
    }

    private static void a(GL2 gL2, atg_2 atg_22) {
        if (ast_1.bJG().f(atg_22)) {
            return;
        }
        avd_2.bMO().j((GL)gL2);
    }

    private void l(GL2 gL2) {
        aum_2.b("display", 0.0f, 0.9f, 0.9f);
        int n = this.dqX.size();
        for (int i = 0; i < n; ++i) {
            this.dqX.get(i).b(gL2);
        }
        aum_2.bIi();
    }

    private void bRj() {
        if (!this.drm) {
            return;
        }
        this.bRk();
    }

    private void e(GLAutoDrawable gLAutoDrawable) {
        if (!this.drg || this.dri) {
            return;
        }
        gLAutoDrawable.swapBuffers();
    }

    public boolean a(@NotNull axo_1 axo_12) {
        if (this.drm || this.drn != null) {
            return false;
        }
        this.drm = true;
        this.drn = axo_12;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void bRk() {
        if (!this.drm || this.drn == null) {
            return;
        }
        File file = this.drn.bRn();
        try {
            AWTGLReadBufferUtil aWTGLReadBufferUtil = new AWTGLReadBufferUtil(GLProfile.getDefault(), true);
            atg_2 atg_22 = aru_2.cVG.bIv();
            GL2 gL2 = atg_22.bIq();
            BufferedImage bufferedImage = aWTGLReadBufferUtil.readPixelsToBufferedImage((GL)gL2, true);
            ImageIO.write((RenderedImage)bufferedImage, "png", file);
            this.drn.bRo();
        }
        catch (Exception exception) {
            this.drn.a(exception);
            dqP.error((Object)(exception.getMessage() + " Impossible d'enregistrer un ScreenShot dans " + file.getAbsolutePath()));
        }
        finally {
            this.drm = false;
            this.drn = null;
        }
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
        int n5 = n4 + n4 % 2;
        int n6 = n3 + n3 % 2;
        if (this.dro == n6 && this.drp == n5) {
            return;
        }
        this.dro = n6;
        this.drp = n5;
        if (gLAutoDrawable.getSurfaceWidth() != 0 && gLAutoDrawable.getSurfaceHeight() != 0) {
            for (axu_1 object : this.dqX) {
                object.bb(n6, n5);
            }
            aru_2.cVG.bIv().bX(n6, n5);
            ast_1.bJG().bY(n6, n5);
        }
        for (axn_1 axn_12 : this.drd) {
            axn_12.a(gLAutoDrawable, n, n2, n6, n5);
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        try {
            for (abz_1 abz_12 : this.drb) {
                if (!abz_12.a(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        try {
            for (abz_1 abz_12 : this.drb) {
                if (!abz_12.c(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        try {
            for (abz_1 abz_12 : this.drb) {
                if (!abz_12.b(keyEvent)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    public void a(abz_1 abz_12, boolean bl) {
        if (this.drb.contains(abz_12)) {
            return;
        }
        if (bl) {
            this.drb.add(0, abz_12);
        } else {
            this.drb.add(abz_12);
        }
    }

    public void a(abz_1 abz_12) {
        this.drb.remove(abz_12);
    }

    private static MouseEvent i(MouseEvent mouseEvent) {
        if (!dqQ) {
            return mouseEvent;
        }
        if (mouseEvent.getButton() != 1 || !mouseEvent.isControlDown()) {
            return mouseEvent;
        }
        int n = mouseEvent.getModifiersEx() ^ 0x80;
        return new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), n, mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), 3);
    }

    @NotNull
    private MouseEvent j(MouseEvent mouseEvent) {
        int n = (int)((float)mouseEvent.getX() * this.dru);
        int n2 = (int)((float)mouseEvent.getY() * this.drv);
        return new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), n, n2, mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
    }

    @NotNull
    private MouseWheelEvent b(MouseWheelEvent mouseWheelEvent) {
        int n = (int)((float)mouseWheelEvent.getX() * this.dru);
        int n2 = (int)((float)mouseWheelEvent.getY() * this.drv);
        return new MouseWheelEvent(mouseWheelEvent.getComponent(), mouseWheelEvent.getID(), mouseWheelEvent.getWhen(), mouseWheelEvent.getModifiersEx(), n, n2, mouseWheelEvent.getClickCount(), mouseWheelEvent.isPopupTrigger(), mouseWheelEvent.getScrollType(), mouseWheelEvent.getScrollAmount(), mouseWheelEvent.getWheelRotation());
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = axm_1.i(this.j(mouseEvent));
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.a(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = axm_1.i(this.j(mouseEvent));
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.b(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = axm_1.i(this.j(mouseEvent));
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.c(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.j(mouseEvent);
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.d(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.j(mouseEvent);
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.e(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = axm_1.i(this.j(mouseEvent));
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.f(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        try {
            MouseEvent mouseEvent2 = this.j(mouseEvent);
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.g(mouseEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        try {
            MouseWheelEvent mouseWheelEvent2 = this.b(mouseWheelEvent);
            for (aba_1 aba_12 : this.dra) {
                if (!aba_12.a(mouseWheelEvent2)) continue;
                return;
            }
        }
        catch (Throwable throwable) {
            dqP.error((Object)"Erreur : ", throwable);
        }
    }

    public void a(aba_1 aba_12, boolean bl) {
        if (this.dra.contains(aba_12)) {
            return;
        }
        if (bl) {
            this.dra.add(0, aba_12);
        } else {
            this.dra.add(aba_12);
        }
    }

    public void a(aba_1 aba_12) {
        this.dra.remove(aba_12);
    }

    public void du(boolean bl) {
        this.dri = bl;
    }

    public void dv(boolean bl) {
        this.drg = bl;
    }

    public void a(aby_1 aby_12, boolean bl) {
        if (this.drc.contains(aby_12)) {
            return;
        }
        if (bl) {
            this.drc.add(0, aby_12);
        } else {
            this.drc.add(aby_12);
        }
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        for (aby_1 aby_12 : this.drc) {
            if (!aby_12.a(focusEvent)) continue;
            return;
        }
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        for (aby_1 aby_12 : this.drc) {
            if (!aby_12.b(focusEvent)) continue;
            return;
        }
    }

    public int bRl() {
        return this.dro;
    }

    public int bRm() {
        return this.drp;
    }

    public void a(axl_1 axl_12) {
        this.drq.add(axl_12);
    }
}

