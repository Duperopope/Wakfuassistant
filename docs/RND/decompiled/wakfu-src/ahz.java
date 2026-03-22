/*
 * Decompiled with CFR 0.152.
 */
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.desktop.AppHiddenEvent;
import java.awt.desktop.AppHiddenListener;

class ahz
implements AppHiddenListener {
    private ahm cxY;
    private boolean cxZ = false;
    final /* synthetic */ ahv cya;

    ahz(ahv ahv2) {
        this.cya = ahv2;
    }

    @Override
    public void appHidden(AppHiddenEvent appHiddenEvent) {
        if (this.cxZ) {
            return;
        }
        this.cxZ = true;
        if (this.cya.cxU == ahn_0.cwQ) {
            this.cxY = this.cya.bAI();
            GraphicsDevice graphicsDevice = ahv.cxP.getDefaultScreenDevice();
            if (graphicsDevice.getFullScreenWindow() == this.cya.cxQ) {
                graphicsDevice.setFullScreenWindow(null);
            }
        }
        if (this.cya.cxR != null) {
            this.cya.cxR.bu(true);
        }
    }

    @Override
    public void appUnhidden(AppHiddenEvent appHiddenEvent) {
        if (!this.cxZ) {
            return;
        }
        this.cxZ = false;
        if (this.cya.cxU == ahn_0.cwQ) {
            DisplayMode displayMode;
            GraphicsDevice graphicsDevice = ahv.cxP.getDefaultScreenDevice();
            if (graphicsDevice.getFullScreenWindow() == null) {
                graphicsDevice.setFullScreenWindow(this.cya.cxQ);
            }
            if ((displayMode = ahv.a(graphicsDevice, this.cxY.getWidth(), this.cxY.getHeight(), this.cxY.bzS(), this.cxY.bzT())) != null) {
                graphicsDevice.setDisplayMode(displayMode);
            }
        }
        if (this.cya.cxR != null) {
            this.cya.cxR.bu(false);
        }
    }
}

