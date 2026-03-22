/*
 * Decompiled with CFR 0.152.
 */
import java.awt.desktop.AppForegroundEvent;
import java.awt.desktop.AppForegroundListener;

class ahy
implements AppForegroundListener {
    final /* synthetic */ ahv cxX;

    ahy(ahv ahv2) {
        this.cxX = ahv2;
    }

    @Override
    public void appRaisedToForeground(AppForegroundEvent appForegroundEvent) {
        if (this.cxX.cxR != null) {
            this.cxX.cxR.bv(true);
        }
    }

    @Override
    public void appMovedToBackground(AppForegroundEvent appForegroundEvent) {
        if (this.cxX.cxR != null) {
            this.cxX.cxR.bv(false);
        }
    }
}

