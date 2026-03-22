/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aIa
 */
class aia_0
extends ahj_0 {
    private static final Logger dSQ = Logger.getLogger(aia_0.class);
    private final Dimension dSR = new Dimension(800, 600);
    private ccm_2 dSS;
    public static final String dST = "sun.java2d.uiScale.enabled";

    aia_0() {
        try {
            String string = auc_0.cVq().bS("appSkinPath");
            String string2 = fho_2.gzX().gzY() + "theme/appSkin/";
            this.eQ(aum_0.cWf().c("desc.wakfu", new Object[0]));
            this.a(new ahp_0(string, string2));
            int n = auc_0.cVq().d("resolution.min.width", 800);
            int n2 = auc_0.cVq().d("resolution.min.height", 600);
            this.dSR.setSize(n, n2);
        }
        catch (fu_0 fu_02) {
            dSQ.error((Object)"Unable to create skinPath", (Throwable)fu_02);
        }
    }

    public void ceS() {
        this.dSS = new ccm_2(this.bAR(), this.dSR, this.bAV().bAq());
        this.bmE().a(this.dSS, true);
    }

    public void a(int n, @NotNull GraphicsDevice graphicsDevice) {
        dSQ.info((Object)("UI scale option value = " + n));
        float f2 = aia_0.c(graphicsDevice);
        dSQ.info((Object)("OS screen scale = " + f2));
        fyw_0.gqw().gqD().i(f2, n);
    }

    private static float c(GraphicsDevice graphicsDevice) {
        try {
            String string = System.getProperty(dST);
            if (Boolean.FALSE.toString().equalsIgnoreCase(string)) {
                return 1.0f;
            }
            Dimension dimension = graphicsDevice.getDefaultConfiguration().getBounds().getSize();
            AffineTransform affineTransform = graphicsDevice.getDefaultConfiguration().getDefaultTransform();
            if (Math.round(dimension.getWidth() * affineTransform.getScaleX()) <= 1920L || Math.round(dimension.getHeight() * affineTransform.getScaleY()) <= 1080L) {
                return 1.0f;
            }
            return (float)affineTransform.getScaleX();
        }
        catch (Exception exception) {
            dSQ.error((Object)"Error when trying to get default screen scale", (Throwable)exception);
            return 1.0f;
        }
    }

    @Override
    public void bAW() {
        fiq_2.gCw().d(new fik_2().l("question.quit", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1).a(fil_2.gCn().c(string -> super.bAW())).a(fil_2.gCo()));
    }

    @Override
    public void bAX() {
        aie_0.cfn().bmB().bAM();
        super.bAX();
    }

    @Override
    public void sr(int n) {
        super.sr(n);
        if (this.dSS != null) {
            boolean bl = (n & 6) != 0;
            this.dSS.setEnabled(!bl);
        }
    }

    @Override
    @Nullable
    protected URL bAw() {
        try {
            return new File("icon.png").toURI().toURL();
        }
        catch (IOException iOException) {
            dSQ.error((Object)"Error: Cannot load icon file", (Throwable)iOException);
            return null;
        }
    }

    @Override
    public Dimension bAP() {
        return this.dSR;
    }

    public String toString() {
        return "WakfuApplicationUI{m_minDimensions=" + String.valueOf(this.dSR) + "} ";
    }
}

