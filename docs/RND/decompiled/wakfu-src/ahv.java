/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.opengl.FullscreenUtils;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import javax.swing.JFrame;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class ahv {
    private static final Logger cxE = Logger.getLogger(ahv.class);
    private static final int cxF = 16;
    protected static final int cxG = 800;
    protected static final int cxH = 600;
    private static final int cxI = 1024;
    private static final int cxJ = 768;
    private static final int cxK = 32;
    private static final int cxL = 0;
    private static final ahn_0 cxM = ahn_0.cwO;
    protected static final int cxN = 1920;
    protected static final int cxO = 1080;
    public static final GraphicsEnvironment cxP = GraphicsEnvironment.getLocalGraphicsEnvironment();
    JFrame cxQ = null;
    ahd_0 cxR = null;
    private ahu cxS;
    private axm_1 cnX;
    private String cxT = null;
    ahn_0 cxU;
    private boolean cwM;

    protected abstract JFrame bAv();

    @Nullable
    protected abstract URL bAw();

    public abstract void b(afx_0 var1);

    public abstract void bAx();

    public void aPg() {
        this.b(new ahe_0());
    }

    public void b(ahe_0 ahe_02) {
        Object object;
        cxE.info((Object)"Initializing GLApplication UI");
        System.setProperty("sun.awt.noerasebackground", "true");
        this.cxS = new ahu(ahe_02);
        cxE.info((Object)"GLappUI : Workspace created");
        this.cxS.setFocusable(true);
        this.cnX = new axm_1();
        cxE.info((Object)"GLappUI : Renderer created");
        this.cnX.dv(true);
        this.cxS.a(this.cnX);
        this.cxQ = this.bAv();
        this.cxQ.addComponentListener(new ahw(this));
        cxE.info((Object)"GLappUI : Frame created");
        if (ady_1.bZb()) {
            KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(keyEvent -> keyEvent.getKeyCode() == 18);
        }
        this.cxQ.setVisible(false);
        this.cxQ.setTitle(this.cxT);
        URL uRL = this.bAw();
        if (uRL != null) {
            object = Toolkit.getDefaultToolkit().getImage(uRL);
            this.cxQ.setIconImage((Image)object);
            if (ady_1.bZa()) {
                try {
                    Class<?> clazz = Class.forName("com.apple.eawt.Application");
                    Method method = clazz.getMethod("getApplication", new Class[0]);
                    Object object2 = method.invoke(null, new Object[0]);
                    Method method2 = clazz.getMethod("setDockIconImage", Image.class);
                    method2.invoke(object2, object);
                }
                catch (Exception exception) {
                    cxE.error((Object)("Exception while trying to set dock icon " + String.valueOf(object) + " : "), (Throwable)exception);
                }
            }
        }
        this.cxQ.setDefaultCloseOperation(2);
        this.cxQ.addWindowListener(new ahx(this));
        if (Desktop.isDesktopSupported()) {
            object = Desktop.getDesktop();
            ((Desktop)object).addAppEventListener(new ahy(this));
            ((Desktop)object).addAppEventListener(new ahz(this));
        }
    }

    public void close() {
        if (this.cxR != null) {
            this.cxR.bna();
        }
        if (this.cxQ != null) {
            this.cxQ.dispose();
        } else {
            System.exit(0);
        }
    }

    public ahu bAy() {
        return this.cxS;
    }

    public ahn_0 bAz() {
        return this.cxU;
    }

    public void cs(boolean bl) {
        if (!EventQueue.isDispatchThread()) {
            EventQueue.invokeLater(new aha_0(this, bl));
            return;
        }
        if (this.cxS != null) {
            this.cxS.setVisible(bl);
        }
    }

    public void bAA() {
        if (!EventQueue.isDispatchThread()) {
            EventQueue.invokeLater(new ahb_0(this));
            return;
        }
        if (this.cxS != null) {
            this.cxS.setSize(this.cxS.getSize());
        }
    }

    public Rectangle bAB() {
        if (this.cxS != null) {
            return this.cxS.getBounds();
        }
        return new Rectangle(0, 0, 0, 0);
    }

    public axm_1 bmE() {
        return this.cnX;
    }

    public void bAC() {
        this.setVisible(true);
        if (!this.cxS.bAt().isAnimating()) {
            this.cxS.bAt().start();
        }
        cxE.info((Object)"GLappUI : GL Rendering started");
    }

    public void eQ(String string) {
        this.cxT = string;
        if (this.cxQ != null) {
            this.cxQ.setTitle(this.cxT);
        }
    }

    public String bAD() {
        return this.cxT;
    }

    public void a(Cursor cursor) {
        this.cxQ.setCursor(cursor);
    }

    public int bAE() {
        return this.cxQ.getX();
    }

    public int bAF() {
        return this.cxQ.getY();
    }

    public Dimension bAG() {
        return this.cxQ.getSize();
    }

    public int getWidth() {
        return this.cxQ.getWidth();
    }

    public int getHeight() {
        return this.cxQ.getHeight();
    }

    public void setVisible(boolean bl) {
        if (this.cxQ == null) {
            return;
        }
        this.cxQ.setVisible(bl);
    }

    public void a(ahd_0 ahd_02) {
        this.cxR = ahd_02;
    }

    protected ahd_0 bAH() {
        return this.cxR;
    }

    public void d(ahm ahm2) {
        if (ahm2.bzX()) {
            ahm2 = this.bAO();
        }
        cxE.info((Object)("Applying resolution : " + String.valueOf(ahm2)));
        switch (ahm2.bzU()) {
            case cwQ: {
                boolean bl = this.a(ahm2.getWidth(), ahm2.getHeight(), ahm2.bzS(), ahm2.bzT(), ahm2.bzV());
                if (bl) break;
                this.eS(ahm2.bzV());
                break;
            }
            case cwP: {
                this.eS(ahm2.bzV());
                break;
            }
            case cwO: {
                this.a(ahm2.getWidth(), ahm2.getHeight(), ahm2.bzV(), ahm2.getX(), ahm2.getY(), ahm2.bzW());
            }
        }
        float[] fArray = this.cxS.getCurrentSurfaceScale(new float[2]);
        this.cnX.bf(fArray[0], fArray[1]);
        cxE.info((Object)("Surface scale : " + Arrays.toString(fArray)));
        ahm ahm3 = this.bAI();
        if (!ahm3.equals(ahm2)) {
            cxE.info((Object)("Resolution applied : " + String.valueOf(ahm3)));
        }
        if (this.cxR != null) {
            this.cxR.a(ahm3);
        }
    }

    public ahm bAI() {
        GraphicsDevice graphicsDevice = this.cxQ.getGraphicsConfiguration().getDevice();
        DisplayMode displayMode = graphicsDevice.getDisplayMode();
        int n = displayMode.getBitDepth();
        return new ahm(this.getWidth(), this.getHeight(), n, displayMode.getRefreshRate(), this.cxU, graphicsDevice.getIDstring(), this.bAE(), this.bAF(), this.cwM);
    }

    protected GraphicsDevice eR(@Nullable String string) {
        if (string != null) {
            return Arrays.stream(cxP.getScreenDevices()).filter(graphicsDevice -> string.equals(graphicsDevice.getIDstring())).findFirst().orElse(cxP.getDefaultScreenDevice());
        }
        return cxP.getDefaultScreenDevice();
    }

    private void bAJ() {
        for (GraphicsDevice graphicsDevice : cxP.getScreenDevices()) {
            if (graphicsDevice.getFullScreenWindow() != this.cxQ) continue;
            graphicsDevice.setFullScreenWindow(null);
        }
    }

    protected void eS(@Nullable String string) {
        this.cxU = ahn_0.cwP;
        this.bAJ();
        if (ady_1.bZa()) {
            try {
                FullscreenUtils.cxB.showMenuAndDock(false);
            }
            catch (Throwable throwable) {
                cxE.error((Object)"Impossible de cacher le menu et le doc Mac", throwable);
            }
        }
        GraphicsDevice graphicsDevice = this.eR(string);
        Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
        this.cxQ.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        this.a(rectangle);
        this.cxQ.setExtendedState(6);
        this.cxQ.setVisible(true);
        this.cxQ.setResizable(false);
    }

    protected void a(int n, int n2, @Nullable String string, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        this.cxU = ahn_0.cwO;
        this.cwM = bl;
        this.bAJ();
        if (ady_1.bZa()) {
            try {
                FullscreenUtils.cxB.showMenuAndDock(true);
            }
            catch (Throwable throwable) {
                cxE.error((Object)"Impossible d'afficher le menu et le doc Mac", throwable);
            }
        }
        GraphicsDevice graphicsDevice = this.cxQ.getGraphicsConfiguration().getDevice();
        Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
        int n7 = GC.a(n, 800, rectangle.width);
        int n8 = GC.a(n2, 600, rectangle.height);
        this.cxQ.setSize(n7, n8);
        Rectangle rectangle2 = this.cxQ.getBounds();
        Rectangle rectangle3 = this.eT(string);
        if (!Objects.equals(rectangle2, rectangle3)) {
            n6 = GC.a(n, 800, rectangle3.width);
            n5 = GC.a(n2, 600, rectangle3.height);
            this.cxQ.setSize(n6, n5);
        } else {
            n6 = n7;
            n5 = n8;
        }
        if (n6 == rectangle3.width && n5 == rectangle3.height) {
            int n9 = Math.min(1024, rectangle3.width);
            int n10 = Math.min(768, rectangle3.height);
            this.cxQ.setSize(n9, n10);
            this.cxQ.setExtendedState(6);
        } else {
            this.cxQ.setExtendedState(0);
        }
        this.sr(this.cxQ.getExtendedState());
        this.a(rectangle3);
        this.cxQ.setLocation(n3, n4);
        this.cxQ.setResizable(true);
        this.cxQ.setVisible(true);
    }

    public abstract void sr(int var1);

    protected boolean a(int n, int n2, int n3, int n4, @Nullable String string) {
        GraphicsDevice graphicsDevice;
        if (ady_1.bZa()) {
            try {
                FullscreenUtils.cxB.showMenuAndDock(true);
            }
            catch (Throwable throwable) {
                cxE.error((Object)"Impossible d'afficher le menu et le doc Mac", throwable);
            }
        }
        if (!(graphicsDevice = this.eR(string)).isFullScreenSupported()) {
            cxE.debug((Object)"Fullscreen mode not supported, defaulting to simulated fullscreen");
            return false;
        }
        DisplayMode displayMode = ahv.a(graphicsDevice, n, n2, n3, n4);
        if (displayMode == null) {
            cxE.warn((Object)("No available displayMode corresponding to " + n + "x" + n2 + "x" + n3));
            return false;
        }
        if (graphicsDevice.getFullScreenWindow() != this.cxQ) {
            graphicsDevice.setFullScreenWindow(this.cxQ);
        }
        if (graphicsDevice.getDisplayMode().equals(displayMode)) {
            this.cxU = ahn_0.cwQ;
            return true;
        }
        if (!graphicsDevice.isDisplayChangeSupported()) {
            cxE.warn((Object)"Unable to change display mode. Defaulting to windowed mode");
            graphicsDevice.setFullScreenWindow(null);
            return false;
        }
        try {
            graphicsDevice.setDisplayMode(displayMode);
        }
        catch (Exception exception) {
            cxE.error((Object)("Unable to set mode " + ahv.a(displayMode) + ". Defaulting to windowed mode"), (Throwable)exception);
            graphicsDevice.setFullScreenWindow(null);
            return false;
        }
        Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
        this.cxU = ahn_0.cwQ;
        this.a(rectangle);
        this.cxQ.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        return true;
    }

    public Rectangle bAK() {
        GraphicsDevice graphicsDevice = cxP.getDefaultScreenDevice();
        return this.a(graphicsDevice);
    }

    public Rectangle eT(@Nullable String string) {
        if (this.cxQ == null) {
            return this.bAK();
        }
        Rectangle rectangle = this.cxQ.getBounds();
        GraphicsDevice graphicsDevice = null;
        int n = -1;
        boolean bl = false;
        for (GraphicsDevice graphicsDevice2 : cxP.getScreenDevices()) {
            Rectangle rectangle2 = graphicsDevice2.getDefaultConfiguration().getBounds();
            if (rectangle.height > rectangle2.height || rectangle.width > rectangle2.width) continue;
            int n2 = rectangle2.width * rectangle2.height;
            if (string != null && string.equals(graphicsDevice2.getIDstring())) {
                graphicsDevice = graphicsDevice2;
                n = n2;
                bl = true;
                continue;
            }
            if (bl || n2 <= n) continue;
            graphicsDevice = graphicsDevice2;
            n = n2;
        }
        if (graphicsDevice != null) {
            return this.a(graphicsDevice);
        }
        return this.bAK();
    }

    public GraphicsDevice bAL() {
        return Arrays.stream(cxP.getScreenDevices()).max(Comparator.comparingInt(graphicsDevice -> {
            Rectangle rectangle = graphicsDevice.getDefaultConfiguration().getBounds();
            if (rectangle == null) {
                return 0;
            }
            Rectangle rectangle2 = rectangle.intersection(this.cxQ.getBounds());
            return rectangle2.isEmpty() ? 0 : rectangle2.width * rectangle2.height;
        })).orElseGet(cxP::getDefaultScreenDevice);
    }

    public void bAM() {
        this.a(this.a(this.bAL()));
    }

    private void a(Rectangle rectangle) {
        if (!ady_1.bZb()) {
            return;
        }
        this.cxQ.setMaximizedBounds(new Rectangle(rectangle.x, rectangle.y, rectangle.width + 1, rectangle.height + 1));
    }

    private Rectangle a(GraphicsDevice graphicsDevice) {
        GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
        Rectangle rectangle = graphicsConfiguration.getBounds();
        if (!this.cwM) {
            Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
            rectangle.x += insets.left;
            rectangle.width -= insets.left + insets.right;
            rectangle.y += insets.top;
            rectangle.height -= insets.top + insets.bottom;
        }
        return rectangle;
    }

    public Insets bAN() {
        GraphicsConfiguration graphicsConfiguration = this.bAL().getDefaultConfiguration();
        return Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
    }

    static DisplayMode a(GraphicsDevice graphicsDevice, int n, int n2, int n3, int n4) {
        DisplayMode displayMode;
        int n5 = n3;
        if (n3 == -1) {
            n5 = 32;
        }
        if ((displayMode = ahv.b(graphicsDevice, n, n2, n5, n4)) != null) {
            return displayMode;
        }
        return ahv.b(graphicsDevice, n, n2, graphicsDevice.getDisplayMode().getBitDepth(), n4);
    }

    private static DisplayMode b(GraphicsDevice graphicsDevice, int n, int n2, int n3, int n4) {
        boolean bl = n4 != 0;
        DisplayMode displayMode = null;
        for (DisplayMode displayMode2 : graphicsDevice.getDisplayModes()) {
            int n5 = displayMode2.getBitDepth();
            if (n5 == -1) {
                n5 = n3;
            }
            if (displayMode2.getWidth() != n || displayMode2.getHeight() != n2 || n5 != n3 || bl && n4 != displayMode2.getRefreshRate()) continue;
            if (displayMode == null) {
                displayMode = displayMode2;
                continue;
            }
            int n6 = displayMode.getRefreshRate();
            int n7 = displayMode2.getRefreshRate();
            if (n7 < 50 || n7 >= n6) continue;
            displayMode = displayMode2;
        }
        return displayMode;
    }

    public ahm bAO() {
        return this.a(null, 0, 0, false);
    }

    public ahm a(@Nullable String string, int n, int n2, boolean bl) {
        return new ahm(1024, 768, 32, 0, cxM, string, n, n2, bl);
    }

    public Dimension bAP() {
        return new Dimension(800, 600);
    }

    public int bAQ() {
        return 16;
    }

    public JFrame bAR() {
        return this.cxQ;
    }

    private static String a(DisplayMode displayMode) {
        return "{Mode " + displayMode.getWidth() + "x" + displayMode.getHeight() + "x" + displayMode.getBitDepth() + " " + displayMode.getRefreshRate() + "Hz}";
    }
}

