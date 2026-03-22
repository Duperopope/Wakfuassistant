/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.Nullable;

public class ahs
extends MouseAdapter {
    private final JFrame cxv;
    @Nullable
    private Component cxw;
    private Point cxx;
    private Point cxy;
    private aht @Nullable [] cxz;

    public ahs(JFrame jFrame) {
        this.cxv = jFrame;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.h(mouseEvent);
    }

    private void h(MouseEvent mouseEvent) {
        if (this.cxv.getExtendedState() == 6) {
            return;
        }
        this.cxw = mouseEvent.getComponent();
        this.cxw.addMouseMotionListener(this);
        GraphicsDevice[] graphicsDeviceArray = ahv.cxP.getScreenDevices();
        this.cxz = new aht[graphicsDeviceArray.length];
        for (int i = 0; i < graphicsDeviceArray.length; ++i) {
            GraphicsDevice graphicsDevice = graphicsDeviceArray[i];
            GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();
            Rectangle rectangle = graphicsConfiguration.getBounds();
            Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
            aht aht2 = new aht();
            aht2.cbO = (int)rectangle.getMinX();
            aht2.ccK = (int)rectangle.getMaxX();
            aht2.brp = (int)rectangle.getMinY() + insets.top;
            aht2.brr = (int)rectangle.getMaxY() - insets.bottom;
            this.cxz[i] = aht2;
        }
        this.cxx = new Point(mouseEvent.getPoint());
        SwingUtilities.convertPointToScreen(this.cxx, this.cxw);
        this.cxy = this.cxv.getLocation();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (this.cxw == null || this.cxz == null) {
            return;
        }
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        if (pointerInfo == null) {
            return;
        }
        this.a(pointerInfo.getLocation());
    }

    private void a(Point point) {
        int n = point.x;
        int n2 = point.y;
        int n3 = n - this.cxx.x;
        int n4 = n2 - this.cxx.y;
        int n5 = this.cxy.x + n3;
        int n6 = this.cxy.y + n4;
        for (aht aht2 : this.cxz) {
            if (n < aht2.cbO || n >= aht2.ccK) continue;
            n6 = Math.max(Math.min(n6, aht2.brr), aht2.brp);
        }
        this.cxv.setLocation(n5, n6);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (this.cxw != null) {
            this.cxw.removeMouseMotionListener(this);
            this.cxw = null;
        }
        this.cxz = null;
    }
}

